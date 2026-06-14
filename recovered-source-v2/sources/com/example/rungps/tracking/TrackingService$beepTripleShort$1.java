package com.example.rungps.tracking;

import android.media.ToneGenerator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: TrackingService.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.tracking.TrackingService$beepTripleShort$1", f = "TrackingService.kt", i = {}, l = {1204}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class TrackingService$beepTripleShort$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    Object L$0;
    int label;
    final /* synthetic */ TrackingService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TrackingService$beepTripleShort$1(TrackingService trackingService, Continuation<? super TrackingService$beepTripleShort$1> continuation) {
        super(2, continuation);
        this.this$0 = trackingService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackingService$beepTripleShort$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackingService$beepTripleShort$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0054 -> B:5:0x0057). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        TrackingService trackingService;
        int i;
        int i2;
        ToneGenerator toneGenerator;
        boolean z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            trackingService = this.this$0;
            i = 3;
            i2 = 0;
            if (i2 < i) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = this.I$1;
            i = this.I$0;
            trackingService = (TrackingService) this.L$0;
            ResultKt.throwOnFailure(obj);
            i2++;
            if (i2 < i) {
                toneGenerator = trackingService.tone;
                if (toneGenerator != null) {
                    Boxing.boxBoolean(toneGenerator.startTone(24, 110));
                }
                z = trackingService.vibrationEnabled;
                if (z) {
                    trackingService.vibrateShort();
                }
                this.L$0 = trackingService;
                this.I$0 = i;
                this.I$1 = i2;
                this.label = 1;
                if (DelayKt.delay(160L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i2++;
                if (i2 < i) {
                }
            } else {
                return Unit.INSTANCE;
            }
        }
    }
}
