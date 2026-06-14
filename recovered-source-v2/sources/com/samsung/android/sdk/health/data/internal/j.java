package com.samsung.android.sdk.health.data.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new SingleCallback(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new SingleCallback[i];
    }
}
