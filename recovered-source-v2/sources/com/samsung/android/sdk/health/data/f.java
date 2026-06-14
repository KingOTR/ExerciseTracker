package com.samsung.android.sdk.health.data;

import android.database.CursorWindow;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        t0 t0Var;
        g gVar = new g();
        IBinder readStrongBinder = parcel.readStrongBinder();
        int i = h.a;
        if (readStrongBinder == null) {
            t0Var = null;
        } else {
            t0 t0Var2 = (t0) readStrongBinder.queryLocalInterface("android.content.IBulkCursor");
            if (t0Var2 == null) {
                t0Var2 = new i(readStrongBinder);
            }
            t0Var = t0Var2;
        }
        gVar.a = t0Var;
        gVar.b = parcel.createStringArray();
        gVar.c = parcel.readInt() != 0;
        gVar.d = parcel.readInt();
        if (parcel.readInt() != 0) {
            gVar.e = (CursorWindow) CursorWindow.CREATOR.createFromParcel(parcel);
        }
        return gVar;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new g[i];
    }
}
