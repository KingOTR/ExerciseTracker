package com.example.rungps.strava;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: StravaHistoryImporter.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.strava.StravaHistoryImporter", f = "StravaHistoryImporter.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 5}, l = {30, 46, 47, 57, 60, 61}, m = "importActivity", n = {"runRepo", "activity", "localRuns", "demographics", "recordRecovery", "runRepo", "activity", "recordRecovery", "plan", "runRepo", "activity", "recordRecovery", "plan", "runId", "runRepo", "activity", "recordRecovery", "plan", "runId", "recordRecovery", "plan", "plan"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "L$1", "L$0"})
/* loaded from: classes3.dex */
final class StravaHistoryImporter$importActivity$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StravaHistoryImporter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StravaHistoryImporter$importActivity$1(StravaHistoryImporter stravaHistoryImporter, Continuation<? super StravaHistoryImporter$importActivity$1> continuation) {
        super(continuation);
        this.this$0 = stravaHistoryImporter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.importActivity(null, null, null, null, null, null, this);
    }
}
