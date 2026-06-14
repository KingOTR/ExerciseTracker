package com.example.rungps.media;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SessionMediaReader.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.media.SessionMediaReader", f = "SessionMediaReader.kt", i = {0, 0, 0, 0}, l = {44, 63}, m = "read", n = {"this", "context", "device", "deviceSnap"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes3.dex */
final class SessionMediaReader$read$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SessionMediaReader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SessionMediaReader$read$1(SessionMediaReader sessionMediaReader, Continuation<? super SessionMediaReader$read$1> continuation) {
        super(continuation);
        this.this$0 = sessionMediaReader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.read(null, null, this);
    }
}
