package com.samsung.android.sdk.health.data;

import android.database.CursorWindow;
import android.database.DatabaseUtils;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes5.dex */
public abstract class h extends Binder implements t0 {
    public static final /* synthetic */ int a = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        try {
            switch (i) {
                case 1:
                    parcel.enforceInterface("android.content.IBulkCursor");
                    CursorWindow a2 = ((k) this).a(parcel.readInt());
                    parcel2.writeNoException();
                    if (a2 != null) {
                        parcel2.writeInt(1);
                        a2.writeToParcel(parcel2, 1);
                        break;
                    } else {
                        parcel2.writeInt(0);
                        break;
                    }
                case 2:
                    parcel.enforceInterface("android.content.IBulkCursor");
                    ((k) this).deactivate();
                    parcel2.writeNoException();
                    break;
                case 3:
                    parcel.enforceInterface("android.content.IBulkCursor");
                    k kVar = (k) this;
                    int requery = kVar.requery();
                    parcel2.writeNoException();
                    parcel2.writeInt(requery);
                    parcel2.writeBundle(kVar.getExtras());
                    break;
                case 4:
                    parcel.enforceInterface("android.content.IBulkCursor");
                    ((k) this).b(parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 5:
                    parcel.enforceInterface("android.content.IBulkCursor");
                    Bundle extras = ((k) this).getExtras();
                    parcel2.writeNoException();
                    parcel2.writeBundle(extras);
                    break;
                case 6:
                    parcel.enforceInterface("android.content.IBulkCursor");
                    Bundle respond = ((k) this).respond(parcel.readBundle(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    parcel2.writeBundle(respond);
                    break;
                case 7:
                    parcel.enforceInterface("android.content.IBulkCursor");
                    ((k) this).close();
                    parcel2.writeNoException();
                    break;
            }
            return true;
        } catch (Exception e) {
            DatabaseUtils.writeExceptionToParcel(parcel2, e);
            return true;
        }
    }

    public h() {
        attachInterface(this, "android.content.IBulkCursor");
    }
}
