package com.example.rungps.ui.main;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.example.rungps.analytics.BikeRideStats;
import com.example.rungps.analytics.BikeStats;
import com.example.rungps.data.Repository;
import com.example.rungps.data.RunEntity;
import com.example.rungps.feature.run.RunRow;
import com.example.rungps.tracking.ActivityTypes;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: RunListRow.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.RunListRowKt$RunListRow$1$1", f = "RunListRow.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class RunListRowKt$RunListRow$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<String> $bikeLine$delegate;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ RunRow $r;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RunListRowKt$RunListRow$1$1(RunRow runRow, Context context, MutableState<String> mutableState, Continuation<? super RunListRowKt$RunListRow$1$1> continuation) {
        super(2, continuation);
        this.$r = runRow;
        this.$ctx = context;
        this.$bikeLine$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RunListRowKt$RunListRow$1$1(this.$r, this.$ctx, this.$bikeLine$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RunListRowKt$RunListRow$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableState<String> mutableState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!ActivityTypes.INSTANCE.isBike(this.$r.getActivityType())) {
                return Unit.INSTANCE;
            }
            MutableState<String> mutableState2 = this.$bikeLine$delegate;
            this.L$0 = mutableState2;
            this.label = 1;
            Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.$ctx, this.$r, null), this);
            if (withContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = withContext;
            mutableState = mutableState2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableState = (MutableState) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        mutableState.setValue((String) obj);
        return Unit.INSTANCE;
    }

    /* compiled from: RunListRow.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ui.main.RunListRowKt$RunListRow$1$1$1", f = "RunListRow.kt", i = {0, 1}, l = {50, 51}, m = "invokeSuspend", n = {"repo", "run"}, s = {"L$0", "L$0"})
    /* renamed from: com.example.rungps.ui.main.RunListRowKt$RunListRow$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        final /* synthetic */ Context $ctx;
        final /* synthetic */ RunRow $r;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context, RunRow runRow, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$ctx = context;
            this.$r = runRow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$ctx, this.$r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x006c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Repository repository;
            RunEntity runEntity;
            BikeRideStats compute;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                repository = Repository.INSTANCE.get(this.$ctx);
                this.L$0 = repository;
                this.label = 1;
                obj = repository.runById(this.$r.getId(), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    runEntity = (RunEntity) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    compute = BikeStats.INSTANCE.compute(runEntity, (List) obj);
                    if (compute == null) {
                        return BikeStats.INSTANCE.summaryLine(compute);
                    }
                    return null;
                }
                repository = (Repository) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            RunEntity runEntity2 = (RunEntity) obj;
            if (runEntity2 == null) {
                return null;
            }
            this.L$0 = runEntity2;
            this.label = 2;
            Object pointsForRun = repository.pointsForRun(this.$r.getId(), this);
            if (pointsForRun == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = pointsForRun;
            runEntity = runEntity2;
            compute = BikeStats.INSTANCE.compute(runEntity, (List) obj);
            if (compute == null) {
            }
        }
    }
}
