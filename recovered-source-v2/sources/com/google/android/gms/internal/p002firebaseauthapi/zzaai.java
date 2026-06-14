package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.internal.zzaq;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaai implements zzael<zzagb> {
    private final /* synthetic */ zzael zza;
    private final /* synthetic */ zzagl zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ zzade zzd;
    private final /* synthetic */ zzaaj zze;

    zzaai(zzaaj zzaajVar, zzael zzaelVar, zzagl zzaglVar, String str, zzade zzadeVar) {
        this.zza = zzaelVar;
        this.zzb = zzaglVar;
        this.zzc = str;
        this.zzd = zzadeVar;
        this.zze = zzaajVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zzd.zza(zzaq.zza(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final /* synthetic */ void zza(zzagb zzagbVar) {
        List<zzage> zza = zzagbVar.zza();
        if (zza == null || zza.isEmpty()) {
            this.zza.zza("No users.");
            return;
        }
        zzage zzageVar = zza.get(0);
        zzahb zzahbVar = new zzahb();
        zzahbVar.zzd(this.zzb.zzc()).zza(this.zzc);
        zzzk.zza(this.zze.zza, this.zzd, this.zzb, zzageVar, zzahbVar, this.zza);
    }
}
