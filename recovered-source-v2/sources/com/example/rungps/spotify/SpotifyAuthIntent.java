package com.example.rungps.spotify;

import android.net.Uri;
import androidx.webkit.ProxyConfig;
import com.example.rungps.AppBranding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: SpotifyAuthIntent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/example/rungps/spotify/SpotifyAuthIntent;", "", "<init>", "()V", "LEGACY_REDIRECT_URI", "", "authCodeFromUri", "uri", "Landroid/net/Uri;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpotifyAuthIntent {
    public static final int $stable = 0;
    public static final SpotifyAuthIntent INSTANCE = new SpotifyAuthIntent();
    public static final String LEGACY_REDIRECT_URI = "exercisetracker://spotify-callback";

    private SpotifyAuthIntent() {
    }

    public final String authCodeFromUri(Uri uri) {
        String path;
        Intrinsics.checkNotNullParameter(uri, "uri");
        boolean z = Intrinsics.areEqual(uri.getScheme(), ProxyConfig.MATCH_HTTP) && Intrinsics.areEqual(uri.getHost(), "localhost") && (Intrinsics.areEqual(uri.getPath(), "/spotify") || ((path = uri.getPath()) != null && StringsKt.startsWith$default(path, "/spotify", false, 2, (Object) null)));
        boolean z2 = Intrinsics.areEqual(uri.getScheme(), AppBranding.HEALTH_CONNECT_RECORD_PREFIX) && Intrinsics.areEqual(uri.getHost(), "spotify-callback");
        if (z || z2) {
            return uri.getQueryParameter("code");
        }
        return null;
    }
}
