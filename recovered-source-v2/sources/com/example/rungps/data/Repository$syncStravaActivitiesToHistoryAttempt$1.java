package com.example.rungps.data;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Repository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.Repository", f = "Repository.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5}, l = {1045, 1062, 1063, 1072, 1083, 1108, 1109}, m = "syncStravaActivitiesToHistoryAttempt-BWLJW6A", n = {"this", "fullHistory", "maxPages", "allowAuthRetry", "this", "prefs", "activities", "fullHistory", "maxPages", "allowAuthRetry", "this", "prefs", "activities", "linked", "fullHistory", "maxPages", "allowAuthRetry", "this", "prefs", "activities", "linked", "localRuns", "dem", "fullHistory", "maxPages", "allowAuthRetry", "runsImported", "ridesImported", "linkedSkipped", "duplicateSkipped", "alreadyStored", "rejected", "this", "prefs", "activities", "linked", "dem", "fullHistory", "maxPages", "allowAuthRetry", "runsImported", "ridesImported", "linkedSkipped", "duplicateSkipped", "alreadyStored", "rejected", "this", "fullHistory", "maxPages"}, s = {"L$0", "Z$0", "I$0", "Z$1", "L$0", "L$1", "L$2", "Z$0", "I$0", "Z$1", "L$0", "L$1", "L$2", "L$3", "Z$0", "I$0", "Z$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0", "I$0", "Z$1", "I$1", "I$2", "I$3", "I$4", "I$5", "I$6", "L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "I$0", "Z$1", "I$1", "I$2", "I$3", "I$4", "I$5", "I$6", "L$0", "Z$0", "I$0"})
/* loaded from: classes3.dex */
final class Repository$syncStravaActivitiesToHistoryAttempt$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    int I$5;
    int I$6;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    boolean Z$0;
    boolean Z$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Repository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Repository$syncStravaActivitiesToHistoryAttempt$1(Repository repository, Continuation<? super Repository$syncStravaActivitiesToHistoryAttempt$1> continuation) {
        super(continuation);
        this.this$0 = repository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m6837syncStravaActivitiesToHistoryAttemptBWLJW6A;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m6837syncStravaActivitiesToHistoryAttemptBWLJW6A = this.this$0.m6837syncStravaActivitiesToHistoryAttemptBWLJW6A(false, 0, false, this);
        return m6837syncStravaActivitiesToHistoryAttemptBWLJW6A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m6837syncStravaActivitiesToHistoryAttemptBWLJW6A : Result.m7904boximpl(m6837syncStravaActivitiesToHistoryAttemptBWLJW6A);
    }
}
