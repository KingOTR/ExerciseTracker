package com.google.android.recaptcha.internal;

import android.webkit.JavascriptInterface;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzgo {
    final /* synthetic */ zzgv zza;
    private Long zzb;
    private final zzgz zzc = zzgz.zzb();

    public zzgo(zzgv zzgvVar) {
        this.zza = zzgvVar;
    }

    private final void zzb() {
        if (this.zzb == null) {
            this.zzc.zzf();
            this.zzb = Long.valueOf(this.zzc.zza(TimeUnit.MILLISECONDS));
        }
    }

    public final Long zza() {
        return this.zzb;
    }

    @JavascriptInterface
    public final void zzlce(String str) {
        zzdc zzdcVar;
        zzdf zzdfVar;
        zzgv zzgvVar = this.zza;
        if (zzgvVar.zzq().zzb == null) {
            zzdfVar = zzgvVar.zzm;
            if (zzdfVar != null) {
                zzdfVar.zza();
            }
            this.zza.zzm = null;
        }
        zzb();
        zzop zzJ = zzop.zzJ(zzhz.zzh().zzj(str));
        zzrd zzi = zzre.zzi();
        zzi.zze(zzJ);
        zzre zzreVar = (zzre) zzi.zzj();
        zzdcVar = this.zza.zzl;
        zzdcVar.zze(zzreVar);
    }

    @JavascriptInterface
    public final void zzlsm(String str) {
        zzdc zzdcVar;
        zzb();
        zzrd zzi = zzre.zzi();
        zzi.zzp(zzpe.zzi(zzhz.zzh().zzj(str)));
        zzre zzreVar = (zzre) zzi.zzj();
        zzdcVar = this.zza.zzl;
        zzdcVar.zze(zzreVar);
    }

    @JavascriptInterface
    public final void zzoid(String str) {
        zzb();
        zzqz zzg = zzqz.zzg(zzhz.zzh().zzj(str));
        zzg.zzi().name();
        if (zzg.zzi() == zzrc.JS_CODE_SUCCESS) {
            this.zza.zzu().hashCode();
            if (this.zza.zzu().complete(Unit.INSTANCE)) {
                return;
            }
            this.zza.zzu().hashCode();
            return;
        }
        zzg.zzi().name();
        int i = zzbj.zza;
        zzbj zza = zzbi.zza(zzg.zzi());
        this.zza.zzu().hashCode();
        this.zza.zzu().completeExceptionally(zza);
    }

    @JavascriptInterface
    public final void zzrp(String str) {
        zzb();
        zzdv zzdvVar = this.zza.zzb;
        if (zzdvVar == null) {
            zzdvVar = null;
        }
        zzdvVar.zza(str);
    }

    @JavascriptInterface
    public final void zzscd(String str) {
        Map map;
        zzb();
        zzpw zzi = zzpw.zzi(zzhz.zzh().zzj(str));
        zzi.toString();
        map = this.zza.zzi;
        CompletableDeferred completableDeferred = (CompletableDeferred) map.remove(zzi.zzk());
        if (completableDeferred != null) {
            completableDeferred.complete(zzi);
        }
    }
}
