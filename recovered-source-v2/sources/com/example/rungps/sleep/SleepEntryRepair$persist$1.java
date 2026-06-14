package com.example.rungps.sleep;

import androidx.health.connect.client.records.CervicalMucusRecord;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SleepEntryRepair.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sleep.SleepEntryRepair", f = "SleepEntryRepair.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, l = {62, 104}, m = "persist", n = {"entry", "labels", "noteSuffix", "repo", "inBedMin", "deep", CervicalMucusRecord.Sensation.LIGHT, "rem", "awake", "total", "eff", "updated"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5", "I$6", "L$0"})
/* loaded from: classes3.dex */
final class SleepEntryRepair$persist$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    int I$5;
    int I$6;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SleepEntryRepair this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SleepEntryRepair$persist$1(SleepEntryRepair sleepEntryRepair, Continuation<? super SleepEntryRepair$persist$1> continuation) {
        super(continuation);
        this.this$0 = sleepEntryRepair;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object persist;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        persist = this.this$0.persist(null, null, null, 0, null, this);
        return persist;
    }
}
