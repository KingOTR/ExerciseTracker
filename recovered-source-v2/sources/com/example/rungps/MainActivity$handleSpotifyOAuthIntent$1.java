package com.example.rungps;

import com.example.rungps.spotify.SpotifyAuthIntent;
import com.example.rungps.spotify.SpotifyOAuth;
import com.example.rungps.spotify.SpotifyTokenResponse;
import com.example.rungps.util.SecureSettingsStore;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* compiled from: MainActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.MainActivity$handleSpotifyOAuthIntent$1", f = "MainActivity.kt", i = {}, l = {489, 494}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class MainActivity$handleSpotifyOAuthIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $clientId;
    final /* synthetic */ String $code;
    final /* synthetic */ String $verifier;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MainActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainActivity$handleSpotifyOAuthIntent$1(String str, String str2, String str3, MainActivity mainActivity, Continuation<? super MainActivity$handleSpotifyOAuthIntent$1> continuation) {
        super(2, continuation);
        this.$clientId = str;
        this.$code = str2;
        this.$verifier = str3;
        this.this$0 = mainActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MainActivity$handleSpotifyOAuthIntent$1 mainActivity$handleSpotifyOAuthIntent$1 = new MainActivity$handleSpotifyOAuthIntent$1(this.$clientId, this.$code, this.$verifier, this.this$0, continuation);
        mainActivity$handleSpotifyOAuthIntent$1.L$0 = obj;
        return mainActivity$handleSpotifyOAuthIntent$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MainActivity$handleSpotifyOAuthIntent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m7905constructorimpl;
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = this.$clientId;
            String str2 = this.$code;
            String str3 = this.$verifier;
            MainActivity mainActivity = this.this$0;
            try {
                Result.Companion companion = Result.INSTANCE;
                SpotifyTokenResponse exchangeCodeForTokens = SpotifyOAuth.INSTANCE.exchangeCodeForTokens(str, str2, str3, SpotifyAuthIntent.LEGACY_REDIRECT_URI);
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                long intValue = exchangeCodeForTokens.getExpiresInSec() != null ? currentTimeMillis + r1.intValue() : 0L;
                SecureSettingsStore.INSTANCE.putString(mainActivity, "spotifyAccessToken", exchangeCodeForTokens.getAccessToken());
                String refreshToken = exchangeCodeForTokens.getRefreshToken();
                if (refreshToken != null) {
                    SecureSettingsStore.INSTANCE.putString(mainActivity, "spotifyRefreshToken", refreshToken);
                }
                if (intValue > 0) {
                    SecureSettingsStore.INSTANCE.putLong(mainActivity, "spotifyExpiresAtSec", intValue);
                }
                m7905constructorimpl = Result.m7905constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
            obj2 = m7905constructorimpl;
            MainActivity mainActivity2 = this.this$0;
            if (Result.m7912isSuccessimpl(obj2)) {
                MainCoroutineDispatcher main = Dispatchers.getMain();
                MainActivity$handleSpotifyOAuthIntent$1$2$1 mainActivity$handleSpotifyOAuthIntent$1$2$1 = new MainActivity$handleSpotifyOAuthIntent$1$2$1(mainActivity2, null);
                this.L$0 = obj2;
                this.label = 1;
                if (BuildersKt.withContext(main, mainActivity$handleSpotifyOAuthIntent$1$2$1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            obj2 = this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        MainActivity mainActivity3 = this.this$0;
        Throwable m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(obj2);
        if (m7908exceptionOrNullimpl != null) {
            MainCoroutineDispatcher main2 = Dispatchers.getMain();
            MainActivity$handleSpotifyOAuthIntent$1$3$1 mainActivity$handleSpotifyOAuthIntent$1$3$1 = new MainActivity$handleSpotifyOAuthIntent$1$3$1(mainActivity3, m7908exceptionOrNullimpl, null);
            this.L$0 = obj2;
            this.label = 2;
            if (BuildersKt.withContext(main2, mainActivity$handleSpotifyOAuthIntent$1$3$1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
