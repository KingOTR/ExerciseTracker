package com.samsung.android.sdk.health.data;

import android.database.CursorWindow;
import android.database.DatabaseUtils;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes5.dex */
public final class i implements t0 {
    public final IBinder a;
    public Bundle b = null;

    @Override // com.samsung.android.sdk.health.data.t0
    public final CursorWindow a(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.content.IBulkCursor");
            obtain.writeInt(i);
            this.a.transact(1, obtain, obtain2, 0);
            DatabaseUtils.readExceptionFromParcel(obtain2);
            return obtain2.readInt() == 1 ? CursorWindow.newFromParcel(obtain2) : null;
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // com.samsung.android.sdk.health.data.t0
    public final void b(int i) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.content.IBulkCursor");
            obtain.writeInt(i);
            this.a.transact(4, obtain, obtain2, 0);
            DatabaseUtils.readExceptionFromParcel(obtain2);
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // com.samsung.android.sdk.health.data.t0
    public final void close() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.content.IBulkCursor");
            this.a.transact(7, obtain, obtain2, 0);
            DatabaseUtils.readExceptionFromParcel(obtain2);
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // com.samsung.android.sdk.health.data.t0
    public final void deactivate() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.content.IBulkCursor");
            this.a.transact(2, obtain, obtain2, 0);
            DatabaseUtils.readExceptionFromParcel(obtain2);
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // com.samsung.android.sdk.health.data.t0
    public final Bundle respond(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.content.IBulkCursor");
            obtain.writeBundle(bundle);
            this.a.transact(6, obtain, obtain2, 0);
            DatabaseUtils.readExceptionFromParcel(obtain2);
            return obtain2.readBundle();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    public i(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // com.samsung.android.sdk.health.data.t0
    public final int requery() {
        int i;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.content.IBulkCursor");
            boolean transact = this.a.transact(3, obtain, obtain2, 0);
            DatabaseUtils.readExceptionFromParcel(obtain2);
            if (transact) {
                int readInt = obtain2.readInt();
                this.b = obtain2.readBundle();
                i = readInt;
            } else {
                i = -1;
            }
            return i;
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // com.samsung.android.sdk.health.data.t0
    public final Bundle getExtras() {
        if (this.b == null) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("android.content.IBulkCursor");
                this.a.transact(5, obtain, obtain2, 0);
                DatabaseUtils.readExceptionFromParcel(obtain2);
                this.b = obtain2.readBundle();
            } finally {
                obtain.recycle();
                obtain2.recycle();
            }
        }
        return this.b;
    }
}
