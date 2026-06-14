package com.example.rungps.data.repo;

import com.example.rungps.data.GearEntity;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GearRepository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.repo.GearRepository", f = "GearRepository.kt", i = {}, l = {51, 53}, m = "totalKm", n = {}, s = {})
/* loaded from: classes3.dex */
final class GearRepository$totalKm$2 extends ContinuationImpl {
    double D$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GearRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GearRepository$totalKm$2(GearRepository gearRepository, Continuation<? super GearRepository$totalKm$2> continuation) {
        super(continuation);
        this.this$0 = gearRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.totalKm((GearEntity) null, this);
    }
}
