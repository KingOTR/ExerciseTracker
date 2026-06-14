package com.example.rungps.sleep;

import androidx.health.connect.client.records.ExerciseSessionRecord;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SleepEntryTimeEditor.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sleep.SleepEntryTimeEditor", f = "SleepEntryTimeEditor.kt", i = {0}, l = {ExerciseSessionRecord.EXERCISE_TYPE_SWIMMING_OPEN_WATER}, m = "updateEndTime-BWLJW6A", n = {"adjusted"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class SleepEntryTimeEditor$updateEndTime$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SleepEntryTimeEditor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SleepEntryTimeEditor$updateEndTime$1(SleepEntryTimeEditor sleepEntryTimeEditor, Continuation<? super SleepEntryTimeEditor$updateEndTime$1> continuation) {
        super(continuation);
        this.this$0 = sleepEntryTimeEditor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m6923updateEndTimeBWLJW6A = this.this$0.m6923updateEndTimeBWLJW6A(null, null, 0L, this);
        return m6923updateEndTimeBWLJW6A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m6923updateEndTimeBWLJW6A : Result.m7904boximpl(m6923updateEndTimeBWLJW6A);
    }
}
