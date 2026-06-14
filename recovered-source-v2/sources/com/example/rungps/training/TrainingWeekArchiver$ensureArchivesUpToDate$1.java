package com.example.rungps.training;

import androidx.health.connect.client.records.ExerciseSessionRecord;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TrainingWeekArchiver.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.training.TrainingWeekArchiver", f = "TrainingWeekArchiver.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6}, l = {30, 31, 32, 34, 41, 54, 60, ExerciseSessionRecord.EXERCISE_TYPE_SWIMMING_OPEN_WATER}, m = "ensureArchivesUpToDate", n = {"this", "context", "zone", "repo", "today", "thisMonday", "this", "context", "zone", "repo", "today", "thisMonday", "runs", "this", "context", "zone", "repo", "today", "thisMonday", "runs", "gymSessions", "this", "context", "zone", "repo", "today", "thisMonday", "runs", "gymSessions", "sleepDb", "finishedGym", "this", "context", "zone", "repo", "today", "thisMonday", "runs", "gymSessions", "sleepDb", "finishedGym", "tonMap", "sleepWindows", "weekStart", "weeksAgo", "this", "context", "zone", "repo", "today", "thisMonday", "runs", "gymSessions", "sleepDb", "finishedGym", "tonMap", "sleepWindows", "weekStart", "week", "weeksAgo", "this", "context", "zone", "repo", "today", "thisMonday", "runs", "gymSessions", "sleepDb", "finishedGym", "tonMap", "sleepWindows", "weeksAgo"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "L$13", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "I$0"})
/* loaded from: classes3.dex */
final class TrainingWeekArchiver$ensureArchivesUpToDate$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
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
    final /* synthetic */ TrainingWeekArchiver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TrainingWeekArchiver$ensureArchivesUpToDate$1(TrainingWeekArchiver trainingWeekArchiver, Continuation<? super TrainingWeekArchiver$ensureArchivesUpToDate$1> continuation) {
        super(continuation);
        this.this$0 = trainingWeekArchiver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.ensureArchivesUpToDate(null, null, this);
    }
}
