package com.google.android.recaptcha.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
final class zzq extends ContinuationImpl {
    /* synthetic */ Object zza;
    final /* synthetic */ zzx zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzq(zzx zzxVar, Continuation continuation) {
        super(continuation);
        this.zzb = zzxVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object zzu;
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        zzu = this.zzb.zzu(null, null, this);
        return zzu;
    }
}
