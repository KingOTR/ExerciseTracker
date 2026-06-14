package com.samsung.android.sdk.health.data.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.samsung.android.sdk.health.data.a1;
import com.samsung.android.sdk.health.data.c2;
import com.samsung.android.sdk.health.data.z0;

/* loaded from: classes5.dex */
public class SingleCallback<T> implements Parcelable {
    public static final Parcelable.Creator<SingleCallback> CREATOR = new j();
    private final long a;
    private final a1 b;
    private Object c;
    private ErrorStatus d;

    SingleCallback(long j, k kVar) {
        this.a = j;
        this.b = kVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void fail(ErrorStatus errorStatus) {
        this.d = errorStatus;
        try {
            this.b.a(this.a, errorStatus);
        } catch (RemoteException unused) {
            Log.e("[SHD]SingleCallback", "Remote error on failure");
        }
    }

    public ErrorStatus getErrorStatus() {
        return this.d;
    }

    public T getResult() {
        return (T) this.c;
    }

    public void succeed(T t) {
        this.c = t;
        try {
            this.b.a(this.a, new c2(t));
        } catch (RemoteException unused) {
            Log.e("[SHD]SingleCallback", "Remote error on success");
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeStrongBinder(this.b.asBinder());
    }

    protected SingleCallback(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = z0.a(parcel.readStrongBinder());
    }
}
