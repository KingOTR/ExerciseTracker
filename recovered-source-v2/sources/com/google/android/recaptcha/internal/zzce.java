package com.google.android.recaptcha.internal;

import android.app.Application;
import android.webkit.WebView;
import androidx.core.content.ContextCompat;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
final class zzce extends SuspendLambda implements Function2 {
    int zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ Application zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzbv zzf;
    final /* synthetic */ zzbo zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzce(String str, Application application, long j, zzbv zzbvVar, WebView webView, zzdq zzdqVar, zzbo zzboVar, Continuation continuation) {
        super(2, continuation);
        this.zzc = str;
        this.zzd = application;
        this.zze = j;
        this.zzf = zzbvVar;
        this.zzg = zzboVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzce zzceVar = new zzce(this.zzc, this.zzd, this.zze, this.zzf, null, null, this.zzg, continuation);
        zzceVar.zzb = obj;
        return zzceVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzce) create((zzdc) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        ResultKt.throwOnFailure(obj);
        if (i == 0) {
            zzdc zzdcVar = (zzdc) this.zzb;
            zzcx zza = zzco.zza(zzco.zza, this.zzc);
            if (zza != null) {
                return zza;
            }
            Application application = this.zzd;
            if (this.zze < 5000) {
                throw new zzbj(zzbh.zzj, zzbg.zzI, null);
            }
            if (ContextCompat.checkSelfPermission(application, "android.permission.INTERNET") != 0) {
                throw new zzbj(zzbh.zzc, zzbg.zzap, null);
            }
            Application application2 = this.zzd;
            String str = this.zzc;
            long j = this.zze;
            zzbv zzbvVar = this.zzf;
            zzbo zzboVar = this.zzg;
            zzco zzcoVar = zzco.zza;
            this.zza = 1;
            obj = zzcoVar.zzm(application2, str, j, zzbvVar, null, null, zzboVar, zzdcVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return obj;
    }
}
