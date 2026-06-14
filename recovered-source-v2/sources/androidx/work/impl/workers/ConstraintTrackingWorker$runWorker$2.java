package androidx.work.impl.workers;

import androidx.concurrent.futures.ListenableFutureKt;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: ConstraintTrackingWorker.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Landroidx/work/ListenableWorker$Result;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2", f = "ConstraintTrackingWorker.kt", i = {0, 0, 0}, l = {134}, m = "invokeSuspend", n = {"atomicReason", "future", "constraintTrackingJob"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes2.dex */
final class ConstraintTrackingWorker$runWorker$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ListenableWorker.Result>, Object> {
    final /* synthetic */ ListenableWorker $delegate;
    final /* synthetic */ WorkConstraintsTracker $workConstraintsTracker;
    final /* synthetic */ WorkSpec $workSpec;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConstraintTrackingWorker$runWorker$2(ListenableWorker listenableWorker, WorkConstraintsTracker workConstraintsTracker, WorkSpec workSpec, Continuation<? super ConstraintTrackingWorker$runWorker$2> continuation) {
        super(2, continuation);
        this.$delegate = listenableWorker;
        this.$workConstraintsTracker = workConstraintsTracker;
        this.$workSpec = workSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ConstraintTrackingWorker$runWorker$2 constraintTrackingWorker$runWorker$2 = new ConstraintTrackingWorker$runWorker$2(this.$delegate, this.$workConstraintsTracker, this.$workSpec, continuation);
        constraintTrackingWorker$runWorker$2.L$0 = obj;
        return constraintTrackingWorker$runWorker$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ListenableWorker.Result> continuation) {
        return ((ConstraintTrackingWorker$runWorker$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00dd  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, kotlinx.coroutines.Job] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Job launch$default;
        AtomicInteger atomicInteger;
        ListenableFuture<ListenableWorker.Result> listenableFuture;
        Object await;
        AtomicInteger atomicInteger2;
        Job job;
        String str;
        String str2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r2 = this.label;
        try {
            if (r2 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                AtomicInteger atomicInteger3 = new AtomicInteger(-256);
                ListenableFuture<ListenableWorker.Result> startWork = this.$delegate.startWork();
                Intrinsics.checkNotNullExpressionValue(startWork, "delegate.startWork()");
                launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ConstraintTrackingWorker$runWorker$2$constraintTrackingJob$1(this.$workConstraintsTracker, this.$workSpec, atomicInteger3, startWork, null), 3, null);
                try {
                    this.L$0 = atomicInteger3;
                    this.L$1 = startWork;
                    this.L$2 = launch$default;
                    this.label = 1;
                    await = ListenableFutureKt.await(startWork, this);
                    if (await == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    atomicInteger2 = atomicInteger3;
                    job = launch$default;
                    listenableFuture = startWork;
                } catch (CancellationException e) {
                    e = e;
                    atomicInteger = atomicInteger3;
                    listenableFuture = startWork;
                    str2 = ConstraintTrackingWorkerKt.TAG;
                    Logger.get().debug(str2, "Delegated worker " + this.$delegate.getClass() + " was cancelled", e);
                    if (atomicInteger.get() != -256) {
                    }
                    if (!listenableFuture.isCancelled()) {
                    }
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    str = ConstraintTrackingWorkerKt.TAG;
                    Logger.get().debug(str, "Delegated worker " + this.$delegate.getClass() + " threw exception in startWork.", th);
                    throw th;
                }
            } else {
                if (r2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                job = (Job) this.L$2;
                listenableFuture = (ListenableFuture) this.L$1;
                atomicInteger = (AtomicInteger) this.L$0;
                try {
                    try {
                        ResultKt.throwOnFailure(obj);
                        atomicInteger2 = atomicInteger;
                        await = obj;
                    } catch (Throwable th2) {
                        th = th2;
                        str = ConstraintTrackingWorkerKt.TAG;
                        Logger.get().debug(str, "Delegated worker " + this.$delegate.getClass() + " threw exception in startWork.", th);
                        throw th;
                    }
                } catch (CancellationException e2) {
                    e = e2;
                    str2 = ConstraintTrackingWorkerKt.TAG;
                    Logger.get().debug(str2, "Delegated worker " + this.$delegate.getClass() + " was cancelled", e);
                    if (atomicInteger.get() != -256) {
                    }
                    if (!listenableFuture.isCancelled()) {
                    }
                    throw e;
                }
            }
            try {
                ListenableWorker.Result result = (ListenableWorker.Result) await;
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                return result;
            } catch (CancellationException e3) {
                e = e3;
                atomicInteger = atomicInteger2;
                str2 = ConstraintTrackingWorkerKt.TAG;
                Logger.get().debug(str2, "Delegated worker " + this.$delegate.getClass() + " was cancelled", e);
                boolean z = atomicInteger.get() != -256;
                if (!listenableFuture.isCancelled() && z) {
                    throw new ConstraintTrackingWorker.ConstraintUnsatisfiedException(atomicInteger.get());
                }
                throw e;
            }
        } catch (Throwable th3) {
            Job.DefaultImpls.cancel$default((Job) r2, (CancellationException) null, 1, (Object) null);
            throw th3;
        }
    }
}
