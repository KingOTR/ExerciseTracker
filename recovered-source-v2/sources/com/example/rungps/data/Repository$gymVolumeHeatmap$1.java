package com.example.rungps.data;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Repository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.Repository", f = "Repository.kt", i = {0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 5, 6}, l = {1703, 1704, 1706, 1708, 1713, 1716, 1717, 1718}, m = "gymVolumeHeatmap", n = {"this", "days", "this", "finished", "days", "this", "sessions", "days", "this", "sessions", "setsMap", "destination$iv$iv", "days", "this", "dayNames", "days", "this", "this"}, s = {"L$0", "I$0", "L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "I$0", "L$0", "L$0"})
/* loaded from: classes3.dex */
final class Repository$gymVolumeHeatmap$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Repository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Repository$gymVolumeHeatmap$1(Repository repository, Continuation<? super Repository$gymVolumeHeatmap$1> continuation) {
        super(continuation);
        this.this$0 = repository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.gymVolumeHeatmap(0, this);
    }
}
