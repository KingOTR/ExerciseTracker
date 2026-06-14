package com.example.rungps.sleep;

import android.media.AudioRecord;
import com.google.android.gms.location.DeviceOrientationRequest;
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

/* compiled from: SleepListenService.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sleep.SleepListenService$startHealthMonitor$1", f = "SleepListenService.kt", i = {0}, l = {259}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class SleepListenService$startHealthMonitor$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SleepListenService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SleepListenService$startHealthMonitor$1(SleepListenService sleepListenService, Continuation<? super SleepListenService$startHealthMonitor$1> continuation) {
        super(2, continuation);
        this.this$0 = sleepListenService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SleepListenService$startHealthMonitor$1 sleepListenService$startHealthMonitor$1 = new SleepListenService$startHealthMonitor$1(this.this$0, continuation);
        sleepListenService$startHealthMonitor$1.L$0 = obj;
        return sleepListenService$startHealthMonitor$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SleepListenService$startHealthMonitor$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0051  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0042 -> B:5:0x0045). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        int i;
        AudioRecord audioRecord;
        AudioRecord audioRecord2;
        AudioRecord audioRecord3;
        boolean hasRecordAudio;
        boolean promoteToForeground;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            if (CoroutineScopeKt.isActive(coroutineScope)) {
                this.L$0 = coroutineScope;
                this.label = 1;
                if (DelayKt.delay(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT, this) == coroutine_suspended) {
                }
                if (SleepOvernightStore.INSTANCE.isActive(this.this$0)) {
                }
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        coroutineScope = (CoroutineScope) this.L$0;
        ResultKt.throwOnFailure(obj);
        if (SleepOvernightStore.INSTANCE.isActive(this.this$0)) {
            SleepOvernightStore sleepOvernightStore = SleepOvernightStore.INSTANCE;
            SleepListenService sleepListenService = this.this$0;
            SleepListenService sleepListenService2 = sleepListenService;
            i = sleepListenService.bucketCount;
            audioRecord = this.this$0.audioRecord;
            boolean z = false;
            sleepOvernightStore.recordHealth(sleepListenService2, "hb buckets=" + i + " mic=" + (audioRecord != null));
            this.this$0.renewWakeLockIfNeeded();
            if (SleepListenService.INSTANCE.isRunningInProcess()) {
                audioRecord2 = this.this$0.audioRecord;
                if (audioRecord2 != null && audioRecord2.getRecordingState() == 3) {
                    z = true;
                }
                audioRecord3 = this.this$0.audioRecord;
                if (audioRecord3 == null || !z) {
                    hasRecordAudio = this.this$0.hasRecordAudio();
                    if (hasRecordAudio) {
                        SleepOvernightStore.INSTANCE.recordMicGap(this.this$0, 10000L);
                        this.this$0.restartAudioCapture();
                    }
                }
                promoteToForeground = this.this$0.promoteToForeground("Listening for sleep…");
                if (!promoteToForeground) {
                    SleepOvernightStore.INSTANCE.recordHealth(this.this$0, "fgs_repromote_retry");
                }
                SleepAlarmScheduler.INSTANCE.ensureScheduled(this.this$0);
                if (CoroutineScopeKt.isActive(coroutineScope) && SleepOvernightStore.INSTANCE.isActive(this.this$0)) {
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    if (DelayKt.delay(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (SleepOvernightStore.INSTANCE.isActive(this.this$0)) {
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
