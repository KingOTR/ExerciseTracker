package com.example.rungps.gear;

import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.data.GearEntity;
import com.example.rungps.gear.GearAdvice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: GearAdvice.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0014\u0015\u0016B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ.\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u0012¨\u0006\u0017"}, d2 = {"Lcom/example/rungps/gear/GearAdvice;", "", "<init>", "()V", "thresholds", "Lcom/example/rungps/gear/GearAdvice$Thresholds;", "gearType", "", "advise", "Lcom/example/rungps/gear/GearAdvice$Advice;", "gear", "Lcom/example/rungps/data/GearEntity;", "totalKm", "", "adviseAll", "", "gears", "kmByGearId", "", "", "Urgency", "Thresholds", "Advice", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GearAdvice {
    public static final int $stable = 0;
    public static final GearAdvice INSTANCE = new GearAdvice();

    /* compiled from: GearAdvice.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Urgency.values().length];
            try {
                iArr[Urgency.REPLACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Urgency.SOON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Urgency.GOOD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private GearAdvice() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GearAdvice.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/example/rungps/gear/GearAdvice$Urgency;", "", "<init>", "(Ljava/lang/String;I)V", "GOOD", "SOON", "REPLACE", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Urgency {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Urgency[] $VALUES;
        public static final Urgency GOOD = new Urgency("GOOD", 0);
        public static final Urgency SOON = new Urgency("SOON", 1);
        public static final Urgency REPLACE = new Urgency("REPLACE", 2);

        private static final /* synthetic */ Urgency[] $values() {
            return new Urgency[]{GOOD, SOON, REPLACE};
        }

        public static EnumEntries<Urgency> getEntries() {
            return $ENTRIES;
        }

        static {
            Urgency[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private Urgency(String str, int i) {
        }

        public static Urgency valueOf(String str) {
            return (Urgency) Enum.valueOf(Urgency.class, str);
        }

        public static Urgency[] values() {
            return (Urgency[]) $VALUES.clone();
        }
    }

    /* compiled from: GearAdvice.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/example/rungps/gear/GearAdvice$Thresholds;", "", "warnKm", "", "replaceKm", "<init>", "(DD)V", "getWarnKm", "()D", "getReplaceKm", "component1", "component2", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Thresholds {
        public static final int $stable = 0;
        private final double replaceKm;
        private final double warnKm;

        public static /* synthetic */ Thresholds copy$default(Thresholds thresholds, double d, double d2, int i, Object obj) {
            if ((i & 1) != 0) {
                d = thresholds.warnKm;
            }
            if ((i & 2) != 0) {
                d2 = thresholds.replaceKm;
            }
            return thresholds.copy(d, d2);
        }

        /* renamed from: component1, reason: from getter */
        public final double getWarnKm() {
            return this.warnKm;
        }

        /* renamed from: component2, reason: from getter */
        public final double getReplaceKm() {
            return this.replaceKm;
        }

        public final Thresholds copy(double warnKm, double replaceKm) {
            return new Thresholds(warnKm, replaceKm);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Thresholds)) {
                return false;
            }
            Thresholds thresholds = (Thresholds) other;
            return Double.compare(this.warnKm, thresholds.warnKm) == 0 && Double.compare(this.replaceKm, thresholds.replaceKm) == 0;
        }

        public int hashCode() {
            return (Double.hashCode(this.warnKm) * 31) + Double.hashCode(this.replaceKm);
        }

        public String toString() {
            return "Thresholds(warnKm=" + this.warnKm + ", replaceKm=" + this.replaceKm + ")";
        }

        public Thresholds(double d, double d2) {
            this.warnKm = d;
            this.replaceKm = d2;
        }

        public final double getWarnKm() {
            return this.warnKm;
        }

        public final double getReplaceKm() {
            return this.replaceKm;
        }
    }

    /* compiled from: GearAdvice.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\rHÆ\u0003JO\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\rHÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006)"}, d2 = {"Lcom/example/rungps/gear/GearAdvice$Advice;", "", "gearId", "", "gearName", "", "gearType", "totalKm", "", "urgency", "Lcom/example/rungps/gear/GearAdvice$Urgency;", "message", "percentOfLife", "", "<init>", "(JLjava/lang/String;Ljava/lang/String;DLcom/example/rungps/gear/GearAdvice$Urgency;Ljava/lang/String;I)V", "getGearId", "()J", "getGearName", "()Ljava/lang/String;", "getGearType", "getTotalKm", "()D", "getUrgency", "()Lcom/example/rungps/gear/GearAdvice$Urgency;", "getMessage", "getPercentOfLife", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Advice {
        public static final int $stable = 0;
        private final long gearId;
        private final String gearName;
        private final String gearType;
        private final String message;
        private final int percentOfLife;
        private final double totalKm;
        private final Urgency urgency;

        /* renamed from: component1, reason: from getter */
        public final long getGearId() {
            return this.gearId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getGearName() {
            return this.gearName;
        }

        /* renamed from: component3, reason: from getter */
        public final String getGearType() {
            return this.gearType;
        }

        /* renamed from: component4, reason: from getter */
        public final double getTotalKm() {
            return this.totalKm;
        }

        /* renamed from: component5, reason: from getter */
        public final Urgency getUrgency() {
            return this.urgency;
        }

        /* renamed from: component6, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component7, reason: from getter */
        public final int getPercentOfLife() {
            return this.percentOfLife;
        }

        public final Advice copy(long gearId, String gearName, String gearType, double totalKm, Urgency urgency, String message, int percentOfLife) {
            Intrinsics.checkNotNullParameter(gearName, "gearName");
            Intrinsics.checkNotNullParameter(gearType, "gearType");
            Intrinsics.checkNotNullParameter(urgency, "urgency");
            Intrinsics.checkNotNullParameter(message, "message");
            return new Advice(gearId, gearName, gearType, totalKm, urgency, message, percentOfLife);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Advice)) {
                return false;
            }
            Advice advice = (Advice) other;
            return this.gearId == advice.gearId && Intrinsics.areEqual(this.gearName, advice.gearName) && Intrinsics.areEqual(this.gearType, advice.gearType) && Double.compare(this.totalKm, advice.totalKm) == 0 && this.urgency == advice.urgency && Intrinsics.areEqual(this.message, advice.message) && this.percentOfLife == advice.percentOfLife;
        }

        public int hashCode() {
            return (((((((((((Long.hashCode(this.gearId) * 31) + this.gearName.hashCode()) * 31) + this.gearType.hashCode()) * 31) + Double.hashCode(this.totalKm)) * 31) + this.urgency.hashCode()) * 31) + this.message.hashCode()) * 31) + Integer.hashCode(this.percentOfLife);
        }

        public String toString() {
            return "Advice(gearId=" + this.gearId + ", gearName=" + this.gearName + ", gearType=" + this.gearType + ", totalKm=" + this.totalKm + ", urgency=" + this.urgency + ", message=" + this.message + ", percentOfLife=" + this.percentOfLife + ")";
        }

        public Advice(long j, String gearName, String gearType, double d, Urgency urgency, String message, int i) {
            Intrinsics.checkNotNullParameter(gearName, "gearName");
            Intrinsics.checkNotNullParameter(gearType, "gearType");
            Intrinsics.checkNotNullParameter(urgency, "urgency");
            Intrinsics.checkNotNullParameter(message, "message");
            this.gearId = j;
            this.gearName = gearName;
            this.gearType = gearType;
            this.totalKm = d;
            this.urgency = urgency;
            this.message = message;
            this.percentOfLife = i;
        }

        public final long getGearId() {
            return this.gearId;
        }

        public final String getGearName() {
            return this.gearName;
        }

        public final String getGearType() {
            return this.gearType;
        }

        public final double getTotalKm() {
            return this.totalKm;
        }

        public final Urgency getUrgency() {
            return this.urgency;
        }

        public final String getMessage() {
            return this.message;
        }

        public final int getPercentOfLife() {
            return this.percentOfLife;
        }
    }

    public final Thresholds thresholds(String gearType) {
        Intrinsics.checkNotNullParameter(gearType, "gearType");
        if (Intrinsics.areEqual(gearType, GearTypes.RUNNING_SHOES)) {
            return new Thresholds(500.0d, 800.0d);
        }
        if (Intrinsics.areEqual(gearType, GearTypes.COMPONENT_CHAIN)) {
            return new Thresholds(3000.0d, 4000.0d);
        }
        if (Intrinsics.areEqual(gearType, GearTypes.COMPONENT_TIRE)) {
            return new Thresholds(3000.0d, 5000.0d);
        }
        if (Intrinsics.areEqual(gearType, GearTypes.COMPONENT_BRAKE_PAD)) {
            return new Thresholds(2000.0d, 4000.0d);
        }
        if (Intrinsics.areEqual(gearType, GearTypes.COMPONENT_CASSETTE)) {
            return new Thresholds(6000.0d, 10000.0d);
        }
        if (GearTypes.INSTANCE.getBIKE_TYPES().contains(gearType)) {
            return new Thresholds(15000.0d, 30000.0d);
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Advice advise(GearEntity gear, double totalKm) {
        Thresholds thresholds;
        int i;
        String str;
        Intrinsics.checkNotNullParameter(gear, "gear");
        if (gear.isRetired() || (thresholds = thresholds(gear.getGearType())) == null) {
            return null;
        }
        int coerceAtMost = RangesKt.coerceAtMost(MathKt.roundToInt((totalKm / thresholds.getReplaceKm()) * 100), 999);
        Urgency urgency = totalKm >= thresholds.getReplaceKm() ? Urgency.REPLACE : totalKm >= thresholds.getWarnKm() ? Urgency.SOON : Urgency.GOOD;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%.0f", Arrays.copyOf(new Object[]{Double.valueOf(totalKm)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        String gearType = gear.getGearType();
        switch (gearType.hashCode()) {
            case -780838518:
                if (gearType.equals(GearTypes.COMPONENT_TIRE)) {
                    int i2 = WhenMappings.$EnumSwitchMapping$0[urgency.ordinal()];
                    if (i2 == 1) {
                        str = "Tires at " + format + " km — inspect tread and sidewalls; replace if worn.";
                    } else if (i2 == 2) {
                        str = "Tires approaching " + format + " km — check tread depth and any cuts.";
                    } else {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "Tires at " + format + " km — within typical 3,000–5,000 km range.";
                    }
                    return new Advice(gear.getId(), gear.getName(), gear.getGearType(), totalKm, urgency, str, coerceAtMost);
                }
                i = WhenMappings.$EnumSwitchMapping$0[urgency.ordinal()];
                if (i != 1) {
                    str = gear.getName() + " at " + format + " km — review for service or replacement.";
                } else if (i == 2) {
                    str = gear.getName() + " at " + format + " km — approaching typical service interval.";
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = gear.getName() + " at " + format + " km.";
                }
                return new Advice(gear.getId(), gear.getName(), gear.getGearType(), totalKm, urgency, str, coerceAtMost);
            case 13409320:
                if (gearType.equals(GearTypes.RUNNING_SHOES)) {
                    int i3 = WhenMappings.$EnumSwitchMapping$0[urgency.ordinal()];
                    if (i3 == 1) {
                        str = "Your " + gear.getName() + " have " + format + " km — cushioning is likely worn. Consider replacing soon.";
                    } else if (i3 == 2) {
                        str = "Your " + gear.getName() + " have " + format + " km — consider replacing within the next few weeks.";
                    } else {
                        if (i3 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "Your " + gear.getName() + " are at " + format + " km — on track for the 500–800 km range.";
                    }
                    return new Advice(gear.getId(), gear.getName(), gear.getGearType(), totalKm, urgency, str, coerceAtMost);
                }
                i = WhenMappings.$EnumSwitchMapping$0[urgency.ordinal()];
                if (i != 1) {
                }
                return new Advice(gear.getId(), gear.getName(), gear.getGearType(), totalKm, urgency, str, coerceAtMost);
            case 1548063935:
                if (gearType.equals(GearTypes.COMPONENT_CHAIN)) {
                    int i4 = WhenMappings.$EnumSwitchMapping$0[urgency.ordinal()];
                    if (i4 == 1) {
                        str = "Chain on " + gear.getName() + " is at " + format + " km — replace soon to protect your cassette.";
                    } else if (i4 == 2) {
                        str = "Chain at " + format + " km — check stretch with a chain checker; plan replacement around 3,000–4,000 km.";
                    } else {
                        if (i4 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "Chain at " + format + " km — keep checking monthly.";
                    }
                    return new Advice(gear.getId(), gear.getName(), gear.getGearType(), totalKm, urgency, str, coerceAtMost);
                }
                i = WhenMappings.$EnumSwitchMapping$0[urgency.ordinal()];
                if (i != 1) {
                }
                return new Advice(gear.getId(), gear.getName(), gear.getGearType(), totalKm, urgency, str, coerceAtMost);
            case 1602072669:
                if (gearType.equals(GearTypes.COMPONENT_BRAKE_PAD)) {
                    int i5 = WhenMappings.$EnumSwitchMapping$0[urgency.ordinal()];
                    if (i5 == 1) {
                        str = "Brake pads at " + format + " km — inspect thickness; replace if under 1 mm.";
                    } else if (i5 == 2) {
                        str = "Brake pads at " + format + " km — monthly visual check recommended.";
                    } else {
                        if (i5 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "Brake pads at " + format + " km — inspect grooves when convenient.";
                    }
                    return new Advice(gear.getId(), gear.getName(), gear.getGearType(), totalKm, urgency, str, coerceAtMost);
                }
                i = WhenMappings.$EnumSwitchMapping$0[urgency.ordinal()];
                if (i != 1) {
                }
                return new Advice(gear.getId(), gear.getName(), gear.getGearType(), totalKm, urgency, str, coerceAtMost);
            case 1915647168:
                if (gearType.equals(GearTypes.COMPONENT_CASSETTE)) {
                    int i6 = WhenMappings.$EnumSwitchMapping$0[urgency.ordinal()];
                    if (i6 == 1) {
                        str = "Cassette at " + format + " km — check for skipping with a new chain.";
                    } else if (i6 == 2) {
                        str = "Cassette at " + format + " km — watch for shark-tooth wear when you replace the chain.";
                    } else {
                        if (i6 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "Cassette at " + format + " km — healthy with timely chain swaps.";
                    }
                    return new Advice(gear.getId(), gear.getName(), gear.getGearType(), totalKm, urgency, str, coerceAtMost);
                }
                i = WhenMappings.$EnumSwitchMapping$0[urgency.ordinal()];
                if (i != 1) {
                }
                return new Advice(gear.getId(), gear.getName(), gear.getGearType(), totalKm, urgency, str, coerceAtMost);
            default:
                i = WhenMappings.$EnumSwitchMapping$0[urgency.ordinal()];
                if (i != 1) {
                }
                return new Advice(gear.getId(), gear.getName(), gear.getGearType(), totalKm, urgency, str, coerceAtMost);
        }
    }

    public final List<Advice> adviseAll(List<GearEntity> gears, Map<Long, Double> kmByGearId) {
        Intrinsics.checkNotNullParameter(gears, "gears");
        Intrinsics.checkNotNullParameter(kmByGearId, "kmByGearId");
        ArrayList arrayList = new ArrayList();
        for (GearEntity gearEntity : gears) {
            GearAdvice gearAdvice = INSTANCE;
            Double d = kmByGearId.get(Long.valueOf(gearEntity.getId()));
            Advice advise = gearAdvice.advise(gearEntity, d != null ? d.doubleValue() : gearEntity.getStartingOdometerKm());
            if (advise != null) {
                arrayList.add(advise);
            }
        }
        final Comparator comparator = new Comparator() { // from class: com.example.rungps.gear.GearAdvice$adviseAll$$inlined$compareByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(((GearAdvice.Advice) t2).getUrgency().ordinal()), Integer.valueOf(((GearAdvice.Advice) t).getUrgency().ordinal()));
            }
        };
        return CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.example.rungps.gear.GearAdvice$adviseAll$$inlined$thenByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int compare = comparator.compare(t, t2);
                return compare != 0 ? compare : ComparisonsKt.compareValues(Integer.valueOf(((GearAdvice.Advice) t2).getPercentOfLife()), Integer.valueOf(((GearAdvice.Advice) t).getPercentOfLife()));
            }
        });
    }
}
