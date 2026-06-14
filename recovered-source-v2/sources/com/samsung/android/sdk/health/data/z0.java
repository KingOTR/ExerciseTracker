package com.samsung.android.sdk.health.data;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.samsung.android.sdk.health.data.internal.ErrorStatus;

/* loaded from: classes5.dex */
public abstract class z0 extends Binder implements a1 {
    public static final /* synthetic */ int a = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public z0() {
        attachInterface(this, "com.samsung.android.sdk.health.data.internal.ISingleCallback");
    }

    public static a1 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.samsung.android.sdk.health.data.internal.ISingleCallback");
        if (queryLocalInterface != null && (queryLocalInterface instanceof a1)) {
            return (a1) queryLocalInterface;
        }
        return new y0(iBinder);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            parcel.enforceInterface("com.samsung.android.sdk.health.data.internal.ISingleCallback");
            ((com.samsung.android.sdk.health.data.internal.k) this).a(parcel.readLong(), parcel.readInt() != 0 ? c2.CREATOR.createFromParcel(parcel) : null);
            return true;
        }
        if (i == 2) {
            parcel.enforceInterface("com.samsung.android.sdk.health.data.internal.ISingleCallback");
            ((com.samsung.android.sdk.health.data.internal.k) this).a(parcel.readLong(), parcel.readInt() != 0 ? ErrorStatus.CREATOR.createFromParcel(parcel) : null);
            return true;
        }
        if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        parcel2.writeString("com.samsung.android.sdk.health.data.internal.ISingleCallback");
        return true;
    }
}
