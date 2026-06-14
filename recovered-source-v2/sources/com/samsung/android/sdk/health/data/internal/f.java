package com.samsung.android.sdk.health.data.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new FieldDataMap(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new FieldDataMap[i];
    }
}
