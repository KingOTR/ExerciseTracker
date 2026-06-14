package com.example.rungps;

import android.content.ClipData;
import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.widget.Toast;
import androidx.lifecycle.LifecycleOwnerKt;
import com.example.rungps.data.AppDb;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: MainActivityExports.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u0002¨\u0006\t"}, d2 = {"exportAndShare", "", "Lcom/example/rungps/MainActivity;", "runId", "", "exportAllDataZip", "formatExportDate", "", "ms", "app_sideload"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MainActivityExportsKt {
    public static final void exportAndShare(MainActivity mainActivity, long j) {
        Intrinsics.checkNotNullParameter(mainActivity, "<this>");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(mainActivity), Dispatchers.getIO(), null, new MainActivityExportsKt$exportAndShare$1(mainActivity, j, null), 2, null);
    }

    public static final void exportAllDataZip(final MainActivity mainActivity) {
        Intrinsics.checkNotNullParameter(mainActivity, "<this>");
        new Thread(new Runnable() { // from class: com.example.rungps.MainActivityExportsKt$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                MainActivityExportsKt.exportAllDataZip$lambda$16(MainActivity.this, mainActivity);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void exportAllDataZip$lambda$16(MainActivity mainActivity, final MainActivity mainActivity2) {
        Object m7905constructorimpl;
        Object obj;
        Object m7905constructorimpl2;
        Object runBlocking$default;
        try {
            try {
                Result.Companion companion = Result.INSTANCE;
                AppDb.INSTANCE.get(mainActivity2).getOpenHelper().getWritableDatabase().query("PRAGMA wal_checkpoint(FULL)").close();
                Result.m7905constructorimpl(Unit.INSTANCE);
            } catch (Exception e) {
                mainActivity2.runOnUiThread(new Runnable() { // from class: com.example.rungps.MainActivityExportsKt$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        MainActivityExportsKt.exportAllDataZip$lambda$16$lambda$15(MainActivity.this, e);
                    }
                });
                return;
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        File databasePath = mainActivity2.getDatabasePath(AppBranding.DATABASE_FILE);
        File file = new File(databasePath.getAbsolutePath() + "-wal");
        File file2 = new File(databasePath.getAbsolutePath() + "-shm");
        File file3 = new File(mainActivity2.getCacheDir(), "exercise-tracker-export-" + System.currentTimeMillis() + ".zip");
        OutputStream fileOutputStream = new FileOutputStream(file3);
        ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream instanceof BufferedOutputStream ? (BufferedOutputStream) fileOutputStream : new BufferedOutputStream(fileOutputStream, 8192));
        try {
            ZipOutputStream zipOutputStream2 = zipOutputStream;
            try {
                Result.Companion companion3 = Result.INSTANCE;
                runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new MainActivityExportsKt$exportAllDataZip$1$2$jsonExport$1$1(mainActivity2, null), 1, null);
                m7905constructorimpl = Result.m7905constructorimpl((String) runBlocking$default);
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.INSTANCE;
                m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                m7905constructorimpl = null;
            }
            String str = (String) m7905constructorimpl;
            zipOutputStream2.putNextEntry(new ZipEntry("README.txt"));
            byte[] bytes = "Exercise Tracker export\n\n- data/export.json: gym sessions, runs, sleep (human-readable JSON).\n- db/rungps.db (+ optional -wal/-shm): full SQLite database backup.\n- Import/restore from JSON is not implemented yet; keep this ZIP as a backup.".getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            zipOutputStream2.write(bytes);
            zipOutputStream2.closeEntry();
            if (str != null) {
                zipOutputStream2.putNextEntry(new ZipEntry("data/export.json"));
                byte[] bytes2 = str.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
                zipOutputStream2.write(bytes2);
                zipOutputStream2.closeEntry();
            }
            Intrinsics.checkNotNull(databasePath);
            exportAllDataZip$lambda$16$lambda$3$addFile(zipOutputStream2, "db/rungps.db", databasePath);
            exportAllDataZip$lambda$16$lambda$3$addFile(zipOutputStream2, "db/rungps.db-wal", file);
            exportAllDataZip$lambda$16$lambda$3$addFile(zipOutputStream2, "db/rungps.db-shm", file2);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(zipOutputStream, null);
            final String str2 = "exercise-tracker-export-" + new SimpleDateFormat("yyyyMMdd-HHmm", Locale.US).format(new Date()) + ".zip";
            Uri EXTERNAL_CONTENT_URI = MediaStore.Downloads.EXTERNAL_CONTENT_URI;
            Intrinsics.checkNotNullExpressionValue(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", str2);
            contentValues.put("mime_type", "application/zip");
            contentValues.put("relative_path", "Download/ExerciseTracker");
            contentValues.put("is_pending", (Integer) 1);
            try {
                Result.Companion companion5 = Result.INSTANCE;
                obj = Result.m7905constructorimpl(mainActivity2.getContentResolver().insert(EXTERNAL_CONTENT_URI, contentValues));
            } catch (Throwable th3) {
                Result.Companion companion6 = Result.INSTANCE;
                obj = Result.m7905constructorimpl(ResultKt.createFailure(th3));
            }
            boolean m7911isFailureimpl = Result.m7911isFailureimpl(obj);
            Object obj2 = obj;
            if (m7911isFailureimpl) {
                obj2 = null;
            }
            Uri uri = (Uri) obj2;
            if (uri == null) {
                mainActivity2.runOnUiThread(new Runnable() { // from class: com.example.rungps.MainActivityExportsKt$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        MainActivityExportsKt.exportAllDataZip$lambda$16$lambda$6(MainActivity.this);
                    }
                });
                return;
            }
            try {
                Result.Companion companion7 = Result.INSTANCE;
                OutputStream openOutputStream = mainActivity2.getContentResolver().openOutputStream(uri);
                if (openOutputStream != null) {
                    OutputStream outputStream = openOutputStream;
                    try {
                        OutputStream outputStream2 = outputStream;
                        FileInputStream fileInputStream = new FileInputStream(file3);
                        try {
                            long copyTo$default = ByteStreamsKt.copyTo$default(fileInputStream, outputStream2, 0, 2, null);
                            CloseableKt.closeFinally(fileInputStream, null);
                            Long.valueOf(copyTo$default);
                            CloseableKt.closeFinally(outputStream, null);
                        } finally {
                        }
                    } finally {
                    }
                }
                contentValues.clear();
                contentValues.put("is_pending", (Integer) 0);
                mainActivity2.getContentResolver().update(uri, contentValues, null, null);
                m7905constructorimpl2 = Result.m7905constructorimpl(Unit.INSTANCE);
            } catch (Throwable th4) {
                Result.Companion companion8 = Result.INSTANCE;
                m7905constructorimpl2 = Result.m7905constructorimpl(ResultKt.createFailure(th4));
            }
            if (Result.m7908exceptionOrNullimpl(m7905constructorimpl2) != null) {
                try {
                    Result.Companion companion9 = Result.INSTANCE;
                    Result.m7905constructorimpl(Integer.valueOf(mainActivity2.getContentResolver().delete(uri, null, null)));
                } catch (Throwable th5) {
                    Result.Companion companion10 = Result.INSTANCE;
                    Result.m7905constructorimpl(ResultKt.createFailure(th5));
                }
                mainActivity2.runOnUiThread(new Runnable() { // from class: com.example.rungps.MainActivityExportsKt$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        MainActivityExportsKt.exportAllDataZip$lambda$16$lambda$12$lambda$11(MainActivity.this);
                    }
                });
                return;
            }
            final Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("application/zip");
            intent.putExtra("android.intent.extra.STREAM", uri);
            intent.setClipData(ClipData.newUri(mainActivity2.getContentResolver(), str2, uri));
            intent.addFlags(1);
            mainActivity2.runOnUiThread(new Runnable() { // from class: com.example.rungps.MainActivityExportsKt$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivityExportsKt.exportAllDataZip$lambda$16$lambda$14(MainActivity.this, str2, intent);
                }
            });
        } finally {
        }
    }

    private static final void exportAllDataZip$lambda$16$lambda$3$addFile(ZipOutputStream zipOutputStream, String str, File file) {
        if (!file.exists() || file.length() <= 0) {
            return;
        }
        zipOutputStream.putNextEntry(new ZipEntry(str));
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        try {
            ByteStreamsKt.copyTo$default(bufferedInputStream, zipOutputStream, 0, 2, null);
            CloseableKt.closeFinally(bufferedInputStream, null);
            zipOutputStream.closeEntry();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(bufferedInputStream, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void exportAllDataZip$lambda$16$lambda$6(MainActivity mainActivity) {
        Toast.makeText(mainActivity, "Couldn't save export ZIP to Downloads.", 1).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void exportAllDataZip$lambda$16$lambda$12$lambda$11(MainActivity mainActivity) {
        Toast.makeText(mainActivity, "Couldn't write export ZIP.", 1).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void exportAllDataZip$lambda$16$lambda$14(MainActivity mainActivity, String str, Intent intent) {
        Toast.makeText(mainActivity, "Saved to Downloads/ExerciseTracker/" + str, 1).show();
        mainActivity.startActivity(Intent.createChooser(intent, "Share export"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void exportAllDataZip$lambda$16$lambda$15(MainActivity mainActivity, Exception exc) {
        MainActivity mainActivity2 = mainActivity;
        String message = exc.getMessage();
        if (message == null) {
            message = "Export failed";
        }
        Toast.makeText(mainActivity2, message, 1).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String formatExportDate(long j) {
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.US).format(new Date(j));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
