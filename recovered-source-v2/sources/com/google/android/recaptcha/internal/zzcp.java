package com.google.android.recaptcha.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
final class zzcp extends ContinuationImpl {
    /* synthetic */ Object zza;
    final /* synthetic */ zzcx zzb;
    int zzc;
    zzdf zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcp(zzcx zzcxVar, Continuation continuation) {
        super(continuation);
        this.zzb = zzcxVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object zzf;
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        zzf = this.zzb.zzf(0L, null, null, this);
        return zzf;
    }
}
