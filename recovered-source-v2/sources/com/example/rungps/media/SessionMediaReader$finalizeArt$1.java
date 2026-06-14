package com.example.rungps.media;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SessionMediaReader.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.media.SessionMediaReader", f = "SessionMediaReader.kt", i = {0, 1}, l = {100, 103}, m = "finalizeArt", n = {"snap", "snap"}, s = {"L$0", "L$0"})
/* loaded from: classes3.dex */
final class SessionMediaReader$finalizeArt$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SessionMediaReader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SessionMediaReader$finalizeArt$1(SessionMediaReader sessionMediaReader, Continuation<? super SessionMediaReader$finalizeArt$1> continuation) {
        super(continuation);
        this.this$0 = sessionMediaReader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object finalizeArt;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        finalizeArt = this.this$0.finalizeArt(null, null, this);
        return finalizeArt;
    }
}
