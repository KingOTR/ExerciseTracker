package com.samsung.android.sdk.health.data.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.sdk.health.data.BuildConfig;

/* loaded from: classes5.dex */
public class ConnectionResponse implements Parcelable {
    public static final Parcelable.Creator<ConnectionResponse> CREATOR = new d();
    private final int a;

    public static class Builder {
        private Builder() {
        }

        public ConnectionResponse build() {
            return new ConnectionResponse();
        }
    }

    private ConnectionResponse() {
        this.a = BuildConfig.SDK_VERSION_CODE;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getServiceVersion() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }

    private ConnectionResponse(Parcel parcel) {
        this.a = parcel.readInt();
    }
}
