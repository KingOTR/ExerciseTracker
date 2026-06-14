package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.internal.zzaq;
import com.google.firebase.auth.zze;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzzk {
    private final zzaej zza;

    static /* synthetic */ void zza(zzzk zzzkVar, zzaht zzahtVar, zzade zzadeVar, zzaem zzaemVar) {
        if (!zzahtVar.zzo()) {
            zzzkVar.zza(new zzagl(zzahtVar.zzi(), zzahtVar.zze(), Long.valueOf(zzahtVar.zza()), "Bearer"), zzahtVar.zzh(), zzahtVar.zzg(), Boolean.valueOf(zzahtVar.zzn()), zzahtVar.zzb(), zzadeVar, zzaemVar);
            return;
        }
        zzadeVar.zza(new zzzi(zzahtVar.zzm() ? new Status(FirebaseError.ERROR_ACCOUNT_EXISTS_WITH_DIFFERENT_CREDENTIAL) : zzaq.zza(zzahtVar.zzd()), zzahtVar.zzb(), zzahtVar.zzc(), zzahtVar.zzj()));
    }

    static /* synthetic */ void zza(zzzk zzzkVar, zzade zzadeVar, zzahg zzahgVar, zzaem zzaemVar) {
        Preconditions.checkNotNull(zzadeVar);
        Preconditions.checkNotNull(zzahgVar);
        Preconditions.checkNotNull(zzaemVar);
        zzzkVar.zza.zza(zzahgVar, new zzaad(zzzkVar, zzadeVar, zzaemVar));
    }

    static /* synthetic */ void zza(zzzk zzzkVar, zzade zzadeVar, zzagl zzaglVar, zzahb zzahbVar, zzaem zzaemVar) {
        Preconditions.checkNotNull(zzadeVar);
        Preconditions.checkNotNull(zzaglVar);
        Preconditions.checkNotNull(zzahbVar);
        Preconditions.checkNotNull(zzaemVar);
        zzzkVar.zza.zza(new zzagc(zzaglVar.zzc()), new zzzq(zzzkVar, zzaemVar, zzadeVar, zzaglVar, zzahbVar));
    }

    static /* synthetic */ void zza(zzzk zzzkVar, zzade zzadeVar, zzagl zzaglVar, zzage zzageVar, zzahb zzahbVar, zzaem zzaemVar) {
        Preconditions.checkNotNull(zzadeVar);
        Preconditions.checkNotNull(zzaglVar);
        Preconditions.checkNotNull(zzageVar);
        Preconditions.checkNotNull(zzahbVar);
        Preconditions.checkNotNull(zzaemVar);
        zzzkVar.zza.zza(zzahbVar, new zzzt(zzzkVar, zzahbVar, zzageVar, zzadeVar, zzaglVar, zzaemVar));
    }

    public zzzk(zzaej zzaejVar) {
        this.zza = (zzaej) Preconditions.checkNotNull(zzaejVar);
    }

    public final void zza(String str, String str2, zzade zzadeVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzadeVar);
        zzahb zzahbVar = new zzahb();
        zzahbVar.zze(str);
        zzahbVar.zzh(str2);
        this.zza.zza(zzahbVar, new zzabe(this, zzadeVar));
    }

    public final void zzb(String str, String str2, zzade zzadeVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzadeVar);
        zza(str, new zzabc(this, str2, zzadeVar));
    }

    public final void zzc(String str, String str2, zzade zzadeVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzadeVar);
        zza(str, new zzabf(this, str2, zzadeVar));
    }

    public final void zzd(String str, String str2, zzade zzadeVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzadeVar);
        this.zza.zza(new zzagw(str, null, str2), new zzzx(this, zzadeVar));
    }

    public final void zza(zzagw zzagwVar, zzade zzadeVar) {
        Preconditions.checkNotEmpty(zzagwVar.zzb());
        Preconditions.checkNotNull(zzadeVar);
        this.zza.zza(zzagwVar, new zzzz(this, zzadeVar));
    }

    public final void zza(String str, String str2, String str3, String str4, zzade zzadeVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzadeVar);
        this.zza.zza(new zzahg(str, str2, null, str3, str4, null), new zzzm(this, zzadeVar));
    }

    public final void zza(String str, zzade zzadeVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzadeVar);
        zza(str, new zzaax(this, zzadeVar));
    }

    private final void zza(String str, zzael<zzagl> zzaelVar) {
        Preconditions.checkNotNull(zzaelVar);
        Preconditions.checkNotEmpty(str);
        zzagl zzb = zzagl.zzb(str);
        if (zzb.zzg()) {
            zzaelVar.zza((zzael<zzagl>) zzb);
        } else {
            this.zza.zza(new zzafz(zzb.zzd()), new zzabh(this, zzaelVar));
        }
    }

    public final void zza(zzafp zzafpVar, String str, zzade zzadeVar) {
        Preconditions.checkNotNull(zzafpVar);
        Preconditions.checkNotNull(zzadeVar);
        zza(str, new zzaap(this, zzafpVar, zzadeVar));
    }

    public final void zza(zzafr zzafrVar, zzade zzadeVar) {
        Preconditions.checkNotNull(zzafrVar);
        Preconditions.checkNotNull(zzadeVar);
        this.zza.zza(zzafrVar, new zzaar(this, zzadeVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzafn zzafnVar, zzade zzadeVar) {
        Preconditions.checkNotNull(zzafnVar);
        Preconditions.checkNotNull(zzadeVar);
        this.zza.zza(zzafnVar, new zzzr(this, zzadeVar));
    }

    public final void zzb(String str, zzade zzadeVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzadeVar);
        this.zza.zza(new zzafz(str), new zzzn(this, zzadeVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzagl zzaglVar, String str, String str2, Boolean bool, zze zzeVar, zzade zzadeVar, zzaem zzaemVar) {
        Preconditions.checkNotNull(zzaglVar);
        Preconditions.checkNotNull(zzaemVar);
        Preconditions.checkNotNull(zzadeVar);
        this.zza.zza(new zzagc(zzaglVar.zzc()), new zzzs(this, zzaemVar, str2, str, bool, zzeVar, zzadeVar, zzaglVar));
    }

    private final void zzd(zzagg zzaggVar, zzade zzadeVar) {
        Preconditions.checkNotNull(zzaggVar);
        Preconditions.checkNotNull(zzadeVar);
        this.zza.zza(zzaggVar, new zzaay(this, zzadeVar));
    }

    public final void zza(zzagi zzagiVar, zzade zzadeVar) {
        Preconditions.checkNotNull(zzagiVar);
        Preconditions.checkNotNull(zzadeVar);
        this.zza.zza(zzagiVar, new zzaas(this, zzadeVar));
    }

    public final void zze(String str, String str2, zzade zzadeVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzadeVar);
        this.zza.zza(new zzafm(str, str2), new zzzv(this, zzadeVar));
    }

    public final void zza(zzagj zzagjVar, zzade zzadeVar) {
        Preconditions.checkNotNull(zzagjVar);
        Preconditions.checkNotNull(zzadeVar);
        this.zza.zza(zzagjVar, new zzaat(this, zzadeVar));
    }

    public final void zza(String str, String str2, String str3, String str4, String str5, zzade zzadeVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzadeVar);
        zza(str3, new zzaaa(this, str, str2, str4, str5, zzadeVar));
    }

    public final void zza(String str, zzahr zzahrVar, zzade zzadeVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzahrVar);
        Preconditions.checkNotNull(zzadeVar);
        zza(str, new zzaae(this, zzahrVar, zzadeVar));
    }

    public final void zza(String str, zzaia zzaiaVar, zzade zzadeVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzaiaVar);
        Preconditions.checkNotNull(zzadeVar);
        zza(str, new zzaac(this, zzaiaVar, zzadeVar));
    }

    public final void zzc(String str, zzade zzadeVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzadeVar);
        zza(str, new zzaav(this, zzadeVar));
    }

    public final void zza(zzagy zzagyVar, zzade zzadeVar) {
        this.zza.zza(zzagyVar, new zzaba(this, zzadeVar));
    }

    public final void zza(zzagg zzaggVar, zzade zzadeVar) {
        Preconditions.checkNotEmpty(zzaggVar.zzd());
        Preconditions.checkNotNull(zzadeVar);
        zzd(zzaggVar, zzadeVar);
    }

    public final void zzb(zzagg zzaggVar, zzade zzadeVar) {
        Preconditions.checkNotEmpty(zzaggVar.zzc());
        Preconditions.checkNotNull(zzadeVar);
        this.zza.zza(zzaggVar, new zzzu(this, zzadeVar));
    }

    public final void zza(zzagz zzagzVar, zzade zzadeVar) {
        Preconditions.checkNotEmpty(zzagzVar.zzd());
        Preconditions.checkNotNull(zzadeVar);
        this.zza.zza(zzagzVar, new zzzy(this, zzadeVar));
    }

    public final void zzd(String str, zzade zzadeVar) {
        Preconditions.checkNotNull(zzadeVar);
        this.zza.zza(str, new zzaaz(this, zzadeVar));
    }

    public final void zze(String str, zzade zzadeVar) {
        Preconditions.checkNotNull(zzadeVar);
        this.zza.zza(new zzahg(str), new zzabb(this, zzadeVar));
    }

    public final void zza(zzahr zzahrVar, zzade zzadeVar) {
        Preconditions.checkNotNull(zzahrVar);
        Preconditions.checkNotNull(zzadeVar);
        zzahrVar.zzb(true);
        this.zza.zza(zzahrVar, new zzaan(this, zzadeVar));
    }

    public final void zza(zzahw zzahwVar, zzade zzadeVar) {
        Preconditions.checkNotNull(zzahwVar);
        Preconditions.checkNotNull(zzadeVar);
        this.zza.zza(zzahwVar, new zzzw(this, zzadeVar));
    }

    public final void zzb(String str, String str2, String str3, String str4, zzade zzadeVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzadeVar);
        this.zza.zza(new zzahy(str, str2, str3, str4), new zzzp(this, zzadeVar));
    }

    public final void zza(EmailAuthCredential emailAuthCredential, String str, zzade zzadeVar) {
        Preconditions.checkNotNull(emailAuthCredential);
        Preconditions.checkNotNull(zzadeVar);
        if (emailAuthCredential.zzg()) {
            zza(emailAuthCredential.zzb(), new zzzo(this, emailAuthCredential, str, zzadeVar));
        } else {
            zza(new zzafn(emailAuthCredential, null, str), zzadeVar);
        }
    }

    public final void zza(zzaia zzaiaVar, zzade zzadeVar) {
        Preconditions.checkNotNull(zzaiaVar);
        Preconditions.checkNotNull(zzadeVar);
        this.zza.zza(zzaiaVar, new zzaab(this, zzadeVar));
    }

    public final void zza(zzahi zzahiVar, zzade zzadeVar) {
        Preconditions.checkNotNull(zzahiVar);
        Preconditions.checkNotNull(zzadeVar);
        this.zza.zza(zzahiVar, new zzaam(this, zzahiVar, zzadeVar));
    }

    public final void zza(zzahk zzahkVar, zzade zzadeVar) {
        Preconditions.checkNotNull(zzahkVar);
        Preconditions.checkNotNull(zzadeVar);
        this.zza.zza(zzahkVar, new zzaaq(this, zzadeVar));
    }

    public final void zza(String str, String str2, String str3, zzade zzadeVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzadeVar);
        zza(str, new zzaal(this, str2, str3, zzadeVar));
    }

    public final void zzf(String str, zzade zzadeVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzadeVar);
        zza(str, new zzaag(this, zzadeVar));
    }

    public final void zzf(String str, String str2, zzade zzadeVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzadeVar);
        zza(str2, new zzaaj(this, str, zzadeVar));
    }

    public final void zza(String str, UserProfileChangeRequest userProfileChangeRequest, zzade zzadeVar) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(userProfileChangeRequest);
        Preconditions.checkNotNull(zzadeVar);
        zza(str, new zzabd(this, userProfileChangeRequest, zzadeVar));
    }

    public final void zzc(zzagg zzaggVar, zzade zzadeVar) {
        zzd(zzaggVar, zzadeVar);
    }
}
