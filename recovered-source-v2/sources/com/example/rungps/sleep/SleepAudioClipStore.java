package com.example.rungps.sleep;

import android.content.Context;
import androidx.security.crypto.EncryptedFile;
import androidx.security.crypto.MasterKey;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: SleepAudioClipStore.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u001e\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0005J&\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0005J\u0016\u0010\u0017\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0005J\u0016\u0010\u0018\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/example/rungps/sleep/SleepAudioClipStore;", "", "<init>", "()V", "DIR", "", "directory", "Ljava/io/File;", "context", "Landroid/content/Context;", "buildFileName", "nightStartTimeMs", "", "eventTimeMs", "kind", "writeEncryptedWav", "", "encryptedFileName", "sampleRate", "", "pcm16le", "", "decryptToTempWav", "deleteEncrypted", "deleteForNight", "wavHeader", "pcmBytes", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepAudioClipStore {
    public static final int $stable = 0;
    private static final String DIR = "sleep_clips";
    public static final SleepAudioClipStore INSTANCE = new SleepAudioClipStore();

    private SleepAudioClipStore() {
    }

    public final File directory(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File file = new File(context.getFilesDir(), DIR);
        file.mkdirs();
        return file;
    }

    public final String buildFileName(long nightStartTimeMs, long eventTimeMs, String kind) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        String lowerCase = kind.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return "sleep_" + nightStartTimeMs + "_" + eventTimeMs + "_" + StringsKt.take(new Regex("[^a-z0-9_\\-]").replace(lowerCase, "_"), 24) + ".wav.enc";
    }

    public final void writeEncryptedWav(Context context, String encryptedFileName, int sampleRate, byte[] pcm16le) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(encryptedFileName, "encryptedFileName");
        Intrinsics.checkNotNullParameter(pcm16le, "pcm16le");
        File file = new File(directory(context), encryptedFileName);
        MasterKey build = new MasterKey.Builder(context).setKeyScheme(MasterKey.KeyScheme.AES256_GCM).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        EncryptedFile build2 = new EncryptedFile.Builder(context, file, build, EncryptedFile.FileEncryptionScheme.AES256_GCM_HKDF_4KB).build();
        Intrinsics.checkNotNullExpressionValue(build2, "build(...)");
        FileOutputStream openFileOutput = build2.openFileOutput();
        try {
            FileOutputStream fileOutputStream = openFileOutput;
            fileOutputStream.write(INSTANCE.wavHeader(pcm16le.length, sampleRate));
            fileOutputStream.write(pcm16le);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(openFileOutput, null);
        } finally {
        }
    }

    public final File decryptToTempWav(Context context, String encryptedFileName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(encryptedFileName, "encryptedFileName");
        File file = new File(directory(context), encryptedFileName);
        File file2 = new File(context.getCacheDir(), "sleep_clips_preview");
        file2.mkdirs();
        File file3 = new File(file2, StringsKt.removeSuffix(encryptedFileName, (CharSequence) ".enc"));
        if (!file.exists()) {
            throw new IllegalStateException("Clip missing");
        }
        if (file3.exists() && file3.length() > 0) {
            return file3;
        }
        MasterKey build = new MasterKey.Builder(context).setKeyScheme(MasterKey.KeyScheme.AES256_GCM).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        EncryptedFile build2 = new EncryptedFile.Builder(context, file, build, EncryptedFile.FileEncryptionScheme.AES256_GCM_HKDF_4KB).build();
        Intrinsics.checkNotNullExpressionValue(build2, "build(...)");
        FileOutputStream openFileInput = build2.openFileInput();
        try {
            FileInputStream fileInputStream = openFileInput;
            openFileInput = new FileOutputStream(file3);
            try {
                Intrinsics.checkNotNull(fileInputStream);
                ByteStreamsKt.copyTo$default(fileInputStream, openFileInput, 0, 2, null);
                CloseableKt.closeFinally(openFileInput, null);
                CloseableKt.closeFinally(openFileInput, null);
                return file3;
            } finally {
            }
        } finally {
        }
    }

    public final void deleteEncrypted(Context context, String encryptedFileName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(encryptedFileName, "encryptedFileName");
        try {
            Result.Companion companion = Result.INSTANCE;
            SleepAudioClipStore sleepAudioClipStore = this;
            Result.m7905constructorimpl(Boolean.valueOf(new File(directory(context), encryptedFileName).delete()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        try {
            Result.Companion companion3 = Result.INSTANCE;
            SleepAudioClipStore sleepAudioClipStore2 = this;
            Result.m7905constructorimpl(Boolean.valueOf(new File(new File(context.getCacheDir(), "sleep_clips_preview"), StringsKt.removeSuffix(encryptedFileName, (CharSequence) ".enc")).delete()));
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th2));
        }
    }

    public final void deleteForNight(Context context, long nightStartTimeMs) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = "sleep_" + nightStartTimeMs + "_";
        File[] listFiles = directory(context).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                String name = file.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (StringsKt.startsWith$default(name, str, false, 2, (Object) null)) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        Result.m7905constructorimpl(Boolean.valueOf(file.delete()));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        Result.m7905constructorimpl(ResultKt.createFailure(th));
                    }
                    try {
                        Result.Companion companion3 = Result.INSTANCE;
                        File file2 = new File(context.getCacheDir(), "sleep_clips_preview");
                        String name2 = file.getName();
                        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                        Result.m7905constructorimpl(Boolean.valueOf(new File(file2, StringsKt.removeSuffix(name2, (CharSequence) ".enc")).delete()));
                    } catch (Throwable th2) {
                        Result.Companion companion4 = Result.INSTANCE;
                        Result.m7905constructorimpl(ResultKt.createFailure(th2));
                    }
                }
            }
        }
    }

    private final byte[] wavHeader(int pcmBytes, int sampleRate) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(44);
        wavHeader$writeAscii(byteArrayOutputStream, "RIFF");
        wavHeader$writeLe32(byteArrayOutputStream, pcmBytes + 36);
        wavHeader$writeAscii(byteArrayOutputStream, "WAVE");
        wavHeader$writeAscii(byteArrayOutputStream, "fmt ");
        wavHeader$writeLe32(byteArrayOutputStream, 16);
        wavHeader$writeLe16(byteArrayOutputStream, 1);
        wavHeader$writeLe16(byteArrayOutputStream, 1);
        wavHeader$writeLe32(byteArrayOutputStream, sampleRate);
        wavHeader$writeLe32(byteArrayOutputStream, sampleRate * 2);
        wavHeader$writeLe16(byteArrayOutputStream, 2);
        wavHeader$writeLe16(byteArrayOutputStream, 16);
        wavHeader$writeAscii(byteArrayOutputStream, "data");
        wavHeader$writeLe32(byteArrayOutputStream, pcmBytes);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }

    private static final void wavHeader$writeAscii(ByteArrayOutputStream byteArrayOutputStream, String str) {
        byte[] bytes = str.getBytes(Charsets.US_ASCII);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byteArrayOutputStream.write(bytes);
    }

    private static final void wavHeader$writeLe32(ByteArrayOutputStream byteArrayOutputStream, int i) {
        byteArrayOutputStream.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array());
    }

    private static final void wavHeader$writeLe16(ByteArrayOutputStream byteArrayOutputStream, int i) {
        byteArrayOutputStream.write(ByteBuffer.allocate(2).order(ByteOrder.LITTLE_ENDIAN).putShort((short) i).array());
    }
}
