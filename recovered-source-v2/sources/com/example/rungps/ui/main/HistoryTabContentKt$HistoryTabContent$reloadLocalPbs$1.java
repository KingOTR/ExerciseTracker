package com.example.rungps.ui.main;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HistoryTabContent.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.HistoryTabContentKt", f = "HistoryTabContent.kt", i = {0, 0, 0, 0, 1, 1}, l = {177, 178}, m = "HistoryTabContent$reloadLocalPbs", n = {"repo", "localPbRuns$delegate", "localRidePbs$delegate", "localPbs$delegate", "localPbRuns$delegate", "localPbs$delegate"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1"})
/* loaded from: classes3.dex */
final class HistoryTabContentKt$HistoryTabContent$reloadLocalPbs$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    HistoryTabContentKt$HistoryTabContent$reloadLocalPbs$1(Continuation<? super HistoryTabContentKt$HistoryTabContent$reloadLocalPbs$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object HistoryTabContent$reloadLocalPbs;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        HistoryTabContent$reloadLocalPbs = HistoryTabContentKt.HistoryTabContent$reloadLocalPbs(null, null, null, null, this);
        return HistoryTabContent$reloadLocalPbs;
    }
}
