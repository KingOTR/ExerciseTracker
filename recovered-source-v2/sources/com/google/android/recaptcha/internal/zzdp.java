package com.google.android.recaptcha.internal;

import com.example.rungps.data.UserProfileStore;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
final class zzdp extends SuspendLambda implements Function2 {
    final /* synthetic */ zzdq zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzqt zzc;
    final /* synthetic */ zzdc zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdp(zzdq zzdqVar, String str, zzqt zzqtVar, zzdc zzdcVar, Continuation continuation) {
        super(2, continuation);
        this.zza = zzdqVar;
        this.zzb = str;
        this.zzc = zzqtVar;
        this.zzd = zzdcVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzdp(this.zza, this.zzb, this.zzc, this.zzd, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdp) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        zzdf zzf = this.zzd.zzf(22);
        zzqt zzqtVar = this.zzc;
        String str = this.zzb;
        try {
            int i = zzdt.zza;
            if (!zzdt.zzb(str)) {
                throw new zzbj(zzbh.zzc, zzbg.zzQ, null);
            }
            try {
                URLConnection openConnection = new URL(str).openConnection();
                Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT, "application/x-protobuffer");
                String encode = URLEncoder.encode(zzqtVar.zzL(), "UTF-8");
                String encode2 = URLEncoder.encode(zzqtVar.zzk(), "UTF-8");
                int zzS = zzqtVar.zzS();
                byte[] bytes = ("k=" + encode + "&pk=" + encode2 + "&mst=" + URLEncoder.encode(zzS != 2 ? zzS != 3 ? zzS != 4 ? zzS != 5 ? "UNRECOGNIZED" : "IOS" : "ANDROID_OFFPLAY" : "ANDROID_ONPLAY" : UserProfileStore.SEX_UNSPECIFIED, "UTF-8") + "&msv=" + URLEncoder.encode(zzqtVar.zzJ(), "UTF-8") + "&msi=" + URLEncoder.encode(zzqtVar.zzK(), "UTF-8") + "&mov=" + zzqtVar.zzj() + "&mkc=" + zzqtVar.zzi()).getBytes(Charset.forName("UTF-8"));
                try {
                    try {
                        zzdr.zza(httpURLConnection);
                        try {
                            zzdr.zzd(httpURLConnection).write(bytes);
                            if (httpURLConnection.getResponseCode() == 200) {
                                try {
                                    zzpq zzi = zzpq.zzi(zzdr.zzc(httpURLConnection));
                                    httpURLConnection.disconnect();
                                    zzf.zza();
                                    return zzi;
                                } catch (Exception unused) {
                                    throw new zzbj(zzbh.zzb, zzbg.zzG, null);
                                }
                            }
                            try {
                                int responseCode = httpURLConnection.getResponseCode();
                                byte[] readBytes = ByteStreamsKt.readBytes(httpURLConnection.getErrorStream());
                                if (responseCode != 400) {
                                    throw zzdr.zzb(responseCode);
                                }
                                zzrb zzg = zzrb.zzg(readBytes);
                                int i2 = zzbj.zza;
                                throw zzbi.zza(zzg.zzi());
                            } catch (Exception unused2) {
                                throw new zzbj(zzbh.zzc, zzbg.zzai, null);
                            }
                        } catch (IOException e) {
                            throw new zzbj(zzbh.zzc, zzbg.zzah, e.getMessage());
                        } catch (Exception e2) {
                            throw new zzbj(zzbh.zzc, zzbg.zzam, e2.getMessage());
                        }
                    } catch (Exception e3) {
                        if (e3 instanceof zzbj) {
                            throw ((zzbj) e3);
                        }
                        throw new zzbj(zzbh.zzc, zzbg.zzF, e3.getMessage());
                    }
                } catch (Throwable th) {
                    httpURLConnection.disconnect();
                    throw th;
                }
            } catch (Exception e4) {
                throw new zzbj(zzbh.zzc, zzbg.zzaj, e4.getMessage());
            }
        } catch (zzbj e5) {
            zzf.zzb(e5);
            throw e5;
        } catch (Exception e6) {
            zzbj zzbjVar = new zzbj(zzbh.zzb, zzbg.zza, e6.getMessage());
            zzf.zzb(zzbjVar);
            throw zzbjVar;
        }
    }
}
