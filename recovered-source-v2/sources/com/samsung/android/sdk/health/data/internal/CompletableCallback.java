package com.samsung.android.sdk.health.data.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.samsung.android.sdk.health.data.v0;
import com.samsung.android.sdk.health.data.w0;

/* loaded from: classes5.dex */
public class CompletableCallback implements Parcelable {
    public static final Parcelable.Creator<CompletableCallback> CREATOR = new a();
    private final long a;
    private final w0 b;
    private boolean c;
    private ErrorStatus d;

    CompletableCallback(long j, b bVar) {
        this.a = j;
        this.b = bVar;
    }

    public void complete() {
        this.c = true;
        try {
            this.b.a(this.a);
        } catch (RemoteException unused) {
            Log.e("[SHD]CompletableCallback", "Remote error on completion");
        }
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
            Log.e("[SHD]CompletableCallback", "Remote error on failure");
        }
    }

    public ErrorStatus getErrorStatus() {
        return this.d;
    }

    public boolean isCompleted() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeStrongBinder(this.b.asBinder());
    }

    protected CompletableCallback(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = v0.a(parcel.readStrongBinder());
    }
}
