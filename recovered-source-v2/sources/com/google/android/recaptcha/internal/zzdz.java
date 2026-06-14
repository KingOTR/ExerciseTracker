package com.google.android.recaptcha.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
final class zzdz extends SuspendLambda implements Function2 {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzek zzd;
    final /* synthetic */ zzea zze;
    final /* synthetic */ String zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdz(zzek zzekVar, zzea zzeaVar, String str, Continuation continuation) {
        super(2, continuation);
        this.zzd = zzekVar;
        this.zze = zzeaVar;
        this.zzf = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzdz(this.zzd, this.zze, this.zzf, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdz) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
    
        if (r6 != r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object zzh;
        zzge zzgeVar;
        Object zzg;
        Object obj2;
        Object obj3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zzc;
        try {
        } catch (Exception e) {
            zzea zzeaVar = this.zze;
            zzek zzekVar = this.zzd;
            this.zza = null;
            this.zzb = null;
            this.zzc = 2;
            zzh = zzeaVar.zzh(e, zzekVar, this);
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.zzd.zza = new zzbt();
            zzro zzi = zzro.zzi(zzhz.zzh().zzj(this.zzf));
            zzi.zzf();
            zzgeVar = this.zze.zzc;
            zzrg zza = zzgeVar.zza(zzi);
            zzgz zzb = zzgz.zzb();
            zzea zzeaVar2 = this.zze;
            List zzi2 = zza.zzi();
            zzek zzekVar2 = this.zzd;
            this.zza = zzi;
            this.zzb = zzb;
            this.zzc = 1;
            zzg = zzeaVar2.zzg(zzi2, zzekVar2, this);
            if (zzg != coroutine_suspended) {
                obj2 = zzi;
                obj3 = zzb;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        obj3 = this.zzb;
        obj2 = this.zza;
        ResultKt.throwOnFailure(obj);
        ((zzgz) obj3).zzf();
        Boxing.boxLong(((zzgz) obj3).zza(TimeUnit.MICROSECONDS));
        ((zzro) obj2).zzf();
        return Unit.INSTANCE;
    }
}
