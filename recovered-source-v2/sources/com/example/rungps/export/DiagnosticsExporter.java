package com.example.rungps.export;

import android.content.Context;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: DiagnosticsExporter.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/example/rungps/export/DiagnosticsExporter;", "", "<init>", "()V", "writeZip", "Ljava/io/File;", "context", "Landroid/content/Context;", "outFile", "(Landroid/content/Context;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DiagnosticsExporter {
    public static final int $stable = 0;
    public static final DiagnosticsExporter INSTANCE = new DiagnosticsExporter();

    private DiagnosticsExporter() {
    }

    public final Object writeZip(Context context, File file, Continuation<? super File> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new DiagnosticsExporter$writeZip$2(context, file, null), continuation);
    }
}
