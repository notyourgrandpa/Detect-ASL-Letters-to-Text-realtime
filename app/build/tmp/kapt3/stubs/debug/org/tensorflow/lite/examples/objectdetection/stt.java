package org.tensorflow.lite.examples.objectdetection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00a4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u0082\u00012\u00020\u00012\u00020\u0002:\u0002\u0082\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010f\u001a\u00020gH\u0016J\u0010\u0010h\u001a\u00020g2\u0006\u0010i\u001a\u00020jH\u0016J\u0012\u0010k\u001a\u00020g2\b\u0010l\u001a\u0004\u0018\u00010mH\u0014J\b\u0010n\u001a\u00020gH\u0016J\u0010\u0010o\u001a\u00020g2\u0006\u0010p\u001a\u00020\u0019H\u0016J\u001a\u0010q\u001a\u00020g2\u0006\u0010r\u001a\u00020\u00192\b\u0010s\u001a\u0004\u0018\u00010mH\u0016J\u0012\u0010t\u001a\u00020g2\b\u0010r\u001a\u0004\u0018\u00010mH\u0016J\b\u0010u\u001a\u00020gH\u0014J\u0012\u0010v\u001a\u00020g2\b\u0010r\u001a\u0004\u0018\u00010mH\u0016J\u0010\u0010w\u001a\u00020g2\u0006\u0010x\u001a\u00020mH\u0016J\b\u0010y\u001a\u00020gH\u0014J\u0010\u0010z\u001a\u00020g2\u0006\u0010{\u001a\u00020|H\u0016J\u000e\u0010}\u001a\u00020g2\u0006\u0010~\u001a\u00020\u007fJ\u0010\u0010\u0080\u0001\u001a\u00020g2\u0007\u0010\u0081\u0001\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\u001a\u0010\'\u001a\u00020(X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020.X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00103\u001a\u00020.X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00100\"\u0004\b5\u00102R\u001a\u00106\u001a\u00020.X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00100\"\u0004\b8\u00102R\u000e\u00109\u001a\u00020:X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010;\u001a\u00020<X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001a\u0010A\u001a\u00020:X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0010\u0010F\u001a\u0004\u0018\u00010GX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010H\u001a\u00020IX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u000e\u0010N\u001a\u00020GX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010O\u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010\bR\u001a\u0010Q\u001a\u00020RX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001a\u0010W\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010!\"\u0004\bY\u0010#R\u001a\u0010Z\u001a\u00020[X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R \u0010`\u001a\b\u0012\u0004\u0012\u00020\u00050aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bb\u0010c\"\u0004\bd\u0010e\u00a8\u0006\u0083\u0001"}, d2 = {"Lorg/tensorflow/lite/examples/objectdetection/stt;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/speech/RecognitionListener;", "()V", "LOG_TAG", "", "TAG", "getTAG", "()Ljava/lang/String;", "setTAG", "(Ljava/lang/String;)V", "arrString", "", "getArrString", "()[Ljava/lang/String;", "setArrString", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "conditions", "Lcom/google/mlkit/common/model/DownloadConditions;", "getConditions", "()Lcom/google/mlkit/common/model/DownloadConditions;", "setConditions", "(Lcom/google/mlkit/common/model/DownloadConditions;)V", "count", "", "getCount", "()I", "setCount", "(I)V", "japaneseEnglishTranslator", "Lcom/google/mlkit/nl/translate/Translator;", "getJapaneseEnglishTranslator", "()Lcom/google/mlkit/nl/translate/Translator;", "setJapaneseEnglishTranslator", "(Lcom/google/mlkit/nl/translate/Translator;)V", "koreanEnglishTranslator", "getKoreanEnglishTranslator", "setKoreanEnglishTranslator", "micIV", "Landroid/widget/ImageView;", "getMicIV", "()Landroid/widget/ImageView;", "setMicIV", "(Landroid/widget/ImageView;)V", "option1", "Lcom/google/mlkit/nl/translate/TranslatorOptions;", "getOption1", "()Lcom/google/mlkit/nl/translate/TranslatorOptions;", "setOption1", "(Lcom/google/mlkit/nl/translate/TranslatorOptions;)V", "option2", "getOption2", "setOption2", "options", "getOptions", "setOptions", "outputTV", "Landroid/widget/TextView;", "progressBar", "Landroid/widget/ProgressBar;", "getProgressBar", "()Landroid/widget/ProgressBar;", "setProgressBar", "(Landroid/widget/ProgressBar;)V", "returnedText", "getReturnedText", "()Landroid/widget/TextView;", "setReturnedText", "(Landroid/widget/TextView;)V", "speech", "Landroid/speech/SpeechRecognizer;", "spinnerId", "Landroid/widget/Spinner;", "getSpinnerId", "()Landroid/widget/Spinner;", "setSpinnerId", "(Landroid/widget/Spinner;)V", "sr", "start", "getStart", "startCounting", "", "getStartCounting", "()Z", "setStartCounting", "(Z)V", "tagalogEnglishTranslator", "getTagalogEnglishTranslator", "setTagalogEnglishTranslator", "toggleButton", "Landroid/widget/ToggleButton;", "getToggleButton", "()Landroid/widget/ToggleButton;", "setToggleButton", "(Landroid/widget/ToggleButton;)V", "videoNames", "", "getVideoNames", "()Ljava/util/List;", "setVideoNames", "(Ljava/util/List;)V", "onBeginningOfSpeech", "", "onBufferReceived", "buffer", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onEndOfSpeech", "onError", "errorCode", "onEvent", "arg0", "arg1", "onPartialResults", "onPause", "onReadyForSpeech", "onResults", "results", "onResume", "onRmsChanged", "rmsdB", "", "playVideo", "uri", "Landroid/net/Uri;", "textToSignLanguage", "string", "Companion", "app_debug"})
public final class stt extends androidx.appcompat.app.AppCompatActivity implements android.speech.RecognitionListener {
    private android.widget.TextView outputTV;
    private android.speech.SpeechRecognizer sr;
    public android.widget.ImageView micIV;
    private android.speech.SpeechRecognizer speech;
    public android.widget.ProgressBar progressBar;
    public android.widget.ToggleButton toggleButton;
    public android.widget.TextView returnedText;
    public android.widget.Spinner spinnerId;
    @org.jetbrains.annotations.NotNull
    private java.lang.String[] arrString = {"a", "b", "bathroom", "c", "cat", "d", "dog", "e", "eat", "nice to meet you", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "thank you", "u", "v", "w", "y", "z", "delete", "space", "mother", "father", "hello", "help", "no", "please", "yes"};
    @org.jetbrains.annotations.NotNull
    private final java.lang.String start = "hello";
    private int count = 0;
    private boolean startCounting = false;
    @org.jetbrains.annotations.NotNull
    private java.util.List<java.lang.String> videoNames;
    @org.jetbrains.annotations.NotNull
    private com.google.mlkit.nl.translate.TranslatorOptions options;
    @org.jetbrains.annotations.NotNull
    private com.google.mlkit.nl.translate.Translator tagalogEnglishTranslator;
    @org.jetbrains.annotations.NotNull
    private com.google.mlkit.nl.translate.TranslatorOptions option1;
    @org.jetbrains.annotations.NotNull
    private com.google.mlkit.nl.translate.Translator japaneseEnglishTranslator;
    @org.jetbrains.annotations.NotNull
    private com.google.mlkit.nl.translate.TranslatorOptions option2;
    @org.jetbrains.annotations.NotNull
    private com.google.mlkit.nl.translate.Translator koreanEnglishTranslator;
    @org.jetbrains.annotations.NotNull
    private com.google.mlkit.common.model.DownloadConditions conditions;
    private final java.lang.String LOG_TAG = "stt";
    @org.jetbrains.annotations.NotNull
    private java.lang.String TAG = "stt";
    @org.jetbrains.annotations.NotNull
    public static final org.tensorflow.lite.examples.objectdetection.stt.Companion Companion = null;
    
    public stt() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.ImageView getMicIV() {
        return null;
    }
    
    public final void setMicIV(@org.jetbrains.annotations.NotNull
    android.widget.ImageView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.ProgressBar getProgressBar() {
        return null;
    }
    
    public final void setProgressBar(@org.jetbrains.annotations.NotNull
    android.widget.ProgressBar p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.ToggleButton getToggleButton() {
        return null;
    }
    
    public final void setToggleButton(@org.jetbrains.annotations.NotNull
    android.widget.ToggleButton p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.TextView getReturnedText() {
        return null;
    }
    
    public final void setReturnedText(@org.jetbrains.annotations.NotNull
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.Spinner getSpinnerId() {
        return null;
    }
    
    public final void setSpinnerId(@org.jetbrains.annotations.NotNull
    android.widget.Spinner p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String[] getArrString() {
        return null;
    }
    
    public final void setArrString(@org.jetbrains.annotations.NotNull
    java.lang.String[] p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getStart() {
        return null;
    }
    
    public final int getCount() {
        return 0;
    }
    
    public final void setCount(int p0) {
    }
    
    public final boolean getStartCounting() {
        return false;
    }
    
    public final void setStartCounting(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getVideoNames() {
        return null;
    }
    
    public final void setVideoNames(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.mlkit.nl.translate.TranslatorOptions getOptions() {
        return null;
    }
    
    public final void setOptions(@org.jetbrains.annotations.NotNull
    com.google.mlkit.nl.translate.TranslatorOptions p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.mlkit.nl.translate.Translator getTagalogEnglishTranslator() {
        return null;
    }
    
    public final void setTagalogEnglishTranslator(@org.jetbrains.annotations.NotNull
    com.google.mlkit.nl.translate.Translator p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.mlkit.nl.translate.TranslatorOptions getOption1() {
        return null;
    }
    
    public final void setOption1(@org.jetbrains.annotations.NotNull
    com.google.mlkit.nl.translate.TranslatorOptions p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.mlkit.nl.translate.Translator getJapaneseEnglishTranslator() {
        return null;
    }
    
    public final void setJapaneseEnglishTranslator(@org.jetbrains.annotations.NotNull
    com.google.mlkit.nl.translate.Translator p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.mlkit.nl.translate.TranslatorOptions getOption2() {
        return null;
    }
    
    public final void setOption2(@org.jetbrains.annotations.NotNull
    com.google.mlkit.nl.translate.TranslatorOptions p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.mlkit.nl.translate.Translator getKoreanEnglishTranslator() {
        return null;
    }
    
    public final void setKoreanEnglishTranslator(@org.jetbrains.annotations.NotNull
    com.google.mlkit.nl.translate.Translator p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.mlkit.common.model.DownloadConditions getConditions() {
        return null;
    }
    
    public final void setConditions(@org.jetbrains.annotations.NotNull
    com.google.mlkit.common.model.DownloadConditions p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTAG() {
        return null;
    }
    
    public final void setTAG(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void onResume() {
    }
    
    @java.lang.Override
    protected void onPause() {
    }
    
    @java.lang.Override
    public void onBeginningOfSpeech() {
    }
    
    @java.lang.Override
    public void onBufferReceived(@org.jetbrains.annotations.NotNull
    byte[] buffer) {
    }
    
    @java.lang.Override
    public void onEndOfSpeech() {
    }
    
    @java.lang.Override
    public void onError(int errorCode) {
    }
    
    @java.lang.Override
    public void onEvent(int arg0, @org.jetbrains.annotations.Nullable
    android.os.Bundle arg1) {
    }
    
    @java.lang.Override
    public void onPartialResults(@org.jetbrains.annotations.Nullable
    android.os.Bundle arg0) {
    }
    
    @java.lang.Override
    public void onReadyForSpeech(@org.jetbrains.annotations.Nullable
    android.os.Bundle arg0) {
    }
    
    @java.lang.Override
    public void onResults(@org.jetbrains.annotations.NotNull
    android.os.Bundle results) {
    }
    
    @java.lang.Override
    public void onRmsChanged(float rmsdB) {
    }
    
    public final void playVideo(@org.jetbrains.annotations.NotNull
    android.net.Uri uri) {
    }
    
    public final void textToSignLanguage(@org.jetbrains.annotations.NotNull
    java.lang.String string) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/tensorflow/lite/examples/objectdetection/stt$Companion;", "", "()V", "getErrorText", "", "errorCode", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getErrorText(int errorCode) {
            return null;
        }
    }
}