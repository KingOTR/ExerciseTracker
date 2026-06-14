package com.samsung.android.sdk.health.data.helper;

import androidx.exifinterface.media.ExifInterface;
import com.caverock.androidsvg.SVGParser;
import com.samsung.android.sdk.health.data.HealthDataStore;
import com.samsung.android.sdk.health.data.data.AggregateOperation;
import com.samsung.android.sdk.health.data.data.AggregatedData;
import com.samsung.android.sdk.health.data.data.Change;
import com.samsung.android.sdk.health.data.data.DataPoint;
import com.samsung.android.sdk.health.data.request.AggregateRequest;
import com.samsung.android.sdk.health.data.request.ChangedDataRequest;
import com.samsung.android.sdk.health.data.request.DataType;
import com.samsung.android.sdk.health.data.request.DeleteDataRequest;
import com.samsung.android.sdk.health.data.request.InsertDataRequest;
import com.samsung.android.sdk.health.data.request.ReadDataRequest;
import com.samsung.android.sdk.health.data.request.UpdateDataRequest;
import com.samsung.android.sdk.health.data.response.DataResponse;
import com.samsung.android.sdk.health.data.t1;
import com.samsung.android.sdk.health.data.u1;
import com.samsung.android.sdk.health.data.v1;
import com.samsung.android.sdk.health.data.w1;
import com.samsung.android.sdk.health.data.x1;
import com.samsung.android.sdk.health.data.y1;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000p\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a|\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004\"\u000e\b\u0001\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00030\u0006*\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00050\t2+\b\u0002\u0010\n\u001a%\b\u0001\u0012\u0004\u0012\u0002H\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u000b¢\u0006\u0002\b\rH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001aV\u0010\u000f\u001a\u00020\u0010\"\b\b\u0000\u0010\u0003*\u00020\u0011*\u00020\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00132'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\f\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000b¢\u0006\u0002\b\rH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001ab\u0010\u0016\u001a\u00020\u0010\"\b\b\u0000\u0010\u0003*\u00020\u0011*\u00020\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00030\u001323\u0010\n\u001a/\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0017\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00170\f\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000b¢\u0006\u0002\b\rH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001av\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0011\"\u000e\b\u0001\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00030\u0019*\u00020\u00072\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00050\u001a2+\b\u0002\u0010\n\u001a%\b\u0001\u0012\u0004\u0012\u0002H\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u000b¢\u0006\u0002\b\rH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001b\u001an\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u001d0\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0011*\u00020\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00030\u001e23\u0010\n\u001a/\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u001f\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u001f0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000b¢\u0006\u0002\b\rH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010 \u001ab\u0010!\u001a\u00020\u0010\"\b\b\u0000\u0010\u0003*\u00020\u0011*\u00020\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00030\u001323\u0010\n\u001a/\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\"\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\"0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000b¢\u0006\u0002\b\rH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"aggregate", "Lcom/samsung/android/sdk/health/data/response/DataResponse;", "Lcom/samsung/android/sdk/health/data/data/AggregatedData;", ExifInterface.GPS_DIRECTION_TRUE, "", ExifInterface.LATITUDE_SOUTH, "Lcom/samsung/android/sdk/health/data/request/AggregateRequest$Builder;", "Lcom/samsung/android/sdk/health/data/HealthDataStore;", "aggregateOperation", "Lcom/samsung/android/sdk/health/data/data/AggregateOperation;", "builder", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Lcom/samsung/android/sdk/health/data/HealthDataStore;Lcom/samsung/android/sdk/health/data/data/AggregateOperation;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "", "Lcom/samsung/android/sdk/health/data/data/DataPoint;", SVGParser.XML_STYLESHEET_ATTR_TYPE, "Lcom/samsung/android/sdk/health/data/request/DataType$Writeable;", "Lcom/samsung/android/sdk/health/data/request/DeleteDataRequest$BasicBuilder;", "(Lcom/samsung/android/sdk/health/data/HealthDataStore;Lcom/samsung/android/sdk/health/data/request/DataType$Writeable;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "Lcom/samsung/android/sdk/health/data/request/InsertDataRequest$BasicBuilder;", "read", "Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$Builder;", "Lcom/samsung/android/sdk/health/data/request/DataType$Readable;", "(Lcom/samsung/android/sdk/health/data/HealthDataStore;Lcom/samsung/android/sdk/health/data/request/DataType$Readable;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readChange", "Lcom/samsung/android/sdk/health/data/data/Change;", "Lcom/samsung/android/sdk/health/data/request/DataType$ChangeReadable;", "Lcom/samsung/android/sdk/health/data/request/ChangedDataRequest$BasicBuilder;", "(Lcom/samsung/android/sdk/health/data/HealthDataStore;Lcom/samsung/android/sdk/health/data/request/DataType$ChangeReadable;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "Lcom/samsung/android/sdk/health/data/request/UpdateDataRequest$BasicBuilder;", "SDK_clientRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RequestHelperKt {
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        if (r8 != null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T, S extends AggregateRequest.Builder<T>> Object aggregate(HealthDataStore healthDataStore, AggregateOperation<T, S> aggregateOperation, Function2<? super S, ? super Continuation<? super S>, ? extends Object> function2, Continuation<? super DataResponse<AggregatedData<T>>> continuation) {
        t1 t1Var;
        int i;
        AggregateRequest.Builder builder;
        if (continuation instanceof t1) {
            t1Var = (t1) continuation;
            int i2 = t1Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t1Var.d = i2 - Integer.MIN_VALUE;
                Object obj = t1Var.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = t1Var.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (function2 != null) {
                        S requestBuilder = aggregateOperation.getRequestBuilder();
                        t1Var.a = healthDataStore;
                        t1Var.b = aggregateOperation;
                        t1Var.d = 1;
                        obj = function2.invoke(requestBuilder, t1Var);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    builder = aggregateOperation.getRequestBuilder();
                    AggregateRequest<T> build = builder.build();
                    t1Var.a = null;
                    t1Var.b = null;
                    t1Var.d = 2;
                    obj = healthDataStore.aggregateData(build, t1Var);
                    return obj == coroutine_suspended ? coroutine_suspended : obj;
                }
                if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aggregateOperation = t1Var.b;
                healthDataStore = t1Var.a;
                ResultKt.throwOnFailure(obj);
                builder = (AggregateRequest.Builder) obj;
            }
        }
        t1Var = new t1(continuation);
        Object obj2 = t1Var.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = t1Var.d;
        if (i != 0) {
        }
        builder = (AggregateRequest.Builder) obj2;
    }

    public static /* synthetic */ Object aggregate$default(HealthDataStore healthDataStore, AggregateOperation aggregateOperation, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        return aggregate(healthDataStore, aggregateOperation, function2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T extends DataPoint> Object delete(HealthDataStore healthDataStore, DataType.Writeable<T> writeable, Function2<? super DeleteDataRequest.BasicBuilder, ? super Continuation<? super DeleteDataRequest.BasicBuilder>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        u1 u1Var;
        Object coroutine_suspended;
        int i;
        DeleteDataRequest build;
        if (continuation instanceof u1) {
            u1Var = (u1) continuation;
            int i2 = u1Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u1Var.c = i2 - Integer.MIN_VALUE;
                Object obj = u1Var.b;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = u1Var.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    DeleteDataRequest.BasicBuilder deleteDataRequestBuilder = writeable.getDeleteDataRequestBuilder();
                    u1Var.a = healthDataStore;
                    u1Var.c = 1;
                    obj = function2.invoke(deleteDataRequestBuilder, u1Var);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    healthDataStore = u1Var.a;
                    ResultKt.throwOnFailure(obj);
                }
                build = ((DeleteDataRequest.BasicBuilder) obj).build();
                u1Var.a = null;
                u1Var.c = 2;
                if (healthDataStore.deleteData(build, u1Var) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        u1Var = new u1(continuation);
        Object obj2 = u1Var.b;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = u1Var.c;
        if (i != 0) {
        }
        build = ((DeleteDataRequest.BasicBuilder) obj2).build();
        u1Var.a = null;
        u1Var.c = 2;
        if (healthDataStore.deleteData(build, u1Var) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T extends DataPoint> Object insert(HealthDataStore healthDataStore, DataType.Writeable<T> writeable, Function2<? super InsertDataRequest.BasicBuilder<T>, ? super Continuation<? super InsertDataRequest.BasicBuilder<T>>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        v1 v1Var;
        Object coroutine_suspended;
        int i;
        InsertDataRequest<T> build;
        if (continuation instanceof v1) {
            v1Var = (v1) continuation;
            int i2 = v1Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v1Var.c = i2 - Integer.MIN_VALUE;
                Object obj = v1Var.b;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = v1Var.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    InsertDataRequest.BasicBuilder<T> insertDataRequestBuilder = writeable.getInsertDataRequestBuilder();
                    v1Var.a = healthDataStore;
                    v1Var.c = 1;
                    obj = function2.invoke(insertDataRequestBuilder, v1Var);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    healthDataStore = v1Var.a;
                    ResultKt.throwOnFailure(obj);
                }
                build = ((InsertDataRequest.BasicBuilder) obj).build();
                v1Var.a = null;
                v1Var.c = 2;
                if (healthDataStore.insertData(build, v1Var) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        v1Var = new v1(continuation);
        Object obj2 = v1Var.b;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = v1Var.c;
        if (i != 0) {
        }
        build = ((InsertDataRequest.BasicBuilder) obj2).build();
        v1Var.a = null;
        v1Var.c = 2;
        if (healthDataStore.insertData(build, v1Var) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        if (r8 != null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T extends DataPoint, S extends ReadDataRequest.Builder<T>> Object read(HealthDataStore healthDataStore, DataType.Readable<T, S> readable, Function2<? super S, ? super Continuation<? super S>, ? extends Object> function2, Continuation<? super DataResponse<T>> continuation) {
        w1 w1Var;
        int i;
        ReadDataRequest.Builder builder;
        if (continuation instanceof w1) {
            w1Var = (w1) continuation;
            int i2 = w1Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w1Var.d = i2 - Integer.MIN_VALUE;
                Object obj = w1Var.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = w1Var.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (function2 != null) {
                        S readDataRequestBuilder = readable.getReadDataRequestBuilder();
                        w1Var.a = healthDataStore;
                        w1Var.b = readable;
                        w1Var.d = 1;
                        obj = function2.invoke(readDataRequestBuilder, w1Var);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    builder = readable.getReadDataRequestBuilder();
                    ReadDataRequest<T> build = builder.build();
                    w1Var.a = null;
                    w1Var.b = null;
                    w1Var.d = 2;
                    obj = healthDataStore.readData(build, w1Var);
                    return obj == coroutine_suspended ? coroutine_suspended : obj;
                }
                if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                readable = w1Var.b;
                healthDataStore = w1Var.a;
                ResultKt.throwOnFailure(obj);
                builder = (ReadDataRequest.Builder) obj;
            }
        }
        w1Var = new w1(continuation);
        Object obj2 = w1Var.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = w1Var.d;
        if (i != 0) {
        }
        builder = (ReadDataRequest.Builder) obj2;
    }

    public static /* synthetic */ Object read$default(HealthDataStore healthDataStore, DataType.Readable readable, Function2 function2, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        return read(healthDataStore, readable, function2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005e A[PHI: r8
  0x005e: PHI (r8v6 java.lang.Object) = (r8v5 java.lang.Object), (r8v1 java.lang.Object) binds: [B:17:0x005b, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T extends DataPoint> Object readChange(HealthDataStore healthDataStore, DataType.ChangeReadable<T> changeReadable, Function2<? super ChangedDataRequest.BasicBuilder<T>, ? super Continuation<? super ChangedDataRequest.BasicBuilder<T>>, ? extends Object> function2, Continuation<? super DataResponse<Change<T>>> continuation) {
        x1 x1Var;
        int i;
        if (continuation instanceof x1) {
            x1Var = (x1) continuation;
            int i2 = x1Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x1Var.c = i2 - Integer.MIN_VALUE;
                Object obj = x1Var.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = x1Var.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ChangedDataRequest.BasicBuilder<T> changedDataRequestBuilder = changeReadable.getChangedDataRequestBuilder();
                    x1Var.a = healthDataStore;
                    x1Var.c = 1;
                    obj = function2.invoke(changedDataRequestBuilder, x1Var);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    healthDataStore = x1Var.a;
                    ResultKt.throwOnFailure(obj);
                }
                ChangedDataRequest<T> build = ((ChangedDataRequest.BasicBuilder) obj).build();
                x1Var.a = null;
                x1Var.c = 2;
                obj = healthDataStore.readChanges(build, x1Var);
                return obj != coroutine_suspended ? coroutine_suspended : obj;
            }
        }
        x1Var = new x1(continuation);
        Object obj2 = x1Var.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = x1Var.c;
        if (i != 0) {
        }
        ChangedDataRequest<T> build2 = ((ChangedDataRequest.BasicBuilder) obj2).build();
        x1Var.a = null;
        x1Var.c = 2;
        obj2 = healthDataStore.readChanges(build2, x1Var);
        if (obj2 != coroutine_suspended2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T extends DataPoint> Object update(HealthDataStore healthDataStore, DataType.Writeable<T> writeable, Function2<? super UpdateDataRequest.BasicBuilder<T>, ? super Continuation<? super UpdateDataRequest.BasicBuilder<T>>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        y1 y1Var;
        Object coroutine_suspended;
        int i;
        UpdateDataRequest<T> build;
        if (continuation instanceof y1) {
            y1Var = (y1) continuation;
            int i2 = y1Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y1Var.c = i2 - Integer.MIN_VALUE;
                Object obj = y1Var.b;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = y1Var.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    UpdateDataRequest.BasicBuilder<T> updateDataRequestBuilder = writeable.getUpdateDataRequestBuilder();
                    y1Var.a = healthDataStore;
                    y1Var.c = 1;
                    obj = function2.invoke(updateDataRequestBuilder, y1Var);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    healthDataStore = y1Var.a;
                    ResultKt.throwOnFailure(obj);
                }
                build = ((UpdateDataRequest.BasicBuilder) obj).build();
                y1Var.a = null;
                y1Var.c = 2;
                if (healthDataStore.updateData(build, y1Var) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        y1Var = new y1(continuation);
        Object obj2 = y1Var.b;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = y1Var.c;
        if (i != 0) {
        }
        build = ((UpdateDataRequest.BasicBuilder) obj2).build();
        y1Var.a = null;
        y1Var.c = 2;
        if (healthDataStore.updateData(build, y1Var) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }
}
