package com.example.rungps.strava;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: StravaAuthErrors.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005J\u0016\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0005J\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0005J\u0016\u0010\u0010\u001a\u00060\u0011j\u0002`\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/example/rungps/strava/StravaAuthErrors;", "", "<init>", "()V", "RECONNECT_MESSAGE", "", "MISSING_SECRET_MESSAGE", "isInvalidGrant", "", "body", "isTokenEndpointAuthFailure", "httpCode", "", "isReconnectableAuthFailure", NotificationCompat.CATEGORY_MESSAGE, "isFailureMessage", "reconnectException", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "cause", "", "friendlyUploadStatus", "raw", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StravaAuthErrors {
    public static final int $stable = 0;
    public static final StravaAuthErrors INSTANCE = new StravaAuthErrors();
    public static final String MISSING_SECRET_MESSAGE = "Save Strava Client Secret first (strava.com/settings/api).";
    public static final String RECONNECT_MESSAGE = "Strava authorization expired — tap Connect Strava in History to reconnect.";

    private StravaAuthErrors() {
    }

    public final boolean isInvalidGrant(String body) {
        Intrinsics.checkNotNullParameter(body, "body");
        return StringsKt.contains((CharSequence) body, (CharSequence) "invalid_grant", true);
    }

    public final boolean isTokenEndpointAuthFailure(int httpCode, String body) {
        Intrinsics.checkNotNullParameter(body, "body");
        return httpCode == 401 || (httpCode == 400 && isInvalidGrant(body));
    }

    public final boolean isReconnectableAuthFailure(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        String obj = StringsKt.trim((CharSequence) msg).toString();
        if (obj.length() == 0) {
            return false;
        }
        return StringsKt.contains((CharSequence) obj, (CharSequence) "invalid_grant", true) || StringsKt.contains((CharSequence) obj, (CharSequence) "authorization expired", true) || StringsKt.contains((CharSequence) obj, (CharSequence) RECONNECT_MESSAGE, true) || StringsKt.contains((CharSequence) obj, (CharSequence) "Strava token error", true) || StringsKt.contains((CharSequence) obj, (CharSequence) "Strava refresh error", true) || StringsKt.contains((CharSequence) obj, (CharSequence) "Strava activities HTTP 401", true) || StringsKt.contains((CharSequence) obj, (CharSequence) "Strava upload HTTP 401", true) || StringsKt.contains((CharSequence) obj, (CharSequence) "Strava create activity HTTP 401", true) || StringsKt.contains((CharSequence) obj, (CharSequence) "Tap Connect Strava", true);
    }

    public final boolean isFailureMessage(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return isReconnectableAuthFailure(msg) || StringsKt.contains((CharSequence) msg, (CharSequence) "Client Secret", true);
    }

    public static /* synthetic */ IllegalStateException reconnectException$default(StravaAuthErrors stravaAuthErrors, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        return stravaAuthErrors.reconnectException(th);
    }

    public final IllegalStateException reconnectException(Throwable cause) {
        return new IllegalStateException(RECONNECT_MESSAGE, cause);
    }

    public final String friendlyUploadStatus(String raw) {
        String obj = raw != null ? StringsKt.trim((CharSequence) raw).toString() : null;
        if (obj == null) {
            obj = "";
        }
        String str = obj;
        if (str.length() == 0) {
            return null;
        }
        return (isFailureMessage(obj) || StringsKt.contains((CharSequence) str, (CharSequence) "token error 400", true) || StringsKt.contains((CharSequence) str, (CharSequence) "refresh error 400", true)) ? "Failed: Strava authorization expired — tap Connect Strava in History to reconnect." : raw;
    }
}
