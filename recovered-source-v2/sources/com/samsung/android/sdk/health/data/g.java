package com.samsung.android.sdk.health.data;

import android.database.CursorWindow;
import android.database.MatrixCursor;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new f();
    public t0 a;
    public String[] b;
    public boolean c;
    public int d;
    public CursorWindow e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public static ArrayList a(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList();
        if (readInt > 0) {
            Class cls = (Class) parcel.readSerializable();
            parcel.readString();
            g createFromParcel = CREATOR.createFromParcel(parcel);
            ClassLoader classLoader = cls.getClassLoader();
            j jVar = new j(createFromParcel);
            while (jVar.moveToNext()) {
                try {
                    try {
                        byte[] blob = jVar.getBlob(jVar.getColumnIndex("data"));
                        if (blob != null) {
                            Parcel obtain = Parcel.obtain();
                            obtain.unmarshall(blob, 0, blob.length);
                            obtain.setDataPosition(0);
                            Parcelable readParcelable = obtain.readParcelable(classLoader);
                            obtain.recycle();
                            arrayList.add(readParcelable);
                        }
                    } catch (IllegalStateException unused) {
                        Log.e("[SHD]BulkCursorDescriptor", "Couldn't read from CursorWindow.");
                    }
                } catch (Throwable th) {
                    try {
                        jVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            jVar.close();
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.a.asBinder());
        parcel.writeStringArray(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d);
        if (this.e != null) {
            parcel.writeInt(1);
            this.e.writeToParcel(parcel, i);
        } else {
            parcel.writeInt(0);
        }
    }

    public static void a(Parcel parcel, List list) {
        g gVar;
        parcel.writeInt(list.size());
        if (list.isEmpty()) {
            return;
        }
        parcel.writeSerializable(((Parcelable) list.get(0)).getClass());
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"data"});
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            Parcelable parcelable = (Parcelable) it.next();
            Parcel obtain = Parcel.obtain();
            obtain.writeParcelable(parcelable, 0);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            if (marshall != null) {
                matrixCursor.addRow(new Object[]{marshall});
                i = Math.max(i, marshall.length);
            }
        }
        k kVar = new k(matrixCursor, i);
        synchronized (kVar.b) {
            kVar.b();
            gVar = new g();
            gVar.a = kVar;
            gVar.b = kVar.d.getColumnNames();
            gVar.c = kVar.d.getWantsAllOnMoveCalls();
            gVar.d = kVar.d.getCount();
            CursorWindow window = kVar.d.getWindow();
            gVar.e = window;
            if (window != null) {
                window.acquireReference();
            }
        }
        parcel.writeString("e.b");
        gVar.writeToParcel(parcel, 0);
    }
}
