package com.samsung.android.sdk.health.data;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class b2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new c2(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new c2[i];
    }
}
