package com.example.rungps.spotify;

import com.example.rungps.spotify.SpotifyLoopbackAuth;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SpotifyLoopbackAuth.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/example/rungps/spotify/SpotifyLoopbackAuth$Callback;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.spotify.SpotifyLoopbackAuth$Session$awaitCallback$2", f = "SpotifyLoopbackAuth.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class SpotifyLoopbackAuth$Session$awaitCallback$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SpotifyLoopbackAuth.Callback>, Object> {
    int label;
    final /* synthetic */ SpotifyLoopbackAuth.Session this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SpotifyLoopbackAuth$Session$awaitCallback$2(SpotifyLoopbackAuth.Session session, Continuation<? super SpotifyLoopbackAuth$Session$awaitCallback$2> continuation) {
        super(2, continuation);
        this.this$0 = session;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SpotifyLoopbackAuth$Session$awaitCallback$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SpotifyLoopbackAuth.Callback> continuation) {
        return ((SpotifyLoopbackAuth$Session$awaitCallback$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Incorrect condition in loop: B:5:0x0014 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AtomicBoolean atomicBoolean;
        SpotifyLoopbackAuth.Callback callback;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            while (!atomicBoolean.get()) {
                Thread.sleep(60L);
            }
            callback = this.this$0.callback;
            return callback == null ? new SpotifyLoopbackAuth.Callback(null, null, "timeout") : callback;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
