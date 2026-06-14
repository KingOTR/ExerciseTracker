package com.example.rungps.data;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RepositoryCloudSync.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.RepositoryCloudSyncKt", f = "RepositoryCloudSync.kt", i = {}, l = {29}, m = "syncStravaPersonalBestsImpl", n = {}, s = {})
/* loaded from: classes3.dex */
final class RepositoryCloudSyncKt$syncStravaPersonalBestsImpl$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    RepositoryCloudSyncKt$syncStravaPersonalBestsImpl$1(Continuation<? super RepositoryCloudSyncKt$syncStravaPersonalBestsImpl$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object syncStravaPersonalBestsImpl = RepositoryCloudSyncKt.syncStravaPersonalBestsImpl(null, this);
        return syncStravaPersonalBestsImpl == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? syncStravaPersonalBestsImpl : Result.m7904boximpl(syncStravaPersonalBestsImpl);
    }
}
