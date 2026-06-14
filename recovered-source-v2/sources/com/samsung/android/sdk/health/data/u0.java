package com.samsung.android.sdk.health.data;

import android.os.IBinder;
import android.os.Parcel;
import com.samsung.android.sdk.health.data.internal.ErrorStatus;

/* loaded from: classes5.dex */
public final class u0 implements w0 {
    public final IBinder a;

    public u0(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // com.samsung.android.sdk.health.data.w0
    public final void a(long j) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.samsung.android.sdk.health.data.internal.ICompletableCallback");
            obtain.writeLong(j);
            if (!this.a.transact(1, obtain, null, 1)) {
                int i = v0.a;
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.samsung.android.sdk.health.data.w0
    public final void a(long j, ErrorStatus errorStatus) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.samsung.android.sdk.health.data.internal.ICompletableCallback");
            obtain.writeLong(j);
            if (errorStatus != null) {
                obtain.writeInt(1);
                errorStatus.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (!this.a.transact(2, obtain, null, 1)) {
                int i = v0.a;
            }
        } finally {
            obtain.recycle();
        }
    }
}
