package com.samsung.android.sdk.health.data;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.samsung.android.sdk.health.data.internal.CompletableCallback;
import com.samsung.android.sdk.health.data.internal.ConnectionResponse;
import com.samsung.android.sdk.health.data.internal.SingleCallback;
import com.samsung.android.sdk.health.data.permission.Permission;
import com.samsung.android.sdk.health.data.request.AggregateRequest;
import com.samsung.android.sdk.health.data.request.AssociatedReadRequest;
import com.samsung.android.sdk.health.data.request.ChangedDataRequest;
import com.samsung.android.sdk.health.data.request.DeleteDataRequest;
import com.samsung.android.sdk.health.data.request.DeviceRegistrationRequest;
import com.samsung.android.sdk.health.data.request.InsertDataRequest;
import com.samsung.android.sdk.health.data.request.ReadDataRequest;
import com.samsung.android.sdk.health.data.request.UpdateDataRequest;
import com.samsung.android.sdk.health.data.response.DataResponse;
import com.samsung.android.sdk.health.data.response.DeviceResponse;
import java.util.List;

/* loaded from: classes5.dex */
public interface IHealthDataStore extends IInterface {

    public static class Default implements IHealthDataStore {
        @Override // com.samsung.android.sdk.health.data.IHealthDataStore
        public void aggregateData(String str, AggregateRequest aggregateRequest, SingleCallback<DataResponse> singleCallback) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.samsung.android.sdk.health.data.IHealthDataStore
        public void connectInternal(String str, SingleCallback<ConnectionResponse> singleCallback) throws RemoteException {
        }

        @Override // com.samsung.android.sdk.health.data.IHealthDataStore
        public void deleteData(String str, DeleteDataRequest deleteDataRequest, CompletableCallback completableCallback) throws RemoteException {
        }

        @Override // com.samsung.android.sdk.health.data.IHealthDataStore
        public void getDevice(String str, String str2, SingleCallback<DeviceResponse> singleCallback) throws RemoteException {
        }

        @Override // com.samsung.android.sdk.health.data.IHealthDataStore
        public void getDevice2(String str, int i, String str2, SingleCallback<DeviceResponse> singleCallback) throws RemoteException {
        }

        @Override // com.samsung.android.sdk.health.data.IHealthDataStore
        public void getDeviceBySeed(String str, String str2, SingleCallback<DeviceResponse> singleCallback) throws RemoteException {
        }

        @Override // com.samsung.android.sdk.health.data.IHealthDataStore
        public void getDeviceBySeed2(String str, int i, String str2, SingleCallback<DeviceResponse> singleCallback) throws RemoteException {
        }

        @Override // com.samsung.android.sdk.health.data.IHealthDataStore
        public void getDevices(String str, int i, int i2, SingleCallback<DeviceResponse> singleCallback) throws RemoteException {
        }

        @Override // com.samsung.android.sdk.health.data.IHealthDataStore
        public void getDevices2(String str, int i, int i2, int i3, SingleCallback<DeviceResponse> singleCallback) throws RemoteException {
        }

        @Override // com.samsung.android.sdk.health.data.IHealthDataStore
        public void getDevicesByManufacturer(String str, String str2, SingleCallback<DeviceResponse> singleCallback) throws RemoteException {
        }

        @Override // com.samsung.android.sdk.health.data.IHealthDataStore
        public void getDevicesByManufacturer2(String str, int i, String str2, SingleCallback<DeviceResponse> singleCallback) throws RemoteException {
        }

        @Override // com.samsung.android.sdk.health.data.IHealthDataStore
        public void getDevicesByModel(String str, String str2, SingleCallback<DeviceResponse> singleCallback) throws RemoteException {
        }

        @Override // com.samsung.android.sdk.health.data.IHealthDataStore
        public void getDevicesByModel2(String str, int i, String str2, SingleCallback<DeviceResponse> singleCallback) throws RemoteException {
        }

        @Override // com.samsung.android.sdk.health.data.IHealthDataStore
        public void getGrantedPermissions(String str, List<Permission> list, SingleCallback<List<Permission>> singleCallback) throws RemoteException {
        }

        @Override // com.samsung.android.sdk.health.data.IHealthDataStore
        public void getLocalDevice(String str, SingleCallback<DeviceResponse> singleCallback) throws RemoteException {
        }

        @Override // com.samsung.android.sdk.health.data.IHealthDataStore
        public void getLocalDevice2(String str, int i, SingleCallback<DeviceResponse> singleCallback) throws RemoteException {
        }

        @Override // com.samsung.android.sdk.health.data.IHealthDataStore
        public void getOwnDevices(String str, SingleCallback<DeviceResponse> singleCallback) throws RemoteException {
        }

        @Override // com.samsung.android.sdk.health.data.IHealthDataStore
        public void getOwnDevices2(String str, int i, SingleCallback<DeviceResponse> singleCallback) throws RemoteException {
        }

        @Override // com.samsung.android.sdk.health.data.IHealthDataStore
        public void insertData(String str, InsertDataRequest insertDataRequest, CompletableCallback completableCallback) throws RemoteException {
        }

        @Override // com.samsung.android.sdk.health.data.IHealthDataStore
        public void readAssociatedData(String str, AssociatedReadRequest associatedReadRequest, SingleCallback<DataResponse> singleCallback) throws RemoteException {
        }

        @Override // com.samsung.android.sdk.health.data.IHealthDataStore
        public void readChanges(String str, ChangedDataRequest changedDataRequest, SingleCallback<DataResponse> singleCallback) throws RemoteException {
        }

        @Override // com.samsung.android.sdk.health.data.IHealthDataStore
        public void readData(String str, ReadDataRequest readDataRequest, SingleCallback<DataResponse> singleCallback) throws RemoteException {
        }

        @Override // com.samsung.android.sdk.health.data.IHealthDataStore
        public void registerDataChangeNotification(String str, String str2, String str3, CompletableCallback completableCallback) throws RemoteException {
        }

        @Override // com.samsung.android.sdk.health.data.IHealthDataStore
        public void registerDevice(String str, DeviceRegistrationRequest deviceRegistrationRequest, SingleCallback<String> singleCallback) throws RemoteException {
        }

        @Override // com.samsung.android.sdk.health.data.IHealthDataStore
        public Intent requestPermissions(String str, List<Permission> list, SingleCallback<List<Permission>> singleCallback) throws RemoteException {
            return null;
        }

        @Override // com.samsung.android.sdk.health.data.IHealthDataStore
        public void unregisterDataChangeNotification(String str, String str2, CompletableCallback completableCallback) throws RemoteException {
        }

        @Override // com.samsung.android.sdk.health.data.IHealthDataStore
        public void updateData(String str, UpdateDataRequest updateDataRequest, CompletableCallback completableCallback) throws RemoteException {
        }
    }

    public static abstract class Stub extends Binder implements IHealthDataStore {
        public Stub() {
            attachInterface(this, "com.samsung.android.sdk.health.data.IHealthDataStore");
        }

        public static IHealthDataStore asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.samsung.android.sdk.health.data.IHealthDataStore");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IHealthDataStore)) ? new x0(iBinder) : (IHealthDataStore) queryLocalInterface;
        }

        public static IHealthDataStore getDefaultImpl() {
            return x0.b;
        }

        public static boolean setDefaultImpl(IHealthDataStore iHealthDataStore) {
            if (x0.b != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iHealthDataStore == null) {
                return false;
            }
            x0.b = iHealthDataStore;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString("com.samsung.android.sdk.health.data.IHealthDataStore");
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.samsung.android.sdk.health.data.IHealthDataStore");
                    connectInternal(parcel.readString(), parcel.readInt() != 0 ? SingleCallback.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 2:
                    parcel.enforceInterface("com.samsung.android.sdk.health.data.IHealthDataStore");
                    getGrantedPermissions(parcel.readString(), parcel.createTypedArrayList(Permission.CREATOR), parcel.readInt() != 0 ? SingleCallback.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 3:
                    parcel.enforceInterface("com.samsung.android.sdk.health.data.IHealthDataStore");
                    Intent requestPermissions = requestPermissions(parcel.readString(), parcel.createTypedArrayList(Permission.CREATOR), parcel.readInt() != 0 ? SingleCallback.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (requestPermissions != null) {
                        parcel2.writeInt(1);
                        requestPermissions.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 4:
                    parcel.enforceInterface("com.samsung.android.sdk.health.data.IHealthDataStore");
                    readData(parcel.readString(), parcel.readInt() != 0 ? ReadDataRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? SingleCallback.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 5:
                    parcel.enforceInterface("com.samsung.android.sdk.health.data.IHealthDataStore");
                    readAssociatedData(parcel.readString(), parcel.readInt() != 0 ? AssociatedReadRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? SingleCallback.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 6:
                    parcel.enforceInterface("com.samsung.android.sdk.health.data.IHealthDataStore");
                    aggregateData(parcel.readString(), parcel.readInt() != 0 ? AggregateRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? SingleCallback.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 7:
                    parcel.enforceInterface("com.samsung.android.sdk.health.data.IHealthDataStore");
                    insertData(parcel.readString(), parcel.readInt() != 0 ? InsertDataRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? CompletableCallback.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 8:
                    parcel.enforceInterface("com.samsung.android.sdk.health.data.IHealthDataStore");
                    updateData(parcel.readString(), parcel.readInt() != 0 ? UpdateDataRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? CompletableCallback.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 9:
                    parcel.enforceInterface("com.samsung.android.sdk.health.data.IHealthDataStore");
                    deleteData(parcel.readString(), parcel.readInt() != 0 ? DeleteDataRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? CompletableCallback.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 10:
                    parcel.enforceInterface("com.samsung.android.sdk.health.data.IHealthDataStore");
                    getLocalDevice(parcel.readString(), parcel.readInt() != 0 ? SingleCallback.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 11:
                    parcel.enforceInterface("com.samsung.android.sdk.health.data.IHealthDataStore");
                    getDevice(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? SingleCallback.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 12:
                    parcel.enforceInterface("com.samsung.android.sdk.health.data.IHealthDataStore");
                    registerDataChangeNotification(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? CompletableCallback.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 13:
                    parcel.enforceInterface("com.samsung.android.sdk.health.data.IHealthDataStore");
                    unregisterDataChangeNotification(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? CompletableCallback.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 14:
                    parcel.enforceInterface("com.samsung.android.sdk.health.data.IHealthDataStore");
                    readChanges(parcel.readString(), parcel.readInt() != 0 ? ChangedDataRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? SingleCallback.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 15:
                    parcel.enforceInterface("com.samsung.android.sdk.health.data.IHealthDataStore");
                    getDevices(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0 ? SingleCallback.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 16:
                    parcel.enforceInterface("com.samsung.android.sdk.health.data.IHealthDataStore");
                    getDevicesByModel(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? SingleCallback.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 17:
                    parcel.enforceInterface("com.samsung.android.sdk.health.data.IHealthDataStore");
                    getDevicesByManufacturer(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? SingleCallback.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 18:
                    parcel.enforceInterface("com.samsung.android.sdk.health.data.IHealthDataStore");
                    getOwnDevices(parcel.readString(), parcel.readInt() != 0 ? SingleCallback.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 19:
                    parcel.enforceInterface("com.samsung.android.sdk.health.data.IHealthDataStore");
                    registerDevice(parcel.readString(), parcel.readInt() != 0 ? DeviceRegistrationRequest.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? SingleCallback.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 20:
                    parcel.enforceInterface("com.samsung.android.sdk.health.data.IHealthDataStore");
                    getDeviceBySeed(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? SingleCallback.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 21:
                    parcel.enforceInterface("com.samsung.android.sdk.health.data.IHealthDataStore");
                    getDevice2(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? SingleCallback.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 22:
                    parcel.enforceInterface("com.samsung.android.sdk.health.data.IHealthDataStore");
                    getLocalDevice2(parcel.readString(), parcel.readInt(), parcel.readInt() != 0 ? SingleCallback.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 23:
                    parcel.enforceInterface("com.samsung.android.sdk.health.data.IHealthDataStore");
                    getDevices2(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0 ? SingleCallback.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 24:
                    parcel.enforceInterface("com.samsung.android.sdk.health.data.IHealthDataStore");
                    getDevicesByModel2(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? SingleCallback.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 25:
                    parcel.enforceInterface("com.samsung.android.sdk.health.data.IHealthDataStore");
                    getDevicesByManufacturer2(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? SingleCallback.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 26:
                    parcel.enforceInterface("com.samsung.android.sdk.health.data.IHealthDataStore");
                    getOwnDevices2(parcel.readString(), parcel.readInt(), parcel.readInt() != 0 ? SingleCallback.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 27:
                    parcel.enforceInterface("com.samsung.android.sdk.health.data.IHealthDataStore");
                    getDeviceBySeed2(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? SingleCallback.CREATOR.createFromParcel(parcel) : null);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void aggregateData(String str, AggregateRequest aggregateRequest, SingleCallback<DataResponse> singleCallback) throws RemoteException;

    void connectInternal(String str, SingleCallback<ConnectionResponse> singleCallback) throws RemoteException;

    void deleteData(String str, DeleteDataRequest deleteDataRequest, CompletableCallback completableCallback) throws RemoteException;

    void getDevice(String str, String str2, SingleCallback<DeviceResponse> singleCallback) throws RemoteException;

    void getDevice2(String str, int i, String str2, SingleCallback<DeviceResponse> singleCallback) throws RemoteException;

    void getDeviceBySeed(String str, String str2, SingleCallback<DeviceResponse> singleCallback) throws RemoteException;

    void getDeviceBySeed2(String str, int i, String str2, SingleCallback<DeviceResponse> singleCallback) throws RemoteException;

    void getDevices(String str, int i, int i2, SingleCallback<DeviceResponse> singleCallback) throws RemoteException;

    void getDevices2(String str, int i, int i2, int i3, SingleCallback<DeviceResponse> singleCallback) throws RemoteException;

    void getDevicesByManufacturer(String str, String str2, SingleCallback<DeviceResponse> singleCallback) throws RemoteException;

    void getDevicesByManufacturer2(String str, int i, String str2, SingleCallback<DeviceResponse> singleCallback) throws RemoteException;

    void getDevicesByModel(String str, String str2, SingleCallback<DeviceResponse> singleCallback) throws RemoteException;

    void getDevicesByModel2(String str, int i, String str2, SingleCallback<DeviceResponse> singleCallback) throws RemoteException;

    void getGrantedPermissions(String str, List<Permission> list, SingleCallback<List<Permission>> singleCallback) throws RemoteException;

    void getLocalDevice(String str, SingleCallback<DeviceResponse> singleCallback) throws RemoteException;

    void getLocalDevice2(String str, int i, SingleCallback<DeviceResponse> singleCallback) throws RemoteException;

    void getOwnDevices(String str, SingleCallback<DeviceResponse> singleCallback) throws RemoteException;

    void getOwnDevices2(String str, int i, SingleCallback<DeviceResponse> singleCallback) throws RemoteException;

    void insertData(String str, InsertDataRequest insertDataRequest, CompletableCallback completableCallback) throws RemoteException;

    void readAssociatedData(String str, AssociatedReadRequest associatedReadRequest, SingleCallback<DataResponse> singleCallback) throws RemoteException;

    void readChanges(String str, ChangedDataRequest changedDataRequest, SingleCallback<DataResponse> singleCallback) throws RemoteException;

    void readData(String str, ReadDataRequest readDataRequest, SingleCallback<DataResponse> singleCallback) throws RemoteException;

    void registerDataChangeNotification(String str, String str2, String str3, CompletableCallback completableCallback) throws RemoteException;

    void registerDevice(String str, DeviceRegistrationRequest deviceRegistrationRequest, SingleCallback<String> singleCallback) throws RemoteException;

    Intent requestPermissions(String str, List<Permission> list, SingleCallback<List<Permission>> singleCallback) throws RemoteException;

    void unregisterDataChangeNotification(String str, String str2, CompletableCallback completableCallback) throws RemoteException;

    void updateData(String str, UpdateDataRequest updateDataRequest, CompletableCallback completableCallback) throws RemoteException;
}
