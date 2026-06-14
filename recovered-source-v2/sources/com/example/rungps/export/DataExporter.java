package com.example.rungps.export;

import com.example.rungps.data.Repository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* compiled from: DataExporter.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/example/rungps/export/DataExporter;", "", "<init>", "()V", "buildExportJson", "", "repo", "Lcom/example/rungps/data/Repository;", "(Lcom/example/rungps/data/Repository;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DataExporter {
    public static final int $stable = 0;
    public static final DataExporter INSTANCE = new DataExporter();

    private DataExporter() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object buildExportJson(Repository repository, Continuation<? super String> continuation) {
        DataExporter$buildExportJson$1 dataExporter$buildExportJson$1;
        int i;
        if (continuation instanceof DataExporter$buildExportJson$1) {
            dataExporter$buildExportJson$1 = (DataExporter$buildExportJson$1) continuation;
            if ((dataExporter$buildExportJson$1.label & Integer.MIN_VALUE) != 0) {
                dataExporter$buildExportJson$1.label -= Integer.MIN_VALUE;
                Object obj = dataExporter$buildExportJson$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = dataExporter$buildExportJson$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    DataExporter$buildExportJson$2 dataExporter$buildExportJson$2 = new DataExporter$buildExportJson$2(repository, null);
                    dataExporter$buildExportJson$1.label = 1;
                    obj = BuildersKt.withContext(io2, dataExporter$buildExportJson$2, dataExporter$buildExportJson$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Intrinsics.checkNotNullExpressionValue(obj, "withContext(...)");
                return obj;
            }
        }
        dataExporter$buildExportJson$1 = new DataExporter$buildExportJson$1(this, continuation);
        Object obj2 = dataExporter$buildExportJson$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = dataExporter$buildExportJson$1.label;
        if (i != 0) {
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "withContext(...)");
        return obj2;
    }
}
