package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.ActionCodeResult;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.FirebaseAuthProvider;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GetTokenResult;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.PhoneMultiFactorAssertion;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.SignInMethodQueryResult;
import com.google.firebase.auth.TotpMultiFactorAssertion;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzao;
import com.google.firebase.auth.internal.zzat;
import com.google.firebase.auth.internal.zzaw;
import com.google.firebase.auth.internal.zzbi;
import com.google.firebase.auth.internal.zzce;
import com.google.firebase.auth.internal.zzj;
import com.google.firebase.auth.internal.zzz;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzabj extends zzaei {
    public final Task<Void> zza(FirebaseApp firebaseApp, String str, String str2) {
        return zza((zzabi) new zzabi(str, str2).zza(firebaseApp));
    }

    public final Task<ActionCodeResult> zzb(FirebaseApp firebaseApp, String str, String str2) {
        return zza((zzabl) new zzabl(str, str2).zza(firebaseApp));
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, String str, String str2, String str3) {
        return zza((zzabk) new zzabk(str, str2, str3).zza(firebaseApp));
    }

    public final Task<AuthResult> zza(FirebaseApp firebaseApp, String str, String str2, String str3, String str4, zzj zzjVar) {
        return zza((zzabn) new zzabn(str, str2, str3, str4).zza(firebaseApp).zza((zzady<AuthResult, zzj>) zzjVar));
    }

    public final Task<Void> zza(FirebaseUser firebaseUser, zzat zzatVar) {
        return zza((zzabm) new zzabm().zza(firebaseUser).zza((zzady<Void, zzat>) zzatVar).zza((zzaw) zzatVar));
    }

    public final Task<SignInMethodQueryResult> zzc(FirebaseApp firebaseApp, String str, String str2) {
        return zza((zzabp) new zzabp(str, str2).zza(firebaseApp));
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, PhoneMultiFactorAssertion phoneMultiFactorAssertion, FirebaseUser firebaseUser, String str, zzj zzjVar) {
        zzaer.zza();
        zzabo zzaboVar = new zzabo(phoneMultiFactorAssertion, firebaseUser.zze(), str, null);
        zzaboVar.zza(firebaseApp).zza((zzady<Void, zzj>) zzjVar);
        return zza(zzaboVar);
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, TotpMultiFactorAssertion totpMultiFactorAssertion, FirebaseUser firebaseUser, String str, String str2, zzj zzjVar) {
        zzabo zzaboVar = new zzabo(totpMultiFactorAssertion, firebaseUser.zze(), str, str2);
        zzaboVar.zza(firebaseApp).zza((zzady<Void, zzj>) zzjVar);
        return zza(zzaboVar);
    }

    public final Task<AuthResult> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, PhoneMultiFactorAssertion phoneMultiFactorAssertion, String str, zzj zzjVar) {
        zzaer.zza();
        zzabr zzabrVar = new zzabr(phoneMultiFactorAssertion, str, null);
        zzabrVar.zza(firebaseApp).zza((zzady<AuthResult, zzj>) zzjVar);
        if (firebaseUser != null) {
            zzabrVar.zza(firebaseUser);
        }
        return zza(zzabrVar);
    }

    public final Task<AuthResult> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, TotpMultiFactorAssertion totpMultiFactorAssertion, String str, String str2, zzj zzjVar) {
        zzabr zzabrVar = new zzabr(totpMultiFactorAssertion, str, str2);
        zzabrVar.zza(firebaseApp).zza((zzady<AuthResult, zzj>) zzjVar);
        if (firebaseUser != null) {
            zzabrVar.zza(firebaseUser);
        }
        return zza(zzabrVar);
    }

    public final Task<GetTokenResult> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, zzce zzceVar) {
        return zza((zzabq) new zzabq(str).zza(firebaseApp).zza(firebaseUser).zza((zzady<GetTokenResult, zzj>) zzceVar).zza((zzaw) zzceVar));
    }

    public final Task<zzagh> zza() {
        return zza(new zzabt());
    }

    public final Task<zzagm> zza(String str, String str2) {
        return zza(new zzabs(str, str2));
    }

    public final Task<AuthResult> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, AuthCredential authCredential, String str, zzce zzceVar) {
        Preconditions.checkNotNull(firebaseApp);
        Preconditions.checkNotNull(authCredential);
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(zzceVar);
        List<String> zzg = firebaseUser.zzg();
        if (zzg != null && zzg.contains(authCredential.getProvider())) {
            return Tasks.forException(zzadg.zza(new Status(FirebaseError.ERROR_PROVIDER_ALREADY_LINKED)));
        }
        if (authCredential instanceof EmailAuthCredential) {
            EmailAuthCredential emailAuthCredential = (EmailAuthCredential) authCredential;
            if (!emailAuthCredential.zzf()) {
                return zza((zzabv) new zzabv(emailAuthCredential, str).zza(firebaseApp).zza(firebaseUser).zza((zzady<AuthResult, zzj>) zzceVar).zza((zzaw) zzceVar));
            }
            return zza((zzabw) new zzabw(emailAuthCredential).zza(firebaseApp).zza(firebaseUser).zza((zzady<AuthResult, zzj>) zzceVar).zza((zzaw) zzceVar));
        }
        if (authCredential instanceof PhoneAuthCredential) {
            zzaer.zza();
            return zza((zzabx) new zzabx((PhoneAuthCredential) authCredential).zza(firebaseApp).zza(firebaseUser).zza((zzady<AuthResult, zzj>) zzceVar).zza((zzaw) zzceVar));
        }
        Preconditions.checkNotNull(firebaseApp);
        Preconditions.checkNotNull(authCredential);
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(zzceVar);
        return zza((zzabu) new zzabu(authCredential).zza(firebaseApp).zza(firebaseUser).zza((zzady<AuthResult, zzj>) zzceVar).zza((zzaw) zzceVar));
    }

    public final Task<Void> zzb(FirebaseApp firebaseApp, FirebaseUser firebaseUser, AuthCredential authCredential, String str, zzce zzceVar) {
        return zza((zzabz) new zzabz(authCredential, str).zza(firebaseApp).zza(firebaseUser).zza((zzady<Void, zzj>) zzceVar).zza((zzaw) zzceVar));
    }

    public final Task<AuthResult> zzc(FirebaseApp firebaseApp, FirebaseUser firebaseUser, AuthCredential authCredential, String str, zzce zzceVar) {
        return zza((zzaby) new zzaby(authCredential, str).zza(firebaseApp).zza(firebaseUser).zza((zzady<AuthResult, zzj>) zzceVar).zza((zzaw) zzceVar));
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential, String str, zzce zzceVar) {
        return zza((zzacb) new zzacb(emailAuthCredential, str).zza(firebaseApp).zza(firebaseUser).zza((zzady<Void, zzj>) zzceVar).zza((zzaw) zzceVar));
    }

    public final Task<AuthResult> zzb(FirebaseApp firebaseApp, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential, String str, zzce zzceVar) {
        return zza((zzaca) new zzaca(emailAuthCredential, str).zza(firebaseApp).zza(firebaseUser).zza((zzady<AuthResult, zzj>) zzceVar).zza((zzaw) zzceVar));
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, String str2, String str3, String str4, zzce zzceVar) {
        return zza((zzacd) new zzacd(str, str2, str3, str4).zza(firebaseApp).zza(firebaseUser).zza((zzady<Void, zzj>) zzceVar).zza((zzaw) zzceVar));
    }

    public final Task<AuthResult> zzb(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, String str2, String str3, String str4, zzce zzceVar) {
        return zza((zzacc) new zzacc(str, str2, str3, str4).zza(firebaseApp).zza(firebaseUser).zza((zzady<AuthResult, zzj>) zzceVar).zza((zzaw) zzceVar));
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential, String str, zzce zzceVar) {
        zzaer.zza();
        return zza((zzacf) new zzacf(phoneAuthCredential, str).zza(firebaseApp).zza(firebaseUser).zza((zzady<Void, zzj>) zzceVar).zza((zzaw) zzceVar));
    }

    public final Task<AuthResult> zzb(FirebaseApp firebaseApp, FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential, String str, zzce zzceVar) {
        zzaer.zza();
        return zza((zzace) new zzace(phoneAuthCredential, str).zza(firebaseApp).zza(firebaseUser).zza((zzady<AuthResult, zzj>) zzceVar).zza((zzaw) zzceVar));
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, zzce zzceVar) {
        return zza((zzach) new zzach().zza(firebaseApp).zza(firebaseUser).zza((zzady<Void, zzj>) zzceVar).zza((zzaw) zzceVar));
    }

    public final Task<Void> zza(String str, String str2, String str3, String str4) {
        return zza(new zzacg(str, str2, str3, str4));
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, ActionCodeSettings actionCodeSettings, String str) {
        return zza((zzacj) new zzacj(str, actionCodeSettings).zza(firebaseApp));
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, String str, ActionCodeSettings actionCodeSettings, String str2, String str3) {
        actionCodeSettings.zza(1);
        return zza((zzaci) new zzaci(str, actionCodeSettings, str2, str3, "sendPasswordResetEmail").zza(firebaseApp));
    }

    public final Task<Void> zzb(FirebaseApp firebaseApp, String str, ActionCodeSettings actionCodeSettings, String str2, String str3) {
        actionCodeSettings.zza(6);
        return zza((zzaci) new zzaci(str, actionCodeSettings, str2, str3, "sendSignInLinkToEmail").zza(firebaseApp));
    }

    public final Task<Void> zza(String str) {
        return zza(new zzacl(str));
    }

    public final Task<AuthResult> zza(FirebaseApp firebaseApp, zzj zzjVar, String str) {
        return zza((zzack) new zzack(str).zza(firebaseApp).zza((zzady<AuthResult, zzj>) zzjVar));
    }

    public final Task<AuthResult> zza(FirebaseApp firebaseApp, AuthCredential authCredential, String str, zzj zzjVar) {
        return zza((zzacn) new zzacn(authCredential, str).zza(firebaseApp).zza((zzady<AuthResult, zzj>) zzjVar));
    }

    public final Task<AuthResult> zza(FirebaseApp firebaseApp, String str, String str2, zzj zzjVar) {
        return zza((zzacm) new zzacm(str, str2).zza(firebaseApp).zza((zzady<AuthResult, zzj>) zzjVar));
    }

    public final Task<AuthResult> zzb(FirebaseApp firebaseApp, String str, String str2, String str3, String str4, zzj zzjVar) {
        return zza((zzacp) new zzacp(str, str2, str3, str4).zza(firebaseApp).zza((zzady<AuthResult, zzj>) zzjVar));
    }

    public final Task<AuthResult> zza(FirebaseApp firebaseApp, EmailAuthCredential emailAuthCredential, String str, zzj zzjVar) {
        return zza((zzaco) new zzaco(emailAuthCredential, str).zza(firebaseApp).zza((zzady<AuthResult, zzj>) zzjVar));
    }

    public final Task<AuthResult> zza(FirebaseApp firebaseApp, PhoneAuthCredential phoneAuthCredential, String str, zzj zzjVar) {
        zzaer.zza();
        return zza((zzacr) new zzacr(phoneAuthCredential, str).zza(firebaseApp).zza((zzady<AuthResult, zzj>) zzjVar));
    }

    public final Task<Void> zza(zzao zzaoVar, String str, String str2, long j, boolean z, boolean z2, String str3, String str4, String str5, boolean z3, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Executor executor, Activity activity) {
        zzacq zzacqVar = new zzacq(zzaoVar, str, str2, j, z, z2, str3, str4, str5, z3);
        zzacqVar.zza(onVerificationStateChangedCallbacks, activity, executor, str);
        return zza(zzacqVar);
    }

    public final Task<zzahh> zza(zzao zzaoVar, String str) {
        return zza(new zzact(zzaoVar, str));
    }

    public final Task<Void> zza(zzao zzaoVar, PhoneMultiFactorInfo phoneMultiFactorInfo, String str, long j, boolean z, boolean z2, String str2, String str3, String str4, boolean z3, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Executor executor, Activity activity) {
        zzacs zzacsVar = new zzacs(phoneMultiFactorInfo, Preconditions.checkNotEmpty(zzaoVar.zzc()), str, j, z, z2, str2, str3, str4, z3);
        zzacsVar.zza(onVerificationStateChangedCallbacks, activity, executor, phoneMultiFactorInfo.getUid());
        return zza(zzacsVar);
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, String str2, zzce zzceVar) {
        return zza((zzacv) new zzacv(firebaseUser.zze(), str, str2).zza(firebaseApp).zza(firebaseUser).zza((zzady<Void, zzj>) zzceVar).zza((zzaw) zzceVar));
    }

    public final Task<AuthResult> zzb(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, zzce zzceVar) {
        Preconditions.checkNotNull(firebaseApp);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(zzceVar);
        List<String> zzg = firebaseUser.zzg();
        if ((zzg != null && !zzg.contains(str)) || firebaseUser.isAnonymous()) {
            return Tasks.forException(zzadg.zza(new Status(FirebaseError.ERROR_NO_SUCH_PROVIDER, str)));
        }
        str.hashCode();
        if (str.equals("password")) {
            return zza((zzacu) new zzacu().zza(firebaseApp).zza(firebaseUser).zza((zzady<AuthResult, zzj>) zzceVar).zza((zzaw) zzceVar));
        }
        return zza((zzacx) new zzacx(str).zza(firebaseApp).zza(firebaseUser).zza((zzady<AuthResult, zzj>) zzceVar).zza((zzaw) zzceVar));
    }

    public final Task<Void> zzc(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, zzce zzceVar) {
        return zza((zzacw) new zzacw(str).zza(firebaseApp).zza(firebaseUser).zza((zzady<Void, zzj>) zzceVar).zza((zzaw) zzceVar));
    }

    public final Task<Void> zzd(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, zzce zzceVar) {
        return zza((zzacz) new zzacz(str).zza(firebaseApp).zza(firebaseUser).zza((zzady<Void, zzj>) zzceVar).zza((zzaw) zzceVar));
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential, zzce zzceVar) {
        zzaer.zza();
        return zza((zzacy) new zzacy(phoneAuthCredential).zza(firebaseApp).zza(firebaseUser).zza((zzady<Void, zzj>) zzceVar).zza((zzaw) zzceVar));
    }

    public final Task<Void> zza(FirebaseApp firebaseApp, FirebaseUser firebaseUser, UserProfileChangeRequest userProfileChangeRequest, zzce zzceVar) {
        return zza((zzadb) new zzadb(userProfileChangeRequest).zza(firebaseApp).zza(firebaseUser).zza((zzady<Void, zzj>) zzceVar).zza((zzaw) zzceVar));
    }

    public final Task<Void> zza(String str, String str2, ActionCodeSettings actionCodeSettings) {
        actionCodeSettings.zza(7);
        return zza(new zzada(str, str2, actionCodeSettings));
    }

    public final Task<String> zzd(FirebaseApp firebaseApp, String str, String str2) {
        return zza((zzadd) new zzadd(str, str2).zza(firebaseApp));
    }

    static zzad zza(FirebaseApp firebaseApp, zzage zzageVar) {
        Preconditions.checkNotNull(firebaseApp);
        Preconditions.checkNotNull(zzageVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zzz(zzageVar, FirebaseAuthProvider.PROVIDER_ID));
        List<zzagr> zzl = zzageVar.zzl();
        if (zzl != null && !zzl.isEmpty()) {
            for (int i = 0; i < zzl.size(); i++) {
                arrayList.add(new zzz(zzl.get(i)));
            }
        }
        zzad zzadVar = new zzad(firebaseApp, arrayList);
        zzadVar.zza(new zzaf(zzageVar.zzb(), zzageVar.zza()));
        zzadVar.zza(zzageVar.zzn());
        zzadVar.zza(zzageVar.zze());
        zzadVar.zzc(zzbi.zza(zzageVar.zzk()));
        zzadVar.zzb(zzageVar.zzd());
        return zzadVar;
    }

    public zzabj(FirebaseApp firebaseApp, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = new zzadh(firebaseApp, scheduledExecutorService);
        this.zzb = executor;
    }

    public final void zza(FirebaseApp firebaseApp, zzagz zzagzVar, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Activity activity, Executor executor) {
        zza((zzadc) new zzadc(zzagzVar).zza(firebaseApp).zza(onVerificationStateChangedCallbacks, activity, executor, zzagzVar.zzd()));
    }
}
