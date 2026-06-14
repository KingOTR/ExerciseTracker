package com.example.rungps.recovery;

import androidx.core.app.NotificationCompat;
import com.example.rungps.data.RecoveryEventEntity;
import com.example.rungps.data.RunEntity;
import com.example.rungps.gym.GymSessionTiming;
import com.example.rungps.tracking.ActivityTypes;
import java.time.Instant;
import java.time.ZoneId;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.osmdroid.tileprovider.constants.OpenStreetMapTileProviderConstants;

/* compiled from: StravaRecoveryDedup.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0015J>\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00052\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001eJ\u001c\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020!2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bJ \u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\"\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u000e2\b\b\u0002\u0010(\u001a\u00020\u000eH\u0002J0\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0007H\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/example/rungps/recovery/StravaRecoveryDedup;", "", "<init>", "()V", "isLinkedUpload", "", "stravaActivityId", "", "linkedIds", "", "END_TIME_TOLERANCE_MS", "START_TIME_TOLERANCE_MS", "MIN_OVERLAP_MS", "DISTANCE_TOLERANCE_RATIO", "", "SAME_DAY_DISTANCE_RATIO", "stravaKindForBike", "", "isBike", "parseDistanceMFromNotes", "notes", "(Ljava/lang/String;)Ljava/lang/Double;", "matchesLocalRun", "stravaStartMs", "stravaEndMs", "stravaDistanceM", "localRuns", "", "Lcom/example/rungps/data/RunEntity;", "zone", "Ljava/time/ZoneId;", "stravaEventMatchesLocalRun", NotificationCompat.CATEGORY_EVENT, "Lcom/example/rungps/data/RecoveryEventEntity;", "sameLocalDay", "endMs1", "endMs2", "distanceSimilar", "localM", "stravaM", "maxRatio", "intervalsOverlap", "aStart", "aEnd", "bStart", "bEnd", "minOverlapMs", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StravaRecoveryDedup {
    public static final int $stable = 0;
    private static final double DISTANCE_TOLERANCE_RATIO = 0.22d;
    private static final long END_TIME_TOLERANCE_MS = 2700000;
    public static final StravaRecoveryDedup INSTANCE = new StravaRecoveryDedup();
    private static final long MIN_OVERLAP_MS = 720000;
    private static final double SAME_DAY_DISTANCE_RATIO = 0.38d;
    private static final long START_TIME_TOLERANCE_MS = 2700000;

    private StravaRecoveryDedup() {
    }

    public final boolean isLinkedUpload(long stravaActivityId, Set<Long> linkedIds) {
        Intrinsics.checkNotNullParameter(linkedIds, "linkedIds");
        return linkedIds.contains(Long.valueOf(stravaActivityId));
    }

    public final String stravaKindForBike(boolean isBike) {
        return isBike ? "STRAVA_BIKE" : "STRAVA_RUN";
    }

    public final Double parseDistanceMFromNotes(String notes) {
        String substringAfterLast$default;
        String obj;
        Double doubleOrNull;
        if (notes == null || (substringAfterLast$default = StringsKt.substringAfterLast$default(notes, " · ", (String) null, 2, (Object) null)) == null || (obj = StringsKt.trim((CharSequence) substringAfterLast$default).toString()) == null || !StringsKt.endsWith(obj, "km", true) || (doubleOrNull = StringsKt.toDoubleOrNull(StringsKt.trim((CharSequence) StringsKt.removeSuffix(obj, (CharSequence) "km")).toString())) == null) {
            return null;
        }
        return Double.valueOf(doubleOrNull.doubleValue() * 1000.0d);
    }

    public static /* synthetic */ boolean matchesLocalRun$default(StravaRecoveryDedup stravaRecoveryDedup, long j, long j2, double d, boolean z, List list, ZoneId zoneId, int i, Object obj) {
        return stravaRecoveryDedup.matchesLocalRun(j, j2, d, z, list, (i & 32) != 0 ? ZoneId.systemDefault() : zoneId);
    }

    public final boolean matchesLocalRun(long stravaStartMs, long stravaEndMs, double stravaDistanceM, boolean isBike, List<RunEntity> localRuns, ZoneId zone) {
        Intrinsics.checkNotNullParameter(localRuns, "localRuns");
        Intrinsics.checkNotNullParameter(zone, "zone");
        for (RunEntity runEntity : localRuns) {
            Long endedAtMs = runEntity.getEndedAtMs();
            if (endedAtMs != null) {
                long longValue = endedAtMs.longValue();
                if (longValue > runEntity.getStartedAtMs() && ActivityTypes.INSTANCE.isBike(runEntity.getActivityType()) == isBike && distanceSimilar$default(this, runEntity.getTotalDistanceM(), stravaDistanceM, 0.0d, 4, null)) {
                    if (Math.abs(longValue - stravaEndMs) <= GymSessionTiming.MAX_END_AFTER_LAST_SET_MS || Math.abs(runEntity.getStartedAtMs() - stravaStartMs) <= GymSessionTiming.MAX_END_AFTER_LAST_SET_MS || intervalsOverlap(runEntity.getStartedAtMs(), longValue, stravaStartMs, stravaEndMs, MIN_OVERLAP_MS)) {
                        return true;
                    }
                    if (sameLocalDay(longValue, stravaEndMs, zone) && distanceSimilar(runEntity.getTotalDistanceM(), stravaDistanceM, SAME_DAY_DISTANCE_RATIO)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean stravaEventMatchesLocalRun(RecoveryEventEntity event, List<RunEntity> localRuns) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(localRuns, "localRuns");
        if (!Intrinsics.areEqual(event.getKind(), "STRAVA_RUN") && !Intrinsics.areEqual(event.getKind(), "STRAVA_BIKE")) {
            return false;
        }
        boolean areEqual = Intrinsics.areEqual(event.getKind(), "STRAVA_BIKE");
        Double parseDistanceMFromNotes = parseDistanceMFromNotes(event.getNotes());
        if (parseDistanceMFromNotes == null) {
            return false;
        }
        double doubleValue = parseDistanceMFromNotes.doubleValue();
        long startedAtMs = event.getStartedAtMs();
        return matchesLocalRun$default(this, startedAtMs - OpenStreetMapTileProviderConstants.ONE_HOUR, startedAtMs, doubleValue, areEqual, localRuns, null, 32, null);
    }

    private final boolean sameLocalDay(long endMs1, long endMs2, ZoneId zone) {
        return Intrinsics.areEqual(Instant.ofEpochMilli(endMs1).atZone(zone).toLocalDate(), Instant.ofEpochMilli(endMs2).atZone(zone).toLocalDate());
    }

    static /* synthetic */ boolean distanceSimilar$default(StravaRecoveryDedup stravaRecoveryDedup, double d, double d2, double d3, int i, Object obj) {
        if ((i & 4) != 0) {
            d3 = DISTANCE_TOLERANCE_RATIO;
        }
        return stravaRecoveryDedup.distanceSimilar(d, d2, d3);
    }

    private final boolean distanceSimilar(double localM, double stravaM, double maxRatio) {
        return localM > 0.0d && stravaM > 0.0d && Math.abs(localM - stravaM) / Math.max(localM, stravaM) <= maxRatio;
    }

    private final boolean intervalsOverlap(long aStart, long aEnd, long bStart, long bEnd, long minOverlapMs) {
        return Math.min(aEnd, bEnd) - Math.max(aStart, bStart) >= minOverlapMs;
    }
}
