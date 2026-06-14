package com.samsung.android.sdk.health.data.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import com.samsung.android.sdk.health.data.internal.FieldDataMap;
import com.samsung.android.sdk.health.data.request.DataType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001J#\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/samsung/android/sdk/health/data/data/UserDataPoint;", "Lcom/samsung/android/sdk/health/data/data/DataPoint;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/samsung/android/sdk/health/data/data/Field;", "field", "getValue", "(Lcom/samsung/android/sdk/health/data/data/Field;)Ljava/lang/Object;", "defaultValue", "getValueOrDefault", "(Lcom/samsung/android/sdk/health/data/data/Field;Ljava/lang/Object;)Ljava/lang/Object;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class UserDataPoint implements DataPoint {
    public static final Parcelable.Creator<UserDataPoint> CREATOR = new Creator();
    private final FieldDataMap a;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UserDataPoint> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserDataPoint createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UserDataPoint((FieldDataMap) parcel.readParcelable(UserDataPoint.class.getClassLoader()), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserDataPoint[] newArray(int i) {
            return new UserDataPoint[i];
        }
    }

    public /* synthetic */ UserDataPoint(FieldDataMap fieldDataMap, DefaultConstructorMarker defaultConstructorMarker) {
        this(fieldDataMap);
    }

    private final DataType.UserProfileDataType.Gender a() {
        Integer num = (Integer) this.a.getValue(DataType.UserProfileDataType.GENDER.getAndroidx.autofill.HintConstants.AUTOFILL_HINT_NAME java.lang.String());
        Enum r0 = null;
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        Enum[] enumConstants = (Enum[]) DataType.UserProfileDataType.Gender.class.getEnumConstants();
        if (enumConstants != null) {
            Intrinsics.checkNotNullExpressionValue(enumConstants, "enumConstants");
            r0 = (intValue <= 0 || intValue >= enumConstants.length) ? enumConstants[0] : enumConstants[intValue];
        }
        return (DataType.UserProfileDataType.Gender) r0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final <T> T getValue(Field<T> field) {
        Intrinsics.checkNotNullParameter(field, "field");
        if (!Intrinsics.areEqual(field.getAndroidx.autofill.HintConstants.AUTOFILL_HINT_NAME java.lang.String(), DataType.UserProfileDataType.GENDER.getAndroidx.autofill.HintConstants.AUTOFILL_HINT_NAME java.lang.String())) {
            return (T) this.a.getValue(field.getAndroidx.autofill.HintConstants.AUTOFILL_HINT_NAME java.lang.String());
        }
        T t = (T) a();
        if (t == null) {
            return null;
        }
        return t;
    }

    public final <T> T getValueOrDefault(Field<T> field, T defaultValue) {
        Intrinsics.checkNotNullParameter(field, "field");
        if (!Intrinsics.areEqual(field.getAndroidx.autofill.HintConstants.AUTOFILL_HINT_NAME java.lang.String(), DataType.UserProfileDataType.GENDER.getAndroidx.autofill.HintConstants.AUTOFILL_HINT_NAME java.lang.String())) {
            return (T) this.a.getValueOrDefault(field.getAndroidx.autofill.HintConstants.AUTOFILL_HINT_NAME java.lang.String(), defaultValue);
        }
        DataType.UserProfileDataType.Gender a = a();
        if (a == null) {
            a = null;
        }
        return a == null ? defaultValue : (T) a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeParcelable(this.a, flags);
    }

    private UserDataPoint(FieldDataMap fieldDataMap) {
        this.a = fieldDataMap;
    }
}
