package org.tensorflow.lite.examples.objectdetection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 .2\u00020\u0001:\u0001.B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\"\u001a\u00020#J\u0010\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010\'\u001a\u00020#H\u0002J$\u0010(\u001a\u00020#2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00170*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lorg/tensorflow/lite/examples/objectdetection/OverlayView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "activityMainBinding", "Lorg/tensorflow/lite/examples/objectdetection/databinding/ActivityMainBinding;", "getActivityMainBinding", "()Lorg/tensorflow/lite/examples/objectdetection/databinding/ActivityMainBinding;", "setActivityMainBinding", "(Lorg/tensorflow/lite/examples/objectdetection/databinding/ActivityMainBinding;)V", "bounds", "Landroid/graphics/Rect;", "boxPaint", "Landroid/graphics/Paint;", "mainActivity", "Lorg/tensorflow/lite/examples/objectdetection/MainActivity;", "getMainActivity", "()Lorg/tensorflow/lite/examples/objectdetection/MainActivity;", "results", "", "Lorg/tensorflow/lite/task/vision/detector/Detection;", "scaleFactor", "", "string", "", "getString", "()Ljava/lang/String;", "setString", "(Ljava/lang/String;)V", "textBackgroundPaint", "textPaint", "clear", "", "draw", "canvas", "Landroid/graphics/Canvas;", "initPaints", "setResults", "detectionResults", "", "imageHeight", "", "imageWidth", "Companion", "app_debug"})
public final class OverlayView extends android.view.View {
    @org.jetbrains.annotations.NotNull
    private final org.tensorflow.lite.examples.objectdetection.MainActivity mainActivity = null;
    private java.util.List<? extends org.tensorflow.lite.task.vision.detector.Detection> results;
    private android.graphics.Paint boxPaint;
    private android.graphics.Paint textBackgroundPaint;
    private android.graphics.Paint textPaint;
    @org.jetbrains.annotations.NotNull
    private java.lang.String string = "a";
    private float scaleFactor = 1.0F;
    private android.graphics.Rect bounds;
    public org.tensorflow.lite.examples.objectdetection.databinding.ActivityMainBinding activityMainBinding;
    @org.jetbrains.annotations.NotNull
    public static final org.tensorflow.lite.examples.objectdetection.OverlayView.Companion Companion = null;
    private static final int BOUNDING_RECT_TEXT_PADDING = 8;
    
    public OverlayView(@org.jetbrains.annotations.Nullable
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.tensorflow.lite.examples.objectdetection.MainActivity getMainActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getString() {
        return null;
    }
    
    public final void setString(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.tensorflow.lite.examples.objectdetection.databinding.ActivityMainBinding getActivityMainBinding() {
        return null;
    }
    
    public final void setActivityMainBinding(@org.jetbrains.annotations.NotNull
    org.tensorflow.lite.examples.objectdetection.databinding.ActivityMainBinding p0) {
    }
    
    public final void clear() {
    }
    
    private final void initPaints() {
    }
    
    @java.lang.Override
    public void draw(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas canvas) {
    }
    
    public final void setResults(@org.jetbrains.annotations.NotNull
    java.util.List<org.tensorflow.lite.task.vision.detector.Detection> detectionResults, int imageHeight, int imageWidth) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/tensorflow/lite/examples/objectdetection/OverlayView$Companion;", "", "()V", "BOUNDING_RECT_TEXT_PADDING", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}