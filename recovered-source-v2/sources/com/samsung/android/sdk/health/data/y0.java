package com.samsung.android.sdk.health.data;

import android.os.IBinder;
import android.os.Parcel;
import com.samsung.android.sdk.health.data.internal.ErrorStatus;

/* loaded from: classes5.dex */
public final class y0 implements a1 {
    public final IBinder a;

    public y0(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // com.samsung.android.sdk.health.data.a1
    public final void a(long j, ErrorStatus errorStatus) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.samsung.android.sdk.health.data.internal.ISingleCallback");
            obtain.writeLong(j);
            if (errorStatus != null) {
                obtain.writeInt(1);
                errorStatus.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (!this.a.transact(2, obtain, null, 1)) {
                int i = z0.a;
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.samsung.android.sdk.health.data.a1
    public final void a(long j, c2 c2Var) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.samsung.android.sdk.health.data.internal.ISingleCallback");
            obtain.writeLong(j);
            if (c2Var != null) {
                obtain.writeInt(1);
                q1.a(obtain, c2Var.a);
            } else {
                obtain.writeInt(0);
            }
            if (!this.a.transact(1, obtain, null, 1)) {
                int i = z0.a;
            }
        } finally {
            obtain.recycle();
        }
    }
}
