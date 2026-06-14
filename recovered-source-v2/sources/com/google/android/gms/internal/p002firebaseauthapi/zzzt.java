package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzzt implements zzael<zzahe> {
    private final /* synthetic */ zzahb zza;
    private final /* synthetic */ zzage zzb;
    private final /* synthetic */ zzade zzc;
    private final /* synthetic */ zzagl zzd;
    private final /* synthetic */ zzaem zze;
    private final /* synthetic */ zzzk zzf;

    zzzt(zzzk zzzkVar, zzahb zzahbVar, zzage zzageVar, zzade zzadeVar, zzagl zzaglVar, zzaem zzaemVar) {
        this.zza = zzahbVar;
        this.zzb = zzageVar;
        this.zzc = zzadeVar;
        this.zzd = zzaglVar;
        this.zze = zzaemVar;
        this.zzf = zzzkVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zze.zza(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final /* synthetic */ void zza(zzahe zzaheVar) {
        zzahe zzaheVar2 = zzaheVar;
        if (this.zza.zzi("EMAIL")) {
            this.zzb.zzb(null);
        } else if (this.zza.zzc() != null) {
            this.zzb.zzb(this.zza.zzc());
        }
        if (this.zza.zzi("DISPLAY_NAME")) {
            this.zzb.zza((String) null);
        } else if (this.zza.zzb() != null) {
            this.zzb.zza(this.zza.zzb());
        }
        if (this.zza.zzi("PHOTO_URL")) {
            this.zzb.zzc(null);
        } else if (this.zza.zze() != null) {
            this.zzb.zzc(this.zza.zze());
        }
        if (!TextUtils.isEmpty(this.zza.zzd())) {
            Preconditions.checkNotEmpty(Base64Utils.encode("redacted".getBytes()));
        }
        if (this.zza.zzi("delete_passkey")) {
            this.zzb.zza(zzal.zzh());
        }
        List<zzagr> zze = zzaheVar2.zze();
        if (zze == null) {
            zze = new ArrayList<>();
        }
        this.zzb.zza(zze);
        zzade zzadeVar = this.zzc;
        zzagl zzaglVar = this.zzd;
        Preconditions.checkNotNull(zzaglVar);
        Preconditions.checkNotNull(zzaheVar2);
        String zzc = zzaheVar2.zzc();
        String zzd = zzaheVar2.zzd();
        if (!TextUtils.isEmpty(zzc) && !TextUtils.isEmpty(zzd)) {
            zzaglVar = new zzagl(zzd, zzc, Long.valueOf(zzaheVar2.zza()), zzaglVar.zze());
        }
        zzadeVar.zza(zzaglVar, this.zzb);
    }
}
