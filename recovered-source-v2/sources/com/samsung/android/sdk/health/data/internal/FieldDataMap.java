package com.samsung.android.sdk.health.data.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.sdk.health.data.q1;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class FieldDataMap implements Parcelable {
    public static final Parcelable.Creator<FieldDataMap> CREATOR = new f();
    private final HashMap a;

    public FieldDataMap() {
        this.a = new HashMap();
    }

    public Boolean containsKey(String str) {
        return Boolean.valueOf(this.a.containsKey(str));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public <T> T getValue(String str) {
        return (T) this.a.get(str);
    }

    public <T> T getValueOrDefault(String str, T t) {
        T t2 = (T) this.a.get(str);
        return t2 == null ? t : t2;
    }

    public <T> void setValue(String str, T t) {
        this.a.put(str, t);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.size());
        for (Map.Entry entry : this.a.entrySet()) {
            parcel.writeString((String) entry.getKey());
            q1.a(parcel, entry.getValue());
        }
    }

    public FieldDataMap(Parcel parcel) {
        int readInt = parcel.readInt();
        this.a = new HashMap(readInt);
        for (int i = 0; i < readInt; i++) {
            this.a.put(parcel.readString(), q1.a(parcel));
        }
    }
}
