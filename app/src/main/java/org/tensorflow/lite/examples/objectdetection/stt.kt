package org.tensorflow.lite.examples.objectdetection

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.speech.RecognitionListener
import android.speech.RecognizerIntent
import android.speech.SpeechRecognizer
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.MediaController
import android.widget.ProgressBar
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import android.widget.ToggleButton
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import com.google.mlkit.common.model.DownloadConditions
import com.google.mlkit.nl.translate.TranslateLanguage
import com.google.mlkit.nl.translate.Translation
import com.google.mlkit.nl.translate.TranslatorOptions
import java.util.Locale
import java.util.Objects

public class stt : AppCompatActivity(), RecognitionListener{
    private lateinit var outputTV: TextView
    private lateinit var sr: SpeechRecognizer
    lateinit var micIV: ImageView

    private var speech: SpeechRecognizer? = null
    lateinit var progressBar: ProgressBar
    lateinit var toggleButton: ToggleButton
    lateinit var returnedText: TextView

    lateinit var spinnerId: Spinner

    var arrString = arrayOf("a", "b", "bathroom", "c", "cat", "d", "dog", "e", "eat", "nice to meet you", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "thank you", "u",
        "v", "w", "y", "z", "delete", "space", "mother", "father", "hello", "help", "no", "please", "yes")
    val start: String = "hello"
    var count = 0
    var startCounting = false
    var videoNames: MutableList<String> = ArrayList()

    var options = TranslatorOptions.Builder()
        .setSourceLanguage(TranslateLanguage.TAGALOG)
        .setTargetLanguage(TranslateLanguage.ENGLISH)
        .build()

    var tagalogEnglishTranslator = Translation.getClient(options)

    var option1 = TranslatorOptions.Builder()
        .setSourceLanguage(TranslateLanguage.JAPANESE)
        .setTargetLanguage(TranslateLanguage.ENGLISH)
        .build()

    var japaneseEnglishTranslator = Translation.getClient(option1)

    var option2 = TranslatorOptions.Builder()
        .setSourceLanguage(TranslateLanguage.KOREAN)
        .setTargetLanguage(TranslateLanguage.ENGLISH)
        .build()

    var koreanEnglishTranslator = Translation.getClient(option2)

    var conditions = DownloadConditions.Builder()
        .requireWifi()
        .build()


    private val LOG_TAG = "stt"
    var TAG = "stt"

    companion object {
        fun getErrorText(errorCode: Int): String {
            return when (errorCode) {
                SpeechRecognizer.ERROR_AUDIO -> "Audio recording error"
                SpeechRecognizer.ERROR_INSUFFICIENT_PERMISSIONS -> "Insufficient permissions"
                SpeechRecognizer.ERROR_SPEECH_TIMEOUT -> "No speech input"
                else -> "Didn't understand, please try again."
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stt)

        val button = findViewById<Button>(R.id.btnPopup1)
        button.setOnClickListener()
        {
            val Intent = Intent(this, MainActivity::class.java)
            startActivity(Intent)
        }

        outputTV = findViewById(R.id.idTVOutput)
        micIV = findViewById(R.id.idIVMic)

        returnedText = findViewById(R.id.idTVOutput)
        progressBar = findViewById(R.id.progressBar1)
        toggleButton = findViewById(R.id.toggleButton1)
        toggleButton.setText("Record")
        toggleButton.setTextOn("Record")
        toggleButton.setTextOff("Finish")

        progressBar.visibility = View.INVISIBLE
        val speech = SpeechRecognizer.createSpeechRecognizer(this)
        speech.setRecognitionListener(this)
        var recognizerIntent = Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH).apply {
            putExtra(RecognizerIntent.EXTRA_LANGUAGE_PREFERENCE, "en")
            putExtra(RecognizerIntent.EXTRA_CALLING_PACKAGE, this@stt.packageName)
            putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_WEB_SEARCH)
            putExtra(RecognizerIntent.EXTRA_MAX_RESULTS, 2)
        }

        toggleButton.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                progressBar.visibility = View.VISIBLE
                progressBar.isIndeterminate = true
                speech.startListening(recognizerIntent)
            } else {
                progressBar.isIndeterminate = false
                progressBar.visibility = View.INVISIBLE
                speech.stopListening()
            }
        }

        spinnerId = findViewById<Spinner>(R.id.spinId)

        val language = arrayOf("Tagalog", "Japanese", "Korean")
        val arrayAdp = ArrayAdapter(this@stt, android.R.layout.simple_spinner_dropdown_item, language)
        spinnerId.adapter = arrayAdp

        spinnerId?.onItemSelectedListener=object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                Toast.makeText(this@stt, language[p2], Toast.LENGTH_LONG).show()
                if(p2 == 0){
                        recognizerIntent = Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH).apply {
                        putExtra(RecognizerIntent.EXTRA_LANGUAGE_PREFERENCE, "en")
                        putExtra(RecognizerIntent.EXTRA_LANGUAGE, "en_PH")
                        putExtra(RecognizerIntent.EXTRA_CALLING_PACKAGE, this@stt.packageName)
                        putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_WEB_SEARCH)
                        putExtra(RecognizerIntent.EXTRA_MAX_RESULTS, 1)
                    }
                }
                else if(p2 == 1){
                        recognizerIntent = Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH).apply {
                        putExtra(RecognizerIntent.EXTRA_LANGUAGE_PREFERENCE, "en")
                        putExtra(RecognizerIntent.EXTRA_LANGUAGE, "ja_JP")
                        putExtra(RecognizerIntent.EXTRA_CALLING_PACKAGE, this@stt.packageName)
                        putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_WEB_SEARCH)
                        putExtra(RecognizerIntent.EXTRA_MAX_RESULTS, 1)
                    }
                }
                else if(p2 == 2) {
                    recognizerIntent = Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH).apply {
                        putExtra(RecognizerIntent.EXTRA_LANGUAGE_PREFERENCE, "en")
                        putExtra(RecognizerIntent.EXTRA_LANGUAGE, "ko_KR")
                        putExtra(RecognizerIntent.EXTRA_CALLING_PACKAGE, this@stt.packageName)
                        putExtra(
                            RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                            RecognizerIntent.LANGUAGE_MODEL_WEB_SEARCH
                        )
                        putExtra(RecognizerIntent.EXTRA_MAX_RESULTS, 1)
                    }
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                Toast.makeText(this@stt, "Nothing is selected.", Toast.LENGTH_LONG).show()
            }
        }

        val mediaController = MediaController(this)
        val videoView = findViewById<VideoView>(R.id.videoView)
        videoView.isClickable = false
        mediaController.setAnchorView(videoView)

        var offlineUri: Uri = Uri.parse("android.resource://$packageName/raw/${start}")

        videoView.setMediaController(mediaController)
        videoView.setVideoURI(offlineUri)
        videoView.requestFocus()
        videoView.start()

        videoView.setOnCompletionListener {
            if(startCounting){
                offlineUri = Uri.parse("android.resource://$packageName/raw/${videoNames[count]}")
                count++
                playVideo(offlineUri)
            }
            if(count == videoNames.size){
                videoNames.clear()
                startCounting = false
                count = 0
            }

        }

        tagalogEnglishTranslator.downloadModelIfNeeded(conditions)
            .addOnSuccessListener {
                //Toast.makeText(this, "Downloaded", Toast.LENGTH_LONG).show()
            }
            .addOnFailureListener { exception ->
                Toast.makeText(this, exception.toString(), Toast.LENGTH_LONG).show()
            }
        japaneseEnglishTranslator.downloadModelIfNeeded(conditions)
            .addOnSuccessListener {
                //Toast.makeText(this, "Downloaded", Toast.LENGTH_LONG).show()
            }
            .addOnFailureListener { exception ->
                Toast.makeText(this, exception.toString(), Toast.LENGTH_LONG).show()
            }

        koreanEnglishTranslator.downloadModelIfNeeded(conditions)
            .addOnSuccessListener {
                //Toast.makeText(this, "Downloaded", Toast.LENGTH_LONG).show()
            }
            .addOnFailureListener { exception ->
                Toast.makeText(this, exception.toString(), Toast.LENGTH_LONG).show()
            }
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
        speech?.destroy()
        Log.i(LOG_TAG, "destroy")
    }

    override fun onBeginningOfSpeech() {
        Log.i(LOG_TAG, "onBeginningOfSpeech")
        progressBar.isIndeterminate = false
        progressBar.max = 10
    }

    override fun onBufferReceived(buffer: ByteArray) {
        Log.i(LOG_TAG, "onBufferReceived: ${buffer.contentToString()}")
    }

    override fun onEndOfSpeech() {
        Log.i(LOG_TAG, "onEndOfSpeech")
        progressBar.isIndeterminate = true
        toggleButton.isChecked = false
    }

    override fun onError(errorCode: Int) {
        val errorMessage = getErrorText(errorCode)
        Log.d(LOG_TAG, "FAILED $errorMessage")
        returnedText.text = errorMessage
        toggleButton.isChecked = false
    }

    override fun onEvent(arg0: Int, arg1: Bundle?) {
        Log.i(LOG_TAG, "onEvent")
    }

    override fun onPartialResults(arg0: Bundle?) {
        Log.i(LOG_TAG, "onPartialResults")
    }

    override fun onReadyForSpeech(arg0: Bundle?) {
        Log.i(LOG_TAG, "onReadyForSpeech")
    }

    override fun onResults(results: Bundle) {
        Log.i(LOG_TAG, "onResults")
        val matches = results.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION)
        val text = matches?.joinToString(separator = "\n") ?: ""
        if(spinnerId.selectedItem.toString() == "Tagalog"){
            tagalogEnglishTranslator.translate(text).addOnSuccessListener{
                    translatedText -> returnedText.text = translatedText
                //Toast.makeText(this@stt, text, Toast.LENGTH_LONG).show()
                textToSignLanguage(translatedText)
            }.addOnFailureListener { exception ->
                Toast.makeText(this@stt, exception.toString(), Toast.LENGTH_LONG).show()
            }
        }
        else if(spinnerId.selectedItem.toString() == "Japanese"){
            japaneseEnglishTranslator.translate(text).addOnSuccessListener{
                    translatedText -> returnedText.text = translatedText
                //Toast.makeText(this@stt, text, Toast.LENGTH_LONG).show()
                textToSignLanguage(translatedText)
            }.addOnFailureListener { exception ->
                Toast.makeText(this@stt, exception.toString(), Toast.LENGTH_LONG).show()
               returnedText.text = exception.toString()
            }
        }
        else if(spinnerId.selectedItem.toString() == "Korean"){
            koreanEnglishTranslator.translate(text).addOnSuccessListener{
                    translatedText -> returnedText.text = translatedText
                //Toast.makeText(this@stt, text, Toast.LENGTH_LONG).show()
                textToSignLanguage(translatedText)
            }.addOnFailureListener { exception ->
                Toast.makeText(this@stt, exception.toString(), Toast.LENGTH_LONG).show()
                returnedText.text = exception.toString()
            }
        }


    }

    override fun onRmsChanged(rmsdB: Float) {
        Log.i(LOG_TAG, "onRmsChanged: $rmsdB")
        progressBar.progress = rmsdB.toInt()
    }


    fun playVideo(uri: Uri)
    {
        val mediaController = MediaController(this)
        val videoView = findViewById<VideoView>(R.id.videoView)
        videoView.isClickable = false
        mediaController.setAnchorView(videoView)

        videoView.setMediaController(null)
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()
    }
fun textToSignLanguage(string: String)
    {
        for(str in arrString){
            if(string.lowercase() == "nice to meet you"){
                videoNames.add(str)
                startCounting = true
                playVideo(Uri.parse("android.resource://$packageName/raw/nicetomeetyou"))
                return
            }
            else if(string.lowercase() == "thank you"){
                videoNames.add(str)
                startCounting = true
                playVideo(Uri.parse("android.resource://$packageName/raw/thankyou"))
                return
            }
            else if(string == str){
                videoNames.add(str)
                startCounting = true
                playVideo(Uri.parse("android.resource://$packageName/raw/${str}"))
                return
            }

        }
        for(chr in string)
        {
            for(astring in arrString)
            {
                if(chr.toString() == astring)
                {
                    videoNames.add(astring)
                }
            }
        }
        startCounting = true
        playVideo(Uri.parse("android.resource://$packageName/raw/${start}"))
    }
}



