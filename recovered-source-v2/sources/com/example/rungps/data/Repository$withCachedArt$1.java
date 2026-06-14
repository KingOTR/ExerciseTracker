package com.example.rungps.data;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Repository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.Repository", f = "Repository.kt", i = {0, 0, 1}, l = {259, 262}, m = "withCachedArt", n = {"this", "$this$withCachedArt", "updated"}, s = {"L$0", "L$1", "L$0"})
/* loaded from: classes3.dex */
final class Repository$withCachedArt$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Repository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Repository$withCachedArt$1(Repository repository, Continuation<? super Repository$withCachedArt$1> continuation) {
        super(continuation);
        this.this$0 = repository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object withCachedArt;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        withCachedArt = this.this$0.withCachedArt(null, null, this);
        return withCachedArt;
    }
}
