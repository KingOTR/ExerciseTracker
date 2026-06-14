package androidx.health.platform.client.impl.sdkservice;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.health.platform.client.impl.sdkservice.IGetIsInForegroundCallback;
import androidx.health.platform.client.impl.sdkservice.IGetPermissionTokenCallback;
import androidx.health.platform.client.impl.sdkservice.ISetPermissionTokenCallback;

/* loaded from: classes2.dex */
public interface IHealthDataSdkService extends IInterface {
    public static final String DESCRIPTOR = "androidx.health.platform.client.impl.sdkservice.IHealthDataSdkService";

    public static class Default implements IHealthDataSdkService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.health.platform.client.impl.sdkservice.IHealthDataSdkService
        public void getIsInForeground(String str, IGetIsInForegroundCallback iGetIsInForegroundCallback) throws RemoteException {
        }

        @Override // androidx.health.platform.client.impl.sdkservice.IHealthDataSdkService
        public void getPermissionToken(String str, IGetPermissionTokenCallback iGetPermissionTokenCallback) throws RemoteException {
        }

        @Override // androidx.health.platform.client.impl.sdkservice.IHealthDataSdkService
        public void setPermissionToken(String str, String str2, ISetPermissionTokenCallback iSetPermissionTokenCallback) throws RemoteException {
        }
    }

    void getIsInForeground(String str, IGetIsInForegroundCallback iGetIsInForegroundCallback) throws RemoteException;

    void getPermissionToken(String str, IGetPermissionTokenCallback iGetPermissionTokenCallback) throws RemoteException;

    void setPermissionToken(String str, String str2, ISetPermissionTokenCallback iSetPermissionTokenCallback) throws RemoteException;

    public static abstract class Stub extends Binder implements IHealthDataSdkService {
        static final int TRANSACTION_getIsInForeground = 3;
        static final int TRANSACTION_getPermissionToken = 2;
        static final int TRANSACTION_setPermissionToken = 1;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, IHealthDataSdkService.DESCRIPTOR);
        }

        public static IHealthDataSdkService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IHealthDataSdkService.DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IHealthDataSdkService)) {
                return (IHealthDataSdkService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IHealthDataSdkService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IHealthDataSdkService.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                setPermissionToken(parcel.readString(), parcel.readString(), ISetPermissionTokenCallback.Stub.asInterface(parcel.readStrongBinder()));
            } else if (i == 2) {
                getPermissionToken(parcel.readString(), IGetPermissionTokenCallback.Stub.asInterface(parcel.readStrongBinder()));
            } else if (i == 3) {
                getIsInForeground(parcel.readString(), IGetIsInForegroundCallback.Stub.asInterface(parcel.readStrongBinder()));
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }

        private static class Proxy implements IHealthDataSdkService {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IHealthDataSdkService.DESCRIPTOR;
            }

            @Override // androidx.health.platform.client.impl.sdkservice.IHealthDataSdkService
            public void setPermissionToken(String str, String str2, ISetPermissionTokenCallback iSetPermissionTokenCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IHealthDataSdkService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeStrongInterface(iSetPermissionTokenCallback);
                    this.mRemote.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.health.platform.client.impl.sdkservice.IHealthDataSdkService
            public void getPermissionToken(String str, IGetPermissionTokenCallback iGetPermissionTokenCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IHealthDataSdkService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeStrongInterface(iGetPermissionTokenCallback);
                    this.mRemote.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.health.platform.client.impl.sdkservice.IHealthDataSdkService
            public void getIsInForeground(String str, IGetIsInForegroundCallback iGetIsInForegroundCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IHealthDataSdkService.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeStrongInterface(iGetIsInForegroundCallback);
                    this.mRemote.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }
    }
}
