package com.samsung.android.sdk.health.data.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.sdk.health.data.error.AuthorizationException;
import com.samsung.android.sdk.health.data.error.ErrorCode;
import com.samsung.android.sdk.health.data.error.HealthDataException;
import com.samsung.android.sdk.health.data.error.InvalidRequestException;
import com.samsung.android.sdk.health.data.error.PlatformInternalException;
import com.samsung.android.sdk.health.data.error.ResolvablePlatformException;

/* loaded from: classes5.dex */
public class ErrorStatus implements Parcelable {
    public static final Parcelable.Creator<ErrorStatus> CREATOR = new e();
    private final int a;
    private final String b;

    private ErrorStatus(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public static ErrorStatus of(int i, String str) {
        return new ErrorStatus(i, str);
    }

    final HealthDataException a() {
        HealthDataException invalidRequestException;
        int i = this.a / 1000;
        if (i == 1) {
            invalidRequestException = new InvalidRequestException(this.a, this.b);
        } else if (i == 2) {
            invalidRequestException = new AuthorizationException(Integer.valueOf(this.a), this.b);
        } else if (i == 3) {
            invalidRequestException = new ResolvablePlatformException(Integer.valueOf(this.a), this.b, true);
        } else {
            if (i != 9) {
                return new PlatformInternalException(Integer.valueOf(ErrorCode.ERR_INTERNAL_ERROR), "Unknown error");
            }
            invalidRequestException = new PlatformInternalException(Integer.valueOf(this.a), this.b);
        }
        return invalidRequestException;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getErrorCode() {
        return this.a;
    }

    public String getErrorMessage() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
    }

    ErrorStatus(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readString();
    }
}
