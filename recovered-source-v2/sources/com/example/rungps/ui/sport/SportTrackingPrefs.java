package com.example.rungps.ui.sport;

import android.content.Context;
import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: SportTrackingPrefs.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/example/rungps/ui/sport/SportTrackingPrefs;", "", "<init>", "()V", "PREFS", "", "KEY", "DEFAULT_NAME", "MAX_LENGTH", "", "displayName", "context", "Landroid/content/Context;", "setDisplayName", HintConstants.AUTOFILL_HINT_NAME, "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SportTrackingPrefs {
    public static final int $stable = 0;
    public static final String DEFAULT_NAME = "Soccer";
    public static final SportTrackingPrefs INSTANCE = new SportTrackingPrefs();
    private static final String KEY = "sportTrackingDisplayName";
    public static final int MAX_LENGTH = 24;
    private static final String PREFS = "settings";

    private SportTrackingPrefs() {
    }

    public final String displayName(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getSharedPreferences(PREFS, 0).getString(KEY, null);
        String obj = string != null ? StringsKt.trim((CharSequence) string).toString() : null;
        if (obj != null) {
            String str = obj.length() > 0 ? obj : null;
            if (str != null) {
                return str;
            }
        }
        return DEFAULT_NAME;
    }

    public final String setDisplayName(Context context, String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        String take = StringsKt.take(StringsKt.trim((CharSequence) name).toString(), 24);
        if (take.length() == 0) {
            take = DEFAULT_NAME;
        }
        String str = take;
        context.getSharedPreferences(PREFS, 0).edit().putString(KEY, str).apply();
        return str;
    }
}
