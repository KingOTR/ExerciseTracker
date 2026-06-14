package androidx.health.connect.client.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.health.connect.AggregateRecordsGroupedByDurationResponse;
import android.health.connect.AggregateRecordsGroupedByPeriodResponse;
import android.health.connect.AggregateRecordsResponse;
import android.health.connect.HealthConnectException;
import android.health.connect.HealthConnectManager;
import android.health.connect.LocalTimeRangeFilter;
import android.health.connect.ReadRecordsResponse;
import android.health.connect.changelog.ChangeLogTokenResponse;
import android.health.connect.changelog.ChangeLogsRequest;
import android.health.connect.changelog.ChangeLogsResponse;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.core.os.OutcomeReceiverKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.health.connect.client.HealthConnectClient;
import androidx.health.connect.client.HealthConnectFeatures;
import androidx.health.connect.client.PermissionController;
import androidx.health.connect.client.aggregate.AggregateMetric;
import androidx.health.connect.client.aggregate.AggregationResult;
import androidx.health.connect.client.aggregate.AggregationResultGroupedByDuration;
import androidx.health.connect.client.aggregate.AggregationResultGroupedByPeriod;
import androidx.health.connect.client.changes.DeletionChange;
import androidx.health.connect.client.changes.UpsertionChange;
import androidx.health.connect.client.feature.HealthConnectFeaturesPlatformImpl;
import androidx.health.connect.client.impl.platform.ExceptionConverterKt;
import androidx.health.connect.client.impl.platform.aggregate.AggregationExtensionsKt;
import androidx.health.connect.client.impl.platform.aggregate.HealthConnectClientAggregationExtensionsKt;
import androidx.health.connect.client.impl.platform.records.RecordConvertersKt;
import androidx.health.connect.client.impl.platform.request.RequestConvertersKt;
import androidx.health.connect.client.impl.platform.response.InsertRecordsResponseConverterKt;
import androidx.health.connect.client.impl.platform.response.ResponseConvertersKt;
import androidx.health.connect.client.permission.HealthPermission;
import androidx.health.connect.client.records.Record;
import androidx.health.connect.client.request.AggregateGroupByDurationRequest;
import androidx.health.connect.client.request.AggregateGroupByPeriodRequest;
import androidx.health.connect.client.request.AggregateRequest;
import androidx.health.connect.client.request.ChangesTokenRequest;
import androidx.health.connect.client.request.ReadRecordsRequest;
import androidx.health.connect.client.response.ChangesResponse;
import androidx.health.connect.client.response.InsertRecordsResponse;
import androidx.health.connect.client.response.ReadRecordResponse;
import androidx.health.connect.client.time.TimeRangeFilter;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorsKt;

/* compiled from: HealthConnectClientUpsideDownImpl.kt */
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B)\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0002\u0010\u000bJ\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0096@¢\u0006\u0002\u0010\u001bJ\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u0019\u001a\u00020\u001fH\u0096@¢\u0006\u0002\u0010 J\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u001d2\u0006\u0010\u0019\u001a\u00020#H\u0096@¢\u0006\u0002\u0010$J&\u0010%\u001a\u00020\n2\u000e\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u00020(0'2\u0006\u0010)\u001a\u00020*H\u0096@¢\u0006\u0002\u0010+J:\u0010%\u001a\u00020\n2\u000e\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u00020(0'2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\t0\u001d2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\t0\u001dH\u0096@¢\u0006\u0002\u0010.J\u0016\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\tH\u0096@¢\u0006\u0002\u00102J\u0016\u00103\u001a\u00020\t2\u0006\u0010\u0019\u001a\u000204H\u0096@¢\u0006\u0002\u00105J\u0014\u00106\u001a\b\u0012\u0004\u0012\u00020\t07H\u0096@¢\u0006\u0002\u00108J\u001c\u00109\u001a\u00020:2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020(0\u001dH\u0096@¢\u0006\u0002\u0010<J4\u0010=\u001a\b\u0012\u0004\u0012\u0002H?0>\"\b\b\u0000\u0010?*\u00020(2\f\u0010&\u001a\b\u0012\u0004\u0012\u0002H?0'2\u0006\u0010@\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010AJ,\u0010B\u001a\b\u0012\u0004\u0012\u0002H?0C\"\b\b\u0000\u0010?*\u00020(2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H?0DH\u0096@¢\u0006\u0002\u0010EJ\u000e\u0010F\u001a\u00020\nH\u0096@¢\u0006\u0002\u00108J\u001c\u0010G\u001a\u00020\n2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020(0\u001dH\u0096@¢\u0006\u0002\u0010<J\u001a\u0010H\u001a\u00020\n2\u0010\u0010I\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030J07H\u0002J2\u0010K\u001a\u0002H?\"\u0004\b\u0000\u0010?2\u001c\u0010L\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H?0M\u0012\u0006\u0012\u0004\u0018\u00010N0\u0007H\u0082@¢\u0006\u0002\u0010OR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006P"}, d2 = {"Landroidx/health/connect/client/impl/HealthConnectClientUpsideDownImpl;", "Landroidx/health/connect/client/HealthConnectClient;", "Landroidx/health/connect/client/PermissionController;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "revokePermissionsFunction", "Lkotlin/Function1;", "", "", "", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "executor", "Ljava/util/concurrent/Executor;", "features", "Landroidx/health/connect/client/HealthConnectFeatures;", "getFeatures", "()Landroidx/health/connect/client/HealthConnectFeatures;", "healthConnectManager", "Landroid/health/connect/HealthConnectManager;", "permissionController", "getPermissionController", "()Landroidx/health/connect/client/PermissionController;", "aggregate", "Landroidx/health/connect/client/aggregate/AggregationResult;", "request", "Landroidx/health/connect/client/request/AggregateRequest;", "(Landroidx/health/connect/client/request/AggregateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "aggregateGroupByDuration", "", "Landroidx/health/connect/client/aggregate/AggregationResultGroupedByDuration;", "Landroidx/health/connect/client/request/AggregateGroupByDurationRequest;", "(Landroidx/health/connect/client/request/AggregateGroupByDurationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "aggregateGroupByPeriod", "Landroidx/health/connect/client/aggregate/AggregationResultGroupedByPeriod;", "Landroidx/health/connect/client/request/AggregateGroupByPeriodRequest;", "(Landroidx/health/connect/client/request/AggregateGroupByPeriodRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteRecords", "recordType", "Lkotlin/reflect/KClass;", "Landroidx/health/connect/client/records/Record;", "timeRangeFilter", "Landroidx/health/connect/client/time/TimeRangeFilter;", "(Lkotlin/reflect/KClass;Landroidx/health/connect/client/time/TimeRangeFilter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recordIdsList", "clientRecordIdsList", "(Lkotlin/reflect/KClass;Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChanges", "Landroidx/health/connect/client/response/ChangesResponse;", "changesToken", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChangesToken", "Landroidx/health/connect/client/request/ChangesTokenRequest;", "(Landroidx/health/connect/client/request/ChangesTokenRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGrantedPermissions", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertRecords", "Landroidx/health/connect/client/response/InsertRecordsResponse;", "records", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readRecord", "Landroidx/health/connect/client/response/ReadRecordResponse;", ExifInterface.GPS_DIRECTION_TRUE, "recordId", "(Lkotlin/reflect/KClass;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readRecords", "Landroidx/health/connect/client/response/ReadRecordsResponse;", "Landroidx/health/connect/client/request/ReadRecordsRequest;", "(Landroidx/health/connect/client/request/ReadRecordsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "revokeAllPermissions", "updateRecords", "verifyAggregationMetrics", "metrics", "Landroidx/health/connect/client/aggregate/AggregateMetric;", "wrapPlatformException", "function", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "connect-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HealthConnectClientUpsideDownImpl implements HealthConnectClient, PermissionController {
    private final Context context;
    private final Executor executor;
    private final HealthConnectFeatures features;
    private final HealthConnectManager healthConnectManager;
    private final Function1<Collection<String>, Unit> revokePermissionsFunction;

    /* compiled from: HealthConnectClientUpsideDownImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<Collection<String>, Unit> {
        AnonymousClass1(Object obj) {
            super(1, obj, Context.class, "revokeSelfPermissionsOnKill", "revokeSelfPermissionsOnKill(Ljava/util/Collection;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Collection<String> collection) {
            invoke2(collection);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Collection<String> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((Context) this.receiver).revokeSelfPermissionsOnKill(p0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HealthConnectClientUpsideDownImpl(Context context) {
        this(context, new AnonymousClass1(context));
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HealthConnectClientUpsideDownImpl(Context context, Function1<? super Collection<String>, Unit> revokePermissionsFunction) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(revokePermissionsFunction, "revokePermissionsFunction");
        this.executor = ExecutorsKt.asExecutor(Dispatchers.getDefault());
        this.features = new HealthConnectFeaturesPlatformImpl();
        this.context = context;
        Object systemService = context.getSystemService("healthconnect");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.health.connect.HealthConnectManager");
        this.healthConnectManager = (HealthConnectManager) systemService;
        this.revokePermissionsFunction = revokePermissionsFunction;
    }

    @Override // androidx.health.connect.client.HealthConnectClient
    public PermissionController getPermissionController() {
        return this;
    }

    @Override // androidx.health.connect.client.HealthConnectClient
    public HealthConnectFeatures getFeatures() {
        return this.features;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.health.connect.client.HealthConnectClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object insertRecords(List<? extends Record> list, Continuation<? super InsertRecordsResponse> continuation) {
        HealthConnectClientUpsideDownImpl$insertRecords$1 healthConnectClientUpsideDownImpl$insertRecords$1;
        int i;
        if (continuation instanceof HealthConnectClientUpsideDownImpl$insertRecords$1) {
            healthConnectClientUpsideDownImpl$insertRecords$1 = (HealthConnectClientUpsideDownImpl$insertRecords$1) continuation;
            if ((healthConnectClientUpsideDownImpl$insertRecords$1.label & Integer.MIN_VALUE) != 0) {
                healthConnectClientUpsideDownImpl$insertRecords$1.label -= Integer.MIN_VALUE;
                Object obj = healthConnectClientUpsideDownImpl$insertRecords$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = healthConnectClientUpsideDownImpl$insertRecords$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    HealthConnectClientUpsideDownImpl$insertRecords$response$1 healthConnectClientUpsideDownImpl$insertRecords$response$1 = new HealthConnectClientUpsideDownImpl$insertRecords$response$1(this, list, null);
                    healthConnectClientUpsideDownImpl$insertRecords$1.label = 1;
                    obj = wrapPlatformException(healthConnectClientUpsideDownImpl$insertRecords$response$1, healthConnectClientUpsideDownImpl$insertRecords$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                android.health.connect.InsertRecordsResponse response = (android.health.connect.InsertRecordsResponse) obj;
                Intrinsics.checkNotNullExpressionValue(response, "response");
                return InsertRecordsResponseConverterKt.toKtResponse(response);
            }
        }
        healthConnectClientUpsideDownImpl$insertRecords$1 = new HealthConnectClientUpsideDownImpl$insertRecords$1(this, continuation);
        Object obj2 = healthConnectClientUpsideDownImpl$insertRecords$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = healthConnectClientUpsideDownImpl$insertRecords$1.label;
        if (i != 0) {
        }
        android.health.connect.InsertRecordsResponse response2 = (android.health.connect.InsertRecordsResponse) obj2;
        Intrinsics.checkNotNullExpressionValue(response2, "response");
        return InsertRecordsResponseConverterKt.toKtResponse(response2);
    }

    @Override // androidx.health.connect.client.HealthConnectClient
    public Object updateRecords(List<? extends Record> list, Continuation<? super Unit> continuation) {
        Object wrapPlatformException = wrapPlatformException(new HealthConnectClientUpsideDownImpl$updateRecords$2(this, list, null), continuation);
        return wrapPlatformException == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? wrapPlatformException : Unit.INSTANCE;
    }

    @Override // androidx.health.connect.client.HealthConnectClient
    public Object deleteRecords(KClass<? extends Record> kClass, List<String> list, List<String> list2, Continuation<? super Unit> continuation) {
        Object wrapPlatformException = wrapPlatformException(new HealthConnectClientUpsideDownImpl$deleteRecords$2(this, list, list2, kClass, null), continuation);
        return wrapPlatformException == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? wrapPlatformException : Unit.INSTANCE;
    }

    @Override // androidx.health.connect.client.HealthConnectClient
    public Object deleteRecords(KClass<? extends Record> kClass, TimeRangeFilter timeRangeFilter, Continuation<? super Unit> continuation) {
        Object wrapPlatformException = wrapPlatformException(new HealthConnectClientUpsideDownImpl$deleteRecords$4(this, kClass, timeRangeFilter, null), continuation);
        return wrapPlatformException == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? wrapPlatformException : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.health.connect.client.HealthConnectClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T extends Record> Object readRecord(KClass<T> kClass, String str, Continuation<? super ReadRecordResponse<T>> continuation) {
        HealthConnectClientUpsideDownImpl$readRecord$1 healthConnectClientUpsideDownImpl$readRecord$1;
        int i;
        ReadRecordsResponse readRecordsResponse;
        if (continuation instanceof HealthConnectClientUpsideDownImpl$readRecord$1) {
            healthConnectClientUpsideDownImpl$readRecord$1 = (HealthConnectClientUpsideDownImpl$readRecord$1) continuation;
            if ((healthConnectClientUpsideDownImpl$readRecord$1.label & Integer.MIN_VALUE) != 0) {
                healthConnectClientUpsideDownImpl$readRecord$1.label -= Integer.MIN_VALUE;
                Object obj = healthConnectClientUpsideDownImpl$readRecord$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = healthConnectClientUpsideDownImpl$readRecord$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    HealthConnectClientUpsideDownImpl$readRecord$response$1 healthConnectClientUpsideDownImpl$readRecord$response$1 = new HealthConnectClientUpsideDownImpl$readRecord$response$1(this, kClass, str, null);
                    healthConnectClientUpsideDownImpl$readRecord$1.label = 1;
                    obj = wrapPlatformException(healthConnectClientUpsideDownImpl$readRecord$response$1, healthConnectClientUpsideDownImpl$readRecord$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                readRecordsResponse = (ReadRecordsResponse) obj;
                if (!readRecordsResponse.getRecords().isEmpty()) {
                    throw new RemoteException("No records");
                }
                Object obj2 = readRecordsResponse.getRecords().get(0);
                Intrinsics.checkNotNullExpressionValue(obj2, "response.records[0]");
                Record sdkRecord = RecordConvertersKt.toSdkRecord((android.health.connect.datatypes.Record) obj2);
                Intrinsics.checkNotNull(sdkRecord, "null cannot be cast to non-null type T of androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl.readRecord");
                return new ReadRecordResponse(sdkRecord);
            }
        }
        healthConnectClientUpsideDownImpl$readRecord$1 = new HealthConnectClientUpsideDownImpl$readRecord$1(this, continuation);
        Object obj3 = healthConnectClientUpsideDownImpl$readRecord$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = healthConnectClientUpsideDownImpl$readRecord$1.label;
        if (i != 0) {
        }
        readRecordsResponse = (ReadRecordsResponse) obj3;
        if (!readRecordsResponse.getRecords().isEmpty()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0070 A[LOOP:0: B:11:0x006a->B:13:0x0070, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // androidx.health.connect.client.HealthConnectClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T extends Record> Object readRecords(ReadRecordsRequest<T> readRecordsRequest, Continuation<? super androidx.health.connect.client.response.ReadRecordsResponse<T>> continuation) {
        HealthConnectClientUpsideDownImpl$readRecords$1 healthConnectClientUpsideDownImpl$readRecords$1;
        int i;
        Long boxLong;
        if (continuation instanceof HealthConnectClientUpsideDownImpl$readRecords$1) {
            healthConnectClientUpsideDownImpl$readRecords$1 = (HealthConnectClientUpsideDownImpl$readRecords$1) continuation;
            if ((healthConnectClientUpsideDownImpl$readRecords$1.label & Integer.MIN_VALUE) != 0) {
                healthConnectClientUpsideDownImpl$readRecords$1.label -= Integer.MIN_VALUE;
                Object obj = healthConnectClientUpsideDownImpl$readRecords$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = healthConnectClientUpsideDownImpl$readRecords$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (readRecordsRequest.getDeduplicateStrategy() != 0) {
                        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
                    }
                    HealthConnectClientUpsideDownImpl$readRecords$response$1 healthConnectClientUpsideDownImpl$readRecords$response$1 = new HealthConnectClientUpsideDownImpl$readRecords$response$1(this, readRecordsRequest, null);
                    healthConnectClientUpsideDownImpl$readRecords$1.label = 1;
                    obj = wrapPlatformException(healthConnectClientUpsideDownImpl$readRecords$response$1, healthConnectClientUpsideDownImpl$readRecords$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ReadRecordsResponse readRecordsResponse = (ReadRecordsResponse) obj;
                List records = readRecordsResponse.getRecords();
                Intrinsics.checkNotNullExpressionValue(records, "response.records");
                List<android.health.connect.datatypes.Record> list = records;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (android.health.connect.datatypes.Record it : list) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    Record sdkRecord = RecordConvertersKt.toSdkRecord(it);
                    Intrinsics.checkNotNull(sdkRecord, "null cannot be cast to non-null type T of androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl.readRecords");
                    arrayList.add(sdkRecord);
                }
                ArrayList arrayList2 = arrayList;
                boxLong = Boxing.boxLong(readRecordsResponse.getNextPageToken());
                if (boxLong.longValue() == -1) {
                    boxLong = null;
                }
                return new androidx.health.connect.client.response.ReadRecordsResponse(arrayList2, boxLong != null ? boxLong.toString() : null);
            }
        }
        healthConnectClientUpsideDownImpl$readRecords$1 = new HealthConnectClientUpsideDownImpl$readRecords$1(this, continuation);
        Object obj2 = healthConnectClientUpsideDownImpl$readRecords$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = healthConnectClientUpsideDownImpl$readRecords$1.label;
        if (i != 0) {
        }
        ReadRecordsResponse readRecordsResponse2 = (ReadRecordsResponse) obj2;
        List records2 = readRecordsResponse2.getRecords();
        Intrinsics.checkNotNullExpressionValue(records2, "response.records");
        List<android.health.connect.datatypes.Record> list2 = records2;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        while (r5.hasNext()) {
        }
        ArrayList arrayList22 = arrayList3;
        boxLong = Boxing.boxLong(readRecordsResponse2.getNextPageToken());
        if (boxLong.longValue() == -1) {
        }
        return new androidx.health.connect.client.response.ReadRecordsResponse(arrayList22, boxLong != null ? boxLong.toString() : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // androidx.health.connect.client.HealthConnectClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object aggregate(AggregateRequest aggregateRequest, Continuation<? super AggregationResult> continuation) {
        HealthConnectClientUpsideDownImpl$aggregate$1 healthConnectClientUpsideDownImpl$aggregate$1;
        int i;
        Set<AggregateMetric<?>> metrics$connect_client_release;
        Iterator<T> it;
        AggregationResult aggregationResult;
        if (continuation instanceof HealthConnectClientUpsideDownImpl$aggregate$1) {
            healthConnectClientUpsideDownImpl$aggregate$1 = (HealthConnectClientUpsideDownImpl$aggregate$1) continuation;
            if ((healthConnectClientUpsideDownImpl$aggregate$1.label & Integer.MIN_VALUE) != 0) {
                healthConnectClientUpsideDownImpl$aggregate$1.label -= Integer.MIN_VALUE;
                Object obj = healthConnectClientUpsideDownImpl$aggregate$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = healthConnectClientUpsideDownImpl$aggregate$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    verifyAggregationMetrics(aggregateRequest.getMetrics$connect_client_release());
                    healthConnectClientUpsideDownImpl$aggregate$1.L$0 = this;
                    healthConnectClientUpsideDownImpl$aggregate$1.L$1 = aggregateRequest;
                    healthConnectClientUpsideDownImpl$aggregate$1.label = 1;
                    obj = HealthConnectClientAggregationExtensionsKt.aggregateFallback(this, aggregateRequest, healthConnectClientUpsideDownImpl$aggregate$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aggregationResult = (AggregationResult) healthConnectClientUpsideDownImpl$aggregate$1.L$1;
                        aggregateRequest = (AggregateRequest) healthConnectClientUpsideDownImpl$aggregate$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        Intrinsics.checkNotNullExpressionValue(obj, "override suspend fun agg… + fallbackResponse\n    }");
                        AggregateRecordsResponse aggregateRecordsResponse = (AggregateRecordsResponse) obj;
                        Set<AggregateMetric<?>> metrics$connect_client_release2 = aggregateRequest.getMetrics$connect_client_release();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : metrics$connect_client_release2) {
                            if (AggregationExtensionsKt.isPlatformSupportedMetric((AggregateMetric) obj2)) {
                                arrayList.add(obj2);
                            }
                        }
                        return AggregationExtensionsKt.plus(ResponseConvertersKt.toSdkResponse((AggregateRecordsResponse<Object>) aggregateRecordsResponse, (Set<? extends AggregateMetric<? extends Object>>) CollectionsKt.toSet(arrayList)), aggregationResult);
                    }
                    aggregateRequest = (AggregateRequest) healthConnectClientUpsideDownImpl$aggregate$1.L$1;
                    this = (HealthConnectClientUpsideDownImpl) healthConnectClientUpsideDownImpl$aggregate$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                AggregationResult aggregationResult2 = (AggregationResult) obj;
                metrics$connect_client_release = aggregateRequest.getMetrics$connect_client_release();
                if ((metrics$connect_client_release instanceof Collection) || !metrics$connect_client_release.isEmpty()) {
                    it = metrics$connect_client_release.iterator();
                    while (it.hasNext()) {
                        if (AggregationExtensionsKt.isPlatformSupportedMetric((AggregateMetric) it.next())) {
                            HealthConnectClientUpsideDownImpl$aggregate$platformResponse$1 healthConnectClientUpsideDownImpl$aggregate$platformResponse$1 = new HealthConnectClientUpsideDownImpl$aggregate$platformResponse$1(this, aggregateRequest, null);
                            healthConnectClientUpsideDownImpl$aggregate$1.L$0 = aggregateRequest;
                            healthConnectClientUpsideDownImpl$aggregate$1.L$1 = aggregationResult2;
                            healthConnectClientUpsideDownImpl$aggregate$1.label = 2;
                            Object wrapPlatformException = this.wrapPlatformException(healthConnectClientUpsideDownImpl$aggregate$platformResponse$1, healthConnectClientUpsideDownImpl$aggregate$1);
                            if (wrapPlatformException == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            obj = wrapPlatformException;
                            aggregationResult = aggregationResult2;
                            Intrinsics.checkNotNullExpressionValue(obj, "override suspend fun agg… + fallbackResponse\n    }");
                            AggregateRecordsResponse aggregateRecordsResponse2 = (AggregateRecordsResponse) obj;
                            Set<AggregateMetric<?>> metrics$connect_client_release22 = aggregateRequest.getMetrics$connect_client_release();
                            ArrayList arrayList2 = new ArrayList();
                            while (r7.hasNext()) {
                            }
                            return AggregationExtensionsKt.plus(ResponseConvertersKt.toSdkResponse((AggregateRecordsResponse<Object>) aggregateRecordsResponse2, (Set<? extends AggregateMetric<? extends Object>>) CollectionsKt.toSet(arrayList2)), aggregationResult);
                        }
                    }
                }
                return aggregationResult2;
            }
        }
        healthConnectClientUpsideDownImpl$aggregate$1 = new HealthConnectClientUpsideDownImpl$aggregate$1(this, continuation);
        Object obj3 = healthConnectClientUpsideDownImpl$aggregate$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = healthConnectClientUpsideDownImpl$aggregate$1.label;
        if (i != 0) {
        }
        AggregationResult aggregationResult22 = (AggregationResult) obj3;
        metrics$connect_client_release = aggregateRequest.getMetrics$connect_client_release();
        if (metrics$connect_client_release instanceof Collection) {
        }
        it = metrics$connect_client_release.iterator();
        while (it.hasNext()) {
        }
        return aggregationResult22;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0072 A[LOOP:0: B:11:0x006c->B:13:0x0072, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.health.connect.client.HealthConnectClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object aggregateGroupByDuration(AggregateGroupByDurationRequest aggregateGroupByDurationRequest, Continuation<? super List<AggregationResultGroupedByDuration>> continuation) {
        HealthConnectClientUpsideDownImpl$aggregateGroupByDuration$1 healthConnectClientUpsideDownImpl$aggregateGroupByDuration$1;
        int i;
        if (continuation instanceof HealthConnectClientUpsideDownImpl$aggregateGroupByDuration$1) {
            healthConnectClientUpsideDownImpl$aggregateGroupByDuration$1 = (HealthConnectClientUpsideDownImpl$aggregateGroupByDuration$1) continuation;
            if ((healthConnectClientUpsideDownImpl$aggregateGroupByDuration$1.label & Integer.MIN_VALUE) != 0) {
                healthConnectClientUpsideDownImpl$aggregateGroupByDuration$1.label -= Integer.MIN_VALUE;
                Object obj = healthConnectClientUpsideDownImpl$aggregateGroupByDuration$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = healthConnectClientUpsideDownImpl$aggregateGroupByDuration$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    verifyAggregationMetrics(aggregateGroupByDurationRequest.getMetrics$connect_client_release());
                    HealthConnectClientUpsideDownImpl$aggregateGroupByDuration$2 healthConnectClientUpsideDownImpl$aggregateGroupByDuration$2 = new HealthConnectClientUpsideDownImpl$aggregateGroupByDuration$2(this, aggregateGroupByDurationRequest, null);
                    healthConnectClientUpsideDownImpl$aggregateGroupByDuration$1.L$0 = aggregateGroupByDurationRequest;
                    healthConnectClientUpsideDownImpl$aggregateGroupByDuration$1.label = 1;
                    obj = wrapPlatformException(healthConnectClientUpsideDownImpl$aggregateGroupByDuration$2, healthConnectClientUpsideDownImpl$aggregateGroupByDuration$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aggregateGroupByDurationRequest = (AggregateGroupByDurationRequest) healthConnectClientUpsideDownImpl$aggregateGroupByDuration$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                Intrinsics.checkNotNullExpressionValue(obj, "override suspend fun agg…(request.metrics) }\n    }");
                Iterable<AggregateRecordsGroupedByDurationResponse> iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (AggregateRecordsGroupedByDurationResponse it : iterable) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    arrayList.add(ResponseConvertersKt.toSdkResponse((AggregateRecordsGroupedByDurationResponse<Object>) it, aggregateGroupByDurationRequest.getMetrics$connect_client_release()));
                }
                return arrayList;
            }
        }
        healthConnectClientUpsideDownImpl$aggregateGroupByDuration$1 = new HealthConnectClientUpsideDownImpl$aggregateGroupByDuration$1(this, continuation);
        Object obj2 = healthConnectClientUpsideDownImpl$aggregateGroupByDuration$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = healthConnectClientUpsideDownImpl$aggregateGroupByDuration$1.label;
        if (i != 0) {
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "override suspend fun agg…(request.metrics) }\n    }");
        Iterable<AggregateRecordsGroupedByDurationResponse> iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        while (r6.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.health.connect.client.HealthConnectClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object aggregateGroupByPeriod(AggregateGroupByPeriodRequest aggregateGroupByPeriodRequest, Continuation<? super List<AggregationResultGroupedByPeriod>> continuation) {
        HealthConnectClientUpsideDownImpl$aggregateGroupByPeriod$1 healthConnectClientUpsideDownImpl$aggregateGroupByPeriod$1;
        int i;
        AggregationResultGroupedByPeriod sdkResponse;
        if (continuation instanceof HealthConnectClientUpsideDownImpl$aggregateGroupByPeriod$1) {
            healthConnectClientUpsideDownImpl$aggregateGroupByPeriod$1 = (HealthConnectClientUpsideDownImpl$aggregateGroupByPeriod$1) continuation;
            if ((healthConnectClientUpsideDownImpl$aggregateGroupByPeriod$1.label & Integer.MIN_VALUE) != 0) {
                healthConnectClientUpsideDownImpl$aggregateGroupByPeriod$1.label -= Integer.MIN_VALUE;
                Object obj = healthConnectClientUpsideDownImpl$aggregateGroupByPeriod$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = healthConnectClientUpsideDownImpl$aggregateGroupByPeriod$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    verifyAggregationMetrics(aggregateGroupByPeriodRequest.getMetrics$connect_client_release());
                    HealthConnectClientUpsideDownImpl$aggregateGroupByPeriod$2 healthConnectClientUpsideDownImpl$aggregateGroupByPeriod$2 = new HealthConnectClientUpsideDownImpl$aggregateGroupByPeriod$2(this, aggregateGroupByPeriodRequest, null);
                    healthConnectClientUpsideDownImpl$aggregateGroupByPeriod$1.L$0 = aggregateGroupByPeriodRequest;
                    healthConnectClientUpsideDownImpl$aggregateGroupByPeriod$1.label = 1;
                    obj = wrapPlatformException(healthConnectClientUpsideDownImpl$aggregateGroupByPeriod$2, healthConnectClientUpsideDownImpl$aggregateGroupByPeriod$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aggregateGroupByPeriodRequest = (AggregateGroupByPeriodRequest) healthConnectClientUpsideDownImpl$aggregateGroupByPeriod$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                Intrinsics.checkNotNullExpressionValue(obj, "override suspend fun agg…    }\n            }\n    }");
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                int i2 = 0;
                for (Object obj2 : iterable) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    AggregateRecordsGroupedByPeriodResponse platformResponse = (AggregateRecordsGroupedByPeriodResponse) obj2;
                    if (SdkExtensions.getExtensionVersion(34) >= 10 || (aggregateGroupByPeriodRequest.getTimeRangeSlicer().getMonths() == 0 && aggregateGroupByPeriodRequest.getTimeRangeSlicer().getYears() == 0)) {
                        Intrinsics.checkNotNullExpressionValue(platformResponse, "platformResponse");
                        sdkResponse = ResponseConvertersKt.toSdkResponse((AggregateRecordsGroupedByPeriodResponse<Object>) platformResponse, aggregateGroupByPeriodRequest.getMetrics$connect_client_release());
                    } else {
                        LocalTimeRangeFilter platformLocalTimeRangeFilter = RequestConvertersKt.toPlatformLocalTimeRangeFilter(aggregateGroupByPeriodRequest.getTimeRangeFilter());
                        LocalDateTime startTime = platformLocalTimeRangeFilter.getStartTime();
                        Intrinsics.checkNotNull(startTime);
                        LocalDateTime bucketStartTime = startTime.plus((TemporalAmount) aggregateGroupByPeriodRequest.getTimeRangeSlicer().multipliedBy(i2));
                        LocalDateTime plus = bucketStartTime.plus((TemporalAmount) aggregateGroupByPeriodRequest.getTimeRangeSlicer());
                        Intrinsics.checkNotNullExpressionValue(platformResponse, "platformResponse");
                        Set<AggregateMetric<?>> metrics$connect_client_release = aggregateGroupByPeriodRequest.getMetrics$connect_client_release();
                        Intrinsics.checkNotNullExpressionValue(bucketStartTime, "bucketStartTime");
                        LocalDateTime endTime = platformLocalTimeRangeFilter.getEndTime();
                        Intrinsics.checkNotNull(endTime);
                        if (endTime.isBefore(plus)) {
                            plus = platformLocalTimeRangeFilter.getEndTime();
                            Intrinsics.checkNotNull(plus);
                        }
                        Intrinsics.checkNotNullExpressionValue(plus, "if (requestTimeRangeFilt…                        }");
                        sdkResponse = ResponseConvertersKt.toSdkResponse(platformResponse, metrics$connect_client_release, bucketStartTime, plus);
                    }
                    arrayList.add(sdkResponse);
                    i2 = i3;
                }
                return arrayList;
            }
        }
        healthConnectClientUpsideDownImpl$aggregateGroupByPeriod$1 = new HealthConnectClientUpsideDownImpl$aggregateGroupByPeriod$1(this, continuation);
        Object obj3 = healthConnectClientUpsideDownImpl$aggregateGroupByPeriod$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = healthConnectClientUpsideDownImpl$aggregateGroupByPeriod$1.label;
        if (i != 0) {
        }
        Intrinsics.checkNotNullExpressionValue(obj3, "override suspend fun agg…    }\n            }\n    }");
        Iterable iterable2 = (Iterable) obj3;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable2, 10));
        int i22 = 0;
        while (r11.hasNext()) {
        }
        return arrayList2;
    }

    private final void verifyAggregationMetrics(Set<? extends AggregateMetric<?>> metrics) {
        AggregateMetric aggregateMetric = (AggregateMetric) CollectionsKt.firstOrNull(CollectionsKt.intersect(AggregationExtensionsKt.getAGGREGATE_METRICS_ADDED_IN_SDK_EXT_10(), metrics));
        if (aggregateMetric != null) {
            throw new UnsupportedOperationException("Unsupported metric type " + aggregateMetric.getMetricKey());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.health.connect.client.HealthConnectClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getChangesToken(ChangesTokenRequest changesTokenRequest, Continuation<? super String> continuation) {
        HealthConnectClientUpsideDownImpl$getChangesToken$1 healthConnectClientUpsideDownImpl$getChangesToken$1;
        int i;
        if (continuation instanceof HealthConnectClientUpsideDownImpl$getChangesToken$1) {
            healthConnectClientUpsideDownImpl$getChangesToken$1 = (HealthConnectClientUpsideDownImpl$getChangesToken$1) continuation;
            if ((healthConnectClientUpsideDownImpl$getChangesToken$1.label & Integer.MIN_VALUE) != 0) {
                healthConnectClientUpsideDownImpl$getChangesToken$1.label -= Integer.MIN_VALUE;
                Object obj = healthConnectClientUpsideDownImpl$getChangesToken$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = healthConnectClientUpsideDownImpl$getChangesToken$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    HealthConnectClientUpsideDownImpl$getChangesToken$2 healthConnectClientUpsideDownImpl$getChangesToken$2 = new HealthConnectClientUpsideDownImpl$getChangesToken$2(this, changesTokenRequest, null);
                    healthConnectClientUpsideDownImpl$getChangesToken$1.label = 1;
                    obj = wrapPlatformException(healthConnectClientUpsideDownImpl$getChangesToken$2, healthConnectClientUpsideDownImpl$getChangesToken$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                String token = ((ChangeLogTokenResponse) obj).getToken();
                Intrinsics.checkNotNullExpressionValue(token, "override suspend fun get…\n            .token\n    }");
                return token;
            }
        }
        healthConnectClientUpsideDownImpl$getChangesToken$1 = new HealthConnectClientUpsideDownImpl$getChangesToken$1(this, continuation);
        Object obj2 = healthConnectClientUpsideDownImpl$getChangesToken$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = healthConnectClientUpsideDownImpl$getChangesToken$1.label;
        if (i != 0) {
        }
        String token2 = ((ChangeLogTokenResponse) obj2).getToken();
        Intrinsics.checkNotNullExpressionValue(token2, "override suspend fun get…\n            .token\n    }");
        return token2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009d A[Catch: HealthConnectException -> 0x00f9, LOOP:0: B:13:0x0097->B:15:0x009d, LOOP_END, TryCatch #0 {HealthConnectException -> 0x00f9, blocks: (B:11:0x002f, B:12:0x0082, B:13:0x0097, B:15:0x009d, B:17:0x00b5, B:18:0x00c4, B:20:0x00ca, B:22:0x00e2, B:29:0x003e, B:31:0x007a), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ca A[Catch: HealthConnectException -> 0x00f9, LOOP:1: B:18:0x00c4->B:20:0x00ca, LOOP_END, TryCatch #0 {HealthConnectException -> 0x00f9, blocks: (B:11:0x002f, B:12:0x0082, B:13:0x0097, B:15:0x009d, B:17:0x00b5, B:18:0x00c4, B:20:0x00ca, B:22:0x00e2, B:29:0x003e, B:31:0x007a), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // androidx.health.connect.client.HealthConnectClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getChanges(String str, Continuation<? super ChangesResponse> continuation) {
        HealthConnectClientUpsideDownImpl$getChanges$1 healthConnectClientUpsideDownImpl$getChanges$1;
        int i;
        Iterator<T> it;
        try {
            if (continuation instanceof HealthConnectClientUpsideDownImpl$getChanges$1) {
                healthConnectClientUpsideDownImpl$getChanges$1 = (HealthConnectClientUpsideDownImpl$getChanges$1) continuation;
                if ((healthConnectClientUpsideDownImpl$getChanges$1.label & Integer.MIN_VALUE) != 0) {
                    healthConnectClientUpsideDownImpl$getChanges$1.label -= Integer.MIN_VALUE;
                    Object obj = healthConnectClientUpsideDownImpl$getChanges$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = healthConnectClientUpsideDownImpl$getChanges$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        healthConnectClientUpsideDownImpl$getChanges$1.L$0 = this;
                        healthConnectClientUpsideDownImpl$getChanges$1.L$1 = str;
                        healthConnectClientUpsideDownImpl$getChanges$1.label = 1;
                        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(healthConnectClientUpsideDownImpl$getChanges$1), 1);
                        cancellableContinuationImpl.initCancellability();
                        this.healthConnectManager.getChangeLogs(new ChangeLogsRequest.Builder(str).build(), this.executor, OutcomeReceiverKt.asOutcomeReceiver(cancellableContinuationImpl));
                        obj = cancellableContinuationImpl.getResult();
                        if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            DebugProbesKt.probeCoroutineSuspended(healthConnectClientUpsideDownImpl$getChanges$1);
                        }
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    ChangeLogsResponse changeLogsResponse = (ChangeLogsResponse) obj;
                    List createListBuilder = CollectionsKt.createListBuilder();
                    List<android.health.connect.datatypes.Record> upsertedRecords = changeLogsResponse.getUpsertedRecords();
                    Intrinsics.checkNotNullExpressionValue(upsertedRecords, "response.upsertedRecords");
                    for (android.health.connect.datatypes.Record it2 : upsertedRecords) {
                        Intrinsics.checkNotNullExpressionValue(it2, "it");
                        createListBuilder.add(new UpsertionChange(RecordConvertersKt.toSdkRecord(it2)));
                    }
                    List<ChangeLogsResponse.DeletedLog> deletedLogs = changeLogsResponse.getDeletedLogs();
                    Intrinsics.checkNotNullExpressionValue(deletedLogs, "response.deletedLogs");
                    it = deletedLogs.iterator();
                    while (it.hasNext()) {
                        String deletedRecordId = ((ChangeLogsResponse.DeletedLog) it.next()).getDeletedRecordId();
                        Intrinsics.checkNotNullExpressionValue(deletedRecordId, "it.deletedRecordId");
                        createListBuilder.add(new DeletionChange(deletedRecordId));
                    }
                    List build = CollectionsKt.build(createListBuilder);
                    String nextChangesToken = changeLogsResponse.getNextChangesToken();
                    Intrinsics.checkNotNullExpressionValue(nextChangesToken, "response.nextChangesToken");
                    return new ChangesResponse(build, nextChangesToken, changeLogsResponse.hasMorePages(), false);
                }
            }
            if (i != 0) {
            }
            ChangeLogsResponse changeLogsResponse2 = (ChangeLogsResponse) obj;
            List createListBuilder2 = CollectionsKt.createListBuilder();
            List<android.health.connect.datatypes.Record> upsertedRecords2 = changeLogsResponse2.getUpsertedRecords();
            Intrinsics.checkNotNullExpressionValue(upsertedRecords2, "response.upsertedRecords");
            while (r8.hasNext()) {
            }
            List<ChangeLogsResponse.DeletedLog> deletedLogs2 = changeLogsResponse2.getDeletedLogs();
            Intrinsics.checkNotNullExpressionValue(deletedLogs2, "response.deletedLogs");
            it = deletedLogs2.iterator();
            while (it.hasNext()) {
            }
            List build2 = CollectionsKt.build(createListBuilder2);
            String nextChangesToken2 = changeLogsResponse2.getNextChangesToken();
            Intrinsics.checkNotNullExpressionValue(nextChangesToken2, "response.nextChangesToken");
            return new ChangesResponse(build2, nextChangesToken2, changeLogsResponse2.hasMorePages(), false);
        } catch (HealthConnectException e) {
            if (e.getErrorCode() == 3) {
                return new ChangesResponse(CollectionsKt.emptyList(), "", false, true);
            }
            throw ExceptionConverterKt.toKtException(e);
        }
        healthConnectClientUpsideDownImpl$getChanges$1 = new HealthConnectClientUpsideDownImpl$getChanges$1(this, continuation);
        Object obj2 = healthConnectClientUpsideDownImpl$getChanges$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = healthConnectClientUpsideDownImpl$getChanges$1.label;
    }

    @Override // androidx.health.connect.client.PermissionController
    public Object getGrantedPermissions(Continuation<? super Set<String>> continuation) {
        PackageInfo packageInfo = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), PackageManager.PackageInfoFlags.of(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM));
        Set createSetBuilder = SetsKt.createSetBuilder();
        String[] strArr = packageInfo.requestedPermissions;
        if (strArr == null) {
            strArr = new String[0];
        } else {
            Intrinsics.checkNotNullExpressionValue(strArr, "it.requestedPermissions ?: emptyArray()");
        }
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Intrinsics.checkNotNullExpressionValue(str, "requestedPermissions[i]");
            if (StringsKt.startsWith$default(str, HealthPermission.PERMISSION_PREFIX, false, 2, (Object) null)) {
                int[] iArr = packageInfo.requestedPermissionsFlags;
                Intrinsics.checkNotNull(iArr);
                if ((iArr[i] & 2) > 0) {
                    String str2 = strArr[i];
                    Intrinsics.checkNotNullExpressionValue(str2, "requestedPermissions[i]");
                    createSetBuilder.add(str2);
                }
            }
        }
        return SetsKt.build(createSetBuilder);
    }

    @Override // androidx.health.connect.client.PermissionController
    public Object revokeAllPermissions(Continuation<? super Unit> continuation) {
        String[] strArr = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), PackageManager.PackageInfoFlags.of(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM)).requestedPermissions;
        if (strArr == null) {
            strArr = new String[0];
        }
        ArrayList arrayList = new ArrayList();
        for (String it : strArr) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            if (StringsKt.startsWith$default(it, HealthPermission.PERMISSION_PREFIX, false, 2, (Object) null)) {
                arrayList.add(it);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            this.revokePermissionsFunction.invoke(arrayList2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> Object wrapPlatformException(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) {
        HealthConnectClientUpsideDownImpl$wrapPlatformException$1 healthConnectClientUpsideDownImpl$wrapPlatformException$1;
        int i;
        try {
            if (continuation instanceof HealthConnectClientUpsideDownImpl$wrapPlatformException$1) {
                healthConnectClientUpsideDownImpl$wrapPlatformException$1 = (HealthConnectClientUpsideDownImpl$wrapPlatformException$1) continuation;
                if ((healthConnectClientUpsideDownImpl$wrapPlatformException$1.label & Integer.MIN_VALUE) != 0) {
                    healthConnectClientUpsideDownImpl$wrapPlatformException$1.label -= Integer.MIN_VALUE;
                    Object obj = healthConnectClientUpsideDownImpl$wrapPlatformException$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = healthConnectClientUpsideDownImpl$wrapPlatformException$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        healthConnectClientUpsideDownImpl$wrapPlatformException$1.label = 1;
                        obj = function1.invoke(healthConnectClientUpsideDownImpl$wrapPlatformException$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return obj;
                }
            }
            if (i != 0) {
            }
            return obj;
        } catch (HealthConnectException e) {
            throw ExceptionConverterKt.toKtException(e);
        }
        healthConnectClientUpsideDownImpl$wrapPlatformException$1 = new HealthConnectClientUpsideDownImpl$wrapPlatformException$1(this, continuation);
        Object obj2 = healthConnectClientUpsideDownImpl$wrapPlatformException$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = healthConnectClientUpsideDownImpl$wrapPlatformException$1.label;
    }
}
