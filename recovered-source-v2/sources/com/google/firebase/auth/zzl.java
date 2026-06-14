package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzadg;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.PhoneAuthProvider;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes4.dex */
final class zzl extends PhoneAuthProvider.OnVerificationStateChangedCallbacks {
    private final /* synthetic */ PhoneAuthOptions zza;
    private final /* synthetic */ com.google.firebase.auth.internal.zzh zzb;
    private final /* synthetic */ PhoneAuthProvider.OnVerificationStateChangedCallbacks zzc;
    private final /* synthetic */ FirebaseAuth zzd;

    zzl(FirebaseAuth firebaseAuth, PhoneAuthOptions phoneAuthOptions, com.google.firebase.auth.internal.zzh zzhVar, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks) {
        this.zza = phoneAuthOptions;
        this.zzb = zzhVar;
        this.zzc = onVerificationStateChangedCallbacks;
        this.zzd = firebaseAuth;
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks
    public final void onCodeAutoRetrievalTimeOut(String str) {
        this.zzc.onCodeAutoRetrievalTimeOut(str);
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks
    public final void onCodeSent(String str, PhoneAuthProvider.ForceResendingToken forceResendingToken) {
        this.zzc.onCodeSent(str, forceResendingToken);
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks
    public final void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {
        this.zzc.onVerificationCompleted(phoneAuthCredential);
    }

    @Override // com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks
    public final void onVerificationFailed(FirebaseException firebaseException) {
        if (zzadg.zza(firebaseException)) {
            this.zza.zza(true);
            Log.d("FirebaseAuth", "Re-triggering phone verification with Recaptcha flow forced for phone number " + this.zza.zzh());
            FirebaseAuth.zza(this.zza);
            return;
        }
        if (!TextUtils.isEmpty(this.zzb.zzc())) {
            if (zzadg.zzb(firebaseException) && this.zzd.zzb().zza("PHONE_PROVIDER") && TextUtils.isEmpty(this.zzb.zzb())) {
                this.zza.zzb(true);
                Log.d("FirebaseAuth", "Re-triggering phone verification with non-reCAPTCHA Enterprise flow for phone number " + this.zza.zzh());
                FirebaseAuth.zza(this.zza);
                return;
            }
            Log.d("FirebaseAuth", "Invoking original failure callbacks after reCAPTCHA Enterprise + phone verification failure for " + this.zza.zzh() + ", error - " + firebaseException.getMessage());
            this.zzc.onVerificationFailed(firebaseException);
            return;
        }
        Log.d("FirebaseAuth", "Invoking original failure callbacks after phone verification failure for " + this.zza.zzh() + ", error - " + firebaseException.getMessage());
        this.zzc.onVerificationFailed(firebaseException);
    }
}
