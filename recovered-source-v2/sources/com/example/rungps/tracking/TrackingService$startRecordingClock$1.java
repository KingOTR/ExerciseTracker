package com.example.rungps.tracking;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;

/* compiled from: TrackingService.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.tracking.TrackingService$startRecordingClock$1", f = "TrackingService.kt", i = {0}, l = {530}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class TrackingService$startRecordingClock$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TrackingService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TrackingService$startRecordingClock$1(TrackingService trackingService, Continuation<? super TrackingService$startRecordingClock$1> continuation) {
        super(2, continuation);
        this.this$0 = trackingService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TrackingService$startRecordingClock$1 trackingService$startRecordingClock$1 = new TrackingService$startRecordingClock$1(this.this$0, continuation);
        trackingService$startRecordingClock$1.L$0 = obj;
        return trackingService$startRecordingClock$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackingService$startRecordingClock$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0049  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003e -> B:5:0x0041). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        boolean z;
        boolean z2;
        final long activeElapsedMs;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            if (CoroutineScopeKt.isActive(coroutineScope)) {
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        coroutineScope = (CoroutineScope) this.L$0;
        ResultKt.throwOnFailure(obj);
        z2 = this.this$0.isRunning;
        if (z2) {
            activeElapsedMs = this.this$0.activeElapsedMs(System.currentTimeMillis());
            TrackingState trackingState = TrackingState.INSTANCE;
            final TrackingService trackingService = this.this$0;
            trackingState.patch(new Function1() { // from class: com.example.rungps.tracking.TrackingService$startRecordingClock$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    TrackingUiState invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = TrackingService$startRecordingClock$1.invokeSuspend$lambda$0(activeElapsedMs, trackingService, (TrackingUiState) obj2);
                    return invokeSuspend$lambda$0;
                }
            });
            if (CoroutineScopeKt.isActive(coroutineScope)) {
                z = this.this$0.isRunning;
                if (z) {
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    z2 = this.this$0.isRunning;
                    if (z2) {
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TrackingUiState invokeSuspend$lambda$0(long j, TrackingService trackingService, TrackingUiState trackingUiState) {
        long j2;
        boolean z;
        boolean z2;
        boolean z3;
        TrackingUiState copy;
        boolean z4;
        if (!trackingUiState.isRecording()) {
            return trackingUiState;
        }
        j2 = trackingService.splitStartElapsedMs;
        long coerceAtLeast = RangesKt.coerceAtLeast(j - j2, 0L);
        z = trackingService.manualPaused;
        if (!z) {
            z4 = trackingService.isAutoPaused;
            if (!z4) {
                z2 = false;
                z3 = trackingService.isAutoPaused;
                copy = trackingUiState.copy((r50 & 1) != 0 ? trackingUiState.isRecording : false, (r50 & 2) != 0 ? trackingUiState.startedAtMs : null, (r50 & 4) != 0 ? trackingUiState.elapsedMs : j, (r50 & 8) != 0 ? trackingUiState.distanceM : 0.0d, (r50 & 16) != 0 ? trackingUiState.steps : 0L, (r50 & 32) != 0 ? trackingUiState.lastLat : null, (r50 & 64) != 0 ? trackingUiState.lastLon : null, (r50 & 128) != 0 ? trackingUiState.lastFinishedRunId : null, (r50 & 256) != 0 ? trackingUiState.lastFinishedAtMs : null, (r50 & 512) != 0 ? trackingUiState.planType : null, (r50 & 1024) != 0 ? trackingUiState.segmentLabel : null, (r50 & 2048) != 0 ? trackingUiState.segmentIndex : null, (r50 & 4096) != 0 ? trackingUiState.segmentCount : null, (r50 & 8192) != 0 ? trackingUiState.segmentElapsedMs : null, (r50 & 16384) != 0 ? trackingUiState.segmentRemainingMs : null, (r50 & 32768) != 0 ? trackingUiState.segmentDistanceM : null, (r50 & 65536) != 0 ? trackingUiState.segmentRemainingM : null, (r50 & 131072) != 0 ? trackingUiState.workoutFinished : null, (r50 & 262144) != 0 ? trackingUiState.isAutoPaused : z3, (r50 & 524288) != 0 ? trackingUiState.isPaused : z2, (r50 & 1048576) != 0 ? trackingUiState.currentSplitElapsedMs : coerceAtLeast, (r50 & 2097152) != 0 ? trackingUiState.targetPaceSecPerKm : null, (4194304 & r50) != 0 ? trackingUiState.goalDistanceM : null, (r50 & 8388608) != 0 ? trackingUiState.goalTimeMs : null, (r50 & 16777216) != 0 ? trackingUiState.splitCount : 0, (r50 & 33554432) != 0 ? trackingUiState.lastSplitMs : null, (r50 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? trackingUiState.lapCount : 0, (r50 & 134217728) != 0 ? trackingUiState.lastLapMs : null);
                return copy;
            }
        }
        z2 = true;
        z3 = trackingService.isAutoPaused;
        copy = trackingUiState.copy((r50 & 1) != 0 ? trackingUiState.isRecording : false, (r50 & 2) != 0 ? trackingUiState.startedAtMs : null, (r50 & 4) != 0 ? trackingUiState.elapsedMs : j, (r50 & 8) != 0 ? trackingUiState.distanceM : 0.0d, (r50 & 16) != 0 ? trackingUiState.steps : 0L, (r50 & 32) != 0 ? trackingUiState.lastLat : null, (r50 & 64) != 0 ? trackingUiState.lastLon : null, (r50 & 128) != 0 ? trackingUiState.lastFinishedRunId : null, (r50 & 256) != 0 ? trackingUiState.lastFinishedAtMs : null, (r50 & 512) != 0 ? trackingUiState.planType : null, (r50 & 1024) != 0 ? trackingUiState.segmentLabel : null, (r50 & 2048) != 0 ? trackingUiState.segmentIndex : null, (r50 & 4096) != 0 ? trackingUiState.segmentCount : null, (r50 & 8192) != 0 ? trackingUiState.segmentElapsedMs : null, (r50 & 16384) != 0 ? trackingUiState.segmentRemainingMs : null, (r50 & 32768) != 0 ? trackingUiState.segmentDistanceM : null, (r50 & 65536) != 0 ? trackingUiState.segmentRemainingM : null, (r50 & 131072) != 0 ? trackingUiState.workoutFinished : null, (r50 & 262144) != 0 ? trackingUiState.isAutoPaused : z3, (r50 & 524288) != 0 ? trackingUiState.isPaused : z2, (r50 & 1048576) != 0 ? trackingUiState.currentSplitElapsedMs : coerceAtLeast, (r50 & 2097152) != 0 ? trackingUiState.targetPaceSecPerKm : null, (4194304 & r50) != 0 ? trackingUiState.goalDistanceM : null, (r50 & 8388608) != 0 ? trackingUiState.goalTimeMs : null, (r50 & 16777216) != 0 ? trackingUiState.splitCount : 0, (r50 & 33554432) != 0 ? trackingUiState.lastSplitMs : null, (r50 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? trackingUiState.lapCount : 0, (r50 & 134217728) != 0 ? trackingUiState.lastLapMs : null);
        return copy;
    }
}
