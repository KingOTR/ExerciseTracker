package androidx.paging;

import androidx.autofill.HintConstants;
import com.google.firebase.firestore.model.Values;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: FlowExt.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003Bb\u0012[\u0010\u0004\u001aW\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005¢\u0006\u0002\u0010\u000eJ \u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u0086@¢\u0006\u0002\u0010\u001dR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000Re\u0010\u0004\u001aW\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u001c\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00100\u0015X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0016R\u0018\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0015X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0018¨\u0006\u001e"}, d2 = {"Landroidx/paging/UnbatchedFlowCombiner;", "T1", "T2", "", "send", "Lkotlin/Function4;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "t1", "t2", "Landroidx/paging/CombineSource;", "updateFrom", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function4;)V", "initialDispatched", "Lkotlinx/coroutines/CompletableDeferred;", "lock", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlin/jvm/functions/Function4;", "valueReceived", "", "[Lkotlinx/coroutines/CompletableDeferred;", "values", "[Ljava/lang/Object;", "onNext", "index", "", Values.VECTOR_MAP_VECTORS_KEY, "(ILjava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UnbatchedFlowCombiner<T1, T2> {
    private final CompletableDeferred<Unit> initialDispatched;
    private final Mutex lock;
    private final Function4<T1, T2, CombineSource, Continuation<? super Unit>, Object> send;
    private final CompletableDeferred<Unit>[] valueReceived;
    private final Object[] values;

    /* JADX WARN: Multi-variable type inference failed */
    public UnbatchedFlowCombiner(Function4<? super T1, ? super T2, ? super CombineSource, ? super Continuation<? super Unit>, ? extends Object> send) {
        Object obj;
        Intrinsics.checkNotNullParameter(send, "send");
        this.send = send;
        this.initialDispatched = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this.lock = MutexKt.Mutex$default(false, 1, null);
        CompletableDeferred<Unit>[] completableDeferredArr = new CompletableDeferred[2];
        for (int i = 0; i < 2; i++) {
            completableDeferredArr[i] = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        }
        this.valueReceived = completableDeferredArr;
        Object[] objArr = new Object[2];
        for (int i2 = 0; i2 < 2; i2++) {
            obj = FlowExtKt.NULL;
            objArr[i2] = obj;
        }
        this.values = objArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9 A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:27:0x00a2, B:29:0x00a9, B:34:0x00b7, B:36:0x00bf, B:38:0x00c9, B:43:0x00ce, B:44:0x00d8, B:50:0x00d3, B:51:0x00d6, B:31:0x00b3), top: B:26:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:27:0x00a2, B:29:0x00a9, B:34:0x00b7, B:36:0x00bf, B:38:0x00c9, B:43:0x00ce, B:44:0x00d8, B:50:0x00d3, B:51:0x00d6, B:31:0x00b3), top: B:26:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ce A[Catch: all -> 0x0100, TryCatch #0 {all -> 0x0100, blocks: (B:27:0x00a2, B:29:0x00a9, B:34:0x00b7, B:36:0x00bf, B:38:0x00c9, B:43:0x00ce, B:44:0x00d8, B:50:0x00d3, B:51:0x00d6, B:31:0x00b3), top: B:26:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onNext(int i, Object obj, Continuation<? super Unit> continuation) {
        UnbatchedFlowCombiner$onNext$1 unbatchedFlowCombiner$onNext$1;
        Object coroutine_suspended;
        int i2;
        Mutex mutex;
        UnbatchedFlowCombiner<T1, T2> unbatchedFlowCombiner;
        int i3;
        Mutex mutex2;
        Throwable th;
        Mutex mutex3;
        int length;
        int i4;
        boolean z;
        CombineSource combineSource;
        Function4<T1, T2, CombineSource, Continuation<? super Unit>, Object> function4;
        Object obj2;
        Object obj3;
        UnbatchedFlowCombiner<T1, T2> unbatchedFlowCombiner2;
        Object obj4;
        Object obj5;
        if (continuation instanceof UnbatchedFlowCombiner$onNext$1) {
            unbatchedFlowCombiner$onNext$1 = (UnbatchedFlowCombiner$onNext$1) continuation;
            if ((unbatchedFlowCombiner$onNext$1.label & Integer.MIN_VALUE) != 0) {
                unbatchedFlowCombiner$onNext$1.label -= Integer.MIN_VALUE;
                Object obj6 = unbatchedFlowCombiner$onNext$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = unbatchedFlowCombiner$onNext$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj6);
                    if (this.valueReceived[i].isCompleted()) {
                        CompletableDeferred<Unit> completableDeferred = this.initialDispatched;
                        unbatchedFlowCombiner$onNext$1.L$0 = this;
                        unbatchedFlowCombiner$onNext$1.L$1 = obj;
                        unbatchedFlowCombiner$onNext$1.I$0 = i;
                        unbatchedFlowCombiner$onNext$1.label = 1;
                        if (completableDeferred.await(unbatchedFlowCombiner$onNext$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        this.valueReceived[i].complete(Unit.INSTANCE);
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex3 = (Mutex) unbatchedFlowCombiner$onNext$1.L$1;
                            unbatchedFlowCombiner2 = (UnbatchedFlowCombiner) unbatchedFlowCombiner$onNext$1.L$0;
                            try {
                                ResultKt.throwOnFailure(obj6);
                                unbatchedFlowCombiner2.initialDispatched.complete(Unit.INSTANCE);
                                Unit unit = Unit.INSTANCE;
                                mutex3.unlock(null);
                                return Unit.INSTANCE;
                            } catch (Throwable th2) {
                                th = th2;
                                mutex3.unlock(null);
                                throw th;
                            }
                        }
                        i3 = unbatchedFlowCombiner$onNext$1.I$0;
                        mutex2 = (Mutex) unbatchedFlowCombiner$onNext$1.L$2;
                        obj = unbatchedFlowCombiner$onNext$1.L$1;
                        unbatchedFlowCombiner = (UnbatchedFlowCombiner) unbatchedFlowCombiner$onNext$1.L$0;
                        ResultKt.throwOnFailure(obj6);
                        try {
                            Object[] objArr = unbatchedFlowCombiner.values;
                            length = objArr.length;
                            i4 = 0;
                            while (true) {
                                if (i4 < length) {
                                    z = false;
                                    break;
                                }
                                Object obj7 = objArr[i4];
                                obj5 = FlowExtKt.NULL;
                                if (obj7 == obj5) {
                                    z = true;
                                    break;
                                }
                                i4++;
                            }
                            Object[] objArr2 = unbatchedFlowCombiner.values;
                            objArr2[i3] = obj;
                            for (Object obj8 : objArr2) {
                                obj4 = FlowExtKt.NULL;
                                if (obj8 == obj4) {
                                    mutex3 = mutex2;
                                    break;
                                }
                            }
                            if (!z) {
                                combineSource = CombineSource.INITIAL;
                            } else if (i3 == 0) {
                                combineSource = CombineSource.RECEIVER;
                            } else {
                                combineSource = CombineSource.OTHER;
                            }
                            function4 = unbatchedFlowCombiner.send;
                            Object[] objArr3 = unbatchedFlowCombiner.values;
                            obj2 = objArr3[0];
                            obj3 = objArr3[1];
                            unbatchedFlowCombiner$onNext$1.L$0 = unbatchedFlowCombiner;
                            unbatchedFlowCombiner$onNext$1.L$1 = mutex2;
                            unbatchedFlowCombiner$onNext$1.L$2 = null;
                            unbatchedFlowCombiner$onNext$1.label = 3;
                            if (function4.invoke(obj2, obj3, combineSource, unbatchedFlowCombiner$onNext$1) != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mutex3 = mutex2;
                            unbatchedFlowCombiner2 = unbatchedFlowCombiner;
                            unbatchedFlowCombiner2.initialDispatched.complete(Unit.INSTANCE);
                            Unit unit2 = Unit.INSTANCE;
                            mutex3.unlock(null);
                            return Unit.INSTANCE;
                        } catch (Throwable th3) {
                            Mutex mutex4 = mutex2;
                            th = th3;
                            mutex3 = mutex4;
                            mutex3.unlock(null);
                            throw th;
                        }
                    }
                    int i5 = unbatchedFlowCombiner$onNext$1.I$0;
                    Object obj9 = unbatchedFlowCombiner$onNext$1.L$1;
                    UnbatchedFlowCombiner<T1, T2> unbatchedFlowCombiner3 = (UnbatchedFlowCombiner) unbatchedFlowCombiner$onNext$1.L$0;
                    ResultKt.throwOnFailure(obj6);
                    i = i5;
                    this = unbatchedFlowCombiner3;
                    obj = obj9;
                }
                mutex = this.lock;
                unbatchedFlowCombiner$onNext$1.L$0 = this;
                unbatchedFlowCombiner$onNext$1.L$1 = obj;
                unbatchedFlowCombiner$onNext$1.L$2 = mutex;
                unbatchedFlowCombiner$onNext$1.I$0 = i;
                unbatchedFlowCombiner$onNext$1.label = 2;
                if (mutex.lock(null, unbatchedFlowCombiner$onNext$1) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                unbatchedFlowCombiner = this;
                i3 = i;
                mutex2 = mutex;
                Object[] objArr4 = unbatchedFlowCombiner.values;
                length = objArr4.length;
                i4 = 0;
                while (true) {
                    if (i4 < length) {
                    }
                    i4++;
                }
                Object[] objArr22 = unbatchedFlowCombiner.values;
                objArr22[i3] = obj;
                while (r8 < r14) {
                }
                if (!z) {
                }
                function4 = unbatchedFlowCombiner.send;
                Object[] objArr32 = unbatchedFlowCombiner.values;
                obj2 = objArr32[0];
                obj3 = objArr32[1];
                unbatchedFlowCombiner$onNext$1.L$0 = unbatchedFlowCombiner;
                unbatchedFlowCombiner$onNext$1.L$1 = mutex2;
                unbatchedFlowCombiner$onNext$1.L$2 = null;
                unbatchedFlowCombiner$onNext$1.label = 3;
                if (function4.invoke(obj2, obj3, combineSource, unbatchedFlowCombiner$onNext$1) != coroutine_suspended) {
                }
            }
        }
        unbatchedFlowCombiner$onNext$1 = new UnbatchedFlowCombiner$onNext$1(this, continuation);
        Object obj62 = unbatchedFlowCombiner$onNext$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = unbatchedFlowCombiner$onNext$1.label;
        if (i2 != 0) {
        }
        mutex = this.lock;
        unbatchedFlowCombiner$onNext$1.L$0 = this;
        unbatchedFlowCombiner$onNext$1.L$1 = obj;
        unbatchedFlowCombiner$onNext$1.L$2 = mutex;
        unbatchedFlowCombiner$onNext$1.I$0 = i;
        unbatchedFlowCombiner$onNext$1.label = 2;
        if (mutex.lock(null, unbatchedFlowCombiner$onNext$1) != coroutine_suspended) {
        }
    }
}
