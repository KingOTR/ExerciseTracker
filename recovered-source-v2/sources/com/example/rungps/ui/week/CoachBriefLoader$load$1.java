package com.example.rungps.ui.week;

import androidx.health.connect.client.records.ExerciseSessionRecord;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CoachBriefLoader.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.week.CoachBriefLoader", f = "CoachBriefLoader.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6}, l = {39, 42, 46, 50, 51, 80, ExerciseSessionRecord.EXERCISE_TYPE_YOGA}, m = "load", n = {"this", "runs", "gymSessions", "recoveryEvents", "sleepDb", "zone", "repo", "hc", "this", "runs", "gymSessions", "recoveryEvents", "sleepDb", "zone", "repo", "hc", "granted", "finishedGym", "todayStartMs", "this", "runs", "gymSessions", "recoveryEvents", "sleepDb", "zone", "repo", "hc", "granted", "finishedGym", "tonMap", "todayStartMs", "this", "runs", "gymSessions", "recoveryEvents", "sleepDb", "zone", "repo", "hc", "granted", "finishedGym", "tonMap", "week", "todayStartMs", "this", "runs", "gymSessions", "recoveryEvents", "zone", "repo", "finishedGym", "tonMap", "week", "todayStartMs", "this", "runs", "recoveryEvents", "zone", "repo", "finishedGym", "tonMap", "week", "health", "deload", "ready", "lastGym", "lastRun", "now", "gymLast48h", "this", "runs", "recoveryEvents", "zone", "finishedGym", "tonMap", "week", "health", "deload", "ready", "lastGym", "lastRun", "muscleLookup", "now", "gymLast48h"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "J$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "J$0", "I$0"})
/* loaded from: classes3.dex */
final class CoachBriefLoader$load$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$14;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CoachBriefLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoachBriefLoader$load$1(CoachBriefLoader coachBriefLoader, Continuation<? super CoachBriefLoader$load$1> continuation) {
        super(continuation);
        this.this$0 = coachBriefLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.load(null, null, null, null, null, null, this);
    }
}
