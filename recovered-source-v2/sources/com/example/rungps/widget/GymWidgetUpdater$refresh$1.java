package com.example.rungps.widget;

import androidx.health.connect.client.records.ExerciseSessionRecord;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GymWidgetUpdater.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.widget.GymWidgetUpdater", f = "GymWidgetUpdater.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, l = {57, ExerciseSessionRecord.EXERCISE_TYPE_SWIMMING_OPEN_WATER, 75, 104}, m = "refresh", n = {"this", "context", "repo", "this", "context", "repo", "open", "finished", "attendance", "restEndsAt", "now", "restActive", "this", "context", "repo", "open", "finished", "attendance", "nextDay", "restEndsAt", "now", "restActive", "this", "context", "open", "attendance", "nextDay", "snapshot", "headline", "trend", "daysLeftLabel", "restEndsAt", "restActive", "showAttendance", "streak"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "J$0", "J$1", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "J$1", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "J$0", "I$0", "I$1", "I$2"})
/* loaded from: classes3.dex */
final class GymWidgetUpdater$refresh$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GymWidgetUpdater this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GymWidgetUpdater$refresh$1(GymWidgetUpdater gymWidgetUpdater, Continuation<? super GymWidgetUpdater$refresh$1> continuation) {
        super(continuation);
        this.this$0 = gymWidgetUpdater;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.refresh(null, this);
    }
}
