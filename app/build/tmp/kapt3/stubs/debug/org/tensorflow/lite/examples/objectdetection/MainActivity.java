package org.tensorflow.lite.examples.objectdetection;

import java.lang.System;

/**
 * Main entry point into our app. This app follows the single-activity pattern, and all
 * functionality is implemented in the form of fragments.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0001%B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u0016H\u0016J\u0012\u0010\u001a\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u0016H\u0016J\u0010\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010!\u001a\u00020\u00182\b\u0010\"\u001a\u0004\u0018\u00010\u00182\u0006\u0010#\u001a\u00020 J\b\u0010$\u001a\u00020\u0016H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lorg/tensorflow/lite/examples/objectdetection/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/speech/tts/TextToSpeech$OnInitListener;", "()V", "activityMainBinding", "Lorg/tensorflow/lite/examples/objectdetection/databinding/ActivityMainBinding;", "getActivityMainBinding", "()Lorg/tensorflow/lite/examples/objectdetection/databinding/ActivityMainBinding;", "setActivityMainBinding", "(Lorg/tensorflow/lite/examples/objectdetection/databinding/ActivityMainBinding;)V", "btnInput", "Landroid/widget/Button;", "getBtnInput", "()Landroid/widget/Button;", "setBtnInput", "(Landroid/widget/Button;)V", "btnSpeak", "etDetectionText", "Landroid/widget/EditText;", "tts", "Landroid/speech/tts/TextToSpeech;", "changeText", "", "string", "", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onInit", "status", "", "removeChars", "str", "numberOfCharactersToRemove", "speakOut", "Holabels", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements android.speech.tts.TextToSpeech.OnInitListener {
    public org.tensorflow.lite.examples.objectdetection.databinding.ActivityMainBinding activityMainBinding;
    private android.speech.tts.TextToSpeech tts;
    private android.widget.Button btnSpeak;
    public android.widget.Button btnInput;
    private android.widget.EditText etDetectionText;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.tensorflow.lite.examples.objectdetection.databinding.ActivityMainBinding getActivityMainBinding() {
        return null;
    }
    
    public final void setActivityMainBinding(@org.jetbrains.annotations.NotNull
    org.tensorflow.lite.examples.objectdetection.databinding.ActivityMainBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.Button getBtnInput() {
        return null;
    }
    
    public final void setBtnInput(@org.jetbrains.annotations.NotNull
    android.widget.Button p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onInit(int status) {
    }
    
    private final void speakOut() {
    }
    
    @java.lang.Override
    public void onBackPressed() {
    }
    
    @java.lang.Override
    public void onDestroy() {
    }
    
    public final void changeText(@org.jetbrains.annotations.NotNull
    java.lang.String string) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String removeChars(@org.jetbrains.annotations.Nullable
    java.lang.String str, int numberOfCharactersToRemove) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lorg/tensorflow/lite/examples/objectdetection/MainActivity$Holabels;", "", "()V", "letter", "", "getLetter", "()Ljava/lang/String;", "setLetter", "(Ljava/lang/String;)V", "app_debug"})
    public static final class Holabels {
        @org.jetbrains.annotations.NotNull
        public static final org.tensorflow.lite.examples.objectdetection.MainActivity.Holabels INSTANCE = null;
        @org.jetbrains.annotations.NotNull
        private static java.lang.String letter = "A";
        
        private Holabels() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getLetter() {
            return null;
        }
        
        public final void setLetter(@org.jetbrains.annotations.NotNull
        java.lang.String p0) {
        }
    }
}