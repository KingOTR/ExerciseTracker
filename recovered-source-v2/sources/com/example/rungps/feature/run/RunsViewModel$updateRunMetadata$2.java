package com.example.rungps.feature.run;

import androidx.health.connect.client.records.ExerciseSessionRecord;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* compiled from: RunsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.feature.run.RunsViewModel$updateRunMetadata$2", f = "RunsViewModel.kt", i = {}, l = {ExerciseSessionRecord.EXERCISE_TYPE_WHEELCHAIR}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class RunsViewModel$updateRunMetadata$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $description;
    final /* synthetic */ Long $gearId;
    final /* synthetic */ Function0<Unit> $onDone;
    final /* synthetic */ String $privateNotes;
    final /* synthetic */ long $runId;
    final /* synthetic */ String $title;
    int label;
    final /* synthetic */ RunsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RunsViewModel$updateRunMetadata$2(RunsViewModel runsViewModel, long j, String str, String str2, String str3, Long l, Function0<Unit> function0, Continuation<? super RunsViewModel$updateRunMetadata$2> continuation) {
        super(2, continuation);
        this.this$0 = runsViewModel;
        this.$runId = j;
        this.$title = str;
        this.$description = str2;
        this.$privateNotes = str3;
        this.$gearId = l;
        this.$onDone = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RunsViewModel$updateRunMetadata$2(this.this$0, this.$runId, this.$title, this.$description, this.$privateNotes, this.$gearId, this.$onDone, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RunsViewModel$updateRunMetadata$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (this.this$0.useCases.getGateway().updateRunMetadata(this.$runId, this.$title, this.$description, this.$privateNotes, this.$gearId, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.getUiEvents().tryEmit("Activity details saved");
            this.$onDone.invoke();
        } catch (Exception e) {
            MutableSharedFlow<String> uiEvents = this.this$0.getUiEvents();
            String message = e.getMessage();
            if (message == null) {
                message = "unknown error";
            }
            uiEvents.tryEmit("Save failed: " + message);
        }
        return Unit.INSTANCE;
    }
}
