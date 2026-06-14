package com.example.rungps.ui.main;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import com.example.rungps.nfc.GymNfcConfig;
import com.example.rungps.spotify.SpotifyLoopbackAuth;
import com.example.rungps.spotify.SpotifyOAuth;
import com.example.rungps.spotify.SpotifyPkce;
import com.example.rungps.spotify.SpotifyTokenResponse;
import com.example.rungps.util.SecureSettingsStore;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: HistoryTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.HistoryTabContentKt$HistoryTabContent$7$3$3$2$1$1", f = "HistoryTabContent.kt", i = {0, 0, 0, 0}, l = {502, 518}, m = "invokeSuspend", n = {"verifier", "state", "session", "redirectUri"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes3.dex */
final class HistoryTabContentKt$HistoryTabContent$7$3$3$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<Boolean> $showSpotifySetup$delegate;
    final /* synthetic */ MutableState<String> $spotifyClientId$delegate;
    final /* synthetic */ MutableState<Boolean> $spotifyConnected$delegate;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HistoryTabContentKt$HistoryTabContent$7$3$3$2$1$1(Context context, MutableState<String> mutableState, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3, Continuation<? super HistoryTabContentKt$HistoryTabContent$7$3$3$2$1$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$spotifyClientId$delegate = mutableState;
        this.$spotifyConnected$delegate = mutableState2;
        this.$showSpotifySetup$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HistoryTabContentKt$HistoryTabContent$7$3$3$2$1$1 historyTabContentKt$HistoryTabContent$7$3$3$2$1$1 = new HistoryTabContentKt$HistoryTabContent$7$3$3$2$1$1(this.$ctx, this.$spotifyClientId$delegate, this.$spotifyConnected$delegate, this.$showSpotifySetup$delegate, continuation);
        historyTabContentKt$HistoryTabContent$7$3$3$2$1$1.L$0 = obj;
        return historyTabContentKt$HistoryTabContent$7$3$3$2$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HistoryTabContentKt$HistoryTabContent$7$3$3$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x019c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String generateAndStoreVerifier;
        String uuid;
        SpotifyLoopbackAuth.Session openSession;
        String HistoryTabContent$lambda$45;
        Object m7905constructorimpl;
        Object withContext;
        String str;
        Object withContext2;
        long intValue;
        String refreshToken;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            generateAndStoreVerifier = SpotifyPkce.INSTANCE.generateAndStoreVerifier(this.$ctx);
            String challengeForVerifier = SpotifyPkce.INSTANCE.challengeForVerifier(generateAndStoreVerifier);
            uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            openSession = SpotifyLoopbackAuth.INSTANCE.openSession(GymNfcConfig.DEFAULT_SAVER_POLL_MS);
            String redirectUri = openSession.getRedirectUri();
            SpotifyOAuth spotifyOAuth = SpotifyOAuth.INSTANCE;
            HistoryTabContent$lambda$45 = HistoryTabContentKt.HistoryTabContent$lambda$45(this.$spotifyClientId$delegate);
            String buildAuthorizeUrl = spotifyOAuth.buildAuthorizeUrl(StringsKt.trim((CharSequence) HistoryTabContent$lambda$45).toString(), challengeForVerifier, uuid, redirectUri, CollectionsKt.listOf((Object[]) new String[]{"user-read-currently-playing", "user-read-playback-state", "user-read-recently-played", "user-modify-playback-state"}));
            Context context = this.$ctx;
            try {
                Result.Companion companion = Result.INSTANCE;
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(buildAuthorizeUrl)));
                m7905constructorimpl = Result.m7905constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
            Context context2 = this.$ctx;
            if (Result.m7908exceptionOrNullimpl(m7905constructorimpl) != null) {
                Toast.makeText(context2, "Could not open browser", 0).show();
                openSession.close();
                return Unit.INSTANCE;
            }
            this.L$0 = generateAndStoreVerifier;
            this.L$1 = uuid;
            this.L$2 = openSession;
            this.L$3 = redirectUri;
            this.label = 1;
            withContext = BuildersKt.withContext(Dispatchers.getIO(), new HistoryTabContentKt$HistoryTabContent$7$3$3$2$1$1$cb$1(openSession, null), this);
            if (withContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = redirectUri;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                withContext2 = obj;
                SpotifyTokenResponse spotifyTokenResponse = (SpotifyTokenResponse) withContext2;
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                intValue = spotifyTokenResponse.getExpiresInSec() == null ? currentTimeMillis + r5.intValue() : 0L;
                SecureSettingsStore.INSTANCE.putString(this.$ctx, "spotifyAccessToken", spotifyTokenResponse.getAccessToken());
                refreshToken = spotifyTokenResponse.getRefreshToken();
                if (refreshToken != null) {
                    SecureSettingsStore.INSTANCE.putString(this.$ctx, "spotifyRefreshToken", refreshToken);
                }
                if (intValue > 0) {
                    SecureSettingsStore.INSTANCE.putLong(this.$ctx, "spotifyExpiresAtSec", intValue);
                }
                HistoryTabContentKt.HistoryTabContent$lambda$49(this.$spotifyConnected$delegate, true);
                HistoryTabContentKt.HistoryTabContent$lambda$53(this.$showSpotifySetup$delegate, false);
                Toast.makeText(this.$ctx, "Spotify connected", 0).show();
                return Unit.INSTANCE;
            }
            String str2 = (String) this.L$3;
            openSession = (SpotifyLoopbackAuth.Session) this.L$2;
            uuid = (String) this.L$1;
            generateAndStoreVerifier = (String) this.L$0;
            ResultKt.throwOnFailure(obj);
            str = str2;
            withContext = obj;
        }
        SpotifyLoopbackAuth.Callback callback = (SpotifyLoopbackAuth.Callback) withContext;
        openSession.close();
        String error = callback.getError();
        if (error != null && !StringsKt.isBlank(error)) {
            Toast.makeText(this.$ctx, "Spotify auth failed: " + callback.getError(), 1).show();
            return Unit.INSTANCE;
        }
        String code = callback.getCode();
        String str3 = code;
        if (str3 == null || StringsKt.isBlank(str3)) {
            Toast.makeText(this.$ctx, "Spotify auth timed out — try again", 1).show();
            return Unit.INSTANCE;
        }
        if (callback.getState() != null && !Intrinsics.areEqual(callback.getState(), uuid)) {
            Toast.makeText(this.$ctx, "Spotify auth cancelled (state mismatch)", 1).show();
            return Unit.INSTANCE;
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 2;
        withContext2 = BuildersKt.withContext(Dispatchers.getIO(), new HistoryTabContentKt$HistoryTabContent$7$3$3$2$1$1$t$1(code, generateAndStoreVerifier, str, this.$spotifyClientId$delegate, null), this);
        if (withContext2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        SpotifyTokenResponse spotifyTokenResponse2 = (SpotifyTokenResponse) withContext2;
        long currentTimeMillis2 = System.currentTimeMillis() / 1000;
        if (spotifyTokenResponse2.getExpiresInSec() == null) {
        }
        SecureSettingsStore.INSTANCE.putString(this.$ctx, "spotifyAccessToken", spotifyTokenResponse2.getAccessToken());
        refreshToken = spotifyTokenResponse2.getRefreshToken();
        if (refreshToken != null) {
        }
        if (intValue > 0) {
        }
        HistoryTabContentKt.HistoryTabContent$lambda$49(this.$spotifyConnected$delegate, true);
        HistoryTabContentKt.HistoryTabContent$lambda$53(this.$showSpotifySetup$delegate, false);
        Toast.makeText(this.$ctx, "Spotify connected", 0).show();
        return Unit.INSTANCE;
    }
}
