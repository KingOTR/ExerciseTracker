package com.example.rungps.data;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Repository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.Repository", f = "Repository.kt", i = {}, l = {1280}, m = "syncStravaActivitiesForRecoveryIfDue-0E7RQCE", n = {}, s = {})
/* loaded from: classes3.dex */
final class Repository$syncStravaActivitiesForRecoveryIfDue$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Repository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Repository$syncStravaActivitiesForRecoveryIfDue$1(Repository repository, Continuation<? super Repository$syncStravaActivitiesForRecoveryIfDue$1> continuation) {
        super(continuation);
        this.this$0 = repository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object m6839syncStravaActivitiesForRecoveryIfDue0E7RQCE = this.this$0.m6839syncStravaActivitiesForRecoveryIfDue0E7RQCE(0L, 0, this);
        return m6839syncStravaActivitiesForRecoveryIfDue0E7RQCE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m6839syncStravaActivitiesForRecoveryIfDue0E7RQCE : Result.m7904boximpl(m6839syncStravaActivitiesForRecoveryIfDue0E7RQCE);
    }
}
