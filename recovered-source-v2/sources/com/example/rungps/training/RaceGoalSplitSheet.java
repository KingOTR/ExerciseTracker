package com.example.rungps.training;

import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.tracking.TrackingService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: RaceGoalSplitSheet.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010¨\u0006\u0012"}, d2 = {"Lcom/example/rungps/training/RaceGoalSplitSheet;", "", "<init>", "()V", "build", "", "Lcom/example/rungps/training/RaceGoalSplitSheet$KmSplitRow;", "distanceKm", "", TrackingService.EXTRA_GOAL_TIME_MS, "", "formatRaceTime", "", "ms", "formatPace", "secPerKm", "", "KmSplitRow", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RaceGoalSplitSheet {
    public static final int $stable = 0;
    public static final RaceGoalSplitSheet INSTANCE = new RaceGoalSplitSheet();

    private RaceGoalSplitSheet() {
    }

    /* compiled from: RaceGoalSplitSheet.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/example/rungps/training/RaceGoalSplitSheet$KmSplitRow;", "", "km", "", "segmentLabel", "", "paceSecPerKm", "cumulativeTimeMs", "", "cumulativeDisplay", "<init>", "(ILjava/lang/String;IJLjava/lang/String;)V", "getKm", "()I", "getSegmentLabel", "()Ljava/lang/String;", "getPaceSecPerKm", "getCumulativeTimeMs", "()J", "getCumulativeDisplay", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class KmSplitRow {
        public static final int $stable = 0;
        private final String cumulativeDisplay;
        private final long cumulativeTimeMs;
        private final int km;
        private final int paceSecPerKm;
        private final String segmentLabel;

        public static /* synthetic */ KmSplitRow copy$default(KmSplitRow kmSplitRow, int i, String str, int i2, long j, String str2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = kmSplitRow.km;
            }
            if ((i3 & 2) != 0) {
                str = kmSplitRow.segmentLabel;
            }
            String str3 = str;
            if ((i3 & 4) != 0) {
                i2 = kmSplitRow.paceSecPerKm;
            }
            int i4 = i2;
            if ((i3 & 8) != 0) {
                j = kmSplitRow.cumulativeTimeMs;
            }
            long j2 = j;
            if ((i3 & 16) != 0) {
                str2 = kmSplitRow.cumulativeDisplay;
            }
            return kmSplitRow.copy(i, str3, i4, j2, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getKm() {
            return this.km;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSegmentLabel() {
            return this.segmentLabel;
        }

        /* renamed from: component3, reason: from getter */
        public final int getPaceSecPerKm() {
            return this.paceSecPerKm;
        }

        /* renamed from: component4, reason: from getter */
        public final long getCumulativeTimeMs() {
            return this.cumulativeTimeMs;
        }

        /* renamed from: component5, reason: from getter */
        public final String getCumulativeDisplay() {
            return this.cumulativeDisplay;
        }

        public final KmSplitRow copy(int km, String segmentLabel, int paceSecPerKm, long cumulativeTimeMs, String cumulativeDisplay) {
            Intrinsics.checkNotNullParameter(segmentLabel, "segmentLabel");
            Intrinsics.checkNotNullParameter(cumulativeDisplay, "cumulativeDisplay");
            return new KmSplitRow(km, segmentLabel, paceSecPerKm, cumulativeTimeMs, cumulativeDisplay);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof KmSplitRow)) {
                return false;
            }
            KmSplitRow kmSplitRow = (KmSplitRow) other;
            return this.km == kmSplitRow.km && Intrinsics.areEqual(this.segmentLabel, kmSplitRow.segmentLabel) && this.paceSecPerKm == kmSplitRow.paceSecPerKm && this.cumulativeTimeMs == kmSplitRow.cumulativeTimeMs && Intrinsics.areEqual(this.cumulativeDisplay, kmSplitRow.cumulativeDisplay);
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.km) * 31) + this.segmentLabel.hashCode()) * 31) + Integer.hashCode(this.paceSecPerKm)) * 31) + Long.hashCode(this.cumulativeTimeMs)) * 31) + this.cumulativeDisplay.hashCode();
        }

        public String toString() {
            return "KmSplitRow(km=" + this.km + ", segmentLabel=" + this.segmentLabel + ", paceSecPerKm=" + this.paceSecPerKm + ", cumulativeTimeMs=" + this.cumulativeTimeMs + ", cumulativeDisplay=" + this.cumulativeDisplay + ")";
        }

        public KmSplitRow(int i, String segmentLabel, int i2, long j, String cumulativeDisplay) {
            Intrinsics.checkNotNullParameter(segmentLabel, "segmentLabel");
            Intrinsics.checkNotNullParameter(cumulativeDisplay, "cumulativeDisplay");
            this.km = i;
            this.segmentLabel = segmentLabel;
            this.paceSecPerKm = i2;
            this.cumulativeTimeMs = j;
            this.cumulativeDisplay = cumulativeDisplay;
        }

        public final int getKm() {
            return this.km;
        }

        public final String getSegmentLabel() {
            return this.segmentLabel;
        }

        public final int getPaceSecPerKm() {
            return this.paceSecPerKm;
        }

        public final long getCumulativeTimeMs() {
            return this.cumulativeTimeMs;
        }

        public final String getCumulativeDisplay() {
            return this.cumulativeDisplay;
        }
    }

    public final List<KmSplitRow> build(double distanceKm, long goalTimeMs) {
        String str;
        if (distanceKm > 0.0d) {
            long j = 0;
            if (goalTimeMs > 0) {
                int i = 1;
                int coerceAtLeast = RangesKt.coerceAtLeast((int) Math.ceil(distanceKm), 1);
                double coerceAtLeast2 = RangesKt.coerceAtLeast((goalTimeMs / 1000.0d) / distanceKm, 1.0d);
                ArrayList arrayList = new ArrayList();
                if (1 <= coerceAtLeast) {
                    int i2 = 1;
                    while (true) {
                        int coerceIn = RangesKt.coerceIn(MathKt.roundToInt((1.02d - (((i2 - 0.5d) / coerceAtLeast) * 0.04d)) * coerceAtLeast2), 180, 900);
                        double coerceAtLeast3 = i2 == coerceAtLeast ? RangesKt.coerceAtLeast(distanceKm - (coerceAtLeast - 1), 0.1d) : 1.0d;
                        j += MathKt.roundToInt(coerceIn * coerceAtLeast3 * 1000.0d);
                        if (i2 == coerceAtLeast && coerceAtLeast3 < 0.999d) {
                            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                            str = String.format("%.2f km", Arrays.copyOf(new Object[]{Double.valueOf(distanceKm)}, i));
                            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                        } else {
                            str = "Km " + i2;
                        }
                        int i3 = i2;
                        arrayList.add(new KmSplitRow(i2, str, coerceIn, j, formatRaceTime(j)));
                        if (i3 == coerceAtLeast) {
                            break;
                        }
                        i2 = i3 + 1;
                        i = 1;
                    }
                }
                return arrayList;
            }
        }
        return CollectionsKt.emptyList();
    }

    public final String formatRaceTime(long ms) {
        String format;
        int coerceAtLeast = RangesKt.coerceAtLeast(MathKt.roundToInt(ms / 1000.0d), 0);
        int i = coerceAtLeast / 3600;
        int i2 = (coerceAtLeast % 3600) / 60;
        int i3 = coerceAtLeast % 60;
        if (i > 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            format = String.format("%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, 3));
        } else {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            format = String.format("%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, 2));
        }
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public final String formatPace(int secPerKm) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%d:%02d/km", Arrays.copyOf(new Object[]{Integer.valueOf(secPerKm / 60), Integer.valueOf(secPerKm % 60)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
