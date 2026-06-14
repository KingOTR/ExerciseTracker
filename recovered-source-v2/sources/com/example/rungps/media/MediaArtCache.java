package com.example.rungps.media;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.webkit.ProxyConfig;
import com.example.rungps.sleep.SleepAudioConstants;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.common.net.HttpHeaders;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: MediaArtCache.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J*\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\fJ(\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010\u0010J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0005H\u0002J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00012\b\u0010\n\u001a\u0004\u0018\u00010\t¨\u0006\u0015"}, d2 = {"Lcom/example/rungps/media/MediaArtCache;", "", "<init>", "()V", "artDir", "Ljava/io/File;", "context", "Landroid/content/Context;", "ensureLocalPath", "", "artUrl", "cacheKey", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "persistBitmap", "bitmap", "Landroid/graphics/Bitmap;", "(Landroid/content/Context;Ljava/lang/String;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downloadToFile", ImagesContract.URL, "dest", "coilModel", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MediaArtCache {
    public static final int $stable = 0;
    public static final MediaArtCache INSTANCE = new MediaArtCache();

    private MediaArtCache() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File artDir(Context context) {
        File file = new File(context.getFilesDir(), "media_art");
        file.mkdirs();
        return file;
    }

    public final Object ensureLocalPath(Context context, String str, String str2, Continuation<? super String> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new MediaArtCache$ensureLocalPath$2(str, str2, context, null), continuation);
    }

    public final Object persistBitmap(Context context, String str, Bitmap bitmap, Continuation<? super String> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new MediaArtCache$persistBitmap$2(context, str, bitmap, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File downloadToFile(String url, File dest) {
        Object m7905constructorimpl;
        HttpURLConnection httpURLConnection;
        int responseCode;
        try {
            Result.Companion companion = Result.INSTANCE;
            MediaArtCache mediaArtCache = this;
            URLConnection openConnection = new URL(url).openConnection();
            Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setConnectTimeout(SleepAudioConstants.SAMPLE_RATE_V1);
            httpURLConnection.setReadTimeout(12000);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, "ExerciseTracker/1.0");
            httpURLConnection.connect();
            responseCode = httpURLConnection.getResponseCode();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        if (200 > responseCode || responseCode >= 300) {
            return null;
        }
        FileOutputStream inputStream = httpURLConnection.getInputStream();
        try {
            InputStream inputStream2 = inputStream;
            inputStream = new FileOutputStream(dest);
            try {
                Intrinsics.checkNotNull(inputStream2);
                ByteStreamsKt.copyTo$default(inputStream2, inputStream, 0, 2, null);
                CloseableKt.closeFinally(inputStream, null);
                CloseableKt.closeFinally(inputStream, null);
                if (dest.length() <= 0) {
                    dest = null;
                }
                m7905constructorimpl = Result.m7905constructorimpl(dest);
                return (File) (Result.m7911isFailureimpl(m7905constructorimpl) ? null : m7905constructorimpl);
            } finally {
            }
        } finally {
        }
    }

    public final Object coilModel(String artUrl) {
        String str = artUrl;
        if (str == null || StringsKt.isBlank(str)) {
            return null;
        }
        if (StringsKt.startsWith(artUrl, ProxyConfig.MATCH_HTTP, true) || StringsKt.startsWith$default(artUrl, "content://", false, 2, (Object) null)) {
            return artUrl;
        }
        if (StringsKt.startsWith$default(artUrl, "file://", false, 2, (Object) null)) {
            return new File(StringsKt.removePrefix(artUrl, (CharSequence) "file://"));
        }
        return new File(artUrl);
    }
}
