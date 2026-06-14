package com.example.rungps.health;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SamsungHealthManager.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.health.SamsungHealthManager", f = "SamsungHealthManager.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2}, l = {131, 134, 141, 146}, m = "ensurePermissionSet", n = {"this", "activity", "wanted", "store", "have", "this", "activity", "need", "this", "activity", "need"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
/* loaded from: classes3.dex */
final class SamsungHealthManager$ensurePermissionSet$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SamsungHealthManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SamsungHealthManager$ensurePermissionSet$1(SamsungHealthManager samsungHealthManager, Continuation<? super SamsungHealthManager$ensurePermissionSet$1> continuation) {
        super(continuation);
        this.this$0 = samsungHealthManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object ensurePermissionSet;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        ensurePermissionSet = this.this$0.ensurePermissionSet(null, null, this);
        return ensurePermissionSet;
    }
}
