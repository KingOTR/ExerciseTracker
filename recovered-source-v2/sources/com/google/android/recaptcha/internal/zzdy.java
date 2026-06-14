package com.google.android.recaptcha.internal;

import java.util.Arrays;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
final class zzdy extends SuspendLambda implements Function2 {
    final /* synthetic */ Exception zza;
    final /* synthetic */ zzek zzb;
    final /* synthetic */ zzea zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdy(Exception exc, zzek zzekVar, zzea zzeaVar, Continuation continuation) {
        super(2, continuation);
        this.zza = exc;
        this.zzb = zzekVar;
        this.zzc = zzeaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzdy zzdyVar = new zzdy(this.zza, this.zzb, this.zzc, continuation);
        zzdyVar.zzd = obj;
        return zzdyVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdy) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zzrh zzrhVar;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.zzd;
        Exception exc = this.zza;
        if (exc instanceof zzby) {
            zzrhVar = ((zzby) exc).zza();
            zzrhVar.zzd(this.zzb.zza());
        } else {
            zzek zzekVar = this.zzb;
            zzrh zzf = zzri.zzf();
            zzf.zzd(zzekVar.zza());
            zzf.zzq(2);
            zzf.zzp(2);
            zzrhVar = zzf;
        }
        zzri zzriVar = (zzri) zzrhVar.zzj();
        zzriVar.zzJ();
        zzriVar.zzk();
        Reflection.getOrCreateKotlinClass(this.zza.getClass()).getSimpleName();
        this.zza.getMessage();
        zzek zzekVar2 = this.zzb;
        zzbt zzb = zzekVar2.zzb();
        zzbt zzbtVar = zzekVar2.zza;
        if (zzbtVar == null) {
            zzbtVar = null;
        }
        zzoy zza = zzdn.zza(zzb, zzbtVar);
        String zzd = this.zzb.zzd();
        if (zzd.length() == 0) {
            zzd = "recaptcha.m.Main.rge";
        }
        if (CoroutineScopeKt.isActive(coroutineScope)) {
            zzea zzeaVar = this.zzc;
            zzhz zzh = zzhz.zzh();
            byte[] zzd2 = zzriVar.zzd();
            zzhz zzh2 = zzhz.zzh();
            byte[] zzd3 = zza.zzd();
            zzeaVar.zzb.zzd().zzb(zzd, (String[]) Arrays.copyOf(new String[]{zzh.zzi(zzd2, 0, zzd2.length), zzh2.zzi(zzd3, 0, zzd3.length)}, 2));
        }
        return Unit.INSTANCE;
    }
}
