package com.example.rungps.sleep;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import androidx.autofill.HintConstants;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import org.tensorflow.lite.Interpreter;

/* compiled from: SleepTfliteRunner.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0014\u001a\u00020\u0015J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/example/rungps/sleep/SleepTfliteRunner;", "", "assetName", "", "<init>", "(Ljava/lang/String;)V", "interpreter", "Lorg/tensorflow/lite/Interpreter;", "inputShape", "", "outputShape", "isLoaded", "", "()Z", "ensureLoaded", "context", "Landroid/content/Context;", "run", "", "input", "close", "", "loadModelFile", "Ljava/nio/MappedByteBuffer;", HintConstants.AUTOFILL_HINT_NAME, "Companion", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepTfliteRunner {
    public static final String ASSET_STAGING_V2 = "sleep_staging_v2.tflite";
    public static final String ASSET_YAMNET = "yamnet.tflite";
    private final String assetName;
    private int[] inputShape;
    private Interpreter interpreter;
    private int[] outputShape;
    public static final int $stable = 8;

    public SleepTfliteRunner(String assetName) {
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        this.assetName = assetName;
        this.inputShape = new int[0];
        this.outputShape = new int[0];
    }

    public final boolean isLoaded() {
        return this.interpreter != null;
    }

    public final boolean ensureLoaded(Context context) {
        Object m7905constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.interpreter != null) {
            return true;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            SleepTfliteRunner sleepTfliteRunner = this;
            Interpreter interpreter = new Interpreter(loadModelFile(context, this.assetName));
            this.interpreter = interpreter;
            this.inputShape = interpreter.getInputTensor(0).shape();
            this.outputShape = interpreter.getOutputTensor(0).shape();
            m7905constructorimpl = Result.m7905constructorimpl(true);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
            m7905constructorimpl = false;
        }
        return ((Boolean) m7905constructorimpl).booleanValue();
    }

    public final float[] run(float[] input) {
        Intrinsics.checkNotNullParameter(input, "input");
        Interpreter interpreter = this.interpreter;
        if (interpreter == null) {
            return null;
        }
        int[] iArr = this.inputShape;
        if (iArr.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int i = iArr[0];
        int lastIndex = ArraysKt.getLastIndex(iArr);
        int i2 = 1;
        if (1 <= lastIndex) {
            int i3 = 1;
            while (true) {
                i *= iArr[i3];
                if (i3 == lastIndex) {
                    break;
                }
                i3++;
            }
        }
        int[] iArr2 = this.outputShape;
        if (iArr2.length == 0) {
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
        int i4 = iArr2[0];
        int lastIndex2 = ArraysKt.getLastIndex(iArr2);
        if (1 <= lastIndex2) {
            while (true) {
                i4 *= iArr2[i2];
                if (i2 == lastIndex2) {
                    break;
                }
                i2++;
            }
        }
        if (input.length < i) {
            return null;
        }
        ByteBuffer order = ByteBuffer.allocateDirect(i * 4).order(ByteOrder.nativeOrder());
        for (int i5 = 0; i5 < i; i5++) {
            order.putFloat(input[i5]);
        }
        ByteBuffer order2 = ByteBuffer.allocateDirect(i4 * 4).order(ByteOrder.nativeOrder());
        interpreter.run(order, order2);
        order2.rewind();
        float[] fArr = new float[i4];
        for (int i6 = 0; i6 < i4; i6++) {
            fArr[i6] = order2.getFloat();
        }
        return fArr;
    }

    public final void close() {
        Interpreter interpreter = this.interpreter;
        if (interpreter != null) {
            interpreter.close();
        }
        this.interpreter = null;
    }

    private final MappedByteBuffer loadModelFile(Context context, String name) {
        FileInputStream openFd = context.getAssets().openFd(name);
        try {
            AssetFileDescriptor assetFileDescriptor = openFd;
            openFd = new FileInputStream(assetFileDescriptor.getFileDescriptor());
            try {
                MappedByteBuffer map = openFd.getChannel().map(FileChannel.MapMode.READ_ONLY, assetFileDescriptor.getStartOffset(), assetFileDescriptor.getDeclaredLength());
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                CloseableKt.closeFinally(openFd, null);
                CloseableKt.closeFinally(openFd, null);
                return map;
            } finally {
            }
        } finally {
        }
    }
}
