package com.samsung.android.sdk.health.data;

import android.app.Activity;
import androidx.exifinterface.media.ExifInterface;
import com.samsung.android.sdk.health.data.data.AggregatedData;
import com.samsung.android.sdk.health.data.data.AssociatedDataPoints;
import com.samsung.android.sdk.health.data.data.Change;
import com.samsung.android.sdk.health.data.data.DataPoint;
import com.samsung.android.sdk.health.data.permission.Permission;
import com.samsung.android.sdk.health.data.request.AggregateRequest;
import com.samsung.android.sdk.health.data.request.AssociatedReadRequest;
import com.samsung.android.sdk.health.data.request.ChangedDataRequest;
import com.samsung.android.sdk.health.data.request.DeleteDataRequest;
import com.samsung.android.sdk.health.data.request.InsertDataRequest;
import com.samsung.android.sdk.health.data.request.ReadDataRequest;
import com.samsung.android.sdk.health.data.request.UpdateDataRequest;
import com.samsung.android.sdk.health.data.response.AsyncCompletableFuture;
import com.samsung.android.sdk.health.data.response.AsyncSingleFuture;
import com.samsung.android.sdk.health.data.response.DataResponse;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J5\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00040\u0003\"\b\b\u0000\u0010\u0005*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0007H¦@ø\u0001\u0000¢\u0006\u0002\u0010\bJ2\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00040\u00030\n\"\b\b\u0000\u0010\u0005*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0007H&J\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\rH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\rH&J\b\u0010\u0011\u001a\u00020\u0012H&J%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J\"\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H&J)\u0010\u0019\u001a\u00020\f\"\b\b\u0000\u0010\u0005*\u00020\u001a2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u001bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ \u0010\u001d\u001a\u00020\u0010\"\b\b\u0000\u0010\u0005*\u00020\u001a2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u001bH&J\u001f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00032\u0006\u0010\u0006\u001a\u00020 H¦@ø\u0001\u0000¢\u0006\u0002\u0010!J\u001c\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00030\n2\u0006\u0010\u0006\u001a\u00020 H&J5\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050$0\u0003\"\b\b\u0000\u0010\u0005*\u00020\u001a2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050%H¦@ø\u0001\u0000¢\u0006\u0002\u0010&J2\u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050$0\u00030\n\"\b\b\u0000\u0010\u0005*\u00020\u001a2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050%H&J/\u0010(\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0003\"\b\b\u0000\u0010\u0005*\u00020\u001a2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050)H¦@ø\u0001\u0000¢\u0006\u0002\u0010*J,\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00030\n\"\b\b\u0000\u0010\u0005*\u00020\u001a2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050)H&J-\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010-\u001a\u00020.H¦@ø\u0001\u0000¢\u0006\u0002\u0010/J*\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010-\u001a\u00020.H&J)\u00101\u001a\u00020\f\"\b\b\u0000\u0010\u0005*\u00020\u001a2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u000502H¦@ø\u0001\u0000¢\u0006\u0002\u00103J \u00104\u001a\u00020\u0010\"\b\b\u0000\u0010\u0005*\u00020\u001a2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u000502H&\u0082\u0002\u0004\n\u0002\b\u0019¨\u00065"}, d2 = {"Lcom/samsung/android/sdk/health/data/HealthDataStore;", "", "aggregateData", "Lcom/samsung/android/sdk/health/data/response/DataResponse;", "Lcom/samsung/android/sdk/health/data/data/AggregatedData;", ExifInterface.GPS_DIRECTION_TRUE, "request", "Lcom/samsung/android/sdk/health/data/request/AggregateRequest;", "(Lcom/samsung/android/sdk/health/data/request/AggregateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "aggregateDataAsync", "Lcom/samsung/android/sdk/health/data/response/AsyncSingleFuture;", "deleteData", "", "Lcom/samsung/android/sdk/health/data/request/DeleteDataRequest;", "(Lcom/samsung/android/sdk/health/data/request/DeleteDataRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteDataAsync", "Lcom/samsung/android/sdk/health/data/response/AsyncCompletableFuture;", "getDeviceManager", "Lcom/samsung/android/sdk/health/data/DeviceManager;", "getGrantedPermissions", "", "Lcom/samsung/android/sdk/health/data/permission/Permission;", "permissions", "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGrantedPermissionsAsync", "insertData", "Lcom/samsung/android/sdk/health/data/data/DataPoint;", "Lcom/samsung/android/sdk/health/data/request/InsertDataRequest;", "(Lcom/samsung/android/sdk/health/data/request/InsertDataRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertDataAsync", "readAssociatedData", "Lcom/samsung/android/sdk/health/data/data/AssociatedDataPoints;", "Lcom/samsung/android/sdk/health/data/request/AssociatedReadRequest;", "(Lcom/samsung/android/sdk/health/data/request/AssociatedReadRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readAssociatedDataAsync", "readChanges", "Lcom/samsung/android/sdk/health/data/data/Change;", "Lcom/samsung/android/sdk/health/data/request/ChangedDataRequest;", "(Lcom/samsung/android/sdk/health/data/request/ChangedDataRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readChangesAsync", "readData", "Lcom/samsung/android/sdk/health/data/request/ReadDataRequest;", "(Lcom/samsung/android/sdk/health/data/request/ReadDataRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readDataAsync", "requestPermissions", "activity", "Landroid/app/Activity;", "(Ljava/util/Set;Landroid/app/Activity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestPermissionsAsync", "updateData", "Lcom/samsung/android/sdk/health/data/request/UpdateDataRequest;", "(Lcom/samsung/android/sdk/health/data/request/UpdateDataRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateDataAsync", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface HealthDataStore {
    <T> Object aggregateData(AggregateRequest<T> aggregateRequest, Continuation<? super DataResponse<AggregatedData<T>>> continuation);

    <T> AsyncSingleFuture<DataResponse<AggregatedData<T>>> aggregateDataAsync(AggregateRequest<T> request);

    Object deleteData(DeleteDataRequest deleteDataRequest, Continuation<? super Unit> continuation);

    AsyncCompletableFuture deleteDataAsync(DeleteDataRequest request);

    DeviceManager getDeviceManager();

    Object getGrantedPermissions(Set<Permission> set, Continuation<? super Set<Permission>> continuation);

    AsyncSingleFuture<Set<Permission>> getGrantedPermissionsAsync(Set<Permission> permissions);

    <T extends DataPoint> Object insertData(InsertDataRequest<T> insertDataRequest, Continuation<? super Unit> continuation);

    <T extends DataPoint> AsyncCompletableFuture insertDataAsync(InsertDataRequest<T> request);

    Object readAssociatedData(AssociatedReadRequest associatedReadRequest, Continuation<? super DataResponse<AssociatedDataPoints>> continuation);

    AsyncSingleFuture<DataResponse<AssociatedDataPoints>> readAssociatedDataAsync(AssociatedReadRequest request);

    <T extends DataPoint> Object readChanges(ChangedDataRequest<T> changedDataRequest, Continuation<? super DataResponse<Change<T>>> continuation);

    <T extends DataPoint> AsyncSingleFuture<DataResponse<Change<T>>> readChangesAsync(ChangedDataRequest<T> request);

    <T extends DataPoint> Object readData(ReadDataRequest<T> readDataRequest, Continuation<? super DataResponse<T>> continuation);

    <T extends DataPoint> AsyncSingleFuture<DataResponse<T>> readDataAsync(ReadDataRequest<T> request);

    Object requestPermissions(Set<Permission> set, Activity activity, Continuation<? super Set<Permission>> continuation);

    AsyncSingleFuture<Set<Permission>> requestPermissionsAsync(Set<Permission> permissions, Activity activity);

    <T extends DataPoint> Object updateData(UpdateDataRequest<T> updateDataRequest, Continuation<? super Unit> continuation);

    <T extends DataPoint> AsyncCompletableFuture updateDataAsync(UpdateDataRequest<T> request);
}
