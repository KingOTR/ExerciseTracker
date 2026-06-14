package com.samsung.android.sdk.health.data;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class q1 {
    public static Object a(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt == -1) {
            return null;
        }
        if (readInt == 0) {
            return parcel.readString();
        }
        if (readInt == 1) {
            return Integer.valueOf(parcel.readInt());
        }
        if (readInt == 3) {
            return parcel.readBundle(((Class) parcel.readSerializable()).getClassLoader());
        }
        if (readInt == 4) {
            return parcel.readParcelable(((Class) parcel.readSerializable()).getClassLoader());
        }
        if (readInt == 11) {
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            if (readInt2 > 0) {
                parcel.readList(arrayList, ((Class) parcel.readSerializable()).getClassLoader());
            }
            return arrayList;
        }
        if (readInt == 15) {
            return parcel.readStrongBinder();
        }
        if (readInt == 20) {
            return Byte.valueOf(parcel.readByte());
        }
        if (readInt == 21) {
            return parcel.readSerializable();
        }
        switch (readInt) {
            case 6:
                return Long.valueOf(parcel.readLong());
            case 7:
                return Float.valueOf(parcel.readFloat());
            case 8:
                return Double.valueOf(parcel.readDouble());
            case 9:
                return Boolean.valueOf(parcel.readInt() == 1);
            default:
                throw new RuntimeException("Parcel " + parcel + ": Unmarshalling unknown type code " + readInt + " at offset " + (parcel.dataPosition() - 4));
        }
    }

    public static void a(Parcel parcel, Object obj) {
        if (obj == null) {
            parcel.writeInt(-1);
            return;
        }
        if (obj instanceof String) {
            parcel.writeInt(0);
            parcel.writeString((String) obj);
            return;
        }
        if (obj instanceof Integer) {
            parcel.writeInt(1);
            parcel.writeInt(((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Bundle) {
            parcel.writeInt(3);
            parcel.writeSerializable(obj.getClass());
            parcel.writeBundle((Bundle) obj);
            return;
        }
        if (obj instanceof Parcelable) {
            parcel.writeInt(4);
            parcel.writeSerializable(obj.getClass());
            parcel.writeParcelable((Parcelable) obj, 0);
            return;
        }
        if (obj instanceof Long) {
            parcel.writeInt(6);
            parcel.writeLong(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Float) {
            parcel.writeInt(7);
            parcel.writeFloat(((Float) obj).floatValue());
            return;
        }
        if (obj instanceof Double) {
            parcel.writeInt(8);
            parcel.writeDouble(((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Boolean) {
            parcel.writeInt(9);
            parcel.writeInt(((Boolean) obj).booleanValue() ? 1 : 0);
            return;
        }
        if (obj instanceof List) {
            parcel.writeInt(11);
            List list = (List) obj;
            parcel.writeInt(list.size());
            if (list.isEmpty()) {
                return;
            }
            parcel.writeSerializable(list.get(0).getClass());
            parcel.writeList(list);
            return;
        }
        if (obj instanceof IBinder) {
            parcel.writeInt(15);
            parcel.writeStrongBinder((IBinder) obj);
        } else if (obj instanceof Byte) {
            parcel.writeInt(20);
            parcel.writeInt(((Byte) obj).byteValue());
        } else {
            if (obj instanceof Serializable) {
                parcel.writeInt(21);
                parcel.writeSerializable((Serializable) obj);
                return;
            }
            throw new RuntimeException("Parcel: unable to marshal value " + obj);
        }
    }
}
