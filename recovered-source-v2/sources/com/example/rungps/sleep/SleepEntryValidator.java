package com.example.rungps.sleep;

import com.example.rungps.data.SleepEntryEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SleepEntryValidator.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/example/rungps/sleep/SleepEntryValidator;", "", "<init>", "()V", "MAX_IN_BED_HOURS", "", "MAX_SLEEP_MIN", "validate", "", "entry", "Lcom/example/rungps/data/SleepEntryEntity;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepEntryValidator {
    public static final int $stable = 0;
    public static final SleepEntryValidator INSTANCE = new SleepEntryValidator();
    public static final int MAX_IN_BED_HOURS = 24;
    public static final int MAX_SLEEP_MIN = 1440;

    private SleepEntryValidator() {
    }

    public final String validate(SleepEntryEntity entry) {
        int intValue;
        Intrinsics.checkNotNullParameter(entry, "entry");
        if (entry.getEndTimeMs() <= entry.getStartTimeMs()) {
            return "Sleep end must be after start";
        }
        int endTimeMs = (int) ((entry.getEndTimeMs() - entry.getStartTimeMs()) / 60000);
        if (endTimeMs > 1440) {
            return "In-bed window cannot exceed 24 hours";
        }
        if (entry.getTotalSleepMin() < 0 || entry.getTotalSleepMin() > 1440) {
            return "Total sleep must be between 0 and 1440 minutes";
        }
        if (entry.getTotalSleepMin() > endTimeMs + 5) {
            return "Total sleep cannot exceed time in bed";
        }
        Integer deepSleepMin = entry.getDeepSleepMin();
        if (deepSleepMin != null && ((intValue = deepSleepMin.intValue()) < 0 || intValue > endTimeMs)) {
            return "Invalid deep sleep minutes";
        }
        Integer lightSleepMin = entry.getLightSleepMin();
        if (lightSleepMin == null) {
            return null;
        }
        int intValue2 = lightSleepMin.intValue();
        if (intValue2 < 0 || intValue2 > endTimeMs) {
            return "Invalid light sleep minutes";
        }
        return null;
    }
}
