package com.example.rungps.data;

import com.example.rungps.strava.StravaHistorySyncResult;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/example/rungps/strava/StravaHistorySyncResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.Repository$syncStravaActivitiesToHistory$2", f = "Repository.kt", i = {}, l = {1036}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class Repository$syncStravaActivitiesToHistory$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends StravaHistorySyncResult>>, Object> {
    final /* synthetic */ boolean $fullHistory;
    final /* synthetic */ int $maxPages;
    int label;
    final /* synthetic */ Repository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Repository$syncStravaActivitiesToHistory$2(Repository repository, boolean z, int i, Continuation<? super Repository$syncStravaActivitiesToHistory$2> continuation) {
        super(2, continuation);
        this.this$0 = repository;
        this.$fullHistory = z;
        this.$maxPages = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Repository$syncStravaActivitiesToHistory$2(this.this$0, this.$fullHistory, this.$maxPages, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends StravaHistorySyncResult>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<StravaHistorySyncResult>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<StravaHistorySyncResult>> continuation) {
        return ((Repository$syncStravaActivitiesToHistory$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m6837syncStravaActivitiesToHistoryAttemptBWLJW6A;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            m6837syncStravaActivitiesToHistoryAttemptBWLJW6A = this.this$0.m6837syncStravaActivitiesToHistoryAttemptBWLJW6A(this.$fullHistory, this.$maxPages, true, this);
            if (m6837syncStravaActivitiesToHistoryAttemptBWLJW6A == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            m6837syncStravaActivitiesToHistoryAttemptBWLJW6A = ((Result) obj).getValue();
        }
        return Result.m7904boximpl(m6837syncStravaActivitiesToHistoryAttemptBWLJW6A);
    }
}
