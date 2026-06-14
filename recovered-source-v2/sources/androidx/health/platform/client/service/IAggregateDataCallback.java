package androidx.health.platform.client.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.health.platform.client.error.ErrorStatus;
import androidx.health.platform.client.response.AggregateDataResponse;

/* loaded from: classes2.dex */
public interface IAggregateDataCallback extends IInterface {
    public static final String DESCRIPTOR = "androidx.health.platform.client.service.IAggregateDataCallback";

    public static class Default implements IAggregateDataCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.health.platform.client.service.IAggregateDataCallback
        public void onError(ErrorStatus errorStatus) throws RemoteException {
        }

        @Override // androidx.health.platform.client.service.IAggregateDataCallback
        public void onSuccess(AggregateDataResponse aggregateDataResponse) throws RemoteException {
        }
    }

    void onError(ErrorStatus errorStatus) throws RemoteException;

    void onSuccess(AggregateDataResponse aggregateDataResponse) throws RemoteException;

    public static abstract class Stub extends Binder implements IAggregateDataCallback {
        static final int TRANSACTION_onError = 2;
        static final int TRANSACTION_onSuccess = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, IAggregateDataCallback.DESCRIPTOR);
        }

        public static IAggregateDataCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IAggregateDataCallback.DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IAggregateDataCallback)) {
                return (IAggregateDataCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IAggregateDataCallback.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IAggregateDataCallback.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                onSuccess((AggregateDataResponse) _Parcel.readTypedObject(parcel, AggregateDataResponse.CREATOR));
            } else if (i == 2) {
                onError((ErrorStatus) _Parcel.readTypedObject(parcel, ErrorStatus.CREATOR));
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }

        private static class Proxy implements IAggregateDataCallback {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IAggregateDataCallback.DESCRIPTOR;
            }

            @Override // androidx.health.platform.client.service.IAggregateDataCallback
            public void onSuccess(AggregateDataResponse aggregateDataResponse) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAggregateDataCallback.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, aggregateDataResponse, 0);
                    this.mRemote.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.health.platform.client.service.IAggregateDataCallback
            public void onError(ErrorStatus errorStatus) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IAggregateDataCallback.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, errorStatus, 0);
                    this.mRemote.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }
    }

    public static class _Parcel {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            } else {
                parcel.writeInt(0);
            }
        }
    }
}
