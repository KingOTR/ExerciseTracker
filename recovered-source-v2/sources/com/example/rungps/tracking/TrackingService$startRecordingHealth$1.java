package com.example.rungps.tracking;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;

/* compiled from: TrackingService.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.tracking.TrackingService$startRecordingHealth$1", f = "TrackingService.kt", i = {0}, l = {551}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class TrackingService$startRecordingHealth$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TrackingService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TrackingService$startRecordingHealth$1(TrackingService trackingService, Continuation<? super TrackingService$startRecordingHealth$1> continuation) {
        super(2, continuation);
        this.this$0 = trackingService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TrackingService$startRecordingHealth$1 trackingService$startRecordingHealth$1 = new TrackingService$startRecordingHealth$1(this.this$0, continuation);
        trackingService$startRecordingHealth$1.L$0 = obj;
        return trackingService$startRecordingHealth$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackingService$startRecordingHealth$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003f -> B:5:0x0042). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        boolean z;
        boolean z2;
        String str;
        double d;
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
            this.this$0.renewWakeLock();
            TrackingService trackingService = this.this$0;
            ActivityTypes activityTypes = ActivityTypes.INSTANCE;
            str = this.this$0.currentActivityType;
            trackingService.promoteToForeground(activityTypes.isBike(str) ? "Recording ride…" : "Recording run…");
            this.this$0.ensureLocationUpdatesIfStale();
            long activeElapsedMs$default = TrackingService.activeElapsedMs$default(this.this$0, 0L, 1, null);
            TrackingService trackingService2 = this.this$0;
            d = trackingService2.totalDistanceM;
            trackingService2.updateNotification(activeElapsedMs$default, d, null);
            if (CoroutineScopeKt.isActive(coroutineScope)) {
                z = this.this$0.isRunning;
                if (z) {
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    if (DelayKt.delay(60000L, this) == coroutine_suspended) {
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
}
