package com.example.rungps.sleep;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import java.io.File;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SleepClipPlayer.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/example/rungps/sleep/SleepClipPlayer;", "", "<init>", "()V", "player", "Landroid/media/MediaPlayer;", "currentPath", "", "isPlaying", "", "path", "stop", "", "play", "context", "Landroid/content/Context;", "wavFile", "Ljava/io/File;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepClipPlayer {
    private static String currentPath;
    private static MediaPlayer player;
    public static final SleepClipPlayer INSTANCE = new SleepClipPlayer();
    public static final int $stable = 8;

    private SleepClipPlayer() {
    }

    public final boolean isPlaying(String path) {
        MediaPlayer mediaPlayer;
        return path != null && Intrinsics.areEqual(path, currentPath) && (mediaPlayer = player) != null && mediaPlayer.isPlaying();
    }

    public final void stop() {
        Unit unit;
        Unit unit2;
        try {
            Result.Companion companion = Result.INSTANCE;
            SleepClipPlayer sleepClipPlayer = this;
            MediaPlayer mediaPlayer = player;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
                unit2 = Unit.INSTANCE;
            } else {
                unit2 = null;
            }
            Result.m7905constructorimpl(unit2);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        try {
            Result.Companion companion3 = Result.INSTANCE;
            SleepClipPlayer sleepClipPlayer2 = this;
            MediaPlayer mediaPlayer2 = player;
            if (mediaPlayer2 != null) {
                mediaPlayer2.release();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m7905constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th2));
        }
        player = null;
        currentPath = null;
    }

    public final void play(Context context, File wavFile) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(wavFile, "wavFile");
        stop();
        MediaPlayer mediaPlayer = new MediaPlayer();
        player = mediaPlayer;
        currentPath = wavFile.getAbsolutePath();
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(1).build());
        mediaPlayer.setDataSource(wavFile.getAbsolutePath());
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.example.rungps.sleep.SleepClipPlayer$$ExternalSyntheticLambda0
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                SleepClipPlayer.play$lambda$2(mediaPlayer2);
            }
        });
        mediaPlayer.prepare();
        mediaPlayer.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void play$lambda$2(MediaPlayer mediaPlayer) {
        INSTANCE.stop();
    }
}
