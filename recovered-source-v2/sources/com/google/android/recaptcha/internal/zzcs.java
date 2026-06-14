package com.google.android.recaptcha.internal;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
final class zzcs extends ContinuationImpl {
    Object zza;
    Object zzb;
    double zzc;
    /* synthetic */ Object zzd;
    final /* synthetic */ zzcx zze;
    int zzf;
    zzcx zzg;
    zzdf zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcs(zzcx zzcxVar, Continuation continuation) {
        super(continuation);
        this.zze = zzcxVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object zzg;
        this.zzd = obj;
        this.zzf |= Integer.MIN_VALUE;
        zzg = this.zze.zzg(null, 0L, this);
        return zzg == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? zzg : Result.m7904boximpl(zzg);
    }
}
