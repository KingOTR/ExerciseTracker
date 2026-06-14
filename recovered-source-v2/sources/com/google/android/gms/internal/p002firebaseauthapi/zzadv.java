package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseApp;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzadv extends zzaej implements zzafd {
    private zzadp zza;
    private zzado zzb;
    private zzaes zzc;
    private final zzads zzd;
    private final FirebaseApp zze;
    private String zzf;
    private zzadu zzg;

    private final zzadu zzb() {
        if (this.zzg == null) {
            this.zzg = new zzadu(this.zze, this.zzd.zzb());
        }
        return this.zzg;
    }

    zzadv(FirebaseApp firebaseApp, zzads zzadsVar) {
        this(firebaseApp, zzadsVar, null, null, null);
    }

    private zzadv(FirebaseApp firebaseApp, zzads zzadsVar, zzaes zzaesVar, zzadp zzadpVar, zzado zzadoVar) {
        this.zze = firebaseApp;
        this.zzf = firebaseApp.getOptions().getApiKey();
        this.zzd = (zzads) Preconditions.checkNotNull(zzadsVar);
        zza(null, null, null);
        zzafb.zza(this.zzf, this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzafm zzafmVar, zzael<zzafl> zzaelVar) {
        Preconditions.checkNotNull(zzafmVar);
        Preconditions.checkNotNull(zzaelVar);
        zzadp zzadpVar = this.zza;
        zzaeo.zza(zzadpVar.zza("/createAuthUri", this.zzf), zzafmVar, zzaelVar, zzafl.class, zzadpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzafo zzafoVar, zzael<Void> zzaelVar) {
        Preconditions.checkNotNull(zzafoVar);
        Preconditions.checkNotNull(zzaelVar);
        zzadp zzadpVar = this.zza;
        zzaeo.zza(zzadpVar.zza("/deleteAccount", this.zzf), zzafoVar, zzaelVar, Void.class, zzadpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzafn zzafnVar, zzael<zzafq> zzaelVar) {
        Preconditions.checkNotNull(zzafnVar);
        Preconditions.checkNotNull(zzaelVar);
        zzadp zzadpVar = this.zza;
        zzaeo.zza(zzadpVar.zza("/emailLinkSignin", this.zzf), zzafnVar, zzaelVar, zzafq.class, zzadpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzafp zzafpVar, zzael<zzafs> zzaelVar) {
        Preconditions.checkNotNull(zzafpVar);
        Preconditions.checkNotNull(zzaelVar);
        zzado zzadoVar = this.zzb;
        zzaeo.zza(zzadoVar.zza("/accounts/mfaEnrollment:finalize", this.zzf), zzafpVar, zzaelVar, zzafs.class, zzadoVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzafr zzafrVar, zzael<zzafu> zzaelVar) {
        Preconditions.checkNotNull(zzafrVar);
        Preconditions.checkNotNull(zzaelVar);
        zzado zzadoVar = this.zzb;
        zzaeo.zza(zzadoVar.zza("/accounts/mfaSignIn:finalize", this.zzf), zzafrVar, zzaelVar, zzafu.class, zzadoVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzafz zzafzVar, zzael<zzagl> zzaelVar) {
        Preconditions.checkNotNull(zzafzVar);
        Preconditions.checkNotNull(zzaelVar);
        zzaes zzaesVar = this.zzc;
        zzaeo.zza(zzaesVar.zza("/token", this.zzf), zzafzVar, zzaelVar, zzagl.class, zzaesVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzagc zzagcVar, zzael<zzagb> zzaelVar) {
        Preconditions.checkNotNull(zzagcVar);
        Preconditions.checkNotNull(zzaelVar);
        zzadp zzadpVar = this.zza;
        zzaeo.zza(zzadpVar.zza("/getAccountInfo", this.zzf), zzagcVar, zzaelVar, zzagb.class, zzadpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzagg zzaggVar, zzael<zzagf> zzaelVar) {
        Preconditions.checkNotNull(zzaggVar);
        Preconditions.checkNotNull(zzaelVar);
        if (zzaggVar.zzb() != null) {
            zzb().zzb(zzaggVar.zzb().zzf());
        }
        zzadp zzadpVar = this.zza;
        zzaeo.zza(zzadpVar.zza("/getOobConfirmationCode", this.zzf), zzaggVar, zzaelVar, zzagf.class, zzadpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzagi zzagiVar, zzael<zzagh> zzaelVar) {
        Preconditions.checkNotNull(zzagiVar);
        Preconditions.checkNotNull(zzaelVar);
        zzadp zzadpVar = this.zza;
        zzaeo.zza(zzadpVar.zza("/getRecaptchaParam", this.zzf), zzaelVar, zzagh.class, zzadpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzagj zzagjVar, zzael<zzagm> zzaelVar) {
        Preconditions.checkNotNull(zzagjVar);
        Preconditions.checkNotNull(zzaelVar);
        zzado zzadoVar = this.zzb;
        String str = zzadoVar.zza("/recaptchaConfig", this.zzf) + "&clientType=" + zzagjVar.zzb() + "&version=" + zzagjVar.zzc();
        if (!zzag.zzc(zzagjVar.zzd())) {
            str = str + "&tenantId=" + zzagjVar.zzd();
        }
        zzaeo.zza(str, zzaelVar, zzagm.class, zzadoVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzafd
    public final void zza() {
        zza(null, null, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzagw zzagwVar, zzael<zzagv> zzaelVar) {
        Preconditions.checkNotNull(zzagwVar);
        Preconditions.checkNotNull(zzaelVar);
        zzadp zzadpVar = this.zza;
        zzaeo.zza(zzadpVar.zza("/resetPassword", this.zzf), zzagwVar, zzaelVar, zzagv.class, zzadpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzagy zzagyVar, zzael<zzaha> zzaelVar) {
        Preconditions.checkNotNull(zzagyVar);
        Preconditions.checkNotNull(zzaelVar);
        zzado zzadoVar = this.zzb;
        zzaeo.zza(zzadoVar.zza("/accounts:revokeToken", this.zzf), zzagyVar, zzaelVar, zzaha.class, zzadoVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzagz zzagzVar, zzael<zzahc> zzaelVar) {
        Preconditions.checkNotNull(zzagzVar);
        Preconditions.checkNotNull(zzaelVar);
        if (!TextUtils.isEmpty(zzagzVar.zzc())) {
            zzb().zzb(zzagzVar.zzc());
        }
        zzadp zzadpVar = this.zza;
        zzaeo.zza(zzadpVar.zza("/sendVerificationCode", this.zzf), zzagzVar, zzaelVar, zzahc.class, zzadpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzahb zzahbVar, zzael<zzahe> zzaelVar) {
        Preconditions.checkNotNull(zzahbVar);
        Preconditions.checkNotNull(zzaelVar);
        zzadp zzadpVar = this.zza;
        zzaeo.zza(zzadpVar.zza("/setAccountInfo", this.zzf), zzahbVar, zzaelVar, zzahe.class, zzadpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(String str, zzael<Void> zzaelVar) {
        Preconditions.checkNotNull(zzaelVar);
        zzb().zza(str);
        zzaelVar.zza((zzael<Void>) null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzahg zzahgVar, zzael<zzahf> zzaelVar) {
        Preconditions.checkNotNull(zzahgVar);
        Preconditions.checkNotNull(zzaelVar);
        zzadp zzadpVar = this.zza;
        zzaeo.zza(zzadpVar.zza("/signupNewUser", this.zzf), zzahgVar, zzaelVar, zzahf.class, zzadpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzahi zzahiVar, zzael<zzahh> zzaelVar) {
        Preconditions.checkNotNull(zzahiVar);
        Preconditions.checkNotNull(zzaelVar);
        if (zzahiVar instanceof zzahm) {
            zzahm zzahmVar = (zzahm) zzahiVar;
            if (!TextUtils.isEmpty(zzahmVar.zzb())) {
                zzb().zzb(zzahmVar.zzb());
            }
        }
        zzado zzadoVar = this.zzb;
        zzaeo.zza(zzadoVar.zza("/accounts/mfaEnrollment:start", this.zzf), zzahiVar, zzaelVar, zzahh.class, zzadoVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzahk zzahkVar, zzael<zzahj> zzaelVar) {
        Preconditions.checkNotNull(zzahkVar);
        Preconditions.checkNotNull(zzaelVar);
        if (!TextUtils.isEmpty(zzahkVar.zzb())) {
            zzb().zzb(zzahkVar.zzb());
        }
        zzado zzadoVar = this.zzb;
        zzaeo.zza(zzadoVar.zza("/accounts/mfaSignIn:start", this.zzf), zzahkVar, zzaelVar, zzahj.class, zzadoVar.zza);
    }

    private final void zza(zzaes zzaesVar, zzadp zzadpVar, zzado zzadoVar) {
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        String zza = zzafc.zza("firebear.secureToken");
        if (TextUtils.isEmpty(zza)) {
            zza = zzafb.zzd(this.zzf);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for secureToken URL: " + zza);
        }
        if (this.zzc == null) {
            this.zzc = new zzaes(zza, zzb());
        }
        String zza2 = zzafc.zza("firebear.identityToolkit");
        if (TextUtils.isEmpty(zza2)) {
            zza2 = zzafb.zzb(this.zzf);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkit URL: " + zza2);
        }
        if (this.zza == null) {
            this.zza = new zzadp(zza2, zzb());
        }
        String zza3 = zzafc.zza("firebear.identityToolkitV2");
        if (TextUtils.isEmpty(zza3)) {
            zza3 = zzafb.zzc(this.zzf);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkitV2 URL: " + zza3);
        }
        if (this.zzb == null) {
            this.zzb = new zzado(zza3, zzb());
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzahr zzahrVar, zzael<zzaht> zzaelVar) {
        Preconditions.checkNotNull(zzahrVar);
        Preconditions.checkNotNull(zzaelVar);
        zzadp zzadpVar = this.zza;
        zzaeo.zza(zzadpVar.zza("/verifyAssertion", this.zzf), zzahrVar, zzaelVar, zzaht.class, zzadpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzahw zzahwVar, zzael<zzahv> zzaelVar) {
        Preconditions.checkNotNull(zzahwVar);
        Preconditions.checkNotNull(zzaelVar);
        zzadp zzadpVar = this.zza;
        zzaeo.zza(zzadpVar.zza("/verifyCustomToken", this.zzf), zzahwVar, zzaelVar, zzahv.class, zzadpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzahy zzahyVar, zzael<zzahx> zzaelVar) {
        Preconditions.checkNotNull(zzahyVar);
        Preconditions.checkNotNull(zzaelVar);
        zzadp zzadpVar = this.zza;
        zzaeo.zza(zzadpVar.zza("/verifyPassword", this.zzf), zzahyVar, zzaelVar, zzahx.class, zzadpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzaia zzaiaVar, zzael<zzahz> zzaelVar) {
        Preconditions.checkNotNull(zzaiaVar);
        Preconditions.checkNotNull(zzaelVar);
        zzadp zzadpVar = this.zza;
        zzaeo.zza(zzadpVar.zza("/verifyPhoneNumber", this.zzf), zzaiaVar, zzaelVar, zzahz.class, zzadpVar.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaej
    public final void zza(zzaic zzaicVar, zzael<zzaib> zzaelVar) {
        Preconditions.checkNotNull(zzaicVar);
        Preconditions.checkNotNull(zzaelVar);
        zzado zzadoVar = this.zzb;
        zzaeo.zza(zzadoVar.zza("/accounts/mfaEnrollment:withdraw", this.zzf), zzaicVar, zzaelVar, zzaib.class, zzadoVar.zza);
    }
}
