package com.example.rungps.data.repo;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GearRepository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.repo.GearRepository", f = "GearRepository.kt", i = {}, l = {30, 32}, m = "defaultGearIdForActivity", n = {}, s = {})
/* loaded from: classes3.dex */
final class GearRepository$defaultGearIdForActivity$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GearRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GearRepository$defaultGearIdForActivity$1(GearRepository gearRepository, Continuation<? super GearRepository$defaultGearIdForActivity$1> continuation) {
        super(continuation);
        this.this$0 = gearRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.defaultGearIdForActivity(null, this);
    }
}
