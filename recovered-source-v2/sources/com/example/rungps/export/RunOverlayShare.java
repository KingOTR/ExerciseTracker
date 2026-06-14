package com.example.rungps.export;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.core.content.FileProvider;
import androidx.health.connect.client.records.Vo2MaxRecord;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RunOverlayShare.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\u0011"}, d2 = {"Lcom/example/rungps/export/RunOverlayShare;", "", "<init>", "()V", "sharePng", "", "context", "Landroid/content/Context;", "bitmap", "Landroid/graphics/Bitmap;", "chooserTitle", "", "saveToGallery", "Lcom/example/rungps/export/RunOverlayShare$SaveResult;", "writeCachePng", "Ljava/io/File;", "SaveResult", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RunOverlayShare {
    public static final int $stable = 0;
    public static final RunOverlayShare INSTANCE = new RunOverlayShare();

    private RunOverlayShare() {
    }

    /* compiled from: RunOverlayShare.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/example/rungps/export/RunOverlayShare$SaveResult;", "", "uri", "Landroid/net/Uri;", "error", "", "<init>", "(Landroid/net/Uri;Ljava/lang/String;)V", "getUri", "()Landroid/net/Uri;", "getError", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SaveResult {
        public static final int $stable = 8;
        private final String error;
        private final Uri uri;

        public static /* synthetic */ SaveResult copy$default(SaveResult saveResult, Uri uri, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = saveResult.uri;
            }
            if ((i & 2) != 0) {
                str = saveResult.error;
            }
            return saveResult.copy(uri, str);
        }

        /* renamed from: component1, reason: from getter */
        public final Uri getUri() {
            return this.uri;
        }

        /* renamed from: component2, reason: from getter */
        public final String getError() {
            return this.error;
        }

        public final SaveResult copy(Uri uri, String error) {
            return new SaveResult(uri, error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SaveResult)) {
                return false;
            }
            SaveResult saveResult = (SaveResult) other;
            return Intrinsics.areEqual(this.uri, saveResult.uri) && Intrinsics.areEqual(this.error, saveResult.error);
        }

        public int hashCode() {
            Uri uri = this.uri;
            int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.error;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "SaveResult(uri=" + this.uri + ", error=" + this.error + ")";
        }

        public SaveResult(Uri uri, String str) {
            this.uri = uri;
            this.error = str;
        }

        public final String getError() {
            return this.error;
        }

        public final Uri getUri() {
            return this.uri;
        }
    }

    public static /* synthetic */ void sharePng$default(RunOverlayShare runOverlayShare, Context context, Bitmap bitmap, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = "Share run image";
        }
        runOverlayShare.sharePng(context, bitmap, str);
    }

    public final void sharePng(Context context, Bitmap bitmap, String chooserTitle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(chooserTitle, "chooserTitle");
        File writeCachePng = writeCachePng(context, bitmap);
        if (writeCachePng == null) {
            return;
        }
        Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", writeCachePng);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("image/png");
        intent.putExtra("android.intent.extra.STREAM", uriForFile);
        intent.addFlags(1);
        context.startActivity(Intent.createChooser(intent, chooserTitle));
    }

    public final SaveResult saveToGallery(Context context, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        String str = "ExerciseTracker-" + new SimpleDateFormat("yyyyMMdd-HHmmss", Locale.US).format(new Date()) + ".png";
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", "image/png");
        contentValues.put("relative_path", "Pictures/ExerciseTracker");
        contentValues.put("is_pending", (Integer) 1);
        Uri insert = context.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        if (insert == null) {
            return new SaveResult(null, "Could not create gallery file");
        }
        try {
            OutputStream openOutputStream = context.getContentResolver().openOutputStream(insert);
            if (openOutputStream != null) {
                OutputStream outputStream = openOutputStream;
                try {
                    if (!bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream)) {
                        throw new IllegalStateException("Image encode failed");
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(outputStream, null);
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("is_pending", (Integer) 0);
                    context.getContentResolver().update(insert, contentValues2, null, null);
                    return new SaveResult(insert, null);
                } finally {
                }
            } else {
                throw new IllegalStateException("Could not open gallery stream");
            }
        } catch (Exception e) {
            try {
                Result.Companion companion = Result.INSTANCE;
                Result.m7905constructorimpl(Integer.valueOf(context.getContentResolver().delete(insert, null, null)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
            String message = e.getMessage();
            if (message == null) {
                message = "Save failed";
            }
            return new SaveResult(null, message);
        }
    }

    private final File writeCachePng(Context context, Bitmap bitmap) {
        File file = new File(context.getCacheDir(), "shares");
        file.mkdirs();
        File file2 = new File(file, "run-overlay-" + System.currentTimeMillis() + ".png");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                CloseableKt.closeFinally(fileOutputStream, null);
                return file2;
            } finally {
            }
        } catch (Exception unused) {
            return null;
        }
    }
}
