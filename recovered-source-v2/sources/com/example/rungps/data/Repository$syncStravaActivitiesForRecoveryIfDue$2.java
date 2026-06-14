package com.example.rungps.data;

import android.content.SharedPreferences;
import com.example.rungps.recovery.StravaRecoverySyncResult;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Repository.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/example/rungps/recovery/StravaRecoverySyncResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.Repository$syncStravaActivitiesForRecoveryIfDue$2", f = "Repository.kt", i = {0, 0}, l = {1289}, m = "invokeSuspend", n = {"prefs", "now"}, s = {"L$0", "J$0"})
/* loaded from: classes3.dex */
final class Repository$syncStravaActivitiesForRecoveryIfDue$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends StravaRecoverySyncResult>>, Object> {
    final /* synthetic */ int $daysBack;
    final /* synthetic */ long $intervalMs;
    long J$0;
    Object L$0;
    int label;
    final /* synthetic */ Repository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Repository$syncStravaActivitiesForRecoveryIfDue$2(Repository repository, long j, int i, Continuation<? super Repository$syncStravaActivitiesForRecoveryIfDue$2> continuation) {
        super(2, continuation);
        this.this$0 = repository;
        this.$intervalMs = j;
        this.$daysBack = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Repository$syncStravaActivitiesForRecoveryIfDue$2(this.this$0, this.$intervalMs, this.$daysBack, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends StravaRecoverySyncResult>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<StravaRecoverySyncResult>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<StravaRecoverySyncResult>> continuation) {
        return ((Repository$syncStravaActivitiesForRecoveryIfDue$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m6833syncStravaActivitiesForRecovery0E7RQCE$default;
        SharedPreferences sharedPreferences;
        long j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SharedPreferences sharedPreferences2 = this.this$0.getAppContext().getSharedPreferences("settings", 0);
            long j2 = sharedPreferences2.getLong("last_strava_recovery_sync_ms", 0L);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - j2 < this.$intervalMs) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m7904boximpl(Result.m7905constructorimpl(new StravaRecoverySyncResult(0, 0, 0, 0, 0, 0, 0, 64, null)));
            }
            this.L$0 = sharedPreferences2;
            this.J$0 = currentTimeMillis;
            this.label = 1;
            m6833syncStravaActivitiesForRecovery0E7RQCE$default = Repository.m6833syncStravaActivitiesForRecovery0E7RQCE$default(this.this$0, this.$daysBack, false, this, 2, null);
            if (m6833syncStravaActivitiesForRecovery0E7RQCE$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            sharedPreferences = sharedPreferences2;
            j = currentTimeMillis;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.J$0;
            sharedPreferences = (SharedPreferences) this.L$0;
            ResultKt.throwOnFailure(obj);
            m6833syncStravaActivitiesForRecovery0E7RQCE$default = ((Result) obj).getValue();
        }
        Result m7904boximpl = Result.m7904boximpl(m6833syncStravaActivitiesForRecovery0E7RQCE$default);
        if (Result.m7912isSuccessimpl(m7904boximpl.getValue())) {
            sharedPreferences.edit().putLong("last_strava_recovery_sync_ms", j).apply();
        }
        return m7904boximpl;
    }
}
