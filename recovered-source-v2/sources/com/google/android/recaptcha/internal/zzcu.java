package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import com.google.common.net.HttpHeaders;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
final class zzcu extends SuspendLambda implements Function2 {
    final /* synthetic */ zzdc zza;
    final /* synthetic */ zzcx zzb;
    final /* synthetic */ RecaptchaAction zzc;
    final /* synthetic */ zzpw zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcu(zzdc zzdcVar, zzcx zzcxVar, RecaptchaAction recaptchaAction, zzpw zzpwVar, Continuation continuation) {
        super(2, continuation);
        this.zza = zzdcVar;
        this.zzb = zzcxVar;
        this.zzc = recaptchaAction;
        this.zzd = zzpwVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzcu(this.zza, this.zzb, this.zzc, this.zzd, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcu) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zzpq zzpqVar;
        zzpq zzpqVar2;
        zzbv zzbvVar;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        zzdf zzf = this.zza.zzf(28);
        zzqc zzf2 = zzqd.zzf();
        zzcx zzcxVar = this.zzb;
        zzf2.zzu(zzcxVar.zze());
        zzf2.zzd(this.zzc.getAction());
        zzpqVar = zzcxVar.zzf;
        zzf2.zzp(zzpqVar.zzL());
        zzpqVar2 = zzcxVar.zzf;
        zzf2.zzq(zzpqVar2.zzK());
        zzpw zzpwVar = this.zzd;
        zzf2.zzs(zzpwVar.zzJ());
        zzf2.zze(zzpwVar.zzj());
        zzf2.zzr(zzpwVar.zzK());
        zzf2.zzt(zzpwVar);
        zzqd zzqdVar = (zzqd) zzf2.zzj();
        try {
            zzbvVar = this.zzb.zze;
            try {
                int i = zzdt.zza;
                if (!zzdt.zzb(zzbvVar.zzd())) {
                    throw new zzbj(zzbh.zzc, zzbg.zzQ, null);
                }
                URLConnection openConnection = new URL(zzbvVar.zzd()).openConnection();
                Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/x-protobuffer");
                httpURLConnection.connect();
                httpURLConnection.getOutputStream().write(zzqdVar.zzd());
                if (httpURLConnection.getResponseCode() != 200) {
                    throw zzdr.zzb(httpURLConnection.getResponseCode());
                }
                try {
                    zzqf zzi = zzqf.zzi(httpURLConnection.getInputStream());
                    zzf.zza();
                    return zzi;
                } catch (Exception unused) {
                    throw new zzbj(zzbh.zzb, zzbg.zzG, null);
                }
            } catch (Exception e) {
                if (e instanceof zzbj) {
                    throw ((zzbj) e);
                }
                throw new zzbj(zzbh.zzc, zzbg.zzF, null);
            }
        } catch (Exception e2) {
            zzbj zzbjVar = e2 instanceof zzbj ? (zzbj) e2 : new zzbj(zzbh.zzb, zzbg.zzZ, null);
            zzf.zzb(zzbjVar);
            throw zzbjVar;
        }
    }
}
