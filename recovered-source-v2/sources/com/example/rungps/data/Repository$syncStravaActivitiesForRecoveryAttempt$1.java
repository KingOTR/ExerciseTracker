package com.example.rungps.data;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Repository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.Repository", f = "Repository.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6}, l = {1160, 1163, 1164, 1188, 1189, 1194, 1222, 1223}, m = "syncStravaActivitiesForRecoveryAttempt-BWLJW6A", n = {"this", "daysBack", "forceReimport", "allowAuthRetry", "this", "access", "daysBack", "forceReimport", "allowAuthRetry", "cutoffMs", "nowMs", "this", "access", "linked", "daysBack", "forceReimport", "allowAuthRetry", "cutoffMs", "nowMs", "this", "linked", "activities", "inWindow", "dem", "plan", "daysBack", "forceReimport", "allowAuthRetry", "nowMs", "inserted", "linkedSkipped", "alreadyStored", "refreshed", "planRejected", "this", "linked", "activities", "inWindow", "dem", "plan", "daysBack", "forceReimport", "allowAuthRetry", "nowMs", "inserted", "linkedSkipped", "alreadyStored", "refreshed", "planRejected", "hadRow", "this", "linked", "activities", "inWindow", "dem", "daysBack", "forceReimport", "allowAuthRetry", "nowMs", "inserted", "linkedSkipped", "alreadyStored", "refreshed", "planRejected", "this", "daysBack", "forceReimport"}, s = {"L$0", "I$0", "Z$0", "Z$1", "L$0", "L$1", "I$0", "Z$0", "Z$1", "J$0", "J$1", "L$0", "L$1", "L$2", "I$0", "Z$0", "Z$1", "J$0", "J$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "I$0", "Z$0", "Z$1", "J$0", "I$1", "I$2", "I$3", "I$4", "I$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "I$0", "Z$0", "Z$1", "J$0", "I$1", "I$2", "I$3", "I$4", "I$5", "Z$2", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "Z$0", "Z$1", "J$0", "I$1", "I$2", "I$3", "I$4", "I$5", "L$0", "I$0", "Z$0"})
/* loaded from: classes3.dex */
final class Repository$syncStravaActivitiesForRecoveryAttempt$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    int I$5;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    boolean Z$0;
    boolean Z$1;
    boolean Z$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Repository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Repository$syncStravaActivitiesForRecoveryAttempt$1(Repository repository, Continuation<? super Repository$syncStravaActivitiesForRecoveryAttempt$1> continuation) {
        super(continuation);
        this.this$0 = repository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m6834syncStravaActivitiesForRecoveryAttemptBWLJW6A;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m6834syncStravaActivitiesForRecoveryAttemptBWLJW6A = this.this$0.m6834syncStravaActivitiesForRecoveryAttemptBWLJW6A(0, false, false, this);
        return m6834syncStravaActivitiesForRecoveryAttemptBWLJW6A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m6834syncStravaActivitiesForRecoveryAttemptBWLJW6A : Result.m7904boximpl(m6834syncStravaActivitiesForRecoveryAttemptBWLJW6A);
    }
}
