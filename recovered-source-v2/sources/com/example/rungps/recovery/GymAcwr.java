package com.example.rungps.recovery;

import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.GymSetEntity;
import java.time.Instant;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: GymAcwr.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JD\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\n2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f¨\u0006\u0010"}, d2 = {"Lcom/example/rungps/recovery/GymAcwr;", "", "<init>", "()V", "compute", "Lcom/example/rungps/recovery/GymAcwrResult;", "sessions", "", "Lcom/example/rungps/data/GymSessionEntity;", "setsBySessionId", "", "", "Lcom/example/rungps/data/GymSetEntity;", "nowMs", "zone", "Ljava/time/ZoneId;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymAcwr {
    public static final int $stable = 0;
    public static final GymAcwr INSTANCE = new GymAcwr();

    private GymAcwr() {
    }

    public static /* synthetic */ GymAcwrResult compute$default(GymAcwr gymAcwr, List list, Map map, long j, ZoneId zoneId, int i, Object obj) {
        if ((i & 4) != 0) {
            j = System.currentTimeMillis();
        }
        long j2 = j;
        if ((i & 8) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return gymAcwr.compute(list, map, j2, zoneId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean compute$lambda$0(GymSessionEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getEndedAtMs() != null;
    }

    public final GymAcwrResult compute(List<GymSessionEntity> sessions, Map<Long, ? extends List<GymSetEntity>> setsBySessionId, long nowMs, ZoneId zone) {
        Pair pair;
        Intrinsics.checkNotNullParameter(sessions, "sessions");
        Intrinsics.checkNotNullParameter(setsBySessionId, "setsBySessionId");
        Intrinsics.checkNotNullParameter(zone, "zone");
        Sequence<GymSessionEntity> filter = SequencesKt.filter(CollectionsKt.asSequence(sessions), new Function1() { // from class: com.example.rungps.recovery.GymAcwr$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean compute$lambda$0;
                compute$lambda$0 = GymAcwr.compute$lambda$0((GymSessionEntity) obj);
                return Boolean.valueOf(compute$lambda$0);
            }
        });
        Instant instant = Instant.ofEpochMilli(nowMs).atZone(zone).toInstant();
        long epochMilli = instant.minus(7L, (TemporalUnit) ChronoUnit.DAYS).toEpochMilli();
        long epochMilli2 = instant.minus(28L, (TemporalUnit) ChronoUnit.DAYS).toEpochMilli();
        double d = 0.0d;
        double d2 = 0.0d;
        for (GymSessionEntity gymSessionEntity : filter) {
            Long endedAtMs = gymSessionEntity.getEndedAtMs();
            if (endedAtMs != null) {
                long longValue = endedAtMs.longValue();
                List<GymSetEntity> list = setsBySessionId.get(Long.valueOf(gymSessionEntity.getId()));
                if (list == null) {
                    list = CollectionsKt.emptyList();
                }
                double d3 = 0.0d;
                for (GymSetEntity gymSetEntity : list) {
                    d3 += gymSetEntity.getWeightKg() * RangesKt.coerceAtLeast(gymSetEntity.getReps() != null ? r11.intValue() : 1, 1);
                }
                if (d3 > 0.0d) {
                    if (longValue >= epochMilli2) {
                        d += d3;
                    }
                    if (longValue >= epochMilli) {
                        d2 += d3;
                    }
                }
            }
        }
        if (d <= 0.0d) {
            return null;
        }
        double d4 = d / 4.0d;
        if (d4 <= 0.0d) {
            return null;
        }
        double d5 = d2 / d4;
        if (d5 >= 1.5d) {
            pair = TuplesKt.to("Danger spike (≥1.5)", "Big load spike vs your recent base. Keep gym sub-maximal, reduce volume, and prioritize sleep + recovery this week.");
        } else if (d5 >= 1.3d) {
            pair = TuplesKt.to("Caution (1.3–1.5)", "Load is rising faster than your 4‑week base. Progress conservatively (avoid new maxes; keep 1–2 reps in reserve).");
        } else if (d5 >= 0.8d) {
            pair = TuplesKt.to("Sweet spot (0.8–1.3)", "Load is in a good range for progressive overload. Keep building steadily and avoid sudden jumps.");
        } else if (d5 > 0.0d) {
            pair = TuplesKt.to("Underload (<0.8)", "This week is lighter than your recent base. Fine for deload or recovery; increase gradually if rebuilding volume.");
        } else {
            pair = TuplesKt.to("No load", "No recent gym load detected.");
        }
        return new GymAcwrResult(d2, d4, d5, (String) pair.component1(), (String) pair.component2());
    }
}
