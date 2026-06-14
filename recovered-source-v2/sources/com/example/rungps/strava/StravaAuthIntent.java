package com.example.rungps.strava;

import android.net.Uri;
import androidx.webkit.ProxyConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: StravaAuthIntent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\t"}, d2 = {"Lcom/example/rungps/strava/StravaAuthIntent;", "", "<init>", "()V", "authCodeFromUri", "", "uri", "Landroid/net/Uri;", "redirectUriFor", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StravaAuthIntent {
    public static final int $stable = 0;
    public static final StravaAuthIntent INSTANCE = new StravaAuthIntent();

    private StravaAuthIntent() {
    }

    public final String authCodeFromUri(Uri uri) {
        String path;
        Intrinsics.checkNotNullParameter(uri, "uri");
        boolean z = Intrinsics.areEqual(uri.getScheme(), ProxyConfig.MATCH_HTTP) && Intrinsics.areEqual(uri.getHost(), "localhost") && (Intrinsics.areEqual(uri.getPath(), "/oauth") || ((path = uri.getPath()) != null && StringsKt.startsWith$default(path, "/oauth", false, 2, (Object) null)));
        boolean z2 = Intrinsics.areEqual(uri.getScheme(), "rungps") && Intrinsics.areEqual(uri.getHost(), "strava");
        if (z || z2) {
            return uri.getQueryParameter("code");
        }
        return null;
    }

    public final String redirectUriFor(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return StravaOAuth.REDIRECT_URI;
    }
}
