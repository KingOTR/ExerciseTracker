package com.example.rungps.media;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: MediaArtStore.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/example/rungps/media/MediaArtStore;", "", "<init>", "()V", "saveDeviceArt", "", "context", "Landroid/content/Context;", "cacheKey", "bitmap", "Landroid/graphics/Bitmap;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MediaArtStore {
    public static final int $stable = 0;
    public static final MediaArtStore INSTANCE = new MediaArtStore();

    private MediaArtStore() {
    }

    public final String saveDeviceArt(Context context, String cacheKey, Bitmap bitmap) {
        Object m7905constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        try {
            Result.Companion companion = Result.INSTANCE;
            MediaArtStore mediaArtStore = this;
            File file = new File(context.getFilesDir(), "media_art");
            file.mkdirs();
            String str = cacheKey;
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (Character.isLetterOrDigit(charAt) || charAt == '_') {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
            File file2 = new File(file, StringsKt.take(sb2, 48) + ".jpg");
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 88, fileOutputStream);
                CloseableKt.closeFinally(fileOutputStream, null);
                m7905constructorimpl = Result.m7905constructorimpl(file2.getAbsolutePath());
            } finally {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        return (String) (Result.m7911isFailureimpl(m7905constructorimpl) ? null : m7905constructorimpl);
    }
}
