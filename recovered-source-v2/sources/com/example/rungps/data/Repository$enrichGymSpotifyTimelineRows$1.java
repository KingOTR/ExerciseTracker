package com.example.rungps.data;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Repository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.Repository", f = "Repository.kt", i = {0, 0, 1, 1, 1}, l = {1403, 1410}, m = "enrichGymSpotifyTimelineRows", n = {"this", "inWindow", "this", "inWindow", "updated"}, s = {"L$0", "L$1", "L$0", "L$1", "I$0"})
/* loaded from: classes3.dex */
final class Repository$enrichGymSpotifyTimelineRows$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Repository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Repository$enrichGymSpotifyTimelineRows$1(Repository repository, Continuation<? super Repository$enrichGymSpotifyTimelineRows$1> continuation) {
        super(continuation);
        this.this$0 = repository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object enrichGymSpotifyTimelineRows;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        enrichGymSpotifyTimelineRows = this.this$0.enrichGymSpotifyTimelineRows(null, null, this);
        return enrichGymSpotifyTimelineRows;
    }
}
