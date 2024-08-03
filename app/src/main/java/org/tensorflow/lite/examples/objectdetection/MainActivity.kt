/*
 * Copyright 2022 The TensorFlow Authors. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.tensorflow.lite.examples.objectdetection

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.PopupMenu
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import org.tensorflow.lite.examples.objectdetection.databinding.ActivityMainBinding
import java.util.ArrayList
import java.util.Locale
import java.util.Objects

/**
 * Main entry point into our app. This app follows the single-activity pattern, and all
 * functionality is implemented in the form of fragments.
 */
class MainActivity : AppCompatActivity(), TextToSpeech.OnInitListener {
    public lateinit var activityMainBinding: ActivityMainBinding
    private var tts: TextToSpeech? = null
    private var btnSpeak: Button? = null
    lateinit var btnInput: Button
    private var etDetectionText: EditText? = null

    object Holabels{
        var letter = "A"
    }

    override fun onCreate(
        savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        btnSpeak =  activityMainBinding.btnSpeak
        etDetectionText = activityMainBinding.etEditText
        btnInput = activityMainBinding.btnInput

        btnSpeak!!.isEnabled = false

        tts = TextToSpeech(this,this)

        btnSpeak!!.setOnClickListener{ speakOut() }

        btnInput.setOnClickListener{
            if(Holabels.letter == "DELETE") {
                activityMainBinding.etEditText.setText(removeChars(activityMainBinding.etEditText.text.toString(), 1))
            }
            else{
                activityMainBinding.etEditText.setText(activityMainBinding.etEditText.text.toString() + Holabels.letter)
            }
        }

        val popupBtn = findViewById<Button>(R.id.btnPopup) as Button
        popupBtn.setOnClickListener { view ->
            val popupMenu = PopupMenu(this@MainActivity, view)
            popupMenu.inflate(R.menu.menu_switch)

            popupMenu.setOnMenuItemClickListener { menuItem ->
                when(menuItem.itemId) {
                    R.id.item1 ->
                    {
                        Toast.makeText(this@MainActivity, "Switch to STT", Toast.LENGTH_LONG).show()
                        val Intent = Intent(this, stt::class.java)
                        startActivity(Intent)
                        true
                    }
                    else ->{
                        false
                    }

                }
            }
            popupMenu.show()
        }
    }

    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS) {
            val result = tts!!.setLanguage(Locale.US)

            if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                Log.e("TTS","The Language not supported!")
            } else {
                btnSpeak!!.isEnabled = true
            }
        }
    }

    private fun speakOut() {
        val text = etDetectionText!!.text.toString()
        tts!!.speak(text, TextToSpeech.QUEUE_FLUSH, null,"")
    }

    override fun onBackPressed() {
        if (Build.VERSION.SDK_INT == Build.VERSION_CODES.Q) {
            // Workaround for Android Q memory leak issue in IRequestFinishCallback$Stub.
            // (https://issuetracker.google.com/issues/139738913)
            finishAfterTransition()
        } else {
            super.onBackPressed()
        }
    }

    public override fun onDestroy() {
        // Shutdown TTS when
        // activity is destroyed
        if (tts != null) {
            tts!!.stop()
            tts!!.shutdown()
        }
        super.onDestroy()
    }

    public fun changeText(string: String)
    {
        if(string != "SPACE"){
            Holabels.letter = string
         }
        else{
            Holabels.letter = " "
        }
    }

    fun removeChars(str: String?, numberOfCharactersToRemove: Int): String {
        return if (str != null && str.isNotBlank()) {
            str.substring(0, str.length - numberOfCharactersToRemove)
        } else ""
    }
}
