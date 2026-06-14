package androidx.paging;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.firestore.model.Values;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: FlowExt.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.FlowExtKt$simpleScan$1", f = "FlowExt.kt", i = {0, 0}, l = {54, 55}, m = "invokeSuspend", n = {"$this$flow", "accumulator"}, s = {"L$0", "L$1"})
/* loaded from: classes2.dex */
final class FlowExtKt$simpleScan$1<R> extends SuspendLambda implements Function2<FlowCollector<? super R>, Continuation<? super Unit>, Object> {
    final /* synthetic */ R $initial;
    final /* synthetic */ Function3<R, T, Continuation<? super R>, Object> $operation;
    final /* synthetic */ Flow<T> $this_simpleScan;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowExtKt$simpleScan$1(R r, Flow<? extends T> flow, Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> function3, Continuation<? super FlowExtKt$simpleScan$1> continuation) {
        super(2, continuation);
        this.$initial = r;
        this.$this_simpleScan = flow;
        this.$operation = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FlowExtKt$simpleScan$1 flowExtKt$simpleScan$1 = new FlowExtKt$simpleScan$1(this.$initial, this.$this_simpleScan, this.$operation, continuation);
        flowExtKt$simpleScan$1.L$0 = obj;
        return flowExtKt$simpleScan$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super R> flowCollector, Continuation<? super Unit> continuation) {
        return ((FlowExtKt$simpleScan$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref.ObjectRef objectRef;
        FlowCollector flowCollector;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector2 = (FlowCollector) this.L$0;
            objectRef = new Ref.ObjectRef();
            objectRef.element = this.$initial;
            this.L$0 = flowCollector2;
            this.L$1 = objectRef;
            this.label = 1;
            if (flowCollector2.emit(objectRef.element, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            flowCollector = flowCollector2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            objectRef = (Ref.ObjectRef) this.L$1;
            flowCollector = (FlowCollector) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (this.$this_simpleScan.collect(new AnonymousClass1(objectRef, this.$operation, flowCollector), this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* compiled from: FlowExt.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", Values.VECTOR_MAP_VECTORS_KEY, "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.paging.FlowExtKt$simpleScan$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements FlowCollector {
        final /* synthetic */ FlowCollector<R> $$this$flow;
        final /* synthetic */ Ref.ObjectRef<R> $accumulator;
        final /* synthetic */ Function3<R, T, Continuation<? super R>, Object> $operation;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Ref.ObjectRef<R> objectRef, Function3<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> function3, FlowCollector<? super R> flowCollector) {
            this.$accumulator = objectRef;
            this.$operation = function3;
            this.$$this$flow = flowCollector;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0070 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t, Continuation<? super Unit> continuation) {
            FlowExtKt$simpleScan$1$1$emit$1 flowExtKt$simpleScan$1$1$emit$1;
            Object coroutine_suspended;
            int i;
            AnonymousClass1<T> anonymousClass1;
            Ref.ObjectRef<R> objectRef;
            FlowCollector<R> flowCollector;
            T t2;
            if (continuation instanceof FlowExtKt$simpleScan$1$1$emit$1) {
                flowExtKt$simpleScan$1$1$emit$1 = (FlowExtKt$simpleScan$1$1$emit$1) continuation;
                if ((flowExtKt$simpleScan$1$1$emit$1.label & Integer.MIN_VALUE) != 0) {
                    flowExtKt$simpleScan$1$1$emit$1.label -= Integer.MIN_VALUE;
                    T t3 = (T) flowExtKt$simpleScan$1$1$emit$1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = flowExtKt$simpleScan$1$1$emit$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(t3);
                        Ref.ObjectRef<R> objectRef2 = this.$accumulator;
                        Function3<R, T, Continuation<? super R>, Object> function3 = this.$operation;
                        R r = objectRef2.element;
                        flowExtKt$simpleScan$1$1$emit$1.L$0 = this;
                        flowExtKt$simpleScan$1$1$emit$1.L$1 = objectRef2;
                        flowExtKt$simpleScan$1$1$emit$1.label = 1;
                        Object invoke = function3.invoke(r, t, flowExtKt$simpleScan$1$1$emit$1);
                        if (invoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        anonymousClass1 = this;
                        objectRef = objectRef2;
                        t3 = (T) invoke;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(t3);
                            return Unit.INSTANCE;
                        }
                        objectRef = (Ref.ObjectRef) flowExtKt$simpleScan$1$1$emit$1.L$1;
                        anonymousClass1 = (AnonymousClass1) flowExtKt$simpleScan$1$1$emit$1.L$0;
                        ResultKt.throwOnFailure(t3);
                    }
                    objectRef.element = t3;
                    flowCollector = anonymousClass1.$$this$flow;
                    t2 = anonymousClass1.$accumulator.element;
                    flowExtKt$simpleScan$1$1$emit$1.L$0 = null;
                    flowExtKt$simpleScan$1$1$emit$1.L$1 = null;
                    flowExtKt$simpleScan$1$1$emit$1.label = 2;
                    if (flowCollector.emit(t2, flowExtKt$simpleScan$1$1$emit$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
            }
            flowExtKt$simpleScan$1$1$emit$1 = new FlowExtKt$simpleScan$1$1$emit$1(this, continuation);
            T t32 = (T) flowExtKt$simpleScan$1$1$emit$1.result;
            coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = flowExtKt$simpleScan$1$1$emit$1.label;
            if (i != 0) {
            }
            objectRef.element = t32;
            flowCollector = anonymousClass1.$$this$flow;
            t2 = anonymousClass1.$accumulator.element;
            flowExtKt$simpleScan$1$1$emit$1.L$0 = null;
            flowExtKt$simpleScan$1$1$emit$1.L$1 = null;
            flowExtKt$simpleScan$1$1$emit$1.label = 2;
            if (flowCollector.emit(t2, flowExtKt$simpleScan$1$1$emit$1) == coroutine_suspended) {
            }
            return Unit.INSTANCE;
        }
    }
}
