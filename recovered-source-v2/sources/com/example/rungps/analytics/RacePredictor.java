package com.example.rungps.analytics;

import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.analytics.RaceTrendCalculator;
import com.example.rungps.data.RecoveryEventEntity;
import com.example.rungps.data.Repository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: RacePredictor.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\rJ\u001e\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\f¨\u0006\u0016"}, d2 = {"Lcom/example/rungps/analytics/RacePredictor;", "", "<init>", "()V", "buildCard", "Lcom/example/rungps/analytics/RacePredictor$Card;", "repo", "Lcom/example/rungps/data/Repository;", "recoveryEvents", "", "Lcom/example/rungps/data/RecoveryEventEntity;", "nowMs", "", "(Lcom/example/rungps/data/Repository;Ljava/util/List;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "legFatigueSlowdownPct", "", "events", "formatTime", "", "ms", "DistanceEstimate", "Card", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RacePredictor {
    public static final int $stable = 0;
    public static final RacePredictor INSTANCE = new RacePredictor();

    private RacePredictor() {
    }

    /* compiled from: RacePredictor.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/example/rungps/analytics/RacePredictor$DistanceEstimate;", "", "label", "", "baseTimeMs", "", "adjustedTimeMs", "pacePerKm", "<init>", "(Ljava/lang/String;JJLjava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getBaseTimeMs", "()J", "getAdjustedTimeMs", "getPacePerKm", "component1", "component2", "component3", "component4", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DistanceEstimate {
        public static final int $stable = 0;
        private final long adjustedTimeMs;
        private final long baseTimeMs;
        private final String label;
        private final String pacePerKm;

        public static /* synthetic */ DistanceEstimate copy$default(DistanceEstimate distanceEstimate, String str, long j, long j2, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = distanceEstimate.label;
            }
            if ((i & 2) != 0) {
                j = distanceEstimate.baseTimeMs;
            }
            long j3 = j;
            if ((i & 4) != 0) {
                j2 = distanceEstimate.adjustedTimeMs;
            }
            long j4 = j2;
            if ((i & 8) != 0) {
                str2 = distanceEstimate.pacePerKm;
            }
            return distanceEstimate.copy(str, j3, j4, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* renamed from: component2, reason: from getter */
        public final long getBaseTimeMs() {
            return this.baseTimeMs;
        }

        /* renamed from: component3, reason: from getter */
        public final long getAdjustedTimeMs() {
            return this.adjustedTimeMs;
        }

        /* renamed from: component4, reason: from getter */
        public final String getPacePerKm() {
            return this.pacePerKm;
        }

        public final DistanceEstimate copy(String label, long baseTimeMs, long adjustedTimeMs, String pacePerKm) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(pacePerKm, "pacePerKm");
            return new DistanceEstimate(label, baseTimeMs, adjustedTimeMs, pacePerKm);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DistanceEstimate)) {
                return false;
            }
            DistanceEstimate distanceEstimate = (DistanceEstimate) other;
            return Intrinsics.areEqual(this.label, distanceEstimate.label) && this.baseTimeMs == distanceEstimate.baseTimeMs && this.adjustedTimeMs == distanceEstimate.adjustedTimeMs && Intrinsics.areEqual(this.pacePerKm, distanceEstimate.pacePerKm);
        }

        public int hashCode() {
            return (((((this.label.hashCode() * 31) + Long.hashCode(this.baseTimeMs)) * 31) + Long.hashCode(this.adjustedTimeMs)) * 31) + this.pacePerKm.hashCode();
        }

        public String toString() {
            return "DistanceEstimate(label=" + this.label + ", baseTimeMs=" + this.baseTimeMs + ", adjustedTimeMs=" + this.adjustedTimeMs + ", pacePerKm=" + this.pacePerKm + ")";
        }

        public DistanceEstimate(String label, long j, long j2, String pacePerKm) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(pacePerKm, "pacePerKm");
            this.label = label;
            this.baseTimeMs = j;
            this.adjustedTimeMs = j2;
            this.pacePerKm = pacePerKm;
        }

        public final String getLabel() {
            return this.label;
        }

        public final long getBaseTimeMs() {
            return this.baseTimeMs;
        }

        public final long getAdjustedTimeMs() {
            return this.adjustedTimeMs;
        }

        public final String getPacePerKm() {
            return this.pacePerKm;
        }
    }

    /* compiled from: RacePredictor.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JC\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\bHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006 "}, d2 = {"Lcom/example/rungps/analytics/RacePredictor$Card;", "", "anchorSummary", "", "estimates", "", "Lcom/example/rungps/analytics/RacePredictor$DistanceEstimate;", "fatigueSlowdownPct", "", "legFatigueNote", "trendLine", "<init>", "(Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;)V", "getAnchorSummary", "()Ljava/lang/String;", "getEstimates", "()Ljava/util/List;", "getFatigueSlowdownPct", "()I", "getLegFatigueNote", "getTrendLine", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Card {
        public static final int $stable = 8;
        private final String anchorSummary;
        private final List<DistanceEstimate> estimates;
        private final int fatigueSlowdownPct;
        private final String legFatigueNote;
        private final String trendLine;

        public static /* synthetic */ Card copy$default(Card card, String str, List list, int i, String str2, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = card.anchorSummary;
            }
            if ((i2 & 2) != 0) {
                list = card.estimates;
            }
            List list2 = list;
            if ((i2 & 4) != 0) {
                i = card.fatigueSlowdownPct;
            }
            int i3 = i;
            if ((i2 & 8) != 0) {
                str2 = card.legFatigueNote;
            }
            String str4 = str2;
            if ((i2 & 16) != 0) {
                str3 = card.trendLine;
            }
            return card.copy(str, list2, i3, str4, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAnchorSummary() {
            return this.anchorSummary;
        }

        public final List<DistanceEstimate> component2() {
            return this.estimates;
        }

        /* renamed from: component3, reason: from getter */
        public final int getFatigueSlowdownPct() {
            return this.fatigueSlowdownPct;
        }

        /* renamed from: component4, reason: from getter */
        public final String getLegFatigueNote() {
            return this.legFatigueNote;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTrendLine() {
            return this.trendLine;
        }

        public final Card copy(String anchorSummary, List<DistanceEstimate> estimates, int fatigueSlowdownPct, String legFatigueNote, String trendLine) {
            Intrinsics.checkNotNullParameter(anchorSummary, "anchorSummary");
            Intrinsics.checkNotNullParameter(estimates, "estimates");
            Intrinsics.checkNotNullParameter(trendLine, "trendLine");
            return new Card(anchorSummary, estimates, fatigueSlowdownPct, legFatigueNote, trendLine);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Card)) {
                return false;
            }
            Card card = (Card) other;
            return Intrinsics.areEqual(this.anchorSummary, card.anchorSummary) && Intrinsics.areEqual(this.estimates, card.estimates) && this.fatigueSlowdownPct == card.fatigueSlowdownPct && Intrinsics.areEqual(this.legFatigueNote, card.legFatigueNote) && Intrinsics.areEqual(this.trendLine, card.trendLine);
        }

        public int hashCode() {
            int hashCode = ((((this.anchorSummary.hashCode() * 31) + this.estimates.hashCode()) * 31) + Integer.hashCode(this.fatigueSlowdownPct)) * 31;
            String str = this.legFatigueNote;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.trendLine.hashCode();
        }

        public String toString() {
            return "Card(anchorSummary=" + this.anchorSummary + ", estimates=" + this.estimates + ", fatigueSlowdownPct=" + this.fatigueSlowdownPct + ", legFatigueNote=" + this.legFatigueNote + ", trendLine=" + this.trendLine + ")";
        }

        public Card(String anchorSummary, List<DistanceEstimate> estimates, int i, String str, String trendLine) {
            Intrinsics.checkNotNullParameter(anchorSummary, "anchorSummary");
            Intrinsics.checkNotNullParameter(estimates, "estimates");
            Intrinsics.checkNotNullParameter(trendLine, "trendLine");
            this.anchorSummary = anchorSummary;
            this.estimates = estimates;
            this.fatigueSlowdownPct = i;
            this.legFatigueNote = str;
            this.trendLine = trendLine;
        }

        public final String getAnchorSummary() {
            return this.anchorSummary;
        }

        public final List<DistanceEstimate> getEstimates() {
            return this.estimates;
        }

        public final int getFatigueSlowdownPct() {
            return this.fatigueSlowdownPct;
        }

        public final String getLegFatigueNote() {
            return this.legFatigueNote;
        }

        public final String getTrendLine() {
            return this.trendLine;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object buildCard(Repository repository, List<RecoveryEventEntity> list, long j, Continuation<? super Card> continuation) {
        RacePredictor$buildCard$1 racePredictor$buildCard$1;
        int i;
        List<RecoveryEventEntity> list2;
        long j2;
        RaceTrendCalculator.Snapshot snapshot;
        DistanceEstimate distanceEstimate;
        RacePredictor racePredictor = this;
        if (continuation instanceof RacePredictor$buildCard$1) {
            racePredictor$buildCard$1 = (RacePredictor$buildCard$1) continuation;
            if ((racePredictor$buildCard$1.label & Integer.MIN_VALUE) != 0) {
                racePredictor$buildCard$1.label -= Integer.MIN_VALUE;
                Object obj = racePredictor$buildCard$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = racePredictor$buildCard$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    RaceTrendCalculator raceTrendCalculator = RaceTrendCalculator.INSTANCE;
                    racePredictor$buildCard$1.L$0 = racePredictor;
                    list2 = list;
                    racePredictor$buildCard$1.L$1 = list2;
                    j2 = j;
                    racePredictor$buildCard$1.J$0 = j2;
                    racePredictor$buildCard$1.label = 1;
                    obj = raceTrendCalculator.buildSnapshot(repository, racePredictor$buildCard$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j3 = racePredictor$buildCard$1.J$0;
                    List<RecoveryEventEntity> list3 = (List) racePredictor$buildCard$1.L$1;
                    RacePredictor racePredictor2 = (RacePredictor) racePredictor$buildCard$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    j2 = j3;
                    list2 = list3;
                    racePredictor = racePredictor2;
                }
                snapshot = (RaceTrendCalculator.Snapshot) obj;
                String str = null;
                if (!snapshot.getProjections().isEmpty() || snapshot.getAnchorDistanceKm() <= 0.0d) {
                    return null;
                }
                int legFatigueSlowdownPct = racePredictor.legFatigueSlowdownPct(list2, j2);
                double d = (legFatigueSlowdownPct / 100.0d) + 1.0d;
                List<RaceTrendCalculator.Projection> projections = snapshot.getProjections();
                ArrayList<RaceTrendCalculator.Projection> arrayList = new ArrayList();
                for (Object obj2 : projections) {
                    if (CollectionsKt.listOf((Object[]) new String[]{"5 km", "10 km", "Half marathon"}).contains(((RaceTrendCalculator.Projection) obj2).getLabel())) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (RaceTrendCalculator.Projection projection : arrayList) {
                    Long predictedMillis = projection.getPredictedMillis();
                    if (predictedMillis != null) {
                        long longValue = predictedMillis.longValue();
                        long j4 = (long) (longValue * d);
                        String label = projection.getLabel();
                        String formattedPacePerKm = projection.getFormattedPacePerKm();
                        if (formattedPacePerKm == null) {
                            formattedPacePerKm = "—";
                        }
                        distanceEstimate = new DistanceEstimate(label, longValue, j4, formattedPacePerKm);
                    } else {
                        distanceEstimate = null;
                    }
                    if (distanceEstimate != null) {
                        arrayList2.add(distanceEstimate);
                    }
                }
                ArrayList arrayList3 = arrayList2;
                if (legFatigueSlowdownPct >= 8) {
                    str = "Legs still recovering from gym — times adjusted +" + legFatigueSlowdownPct + "%.";
                } else if (legFatigueSlowdownPct > 0) {
                    str = "Light leg fatigue — +" + legFatigueSlowdownPct + "% on projections.";
                }
                return new Card(snapshot.getAnchorLabel(), arrayList3, legFatigueSlowdownPct, str, snapshot.getTrendSentence());
            }
        }
        racePredictor$buildCard$1 = new RacePredictor$buildCard$1(racePredictor, continuation);
        Object obj3 = racePredictor$buildCard$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = racePredictor$buildCard$1.label;
        if (i != 0) {
        }
        snapshot = (RaceTrendCalculator.Snapshot) obj3;
        String str2 = null;
        if (snapshot.getProjections().isEmpty()) {
        }
        return null;
    }

    public static /* synthetic */ Object buildCard$default(RacePredictor racePredictor, Repository repository, List list, long j, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            j = System.currentTimeMillis();
        }
        return racePredictor.buildCard(repository, list, j, continuation);
    }

    private final int legFatigueSlowdownPct(List<RecoveryEventEntity> events, long nowMs) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : events) {
            RecoveryEventEntity recoveryEventEntity = (RecoveryEventEntity) obj;
            if (recoveryEventEntity.getEndsAtMs() > nowMs && Intrinsics.areEqual(recoveryEventEntity.getKind(), "GYM")) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            return 0;
        }
        Iterator it = arrayList2.iterator();
        double d = 0.0d;
        while (it.hasNext()) {
            d += RangesKt.coerceAtLeast(((RecoveryEventEntity) it.next()).getLoadScore(), 0.0d);
        }
        return RangesKt.coerceIn(MathKt.roundToInt(d / 8.0d), 0, 15);
    }

    public final String formatTime(long ms) {
        return RaceTrendCalculator.INSTANCE.formatRaceTime(ms);
    }
}
