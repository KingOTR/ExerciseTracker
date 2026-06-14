package com.example.rungps.data;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Repository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.Repository", f = "Repository.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2}, l = {2312, 2320, 2346, 2347}, m = "uploadRunToStravaAttempt", n = {"this", "run", HintConstants.AUTOFILL_HINT_NAME, "gpxType", "pts", "hrSamples", "access", "runId", "allowAuthRetry", "this", "run", HintConstants.AUTOFILL_HINT_NAME, "gpxType", "pts", "hrSamples", "access", "runId", "allowAuthRetry", "this", "run", HintConstants.AUTOFILL_HINT_NAME, "gpxType", "pts", "hrSamples", "runId"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "J$0"})
/* loaded from: classes3.dex */
final class Repository$uploadRunToStravaAttempt$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Repository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Repository$uploadRunToStravaAttempt$1(Repository repository, Continuation<? super Repository$uploadRunToStravaAttempt$1> continuation) {
        super(continuation);
        this.this$0 = repository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object uploadRunToStravaAttempt;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        uploadRunToStravaAttempt = this.this$0.uploadRunToStravaAttempt(0L, null, null, null, null, null, false, this);
        return uploadRunToStravaAttempt;
    }
}
