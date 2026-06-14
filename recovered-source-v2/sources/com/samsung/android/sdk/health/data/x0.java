package com.samsung.android.sdk.health.data;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import com.samsung.android.sdk.health.data.IHealthDataStore;
import com.samsung.android.sdk.health.data.internal.CompletableCallback;
import com.samsung.android.sdk.health.data.internal.SingleCallback;
import com.samsung.android.sdk.health.data.request.AggregateRequest;
import com.samsung.android.sdk.health.data.request.AssociatedReadRequest;
import com.samsung.android.sdk.health.data.request.ChangedDataRequest;
import com.samsung.android.sdk.health.data.request.DeleteDataRequest;
import com.samsung.android.sdk.health.data.request.DeviceRegistrationRequest;
import com.samsung.android.sdk.health.data.request.InsertDataRequest;
import com.samsung.android.sdk.health.data.request.ReadDataRequest;
import com.samsung.android.sdk.health.data.request.UpdateDataRequest;
import java.util.List;

/* loaded from: classes5.dex */
public final class x0 implements IHealthDataStore {
    public static IHealthDataStore b;
    public final IBinder a;

    public x0(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // com.samsung.android.sdk.health.data.IHealthDataStore
    public final void aggregateData(String str, AggregateRequest aggregateRequest, SingleCallback singleCallback) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.samsung.android.sdk.health.data.IHealthDataStore");
            obtain.writeString(str);
            if (aggregateRequest != null) {
                obtain.writeInt(1);
                aggregateRequest.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (singleCallback != null) {
                obtain.writeInt(1);
                singleCallback.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (this.a.transact(6, obtain, null, 1) || IHealthDataStore.Stub.getDefaultImpl() == null) {
                return;
            }
            IHealthDataStore.Stub.getDefaultImpl().aggregateData(str, aggregateRequest, singleCallback);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }

    @Override // com.samsung.android.sdk.health.data.IHealthDataStore
    public final void connectInternal(String str, SingleCallback singleCallback) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.samsung.android.sdk.health.data.IHealthDataStore");
            obtain.writeString(str);
            if (singleCallback != null) {
                obtain.writeInt(1);
                singleCallback.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (this.a.transact(1, obtain, null, 1) || IHealthDataStore.Stub.getDefaultImpl() == null) {
                return;
            }
            IHealthDataStore.Stub.getDefaultImpl().connectInternal(str, singleCallback);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.samsung.android.sdk.health.data.IHealthDataStore
    public final void deleteData(String str, DeleteDataRequest deleteDataRequest, CompletableCallback completableCallback) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.samsung.android.sdk.health.data.IHealthDataStore");
            obtain.writeString(str);
            if (deleteDataRequest != null) {
                obtain.writeInt(1);
                deleteDataRequest.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (completableCallback != null) {
                obtain.writeInt(1);
                completableCallback.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (this.a.transact(9, obtain, null, 1) || IHealthDataStore.Stub.getDefaultImpl() == null) {
                return;
            }
            IHealthDataStore.Stub.getDefaultImpl().deleteData(str, deleteDataRequest, completableCallback);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.samsung.android.sdk.health.data.IHealthDataStore
    public final void getDevice(String str, String str2, SingleCallback singleCallback) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.samsung.android.sdk.health.data.IHealthDataStore");
            obtain.writeString(str);
            obtain.writeString(str2);
            if (singleCallback != null) {
                obtain.writeInt(1);
                singleCallback.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (this.a.transact(11, obtain, null, 1) || IHealthDataStore.Stub.getDefaultImpl() == null) {
                return;
            }
            IHealthDataStore.Stub.getDefaultImpl().getDevice(str, str2, singleCallback);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.samsung.android.sdk.health.data.IHealthDataStore
    public final void getDevice2(String str, int i, String str2, SingleCallback singleCallback) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.samsung.android.sdk.health.data.IHealthDataStore");
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeString(str2);
            if (singleCallback != null) {
                obtain.writeInt(1);
                singleCallback.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (this.a.transact(21, obtain, null, 1) || IHealthDataStore.Stub.getDefaultImpl() == null) {
                return;
            }
            IHealthDataStore.Stub.getDefaultImpl().getDevice2(str, i, str2, singleCallback);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.samsung.android.sdk.health.data.IHealthDataStore
    public final void getDeviceBySeed(String str, String str2, SingleCallback singleCallback) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.samsung.android.sdk.health.data.IHealthDataStore");
            obtain.writeString(str);
            obtain.writeString(str2);
            if (singleCallback != null) {
                obtain.writeInt(1);
                singleCallback.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (this.a.transact(20, obtain, null, 1) || IHealthDataStore.Stub.getDefaultImpl() == null) {
                return;
            }
            IHealthDataStore.Stub.getDefaultImpl().getDeviceBySeed(str, str2, singleCallback);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.samsung.android.sdk.health.data.IHealthDataStore
    public final void getDeviceBySeed2(String str, int i, String str2, SingleCallback singleCallback) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.samsung.android.sdk.health.data.IHealthDataStore");
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeString(str2);
            if (singleCallback != null) {
                obtain.writeInt(1);
                singleCallback.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (this.a.transact(27, obtain, null, 1) || IHealthDataStore.Stub.getDefaultImpl() == null) {
                return;
            }
            IHealthDataStore.Stub.getDefaultImpl().getDeviceBySeed2(str, i, str2, singleCallback);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.samsung.android.sdk.health.data.IHealthDataStore
    public final void getDevices(String str, int i, int i2, SingleCallback singleCallback) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.samsung.android.sdk.health.data.IHealthDataStore");
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            if (singleCallback != null) {
                obtain.writeInt(1);
                singleCallback.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (this.a.transact(15, obtain, null, 1) || IHealthDataStore.Stub.getDefaultImpl() == null) {
                return;
            }
            IHealthDataStore.Stub.getDefaultImpl().getDevices(str, i, i2, singleCallback);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.samsung.android.sdk.health.data.IHealthDataStore
    public final void getDevices2(String str, int i, int i2, int i3, SingleCallback singleCallback) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.samsung.android.sdk.health.data.IHealthDataStore");
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            if (singleCallback != null) {
                obtain.writeInt(1);
                singleCallback.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (this.a.transact(23, obtain, null, 1) || IHealthDataStore.Stub.getDefaultImpl() == null) {
                return;
            }
            IHealthDataStore.Stub.getDefaultImpl().getDevices2(str, i, i2, i3, singleCallback);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.samsung.android.sdk.health.data.IHealthDataStore
    public final void getDevicesByManufacturer(String str, String str2, SingleCallback singleCallback) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.samsung.android.sdk.health.data.IHealthDataStore");
            obtain.writeString(str);
            obtain.writeString(str2);
            if (singleCallback != null) {
                obtain.writeInt(1);
                singleCallback.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (this.a.transact(17, obtain, null, 1) || IHealthDataStore.Stub.getDefaultImpl() == null) {
                return;
            }
            IHealthDataStore.Stub.getDefaultImpl().getDevicesByManufacturer(str, str2, singleCallback);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.samsung.android.sdk.health.data.IHealthDataStore
    public final void getDevicesByManufacturer2(String str, int i, String str2, SingleCallback singleCallback) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.samsung.android.sdk.health.data.IHealthDataStore");
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeString(str2);
            if (singleCallback != null) {
                obtain.writeInt(1);
                singleCallback.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (this.a.transact(25, obtain, null, 1) || IHealthDataStore.Stub.getDefaultImpl() == null) {
                return;
            }
            IHealthDataStore.Stub.getDefaultImpl().getDevicesByManufacturer2(str, i, str2, singleCallback);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.samsung.android.sdk.health.data.IHealthDataStore
    public final void getDevicesByModel(String str, String str2, SingleCallback singleCallback) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.samsung.android.sdk.health.data.IHealthDataStore");
            obtain.writeString(str);
            obtain.writeString(str2);
            if (singleCallback != null) {
                obtain.writeInt(1);
                singleCallback.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (this.a.transact(16, obtain, null, 1) || IHealthDataStore.Stub.getDefaultImpl() == null) {
                return;
            }
            IHealthDataStore.Stub.getDefaultImpl().getDevicesByModel(str, str2, singleCallback);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.samsung.android.sdk.health.data.IHealthDataStore
    public final void getDevicesByModel2(String str, int i, String str2, SingleCallback singleCallback) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.samsung.android.sdk.health.data.IHealthDataStore");
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeString(str2);
            if (singleCallback != null) {
                obtain.writeInt(1);
                singleCallback.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (this.a.transact(24, obtain, null, 1) || IHealthDataStore.Stub.getDefaultImpl() == null) {
                return;
            }
            IHealthDataStore.Stub.getDefaultImpl().getDevicesByModel2(str, i, str2, singleCallback);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.samsung.android.sdk.health.data.IHealthDataStore
    public final void getGrantedPermissions(String str, List list, SingleCallback singleCallback) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.samsung.android.sdk.health.data.IHealthDataStore");
            obtain.writeString(str);
            obtain.writeTypedList(list);
            if (singleCallback != null) {
                obtain.writeInt(1);
                singleCallback.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (this.a.transact(2, obtain, null, 1) || IHealthDataStore.Stub.getDefaultImpl() == null) {
                return;
            }
            IHealthDataStore.Stub.getDefaultImpl().getGrantedPermissions(str, list, singleCallback);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.samsung.android.sdk.health.data.IHealthDataStore
    public final void getLocalDevice(String str, SingleCallback singleCallback) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.samsung.android.sdk.health.data.IHealthDataStore");
            obtain.writeString(str);
            if (singleCallback != null) {
                obtain.writeInt(1);
                singleCallback.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (this.a.transact(10, obtain, null, 1) || IHealthDataStore.Stub.getDefaultImpl() == null) {
                return;
            }
            IHealthDataStore.Stub.getDefaultImpl().getLocalDevice(str, singleCallback);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.samsung.android.sdk.health.data.IHealthDataStore
    public final void getLocalDevice2(String str, int i, SingleCallback singleCallback) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.samsung.android.sdk.health.data.IHealthDataStore");
            obtain.writeString(str);
            obtain.writeInt(i);
            if (singleCallback != null) {
                obtain.writeInt(1);
                singleCallback.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (this.a.transact(22, obtain, null, 1) || IHealthDataStore.Stub.getDefaultImpl() == null) {
                return;
            }
            IHealthDataStore.Stub.getDefaultImpl().getLocalDevice2(str, i, singleCallback);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.samsung.android.sdk.health.data.IHealthDataStore
    public final void getOwnDevices(String str, SingleCallback singleCallback) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.samsung.android.sdk.health.data.IHealthDataStore");
            obtain.writeString(str);
            if (singleCallback != null) {
                obtain.writeInt(1);
                singleCallback.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (this.a.transact(18, obtain, null, 1) || IHealthDataStore.Stub.getDefaultImpl() == null) {
                return;
            }
            IHealthDataStore.Stub.getDefaultImpl().getOwnDevices(str, singleCallback);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.samsung.android.sdk.health.data.IHealthDataStore
    public final void getOwnDevices2(String str, int i, SingleCallback singleCallback) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.samsung.android.sdk.health.data.IHealthDataStore");
            obtain.writeString(str);
            obtain.writeInt(i);
            if (singleCallback != null) {
                obtain.writeInt(1);
                singleCallback.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (this.a.transact(26, obtain, null, 1) || IHealthDataStore.Stub.getDefaultImpl() == null) {
                return;
            }
            IHealthDataStore.Stub.getDefaultImpl().getOwnDevices2(str, i, singleCallback);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.samsung.android.sdk.health.data.IHealthDataStore
    public final void insertData(String str, InsertDataRequest insertDataRequest, CompletableCallback completableCallback) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.samsung.android.sdk.health.data.IHealthDataStore");
            obtain.writeString(str);
            if (insertDataRequest != null) {
                obtain.writeInt(1);
                insertDataRequest.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (completableCallback != null) {
                obtain.writeInt(1);
                completableCallback.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (this.a.transact(7, obtain, null, 1) || IHealthDataStore.Stub.getDefaultImpl() == null) {
                return;
            }
            IHealthDataStore.Stub.getDefaultImpl().insertData(str, insertDataRequest, completableCallback);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.samsung.android.sdk.health.data.IHealthDataStore
    public final void readAssociatedData(String str, AssociatedReadRequest associatedReadRequest, SingleCallback singleCallback) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.samsung.android.sdk.health.data.IHealthDataStore");
            obtain.writeString(str);
            if (associatedReadRequest != null) {
                obtain.writeInt(1);
                associatedReadRequest.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (singleCallback != null) {
                obtain.writeInt(1);
                singleCallback.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (this.a.transact(5, obtain, null, 1) || IHealthDataStore.Stub.getDefaultImpl() == null) {
                return;
            }
            IHealthDataStore.Stub.getDefaultImpl().readAssociatedData(str, associatedReadRequest, singleCallback);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.samsung.android.sdk.health.data.IHealthDataStore
    public final void readChanges(String str, ChangedDataRequest changedDataRequest, SingleCallback singleCallback) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.samsung.android.sdk.health.data.IHealthDataStore");
            obtain.writeString(str);
            if (changedDataRequest != null) {
                obtain.writeInt(1);
                changedDataRequest.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (singleCallback != null) {
                obtain.writeInt(1);
                singleCallback.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (this.a.transact(14, obtain, null, 1) || IHealthDataStore.Stub.getDefaultImpl() == null) {
                return;
            }
            IHealthDataStore.Stub.getDefaultImpl().readChanges(str, changedDataRequest, singleCallback);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.samsung.android.sdk.health.data.IHealthDataStore
    public final void readData(String str, ReadDataRequest readDataRequest, SingleCallback singleCallback) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.samsung.android.sdk.health.data.IHealthDataStore");
            obtain.writeString(str);
            if (readDataRequest != null) {
                obtain.writeInt(1);
                readDataRequest.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (singleCallback != null) {
                obtain.writeInt(1);
                singleCallback.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (this.a.transact(4, obtain, null, 1) || IHealthDataStore.Stub.getDefaultImpl() == null) {
                return;
            }
            IHealthDataStore.Stub.getDefaultImpl().readData(str, readDataRequest, singleCallback);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.samsung.android.sdk.health.data.IHealthDataStore
    public final void registerDataChangeNotification(String str, String str2, String str3, CompletableCallback completableCallback) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.samsung.android.sdk.health.data.IHealthDataStore");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            if (completableCallback != null) {
                obtain.writeInt(1);
                completableCallback.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (this.a.transact(12, obtain, null, 1) || IHealthDataStore.Stub.getDefaultImpl() == null) {
                return;
            }
            IHealthDataStore.Stub.getDefaultImpl().registerDataChangeNotification(str, str2, str3, completableCallback);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.samsung.android.sdk.health.data.IHealthDataStore
    public final void registerDevice(String str, DeviceRegistrationRequest deviceRegistrationRequest, SingleCallback singleCallback) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.samsung.android.sdk.health.data.IHealthDataStore");
            obtain.writeString(str);
            if (deviceRegistrationRequest != null) {
                obtain.writeInt(1);
                deviceRegistrationRequest.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (singleCallback != null) {
                obtain.writeInt(1);
                singleCallback.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (this.a.transact(19, obtain, null, 1) || IHealthDataStore.Stub.getDefaultImpl() == null) {
                return;
            }
            IHealthDataStore.Stub.getDefaultImpl().registerDevice(str, deviceRegistrationRequest, singleCallback);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.samsung.android.sdk.health.data.IHealthDataStore
    public final Intent requestPermissions(String str, List list, SingleCallback singleCallback) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.samsung.android.sdk.health.data.IHealthDataStore");
            obtain.writeString(str);
            obtain.writeTypedList(list);
            if (singleCallback != null) {
                obtain.writeInt(1);
                singleCallback.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (!this.a.transact(3, obtain, obtain2, 0) && IHealthDataStore.Stub.getDefaultImpl() != null) {
                return IHealthDataStore.Stub.getDefaultImpl().requestPermissions(str, list, singleCallback);
            }
            obtain2.readException();
            return obtain2.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.samsung.android.sdk.health.data.IHealthDataStore
    public final void unregisterDataChangeNotification(String str, String str2, CompletableCallback completableCallback) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.samsung.android.sdk.health.data.IHealthDataStore");
            obtain.writeString(str);
            obtain.writeString(str2);
            if (completableCallback != null) {
                obtain.writeInt(1);
                completableCallback.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (this.a.transact(13, obtain, null, 1) || IHealthDataStore.Stub.getDefaultImpl() == null) {
                return;
            }
            IHealthDataStore.Stub.getDefaultImpl().unregisterDataChangeNotification(str, str2, completableCallback);
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.samsung.android.sdk.health.data.IHealthDataStore
    public final void updateData(String str, UpdateDataRequest updateDataRequest, CompletableCallback completableCallback) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.samsung.android.sdk.health.data.IHealthDataStore");
            obtain.writeString(str);
            if (updateDataRequest != null) {
                obtain.writeInt(1);
                updateDataRequest.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (completableCallback != null) {
                obtain.writeInt(1);
                completableCallback.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (this.a.transact(8, obtain, null, 1) || IHealthDataStore.Stub.getDefaultImpl() == null) {
                return;
            }
            IHealthDataStore.Stub.getDefaultImpl().updateData(str, updateDataRequest, completableCallback);
        } finally {
            obtain.recycle();
        }
    }
}
