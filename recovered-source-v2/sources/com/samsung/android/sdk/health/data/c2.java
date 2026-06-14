package com.samsung.android.sdk.health.data;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class c2 implements Parcelable {
    public static final Parcelable.Creator<c2> CREATOR = new b2();
    public final Object a;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public c2(Parcel parcel) {
        this.a = q1.a(parcel);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        q1.a(parcel, this.a);
    }

    public c2(Object obj) {
        this.a = obj;
    }
}
