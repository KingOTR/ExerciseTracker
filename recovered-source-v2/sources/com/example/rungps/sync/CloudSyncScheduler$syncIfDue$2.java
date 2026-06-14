package com.example.rungps.sync;

import android.content.Context;
import android.content.SharedPreferences;
import com.example.rungps.sleep.SleepAlarmScheduler;
import com.google.firebase.auth.FirebaseAuth;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CloudSyncScheduler.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/example/rungps/sync/CloudSyncResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sync.CloudSyncScheduler$syncIfDue$2", f = "CloudSyncScheduler.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class CloudSyncScheduler$syncIfDue$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CloudSyncResult>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ boolean $force;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CloudSyncScheduler$syncIfDue$2(Context context, boolean z, Continuation<? super CloudSyncScheduler$syncIfDue$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$force = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CloudSyncScheduler$syncIfDue$2 cloudSyncScheduler$syncIfDue$2 = new CloudSyncScheduler$syncIfDue$2(this.$context, this.$force, continuation);
        cloudSyncScheduler$syncIfDue$2.L$0 = obj;
        return cloudSyncScheduler$syncIfDue$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CloudSyncResult> continuation) {
        return ((CloudSyncScheduler$syncIfDue$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m7905constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (FirebaseAuth.getInstance().getCurrentUser() == null) {
                    return null;
                }
                Context applicationContext = this.$context.getApplicationContext();
                SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("cloud_sync", 0);
                long currentTimeMillis = System.currentTimeMillis();
                long j = sharedPreferences.getLong("last_resume_sync_ms", 0L);
                if (!this.$force && currentTimeMillis - j < SleepAlarmScheduler.SAMPLES_WATCHDOG_DELAY_MS) {
                    return null;
                }
                sharedPreferences.edit().putLong("last_resume_sync_ms", currentTimeMillis).apply();
                Result.Companion companion = Result.INSTANCE;
                CloudSyncManager cloudSyncManager = CloudSyncManager.INSTANCE;
                Intrinsics.checkNotNull(applicationContext);
                this.label = 1;
                obj = cloudSyncManager.syncAll(applicationContext, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            m7905constructorimpl = Result.m7905constructorimpl((CloudSyncResult) obj);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
            return null;
        }
        return m7905constructorimpl;
    }
}
