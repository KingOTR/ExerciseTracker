package com.google.android.recaptcha.internal;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
final class zzgs extends ContinuationImpl {
    /* synthetic */ Object zza;
    final /* synthetic */ zzgv zzb;
    int zzc;
    zzgv zzd;
    String zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgs(zzgv zzgvVar, Continuation continuation) {
        super(continuation);
        this.zzb = zzgvVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object zzf = this.zzb.zzf(null, this);
        return zzf == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? zzf : Result.m7904boximpl(zzf);
    }
}
