package com.example.rungps.gear;

import com.example.rungps.data.RunEntity;
import com.example.rungps.tracking.ActivityTypes;
import com.example.rungps.tracking.TrackingService;
import java.time.Instant;
import java.time.ZoneId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ActivityTitleGenerator.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nJ\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\t\u001a\u00020\n¨\u0006\u000e"}, d2 = {"Lcom/example/rungps/gear/ActivityTitleGenerator;", "", "<init>", "()V", "defaultTitle", "", "startedAtMs", "", TrackingService.EXTRA_ACTIVITY_TYPE, "zone", "Ljava/time/ZoneId;", "displayTitle", "run", "Lcom/example/rungps/data/RunEntity;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ActivityTitleGenerator {
    public static final int $stable = 0;
    public static final ActivityTitleGenerator INSTANCE = new ActivityTitleGenerator();

    private ActivityTitleGenerator() {
    }

    public static /* synthetic */ String defaultTitle$default(ActivityTitleGenerator activityTitleGenerator, long j, String str, ZoneId zoneId, int i, Object obj) {
        if ((i & 4) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return activityTitleGenerator.defaultTitle(j, str, zoneId);
    }

    public final String defaultTitle(long startedAtMs, String activityType, ZoneId zone) {
        String str;
        Intrinsics.checkNotNullParameter(activityType, "activityType");
        Intrinsics.checkNotNullParameter(zone, "zone");
        int hour = Instant.ofEpochMilli(startedAtMs).atZone(zone).getHour();
        if (5 <= hour && hour < 12) {
            str = "Morning";
        } else if (12 <= hour && hour < 17) {
            str = "Afternoon";
        } else if (17 <= hour && hour < 21) {
            str = "Evening";
        } else {
            str = "Night";
        }
        return str + " " + (ActivityTypes.INSTANCE.isBike(activityType) ? "Ride" : "Run");
    }

    public static /* synthetic */ String displayTitle$default(ActivityTitleGenerator activityTitleGenerator, RunEntity runEntity, ZoneId zoneId, int i, Object obj) {
        if ((i & 2) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return activityTitleGenerator.displayTitle(runEntity, zoneId);
    }

    public final String displayTitle(RunEntity run, ZoneId zone) {
        String obj;
        Intrinsics.checkNotNullParameter(run, "run");
        Intrinsics.checkNotNullParameter(zone, "zone");
        String title = run.getTitle();
        if (title != null && (obj = StringsKt.trim((CharSequence) title).toString()) != null) {
            if (obj.length() <= 0) {
                obj = null;
            }
            if (obj != null) {
                return obj;
            }
        }
        return defaultTitle(run.getStartedAtMs(), run.getActivityType(), zone);
    }
}
