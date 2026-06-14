package com.example.rungps.widget;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GymWidgetSessionSnapshot.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.widget.GymWidgetSessionSnapshotBuilder", f = "GymWidgetSessionSnapshot.kt", i = {0, 0}, l = {59}, m = "suggestionFor", n = {"exerciseName", "sets"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class GymWidgetSessionSnapshotBuilder$suggestionFor$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GymWidgetSessionSnapshotBuilder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GymWidgetSessionSnapshotBuilder$suggestionFor$1(GymWidgetSessionSnapshotBuilder gymWidgetSessionSnapshotBuilder, Continuation<? super GymWidgetSessionSnapshotBuilder$suggestionFor$1> continuation) {
        super(continuation);
        this.this$0 = gymWidgetSessionSnapshotBuilder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object suggestionFor;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        suggestionFor = this.this$0.suggestionFor(null, null, null, this);
        return suggestionFor;
    }
}
