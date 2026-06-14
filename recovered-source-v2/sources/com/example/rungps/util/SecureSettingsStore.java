package com.example.rungps.util;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKey;
import com.google.firebase.firestore.model.Values;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;

/* compiled from: SecureSettingsStore.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0005J \u0010\u0010\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005J \u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u0013J\u001e\u0010\u0015\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0013J\u000e\u0010\u0016\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0016\u0010\u0019\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/example/rungps/util/SecureSettingsStore;", "", "<init>", "()V", "FILE", "", "MIGRATED", "securePrefs", "Landroid/content/SharedPreferences;", "context", "Landroid/content/Context;", "legacyPrefs", "migrateLegacyTokensIfNeeded", "", "getString", DatabaseFileArchive.COLUMN_KEY, "putString", Values.VECTOR_MAP_VECTORS_KEY, "getLong", "", "default", "putLong", "clearStravaTokens", "stravaClientSecret", "migrateStravaClientSecretFromLegacyIfNeeded", "setStravaClientSecret", "secret", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SecureSettingsStore {
    public static final int $stable = 0;
    private static final String FILE = "settings_secure";
    public static final SecureSettingsStore INSTANCE = new SecureSettingsStore();
    private static final String MIGRATED = "secure_migrated_v1";

    private SecureSettingsStore() {
    }

    private final SharedPreferences securePrefs(Context context) {
        Context applicationContext = context.getApplicationContext();
        MasterKey build = new MasterKey.Builder(applicationContext).setKeyScheme(MasterKey.KeyScheme.AES256_GCM).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        SharedPreferences create = EncryptedSharedPreferences.create(applicationContext, FILE, build, EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return create;
    }

    private final SharedPreferences legacyPrefs(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("settings", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    public final void migrateLegacyTokensIfNeeded(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences legacyPrefs = legacyPrefs(context);
        if (legacyPrefs.getBoolean(MIGRATED, false)) {
            return;
        }
        SharedPreferences.Editor edit = securePrefs(context).edit();
        boolean z = false;
        for (String str : CollectionsKt.listOf((Object[]) new String[]{"stravaAccessToken", "stravaRefreshToken", "stravaClientSecret"})) {
            String string = legacyPrefs.getString(str, null);
            String obj = string != null ? StringsKt.trim((CharSequence) string).toString() : null;
            if (obj == null) {
                obj = "";
            }
            if (obj.length() > 0) {
                edit.putString(str, obj);
                legacyPrefs.edit().remove(str).apply();
                z = true;
            }
        }
        long j = legacyPrefs.getLong("stravaExpiresAtSec", 0L);
        if (j > 0) {
            edit.putLong("stravaExpiresAtSec", j);
            z = true;
        }
        if (z) {
            edit.apply();
        }
        legacyPrefs.edit().putBoolean(MIGRATED, true).apply();
    }

    public final String getString(Context context, String key) {
        String obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        migrateLegacyTokensIfNeeded(context);
        String string = securePrefs(context).getString(key, null);
        if (string == null || (obj = StringsKt.trim((CharSequence) string).toString()) == null || obj.length() <= 0) {
            return null;
        }
        return obj;
    }

    public final void putString(Context context, String key, String value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        migrateLegacyTokensIfNeeded(context);
        SharedPreferences.Editor edit = securePrefs(context).edit();
        String str = value;
        if (str == null || StringsKt.isBlank(str)) {
            edit.remove(key);
        } else {
            edit.putString(key, StringsKt.trim((CharSequence) str).toString());
        }
        edit.apply();
        legacyPrefs(context).edit().remove(key).apply();
    }

    public static /* synthetic */ long getLong$default(SecureSettingsStore secureSettingsStore, Context context, String str, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = 0;
        }
        return secureSettingsStore.getLong(context, str, j);
    }

    public final long getLong(Context context, String key, long r5) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        migrateLegacyTokensIfNeeded(context);
        SharedPreferences securePrefs = securePrefs(context);
        return securePrefs.contains(key) ? securePrefs.getLong(key, r5) : legacyPrefs(context).getLong(key, r5);
    }

    public final void putLong(Context context, String key, long value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        migrateLegacyTokensIfNeeded(context);
        securePrefs(context).edit().putLong(key, value).apply();
    }

    public final void clearStravaTokens(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences.Editor edit = securePrefs(context).edit();
        edit.remove("stravaAccessToken");
        edit.remove("stravaRefreshToken");
        edit.remove("stravaExpiresAtSec");
        edit.apply();
        legacyPrefs(context).edit().remove("stravaAccessToken").remove("stravaRefreshToken").remove("stravaExpiresAtSec").apply();
    }

    public final String stravaClientSecret(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        migrateLegacyTokensIfNeeded(context);
        migrateStravaClientSecretFromLegacyIfNeeded(context);
        String string = getString(context, "stravaClientSecret");
        return string == null ? "" : string;
    }

    private final void migrateStravaClientSecretFromLegacyIfNeeded(Context context) {
        SharedPreferences securePrefs = securePrefs(context);
        if (securePrefs.getString("stravaClientSecret", null) == null || !(!StringsKt.isBlank(r3))) {
            SharedPreferences legacyPrefs = legacyPrefs(context);
            String string = legacyPrefs.getString("stravaClientSecret", null);
            String obj = string != null ? StringsKt.trim((CharSequence) string).toString() : null;
            if (obj == null) {
                obj = "";
            }
            if (obj.length() == 0) {
                return;
            }
            securePrefs.edit().putString("stravaClientSecret", obj).apply();
            legacyPrefs.edit().remove("stravaClientSecret").apply();
        }
    }

    public final void setStravaClientSecret(Context context, String secret) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(secret, "secret");
        putString(context, "stravaClientSecret", StringsKt.trim((CharSequence) secret).toString());
        legacyPrefs(context).edit().remove("stravaClientSecret").apply();
    }
}
