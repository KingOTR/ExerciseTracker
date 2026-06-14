package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.internal.zzaq;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzabd implements zzael<zzagl> {
    private final /* synthetic */ UserProfileChangeRequest zza;
    private final /* synthetic */ zzade zzb;
    private final /* synthetic */ zzzk zzc;

    zzabd(zzzk zzzkVar, UserProfileChangeRequest userProfileChangeRequest, zzade zzadeVar) {
        this.zza = userProfileChangeRequest;
        this.zzb = zzadeVar;
        this.zzc = zzzkVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zzb.zza(zzaq.zza(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final /* synthetic */ void zza(zzagl zzaglVar) {
        zzagl zzaglVar2 = zzaglVar;
        zzahb zzahbVar = new zzahb();
        zzahbVar.zzd(zzaglVar2.zzc());
        if (this.zza.zzb() || this.zza.getDisplayName() != null) {
            zzahbVar.zzb(this.zza.getDisplayName());
        }
        if (this.zza.zzc() || this.zza.getPhotoUri() != null) {
            zzahbVar.zzg(this.zza.zza());
        }
        zzzk.zza(this.zzc, this.zzb, zzaglVar2, zzahbVar, this);
    }
}
