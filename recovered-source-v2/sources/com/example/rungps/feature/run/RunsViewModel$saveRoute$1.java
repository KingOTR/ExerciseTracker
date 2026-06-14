package com.example.rungps.feature.run;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* compiled from: RunsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.feature.run.RunsViewModel$saveRoute$1", f = "RunsViewModel.kt", i = {1, 2, 2}, l = {116, 117, 118}, m = "invokeSuspend", n = {"before", "before", "id"}, s = {"I$0", "I$0", "J$0"})
/* loaded from: classes3.dex */
final class RunsViewModel$saveRoute$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ double $distanceM;
    final /* synthetic */ List<Pair<Double, Double>> $latLon;
    final /* synthetic */ String $name;
    int I$0;
    long J$0;
    int label;
    final /* synthetic */ RunsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RunsViewModel$saveRoute$1(RunsViewModel runsViewModel, String str, double d, List<Pair<Double, Double>> list, Continuation<? super RunsViewModel$saveRoute$1> continuation) {
        super(2, continuation);
        this.this$0 = runsViewModel;
        this.$name = str;
        this.$distanceM = d;
        this.$latLon = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RunsViewModel$saveRoute$1(this.this$0, this.$name, this.$distanceM, this.$latLon, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RunsViewModel$saveRoute$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x009f A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:8:0x0017, B:9:0x0093, B:11:0x009f, B:16:0x00ad, B:17:0x00b9, B:21:0x0026, B:22:0x0071, B:26:0x002a, B:27:0x004a, B:32:0x0034), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        long j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.label;
        try {
        } catch (Exception e) {
            MutableSharedFlow<String> uiEvents = this.this$0.getUiEvents();
            String message = e.getMessage();
            if (message == null) {
                message = "unknown error";
            }
            uiEvents.tryEmit("Save failed: " + message);
        }
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = this.this$0.useCases.getListRoutes().invoke(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = this.J$0;
                    i2 = this.I$0;
                    ResultKt.throwOnFailure(obj);
                    int size = ((List) obj).size();
                    if (j >= 0) {
                        this.this$0.getUiEvents().tryEmit("Route needs at least 2 points");
                    } else if (size == i2) {
                        this.this$0.getUiEvents().tryEmit("Route already saved (same path)");
                    } else {
                        this.this$0.getUiEvents().tryEmit("Saved route: " + this.$name);
                    }
                    return Unit.INSTANCE;
                }
                i = this.I$0;
                ResultKt.throwOnFailure(obj);
                long longValue = ((Number) obj).longValue();
                this.I$0 = i;
                this.J$0 = longValue;
                this.label = 3;
                obj = this.this$0.useCases.getListRoutes().invoke(this);
                if (obj != coroutine_suspended) {
                    return coroutine_suspended;
                }
                i2 = i;
                j = longValue;
                int size2 = ((List) obj).size();
                if (j >= 0) {
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        int size3 = ((List) obj).size();
        this.I$0 = size3;
        this.label = 2;
        Object invoke = this.this$0.useCases.getSaveRoute().invoke(this.$name, this.$distanceM, this.$latLon, this);
        if (invoke == coroutine_suspended) {
            return coroutine_suspended;
        }
        i = size3;
        obj = invoke;
        long longValue2 = ((Number) obj).longValue();
        this.I$0 = i;
        this.J$0 = longValue2;
        this.label = 3;
        obj = this.this$0.useCases.getListRoutes().invoke(this);
        if (obj != coroutine_suspended) {
        }
    }
}
