package com.google.android.recaptcha.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
final class zzgr extends SuspendLambda implements Function2 {
    final /* synthetic */ zzgv zza;
    final /* synthetic */ zzpq zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgr(zzgv zzgvVar, zzpq zzpqVar, Continuation continuation) {
        super(2, continuation);
        this.zza = zzgvVar;
        this.zzb = zzpqVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzgr(this.zza, this.zzb, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgr) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zzdc zzdcVar;
        zzbo zzboVar;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            zzgv zzgvVar = this.zza;
            zzdq zzp = zzgvVar.zzp();
            zzpq zzpqVar = this.zzb;
            zzdcVar = zzgvVar.zzl;
            String zzb = zzp.zzb(zzpqVar, zzdcVar);
            zzboVar = this.zza.zzn;
            BuildersKt__Builders_commonKt.launch$default(zzboVar.zzb(), null, null, new zzgq(this.zza, zzb, null), 3, null);
        } catch (zzbj e) {
            this.zza.zzu().completeExceptionally(e);
        }
        return Unit.INSTANCE;
    }
}
