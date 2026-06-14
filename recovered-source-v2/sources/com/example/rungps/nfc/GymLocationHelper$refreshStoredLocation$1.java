package com.example.rungps.nfc;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GymLocationHelper.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.nfc.GymLocationHelper", f = "GymLocationHelper.kt", i = {0}, l = {21}, m = "refreshStoredLocation", n = {"context"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class GymLocationHelper$refreshStoredLocation$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GymLocationHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GymLocationHelper$refreshStoredLocation$1(GymLocationHelper gymLocationHelper, Continuation<? super GymLocationHelper$refreshStoredLocation$1> continuation) {
        super(continuation);
        this.this$0 = gymLocationHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.refreshStoredLocation(null, this);
    }
}
