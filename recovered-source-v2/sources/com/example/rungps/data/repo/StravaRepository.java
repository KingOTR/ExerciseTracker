package com.example.rungps.data.repo;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.material3.MenuKt;
import com.example.rungps.analytics.WeeklyActivityKm;
import com.example.rungps.data.AppPreferences;
import com.example.rungps.data.StravaPbDao;
import com.example.rungps.data.StravaPbEntity;
import com.example.rungps.strava.StravaAuthErrors;
import com.example.rungps.strava.StravaOAuth;
import com.example.rungps.strava.StravaTokenResponse;
import com.example.rungps.util.SecureSettingsStore;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: StravaRepository.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011J3\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u001aJ\u0006\u0010\u001b\u001a\u00020\u000fJ\u0006\u0010\u001c\u001a\u00020\u0015J\u0006\u0010\u001d\u001a\u00020\u0012J\u0006\u0010\u001e\u001a\u00020\u0012J-\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u000fH\u0000¢\u0006\u0002\b$J\b\u0010%\u001a\u00020\u0015H\u0002J\u0018\u0010&\u001a\u00020\u00122\b\b\u0002\u0010\"\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010'J\u0018\u0010(\u001a\u00020\u00122\b\b\u0002\u0010)\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010'J\u001e\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\f2\b\b\u0002\u0010,\u001a\u00020-H\u0086@¢\u0006\u0002\u0010.R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/example/rungps/data/repo/StravaRepository;", "", "stravaPbDao", "Lcom/example/rungps/data/StravaPbDao;", "appContext", "Landroid/content/Context;", "<init>", "(Lcom/example/rungps/data/StravaPbDao;Landroid/content/Context;)V", "refreshMutex", "Lkotlinx/coroutines/sync/Mutex;", "pbsFlow", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/rungps/data/StravaPbEntity;", "isConnected", "", "readTokens", "Lkotlin/Triple;", "", "", "persistTokens", "", "access", "refresh", "expiresAtSec", "scopes", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "hasReadAllScope", "clearTokens", "clientId", "clientSecret", "needsRefresh", "expAt", "nowSec", "force", "hasRefresh", "needsRefresh$app_sideload", "requireClientSecretForRefresh", "refreshAccessTokenLocked", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "obtainAccessToken", "forceRefresh", "trainingSessions", "Lcom/example/rungps/analytics/WeeklyActivityKm$StravaSession;", "daysBack", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StravaRepository {
    public static final int $stable = 8;
    private final Context appContext;
    private final Mutex refreshMutex;
    private final StravaPbDao stravaPbDao;

    public final boolean needsRefresh$app_sideload(long expAt, long nowSec, boolean force, boolean hasRefresh) {
        if (!hasRefresh) {
            return false;
        }
        if (force) {
            return true;
        }
        return expAt > 0 && nowSec >= expAt - ((long) MenuKt.InTransitionDuration);
    }

    public StravaRepository(StravaPbDao stravaPbDao, Context appContext) {
        Intrinsics.checkNotNullParameter(stravaPbDao, "stravaPbDao");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.stravaPbDao = stravaPbDao;
        this.appContext = appContext;
        this.refreshMutex = MutexKt.Mutex$default(false, 1, null);
    }

    public final Flow<List<StravaPbEntity>> pbsFlow() {
        return this.stravaPbDao.pbsFlow();
    }

    public final boolean isConnected() {
        String string = SecureSettingsStore.INSTANCE.getString(this.appContext, "stravaAccessToken");
        return !(string == null || StringsKt.isBlank(string));
    }

    public final Triple<String, String, Long> readTokens() {
        SecureSettingsStore.INSTANCE.migrateLegacyTokensIfNeeded(this.appContext);
        String string = SecureSettingsStore.INSTANCE.getString(this.appContext, "stravaAccessToken");
        if (string == null) {
            string = "";
        }
        String string2 = SecureSettingsStore.INSTANCE.getString(this.appContext, "stravaRefreshToken");
        return new Triple<>(string, string2 != null ? string2 : "", Long.valueOf(SecureSettingsStore.INSTANCE.getLong(this.appContext, "stravaExpiresAtSec", 0L)));
    }

    public static /* synthetic */ void persistTokens$default(StravaRepository stravaRepository, String str, String str2, Long l, String str3, int i, Object obj) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        stravaRepository.persistTokens(str, str2, l, str3);
    }

    public final void persistTokens(String access, String refresh, Long expiresAtSec, String scopes) {
        String obj;
        Intrinsics.checkNotNullParameter(access, "access");
        SecureSettingsStore.INSTANCE.putString(this.appContext, "stravaAccessToken", access);
        if (refresh != null) {
            SecureSettingsStore.INSTANCE.putString(this.appContext, "stravaRefreshToken", refresh);
        }
        if (expiresAtSec != null) {
            SecureSettingsStore.INSTANCE.putLong(this.appContext, "stravaExpiresAtSec", expiresAtSec.longValue());
        }
        if (scopes == null || (obj = StringsKt.trim((CharSequence) scopes).toString()) == null) {
            return;
        }
        if (obj.length() <= 0) {
            obj = null;
        }
        if (obj != null) {
            this.appContext.getSharedPreferences("settings", 0).edit().putString("strava_oauth_scopes", obj).apply();
        }
    }

    public final boolean hasReadAllScope() {
        String str;
        String string = this.appContext.getSharedPreferences("settings", 0).getString("strava_oauth_scopes", null);
        if (string != null) {
            str = string.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        String str2 = str;
        return str2.length() == 0 || StringsKt.contains$default((CharSequence) str2, (CharSequence) "activity:read_all", false, 2, (Object) null);
    }

    public final void clearTokens() {
        SecureSettingsStore.INSTANCE.putString(this.appContext, "stravaAccessToken", "");
        SecureSettingsStore.INSTANCE.putString(this.appContext, "stravaRefreshToken", "");
        SecureSettingsStore.INSTANCE.putLong(this.appContext, "stravaExpiresAtSec", 0L);
        this.appContext.getSharedPreferences("settings", 0).edit().putString("strava_last_upload_status", "Disconnected — Strava authorization expired — tap Connect Strava in History to reconnect.").remove("strava_expiry_backfill_done").apply();
    }

    public final String clientId() {
        return AppPreferences.INSTANCE.stravaClientIdBlocking(this.appContext);
    }

    public final String clientSecret() {
        return SecureSettingsStore.INSTANCE.stravaClientSecret(this.appContext);
    }

    private final void requireClientSecretForRefresh() {
        if (clientSecret().length() == 0) {
            throw new IllegalStateException(StravaAuthErrors.MISSING_SECRET_MESSAGE);
        }
    }

    public static /* synthetic */ Object refreshAccessTokenLocked$default(StravaRepository stravaRepository, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return stravaRepository.refreshAccessTokenLocked(z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068 A[Catch: all -> 0x0124, TryCatch #0 {all -> 0x0124, blocks: (B:11:0x005b, B:13:0x0068, B:15:0x0094, B:22:0x00a0, B:23:0x00a9, B:24:0x00aa, B:27:0x00b4, B:29:0x00b7, B:31:0x00cb, B:33:0x00d1, B:35:0x00df, B:38:0x00eb, B:42:0x00f7, B:45:0x0101, B:47:0x0107, B:48:0x0112, B:49:0x0113, B:50:0x0114, B:51:0x011b, B:52:0x011c, B:53:0x0123), top: B:10:0x005b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011c A[Catch: all -> 0x0124, TryCatch #0 {all -> 0x0124, blocks: (B:11:0x005b, B:13:0x0068, B:15:0x0094, B:22:0x00a0, B:23:0x00a9, B:24:0x00aa, B:27:0x00b4, B:29:0x00b7, B:31:0x00cb, B:33:0x00d1, B:35:0x00df, B:38:0x00eb, B:42:0x00f7, B:45:0x0101, B:47:0x0107, B:48:0x0112, B:49:0x0113, B:50:0x0114, B:51:0x011b, B:52:0x011c, B:53:0x0123), top: B:10:0x005b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object refreshAccessTokenLocked(boolean z, Continuation<? super String> continuation) {
        StravaRepository$refreshAccessTokenLocked$1 stravaRepository$refreshAccessTokenLocked$1;
        int i;
        StravaRepository stravaRepository;
        Mutex mutex;
        boolean z2;
        String clientId;
        try {
            if (continuation instanceof StravaRepository$refreshAccessTokenLocked$1) {
                stravaRepository$refreshAccessTokenLocked$1 = (StravaRepository$refreshAccessTokenLocked$1) continuation;
                if ((stravaRepository$refreshAccessTokenLocked$1.label & Integer.MIN_VALUE) != 0) {
                    stravaRepository$refreshAccessTokenLocked$1.label -= Integer.MIN_VALUE;
                    Object obj = stravaRepository$refreshAccessTokenLocked$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = stravaRepository$refreshAccessTokenLocked$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.refreshMutex;
                        stravaRepository$refreshAccessTokenLocked$1.L$0 = this;
                        stravaRepository$refreshAccessTokenLocked$1.L$1 = mutex2;
                        stravaRepository$refreshAccessTokenLocked$1.Z$0 = z;
                        stravaRepository$refreshAccessTokenLocked$1.label = 1;
                        if (mutex2.lock(null, stravaRepository$refreshAccessTokenLocked$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        stravaRepository = this;
                        mutex = mutex2;
                        z2 = z;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        boolean z3 = stravaRepository$refreshAccessTokenLocked$1.Z$0;
                        mutex = (Mutex) stravaRepository$refreshAccessTokenLocked$1.L$1;
                        stravaRepository = (StravaRepository) stravaRepository$refreshAccessTokenLocked$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        z2 = z3;
                    }
                    clientId = stravaRepository.clientId();
                    if (clientId.length() != 0) {
                        throw new IllegalStateException("Enter Strava Client ID first (strava.com/settings/api).");
                    }
                    Triple<String, String, Long> readTokens = stravaRepository.readTokens();
                    String component1 = readTokens.component1();
                    String component2 = readTokens.component2();
                    long longValue = readTokens.component3().longValue();
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    if (component1.length() == 0) {
                        throw new IllegalStateException("Tap Connect Strava and approve access.");
                    }
                    if (component2.length() == 0) {
                        if (z2) {
                            stravaRepository.clearTokens();
                            throw StravaAuthErrors.reconnectException$default(StravaAuthErrors.INSTANCE, null, 1, null);
                        }
                    } else if (stravaRepository.needsRefresh$app_sideload(longValue, currentTimeMillis, z2, true)) {
                        stravaRepository.requireClientSecretForRefresh();
                        try {
                            StravaTokenResponse refreshAccessToken = StravaOAuth.INSTANCE.refreshAccessToken(clientId, stravaRepository.clientSecret(), component2);
                            component1 = refreshAccessToken.getAccessToken();
                            Long expiresAt = refreshAccessToken.getExpiresAt();
                            if (expiresAt == null) {
                                expiresAt = refreshAccessToken.getExpiresIn() != null ? Boxing.boxLong(currentTimeMillis + r1.intValue()) : null;
                            }
                            String accessToken = refreshAccessToken.getAccessToken();
                            String refreshToken = refreshAccessToken.getRefreshToken();
                            if (refreshToken != null) {
                                component2 = refreshToken;
                            }
                            stravaRepository.persistTokens(accessToken, component2, expiresAt, refreshAccessToken.getScope());
                        } catch (Exception e) {
                            StravaAuthErrors stravaAuthErrors = StravaAuthErrors.INSTANCE;
                            String message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            if (stravaAuthErrors.isReconnectableAuthFailure(message)) {
                                stravaRepository.clearTokens();
                                throw StravaAuthErrors.INSTANCE.reconnectException(e);
                            }
                            throw e;
                        }
                    }
                    return component1;
                }
            }
            clientId = stravaRepository.clientId();
            if (clientId.length() != 0) {
            }
        } finally {
            mutex.unlock(null);
        }
        stravaRepository$refreshAccessTokenLocked$1 = new StravaRepository$refreshAccessTokenLocked$1(this, continuation);
        Object obj2 = stravaRepository$refreshAccessTokenLocked$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stravaRepository$refreshAccessTokenLocked$1.label;
        if (i != 0) {
        }
    }

    public static /* synthetic */ Object obtainAccessToken$default(StravaRepository stravaRepository, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return stravaRepository.obtainAccessToken(z, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b8, code lost:
    
        if (r16 != false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object obtainAccessToken(boolean z, Continuation<? super String> continuation) {
        StravaRepository$obtainAccessToken$1 stravaRepository$obtainAccessToken$1;
        int i;
        SharedPreferences sharedPreferences;
        Object obj;
        String str;
        long j;
        boolean z2;
        Object refreshAccessTokenLocked;
        SharedPreferences sharedPreferences2;
        if (continuation instanceof StravaRepository$obtainAccessToken$1) {
            stravaRepository$obtainAccessToken$1 = (StravaRepository$obtainAccessToken$1) continuation;
            if ((stravaRepository$obtainAccessToken$1.label & Integer.MIN_VALUE) != 0) {
                stravaRepository$obtainAccessToken$1.label -= Integer.MIN_VALUE;
                StravaRepository$obtainAccessToken$1 stravaRepository$obtainAccessToken$12 = stravaRepository$obtainAccessToken$1;
                Object obj2 = stravaRepository$obtainAccessToken$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stravaRepository$obtainAccessToken$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    if (clientId().length() == 0) {
                        throw new IllegalStateException("Enter Strava Client ID first (strava.com/settings/api).");
                    }
                    Triple<String, String, Long> readTokens = readTokens();
                    String component1 = readTokens.component1();
                    String component2 = readTokens.component2();
                    long longValue = readTokens.component3().longValue();
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    if (component1.length() == 0) {
                        throw new IllegalStateException("Tap Connect Strava and approve access.");
                    }
                    if (component2.length() > 0) {
                        SharedPreferences sharedPreferences3 = this.appContext.getSharedPreferences("settings", 0);
                        boolean z3 = sharedPreferences3.getBoolean("strava_expiry_backfill_done", false);
                        if (z) {
                            sharedPreferences = sharedPreferences3;
                            obj = coroutine_suspended;
                            str = "strava_expiry_backfill_done";
                            j = longValue;
                        } else {
                            sharedPreferences = sharedPreferences3;
                            obj = coroutine_suspended;
                            str = "strava_expiry_backfill_done";
                            j = longValue;
                            if (!needsRefresh$app_sideload(longValue, currentTimeMillis, false, true)) {
                                if (j <= 0) {
                                }
                            }
                        }
                        stravaRepository$obtainAccessToken$12.L$0 = sharedPreferences;
                        stravaRepository$obtainAccessToken$12.J$0 = j;
                        z2 = true;
                        stravaRepository$obtainAccessToken$12.label = 1;
                        refreshAccessTokenLocked = refreshAccessTokenLocked(z, stravaRepository$obtainAccessToken$12);
                        Object obj3 = obj;
                        if (refreshAccessTokenLocked == obj3) {
                            return obj3;
                        }
                        sharedPreferences2 = sharedPreferences;
                    }
                    return component1;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j2 = stravaRepository$obtainAccessToken$12.J$0;
                sharedPreferences2 = (SharedPreferences) stravaRepository$obtainAccessToken$12.L$0;
                ResultKt.throwOnFailure(obj2);
                str = "strava_expiry_backfill_done";
                j = j2;
                refreshAccessTokenLocked = obj2;
                z2 = true;
                String str2 = (String) refreshAccessTokenLocked;
                if (j <= 0) {
                    sharedPreferences2.edit().putBoolean(str, z2).apply();
                }
                return str2;
            }
        }
        stravaRepository$obtainAccessToken$1 = new StravaRepository$obtainAccessToken$1(this, continuation);
        StravaRepository$obtainAccessToken$1 stravaRepository$obtainAccessToken$122 = stravaRepository$obtainAccessToken$1;
        Object obj22 = stravaRepository$obtainAccessToken$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stravaRepository$obtainAccessToken$122.label;
        if (i != 0) {
        }
        String str22 = (String) refreshAccessTokenLocked;
        if (j <= 0) {
        }
        return str22;
    }

    public static /* synthetic */ Object trainingSessions$default(StravaRepository stravaRepository, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 28;
        }
        return stravaRepository.trainingSessions(i, continuation);
    }

    public final Object trainingSessions(int i, Continuation<? super List<WeeklyActivityKm.StravaSession>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new StravaRepository$trainingSessions$2(this, i, null), continuation);
    }
}
