package com.example.rungps.ui.run;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import androidx.health.connect.client.records.ExerciseSessionRecord;
import com.example.rungps.export.RunRouteOverlayRenderer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: RunOverlayExportDialog.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.run.RunOverlayExportDialogKt$RunOverlayExportDialog$1$1", f = "RunOverlayExportDialog.kt", i = {}, l = {ExerciseSessionRecord.EXERCISE_TYPE_SWIMMING_POOL}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class RunOverlayExportDialogKt$RunOverlayExportDialog$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<List<Pair<Double, Double>>> $latLon$delegate;
    final /* synthetic */ MutableState<Boolean> $loadingRun$delegate;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ long $runId;
    final /* synthetic */ MutableState<Boolean> $runReady$delegate;
    final /* synthetic */ MutableState<RunRouteOverlayRenderer.RunStats> $stats$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RunOverlayExportDialogKt$RunOverlayExportDialog$1$1(Context context, Function0<Unit> function0, MutableState<Boolean> mutableState, long j, MutableState<List<Pair<Double, Double>>> mutableState2, MutableState<RunRouteOverlayRenderer.RunStats> mutableState3, MutableState<Boolean> mutableState4, Continuation<? super RunOverlayExportDialogKt$RunOverlayExportDialog$1$1> continuation) {
        super(2, continuation);
        this.$ctx = context;
        this.$onDismiss = function0;
        this.$loadingRun$delegate = mutableState;
        this.$runId = j;
        this.$latLon$delegate = mutableState2;
        this.$stats$delegate = mutableState3;
        this.$runReady$delegate = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RunOverlayExportDialogKt$RunOverlayExportDialog$1$1(this.$ctx, this.$onDismiss, this.$loadingRun$delegate, this.$runId, this.$latLon$delegate, this.$stats$delegate, this.$runReady$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RunOverlayExportDialogKt$RunOverlayExportDialog$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            RunOverlayExportDialogKt.RunOverlayExportDialog$lambda$8(this.$loadingRun$delegate, true);
            this.label = 1;
            obj = BuildersKt.withContext(Dispatchers.getIO(), new RunOverlayExportDialogKt$RunOverlayExportDialog$1$1$loaded$1(this.$ctx, this.$runId, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Triple triple = (Triple) obj;
        RunOverlayExportDialogKt.RunOverlayExportDialog$lambda$8(this.$loadingRun$delegate, false);
        if (triple == null) {
            Toast.makeText(this.$ctx, "Not enough GPS points for this run.", 1).show();
            this.$onDismiss.invoke();
            return Unit.INSTANCE;
        }
        this.$latLon$delegate.setValue((List) triple.getFirst());
        this.$stats$delegate.setValue((RunRouteOverlayRenderer.RunStats) triple.getSecond());
        RunOverlayExportDialogKt.RunOverlayExportDialog$lambda$23(this.$runReady$delegate, ((Boolean) triple.getThird()).booleanValue());
        return Unit.INSTANCE;
    }
}
