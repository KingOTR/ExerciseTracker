package com.example.rungps.data;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Repository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.Repository", f = "Repository.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3}, l = {396, 396, 397, 397, 398}, m = "importCloudRoute", n = {"this", "remoteId", HintConstants.AUTOFILL_HINT_NAME, "latLon", "dedupeKey", "dist", "this", "remoteId", HintConstants.AUTOFILL_HINT_NAME, "latLon", "dedupeKey", "dist", "this", "remoteId", HintConstants.AUTOFILL_HINT_NAME, "latLon", "dedupeKey", "dist", "this", "remoteId", HintConstants.AUTOFILL_HINT_NAME, "latLon", "dedupeKey", "dist"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "D$0", "L$0", "L$1", "L$2", "L$3", "L$4", "D$0", "L$0", "L$1", "L$2", "L$3", "L$4", "D$0", "L$0", "L$1", "L$2", "L$3", "L$4", "D$0"})
/* loaded from: classes3.dex */
final class Repository$importCloudRoute$1 extends ContinuationImpl {
    double D$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Repository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Repository$importCloudRoute$1(Repository repository, Continuation<? super Repository$importCloudRoute$1> continuation) {
        super(continuation);
        this.this$0 = repository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.importCloudRoute(null, null, null, this);
    }
}
