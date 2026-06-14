package com.example.rungps.ui.sleep;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SleepTabScreenBody.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.sleep.SleepTabScreenBodyKt", f = "SleepTabScreenBody.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {474, 481}, m = "SleepTabScreenBody$persistWakeNight", n = {"ctx", "repairEntry$delegate", "showRepairPrompt$delegate", "feedback", "repairEntry$delegate", "showRepairPrompt$delegate", "saved"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
/* loaded from: classes3.dex */
final class SleepTabScreenBodyKt$SleepTabScreenBody$persistWakeNight$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    SleepTabScreenBodyKt$SleepTabScreenBody$persistWakeNight$1(Continuation<? super SleepTabScreenBodyKt$SleepTabScreenBody$persistWakeNight$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object SleepTabScreenBody$persistWakeNight;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        SleepTabScreenBody$persistWakeNight = SleepTabScreenBodyKt.SleepTabScreenBody$persistWakeNight(null, null, null, null, null, null, null, this);
        return SleepTabScreenBody$persistWakeNight;
    }
}
