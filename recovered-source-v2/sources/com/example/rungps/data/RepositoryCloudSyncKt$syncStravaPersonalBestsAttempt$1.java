package com.example.rungps.data;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RepositoryCloudSync.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.RepositoryCloudSyncKt", f = "RepositoryCloudSync.kt", i = {}, l = {35}, m = "syncStravaPersonalBestsAttempt", n = {}, s = {})
/* loaded from: classes3.dex */
final class RepositoryCloudSyncKt$syncStravaPersonalBestsAttempt$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    RepositoryCloudSyncKt$syncStravaPersonalBestsAttempt$1(Continuation<? super RepositoryCloudSyncKt$syncStravaPersonalBestsAttempt$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object syncStravaPersonalBestsAttempt;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        syncStravaPersonalBestsAttempt = RepositoryCloudSyncKt.syncStravaPersonalBestsAttempt(null, false, this);
        return syncStravaPersonalBestsAttempt == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? syncStravaPersonalBestsAttempt : Result.m7904boximpl(syncStravaPersonalBestsAttempt);
    }
}
