package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.internal.zzaq;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaam implements zzael<zzahh> {
    private final /* synthetic */ zzahi zza;
    private final /* synthetic */ zzade zzb;

    zzaam(zzzk zzzkVar, zzahi zzahiVar, zzade zzadeVar) {
        this.zza = zzahiVar;
        this.zzb = zzadeVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zzb.zza(zzaq.zza(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final /* synthetic */ void zza(zzahh zzahhVar) {
        zzahh zzahhVar2 = zzahhVar;
        zzahi zzahiVar = this.zza;
        if (zzahiVar instanceof zzahm) {
            this.zzb.zzb(zzahhVar2.zza());
        } else if (zzahiVar instanceof zzaho) {
            this.zzb.zza(zzahhVar2);
        } else {
            throw new IllegalArgumentException("startMfaEnrollmentRequest must be an instance of either StartPhoneMfaEnrollmentRequest or StartTotpMfaEnrollmentRequest but was " + this.zza.getClass().getName() + ".");
        }
    }
}
