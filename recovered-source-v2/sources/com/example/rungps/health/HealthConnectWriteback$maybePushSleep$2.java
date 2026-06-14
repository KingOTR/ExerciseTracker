package com.example.rungps.health;

import android.content.Context;
import com.example.rungps.data.SleepEntryEntity;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: HealthConnectWriteback.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.health.HealthConnectWriteback$maybePushSleep$2", f = "HealthConnectWriteback.kt", i = {0, 0}, l = {19, 20}, m = "invokeSuspend", n = {"$this$withContext", "hc"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class HealthConnectWriteback$maybePushSleep$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ SleepEntryEntity $entry;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HealthConnectWriteback$maybePushSleep$2(Context context, SleepEntryEntity sleepEntryEntity, Continuation<? super HealthConnectWriteback$maybePushSleep$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$entry = sleepEntryEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HealthConnectWriteback$maybePushSleep$2 healthConnectWriteback$maybePushSleep$2 = new HealthConnectWriteback$maybePushSleep$2(this.$context, this.$entry, continuation);
        healthConnectWriteback$maybePushSleep$2.L$0 = obj;
        return healthConnectWriteback$maybePushSleep$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HealthConnectWriteback$maybePushSleep$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.example.rungps.health.HealthConnectManager] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.example.rungps.health.HealthConnectManager, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.example.rungps.health.HealthConnectManager] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m7905constructorimpl;
        ?? r1;
        boolean autoBackupEnabled;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            try {
            } catch (Throwable th) {
                Result.Companion companion = Result.INSTANCE;
                Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th2));
            r1 = i;
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            autoBackupEnabled = HealthConnectWriteback.INSTANCE.autoBackupEnabled(this.$context);
            if (!autoBackupEnabled) {
                return Unit.INSTANCE;
            }
            Context applicationContext = this.$context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            ?? healthConnectManager = new HealthConnectManager(applicationContext);
            if (!healthConnectManager.isAvailable()) {
                return Unit.INSTANCE;
            }
            Result.Companion companion3 = Result.INSTANCE;
            this.L$0 = coroutineScope;
            this.L$1 = healthConnectManager;
            this.label = 1;
            obj = healthConnectManager.hasSleepWritePermission(this);
            i = healthConnectManager;
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) obj).booleanValue()));
                return Unit.INSTANCE;
            }
            ?? r12 = (HealthConnectManager) this.L$1;
            ResultKt.throwOnFailure(obj);
            i = r12;
        }
        m7905constructorimpl = Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) obj).booleanValue()));
        r1 = i;
        Boolean boxBoolean = Boxing.boxBoolean(false);
        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
            m7905constructorimpl = boxBoolean;
        }
        if (!((Boolean) m7905constructorimpl).booleanValue()) {
            return Unit.INSTANCE;
        }
        SleepEntryEntity sleepEntryEntity = this.$entry;
        Result.Companion companion4 = Result.INSTANCE;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        obj = r1.backupSleepSession(sleepEntryEntity, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        Result.m7905constructorimpl(Boxing.boxBoolean(((Boolean) obj).booleanValue()));
        return Unit.INSTANCE;
    }
}
