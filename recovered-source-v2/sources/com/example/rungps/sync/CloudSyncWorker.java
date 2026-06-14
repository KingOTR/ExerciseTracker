package com.example.rungps.sync;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CloudSyncWorker.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/example/rungps/sync/CloudSyncWorker;", "Landroidx/work/CoroutineWorker;", "appContext", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CloudSyncWorker extends CoroutineWorker {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloudSyncWorker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doWork(Continuation<? super ListenableWorker.Result> continuation) {
        CloudSyncWorker$doWork$1 cloudSyncWorker$doWork$1;
        int i;
        try {
            if (continuation instanceof CloudSyncWorker$doWork$1) {
                cloudSyncWorker$doWork$1 = (CloudSyncWorker$doWork$1) continuation;
                if ((cloudSyncWorker$doWork$1.label & Integer.MIN_VALUE) != 0) {
                    cloudSyncWorker$doWork$1.label -= Integer.MIN_VALUE;
                    Object obj = cloudSyncWorker$doWork$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = cloudSyncWorker$doWork$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Context applicationContext = getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                        CloudSyncManager cloudSyncManager = CloudSyncManager.INSTANCE;
                        cloudSyncWorker$doWork$1.label = 1;
                        if (cloudSyncManager.syncAll(applicationContext, cloudSyncWorker$doWork$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return ListenableWorker.Result.success();
                }
            }
            if (i != 0) {
            }
            return ListenableWorker.Result.success();
        } catch (Exception unused) {
            return ListenableWorker.Result.retry();
        }
        cloudSyncWorker$doWork$1 = new CloudSyncWorker$doWork$1(this, continuation);
        Object obj2 = cloudSyncWorker$doWork$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cloudSyncWorker$doWork$1.label;
    }
}
