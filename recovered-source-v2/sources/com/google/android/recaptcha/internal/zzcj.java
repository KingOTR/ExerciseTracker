package com.google.android.recaptcha.internal;

import android.app.Application;
import android.os.Build;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
final class zzcj extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzdc zzd;
    final /* synthetic */ zzbl zze;
    final /* synthetic */ zzdq zzf;
    final /* synthetic */ zzbv zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcj(Application application, String str, zzdc zzdcVar, zzbl zzblVar, zzdq zzdqVar, zzbv zzbvVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = application;
        this.zzc = str;
        this.zzd = zzdcVar;
        this.zze = zzblVar;
        this.zzf = zzdqVar;
        this.zzg = zzbvVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzcj(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcj) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        ResultKt.throwOnFailure(obj);
        if (i == 0) {
            Application application = this.zzb;
            int i2 = zzbz.zza;
            String str = this.zzc;
            Application application2 = this.zzb;
            zzdc zzdcVar = this.zzd;
            zzbl zzblVar = this.zze;
            int zza = zzbz.zza(application);
            String packageName = application2.getPackageName();
            String zzd = zzdcVar.zzd();
            int i3 = Build.VERSION.SDK_INT;
            String zza2 = zzblVar.zza();
            zzqs zzf = zzqt.zzf();
            zzf.zzs(str);
            zzf.zzp(packageName);
            zzf.zzt(zza);
            zzf.zzq("18.5.1");
            zzf.zzr(zzd);
            zzf.zze(String.valueOf(i3));
            zzf.zzd(zza2);
            zzqt zzqtVar = (zzqt) zzf.zzj();
            zzdq zzdqVar = this.zzf;
            zzbv zzbvVar = this.zzg;
            zzdc zzdcVar2 = this.zzd;
            String zzb = zzbvVar.zzb();
            this.zza = 1;
            obj = zzdqVar.zza(zzb, zzqtVar, zzdcVar2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return obj;
    }
}
