package com.example.rungps.data.repo;

import androidx.health.connect.client.records.ExerciseSessionRecord;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SleepRepository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.repo.SleepRepository", f = "SleepRepository.kt", i = {0, 0, 0, 0, 1, 1, 1, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 8, 8, 9}, l = {43, 57, 58, 76, ExerciseSessionRecord.EXERCISE_TYPE_WEIGHTLIFTING, 87, 92, 94, 96, 97}, m = "add-gIAlu-s", n = {"this", "entry", "normalized", "durNew", "this", "hc", "merged", "hc", "this", "entry", "normalized", "durNew", "this", "entry", "normalized", "durNew", "this", "entry", "normalized", "this", "entry", "normalized", "this", "entry", "this", "id", "id"}, s = {"L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "L$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "J$0", "J$0"})
/* loaded from: classes3.dex */
final class SleepRepository$add$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SleepRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SleepRepository$add$1(SleepRepository sleepRepository, Continuation<? super SleepRepository$add$1> continuation) {
        super(continuation);
        this.this$0 = sleepRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m6896addgIAlus = this.this$0.m6896addgIAlus(null, this);
        return m6896addgIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m6896addgIAlus : Result.m7904boximpl(m6896addgIAlus);
    }
}
