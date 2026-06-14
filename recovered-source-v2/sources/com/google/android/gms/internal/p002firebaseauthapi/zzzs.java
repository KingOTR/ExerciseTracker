package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.zze;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzzs implements zzael<zzagb> {
    private final /* synthetic */ zzaem zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ Boolean zzd;
    private final /* synthetic */ zze zze;
    private final /* synthetic */ zzade zzf;
    private final /* synthetic */ zzagl zzg;

    zzzs(zzzk zzzkVar, zzaem zzaemVar, String str, String str2, Boolean bool, zze zzeVar, zzade zzadeVar, zzagl zzaglVar) {
        this.zza = zzaemVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bool;
        this.zze = zzeVar;
        this.zzf = zzadeVar;
        this.zzg = zzaglVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zza.zza(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final /* synthetic */ void zza(zzagb zzagbVar) {
        List<zzage> zza = zzagbVar.zza();
        if (zza == null || zza.isEmpty()) {
            this.zza.zza("No users.");
            return;
        }
        zzage zzageVar = zza.get(0);
        zzagu zzf = zzageVar.zzf();
        List<zzagr> zza2 = zzf != null ? zzf.zza() : null;
        if (zza2 != null && !zza2.isEmpty()) {
            if (TextUtils.isEmpty(this.zzb)) {
                zza2.get(0).zza(this.zzc);
            } else {
                int i = 0;
                while (true) {
                    if (i >= zza2.size()) {
                        break;
                    }
                    if (zza2.get(i).zzf().equals(this.zzb)) {
                        zza2.get(i).zza(this.zzc);
                        break;
                    }
                    i++;
                }
            }
        }
        Boolean bool = this.zzd;
        if (bool != null) {
            zzageVar.zza(bool.booleanValue());
        } else {
            zzageVar.zza(zzageVar.zzb() - zzageVar.zza() < 1000);
        }
        zzageVar.zza(this.zze);
        this.zzf.zza(this.zzg, zzageVar);
    }
}
