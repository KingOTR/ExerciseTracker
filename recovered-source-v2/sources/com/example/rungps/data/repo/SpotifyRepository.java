package com.example.rungps.data.repo;

import android.content.Context;
import androidx.compose.material3.MenuKt;
import com.example.rungps.spotify.SpotifyNowPlaying;
import com.example.rungps.spotify.SpotifyOAuth;
import com.example.rungps.spotify.SpotifyTokenResponse;
import com.example.rungps.spotify.SpotifyWebApi;
import com.example.rungps.util.SecureSettingsStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: SpotifyRepository.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\tJ\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000bJ'\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\u000eJ\u000e\u0010\u0014\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\u0015J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0086@¢\u0006\u0002\u0010\u0015J\u000e\u0010\u0018\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u0015J\u000e\u0010\u0019\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u0015J\u000e\u0010\u001a\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u0015J\u000e\u0010\u001b\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/example/rungps/data/repo/SpotifyRepository;", "", "appContext", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "isConnected", "", "clientId", "", "readTokens", "Lkotlin/Triple;", "", "persistTokens", "", "access", "refresh", "expiresAtSec", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "clearTokens", "obtainAccessToken", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "nowPlaying", "Lcom/example/rungps/spotify/SpotifyNowPlaying;", "play", "pause", "next", "previous", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpotifyRepository {
    public static final int $stable = 8;
    private final Context appContext;

    public SpotifyRepository(Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.appContext = appContext;
    }

    public final boolean isConnected() {
        String string = SecureSettingsStore.INSTANCE.getString(this.appContext, "spotifyAccessToken");
        return !(string == null || StringsKt.isBlank(string));
    }

    public final String clientId() {
        String string = this.appContext.getSharedPreferences("settings", 0).getString("spotifyClientId", null);
        String obj = string != null ? StringsKt.trim((CharSequence) string).toString() : null;
        return obj == null ? "" : obj;
    }

    public final Triple<String, String, Long> readTokens() {
        String string = SecureSettingsStore.INSTANCE.getString(this.appContext, "spotifyAccessToken");
        if (string == null) {
            string = "";
        }
        String string2 = SecureSettingsStore.INSTANCE.getString(this.appContext, "spotifyRefreshToken");
        return new Triple<>(string, string2 != null ? string2 : "", Long.valueOf(SecureSettingsStore.INSTANCE.getLong(this.appContext, "spotifyExpiresAtSec", 0L)));
    }

    public final void persistTokens(String access, String refresh, Long expiresAtSec) {
        Intrinsics.checkNotNullParameter(access, "access");
        SecureSettingsStore.INSTANCE.putString(this.appContext, "spotifyAccessToken", access);
        if (refresh != null) {
            if (StringsKt.isBlank(refresh)) {
                refresh = null;
            }
            if (refresh != null) {
                SecureSettingsStore.INSTANCE.putString(this.appContext, "spotifyRefreshToken", refresh);
            }
        }
        if (expiresAtSec != null) {
            SecureSettingsStore.INSTANCE.putLong(this.appContext, "spotifyExpiresAtSec", expiresAtSec.longValue());
        }
    }

    public final void clearTokens() {
        SecureSettingsStore.INSTANCE.putString(this.appContext, "spotifyAccessToken", null);
        SecureSettingsStore.INSTANCE.putString(this.appContext, "spotifyRefreshToken", null);
        SecureSettingsStore.INSTANCE.putLong(this.appContext, "spotifyExpiresAtSec", 0L);
    }

    public final Object obtainAccessToken(Continuation<? super String> continuation) {
        String clientId = clientId();
        if (clientId.length() == 0) {
            throw new IllegalStateException("Enter Spotify Client ID first (Spotify Developer Dashboard).");
        }
        Triple<String, String, Long> readTokens = readTokens();
        String component1 = readTokens.component1();
        String component2 = readTokens.component2();
        long longValue = readTokens.component3().longValue();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        if (component1.length() == 0) {
            throw new IllegalStateException("Tap Connect Spotify and approve access.");
        }
        if (component2.length() > 0 && longValue > 0 && currentTimeMillis >= longValue - MenuKt.InTransitionDuration) {
            SpotifyTokenResponse refreshAccessToken = SpotifyOAuth.INSTANCE.refreshAccessToken(clientId, component2);
            component1 = refreshAccessToken.getAccessToken();
            Long boxLong = refreshAccessToken.getExpiresInSec() != null ? Boxing.boxLong(currentTimeMillis + r0.intValue()) : null;
            String refreshToken = refreshAccessToken.getRefreshToken();
            if (refreshToken != null) {
                component2 = refreshToken;
            }
            persistTokens(component1, component2, boxLong);
        }
        return component1;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object nowPlaying(Continuation<? super SpotifyNowPlaying> continuation) {
        SpotifyRepository$nowPlaying$1 spotifyRepository$nowPlaying$1;
        int i;
        if (continuation instanceof SpotifyRepository$nowPlaying$1) {
            spotifyRepository$nowPlaying$1 = (SpotifyRepository$nowPlaying$1) continuation;
            if ((spotifyRepository$nowPlaying$1.label & Integer.MIN_VALUE) != 0) {
                spotifyRepository$nowPlaying$1.label -= Integer.MIN_VALUE;
                Object obj = spotifyRepository$nowPlaying$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = spotifyRepository$nowPlaying$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    spotifyRepository$nowPlaying$1.label = 1;
                    obj = obtainAccessToken(spotifyRepository$nowPlaying$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return SpotifyWebApi.INSTANCE.nowPlaying((String) obj);
            }
        }
        spotifyRepository$nowPlaying$1 = new SpotifyRepository$nowPlaying$1(this, continuation);
        Object obj2 = spotifyRepository$nowPlaying$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = spotifyRepository$nowPlaying$1.label;
        if (i != 0) {
        }
        return SpotifyWebApi.INSTANCE.nowPlaying((String) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object play(Continuation<? super Unit> continuation) {
        SpotifyRepository$play$1 spotifyRepository$play$1;
        int i;
        SpotifyWebApi spotifyWebApi;
        if (continuation instanceof SpotifyRepository$play$1) {
            spotifyRepository$play$1 = (SpotifyRepository$play$1) continuation;
            if ((spotifyRepository$play$1.label & Integer.MIN_VALUE) != 0) {
                spotifyRepository$play$1.label -= Integer.MIN_VALUE;
                Object obj = spotifyRepository$play$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = spotifyRepository$play$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    SpotifyWebApi spotifyWebApi2 = SpotifyWebApi.INSTANCE;
                    spotifyRepository$play$1.L$0 = spotifyWebApi2;
                    spotifyRepository$play$1.label = 1;
                    Object obtainAccessToken = obtainAccessToken(spotifyRepository$play$1);
                    if (obtainAccessToken == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = obtainAccessToken;
                    spotifyWebApi = spotifyWebApi2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    spotifyWebApi = (SpotifyWebApi) spotifyRepository$play$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                spotifyWebApi.play((String) obj);
                return Unit.INSTANCE;
            }
        }
        spotifyRepository$play$1 = new SpotifyRepository$play$1(this, continuation);
        Object obj2 = spotifyRepository$play$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = spotifyRepository$play$1.label;
        if (i != 0) {
        }
        spotifyWebApi.play((String) obj2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object pause(Continuation<? super Unit> continuation) {
        SpotifyRepository$pause$1 spotifyRepository$pause$1;
        int i;
        SpotifyWebApi spotifyWebApi;
        if (continuation instanceof SpotifyRepository$pause$1) {
            spotifyRepository$pause$1 = (SpotifyRepository$pause$1) continuation;
            if ((spotifyRepository$pause$1.label & Integer.MIN_VALUE) != 0) {
                spotifyRepository$pause$1.label -= Integer.MIN_VALUE;
                Object obj = spotifyRepository$pause$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = spotifyRepository$pause$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    SpotifyWebApi spotifyWebApi2 = SpotifyWebApi.INSTANCE;
                    spotifyRepository$pause$1.L$0 = spotifyWebApi2;
                    spotifyRepository$pause$1.label = 1;
                    Object obtainAccessToken = obtainAccessToken(spotifyRepository$pause$1);
                    if (obtainAccessToken == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = obtainAccessToken;
                    spotifyWebApi = spotifyWebApi2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    spotifyWebApi = (SpotifyWebApi) spotifyRepository$pause$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                spotifyWebApi.pause((String) obj);
                return Unit.INSTANCE;
            }
        }
        spotifyRepository$pause$1 = new SpotifyRepository$pause$1(this, continuation);
        Object obj2 = spotifyRepository$pause$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = spotifyRepository$pause$1.label;
        if (i != 0) {
        }
        spotifyWebApi.pause((String) obj2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object next(Continuation<? super Unit> continuation) {
        SpotifyRepository$next$1 spotifyRepository$next$1;
        int i;
        SpotifyWebApi spotifyWebApi;
        if (continuation instanceof SpotifyRepository$next$1) {
            spotifyRepository$next$1 = (SpotifyRepository$next$1) continuation;
            if ((spotifyRepository$next$1.label & Integer.MIN_VALUE) != 0) {
                spotifyRepository$next$1.label -= Integer.MIN_VALUE;
                Object obj = spotifyRepository$next$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = spotifyRepository$next$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    SpotifyWebApi spotifyWebApi2 = SpotifyWebApi.INSTANCE;
                    spotifyRepository$next$1.L$0 = spotifyWebApi2;
                    spotifyRepository$next$1.label = 1;
                    Object obtainAccessToken = obtainAccessToken(spotifyRepository$next$1);
                    if (obtainAccessToken == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = obtainAccessToken;
                    spotifyWebApi = spotifyWebApi2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    spotifyWebApi = (SpotifyWebApi) spotifyRepository$next$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                spotifyWebApi.next((String) obj);
                return Unit.INSTANCE;
            }
        }
        spotifyRepository$next$1 = new SpotifyRepository$next$1(this, continuation);
        Object obj2 = spotifyRepository$next$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = spotifyRepository$next$1.label;
        if (i != 0) {
        }
        spotifyWebApi.next((String) obj2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object previous(Continuation<? super Unit> continuation) {
        SpotifyRepository$previous$1 spotifyRepository$previous$1;
        int i;
        SpotifyWebApi spotifyWebApi;
        if (continuation instanceof SpotifyRepository$previous$1) {
            spotifyRepository$previous$1 = (SpotifyRepository$previous$1) continuation;
            if ((spotifyRepository$previous$1.label & Integer.MIN_VALUE) != 0) {
                spotifyRepository$previous$1.label -= Integer.MIN_VALUE;
                Object obj = spotifyRepository$previous$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = spotifyRepository$previous$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    SpotifyWebApi spotifyWebApi2 = SpotifyWebApi.INSTANCE;
                    spotifyRepository$previous$1.L$0 = spotifyWebApi2;
                    spotifyRepository$previous$1.label = 1;
                    Object obtainAccessToken = obtainAccessToken(spotifyRepository$previous$1);
                    if (obtainAccessToken == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = obtainAccessToken;
                    spotifyWebApi = spotifyWebApi2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    spotifyWebApi = (SpotifyWebApi) spotifyRepository$previous$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                spotifyWebApi.previous((String) obj);
                return Unit.INSTANCE;
            }
        }
        spotifyRepository$previous$1 = new SpotifyRepository$previous$1(this, continuation);
        Object obj2 = spotifyRepository$previous$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = spotifyRepository$previous$1.label;
        if (i != 0) {
        }
        spotifyWebApi.previous((String) obj2);
        return Unit.INSTANCE;
    }
}
