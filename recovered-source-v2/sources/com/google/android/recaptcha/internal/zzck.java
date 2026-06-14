package com.google.android.recaptcha.internal;

import android.app.Application;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
final class zzck extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ Application zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzdc zze;
    final /* synthetic */ zzbl zzf;
    final /* synthetic */ zzdq zzg;
    final /* synthetic */ zzbv zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzck(long j, Application application, String str, zzdc zzdcVar, zzbl zzblVar, zzdq zzdqVar, zzbv zzbvVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = j;
        this.zzc = application;
        this.zzd = str;
        this.zze = zzdcVar;
        this.zzf = zzblVar;
        this.zzg = zzdqVar;
        this.zzh = zzbvVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzck(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzck) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zzbj zzbjVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            if (this.zza != 0) {
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                long j = this.zzb;
                zzcj zzcjVar = new zzcj(this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, null);
                this.zza = 1;
                obj = TimeoutKt.withTimeout(j, zzcjVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return (zzpq) obj;
        } catch (Exception e) {
            zzco zzcoVar = zzco.zza;
            if (e instanceof TimeoutCancellationException) {
                zzbjVar = new zzbj(zzbh.zzc, zzbg.zzb, e.getMessage());
            } else {
                if (e instanceof zzbj) {
                    throw ((zzbj) e);
                }
                zzbjVar = new zzbj(zzbh.zzb, zzbg.zza, e.getMessage());
            }
            throw zzbjVar;
        }
    }
}
