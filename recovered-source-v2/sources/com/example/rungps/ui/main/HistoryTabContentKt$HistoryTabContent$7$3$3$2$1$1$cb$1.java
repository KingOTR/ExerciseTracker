package com.example.rungps.ui.main;

import com.example.rungps.spotify.SpotifyLoopbackAuth;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: HistoryTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/example/rungps/spotify/SpotifyLoopbackAuth$Callback;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.HistoryTabContentKt$HistoryTabContent$7$3$3$2$1$1$cb$1", f = "HistoryTabContent.kt", i = {}, l = {502}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class HistoryTabContentKt$HistoryTabContent$7$3$3$2$1$1$cb$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SpotifyLoopbackAuth.Callback>, Object> {
    final /* synthetic */ SpotifyLoopbackAuth.Session $session;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HistoryTabContentKt$HistoryTabContent$7$3$3$2$1$1$cb$1(SpotifyLoopbackAuth.Session session, Continuation<? super HistoryTabContentKt$HistoryTabContent$7$3$3$2$1$1$cb$1> continuation) {
        super(2, continuation);
        this.$session = session;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HistoryTabContentKt$HistoryTabContent$7$3$3$2$1$1$cb$1(this.$session, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SpotifyLoopbackAuth.Callback> continuation) {
        return ((HistoryTabContentKt$HistoryTabContent$7$3$3$2$1$1$cb$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = this.$session.awaitCallback(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
