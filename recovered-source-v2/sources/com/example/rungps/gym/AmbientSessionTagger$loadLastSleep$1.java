package com.example.rungps.gym;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AmbientSessionTagger.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.gym.AmbientSessionTagger", f = "AmbientSessionTagger.kt", i = {0}, l = {149}, m = "loadLastSleep", n = {"now"}, s = {"J$0"})
/* loaded from: classes3.dex */
final class AmbientSessionTagger$loadLastSleep$1 extends ContinuationImpl {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AmbientSessionTagger this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AmbientSessionTagger$loadLastSleep$1(AmbientSessionTagger ambientSessionTagger, Continuation<? super AmbientSessionTagger$loadLastSleep$1> continuation) {
        super(continuation);
        this.this$0 = ambientSessionTagger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object loadLastSleep;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        loadLastSleep = this.this$0.loadLastSleep(null, this);
        return loadLastSleep;
    }
}
