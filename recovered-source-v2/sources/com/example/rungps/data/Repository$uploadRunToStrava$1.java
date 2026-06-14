package com.example.rungps.data;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Repository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.Repository", f = "Repository.kt", i = {}, l = {2354}, m = "uploadRunToStrava-gIAlu-s", n = {}, s = {})
/* loaded from: classes3.dex */
final class Repository$uploadRunToStrava$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Repository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Repository$uploadRunToStrava$1(Repository repository, Continuation<? super Repository$uploadRunToStrava$1> continuation) {
        super(continuation);
        this.this$0 = repository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m6844uploadRunToStravagIAlus = this.this$0.m6844uploadRunToStravagIAlus(0L, this);
        return m6844uploadRunToStravagIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m6844uploadRunToStravagIAlus : Result.m7904boximpl(m6844uploadRunToStravagIAlus);
    }
}
