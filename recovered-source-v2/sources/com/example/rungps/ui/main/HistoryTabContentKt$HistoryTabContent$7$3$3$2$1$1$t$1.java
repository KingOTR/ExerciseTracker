package com.example.rungps.ui.main;

import androidx.compose.runtime.MutableState;
import com.example.rungps.spotify.SpotifyOAuth;
import com.example.rungps.spotify.SpotifyTokenResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: HistoryTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/example/rungps/spotify/SpotifyTokenResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.HistoryTabContentKt$HistoryTabContent$7$3$3$2$1$1$t$1", f = "HistoryTabContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class HistoryTabContentKt$HistoryTabContent$7$3$3$2$1$1$t$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SpotifyTokenResponse>, Object> {
    final /* synthetic */ String $code;
    final /* synthetic */ String $redirectUri;
    final /* synthetic */ MutableState<String> $spotifyClientId$delegate;
    final /* synthetic */ String $verifier;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HistoryTabContentKt$HistoryTabContent$7$3$3$2$1$1$t$1(String str, String str2, String str3, MutableState<String> mutableState, Continuation<? super HistoryTabContentKt$HistoryTabContent$7$3$3$2$1$1$t$1> continuation) {
        super(2, continuation);
        this.$code = str;
        this.$verifier = str2;
        this.$redirectUri = str3;
        this.$spotifyClientId$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HistoryTabContentKt$HistoryTabContent$7$3$3$2$1$1$t$1(this.$code, this.$verifier, this.$redirectUri, this.$spotifyClientId$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SpotifyTokenResponse> continuation) {
        return ((HistoryTabContentKt$HistoryTabContent$7$3$3$2$1$1$t$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String HistoryTabContent$lambda$45;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        SpotifyOAuth spotifyOAuth = SpotifyOAuth.INSTANCE;
        HistoryTabContent$lambda$45 = HistoryTabContentKt.HistoryTabContent$lambda$45(this.$spotifyClientId$delegate);
        return spotifyOAuth.exchangeCodeForTokens(StringsKt.trim((CharSequence) HistoryTabContent$lambda$45).toString(), this.$code, this.$verifier, this.$redirectUri);
    }
}
