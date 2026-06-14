package com.example.rungps.data;

import com.example.rungps.tracking.TrackingService;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Repository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.Repository", f = "Repository.kt", i = {0, 0, 0}, l = {679, 681}, m = "setGymAmbientTagCustom", n = {"this", TrackingService.PLAN_CUSTOM, "sessionId"}, s = {"L$0", "L$1", "J$0"})
/* loaded from: classes3.dex */
final class Repository$setGymAmbientTagCustom$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Repository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Repository$setGymAmbientTagCustom$1(Repository repository, Continuation<? super Repository$setGymAmbientTagCustom$1> continuation) {
        super(continuation);
        this.this$0 = repository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.setGymAmbientTagCustom(0L, null, this);
    }
}
