package com.example.rungps.ui.profile;

import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.data.UserProfileStore;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserProfileForm.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/example/rungps/ui/profile/ProfileFormStrings;", "", "displayName", "", "ageText", "dobText", "heightText", "weightText", "sex", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "getAgeText", "getDobText", "getHeightText", "getWeightText", "getSex", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProfileFormStrings {
    public static final int $stable = 0;
    private final String ageText;
    private final String displayName;
    private final String dobText;
    private final String heightText;
    private final String sex;
    private final String weightText;

    public ProfileFormStrings() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ ProfileFormStrings copy$default(ProfileFormStrings profileFormStrings, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profileFormStrings.displayName;
        }
        if ((i & 2) != 0) {
            str2 = profileFormStrings.ageText;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = profileFormStrings.dobText;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = profileFormStrings.heightText;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = profileFormStrings.weightText;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = profileFormStrings.sex;
        }
        return profileFormStrings.copy(str, str7, str8, str9, str10, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAgeText() {
        return this.ageText;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDobText() {
        return this.dobText;
    }

    /* renamed from: component4, reason: from getter */
    public final String getHeightText() {
        return this.heightText;
    }

    /* renamed from: component5, reason: from getter */
    public final String getWeightText() {
        return this.weightText;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSex() {
        return this.sex;
    }

    public final ProfileFormStrings copy(String displayName, String ageText, String dobText, String heightText, String weightText, String sex) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(ageText, "ageText");
        Intrinsics.checkNotNullParameter(dobText, "dobText");
        Intrinsics.checkNotNullParameter(heightText, "heightText");
        Intrinsics.checkNotNullParameter(weightText, "weightText");
        Intrinsics.checkNotNullParameter(sex, "sex");
        return new ProfileFormStrings(displayName, ageText, dobText, heightText, weightText, sex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileFormStrings)) {
            return false;
        }
        ProfileFormStrings profileFormStrings = (ProfileFormStrings) other;
        return Intrinsics.areEqual(this.displayName, profileFormStrings.displayName) && Intrinsics.areEqual(this.ageText, profileFormStrings.ageText) && Intrinsics.areEqual(this.dobText, profileFormStrings.dobText) && Intrinsics.areEqual(this.heightText, profileFormStrings.heightText) && Intrinsics.areEqual(this.weightText, profileFormStrings.weightText) && Intrinsics.areEqual(this.sex, profileFormStrings.sex);
    }

    public int hashCode() {
        return (((((((((this.displayName.hashCode() * 31) + this.ageText.hashCode()) * 31) + this.dobText.hashCode()) * 31) + this.heightText.hashCode()) * 31) + this.weightText.hashCode()) * 31) + this.sex.hashCode();
    }

    public String toString() {
        return "ProfileFormStrings(displayName=" + this.displayName + ", ageText=" + this.ageText + ", dobText=" + this.dobText + ", heightText=" + this.heightText + ", weightText=" + this.weightText + ", sex=" + this.sex + ")";
    }

    public ProfileFormStrings(String displayName, String ageText, String dobText, String heightText, String weightText, String sex) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(ageText, "ageText");
        Intrinsics.checkNotNullParameter(dobText, "dobText");
        Intrinsics.checkNotNullParameter(heightText, "heightText");
        Intrinsics.checkNotNullParameter(weightText, "weightText");
        Intrinsics.checkNotNullParameter(sex, "sex");
        this.displayName = displayName;
        this.ageText = ageText;
        this.dobText = dobText;
        this.heightText = heightText;
        this.weightText = weightText;
        this.sex = sex;
    }

    public /* synthetic */ ProfileFormStrings(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? UserProfileStore.SEX_UNSPECIFIED : str6);
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getAgeText() {
        return this.ageText;
    }

    public final String getDobText() {
        return this.dobText;
    }

    public final String getHeightText() {
        return this.heightText;
    }

    public final String getWeightText() {
        return this.weightText;
    }

    public final String getSex() {
        return this.sex;
    }
}
