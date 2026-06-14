package androidx.health.connect.client.impl;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import androidx.exifinterface.media.ExifInterface;
import androidx.health.connect.client.HealthConnectClient;
import androidx.health.connect.client.HealthConnectFeatures;
import androidx.health.connect.client.PermissionController;
import androidx.health.connect.client.aggregate.AggregationResult;
import androidx.health.connect.client.aggregate.AggregationResultGroupedByDuration;
import androidx.health.connect.client.aggregate.AggregationResultGroupedByPeriod;
import androidx.health.connect.client.feature.HealthConnectFeaturesApkImpl;
import androidx.health.connect.client.feature.HealthConnectFeaturesUnavailableImpl;
import androidx.health.connect.client.impl.converters.aggregate.ProtoToAggregateDataRowKt;
import androidx.health.connect.client.impl.converters.datatype.DataTypeConverterKt;
import androidx.health.connect.client.impl.converters.datatype.DataTypeIdPairConverterKt;
import androidx.health.connect.client.impl.converters.records.ProtoToRecordConvertersKt;
import androidx.health.connect.client.impl.converters.records.RecordToProtoConvertersKt;
import androidx.health.connect.client.impl.converters.request.AggregateRequestToProtoKt;
import androidx.health.connect.client.impl.converters.request.DeleteDataRangeRequestToProtoKt;
import androidx.health.connect.client.impl.converters.request.ReadDataRangeRequestToProtoKt;
import androidx.health.connect.client.impl.converters.request.ReadDataRequestToProtoKt;
import androidx.health.connect.client.impl.converters.response.ProtoToChangesResponseKt;
import androidx.health.connect.client.impl.converters.response.ProtoToReadRecordsResponseKt;
import androidx.health.connect.client.permission.HealthPermission;
import androidx.health.connect.client.records.Record;
import androidx.health.connect.client.records.metadata.DataOrigin;
import androidx.health.connect.client.request.AggregateGroupByDurationRequest;
import androidx.health.connect.client.request.AggregateGroupByPeriodRequest;
import androidx.health.connect.client.request.AggregateRequest;
import androidx.health.connect.client.request.ChangesTokenRequest;
import androidx.health.connect.client.request.ReadRecordsRequest;
import androidx.health.connect.client.response.ChangesResponse;
import androidx.health.connect.client.response.InsertRecordsResponse;
import androidx.health.connect.client.response.ReadRecordResponse;
import androidx.health.connect.client.response.ReadRecordsResponse;
import androidx.health.connect.client.time.TimeRangeFilter;
import androidx.health.platform.client.HealthDataAsyncClient;
import androidx.health.platform.client.HealthDataService;
import androidx.health.platform.client.impl.logger.Logger;
import androidx.health.platform.client.proto.DataProto;
import androidx.health.platform.client.proto.PermissionProto;
import androidx.health.platform.client.proto.RequestProto;
import androidx.health.platform.client.proto.ResponseProto;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.coroutines.guava.ListenableFutureKt;

/* compiled from: HealthConnectClientImpl.kt */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u0017\b\u0001\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@¢\u0006\u0002\u0010\u0016J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0014\u001a\u00020\u001aH\u0096@¢\u0006\u0002\u0010\u001bJ\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00182\u0006\u0010\u0014\u001a\u00020\u001eH\u0096@¢\u0006\u0002\u0010\u001fJ&\u0010 \u001a\u00020!2\u000e\u0010\"\u001a\n\u0012\u0006\b\u0001\u0012\u00020$0#2\u0006\u0010%\u001a\u00020&H\u0096@¢\u0006\u0002\u0010'J:\u0010 \u001a\u00020!2\u000e\u0010\"\u001a\n\u0012\u0006\b\u0001\u0012\u00020$0#2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\u00182\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018H\u0096@¢\u0006\u0002\u0010*J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0006H\u0096@¢\u0006\u0002\u0010.J\u0016\u0010/\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u000200H\u0096@¢\u0006\u0002\u00101J\u0014\u00102\u001a\b\u0012\u0004\u0012\u00020\u000603H\u0096@¢\u0006\u0002\u00104J\u001c\u00105\u001a\u0002062\f\u00107\u001a\b\u0012\u0004\u0012\u00020$0\u0018H\u0096@¢\u0006\u0002\u00108J4\u00109\u001a\b\u0012\u0004\u0012\u0002H;0:\"\b\b\u0000\u0010;*\u00020$2\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H;0#2\u0006\u0010<\u001a\u00020\u0006H\u0096@¢\u0006\u0002\u0010=J,\u0010>\u001a\b\u0012\u0004\u0012\u0002H;0?\"\b\b\u0000\u0010;*\u00020$2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H;0@H\u0096@¢\u0006\u0002\u0010AJ\u000e\u0010B\u001a\u00020!H\u0096@¢\u0006\u0002\u00104J\u001c\u0010C\u001a\u00020!2\f\u00107\u001a\b\u0012\u0004\u0012\u00020$0\u0018H\u0096@¢\u0006\u0002\u00108J\"\u0010D\u001a\u0002H;\"\u0004\b\u0000\u0010;2\f\u0010E\u001a\b\u0012\u0004\u0012\u0002H;0FH\u0082\b¢\u0006\u0002\u0010GR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006H"}, d2 = {"Landroidx/health/connect/client/impl/HealthConnectClientImpl;", "Landroidx/health/connect/client/HealthConnectClient;", "Landroidx/health/connect/client/PermissionController;", "context", "Landroid/content/Context;", "providerPackageName", "", "(Landroid/content/Context;Ljava/lang/String;)V", "delegate", "Landroidx/health/platform/client/HealthDataAsyncClient;", "features", "Landroidx/health/connect/client/HealthConnectFeatures;", "(Landroidx/health/platform/client/HealthDataAsyncClient;Landroidx/health/connect/client/HealthConnectFeatures;)V", "getFeatures", "()Landroidx/health/connect/client/HealthConnectFeatures;", "permissionController", "getPermissionController", "()Landroidx/health/connect/client/PermissionController;", "aggregate", "Landroidx/health/connect/client/aggregate/AggregationResult;", "request", "Landroidx/health/connect/client/request/AggregateRequest;", "(Landroidx/health/connect/client/request/AggregateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "aggregateGroupByDuration", "", "Landroidx/health/connect/client/aggregate/AggregationResultGroupedByDuration;", "Landroidx/health/connect/client/request/AggregateGroupByDurationRequest;", "(Landroidx/health/connect/client/request/AggregateGroupByDurationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "aggregateGroupByPeriod", "Landroidx/health/connect/client/aggregate/AggregationResultGroupedByPeriod;", "Landroidx/health/connect/client/request/AggregateGroupByPeriodRequest;", "(Landroidx/health/connect/client/request/AggregateGroupByPeriodRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteRecords", "", "recordType", "Lkotlin/reflect/KClass;", "Landroidx/health/connect/client/records/Record;", "timeRangeFilter", "Landroidx/health/connect/client/time/TimeRangeFilter;", "(Lkotlin/reflect/KClass;Landroidx/health/connect/client/time/TimeRangeFilter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recordIdsList", "clientRecordIdsList", "(Lkotlin/reflect/KClass;Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChanges", "Landroidx/health/connect/client/response/ChangesResponse;", "changesToken", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChangesToken", "Landroidx/health/connect/client/request/ChangesTokenRequest;", "(Landroidx/health/connect/client/request/ChangesTokenRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGrantedPermissions", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertRecords", "Landroidx/health/connect/client/response/InsertRecordsResponse;", "records", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readRecord", "Landroidx/health/connect/client/response/ReadRecordResponse;", ExifInterface.GPS_DIRECTION_TRUE, "recordId", "(Lkotlin/reflect/KClass;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readRecords", "Landroidx/health/connect/client/response/ReadRecordsResponse;", "Landroidx/health/connect/client/request/ReadRecordsRequest;", "(Landroidx/health/connect/client/request/ReadRecordsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "revokeAllPermissions", "updateRecords", "wrapRemoteException", "function", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "connect-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HealthConnectClientImpl implements HealthConnectClient, PermissionController {
    private final HealthDataAsyncClient delegate;
    private final HealthConnectFeatures features;

    public HealthConnectClientImpl(HealthDataAsyncClient delegate, HealthConnectFeatures features) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(features, "features");
        this.delegate = delegate;
        this.features = features;
    }

    @Override // androidx.health.connect.client.HealthConnectClient
    public HealthConnectFeatures getFeatures() {
        return this.features;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HealthConnectClientImpl(Context context, String providerPackageName) {
        this(r0, r1);
        HealthConnectFeaturesUnavailableImpl healthConnectFeaturesUnavailableImpl;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(providerPackageName, "providerPackageName");
        HealthDataAsyncClient client = HealthDataService.INSTANCE.getClient(context, providerPackageName);
        if (Intrinsics.areEqual(providerPackageName, "com.google.android.apps.healthdata")) {
            healthConnectFeaturesUnavailableImpl = new HealthConnectFeaturesApkImpl(context, providerPackageName);
        } else {
            healthConnectFeaturesUnavailableImpl = HealthConnectFeaturesUnavailableImpl.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0096 A[Catch: RemoteException -> 0x00db, LOOP:0: B:12:0x0090->B:14:0x0096, LOOP_END, TryCatch #0 {RemoteException -> 0x00db, blocks: (B:10:0x0028, B:11:0x007f, B:12:0x0090, B:14:0x0096, B:16:0x00a4, B:24:0x0037, B:25:0x004c, B:27:0x0052, B:29:0x006a), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // androidx.health.connect.client.PermissionController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getGrantedPermissions(Continuation<? super Set<String>> continuation) {
        HealthConnectClientImpl$getGrantedPermissions$1 healthConnectClientImpl$getGrantedPermissions$1;
        int i;
        DeadObjectException deadObjectException;
        Iterator it;
        try {
            if (continuation instanceof HealthConnectClientImpl$getGrantedPermissions$1) {
                healthConnectClientImpl$getGrantedPermissions$1 = (HealthConnectClientImpl$getGrantedPermissions$1) continuation;
                if ((healthConnectClientImpl$getGrantedPermissions$1.label & Integer.MIN_VALUE) != 0) {
                    healthConnectClientImpl$getGrantedPermissions$1.label -= Integer.MIN_VALUE;
                    Object obj = healthConnectClientImpl$getGrantedPermissions$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = healthConnectClientImpl$getGrantedPermissions$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        HealthDataAsyncClient healthDataAsyncClient = this.delegate;
                        List<String> list = HealthPermission.ALL_PERMISSIONS;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                        Iterator<T> it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(PermissionProto.Permission.newBuilder().setPermission((String) it2.next()).build());
                        }
                        ListenableFuture<Set<PermissionProto.Permission>> filterGrantedPermissions = healthDataAsyncClient.filterGrantedPermissions(CollectionsKt.toSet(arrayList));
                        healthConnectClientImpl$getGrantedPermissions$1.label = 1;
                        obj = ListenableFutureKt.await(filterGrantedPermissions, healthConnectClientImpl$getGrantedPermissions$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    Iterable iterable = (Iterable) obj;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                    it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((PermissionProto.Permission) it.next()).getPermission());
                    }
                    Set set = CollectionsKt.toSet(arrayList2);
                    Logger.debug("HealthConnectClient", "Granted " + set.size() + " out of " + HealthPermission.ALL_PERMISSIONS.size() + " permissions.");
                    return set;
                }
            }
            if (i != 0) {
            }
            Iterable iterable2 = (Iterable) obj;
            ArrayList arrayList22 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
            it = iterable2.iterator();
            while (it.hasNext()) {
            }
            Set set2 = CollectionsKt.toSet(arrayList22);
            Logger.debug("HealthConnectClient", "Granted " + set2.size() + " out of " + HealthPermission.ALL_PERMISSIONS.size() + " permissions.");
            return set2;
        } catch (RemoteException e) {
            if (e instanceof DeadObjectException) {
                deadObjectException = new DeadObjectException(e.getMessage());
            } else {
                deadObjectException = e instanceof TransactionTooLargeException ? new TransactionTooLargeException(e.getMessage()) : new RemoteException(e.getMessage());
            }
            deadObjectException.initCause(e);
            throw deadObjectException;
        }
        healthConnectClientImpl$getGrantedPermissions$1 = new HealthConnectClientImpl$getGrantedPermissions$1(this, continuation);
        Object obj2 = healthConnectClientImpl$getGrantedPermissions$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = healthConnectClientImpl$getGrantedPermissions$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // androidx.health.connect.client.PermissionController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object revokeAllPermissions(Continuation<? super Unit> continuation) {
        HealthConnectClientImpl$revokeAllPermissions$1 healthConnectClientImpl$revokeAllPermissions$1;
        int i;
        DeadObjectException deadObjectException;
        try {
            if (continuation instanceof HealthConnectClientImpl$revokeAllPermissions$1) {
                healthConnectClientImpl$revokeAllPermissions$1 = (HealthConnectClientImpl$revokeAllPermissions$1) continuation;
                if ((healthConnectClientImpl$revokeAllPermissions$1.label & Integer.MIN_VALUE) != 0) {
                    healthConnectClientImpl$revokeAllPermissions$1.label -= Integer.MIN_VALUE;
                    Object obj = healthConnectClientImpl$revokeAllPermissions$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = healthConnectClientImpl$revokeAllPermissions$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        ListenableFuture<Unit> revokeAllPermissions = this.delegate.revokeAllPermissions();
                        healthConnectClientImpl$revokeAllPermissions$1.label = 1;
                        if (ListenableFutureKt.await(revokeAllPermissions, healthConnectClientImpl$revokeAllPermissions$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    Logger.debug("HealthConnectClient", "Revoked all permissions.");
                    return Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            Logger.debug("HealthConnectClient", "Revoked all permissions.");
            return Unit.INSTANCE;
        } catch (RemoteException e) {
            if (e instanceof DeadObjectException) {
                deadObjectException = new DeadObjectException(e.getMessage());
            } else {
                deadObjectException = e instanceof TransactionTooLargeException ? new TransactionTooLargeException(e.getMessage()) : new RemoteException(e.getMessage());
            }
            deadObjectException.initCause(e);
            throw deadObjectException;
        }
        healthConnectClientImpl$revokeAllPermissions$1 = new HealthConnectClientImpl$revokeAllPermissions$1(this, continuation);
        Object obj2 = healthConnectClientImpl$revokeAllPermissions$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = healthConnectClientImpl$revokeAllPermissions$1.label;
    }

    @Override // androidx.health.connect.client.HealthConnectClient
    public PermissionController getPermissionController() {
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // androidx.health.connect.client.HealthConnectClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object insertRecords(List<? extends Record> list, Continuation<? super InsertRecordsResponse> continuation) {
        HealthConnectClientImpl$insertRecords$1 healthConnectClientImpl$insertRecords$1;
        int i;
        DeadObjectException deadObjectException;
        try {
            if (continuation instanceof HealthConnectClientImpl$insertRecords$1) {
                healthConnectClientImpl$insertRecords$1 = (HealthConnectClientImpl$insertRecords$1) continuation;
                if ((healthConnectClientImpl$insertRecords$1.label & Integer.MIN_VALUE) != 0) {
                    healthConnectClientImpl$insertRecords$1.label -= Integer.MIN_VALUE;
                    Object obj = healthConnectClientImpl$insertRecords$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = healthConnectClientImpl$insertRecords$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        HealthDataAsyncClient healthDataAsyncClient = this.delegate;
                        List<? extends Record> list2 = list;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(RecordToProtoConvertersKt.toProto((Record) it.next()));
                        }
                        ListenableFuture<List<String>> insertData = healthDataAsyncClient.insertData(arrayList);
                        healthConnectClientImpl$insertRecords$1.L$0 = list;
                        healthConnectClientImpl$insertRecords$1.label = 1;
                        obj = ListenableFutureKt.await(insertData, healthConnectClientImpl$insertRecords$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        list = (List) healthConnectClientImpl$insertRecords$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    List list3 = (List) obj;
                    Logger.debug("HealthConnectClient", list.size() + " records inserted.");
                    return new InsertRecordsResponse(list3);
                }
            }
            if (i != 0) {
            }
            List list32 = (List) obj;
            Logger.debug("HealthConnectClient", list.size() + " records inserted.");
            return new InsertRecordsResponse(list32);
        } catch (RemoteException e) {
            if (e instanceof DeadObjectException) {
                deadObjectException = new DeadObjectException(e.getMessage());
            } else {
                deadObjectException = e instanceof TransactionTooLargeException ? new TransactionTooLargeException(e.getMessage()) : new RemoteException(e.getMessage());
            }
            deadObjectException.initCause(e);
            throw deadObjectException;
        }
        healthConnectClientImpl$insertRecords$1 = new HealthConnectClientImpl$insertRecords$1(this, continuation);
        Object obj2 = healthConnectClientImpl$insertRecords$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = healthConnectClientImpl$insertRecords$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // androidx.health.connect.client.HealthConnectClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateRecords(List<? extends Record> list, Continuation<? super Unit> continuation) {
        HealthConnectClientImpl$updateRecords$1 healthConnectClientImpl$updateRecords$1;
        int i;
        DeadObjectException deadObjectException;
        try {
            if (continuation instanceof HealthConnectClientImpl$updateRecords$1) {
                healthConnectClientImpl$updateRecords$1 = (HealthConnectClientImpl$updateRecords$1) continuation;
                if ((healthConnectClientImpl$updateRecords$1.label & Integer.MIN_VALUE) != 0) {
                    healthConnectClientImpl$updateRecords$1.label -= Integer.MIN_VALUE;
                    Object obj = healthConnectClientImpl$updateRecords$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = healthConnectClientImpl$updateRecords$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        HealthDataAsyncClient healthDataAsyncClient = this.delegate;
                        List<? extends Record> list2 = list;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(RecordToProtoConvertersKt.toProto((Record) it.next()));
                        }
                        ListenableFuture<Unit> updateData = healthDataAsyncClient.updateData(arrayList);
                        healthConnectClientImpl$updateRecords$1.L$0 = list;
                        healthConnectClientImpl$updateRecords$1.label = 1;
                        if (ListenableFutureKt.await(updateData, healthConnectClientImpl$updateRecords$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        list = (List) healthConnectClientImpl$updateRecords$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    Logger.debug("HealthConnectClient", list.size() + " records updated.");
                    return Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            Logger.debug("HealthConnectClient", list.size() + " records updated.");
            return Unit.INSTANCE;
        } catch (RemoteException e) {
            if (e instanceof DeadObjectException) {
                deadObjectException = new DeadObjectException(e.getMessage());
            } else {
                deadObjectException = e instanceof TransactionTooLargeException ? new TransactionTooLargeException(e.getMessage()) : new RemoteException(e.getMessage());
            }
            deadObjectException.initCause(e);
            throw deadObjectException;
        }
        healthConnectClientImpl$updateRecords$1 = new HealthConnectClientImpl$updateRecords$1(this, continuation);
        Object obj2 = healthConnectClientImpl$updateRecords$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = healthConnectClientImpl$updateRecords$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // androidx.health.connect.client.HealthConnectClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object deleteRecords(KClass<? extends Record> kClass, List<String> list, List<String> list2, Continuation<? super Unit> continuation) {
        HealthConnectClientImpl$deleteRecords$1 healthConnectClientImpl$deleteRecords$1;
        int i;
        DeadObjectException deadObjectException;
        try {
            if (continuation instanceof HealthConnectClientImpl$deleteRecords$1) {
                healthConnectClientImpl$deleteRecords$1 = (HealthConnectClientImpl$deleteRecords$1) continuation;
                if ((healthConnectClientImpl$deleteRecords$1.label & Integer.MIN_VALUE) != 0) {
                    healthConnectClientImpl$deleteRecords$1.label -= Integer.MIN_VALUE;
                    Object obj = healthConnectClientImpl$deleteRecords$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = healthConnectClientImpl$deleteRecords$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        ListenableFuture<Unit> deleteData = this.delegate.deleteData(DataTypeIdPairConverterKt.toDataTypeIdPairProtoList(kClass, list), DataTypeIdPairConverterKt.toDataTypeIdPairProtoList(kClass, list2));
                        healthConnectClientImpl$deleteRecords$1.L$0 = list;
                        healthConnectClientImpl$deleteRecords$1.L$1 = list2;
                        healthConnectClientImpl$deleteRecords$1.label = 1;
                        if (ListenableFutureKt.await(deleteData, healthConnectClientImpl$deleteRecords$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        list2 = (List) healthConnectClientImpl$deleteRecords$1.L$1;
                        list = (List) healthConnectClientImpl$deleteRecords$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    Logger.debug("HealthConnectClient", (list.size() + list2.size()) + " records deleted.");
                    return Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            Logger.debug("HealthConnectClient", (list.size() + list2.size()) + " records deleted.");
            return Unit.INSTANCE;
        } catch (RemoteException e) {
            if (e instanceof DeadObjectException) {
                deadObjectException = new DeadObjectException(e.getMessage());
            } else {
                deadObjectException = e instanceof TransactionTooLargeException ? new TransactionTooLargeException(e.getMessage()) : new RemoteException(e.getMessage());
            }
            deadObjectException.initCause(e);
            throw deadObjectException;
        }
        healthConnectClientImpl$deleteRecords$1 = new HealthConnectClientImpl$deleteRecords$1(this, continuation);
        Object obj2 = healthConnectClientImpl$deleteRecords$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = healthConnectClientImpl$deleteRecords$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // androidx.health.connect.client.HealthConnectClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object deleteRecords(KClass<? extends Record> kClass, TimeRangeFilter timeRangeFilter, Continuation<? super Unit> continuation) {
        HealthConnectClientImpl$deleteRecords$3 healthConnectClientImpl$deleteRecords$3;
        int i;
        DeadObjectException deadObjectException;
        try {
            if (continuation instanceof HealthConnectClientImpl$deleteRecords$3) {
                healthConnectClientImpl$deleteRecords$3 = (HealthConnectClientImpl$deleteRecords$3) continuation;
                if ((healthConnectClientImpl$deleteRecords$3.label & Integer.MIN_VALUE) != 0) {
                    healthConnectClientImpl$deleteRecords$3.label -= Integer.MIN_VALUE;
                    Object obj = healthConnectClientImpl$deleteRecords$3.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = healthConnectClientImpl$deleteRecords$3.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        ListenableFuture<Unit> deleteDataRange = this.delegate.deleteDataRange(DeleteDataRangeRequestToProtoKt.toDeleteDataRangeRequestProto(kClass, timeRangeFilter));
                        healthConnectClientImpl$deleteRecords$3.label = 1;
                        if (ListenableFutureKt.await(deleteDataRange, healthConnectClientImpl$deleteRecords$3) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    Logger.debug("HealthConnectClient", "Records deletion successful.");
                    return Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            Logger.debug("HealthConnectClient", "Records deletion successful.");
            return Unit.INSTANCE;
        } catch (RemoteException e) {
            if (e instanceof DeadObjectException) {
                deadObjectException = new DeadObjectException(e.getMessage());
            } else {
                deadObjectException = e instanceof TransactionTooLargeException ? new TransactionTooLargeException(e.getMessage()) : new RemoteException(e.getMessage());
            }
            deadObjectException.initCause(e);
            throw deadObjectException;
        }
        healthConnectClientImpl$deleteRecords$3 = new HealthConnectClientImpl$deleteRecords$3(this, continuation);
        Object obj2 = healthConnectClientImpl$deleteRecords$3.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = healthConnectClientImpl$deleteRecords$3.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // androidx.health.connect.client.HealthConnectClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T extends Record> Object readRecord(KClass<T> kClass, String str, Continuation<? super ReadRecordResponse<T>> continuation) {
        HealthConnectClientImpl$readRecord$1 healthConnectClientImpl$readRecord$1;
        int i;
        DeadObjectException deadObjectException;
        try {
            if (continuation instanceof HealthConnectClientImpl$readRecord$1) {
                healthConnectClientImpl$readRecord$1 = (HealthConnectClientImpl$readRecord$1) continuation;
                if ((healthConnectClientImpl$readRecord$1.label & Integer.MIN_VALUE) != 0) {
                    healthConnectClientImpl$readRecord$1.label -= Integer.MIN_VALUE;
                    Object obj = healthConnectClientImpl$readRecord$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = healthConnectClientImpl$readRecord$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        ListenableFuture<DataProto.DataPoint> readData = this.delegate.readData(ReadDataRequestToProtoKt.toReadDataRequestProto(kClass, str));
                        healthConnectClientImpl$readRecord$1.L$0 = str;
                        healthConnectClientImpl$readRecord$1.label = 1;
                        obj = ListenableFutureKt.await(readData, healthConnectClientImpl$readRecord$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str = (String) healthConnectClientImpl$readRecord$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    Record record = ProtoToRecordConvertersKt.toRecord((DataProto.DataPoint) obj);
                    Intrinsics.checkNotNull(record, "null cannot be cast to non-null type T of androidx.health.connect.client.impl.HealthConnectClientImpl.readRecord");
                    ReadRecordResponse readRecordResponse = new ReadRecordResponse(record);
                    Logger.debug("HealthConnectClient", "Reading record of " + str + " successful.");
                    return readRecordResponse;
                }
            }
            if (i != 0) {
            }
            Record record2 = ProtoToRecordConvertersKt.toRecord((DataProto.DataPoint) obj);
            Intrinsics.checkNotNull(record2, "null cannot be cast to non-null type T of androidx.health.connect.client.impl.HealthConnectClientImpl.readRecord");
            ReadRecordResponse readRecordResponse2 = new ReadRecordResponse(record2);
            Logger.debug("HealthConnectClient", "Reading record of " + str + " successful.");
            return readRecordResponse2;
        } catch (RemoteException e) {
            if (e instanceof DeadObjectException) {
                deadObjectException = new DeadObjectException(e.getMessage());
            } else {
                deadObjectException = e instanceof TransactionTooLargeException ? new TransactionTooLargeException(e.getMessage()) : new RemoteException(e.getMessage());
            }
            deadObjectException.initCause(e);
            throw deadObjectException;
        }
        healthConnectClientImpl$readRecord$1 = new HealthConnectClientImpl$readRecord$1(this, continuation);
        Object obj2 = healthConnectClientImpl$readRecord$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = healthConnectClientImpl$readRecord$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // androidx.health.connect.client.HealthConnectClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getChangesToken(ChangesTokenRequest changesTokenRequest, Continuation<? super String> continuation) {
        HealthConnectClientImpl$getChangesToken$1 healthConnectClientImpl$getChangesToken$1;
        int i;
        DeadObjectException deadObjectException;
        try {
            if (continuation instanceof HealthConnectClientImpl$getChangesToken$1) {
                healthConnectClientImpl$getChangesToken$1 = (HealthConnectClientImpl$getChangesToken$1) continuation;
                if ((healthConnectClientImpl$getChangesToken$1.label & Integer.MIN_VALUE) != 0) {
                    healthConnectClientImpl$getChangesToken$1.label -= Integer.MIN_VALUE;
                    Object obj = healthConnectClientImpl$getChangesToken$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = healthConnectClientImpl$getChangesToken$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        HealthDataAsyncClient healthDataAsyncClient = this.delegate;
                        RequestProto.GetChangesTokenRequest.Builder newBuilder = RequestProto.GetChangesTokenRequest.newBuilder();
                        Set<KClass<? extends Record>> recordTypes = changesTokenRequest.getRecordTypes();
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(recordTypes, 10));
                        Iterator<T> it = recordTypes.iterator();
                        while (it.hasNext()) {
                            arrayList.add(DataTypeConverterKt.toDataType((KClass) it.next()));
                        }
                        RequestProto.GetChangesTokenRequest.Builder addAllDataType = newBuilder.addAllDataType(arrayList);
                        Set<DataOrigin> dataOriginFilters = changesTokenRequest.getDataOriginFilters();
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(dataOriginFilters, 10));
                        Iterator<T> it2 = dataOriginFilters.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(DataProto.DataOrigin.newBuilder().setApplicationId(((DataOrigin) it2.next()).getPackageName()).build());
                        }
                        RequestProto.GetChangesTokenRequest build = addAllDataType.addAllDataOriginFilters(arrayList2).build();
                        Intrinsics.checkNotNullExpressionValue(build, "newBuilder()\n           …                 .build()");
                        ListenableFuture<ResponseProto.GetChangesTokenResponse> changesToken = healthDataAsyncClient.getChangesToken(build);
                        healthConnectClientImpl$getChangesToken$1.label = 1;
                        obj = ListenableFutureKt.await(changesToken, healthConnectClientImpl$getChangesToken$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    String changeToken = ((ResponseProto.GetChangesTokenResponse) obj).getChangesToken();
                    Logger.debug("HealthConnectClient", "Retrieved change token " + changeToken + '.');
                    Intrinsics.checkNotNullExpressionValue(changeToken, "changeToken");
                    return changeToken;
                }
            }
            if (i != 0) {
            }
            String changeToken2 = ((ResponseProto.GetChangesTokenResponse) obj).getChangesToken();
            Logger.debug("HealthConnectClient", "Retrieved change token " + changeToken2 + '.');
            Intrinsics.checkNotNullExpressionValue(changeToken2, "changeToken");
            return changeToken2;
        } catch (RemoteException e) {
            if (e instanceof DeadObjectException) {
                deadObjectException = new DeadObjectException(e.getMessage());
            } else {
                deadObjectException = e instanceof TransactionTooLargeException ? new TransactionTooLargeException(e.getMessage()) : new RemoteException(e.getMessage());
            }
            deadObjectException.initCause(e);
            throw deadObjectException;
        }
        healthConnectClientImpl$getChangesToken$1 = new HealthConnectClientImpl$getChangesToken$1(this, continuation);
        Object obj2 = healthConnectClientImpl$getChangesToken$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = healthConnectClientImpl$getChangesToken$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // androidx.health.connect.client.HealthConnectClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getChanges(String str, Continuation<? super ChangesResponse> continuation) {
        HealthConnectClientImpl$getChanges$1 healthConnectClientImpl$getChanges$1;
        int i;
        DeadObjectException deadObjectException;
        try {
            if (continuation instanceof HealthConnectClientImpl$getChanges$1) {
                healthConnectClientImpl$getChanges$1 = (HealthConnectClientImpl$getChanges$1) continuation;
                if ((healthConnectClientImpl$getChanges$1.label & Integer.MIN_VALUE) != 0) {
                    healthConnectClientImpl$getChanges$1.label -= Integer.MIN_VALUE;
                    Object obj = healthConnectClientImpl$getChanges$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = healthConnectClientImpl$getChanges$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        HealthDataAsyncClient healthDataAsyncClient = this.delegate;
                        RequestProto.GetChangesRequest build = RequestProto.GetChangesRequest.newBuilder().setChangesToken(str).build();
                        Intrinsics.checkNotNullExpressionValue(build, "newBuilder()\n           …                 .build()");
                        ListenableFuture<ResponseProto.GetChangesResponse> changes = healthDataAsyncClient.getChanges(build);
                        healthConnectClientImpl$getChanges$1.L$0 = str;
                        healthConnectClientImpl$getChanges$1.label = 1;
                        obj = ListenableFutureKt.await(changes, healthConnectClientImpl$getChanges$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str = (String) healthConnectClientImpl$getChanges$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    ResponseProto.GetChangesResponse getChangesResponse = (ResponseProto.GetChangesResponse) obj;
                    Logger.debug("HealthConnectClient", "Retrieved changes successful with " + str + ", next token " + getChangesResponse.getNextChangesToken() + '.');
                    return ProtoToChangesResponseKt.toChangesResponse(getChangesResponse);
                }
            }
            if (i != 0) {
            }
            ResponseProto.GetChangesResponse getChangesResponse2 = (ResponseProto.GetChangesResponse) obj;
            Logger.debug("HealthConnectClient", "Retrieved changes successful with " + str + ", next token " + getChangesResponse2.getNextChangesToken() + '.');
            return ProtoToChangesResponseKt.toChangesResponse(getChangesResponse2);
        } catch (RemoteException e) {
            if (e instanceof DeadObjectException) {
                deadObjectException = new DeadObjectException(e.getMessage());
            } else {
                deadObjectException = e instanceof TransactionTooLargeException ? new TransactionTooLargeException(e.getMessage()) : new RemoteException(e.getMessage());
            }
            deadObjectException.initCause(e);
            throw deadObjectException;
        }
        healthConnectClientImpl$getChanges$1 = new HealthConnectClientImpl$getChanges$1(this, continuation);
        Object obj2 = healthConnectClientImpl$getChanges$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = healthConnectClientImpl$getChanges$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // androidx.health.connect.client.HealthConnectClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T extends Record> Object readRecords(ReadRecordsRequest<T> readRecordsRequest, Continuation<? super ReadRecordsResponse<T>> continuation) {
        HealthConnectClientImpl$readRecords$1 healthConnectClientImpl$readRecords$1;
        int i;
        DeadObjectException deadObjectException;
        try {
            if (continuation instanceof HealthConnectClientImpl$readRecords$1) {
                healthConnectClientImpl$readRecords$1 = (HealthConnectClientImpl$readRecords$1) continuation;
                if ((healthConnectClientImpl$readRecords$1.label & Integer.MIN_VALUE) != 0) {
                    healthConnectClientImpl$readRecords$1.label -= Integer.MIN_VALUE;
                    Object obj = healthConnectClientImpl$readRecords$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = healthConnectClientImpl$readRecords$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        if (readRecordsRequest.getDeduplicateStrategy() != 0) {
                            throw new NotImplementedError("An operation is not implemented: Not yet implemented");
                        }
                        ListenableFuture<ResponseProto.ReadDataRangeResponse> readDataRange = this.delegate.readDataRange(ReadDataRangeRequestToProtoKt.toReadDataRangeRequestProto(readRecordsRequest));
                        healthConnectClientImpl$readRecords$1.label = 1;
                        obj = ListenableFutureKt.await(readDataRange, healthConnectClientImpl$readRecords$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    ReadRecordsResponse readRecordsResponse = ProtoToReadRecordsResponseKt.toReadRecordsResponse((ResponseProto.ReadDataRangeResponse) obj);
                    Logger.debug("HealthConnectClient", "Retrieve records successful.");
                    return readRecordsResponse;
                }
            }
            if (i != 0) {
            }
            ReadRecordsResponse readRecordsResponse2 = ProtoToReadRecordsResponseKt.toReadRecordsResponse((ResponseProto.ReadDataRangeResponse) obj);
            Logger.debug("HealthConnectClient", "Retrieve records successful.");
            return readRecordsResponse2;
        } catch (RemoteException e) {
            if (e instanceof DeadObjectException) {
                deadObjectException = new DeadObjectException(e.getMessage());
            } else {
                deadObjectException = e instanceof TransactionTooLargeException ? new TransactionTooLargeException(e.getMessage()) : new RemoteException(e.getMessage());
            }
            deadObjectException.initCause(e);
            throw deadObjectException;
        }
        healthConnectClientImpl$readRecords$1 = new HealthConnectClientImpl$readRecords$1(this, continuation);
        Object obj2 = healthConnectClientImpl$readRecords$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = healthConnectClientImpl$readRecords$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // androidx.health.connect.client.HealthConnectClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object aggregate(AggregateRequest aggregateRequest, Continuation<? super AggregationResult> continuation) {
        HealthConnectClientImpl$aggregate$1 healthConnectClientImpl$aggregate$1;
        int i;
        DeadObjectException deadObjectException;
        try {
            if (continuation instanceof HealthConnectClientImpl$aggregate$1) {
                healthConnectClientImpl$aggregate$1 = (HealthConnectClientImpl$aggregate$1) continuation;
                if ((healthConnectClientImpl$aggregate$1.label & Integer.MIN_VALUE) != 0) {
                    healthConnectClientImpl$aggregate$1.label -= Integer.MIN_VALUE;
                    Object obj = healthConnectClientImpl$aggregate$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = healthConnectClientImpl$aggregate$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        ListenableFuture<ResponseProto.AggregateDataResponse> aggregate = this.delegate.aggregate(AggregateRequestToProtoKt.toProto(aggregateRequest));
                        healthConnectClientImpl$aggregate$1.label = 1;
                        obj = ListenableFutureKt.await(aggregate, healthConnectClientImpl$aggregate$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    List<DataProto.AggregateDataRow> rowsList = ((ResponseProto.AggregateDataResponse) obj).getRowsList();
                    Intrinsics.checkNotNullExpressionValue(rowsList, "responseProto.rowsList");
                    Object first = CollectionsKt.first((List<? extends Object>) rowsList);
                    Intrinsics.checkNotNullExpressionValue(first, "responseProto.rowsList.first()");
                    AggregationResult retrieveAggregateDataRow = ProtoToAggregateDataRowKt.retrieveAggregateDataRow((DataProto.AggregateDataRow) first);
                    Logger.debug("HealthConnectClient", "Retrieved " + (retrieveAggregateDataRow.getLongValues().size() + retrieveAggregateDataRow.getDoubleValues().size()) + " metrics.");
                    return retrieveAggregateDataRow;
                }
            }
            if (i != 0) {
            }
            List<DataProto.AggregateDataRow> rowsList2 = ((ResponseProto.AggregateDataResponse) obj).getRowsList();
            Intrinsics.checkNotNullExpressionValue(rowsList2, "responseProto.rowsList");
            Object first2 = CollectionsKt.first((List<? extends Object>) rowsList2);
            Intrinsics.checkNotNullExpressionValue(first2, "responseProto.rowsList.first()");
            AggregationResult retrieveAggregateDataRow2 = ProtoToAggregateDataRowKt.retrieveAggregateDataRow((DataProto.AggregateDataRow) first2);
            Logger.debug("HealthConnectClient", "Retrieved " + (retrieveAggregateDataRow2.getLongValues().size() + retrieveAggregateDataRow2.getDoubleValues().size()) + " metrics.");
            return retrieveAggregateDataRow2;
        } catch (RemoteException e) {
            if (e instanceof DeadObjectException) {
                deadObjectException = new DeadObjectException(e.getMessage());
            } else {
                deadObjectException = e instanceof TransactionTooLargeException ? new TransactionTooLargeException(e.getMessage()) : new RemoteException(e.getMessage());
            }
            deadObjectException.initCause(e);
            throw deadObjectException;
        }
        healthConnectClientImpl$aggregate$1 = new HealthConnectClientImpl$aggregate$1(this, continuation);
        Object obj2 = healthConnectClientImpl$aggregate$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = healthConnectClientImpl$aggregate$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006c A[LOOP:0: B:13:0x0066->B:15:0x006c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // androidx.health.connect.client.HealthConnectClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object aggregateGroupByDuration(AggregateGroupByDurationRequest aggregateGroupByDurationRequest, Continuation<? super List<AggregationResultGroupedByDuration>> continuation) {
        HealthConnectClientImpl$aggregateGroupByDuration$1 healthConnectClientImpl$aggregateGroupByDuration$1;
        int i;
        DeadObjectException deadObjectException;
        try {
            if (continuation instanceof HealthConnectClientImpl$aggregateGroupByDuration$1) {
                healthConnectClientImpl$aggregateGroupByDuration$1 = (HealthConnectClientImpl$aggregateGroupByDuration$1) continuation;
                if ((healthConnectClientImpl$aggregateGroupByDuration$1.label & Integer.MIN_VALUE) != 0) {
                    healthConnectClientImpl$aggregateGroupByDuration$1.label -= Integer.MIN_VALUE;
                    Object obj = healthConnectClientImpl$aggregateGroupByDuration$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = healthConnectClientImpl$aggregateGroupByDuration$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        ListenableFuture<ResponseProto.AggregateDataResponse> aggregate = this.delegate.aggregate(AggregateRequestToProtoKt.toProto(aggregateGroupByDurationRequest));
                        healthConnectClientImpl$aggregateGroupByDuration$1.label = 1;
                        obj = ListenableFutureKt.await(aggregate, healthConnectClientImpl$aggregateGroupByDuration$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    List<DataProto.AggregateDataRow> rowsList = ((ResponseProto.AggregateDataResponse) obj).getRowsList();
                    Intrinsics.checkNotNullExpressionValue(rowsList, "responseProto.rowsList");
                    List<DataProto.AggregateDataRow> list = rowsList;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (DataProto.AggregateDataRow it : list) {
                        Intrinsics.checkNotNullExpressionValue(it, "it");
                        arrayList.add(ProtoToAggregateDataRowKt.toAggregateDataRowGroupByDuration(it));
                    }
                    List list2 = CollectionsKt.toList(arrayList);
                    Logger.debug("HealthConnectClient", "Retrieved " + list2.size() + " duration aggregation buckets.");
                    return list2;
                }
            }
            if (i != 0) {
            }
            List<DataProto.AggregateDataRow> rowsList2 = ((ResponseProto.AggregateDataResponse) obj).getRowsList();
            Intrinsics.checkNotNullExpressionValue(rowsList2, "responseProto.rowsList");
            List<DataProto.AggregateDataRow> list3 = rowsList2;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            while (r4.hasNext()) {
            }
            List list22 = CollectionsKt.toList(arrayList2);
            Logger.debug("HealthConnectClient", "Retrieved " + list22.size() + " duration aggregation buckets.");
            return list22;
        } catch (RemoteException e) {
            if (e instanceof DeadObjectException) {
                deadObjectException = new DeadObjectException(e.getMessage());
            } else {
                deadObjectException = e instanceof TransactionTooLargeException ? new TransactionTooLargeException(e.getMessage()) : new RemoteException(e.getMessage());
            }
            deadObjectException.initCause(e);
            throw deadObjectException;
        }
        healthConnectClientImpl$aggregateGroupByDuration$1 = new HealthConnectClientImpl$aggregateGroupByDuration$1(this, continuation);
        Object obj2 = healthConnectClientImpl$aggregateGroupByDuration$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = healthConnectClientImpl$aggregateGroupByDuration$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006c A[LOOP:0: B:13:0x0066->B:15:0x006c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // androidx.health.connect.client.HealthConnectClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object aggregateGroupByPeriod(AggregateGroupByPeriodRequest aggregateGroupByPeriodRequest, Continuation<? super List<AggregationResultGroupedByPeriod>> continuation) {
        HealthConnectClientImpl$aggregateGroupByPeriod$1 healthConnectClientImpl$aggregateGroupByPeriod$1;
        int i;
        DeadObjectException deadObjectException;
        try {
            if (continuation instanceof HealthConnectClientImpl$aggregateGroupByPeriod$1) {
                healthConnectClientImpl$aggregateGroupByPeriod$1 = (HealthConnectClientImpl$aggregateGroupByPeriod$1) continuation;
                if ((healthConnectClientImpl$aggregateGroupByPeriod$1.label & Integer.MIN_VALUE) != 0) {
                    healthConnectClientImpl$aggregateGroupByPeriod$1.label -= Integer.MIN_VALUE;
                    Object obj = healthConnectClientImpl$aggregateGroupByPeriod$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = healthConnectClientImpl$aggregateGroupByPeriod$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        ListenableFuture<ResponseProto.AggregateDataResponse> aggregate = this.delegate.aggregate(AggregateRequestToProtoKt.toProto(aggregateGroupByPeriodRequest));
                        healthConnectClientImpl$aggregateGroupByPeriod$1.label = 1;
                        obj = ListenableFutureKt.await(aggregate, healthConnectClientImpl$aggregateGroupByPeriod$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    List<DataProto.AggregateDataRow> rowsList = ((ResponseProto.AggregateDataResponse) obj).getRowsList();
                    Intrinsics.checkNotNullExpressionValue(rowsList, "responseProto.rowsList");
                    List<DataProto.AggregateDataRow> list = rowsList;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (DataProto.AggregateDataRow it : list) {
                        Intrinsics.checkNotNullExpressionValue(it, "it");
                        arrayList.add(ProtoToAggregateDataRowKt.toAggregateDataRowGroupByPeriod(it));
                    }
                    List list2 = CollectionsKt.toList(arrayList);
                    Logger.debug("HealthConnectClient", "Retrieved " + list2.size() + " period aggregation buckets.");
                    return list2;
                }
            }
            if (i != 0) {
            }
            List<DataProto.AggregateDataRow> rowsList2 = ((ResponseProto.AggregateDataResponse) obj).getRowsList();
            Intrinsics.checkNotNullExpressionValue(rowsList2, "responseProto.rowsList");
            List<DataProto.AggregateDataRow> list3 = rowsList2;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            while (r4.hasNext()) {
            }
            List list22 = CollectionsKt.toList(arrayList2);
            Logger.debug("HealthConnectClient", "Retrieved " + list22.size() + " period aggregation buckets.");
            return list22;
        } catch (RemoteException e) {
            if (e instanceof DeadObjectException) {
                deadObjectException = new DeadObjectException(e.getMessage());
            } else {
                deadObjectException = e instanceof TransactionTooLargeException ? new TransactionTooLargeException(e.getMessage()) : new RemoteException(e.getMessage());
            }
            deadObjectException.initCause(e);
            throw deadObjectException;
        }
        healthConnectClientImpl$aggregateGroupByPeriod$1 = new HealthConnectClientImpl$aggregateGroupByPeriod$1(this, continuation);
        Object obj2 = healthConnectClientImpl$aggregateGroupByPeriod$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = healthConnectClientImpl$aggregateGroupByPeriod$1.label;
    }

    private final <T> T wrapRemoteException(Function0<? extends T> function) {
        DeadObjectException deadObjectException;
        try {
            return function.invoke();
        } catch (RemoteException e) {
            if (e instanceof DeadObjectException) {
                deadObjectException = new DeadObjectException(e.getMessage());
            } else {
                deadObjectException = e instanceof TransactionTooLargeException ? new TransactionTooLargeException(e.getMessage()) : new RemoteException(e.getMessage());
            }
            deadObjectException.initCause(e);
            throw deadObjectException;
        }
    }
}
