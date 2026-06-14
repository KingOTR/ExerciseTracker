package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.PhoneAuthCredential;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaaf implements zzael<zzahz> {
    private final /* synthetic */ zzade zza;
    private final /* synthetic */ zzael zzb;
    private final /* synthetic */ zzaac zzc;

    zzaaf(zzaac zzaacVar, zzade zzadeVar, zzael zzaelVar) {
        this.zza = zzadeVar;
        this.zzb = zzaelVar;
        this.zzc = zzaacVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zzb.zza(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final /* synthetic */ void zza(zzahz zzahzVar) {
        zzahz zzahzVar2 = zzahzVar;
        if (!TextUtils.isEmpty(zzahzVar2.zze())) {
            this.zza.zza(new Status(FirebaseError.ERROR_CREDENTIAL_ALREADY_IN_USE), PhoneAuthCredential.zzb(zzahzVar2.zzc(), zzahzVar2.zze()));
        } else {
            this.zzc.zza.zza(new zzagl(zzahzVar2.zzd(), zzahzVar2.zzb(), Long.valueOf(zzahzVar2.zza()), "Bearer"), null, "phone", Boolean.valueOf(zzahzVar2.zzf()), null, this.zza, this.zzb);
        }
    }
}
