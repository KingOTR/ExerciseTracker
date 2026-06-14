package com.example.rungps.sync;

import androidx.health.connect.client.records.ExerciseSessionRecord;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HealthSyncWorker.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sync.HealthSyncWorker", f = "HealthSyncWorker.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4}, l = {19, 27, 30, 38, 57, ExerciseSessionRecord.EXERCISE_TYPE_SWIMMING_OPEN_WATER}, m = "doWork", n = {"this", "ctx", "hc", "this", "ctx", "hc", "granted", "repo", "zone", "this", "ctx", "hc", "granted", "repo", "zone", "this", "ctx", "repo", "this", "ctx", "repo", "pushed"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes3.dex */
final class HealthSyncWorker$doWork$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HealthSyncWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HealthSyncWorker$doWork$1(HealthSyncWorker healthSyncWorker, Continuation<? super HealthSyncWorker$doWork$1> continuation) {
        super(continuation);
        this.this$0 = healthSyncWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.doWork(this);
    }
}
