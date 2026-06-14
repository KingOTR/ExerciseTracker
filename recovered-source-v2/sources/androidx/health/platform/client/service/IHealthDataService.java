package androidx.health.platform.client.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.health.platform.client.permission.Permission;
import androidx.health.platform.client.request.AggregateDataRequest;
import androidx.health.platform.client.request.DeleteDataRangeRequest;
import androidx.health.platform.client.request.DeleteDataRequest;
import androidx.health.platform.client.request.GetChangesRequest;
import androidx.health.platform.client.request.GetChangesTokenRequest;
import androidx.health.platform.client.request.ReadDataRangeRequest;
import androidx.health.platform.client.request.ReadDataRequest;
import androidx.health.platform.client.request.ReadExerciseRouteRequest;
import androidx.health.platform.client.request.RegisterForDataNotificationsRequest;
import androidx.health.platform.client.request.RequestContext;
import androidx.health.platform.client.request.UnregisterFromDataNotificationsRequest;
import androidx.health.platform.client.request.UpsertDataRequest;
import androidx.health.platform.client.request.UpsertExerciseRouteRequest;
import androidx.health.platform.client.service.IAggregateDataCallback;
import androidx.health.platform.client.service.IDeleteDataCallback;
import androidx.health.platform.client.service.IDeleteDataRangeCallback;
import androidx.health.platform.client.service.IFilterGrantedPermissionsCallback;
import androidx.health.platform.client.service.IGetChangesCallback;
import androidx.health.platform.client.service.IGetChangesTokenCallback;
import androidx.health.platform.client.service.IGetGrantedPermissionsCallback;
import androidx.health.platform.client.service.IInsertDataCallback;
import androidx.health.platform.client.service.IReadDataCallback;
import androidx.health.platform.client.service.IReadDataRangeCallback;
import androidx.health.platform.client.service.IReadExerciseRouteCallback;
import androidx.health.platform.client.service.IRegisterForDataNotificationsCallback;
import androidx.health.platform.client.service.IRevokeAllPermissionsCallback;
import androidx.health.platform.client.service.IUnregisterFromDataNotificationsCallback;
import androidx.health.platform.client.service.IUpdateDataCallback;
import androidx.health.platform.client.service.IUpsertExerciseRouteCallback;
import java.util.List;

/* loaded from: classes2.dex */
public interface IHealthDataService extends IInterface {
    public static final int CURRENT_API_VERSION = 5;
    public static final String DESCRIPTOR = "androidx.health.platform.client.service.IHealthDataService";
    public static final int MIN_API_VERSION = 1;

    public static class Default implements IHealthDataService {
        @Override // androidx.health.platform.client.service.IHealthDataService
        public void aggregate(RequestContext requestContext, AggregateDataRequest aggregateDataRequest, IAggregateDataCallback iAggregateDataCallback) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // androidx.health.platform.client.service.IHealthDataService
        public void deleteData(RequestContext requestContext, DeleteDataRequest deleteDataRequest, IDeleteDataCallback iDeleteDataCallback) throws RemoteException {
        }

        @Override // androidx.health.platform.client.service.IHealthDataService
        public void deleteDataRange(RequestContext requestContext, DeleteDataRangeRequest deleteDataRangeRequest, IDeleteDataRangeCallback iDeleteDataRangeCallback) throws RemoteException {
        }

        @Override // androidx.health.platform.client.service.IHealthDataService
        public void filterGrantedPermissions(RequestContext requestContext, List<Permission> list, IFilterGrantedPermissionsCallback iFilterGrantedPermissionsCallback) throws RemoteException {
        }

        @Override // androidx.health.platform.client.service.IHealthDataService
        public int getApiVersion() throws RemoteException {
            return 0;
        }

        @Override // androidx.health.platform.client.service.IHealthDataService
        public void getChanges(RequestContext requestContext, GetChangesRequest getChangesRequest, IGetChangesCallback iGetChangesCallback) throws RemoteException {
        }

        @Override // androidx.health.platform.client.service.IHealthDataService
        public void getChangesToken(RequestContext requestContext, GetChangesTokenRequest getChangesTokenRequest, IGetChangesTokenCallback iGetChangesTokenCallback) throws RemoteException {
        }

        @Override // androidx.health.platform.client.service.IHealthDataService
        public void getGrantedPermissions(RequestContext requestContext, List<Permission> list, IGetGrantedPermissionsCallback iGetGrantedPermissionsCallback) throws RemoteException {
        }

        @Override // androidx.health.platform.client.service.IHealthDataService
        public void insertData(RequestContext requestContext, UpsertDataRequest upsertDataRequest, IInsertDataCallback iInsertDataCallback) throws RemoteException {
        }

        @Override // androidx.health.platform.client.service.IHealthDataService
        public void readData(RequestContext requestContext, ReadDataRequest readDataRequest, IReadDataCallback iReadDataCallback) throws RemoteException {
        }

        @Override // androidx.health.platform.client.service.IHealthDataService
        public void readDataRange(RequestContext requestContext, ReadDataRangeRequest readDataRangeRequest, IReadDataRangeCallback iReadDataRangeCallback) throws RemoteException {
        }

        @Override // androidx.health.platform.client.service.IHealthDataService
        public void readExerciseRoute(RequestContext requestContext, ReadExerciseRouteRequest readExerciseRouteRequest, IReadExerciseRouteCallback iReadExerciseRouteCallback) throws RemoteException {
        }

        @Override // androidx.health.platform.client.service.IHealthDataService
        public void registerForDataNotifications(RequestContext requestContext, RegisterForDataNotificationsRequest registerForDataNotificationsRequest, IRegisterForDataNotificationsCallback iRegisterForDataNotificationsCallback) throws RemoteException {
        }

        @Override // androidx.health.platform.client.service.IHealthDataService
        public void revokeAllPermissions(RequestContext requestContext, IRevokeAllPermissionsCallback iRevokeAllPermissionsCallback) throws RemoteException {
        }

        @Override // androidx.health.platform.client.service.IHealthDataService
        public void unregisterFromDataNotifications(RequestContext requestContext, UnregisterFromDataNotificationsRequest unregisterFromDataNotificationsRequest, IUnregisterFromDataNotificationsCallback iUnregisterFromDataNotificationsCallback) throws RemoteException {
        }

        @Override // androidx.health.platform.client.service.IHealthDataService
        public void updateData(RequestContext requestContext, UpsertDataRequest upsertDataRequest, IUpdateDataCallback iUpdateDataCallback) throws RemoteException {
        }

        @Override // androidx.health.platform.client.service.IHealthDataService
        public void upsertExerciseRoute(RequestContext requestContext, UpsertExerciseRouteRequest upsertExerciseRouteRequest, IUpsertExerciseRouteCallback iUpsertExerciseRouteCallback) throws RemoteException {
        }
    }

    void aggregate(RequestContext requestContext, AggregateDataRequest aggregateDataRequest, IAggregateDataCallback iAggregateDataCallback) throws RemoteException;

    void deleteData(RequestContext requestContext, DeleteDataRequest deleteDataRequest, IDeleteDataCallback iDeleteDataCallback) throws RemoteException;

    void deleteDataRange(RequestContext requestContext, DeleteDataRangeRequest deleteDataRangeRequest, IDeleteDataRangeCallback iDeleteDataRangeCallback) throws RemoteException;

    void filterGrantedPermissions(RequestContext requestContext, List<Permission> list, IFilterGrantedPermissionsCallback iFilterGrantedPermissionsCallback) throws RemoteException;

    int getApiVersion() throws RemoteException;

    void getChanges(RequestContext requestContext, GetChangesRequest getChangesRequest, IGetChangesCallback iGetChangesCallback) throws RemoteException;

    void getChangesToken(RequestContext requestContext, GetChangesTokenRequest getChangesTokenRequest, IGetChangesTokenCallback iGetChangesTokenCallback) throws RemoteException;

    void getGrantedPermissions(RequestContext requestContext, List<Permission> list, IGetGrantedPermissionsCallback iGetGrantedPermissionsCallback) throws RemoteException;

    void insertData(RequestContext requestContext, UpsertDataRequest upsertDataRequest, IInsertDataCallback iInsertDataCallback) throws RemoteException;

    void readData(RequestContext requestContext, ReadDataRequest readDataRequest, IReadDataCallback iReadDataCallback) throws RemoteException;

    void readDataRange(RequestContext requestContext, ReadDataRangeRequest readDataRangeRequest, IReadDataRangeCallback iReadDataRangeCallback) throws RemoteException;

    void readExerciseRoute(RequestContext requestContext, ReadExerciseRouteRequest readExerciseRouteRequest, IReadExerciseRouteCallback iReadExerciseRouteCallback) throws RemoteException;

    void registerForDataNotifications(RequestContext requestContext, RegisterForDataNotificationsRequest registerForDataNotificationsRequest, IRegisterForDataNotificationsCallback iRegisterForDataNotificationsCallback) throws RemoteException;

    void revokeAllPermissions(RequestContext requestContext, IRevokeAllPermissionsCallback iRevokeAllPermissionsCallback) throws RemoteException;

    void unregisterFromDataNotifications(RequestContext requestContext, UnregisterFromDataNotificationsRequest unregisterFromDataNotificationsRequest, IUnregisterFromDataNotificationsCallback iUnregisterFromDataNotificationsCallback) throws RemoteException;

    void updateData(RequestContext requestContext, UpsertDataRequest upsertDataRequest, IUpdateDataCallback iUpdateDataCallback) throws RemoteException;

    void upsertExerciseRoute(RequestContext requestContext, UpsertExerciseRouteRequest upsertExerciseRouteRequest, IUpsertExerciseRouteCallback iUpsertExerciseRouteCallback) throws RemoteException;

    public static abstract class Stub extends Binder implements IHealthDataService {
        static final int TRANSACTION_aggregate = 15;
        static final int TRANSACTION_deleteData = 11;
        static final int TRANSACTION_deleteDataRange = 14;
        static final int TRANSACTION_filterGrantedPermissions = 23;
        static final int TRANSACTION_getApiVersion = 1;
        static final int TRANSACTION_getChanges = 18;
        static final int TRANSACTION_getChangesToken = 17;
        static final int TRANSACTION_getGrantedPermissions = 4;
        static final int TRANSACTION_insertData = 10;
        static final int TRANSACTION_readData = 12;
        static final int TRANSACTION_readDataRange = 16;
        static final int TRANSACTION_readExerciseRoute = 22;
        static final int TRANSACTION_registerForDataNotifications = 19;
        static final int TRANSACTION_revokeAllPermissions = 9;
        static final int TRANSACTION_unregisterFromDataNotifications = 20;
        static final int TRANSACTION_updateData = 13;
        static final int TRANSACTION_upsertExerciseRoute = 21;

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, IHealthDataService.DESCRIPTOR);
        }

        public static IHealthDataService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IHealthDataService.DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IHealthDataService)) {
                return (IHealthDataService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(IHealthDataService.DESCRIPTOR);
            }
            if (i == 1598968902) {
                parcel2.writeString(IHealthDataService.DESCRIPTOR);
                return true;
            }
            if (i == 1) {
                int apiVersion = getApiVersion();
                parcel2.writeNoException();
                parcel2.writeInt(apiVersion);
            } else if (i == 4) {
                getGrantedPermissions((RequestContext) _Parcel.readTypedObject(parcel, RequestContext.CREATOR), parcel.createTypedArrayList(Permission.CREATOR), IGetGrantedPermissionsCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel2.writeNoException();
            } else {
                switch (i) {
                    case 9:
                        revokeAllPermissions((RequestContext) _Parcel.readTypedObject(parcel, RequestContext.CREATOR), IRevokeAllPermissionsCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 10:
                        insertData((RequestContext) _Parcel.readTypedObject(parcel, RequestContext.CREATOR), (UpsertDataRequest) _Parcel.readTypedObject(parcel, UpsertDataRequest.CREATOR), IInsertDataCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 11:
                        deleteData((RequestContext) _Parcel.readTypedObject(parcel, RequestContext.CREATOR), (DeleteDataRequest) _Parcel.readTypedObject(parcel, DeleteDataRequest.CREATOR), IDeleteDataCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 12:
                        readData((RequestContext) _Parcel.readTypedObject(parcel, RequestContext.CREATOR), (ReadDataRequest) _Parcel.readTypedObject(parcel, ReadDataRequest.CREATOR), IReadDataCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 13:
                        updateData((RequestContext) _Parcel.readTypedObject(parcel, RequestContext.CREATOR), (UpsertDataRequest) _Parcel.readTypedObject(parcel, UpsertDataRequest.CREATOR), IUpdateDataCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 14:
                        deleteDataRange((RequestContext) _Parcel.readTypedObject(parcel, RequestContext.CREATOR), (DeleteDataRangeRequest) _Parcel.readTypedObject(parcel, DeleteDataRangeRequest.CREATOR), IDeleteDataRangeCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 15:
                        aggregate((RequestContext) _Parcel.readTypedObject(parcel, RequestContext.CREATOR), (AggregateDataRequest) _Parcel.readTypedObject(parcel, AggregateDataRequest.CREATOR), IAggregateDataCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 16:
                        readDataRange((RequestContext) _Parcel.readTypedObject(parcel, RequestContext.CREATOR), (ReadDataRangeRequest) _Parcel.readTypedObject(parcel, ReadDataRangeRequest.CREATOR), IReadDataRangeCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 17:
                        getChangesToken((RequestContext) _Parcel.readTypedObject(parcel, RequestContext.CREATOR), (GetChangesTokenRequest) _Parcel.readTypedObject(parcel, GetChangesTokenRequest.CREATOR), IGetChangesTokenCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 18:
                        getChanges((RequestContext) _Parcel.readTypedObject(parcel, RequestContext.CREATOR), (GetChangesRequest) _Parcel.readTypedObject(parcel, GetChangesRequest.CREATOR), IGetChangesCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 19:
                        registerForDataNotifications((RequestContext) _Parcel.readTypedObject(parcel, RequestContext.CREATOR), (RegisterForDataNotificationsRequest) _Parcel.readTypedObject(parcel, RegisterForDataNotificationsRequest.CREATOR), IRegisterForDataNotificationsCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 20:
                        unregisterFromDataNotifications((RequestContext) _Parcel.readTypedObject(parcel, RequestContext.CREATOR), (UnregisterFromDataNotificationsRequest) _Parcel.readTypedObject(parcel, UnregisterFromDataNotificationsRequest.CREATOR), IUnregisterFromDataNotificationsCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 21:
                        upsertExerciseRoute((RequestContext) _Parcel.readTypedObject(parcel, RequestContext.CREATOR), (UpsertExerciseRouteRequest) _Parcel.readTypedObject(parcel, UpsertExerciseRouteRequest.CREATOR), IUpsertExerciseRouteCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 22:
                        readExerciseRoute((RequestContext) _Parcel.readTypedObject(parcel, RequestContext.CREATOR), (ReadExerciseRouteRequest) _Parcel.readTypedObject(parcel, ReadExerciseRouteRequest.CREATOR), IReadExerciseRouteCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    case 23:
                        filterGrantedPermissions((RequestContext) _Parcel.readTypedObject(parcel, RequestContext.CREATOR), parcel.createTypedArrayList(Permission.CREATOR), IFilterGrantedPermissionsCallback.Stub.asInterface(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        break;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            return true;
        }

        private static class Proxy implements IHealthDataService {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IHealthDataService.DESCRIPTOR;
            }

            @Override // androidx.health.platform.client.service.IHealthDataService
            public int getApiVersion() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IHealthDataService.DESCRIPTOR);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.health.platform.client.service.IHealthDataService
            public void getGrantedPermissions(RequestContext requestContext, List<Permission> list, IGetGrantedPermissionsCallback iGetGrantedPermissionsCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IHealthDataService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, requestContext, 0);
                    _Parcel.writeTypedList(obtain, list, 0);
                    obtain.writeStrongInterface(iGetGrantedPermissionsCallback);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.health.platform.client.service.IHealthDataService
            public void filterGrantedPermissions(RequestContext requestContext, List<Permission> list, IFilterGrantedPermissionsCallback iFilterGrantedPermissionsCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IHealthDataService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, requestContext, 0);
                    _Parcel.writeTypedList(obtain, list, 0);
                    obtain.writeStrongInterface(iFilterGrantedPermissionsCallback);
                    this.mRemote.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.health.platform.client.service.IHealthDataService
            public void revokeAllPermissions(RequestContext requestContext, IRevokeAllPermissionsCallback iRevokeAllPermissionsCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IHealthDataService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, requestContext, 0);
                    obtain.writeStrongInterface(iRevokeAllPermissionsCallback);
                    this.mRemote.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.health.platform.client.service.IHealthDataService
            public void insertData(RequestContext requestContext, UpsertDataRequest upsertDataRequest, IInsertDataCallback iInsertDataCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IHealthDataService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, requestContext, 0);
                    _Parcel.writeTypedObject(obtain, upsertDataRequest, 0);
                    obtain.writeStrongInterface(iInsertDataCallback);
                    this.mRemote.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.health.platform.client.service.IHealthDataService
            public void deleteData(RequestContext requestContext, DeleteDataRequest deleteDataRequest, IDeleteDataCallback iDeleteDataCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IHealthDataService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, requestContext, 0);
                    _Parcel.writeTypedObject(obtain, deleteDataRequest, 0);
                    obtain.writeStrongInterface(iDeleteDataCallback);
                    this.mRemote.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.health.platform.client.service.IHealthDataService
            public void deleteDataRange(RequestContext requestContext, DeleteDataRangeRequest deleteDataRangeRequest, IDeleteDataRangeCallback iDeleteDataRangeCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IHealthDataService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, requestContext, 0);
                    _Parcel.writeTypedObject(obtain, deleteDataRangeRequest, 0);
                    obtain.writeStrongInterface(iDeleteDataRangeCallback);
                    this.mRemote.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.health.platform.client.service.IHealthDataService
            public void readData(RequestContext requestContext, ReadDataRequest readDataRequest, IReadDataCallback iReadDataCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IHealthDataService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, requestContext, 0);
                    _Parcel.writeTypedObject(obtain, readDataRequest, 0);
                    obtain.writeStrongInterface(iReadDataCallback);
                    this.mRemote.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.health.platform.client.service.IHealthDataService
            public void readDataRange(RequestContext requestContext, ReadDataRangeRequest readDataRangeRequest, IReadDataRangeCallback iReadDataRangeCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IHealthDataService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, requestContext, 0);
                    _Parcel.writeTypedObject(obtain, readDataRangeRequest, 0);
                    obtain.writeStrongInterface(iReadDataRangeCallback);
                    this.mRemote.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.health.platform.client.service.IHealthDataService
            public void updateData(RequestContext requestContext, UpsertDataRequest upsertDataRequest, IUpdateDataCallback iUpdateDataCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IHealthDataService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, requestContext, 0);
                    _Parcel.writeTypedObject(obtain, upsertDataRequest, 0);
                    obtain.writeStrongInterface(iUpdateDataCallback);
                    this.mRemote.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.health.platform.client.service.IHealthDataService
            public void aggregate(RequestContext requestContext, AggregateDataRequest aggregateDataRequest, IAggregateDataCallback iAggregateDataCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IHealthDataService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, requestContext, 0);
                    _Parcel.writeTypedObject(obtain, aggregateDataRequest, 0);
                    obtain.writeStrongInterface(iAggregateDataCallback);
                    this.mRemote.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.health.platform.client.service.IHealthDataService
            public void getChangesToken(RequestContext requestContext, GetChangesTokenRequest getChangesTokenRequest, IGetChangesTokenCallback iGetChangesTokenCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IHealthDataService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, requestContext, 0);
                    _Parcel.writeTypedObject(obtain, getChangesTokenRequest, 0);
                    obtain.writeStrongInterface(iGetChangesTokenCallback);
                    this.mRemote.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.health.platform.client.service.IHealthDataService
            public void getChanges(RequestContext requestContext, GetChangesRequest getChangesRequest, IGetChangesCallback iGetChangesCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IHealthDataService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, requestContext, 0);
                    _Parcel.writeTypedObject(obtain, getChangesRequest, 0);
                    obtain.writeStrongInterface(iGetChangesCallback);
                    this.mRemote.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.health.platform.client.service.IHealthDataService
            public void registerForDataNotifications(RequestContext requestContext, RegisterForDataNotificationsRequest registerForDataNotificationsRequest, IRegisterForDataNotificationsCallback iRegisterForDataNotificationsCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IHealthDataService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, requestContext, 0);
                    _Parcel.writeTypedObject(obtain, registerForDataNotificationsRequest, 0);
                    obtain.writeStrongInterface(iRegisterForDataNotificationsCallback);
                    this.mRemote.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.health.platform.client.service.IHealthDataService
            public void unregisterFromDataNotifications(RequestContext requestContext, UnregisterFromDataNotificationsRequest unregisterFromDataNotificationsRequest, IUnregisterFromDataNotificationsCallback iUnregisterFromDataNotificationsCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IHealthDataService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, requestContext, 0);
                    _Parcel.writeTypedObject(obtain, unregisterFromDataNotificationsRequest, 0);
                    obtain.writeStrongInterface(iUnregisterFromDataNotificationsCallback);
                    this.mRemote.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.health.platform.client.service.IHealthDataService
            public void upsertExerciseRoute(RequestContext requestContext, UpsertExerciseRouteRequest upsertExerciseRouteRequest, IUpsertExerciseRouteCallback iUpsertExerciseRouteCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IHealthDataService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, requestContext, 0);
                    _Parcel.writeTypedObject(obtain, upsertExerciseRouteRequest, 0);
                    obtain.writeStrongInterface(iUpsertExerciseRouteCallback);
                    this.mRemote.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.health.platform.client.service.IHealthDataService
            public void readExerciseRoute(RequestContext requestContext, ReadExerciseRouteRequest readExerciseRouteRequest, IReadExerciseRouteCallback iReadExerciseRouteCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IHealthDataService.DESCRIPTOR);
                    _Parcel.writeTypedObject(obtain, requestContext, 0);
                    _Parcel.writeTypedObject(obtain, readExerciseRouteRequest, 0);
                    obtain.writeStrongInterface(iReadExerciseRouteCallback);
                    this.mRemote.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
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

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedList(Parcel parcel, List<T> list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                writeTypedObject(parcel, list.get(i2), i);
            }
        }
    }
}
