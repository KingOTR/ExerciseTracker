package com.example.rungps.recovery;

import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.data.UserProfile;
import com.example.rungps.nfc.GymNfcConfig;
import com.google.android.gms.common.Scopes;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: RecoveryModel.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002()B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J*\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0002J\"\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\"\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007JE\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0019J]\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010#\u001a\u00020 2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010$J\u000e\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020\u0010J\f\u0010'\u001a\u00020\u0005*\u00020\u0005H\u0002¨\u0006*"}, d2 = {"Lcom/example/rungps/recovery/RecoveryModel;", "", "<init>", "()V", "demographicsRecoveryMultiplier", "", "demographics", "Lcom/example/rungps/recovery/RecoveryModel$RecoveryDemographics;", "applyDemographics", "Lcom/example/rungps/recovery/RecoveryModel$RecoveryEstimate;", "base", "minHours", "maxHours", "estimateRun", "distanceM", "durationMs", "", "estimateBike", "estimateGym", "totalTonnage", "maxWeight", "interSetRestMin", "avgRpeBorg", "(DDJLcom/example/rungps/recovery/RecoveryModel$RecoveryDemographics;DLjava/lang/Double;)Lcom/example/rungps/recovery/RecoveryModel$RecoveryEstimate;", "rpeLoadMultiplier", "(Ljava/lang/Double;)D", "estimateSoccer", "warmupMin", "", "playMin", "intensity", "kind", "", "hrAvgBpm", "hrMaxBpm", "sportLabel", "(IIILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/example/rungps/recovery/RecoveryModel$RecoveryDemographics;)Lcom/example/rungps/recovery/RecoveryModel$RecoveryEstimate;", "formatRemaining", "ms", "round1", "RecoveryEstimate", "RecoveryDemographics", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RecoveryModel {
    public static final int $stable = 0;
    public static final RecoveryModel INSTANCE = new RecoveryModel();

    private RecoveryModel() {
    }

    /* compiled from: RecoveryModel.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/example/rungps/recovery/RecoveryModel$RecoveryEstimate;", "", "hours", "", "loadScore", "notes", "", "<init>", "(DDLjava/lang/String;)V", "getHours", "()D", "getLoadScore", "getNotes", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RecoveryEstimate {
        public static final int $stable = 0;
        private final double hours;
        private final double loadScore;
        private final String notes;

        public static /* synthetic */ RecoveryEstimate copy$default(RecoveryEstimate recoveryEstimate, double d, double d2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                d = recoveryEstimate.hours;
            }
            double d3 = d;
            if ((i & 2) != 0) {
                d2 = recoveryEstimate.loadScore;
            }
            double d4 = d2;
            if ((i & 4) != 0) {
                str = recoveryEstimate.notes;
            }
            return recoveryEstimate.copy(d3, d4, str);
        }

        /* renamed from: component1, reason: from getter */
        public final double getHours() {
            return this.hours;
        }

        /* renamed from: component2, reason: from getter */
        public final double getLoadScore() {
            return this.loadScore;
        }

        /* renamed from: component3, reason: from getter */
        public final String getNotes() {
            return this.notes;
        }

        public final RecoveryEstimate copy(double hours, double loadScore, String notes) {
            Intrinsics.checkNotNullParameter(notes, "notes");
            return new RecoveryEstimate(hours, loadScore, notes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RecoveryEstimate)) {
                return false;
            }
            RecoveryEstimate recoveryEstimate = (RecoveryEstimate) other;
            return Double.compare(this.hours, recoveryEstimate.hours) == 0 && Double.compare(this.loadScore, recoveryEstimate.loadScore) == 0 && Intrinsics.areEqual(this.notes, recoveryEstimate.notes);
        }

        public int hashCode() {
            return (((Double.hashCode(this.hours) * 31) + Double.hashCode(this.loadScore)) * 31) + this.notes.hashCode();
        }

        public String toString() {
            return "RecoveryEstimate(hours=" + this.hours + ", loadScore=" + this.loadScore + ", notes=" + this.notes + ")";
        }

        public RecoveryEstimate(double d, double d2, String notes) {
            Intrinsics.checkNotNullParameter(notes, "notes");
            this.hours = d;
            this.loadScore = d2;
            this.notes = notes;
        }

        public final double getHours() {
            return this.hours;
        }

        public final double getLoadScore() {
            return this.loadScore;
        }

        public final String getNotes() {
            return this.notes;
        }
    }

    /* compiled from: RecoveryModel.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u0006J\u0006\u0010\u000f\u001a\u00020\u0010J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/example/rungps/recovery/RecoveryModel$RecoveryDemographics;", "", "ageYears", "", "heightCm", "weightKg", "", "<init>", "(IID)V", "getAgeYears", "()I", "getHeightCm", "getWeightKg", "()D", "bmi", "isComplete", "", "component1", "component2", "component3", "copy", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "", "Companion", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RecoveryDemographics {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final int ageYears;
        private final int heightCm;
        private final double weightKg;

        public static /* synthetic */ RecoveryDemographics copy$default(RecoveryDemographics recoveryDemographics, int i, int i2, double d, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = recoveryDemographics.ageYears;
            }
            if ((i3 & 2) != 0) {
                i2 = recoveryDemographics.heightCm;
            }
            if ((i3 & 4) != 0) {
                d = recoveryDemographics.weightKg;
            }
            return recoveryDemographics.copy(i, i2, d);
        }

        /* renamed from: component1, reason: from getter */
        public final int getAgeYears() {
            return this.ageYears;
        }

        /* renamed from: component2, reason: from getter */
        public final int getHeightCm() {
            return this.heightCm;
        }

        /* renamed from: component3, reason: from getter */
        public final double getWeightKg() {
            return this.weightKg;
        }

        public final RecoveryDemographics copy(int ageYears, int heightCm, double weightKg) {
            return new RecoveryDemographics(ageYears, heightCm, weightKg);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RecoveryDemographics)) {
                return false;
            }
            RecoveryDemographics recoveryDemographics = (RecoveryDemographics) other;
            return this.ageYears == recoveryDemographics.ageYears && this.heightCm == recoveryDemographics.heightCm && Double.compare(this.weightKg, recoveryDemographics.weightKg) == 0;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.ageYears) * 31) + Integer.hashCode(this.heightCm)) * 31) + Double.hashCode(this.weightKg);
        }

        public String toString() {
            return "RecoveryDemographics(ageYears=" + this.ageYears + ", heightCm=" + this.heightCm + ", weightKg=" + this.weightKg + ")";
        }

        public RecoveryDemographics(int i, int i2, double d) {
            this.ageYears = i;
            this.heightCm = i2;
            this.weightKg = d;
        }

        public final int getAgeYears() {
            return this.ageYears;
        }

        public final int getHeightCm() {
            return this.heightCm;
        }

        public final double getWeightKg() {
            return this.weightKg;
        }

        public final double bmi() {
            double d = this.heightCm / 100.0d;
            return this.weightKg / (d * d);
        }

        public final boolean isComplete() {
            int i;
            int i2 = this.ageYears;
            if (10 <= i2 && i2 < 121 && 100 <= (i = this.heightCm) && i < 251) {
                double d = this.weightKg;
                if (20.0d <= d && d <= 400.0d) {
                    return true;
                }
            }
            return false;
        }

        /* compiled from: RecoveryModel.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/example/rungps/recovery/RecoveryModel$RecoveryDemographics$Companion;", "", "<init>", "()V", "fromUserProfile", "Lcom/example/rungps/recovery/RecoveryModel$RecoveryDemographics;", Scopes.PROFILE, "Lcom/example/rungps/data/UserProfile;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final RecoveryDemographics fromUserProfile(UserProfile profile) {
                Integer resolvedAgeYears$default;
                Intrinsics.checkNotNullParameter(profile, "profile");
                if (!profile.getHasCoreStats() || (resolvedAgeYears$default = UserProfile.resolvedAgeYears$default(profile, null, 1, null)) == null) {
                    return null;
                }
                int intValue = resolvedAgeYears$default.intValue();
                Integer heightCm = profile.getHeightCm();
                if (heightCm == null) {
                    return null;
                }
                int intValue2 = heightCm.intValue();
                Double weightKg = profile.getWeightKg();
                if (weightKg == null) {
                    return null;
                }
                RecoveryDemographics recoveryDemographics = new RecoveryDemographics(intValue, intValue2, weightKg.doubleValue());
                if (recoveryDemographics.isComplete()) {
                    return recoveryDemographics;
                }
                return null;
            }
        }
    }

    public final double demographicsRecoveryMultiplier(RecoveryDemographics demographics) {
        double d = 1.0d;
        if (demographics == null || !demographics.isComplete()) {
            return 1.0d;
        }
        double coerceIn = (RangesKt.coerceIn(demographics.getAgeYears() - 30.0d, -8.0d, 50.0d) * 0.007d) + 1.0d;
        double bmi = demographics.bmi();
        if (bmi < 17.5d) {
            d = 1.05d;
        } else if (bmi < 18.5d) {
            d = 1.03d;
        } else if (bmi > 24.9d) {
            d = bmi <= 29.9d ? 1.06d : 1.12d;
        }
        return RangesKt.coerceIn(coerceIn * d, 0.88d, 1.48d);
    }

    private final RecoveryEstimate applyDemographics(RecoveryEstimate base, RecoveryDemographics demographics, double minHours, double maxHours) {
        double demographicsRecoveryMultiplier = demographicsRecoveryMultiplier(demographics);
        if (demographicsRecoveryMultiplier == 1.0d) {
            return RecoveryEstimate.copy$default(base, 0.0d, 0.0d, StringsKt.trim((CharSequence) base.getNotes()).toString(), 3, null);
        }
        double coerceIn = RangesKt.coerceIn(base.getHours() * demographicsRecoveryMultiplier, minHours, maxHours);
        double loadScore = base.getLoadScore() * demographicsRecoveryMultiplier;
        if (demographics == null) {
            return base;
        }
        StringBuilder sb = new StringBuilder();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, " · body ×%.2f (age %d · BMI %.1f)", Arrays.copyOf(new Object[]{Double.valueOf(demographicsRecoveryMultiplier), Integer.valueOf(demographics.getAgeYears()), Double.valueOf(demographics.bmi())}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        sb.append(format);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return new RecoveryEstimate(coerceIn, loadScore, StringsKt.trim((CharSequence) base.getNotes()).toString() + sb2);
    }

    public static /* synthetic */ RecoveryEstimate estimateRun$default(RecoveryModel recoveryModel, double d, long j, RecoveryDemographics recoveryDemographics, int i, Object obj) {
        if ((i & 4) != 0) {
            recoveryDemographics = null;
        }
        return recoveryModel.estimateRun(d, j, recoveryDemographics);
    }

    public final RecoveryEstimate estimateRun(double distanceM, long durationMs, RecoveryDemographics demographics) {
        double d;
        double coerceAtLeast = RangesKt.coerceAtLeast(distanceM / 1000.0d, 0.0d);
        double coerceAtLeast2 = RangesKt.coerceAtLeast(durationMs / 60000.0d, 0.0d);
        if (coerceAtLeast <= 0.0d || coerceAtLeast2 <= 0.0d) {
            return new RecoveryEstimate(0.0d, 0.0d, "No load");
        }
        double d2 = coerceAtLeast > 0.0d ? coerceAtLeast2 / coerceAtLeast : 0.0d;
        if (d2 > 0.0d) {
            if (d2 <= 4.5d) {
                d = 1.4d;
            } else if (d2 <= 5.5d) {
                d = 1.2d;
            } else if (d2 > 7.0d) {
                d = d2 <= 9.0d ? 0.8d : 0.6d;
            }
            double sqrt = d * Math.sqrt(coerceAtLeast2) * coerceAtLeast;
            return applyDemographics(new RecoveryEstimate(RangesKt.coerceIn((coerceAtLeast >= 0.35d || durationMs < 90000) ? 0.9d : (Math.log(1.0d + sqrt) * 0.7d) + 1.6d + (coerceAtLeast * 0.11d), 0.75d, 60.0d), sqrt, "Run load≈" + round1(sqrt) + " (km×√min×pace)"), demographics, 0.65d, 72.0d);
        }
        d = 1.0d;
        double sqrt2 = d * Math.sqrt(coerceAtLeast2) * coerceAtLeast;
        return applyDemographics(new RecoveryEstimate(RangesKt.coerceIn((coerceAtLeast >= 0.35d || durationMs < 90000) ? 0.9d : (Math.log(1.0d + sqrt2) * 0.7d) + 1.6d + (coerceAtLeast * 0.11d), 0.75d, 60.0d), sqrt2, "Run load≈" + round1(sqrt2) + " (km×√min×pace)"), demographics, 0.65d, 72.0d);
    }

    public static /* synthetic */ RecoveryEstimate estimateBike$default(RecoveryModel recoveryModel, double d, long j, RecoveryDemographics recoveryDemographics, int i, Object obj) {
        if ((i & 4) != 0) {
            recoveryDemographics = null;
        }
        return recoveryModel.estimateBike(d, j, recoveryDemographics);
    }

    public final RecoveryEstimate estimateBike(double distanceM, long durationMs, RecoveryDemographics demographics) {
        double d;
        double coerceAtLeast = RangesKt.coerceAtLeast(distanceM / 1000.0d, 0.0d);
        double coerceAtLeast2 = RangesKt.coerceAtLeast(durationMs / 60000.0d, 0.0d);
        if (coerceAtLeast <= 0.0d || coerceAtLeast2 <= 0.0d) {
            return new RecoveryEstimate(0.0d, 0.0d, "No load");
        }
        double d2 = coerceAtLeast2 > 0.0d ? coerceAtLeast / (coerceAtLeast2 / 60.0d) : 0.0d;
        if (d2 > 0.0d) {
            if (d2 >= 28.0d) {
                d = 1.35d;
            } else if (d2 >= 22.0d) {
                d = 1.2d;
            } else if (d2 < 16.0d) {
                d = 0.85d;
            }
            double sqrt = d * Math.sqrt(coerceAtLeast2) * coerceAtLeast;
            return applyDemographics(new RecoveryEstimate(RangesKt.coerceIn((coerceAtLeast >= 0.5d || durationMs < GymNfcConfig.DEFAULT_SAVER_POLL_MS) ? 0.75d : (Math.log(1.0d + sqrt) * 0.65d) + 1.25d + (coerceAtLeast * 0.08d), 0.6d, 54.0d), sqrt, "Ride load≈" + round1(sqrt) + " (km×√min×speed)"), demographics, 0.55d, 66.0d);
        }
        d = 1.0d;
        double sqrt2 = d * Math.sqrt(coerceAtLeast2) * coerceAtLeast;
        return applyDemographics(new RecoveryEstimate(RangesKt.coerceIn((coerceAtLeast >= 0.5d || durationMs < GymNfcConfig.DEFAULT_SAVER_POLL_MS) ? 0.75d : (Math.log(1.0d + sqrt2) * 0.65d) + 1.25d + (coerceAtLeast * 0.08d), 0.6d, 54.0d), sqrt2, "Ride load≈" + round1(sqrt2) + " (km×√min×speed)"), demographics, 0.55d, 66.0d);
    }

    public final RecoveryEstimate estimateGym(double totalTonnage, double maxWeight, long durationMs, RecoveryDemographics demographics, double interSetRestMin, Double avgRpeBorg) {
        String str;
        double coerceAtLeast = RangesKt.coerceAtLeast(durationMs / 60000.0d, 0.0d);
        double coerceAtLeast2 = RangesKt.coerceAtLeast(totalTonnage, 0.0d);
        double coerceAtLeast3 = RangesKt.coerceAtLeast(maxWeight, 0.0d);
        double coerceAtLeast4 = RangesKt.coerceAtLeast(interSetRestMin, 0.0d);
        double coerceAtLeast5 = RangesKt.coerceAtLeast(rpeLoadMultiplier(avgRpeBorg), 0.0d) * (Math.log(coerceAtLeast2 + 1.0d) + (Math.log(coerceAtLeast3 + 1.0d) * 0.35d) + (coerceAtLeast * 0.015d) + (coerceAtLeast4 * 0.006d));
        double coerceIn = RangesKt.coerceIn((1.4d * coerceAtLeast5) + 4.0d, 2.0d, 72.0d);
        if (avgRpeBorg != null) {
            str = " · RPE≈" + INSTANCE.round1(avgRpeBorg.doubleValue());
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        return applyDemographics(new RecoveryEstimate(coerceIn, coerceAtLeast5, "Gym load≈" + round1(coerceAtLeast5) + " (ton + max + active time + rest" + str + ")"), demographics, 1.75d, 78.0d);
    }

    public final double rpeLoadMultiplier(Double avgRpeBorg) {
        if (avgRpeBorg == null || avgRpeBorg.doubleValue() <= 0.0d) {
            return 1.0d;
        }
        return RangesKt.coerceIn((RangesKt.coerceIn(avgRpeBorg.doubleValue() - 10.0d, -4.0d, 8.0d) * 0.045d) + 1.0d, 0.82d, 1.36d);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RecoveryEstimate estimateSoccer(int warmupMin, int playMin, int intensity, String kind, Integer hrAvgBpm, Integer hrMaxBpm, String sportLabel, RecoveryDemographics demographics) {
        String str;
        double d;
        Double d2;
        Double d3;
        String obj;
        Intrinsics.checkNotNullParameter(sportLabel, "sportLabel");
        double coerceAtLeast = RangesKt.coerceAtLeast(warmupMin, 0);
        double coerceAtLeast2 = RangesKt.coerceAtLeast(playMin, 0);
        if (coerceAtLeast + coerceAtLeast2 <= 0.0d) {
            return new RecoveryEstimate(0.0d, 0.0d, "No load");
        }
        double coerceIn = RangesKt.coerceIn(intensity, 1, 10);
        String obj2 = StringsKt.trim((CharSequence) sportLabel).toString();
        if (obj2.length() == 0) {
            obj2 = "Sport";
        }
        String str2 = obj2;
        double d4 = (coerceAtLeast * 0.6d) + (coerceAtLeast2 * 1.0d);
        double d5 = d4 / 60.0d;
        double d6 = (0.045d * coerceIn) + 0.72d + (0.0105d * coerceIn * coerceIn);
        double log = Math.log((d4 / 70.0d) + 1.0d) + 1.0d;
        if (kind == null || (obj = StringsKt.trim((CharSequence) kind).toString()) == null) {
            str = null;
        } else {
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            str = obj.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(str, "toUpperCase(...)");
        }
        if (Intrinsics.areEqual(str, "MATCH")) {
            d = 1.18d;
        } else {
            d = Intrinsics.areEqual(str, "TRAINING") ? 1.0d : 1.06d;
        }
        if (hrAvgBpm != null) {
            int intValue = hrAvgBpm.intValue();
            if (((40 > intValue || intValue >= 221) ? null : hrAvgBpm) != null) {
                d2 = Double.valueOf(r10.intValue());
                if (hrMaxBpm != null) {
                    int intValue2 = hrMaxBpm.intValue();
                    if (((40 > intValue2 || intValue2 >= 241) ? null : hrMaxBpm) != null) {
                        d3 = Double.valueOf(r5.intValue());
                        double d7 = d5 * d6 * log * d * ((d2 != null || d2.doubleValue() < 170.0d) ? (d2 != null || d2.doubleValue() < 155.0d) ? (d2 != null || d2.doubleValue() < 140.0d) ? (d3 != null || d3.doubleValue() < 190.0d) ? 1.0d : 1.06d : 1.04d : 1.08d : 1.12d);
                        return applyDemographics(new RecoveryEstimate(RangesKt.coerceIn((2.95d * d7) + 2.25d, 1.5d, 96.0d), d7, str2 + " load≈" + round1(d7) + " (warmup+play×intensity" + (kind != null ? "×" + kind : "") + ")"), demographics, 1.4d, 78.0d);
                    }
                }
                d3 = null;
                double d72 = d5 * d6 * log * d * ((d2 != null || d2.doubleValue() < 170.0d) ? (d2 != null || d2.doubleValue() < 155.0d) ? (d2 != null || d2.doubleValue() < 140.0d) ? (d3 != null || d3.doubleValue() < 190.0d) ? 1.0d : 1.06d : 1.04d : 1.08d : 1.12d);
                return applyDemographics(new RecoveryEstimate(RangesKt.coerceIn((2.95d * d72) + 2.25d, 1.5d, 96.0d), d72, str2 + " load≈" + round1(d72) + " (warmup+play×intensity" + (kind != null ? "×" + kind : "") + ")"), demographics, 1.4d, 78.0d);
            }
        }
        d2 = null;
        if (hrMaxBpm != null) {
        }
        d3 = null;
        double d722 = d5 * d6 * log * d * ((d2 != null || d2.doubleValue() < 170.0d) ? (d2 != null || d2.doubleValue() < 155.0d) ? (d2 != null || d2.doubleValue() < 140.0d) ? (d3 != null || d3.doubleValue() < 190.0d) ? 1.0d : 1.06d : 1.04d : 1.08d : 1.12d);
        return applyDemographics(new RecoveryEstimate(RangesKt.coerceIn((2.95d * d722) + 2.25d, 1.5d, 96.0d), d722, str2 + " load≈" + round1(d722) + " (warmup+play×intensity" + (kind != null ? "×" + kind : "") + ")"), demographics, 1.4d, 78.0d);
    }

    public final String formatRemaining(long ms) {
        long coerceAtLeast = RangesKt.coerceAtLeast(ms / 1000, 0L);
        long j = 3600;
        long j2 = coerceAtLeast / j;
        return (j2 > 0 ? new StringBuilder().append(j2).append("h ") : new StringBuilder()).append((coerceAtLeast % j) / 60).append("m").toString();
    }

    private final double round1(double d) {
        return MathKt.roundToInt(d * 10.0d) / 10.0d;
    }
}
