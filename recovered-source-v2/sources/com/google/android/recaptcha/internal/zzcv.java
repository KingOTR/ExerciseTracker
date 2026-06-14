package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
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
final class zzcv extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzdc zzc;
    final /* synthetic */ zzcx zzd;
    final /* synthetic */ RecaptchaAction zze;
    final /* synthetic */ zzpw zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcv(long j, zzdc zzdcVar, zzcx zzcxVar, RecaptchaAction recaptchaAction, zzpw zzpwVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = j;
        this.zzc = zzdcVar;
        this.zzd = zzcxVar;
        this.zze = recaptchaAction;
        this.zzf = zzpwVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzcv(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcv) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            if (this.zza != 0) {
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                long j = this.zzb;
                zzcu zzcuVar = new zzcu(this.zzc, this.zzd, this.zze, this.zzf, null);
                this.zza = 1;
                obj = TimeoutKt.withTimeout(j, zzcuVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return (zzqf) obj;
        } catch (zzbj e) {
            throw e;
        } catch (TimeoutCancellationException unused) {
            throw new zzbj(zzbh.zzc, zzbg.zzb, null);
        } catch (Exception unused2) {
            throw new zzbj(zzbh.zzb, zzbg.zza, null);
        }
    }
}
