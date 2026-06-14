package com.example.rungps.health;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SamsungHealthManager.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.health.SamsungHealthManager", f = "SamsungHealthManager.kt", i = {0}, l = {87}, m = "hasSubset", n = {"wanted"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class SamsungHealthManager$hasSubset$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SamsungHealthManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SamsungHealthManager$hasSubset$1(SamsungHealthManager samsungHealthManager, Continuation<? super SamsungHealthManager$hasSubset$1> continuation) {
        super(continuation);
        this.this$0 = samsungHealthManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object hasSubset;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        hasSubset = this.this$0.hasSubset(null, this);
        return hasSubset;
    }
}
