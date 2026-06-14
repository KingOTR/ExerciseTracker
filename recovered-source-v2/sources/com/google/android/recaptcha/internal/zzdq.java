package com.google.android.recaptcha.internal;

import androidx.browser.trusted.sharing.ShareTarget;
import com.google.android.recaptcha.RecaptchaException;
import com.google.common.net.HttpHeaders;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;
import kotlin.coroutines.Continuation;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzdq {
    private final zzav zza;

    public zzdq(zzav zzavVar, zzdo zzdoVar) {
        this.zza = zzavVar;
    }

    public final Object zza(String str, zzqt zzqtVar, zzdc zzdcVar, Continuation continuation) throws RecaptchaException {
        return CoroutineScopeKt.coroutineScope(new zzdp(this, str, zzqtVar, zzdcVar, null), continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String zzb(zzpq zzpqVar, zzdc zzdcVar) throws zzbj {
        String str;
        zzdf zzdfVar;
        try {
            String zzJ = zzpqVar.zzJ();
            String zzK = zzpqVar.zzK();
            boolean zzd = this.zza.zzd(zzK);
            zzdf zzdfVar2 = zzd;
            if (zzd == 1) {
                zzdf zzf = zzdcVar.zzf(25);
                try {
                    str = this.zza.zza(zzK);
                } catch (Exception unused) {
                    zzf.zzb(new zzbj(zzbh.zzk, zzbg.zzR, null));
                }
                if (str != null) {
                    zzf.zza();
                    zzdfVar = zzf;
                    if (str == null) {
                        try {
                            this.zza.zzb();
                            zzdf zzf2 = zzdcVar.zzf(23);
                            try {
                                try {
                                    URLConnection openConnection = new URL(zzJ).openConnection();
                                    Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                                    HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                                    httpURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
                                    httpURLConnection.setDoInput(true);
                                    httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT, "application/x-protobuffer");
                                    httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, "gzip");
                                    httpURLConnection.connect();
                                    if (httpURLConnection.getResponseCode() != 200) {
                                        throw new zzbj(zzbh.zzc, new zzbg(httpURLConnection.getResponseCode()), null);
                                    }
                                    try {
                                        str = TextStreamsKt.readText(Intrinsics.areEqual("gzip", httpURLConnection.getContentEncoding()) ? new InputStreamReader(new GZIPInputStream(httpURLConnection.getInputStream())) : new InputStreamReader(httpURLConnection.getInputStream()));
                                        zzf2.zza();
                                        zzdf zzf3 = zzdcVar.zzf(24);
                                        try {
                                            this.zza.zzc(zzK, str);
                                            zzf3.zza();
                                        } catch (Exception unused2) {
                                            zzf3.zzb(new zzbj(zzbh.zzk, zzbg.zzT, null));
                                        }
                                    } catch (Exception unused3) {
                                        throw new zzbj(zzbh.zzc, zzbg.zzP, null);
                                    }
                                } catch (Exception unused4) {
                                    throw new zzbj(zzbh.zzc, zzbg.zzO, null);
                                }
                            } catch (Exception unused5) {
                                throw new zzbj(zzbh.zzb, zzbg.zzN, null);
                            }
                        } catch (zzbj e) {
                            zzdfVar.zzb(e);
                            throw e;
                        }
                    }
                    return StringsKt.replace$default(zzpqVar.zzk(), "JAVASCRIPT_TAG", str, false, 4, (Object) null);
                }
                zzf.zzb(new zzbj(zzbh.zzk, zzbg.zzS, null));
                zzdfVar2 = zzf;
            }
            str = null;
            zzdfVar = zzdfVar2;
            if (str == null) {
            }
            return StringsKt.replace$default(zzpqVar.zzk(), "JAVASCRIPT_TAG", str, false, 4, (Object) null);
        } catch (Exception e2) {
            if (e2 instanceof zzbj) {
                throw e2;
            }
            throw new zzbj(zzbh.zzb, zzbg.zzL, null);
        }
    }
}
