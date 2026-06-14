package com.example.rungps.gym;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AmbientSessionTagger.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.gym.AmbientSessionTagger", f = "AmbientSessionTagger.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {109, 116}, m = "compose", n = {"this", "context", "hint", "startedAtMs", "this", "hint", "atGym", "hour", "dow", "weekend"}, s = {"L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "Z$0", "I$0", "I$1", "I$2"})
/* loaded from: classes3.dex */
final class AmbientSessionTagger$compose$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AmbientSessionTagger this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AmbientSessionTagger$compose$1(AmbientSessionTagger ambientSessionTagger, Continuation<? super AmbientSessionTagger$compose$1> continuation) {
        super(continuation);
        this.this$0 = ambientSessionTagger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.compose(null, 0L, null, this);
    }
}
