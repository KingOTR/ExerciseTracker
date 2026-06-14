package com.example.rungps.data;

import androidx.health.connect.client.records.Vo2MaxRecord;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* compiled from: UserProfileStore.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u001d¢\u0006\u0002\u0010\u001eJ\r\u0010#\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0018J\b\u0010$\u001a\u0004\u0018\u00010\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0018J\t\u0010*\u001a\u00020\u0003HÆ\u0003JR\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020 2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0005HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0016\u0010\u0011R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000fR\u0011\u0010\u001f\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u00061"}, d2 = {"Lcom/example/rungps/data/UserProfile;", "", "displayName", "", "ageYears", "", "dobEpochDay", "", "heightCm", "weightKg", "", "sex", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "getAgeYears", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDobEpochDay", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getHeightCm", "getWeightKg", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getSex", "resolvedAgeYears", "now", "Ljava/time/LocalDate;", "(Ljava/time/LocalDate;)Ljava/lang/Integer;", "hasCoreStats", "", "getHasCoreStats", "()Z", "bmi", "bmiLabel", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/String;)Lcom/example/rungps/data/UserProfile;", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class UserProfile {
    public static final int $stable = 0;
    private final Integer ageYears;
    private final String displayName;
    private final Long dobEpochDay;
    private final Integer heightCm;
    private final String sex;
    private final Double weightKg;

    public UserProfile() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ UserProfile copy$default(UserProfile userProfile, String str, Integer num, Long l, Integer num2, Double d, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userProfile.displayName;
        }
        if ((i & 2) != 0) {
            num = userProfile.ageYears;
        }
        Integer num3 = num;
        if ((i & 4) != 0) {
            l = userProfile.dobEpochDay;
        }
        Long l2 = l;
        if ((i & 8) != 0) {
            num2 = userProfile.heightCm;
        }
        Integer num4 = num2;
        if ((i & 16) != 0) {
            d = userProfile.weightKg;
        }
        Double d2 = d;
        if ((i & 32) != 0) {
            str2 = userProfile.sex;
        }
        return userProfile.copy(str, num3, l2, num4, d2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getAgeYears() {
        return this.ageYears;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getDobEpochDay() {
        return this.dobEpochDay;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getHeightCm() {
        return this.heightCm;
    }

    /* renamed from: component5, reason: from getter */
    public final Double getWeightKg() {
        return this.weightKg;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSex() {
        return this.sex;
    }

    public final UserProfile copy(String displayName, Integer ageYears, Long dobEpochDay, Integer heightCm, Double weightKg, String sex) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(sex, "sex");
        return new UserProfile(displayName, ageYears, dobEpochDay, heightCm, weightKg, sex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserProfile)) {
            return false;
        }
        UserProfile userProfile = (UserProfile) other;
        return Intrinsics.areEqual(this.displayName, userProfile.displayName) && Intrinsics.areEqual(this.ageYears, userProfile.ageYears) && Intrinsics.areEqual(this.dobEpochDay, userProfile.dobEpochDay) && Intrinsics.areEqual(this.heightCm, userProfile.heightCm) && Intrinsics.areEqual((Object) this.weightKg, (Object) userProfile.weightKg) && Intrinsics.areEqual(this.sex, userProfile.sex);
    }

    public int hashCode() {
        int hashCode = this.displayName.hashCode() * 31;
        Integer num = this.ageYears;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.dobEpochDay;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num2 = this.heightCm;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d = this.weightKg;
        return ((hashCode4 + (d != null ? d.hashCode() : 0)) * 31) + this.sex.hashCode();
    }

    public String toString() {
        return "UserProfile(displayName=" + this.displayName + ", ageYears=" + this.ageYears + ", dobEpochDay=" + this.dobEpochDay + ", heightCm=" + this.heightCm + ", weightKg=" + this.weightKg + ", sex=" + this.sex + ")";
    }

    public UserProfile(String displayName, Integer num, Long l, Integer num2, Double d, String sex) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(sex, "sex");
        this.displayName = displayName;
        this.ageYears = num;
        this.dobEpochDay = l;
        this.heightCm = num2;
        this.weightKg = d;
        this.sex = sex;
    }

    public /* synthetic */ UserProfile(String str, Integer num, Long l, Integer num2, Double d, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : num2, (i & 16) == 0 ? d : null, (i & 32) != 0 ? UserProfileStore.SEX_UNSPECIFIED : str2);
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final Integer getAgeYears() {
        return this.ageYears;
    }

    public final Long getDobEpochDay() {
        return this.dobEpochDay;
    }

    public final Integer getHeightCm() {
        return this.heightCm;
    }

    public final Double getWeightKg() {
        return this.weightKg;
    }

    public final String getSex() {
        return this.sex;
    }

    public static /* synthetic */ Integer resolvedAgeYears$default(UserProfile userProfile, LocalDate localDate, int i, Object obj) {
        if ((i & 1) != 0) {
            localDate = LocalDate.now(ZoneId.systemDefault());
        }
        return userProfile.resolvedAgeYears(localDate);
    }

    public final Integer resolvedAgeYears(LocalDate now) {
        LocalDate ofEpochDay;
        Intrinsics.checkNotNullParameter(now, "now");
        Long l = this.dobEpochDay;
        if (l == null || (ofEpochDay = LocalDate.ofEpochDay(l.longValue())) == null) {
            return this.ageYears;
        }
        Integer valueOf = Integer.valueOf(Period.between(ofEpochDay, now).getYears());
        int intValue = valueOf.intValue();
        if (intValue < 0 || intValue >= 151) {
            valueOf = null;
        }
        return valueOf == null ? this.ageYears : valueOf;
    }

    public final boolean getHasCoreStats() {
        Integer resolvedAgeYears$default = resolvedAgeYears$default(this, null, 1, null);
        int intValue = resolvedAgeYears$default != null ? resolvedAgeYears$default.intValue() : 0;
        if (10 <= intValue && intValue < 121) {
            Integer num = this.heightCm;
            int intValue2 = num != null ? num.intValue() : 0;
            if (100 <= intValue2 && intValue2 < 251) {
                Double d = this.weightKg;
                double doubleValue = d != null ? d.doubleValue() : 0.0d;
                if (20.0d <= doubleValue && doubleValue <= 400.0d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Double bmi() {
        Integer num = this.heightCm;
        if (num != null) {
            int intValue = num.intValue();
            Double d = this.weightKg;
            if (d != null) {
                double doubleValue = d.doubleValue();
                if (intValue <= 0) {
                    return null;
                }
                double d2 = intValue / 100.0d;
                return Double.valueOf(doubleValue / (d2 * d2));
            }
        }
        return null;
    }

    public final String bmiLabel() {
        String str;
        Double bmi = bmi();
        if (bmi == null) {
            return null;
        }
        double doubleValue = bmi.doubleValue();
        if (doubleValue < 18.5d) {
            str = "underweight";
        } else if (doubleValue < 25.0d) {
            str = "healthy";
        } else if (doubleValue < 30.0d) {
            str = "overweight";
        } else {
            str = "obese";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%.1f (%s)", Arrays.copyOf(new Object[]{Double.valueOf(doubleValue), str}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
