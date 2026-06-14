package com.example.rungps.recovery;

import androidx.core.app.NotificationCompat;
import com.example.rungps.data.RecoveryEventEntity;
import com.example.rungps.tracking.ActivityTypes;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* compiled from: RecoveryEventLabels.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005J\u0016\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u001a\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0002J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¨\u0006\u0012"}, d2 = {"Lcom/example/rungps/recovery/RecoveryEventLabels;", "", "<init>", "()V", "timelineLabel", "", NotificationCompat.CATEGORY_EVENT, "Lcom/example/rungps/data/RecoveryEventEntity;", "dayName", "timelineSubtitle", "remainingMs", "", "clearsAtMs", "stravaTitle", "notes", "fallback", "formatClearClock", "ms", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RecoveryEventLabels {
    public static final int $stable = 0;
    public static final RecoveryEventLabels INSTANCE = new RecoveryEventLabels();

    private RecoveryEventLabels() {
    }

    public static /* synthetic */ String timelineLabel$default(RecoveryEventLabels recoveryEventLabels, RecoveryEventEntity recoveryEventEntity, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return recoveryEventLabels.timelineLabel(recoveryEventEntity, str);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String timelineLabel(RecoveryEventEntity event, String dayName) {
        Intrinsics.checkNotNullParameter(event, "event");
        String kind = event.getKind();
        switch (kind.hashCode()) {
            case -2047622491:
                if (kind.equals("STRAVA_BIKE")) {
                    return stravaTitle(event.getNotes(), "Strava ride");
                }
                break;
            case -1843726999:
                if (kind.equals("SOCCER")) {
                    return "Soccer / sport";
                }
                break;
            case 71067:
                if (kind.equals("GYM")) {
                    if (dayName != null) {
                        return "Gym · " + dayName;
                    }
                    String notes = event.getNotes();
                    return (notes == null || !StringsKt.contains((CharSequence) notes, (CharSequence) "Free", true)) ? "Gym session" : "Gym · Free day";
                }
                break;
            case 81515:
                if (kind.equals("RUN")) {
                    return "Run";
                }
                break;
            case 2038753:
                if (kind.equals(ActivityTypes.BIKE)) {
                    return "Ride";
                }
                break;
            case 626700071:
                if (kind.equals("STRAVA_RUN")) {
                    return stravaTitle(event.getNotes(), "Strava run");
                }
                break;
        }
        String lowerCase = StringsKt.replace$default(event.getKind(), '_', ' ', false, 4, (Object) null).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (lowerCase.length() <= 0) {
            return lowerCase;
        }
        StringBuilder append = new StringBuilder().append((Object) CharsKt.titlecase(lowerCase.charAt(0)));
        String substring = lowerCase.substring(1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return append.append(substring).toString();
    }

    public final String timelineSubtitle(long remainingMs, long clearsAtMs) {
        String formatRemaining = RecoveryModel.INSTANCE.formatRemaining(remainingMs);
        return Intrinsics.areEqual(formatRemaining, "Clear") ? "Cleared" : formatRemaining + " remaining · clear by " + formatClearClock(clearsAtMs);
    }

    private final String stravaTitle(String notes, String fallback) {
        List split$default = notes != null ? StringsKt.split$default((CharSequence) notes, new String[]{" · "}, false, 0, 6, (Object) null) : null;
        if (split$default == null) {
            split$default = CollectionsKt.emptyList();
        }
        String str = (String) CollectionsKt.getOrNull(split$default, 1);
        String obj = str != null ? StringsKt.trim((CharSequence) str).toString() : null;
        if (obj == null) {
            obj = "";
        }
        String str2 = (String) CollectionsKt.lastOrNull(split$default);
        String obj2 = str2 != null ? StringsKt.trim((CharSequence) str2).toString() : null;
        String str3 = obj2 != null ? obj2 : "";
        String str4 = obj;
        if (str4.length() <= 0 || !StringsKt.endsWith(str3, "km", true)) {
            return str4.length() > 0 ? obj : fallback;
        }
        return obj + " · " + str3;
    }

    private final String formatClearClock(long ms) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(ms);
        int i = calendar.get(10);
        int i2 = calendar.get(12);
        boolean z = calendar.get(9) == 0;
        if (i == 0) {
            i = 12;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%d:%02d %s", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), z ? "am" : "pm"}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
