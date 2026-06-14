package com.example.rungps.data;

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
@DebugMetadata(c = "com.example.rungps.data.Repository$syncStravaActivitiesForRecovery$2", f = "Repository.kt", i = {}, l = {1151}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class Repository$syncStravaActivitiesForRecovery$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends StravaRecoverySyncResult>>, Object> {
    final /* synthetic */ int $daysBack;
    final /* synthetic */ boolean $forceReimport;
    int label;
    final /* synthetic */ Repository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Repository$syncStravaActivitiesForRecovery$2(Repository repository, int i, boolean z, Continuation<? super Repository$syncStravaActivitiesForRecovery$2> continuation) {
        super(2, continuation);
        this.this$0 = repository;
        this.$daysBack = i;
        this.$forceReimport = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Repository$syncStravaActivitiesForRecovery$2(this.this$0, this.$daysBack, this.$forceReimport, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends StravaRecoverySyncResult>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<StravaRecoverySyncResult>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<StravaRecoverySyncResult>> continuation) {
        return ((Repository$syncStravaActivitiesForRecovery$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m6834syncStravaActivitiesForRecoveryAttemptBWLJW6A;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            m6834syncStravaActivitiesForRecoveryAttemptBWLJW6A = this.this$0.m6834syncStravaActivitiesForRecoveryAttemptBWLJW6A(this.$daysBack, this.$forceReimport, true, this);
            if (m6834syncStravaActivitiesForRecoveryAttemptBWLJW6A == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            m6834syncStravaActivitiesForRecoveryAttemptBWLJW6A = ((Result) obj).getValue();
        }
        return Result.m7904boximpl(m6834syncStravaActivitiesForRecoveryAttemptBWLJW6A);
    }
}
