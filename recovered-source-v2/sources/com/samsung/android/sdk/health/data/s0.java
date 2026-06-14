package com.samsung.android.sdk.health.data;

import android.app.Activity;
import android.util.Log;
import com.samsung.android.sdk.health.data.data.AggregatedData;
import com.samsung.android.sdk.health.data.data.AssociatedDataPoints;
import com.samsung.android.sdk.health.data.data.Change;
import com.samsung.android.sdk.health.data.data.DataPoint;
import com.samsung.android.sdk.health.data.error.InvalidRequestException;
import com.samsung.android.sdk.health.data.internal.annotation.ApiVersion;
import com.samsung.android.sdk.health.data.permission.Permission;
import com.samsung.android.sdk.health.data.request.AggregateRequest;
import com.samsung.android.sdk.health.data.request.AssociatedReadRequest;
import com.samsung.android.sdk.health.data.request.ChangedDataRequest;
import com.samsung.android.sdk.health.data.request.DataType;
import com.samsung.android.sdk.health.data.request.DeleteDataRequest;
import com.samsung.android.sdk.health.data.request.InsertDataRequest;
import com.samsung.android.sdk.health.data.request.ReadDataRequest;
import com.samsung.android.sdk.health.data.request.UpdateDataRequest;
import com.samsung.android.sdk.health.data.response.AsyncCompletableFuture;
import com.samsung.android.sdk.health.data.response.AsyncSingleFuture;
import com.samsung.android.sdk.health.data.response.DataResponse;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes5.dex */
public final class s0 implements HealthDataStore {
    public final String a;
    public final s1 b;
    public final CoroutineScope c;
    public final ExecutorService d;
    public final c0 e;

    public s0(String clientName, s1 taskExecutor, CoroutineScope healthStoreScope) {
        Intrinsics.checkNotNullParameter(clientName, "clientName");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Intrinsics.checkNotNullParameter(healthStoreScope, "healthStoreScope");
        this.a = clientName;
        this.b = taskExecutor;
        this.c = healthStoreScope;
        this.d = Executors.newFixedThreadPool(4);
        this.e = new c0(clientName, taskExecutor, healthStoreScope);
    }

    public static final void a(c futureTask, Throwable th) {
        Intrinsics.checkNotNullParameter(futureTask, "$futureTask");
        Intrinsics.checkNotNull(th);
        futureTask.a(th);
    }

    public static final void b(c futureTask, Throwable th) {
        Intrinsics.checkNotNullParameter(futureTask, "$futureTask");
        Intrinsics.checkNotNull(th);
        futureTask.a(th);
    }

    public static final void c(c futureTask, Throwable th) {
        Intrinsics.checkNotNullParameter(futureTask, "$futureTask");
        Intrinsics.checkNotNull(th);
        futureTask.a(th);
    }

    public static final void d(c futureTask, Throwable th) {
        Intrinsics.checkNotNullParameter(futureTask, "$futureTask");
        Intrinsics.checkNotNull(th);
        futureTask.a(th);
    }

    public static final void e(c futureTask, Throwable th) {
        Intrinsics.checkNotNullParameter(futureTask, "$futureTask");
        Intrinsics.checkNotNull(th);
        futureTask.a(th);
    }

    public static final void f(c futureTask, Throwable th) {
        Intrinsics.checkNotNullParameter(futureTask, "$futureTask");
        Intrinsics.checkNotNull(th);
        futureTask.a(th);
    }

    @Override // com.samsung.android.sdk.health.data.HealthDataStore
    @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
    public <T> AsyncSingleFuture<DataResponse<AggregatedData<T>>> aggregateDataAsync(AggregateRequest<T> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Log.i("[SHD]HealthDataStoreAllImpl", "aggregateData invoked. Lib version: 1010004");
        Objects.requireNonNull(request, "Input data should not be null.");
        a(request.getDataType());
        int max = Integer.max(request.getRequiredVersion(), e2.a());
        final c cVar = new c("aggregateData");
        this.b.a(max, new m0(this, request, cVar), new Consumer() { // from class: com.samsung.android.sdk.health.data.s0$$ExternalSyntheticLambda0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                s0.a(c.this, (Throwable) obj);
            }
        });
        return cVar;
    }

    @Override // com.samsung.android.sdk.health.data.HealthDataStore
    @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
    public AsyncCompletableFuture deleteDataAsync(DeleteDataRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Log.i("[SHD]HealthDataStoreAllImpl", "deleteData invoked. Lib version: 1010004");
        Objects.requireNonNull(request, "Input data should not be null.");
        a(request.getDataType());
        int max = Integer.max(request.getRequiredVersion(), e2.a());
        final b bVar = new b("deleteData");
        this.b.a(max, new com.samsung.android.sdk.health.data.internal.g(this, request, bVar), new Consumer() { // from class: com.samsung.android.sdk.health.data.s0$$ExternalSyntheticLambda6
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                s0.a(b.this, (Throwable) obj);
            }
        });
        return bVar;
    }

    @Override // com.samsung.android.sdk.health.data.HealthDataStore
    @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
    public AsyncSingleFuture<Set<Permission>> getGrantedPermissionsAsync(Set<Permission> permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Log.i("[SHD]HealthDataStoreAllImpl", "getGrantedPermissions invoked. Lib version: 1010004");
        Objects.requireNonNull(permissions, "Input data should not be null.");
        int max = Integer.max(e2.a(permissions), e2.a());
        final c cVar = new c("getGrantedPermissions");
        this.b.a(max, new n0(this, permissions, cVar), new Consumer() { // from class: com.samsung.android.sdk.health.data.s0$$ExternalSyntheticLambda4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                s0.b(c.this, (Throwable) obj);
            }
        });
        return cVar;
    }

    @Override // com.samsung.android.sdk.health.data.HealthDataStore
    @ApiVersion(minRequired = 1010000)
    public <T extends DataPoint> AsyncCompletableFuture insertDataAsync(InsertDataRequest<T> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Log.i("[SHD]HealthDataStoreAllImpl", "insertData invoked. Lib version: 1010004");
        Objects.requireNonNull(request, "Input data should not be null.");
        a(request.getDataType());
        int max = Integer.max(request.getRequiredVersion(), e2.a());
        final b bVar = new b("insertData");
        this.b.a(max, new com.samsung.android.sdk.health.data.internal.h(this, request, bVar), new Consumer() { // from class: com.samsung.android.sdk.health.data.s0$$ExternalSyntheticLambda2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                s0.b(b.this, (Throwable) obj);
            }
        });
        return bVar;
    }

    @Override // com.samsung.android.sdk.health.data.HealthDataStore
    @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
    public AsyncSingleFuture<DataResponse<AssociatedDataPoints>> readAssociatedDataAsync(AssociatedReadRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Log.i("[SHD]HealthDataStoreAllImpl", "readAssociatedData invoked. Lib version: 1010004");
        Objects.requireNonNull(request, "Input data should not be null.");
        a(request.getDataType());
        int max = Integer.max(request.getRequiredVersion(), e2.a());
        final c cVar = new c("readAssociatedData");
        this.b.a(max, new o0(this, request, cVar), new Consumer() { // from class: com.samsung.android.sdk.health.data.s0$$ExternalSyntheticLambda5
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                s0.c(c.this, (Throwable) obj);
            }
        });
        return cVar;
    }

    @Override // com.samsung.android.sdk.health.data.HealthDataStore
    @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
    public <T extends DataPoint> AsyncSingleFuture<DataResponse<Change<T>>> readChangesAsync(ChangedDataRequest<T> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Log.i("[SHD]HealthDataStoreAllImpl", "readChanges invoked. Lib version: 1010004");
        Objects.requireNonNull(request, "Input data should not be null.");
        a(request.getDataType());
        int max = Integer.max(request.getRequiredVersion(), e2.a());
        final c cVar = new c("readChanges");
        this.b.a(max, new p0(this, request, cVar), new Consumer() { // from class: com.samsung.android.sdk.health.data.s0$$ExternalSyntheticLambda3
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                s0.d(c.this, (Throwable) obj);
            }
        });
        a(request.getDataType());
        return cVar;
    }

    @Override // com.samsung.android.sdk.health.data.HealthDataStore
    @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
    public <T extends DataPoint> AsyncSingleFuture<DataResponse<T>> readDataAsync(ReadDataRequest<T> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Log.i("[SHD]HealthDataStoreAllImpl", "readData invoked. Lib version: 1010004");
        Objects.requireNonNull(request, "Input data should not be null.");
        a(request.getDataType());
        int max = Integer.max(request.getRequiredVersion(), e2.a());
        final c cVar = new c("readData");
        this.b.a(max, new q0(this, request, cVar), new Consumer() { // from class: com.samsung.android.sdk.health.data.s0$$ExternalSyntheticLambda7
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                s0.e(c.this, (Throwable) obj);
            }
        });
        return cVar;
    }

    @Override // com.samsung.android.sdk.health.data.HealthDataStore
    @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
    public AsyncSingleFuture<Set<Permission>> requestPermissionsAsync(Set<Permission> permissions, Activity activity) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Log.i("[SHD]HealthDataStoreAllImpl", "requestPermissions invoked. Lib version: 1010004");
        Objects.requireNonNull(permissions, "Input data should not be null.");
        Objects.requireNonNull(activity, "Input data should not be null.");
        int max = Integer.max(e2.a(permissions), e2.a());
        final c cVar = new c("requestPermissions");
        this.b.a(max, new r0(this, permissions, cVar, activity), new Consumer() { // from class: com.samsung.android.sdk.health.data.s0$$ExternalSyntheticLambda1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                s0.f(c.this, (Throwable) obj);
            }
        });
        return cVar;
    }

    @Override // com.samsung.android.sdk.health.data.HealthDataStore
    @ApiVersion(minRequired = 1010000)
    public <T extends DataPoint> AsyncCompletableFuture updateDataAsync(UpdateDataRequest<T> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Log.i("[SHD]HealthDataStoreAllImpl", "updateData invoked. Lib version: 1010004");
        Objects.requireNonNull(request, "Input data should not be null.");
        a(request.getDataType());
        int max = Integer.max(request.getRequiredVersion(), e2.a());
        final b bVar = new b("updateData");
        this.b.a(max, new com.samsung.android.sdk.health.data.internal.i(this, request, bVar), new Consumer() { // from class: com.samsung.android.sdk.health.data.s0$$ExternalSyntheticLambda8
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                s0.c(b.this, (Throwable) obj);
            }
        });
        return bVar;
    }

    public static final void b(b futureTask, Throwable th) {
        Intrinsics.checkNotNullParameter(futureTask, "$futureTask");
        Intrinsics.checkNotNull(th);
        futureTask.a(th);
    }

    public static final void c(b futureTask, Throwable th) {
        Intrinsics.checkNotNullParameter(futureTask, "$futureTask");
        Intrinsics.checkNotNull(th);
        futureTask.a(th);
    }

    public static final void a(b futureTask, Throwable th) {
        Intrinsics.checkNotNullParameter(futureTask, "$futureTask");
        Intrinsics.checkNotNull(th);
        futureTask.a(th);
    }

    @Override // com.samsung.android.sdk.health.data.HealthDataStore
    public final Object getGrantedPermissions(Set set, Continuation continuation) {
        CoroutineScope coroutineScope = this.c;
        ExecutorService internalExecutor = this.d;
        Intrinsics.checkNotNullExpressionValue(internalExecutor, "internalExecutor");
        AsyncSingleFuture<Set<Permission>> grantedPermissionsAsync = getGrantedPermissionsAsync(set);
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new i1(grantedPermissionsAsync, internalExecutor, cancellableContinuationImpl, null), 3, null);
        cancellableContinuationImpl.invokeOnCancellation(new j1(grantedPermissionsAsync));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // com.samsung.android.sdk.health.data.HealthDataStore
    public final Object requestPermissions(Set set, Activity activity, Continuation continuation) {
        CoroutineScope coroutineScope = this.c;
        ExecutorService internalExecutor = this.d;
        Intrinsics.checkNotNullExpressionValue(internalExecutor, "internalExecutor");
        AsyncSingleFuture<Set<Permission>> requestPermissionsAsync = requestPermissionsAsync(set, activity);
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new i1(requestPermissionsAsync, internalExecutor, cancellableContinuationImpl, null), 3, null);
        cancellableContinuationImpl.invokeOnCancellation(new j1(requestPermissionsAsync));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // com.samsung.android.sdk.health.data.HealthDataStore
    public final Object readData(ReadDataRequest readDataRequest, Continuation continuation) {
        CoroutineScope coroutineScope = this.c;
        ExecutorService internalExecutor = this.d;
        Intrinsics.checkNotNullExpressionValue(internalExecutor, "internalExecutor");
        AsyncSingleFuture readDataAsync = readDataAsync(readDataRequest);
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new i1(readDataAsync, internalExecutor, cancellableContinuationImpl, null), 3, null);
        cancellableContinuationImpl.invokeOnCancellation(new j1(readDataAsync));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // com.samsung.android.sdk.health.data.HealthDataStore
    public final Object readAssociatedData(AssociatedReadRequest associatedReadRequest, Continuation continuation) {
        CoroutineScope coroutineScope = this.c;
        ExecutorService internalExecutor = this.d;
        Intrinsics.checkNotNullExpressionValue(internalExecutor, "internalExecutor");
        AsyncSingleFuture<DataResponse<AssociatedDataPoints>> readAssociatedDataAsync = readAssociatedDataAsync(associatedReadRequest);
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new i1(readAssociatedDataAsync, internalExecutor, cancellableContinuationImpl, null), 3, null);
        cancellableContinuationImpl.invokeOnCancellation(new j1(readAssociatedDataAsync));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // com.samsung.android.sdk.health.data.HealthDataStore
    public final Object aggregateData(AggregateRequest aggregateRequest, Continuation continuation) {
        CoroutineScope coroutineScope = this.c;
        ExecutorService internalExecutor = this.d;
        Intrinsics.checkNotNullExpressionValue(internalExecutor, "internalExecutor");
        AsyncSingleFuture aggregateDataAsync = aggregateDataAsync(aggregateRequest);
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new i1(aggregateDataAsync, internalExecutor, cancellableContinuationImpl, null), 3, null);
        cancellableContinuationImpl.invokeOnCancellation(new j1(aggregateDataAsync));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // com.samsung.android.sdk.health.data.HealthDataStore
    public final Object insertData(InsertDataRequest insertDataRequest, Continuation continuation) {
        CoroutineScope coroutineScope = this.c;
        ExecutorService internalExecutor = this.d;
        Intrinsics.checkNotNullExpressionValue(internalExecutor, "internalExecutor");
        AsyncCompletableFuture insertDataAsync = insertDataAsync(insertDataRequest);
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new n1(insertDataAsync, internalExecutor, cancellableContinuationImpl, null), 3, null);
        cancellableContinuationImpl.invokeOnCancellation(new o1(insertDataAsync));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        if (result != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            result = Unit.INSTANCE;
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    @Override // com.samsung.android.sdk.health.data.HealthDataStore
    public final Object updateData(UpdateDataRequest updateDataRequest, Continuation continuation) {
        CoroutineScope coroutineScope = this.c;
        ExecutorService internalExecutor = this.d;
        Intrinsics.checkNotNullExpressionValue(internalExecutor, "internalExecutor");
        AsyncCompletableFuture updateDataAsync = updateDataAsync(updateDataRequest);
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new n1(updateDataAsync, internalExecutor, cancellableContinuationImpl, null), 3, null);
        cancellableContinuationImpl.invokeOnCancellation(new o1(updateDataAsync));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        if (result != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            result = Unit.INSTANCE;
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    @Override // com.samsung.android.sdk.health.data.HealthDataStore
    public final Object deleteData(DeleteDataRequest deleteDataRequest, Continuation continuation) {
        CoroutineScope coroutineScope = this.c;
        ExecutorService internalExecutor = this.d;
        Intrinsics.checkNotNullExpressionValue(internalExecutor, "internalExecutor");
        AsyncCompletableFuture deleteDataAsync = deleteDataAsync(deleteDataRequest);
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new n1(deleteDataAsync, internalExecutor, cancellableContinuationImpl, null), 3, null);
        cancellableContinuationImpl.invokeOnCancellation(new o1(deleteDataAsync));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        if (result != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            result = Unit.INSTANCE;
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    @Override // com.samsung.android.sdk.health.data.HealthDataStore
    public final DeviceManager getDeviceManager() {
        return this.e;
    }

    @Override // com.samsung.android.sdk.health.data.HealthDataStore
    public final Object readChanges(ChangedDataRequest changedDataRequest, Continuation continuation) {
        CoroutineScope coroutineScope = this.c;
        ExecutorService internalExecutor = this.d;
        Intrinsics.checkNotNullExpressionValue(internalExecutor, "internalExecutor");
        AsyncSingleFuture readChangesAsync = readChangesAsync(changedDataRequest);
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new i1(readChangesAsync, internalExecutor, cancellableContinuationImpl, null), 3, null);
        cancellableContinuationImpl.invokeOnCancellation(new j1(readChangesAsync));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static void a(DataType dataType) {
        p pVar = t.a;
        if (!pVar.containsKey(dataType.getName()) || pVar.get(dataType.getName()) != dataType) {
            throw new InvalidRequestException(1001, "Invalid data type");
        }
    }
}
