package com.example.rungps.spotify;

import android.content.Context;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.SecureRandom;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: SpotifyPkce.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/example/rungps/spotify/SpotifyPkce;", "", "<init>", "()V", "PREFS", "", "KEY_VERIFIER", "generateAndStoreVerifier", "context", "Landroid/content/Context;", "consumeVerifier", "challengeForVerifier", "verifier", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpotifyPkce {
    public static final int $stable = 0;
    public static final SpotifyPkce INSTANCE = new SpotifyPkce();
    private static final String KEY_VERIFIER = "code_verifier";
    private static final String PREFS = "spotify_pkce";

    private SpotifyPkce() {
    }

    public final String generateAndStoreVerifier(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        byte[] bArr = new byte[32];
        new SecureRandom().nextBytes(bArr);
        String encodeToString = Base64.encodeToString(bArr, 11);
        context.getSharedPreferences(PREFS, 0).edit().putString(KEY_VERIFIER, encodeToString).apply();
        Intrinsics.checkNotNull(encodeToString);
        return encodeToString;
    }

    public final String consumeVerifier(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getSharedPreferences(PREFS, 0).getString(KEY_VERIFIER, null);
        if (string == null) {
            return null;
        }
        context.getSharedPreferences(PREFS, 0).edit().remove(KEY_VERIFIER).apply();
        return string;
    }

    public final String challengeForVerifier(String verifier) {
        Intrinsics.checkNotNullParameter(verifier, "verifier");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = verifier.getBytes(Charsets.US_ASCII);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(messageDigest.digest(bytes), 11);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(...)");
        return encodeToString;
    }
}
