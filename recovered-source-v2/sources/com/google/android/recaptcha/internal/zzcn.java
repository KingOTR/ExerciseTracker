package com.google.android.recaptcha.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
final class zzcn extends ContinuationImpl {
    /* synthetic */ Object zza;
    final /* synthetic */ zzco zzb;
    int zzc;
    zzdf zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcn(zzco zzcoVar, Continuation continuation) {
        super(continuation);
        this.zzb = zzcoVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object zzi;
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        zzi = this.zzb.zzi(null, null, null, this);
        return zzi;
    }
}
