package com.example.rungps.tracking;

import com.example.rungps.data.Repository;
import com.example.rungps.intervals.Cue;
import com.example.rungps.intervals.WorkoutEngine;
import com.example.rungps.widget.RideRunWidgetUpdater;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TrackingService.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.tracking.TrackingService$start$14", f = "TrackingService.kt", i = {}, l = {437}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class TrackingService$start$14 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ TrackingService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TrackingService$start$14(TrackingService trackingService, Continuation<? super TrackingService$start$14> continuation) {
        super(2, continuation);
        this.this$0 = trackingService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackingService$start$14(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackingService$start$14) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Repository repo;
        long j;
        String str;
        TrackingService trackingService;
        Long l;
        WorkoutEngine workoutEngine;
        List<Cue> start;
        long j2;
        String str2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            TrackingService trackingService2 = this.this$0;
            repo = trackingService2.getRepo();
            j = this.this$0.startedAtMs;
            str = this.this$0.currentActivityType;
            this.L$0 = trackingService2;
            this.label = 1;
            Object startRun = repo.startRun(j, str, this);
            if (startRun == coroutine_suspended) {
                return coroutine_suspended;
            }
            trackingService = trackingService2;
            obj = startRun;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            trackingService = (TrackingService) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        trackingService.runId = (Long) obj;
        l = this.this$0.runId;
        if (l != null) {
            TrackingService trackingService3 = this.this$0;
            long longValue = l.longValue();
            TrackingActiveStore trackingActiveStore = TrackingActiveStore.INSTANCE;
            TrackingService trackingService4 = trackingService3;
            j2 = trackingService3.startedAtMs;
            str2 = trackingService3.currentActivityType;
            trackingActiveStore.markActive(trackingService4, longValue, j2, str2);
            RecordingHrBridge.INSTANCE.onRunStarted(longValue);
            trackingService3.startSpotifyTimeline(longValue);
            RideRunWidgetUpdater.INSTANCE.refreshAsync(trackingService4);
        }
        workoutEngine = this.this$0.engine;
        if (workoutEngine != null && (start = workoutEngine.start(0L, 0.0d)) != null) {
            this.this$0.emitCues(start);
        }
        return Unit.INSTANCE;
    }
}
