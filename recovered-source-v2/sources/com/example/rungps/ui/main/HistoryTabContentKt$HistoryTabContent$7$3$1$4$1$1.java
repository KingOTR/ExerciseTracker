package com.example.rungps.ui.main;

import com.example.rungps.data.Repository;
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

/* compiled from: HistoryTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.HistoryTabContentKt$HistoryTabContent$7$3$1$4$1$1", f = "HistoryTabContent.kt", i = {}, l = {449}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class HistoryTabContentKt$HistoryTabContent$7$3$1$4$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Repository $repo;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HistoryTabContentKt$HistoryTabContent$7$3$1$4$1$1(Repository repository, Continuation<? super HistoryTabContentKt$HistoryTabContent$7$3$1$4$1$1> continuation) {
        super(2, continuation);
        this.$repo = repository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HistoryTabContentKt$HistoryTabContent$7$3$1$4$1$1 historyTabContentKt$HistoryTabContent$7$3$1$4$1$1 = new HistoryTabContentKt$HistoryTabContent$7$3$1$4$1$1(this.$repo, continuation);
        historyTabContentKt$HistoryTabContent$7$3$1$4$1$1.L$0 = obj;
        return historyTabContentKt$HistoryTabContent$7$3$1$4$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HistoryTabContentKt$HistoryTabContent$7$3$1$4$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Repository repository = this.$repo;
                Result.Companion companion = Result.INSTANCE;
                this.label = 1;
                if (repository.spotifyPrevious(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Result.m7905constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        return Unit.INSTANCE;
    }
}
