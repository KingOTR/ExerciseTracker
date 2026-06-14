package com.google.firebase.auth;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzabj;
import com.google.android.gms.internal.p002firebaseauthapi.zzadg;
import com.google.android.gms.internal.p002firebaseauthapi.zzadn;
import com.google.android.gms.internal.p002firebaseauthapi.zzadx;
import com.google.android.gms.internal.p002firebaseauthapi.zzaer;
import com.google.android.gms.internal.p002firebaseauthapi.zzafb;
import com.google.android.gms.internal.p002firebaseauthapi.zzagh;
import com.google.android.gms.internal.p002firebaseauthapi.zzagl;
import com.google.android.gms.internal.p002firebaseauthapi.zzagm;
import com.google.android.gms.internal.p002firebaseauthapi.zzagz;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseError;
import com.google.firebase.FirebaseException;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.auth.internal.zzaw;
import com.google.firebase.auth.internal.zzbg;
import com.google.firebase.auth.internal.zzbm;
import com.google.firebase.auth.internal.zzbv;
import com.google.firebase.auth.internal.zzbz;
import com.google.firebase.auth.internal.zzca;
import com.google.firebase.auth.internal.zzce;
import com.google.firebase.auth.internal.zzcf;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.internal.InternalTokenResult;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes4.dex */
public class FirebaseAuth implements InternalAuthProvider {
    private final FirebaseApp zza;
    private final Executor zzaa;
    private String zzab;
    private final List<IdTokenListener> zzb;
    private final List<com.google.firebase.auth.internal.IdTokenListener> zzc;
    private final List<AuthStateListener> zzd;
    private final zzabj zze;
    private FirebaseUser zzf;
    private final com.google.firebase.auth.internal.zzae zzg;
    private final Object zzh;
    private String zzi;
    private final Object zzj;
    private String zzk;
    private zzbv zzl;
    private final RecaptchaAction zzm;
    private final RecaptchaAction zzn;
    private final RecaptchaAction zzo;
    private final RecaptchaAction zzp;
    private final RecaptchaAction zzq;
    private final RecaptchaAction zzr;
    private final zzca zzs;
    private final zzcf zzt;
    private final com.google.firebase.auth.internal.zza zzu;
    private final Provider<InteropAppCheckTokenProvider> zzv;
    private final Provider<HeartBeatController> zzw;
    private zzbz zzx;
    private final Executor zzy;
    private final Executor zzz;

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public interface AuthStateListener {
        void onAuthStateChanged(FirebaseAuth firebaseAuth);
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public interface IdTokenListener {
        void onIdTokenChanged(FirebaseAuth firebaseAuth);
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    class zza implements com.google.firebase.auth.internal.zzj {
        zza() {
        }

        @Override // com.google.firebase.auth.internal.zzj
        public final void zza(zzagl zzaglVar, FirebaseUser firebaseUser) {
            Preconditions.checkNotNull(zzaglVar);
            Preconditions.checkNotNull(firebaseUser);
            firebaseUser.zza(zzaglVar);
            FirebaseAuth.this.zza(firebaseUser, zzaglVar, true);
        }
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    class zzb implements zzaw, com.google.firebase.auth.internal.zzj {
        zzb() {
        }

        @Override // com.google.firebase.auth.internal.zzj
        public final void zza(zzagl zzaglVar, FirebaseUser firebaseUser) {
            Preconditions.checkNotNull(zzaglVar);
            Preconditions.checkNotNull(firebaseUser);
            firebaseUser.zza(zzaglVar);
            FirebaseAuth.this.zza(firebaseUser, zzaglVar, true, true);
        }

        @Override // com.google.firebase.auth.internal.zzaw
        public final void zza(Status status) {
            if (status.getStatusCode() == 17011 || status.getStatusCode() == 17021 || status.getStatusCode() == 17005 || status.getStatusCode() == 17091) {
                FirebaseAuth.this.signOut();
            }
        }
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    class zzc extends zza implements zzaw, com.google.firebase.auth.internal.zzj {
        zzc(FirebaseAuth firebaseAuth) {
            super();
        }

        @Override // com.google.firebase.auth.internal.zzaw
        public final void zza(Status status) {
        }
    }

    public Task<Void> applyActionCode(String str) {
        Preconditions.checkNotEmpty(str);
        return this.zze.zza(this.zza, str, this.zzk);
    }

    public Task<ActionCodeResult> checkActionCode(String str) {
        Preconditions.checkNotEmpty(str);
        return this.zze.zzb(this.zza, str, this.zzk);
    }

    public Task<Void> confirmPasswordReset(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        return this.zze.zza(this.zza, str, str2, this.zzk);
    }

    public Task<AuthResult> createUserWithEmailAndPassword(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        return new zzn(this, str, str2).zza(this, this.zzk, this.zzo, "EMAIL_PASSWORD_PROVIDER");
    }

    public final Task<Void> zza(FirebaseUser firebaseUser) {
        Preconditions.checkNotNull(firebaseUser);
        return this.zze.zza(firebaseUser, new zzr(this, firebaseUser));
    }

    public final Task<Void> zza(FirebaseUser firebaseUser, MultiFactorAssertion multiFactorAssertion, String str) {
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(multiFactorAssertion);
        if (multiFactorAssertion instanceof PhoneMultiFactorAssertion) {
            return this.zze.zza(this.zza, (PhoneMultiFactorAssertion) multiFactorAssertion, firebaseUser, str, new zza());
        }
        if (multiFactorAssertion instanceof TotpMultiFactorAssertion) {
            return this.zze.zza(this.zza, (TotpMultiFactorAssertion) multiFactorAssertion, firebaseUser, str, this.zzk, new zza());
        }
        return Tasks.forException(zzadg.zza(new Status(FirebaseError.ERROR_INTERNAL_ERROR)));
    }

    @Deprecated
    public Task<SignInMethodQueryResult> fetchSignInMethodsForEmail(String str) {
        Preconditions.checkNotEmpty(str);
        return this.zze.zzc(this.zza, str, this.zzk);
    }

    @Override // com.google.firebase.auth.internal.InternalAuthProvider, com.google.firebase.internal.InternalTokenProvider
    public Task<GetTokenResult> getAccessToken(boolean z) {
        return zza(this.zzf, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.internal.zzce, com.google.firebase.auth.zzx] */
    public final Task<GetTokenResult> zza(FirebaseUser firebaseUser, boolean z) {
        if (firebaseUser == null) {
            return Tasks.forException(zzadg.zza(new Status(FirebaseError.ERROR_NO_SIGNED_IN_USER)));
        }
        zzagl zzc2 = firebaseUser.zzc();
        if (zzc2.zzg() && !z) {
            return Tasks.forResult(zzbg.zza(zzc2.zzc()));
        }
        return this.zze.zza(this.zza, firebaseUser, zzc2.zzd(), (zzce) new zzx(this));
    }

    public Task<AuthResult> getPendingAuthResult() {
        return this.zzt.zza();
    }

    public final Task<zzagh> zza() {
        return this.zze.zza();
    }

    public final Task<zzagm> zza(String str) {
        return this.zze.zza(this.zzk, str);
    }

    public Task<Void> initializeRecaptchaConfig() {
        if (this.zzl == null) {
            this.zzl = new zzbv(this.zza, this);
        }
        return this.zzl.zza(this.zzk, false).continueWithTask(new zzaa(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.firebase.auth.FirebaseAuth$zzb, com.google.firebase.auth.internal.zzce] */
    public final Task<AuthResult> zza(FirebaseUser firebaseUser, AuthCredential authCredential) {
        Preconditions.checkNotNull(authCredential);
        Preconditions.checkNotNull(firebaseUser);
        if (authCredential instanceof EmailAuthCredential) {
            return new zzo(this, firebaseUser, (EmailAuthCredential) authCredential.zza()).zza(this, firebaseUser.getTenantId(), this.zzo, "EMAIL_PASSWORD_PROVIDER");
        }
        return this.zze.zza(this.zza, firebaseUser, authCredential.zza(), (String) null, (zzce) new zzb());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.firebase.auth.FirebaseAuth$zzb, com.google.firebase.auth.internal.zzce] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.firebase.auth.FirebaseAuth$zzb, com.google.firebase.auth.internal.zzce] */
    public final Task<Void> zzb(FirebaseUser firebaseUser, AuthCredential authCredential) {
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(authCredential);
        AuthCredential zza2 = authCredential.zza();
        if (zza2 instanceof EmailAuthCredential) {
            EmailAuthCredential emailAuthCredential = (EmailAuthCredential) zza2;
            if ("password".equals(emailAuthCredential.getSignInMethod())) {
                return zza(firebaseUser, emailAuthCredential, false);
            }
            if (zzb(Preconditions.checkNotEmpty(emailAuthCredential.zze()))) {
                return Tasks.forException(zzadg.zza(new Status(17072)));
            }
            return zza(firebaseUser, emailAuthCredential, true);
        }
        if (zza2 instanceof PhoneAuthCredential) {
            return this.zze.zza(this.zza, firebaseUser, (PhoneAuthCredential) zza2, this.zzk, (zzce) new zzb());
        }
        return this.zze.zzb(this.zza, firebaseUser, zza2, firebaseUser.getTenantId(), (zzce) new zzb());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.firebase.auth.FirebaseAuth$zzb, com.google.firebase.auth.internal.zzce] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.firebase.auth.FirebaseAuth$zzb, com.google.firebase.auth.internal.zzce] */
    public final Task<AuthResult> zzc(FirebaseUser firebaseUser, AuthCredential authCredential) {
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(authCredential);
        AuthCredential zza2 = authCredential.zza();
        if (zza2 instanceof EmailAuthCredential) {
            EmailAuthCredential emailAuthCredential = (EmailAuthCredential) zza2;
            if ("password".equals(emailAuthCredential.getSignInMethod())) {
                return zza(emailAuthCredential.zzc(), Preconditions.checkNotEmpty(emailAuthCredential.zzd()), firebaseUser.getTenantId(), firebaseUser, true);
            }
            if (zzb(Preconditions.checkNotEmpty(emailAuthCredential.zze()))) {
                return Tasks.forException(zzadg.zza(new Status(17072)));
            }
            return zza(emailAuthCredential, firebaseUser, true);
        }
        if (zza2 instanceof PhoneAuthCredential) {
            return this.zze.zzb(this.zza, firebaseUser, (PhoneAuthCredential) zza2, this.zzk, (zzce) new zzb());
        }
        return this.zze.zzc(this.zza, firebaseUser, zza2, firebaseUser.getTenantId(), new zzb());
    }

    private final Task<Void> zza(FirebaseUser firebaseUser, zzce zzceVar) {
        Preconditions.checkNotNull(firebaseUser);
        return this.zze.zza(this.zza, firebaseUser, zzceVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.firebase.auth.FirebaseAuth$zzb, com.google.firebase.auth.internal.zzce] */
    public final Task<Void> zzb(FirebaseUser firebaseUser) {
        return zza(firebaseUser, (zzce) new zzb());
    }

    public final Task<AuthResult> zza(MultiFactorAssertion multiFactorAssertion, com.google.firebase.auth.internal.zzao zzaoVar, FirebaseUser firebaseUser) {
        Preconditions.checkNotNull(multiFactorAssertion);
        Preconditions.checkNotNull(zzaoVar);
        if (multiFactorAssertion instanceof PhoneMultiFactorAssertion) {
            return this.zze.zza(this.zza, firebaseUser, (PhoneMultiFactorAssertion) multiFactorAssertion, Preconditions.checkNotEmpty(zzaoVar.zzc()), new zza());
        }
        if (multiFactorAssertion instanceof TotpMultiFactorAssertion) {
            return this.zze.zza(this.zza, firebaseUser, (TotpMultiFactorAssertion) multiFactorAssertion, Preconditions.checkNotEmpty(zzaoVar.zzc()), this.zzk, new zza());
        }
        throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
    }

    public Task<Void> revokeAccessToken(String str) {
        Preconditions.checkNotEmpty(str);
        FirebaseUser currentUser = getCurrentUser();
        Preconditions.checkNotNull(currentUser);
        return currentUser.getIdToken(false).continueWithTask(new zzw(this, str));
    }

    public final Task<Void> zza(ActionCodeSettings actionCodeSettings, String str) {
        Preconditions.checkNotEmpty(str);
        if (this.zzi != null) {
            if (actionCodeSettings == null) {
                actionCodeSettings = ActionCodeSettings.zzb();
            }
            actionCodeSettings.zza(this.zzi);
        }
        return this.zze.zza(this.zza, actionCodeSettings, str);
    }

    public Task<Void> sendPasswordResetEmail(String str) {
        Preconditions.checkNotEmpty(str);
        return sendPasswordResetEmail(str, null);
    }

    public Task<Void> sendPasswordResetEmail(String str, ActionCodeSettings actionCodeSettings) {
        Preconditions.checkNotEmpty(str);
        if (actionCodeSettings == null) {
            actionCodeSettings = ActionCodeSettings.zzb();
        }
        String str2 = this.zzi;
        if (str2 != null) {
            actionCodeSettings.zza(str2);
        }
        actionCodeSettings.zza(1);
        return new zzq(this, str, actionCodeSettings).zza(this, this.zzk, this.zzm, "EMAIL_PASSWORD_PROVIDER");
    }

    public Task<Void> sendSignInLinkToEmail(String str, ActionCodeSettings actionCodeSettings) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(actionCodeSettings);
        if (!actionCodeSettings.canHandleCodeInApp()) {
            throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
        }
        String str2 = this.zzi;
        if (str2 != null) {
            actionCodeSettings.zza(str2);
        }
        return new zzp(this, str, actionCodeSettings).zza(this, this.zzk, this.zzm, "EMAIL_PASSWORD_PROVIDER");
    }

    public Task<Void> setFirebaseUIVersion(String str) {
        return this.zze.zza(str);
    }

    public Task<AuthResult> signInAnonymously() {
        FirebaseUser firebaseUser = this.zzf;
        if (firebaseUser != null && firebaseUser.isAnonymous()) {
            com.google.firebase.auth.internal.zzad zzadVar = (com.google.firebase.auth.internal.zzad) this.zzf;
            zzadVar.zza(false);
            return Tasks.forResult(new com.google.firebase.auth.internal.zzx(zzadVar));
        }
        return this.zze.zza(this.zza, new zza(), this.zzk);
    }

    public Task<AuthResult> signInWithCredential(AuthCredential authCredential) {
        Preconditions.checkNotNull(authCredential);
        AuthCredential zza2 = authCredential.zza();
        if (zza2 instanceof EmailAuthCredential) {
            EmailAuthCredential emailAuthCredential = (EmailAuthCredential) zza2;
            if (!emailAuthCredential.zzf()) {
                return zza(emailAuthCredential.zzc(), (String) Preconditions.checkNotNull(emailAuthCredential.zzd()), this.zzk, (FirebaseUser) null, false);
            }
            if (zzb(Preconditions.checkNotEmpty(emailAuthCredential.zze()))) {
                return Tasks.forException(zzadg.zza(new Status(17072)));
            }
            return zza(emailAuthCredential, (FirebaseUser) null, false);
        }
        if (zza2 instanceof PhoneAuthCredential) {
            return this.zze.zza(this.zza, (PhoneAuthCredential) zza2, this.zzk, (com.google.firebase.auth.internal.zzj) new zza());
        }
        return this.zze.zza(this.zza, zza2, this.zzk, new zza());
    }

    public Task<AuthResult> signInWithCustomToken(String str) {
        Preconditions.checkNotEmpty(str);
        return this.zze.zza(this.zza, str, this.zzk, new zza());
    }

    public Task<AuthResult> signInWithEmailAndPassword(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        return zza(str, str2, this.zzk, (FirebaseUser) null, false);
    }

    public Task<AuthResult> signInWithEmailLink(String str, String str2) {
        return signInWithCredential(EmailAuthProvider.getCredentialWithLink(str, str2));
    }

    public final Task<AuthResult> zza(Activity activity, FederatedAuthProvider federatedAuthProvider, FirebaseUser firebaseUser) {
        Preconditions.checkNotNull(activity);
        Preconditions.checkNotNull(federatedAuthProvider);
        Preconditions.checkNotNull(firebaseUser);
        TaskCompletionSource<AuthResult> taskCompletionSource = new TaskCompletionSource<>();
        if (!this.zzt.zza(activity, taskCompletionSource, this, firebaseUser)) {
            return Tasks.forException(zzadg.zza(new Status(17057)));
        }
        zzbm.zza(activity.getApplicationContext(), this, firebaseUser);
        federatedAuthProvider.zza(activity);
        return taskCompletionSource.getTask();
    }

    public final Task<AuthResult> zzb(Activity activity, FederatedAuthProvider federatedAuthProvider, FirebaseUser firebaseUser) {
        Preconditions.checkNotNull(activity);
        Preconditions.checkNotNull(federatedAuthProvider);
        Preconditions.checkNotNull(firebaseUser);
        TaskCompletionSource<AuthResult> taskCompletionSource = new TaskCompletionSource<>();
        if (!this.zzt.zza(activity, taskCompletionSource, this, firebaseUser)) {
            return Tasks.forException(zzadg.zza(new Status(17057)));
        }
        zzbm.zza(activity.getApplicationContext(), this, firebaseUser);
        federatedAuthProvider.zzb(activity);
        return taskCompletionSource.getTask();
    }

    public Task<AuthResult> startActivityForSignInWithProvider(Activity activity, FederatedAuthProvider federatedAuthProvider) {
        Preconditions.checkNotNull(federatedAuthProvider);
        Preconditions.checkNotNull(activity);
        TaskCompletionSource<AuthResult> taskCompletionSource = new TaskCompletionSource<>();
        if (!this.zzt.zza(activity, taskCompletionSource, this)) {
            return Tasks.forException(zzadg.zza(new Status(17057)));
        }
        zzbm.zza(activity.getApplicationContext(), this);
        federatedAuthProvider.zzc(activity);
        return taskCompletionSource.getTask();
    }

    public final Task<TotpSecret> zza(com.google.firebase.auth.internal.zzao zzaoVar) {
        Preconditions.checkNotNull(zzaoVar);
        return this.zze.zza(zzaoVar, this.zzk).continueWithTask(new zzt(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.firebase.auth.FirebaseAuth$zzb, com.google.firebase.auth.internal.zzce] */
    public final Task<Void> zza(FirebaseUser firebaseUser, String str) {
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotEmpty(str);
        return this.zze.zza(this.zza, firebaseUser, str, this.zzk, (zzce) new zzb()).continueWithTask(new zzs(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$zzb, com.google.firebase.auth.internal.zzce] */
    public final Task<AuthResult> zzb(FirebaseUser firebaseUser, String str) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(firebaseUser);
        return this.zze.zzb(this.zza, firebaseUser, str, new zzb());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.firebase.auth.FirebaseAuth$zzc, com.google.firebase.auth.internal.zzce] */
    public Task<Void> updateCurrentUser(FirebaseUser firebaseUser) {
        String str;
        if (firebaseUser == null) {
            throw new IllegalArgumentException("Cannot update current user with null user!");
        }
        String tenantId = firebaseUser.getTenantId();
        if ((tenantId != null && !tenantId.equals(this.zzk)) || ((str = this.zzk) != null && !str.equals(tenantId))) {
            return Tasks.forException(zzadg.zza(new Status(17072)));
        }
        String apiKey = firebaseUser.zza().getOptions().getApiKey();
        String apiKey2 = this.zza.getOptions().getApiKey();
        if (firebaseUser.zzc().zzg() && apiKey2.equals(apiKey)) {
            zza(com.google.firebase.auth.internal.zzad.zza(this.zza, firebaseUser), firebaseUser.zzc(), true);
            return Tasks.forResult(null);
        }
        return zza(firebaseUser, (zzce) new zzc(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$zzb, com.google.firebase.auth.internal.zzce] */
    public final Task<Void> zzc(FirebaseUser firebaseUser, String str) {
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotEmpty(str);
        return this.zze.zzc(this.zza, firebaseUser, str, new zzb());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$zzb, com.google.firebase.auth.internal.zzce] */
    public final Task<Void> zzd(FirebaseUser firebaseUser, String str) {
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotEmpty(str);
        return this.zze.zzd(this.zza, firebaseUser, str, new zzb());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$zzb, com.google.firebase.auth.internal.zzce] */
    public final Task<Void> zza(FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential) {
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(phoneAuthCredential);
        return this.zze.zza(this.zza, firebaseUser, (PhoneAuthCredential) phoneAuthCredential.zza(), (zzce) new zzb());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.FirebaseAuth$zzb, com.google.firebase.auth.internal.zzce] */
    public final Task<Void> zza(FirebaseUser firebaseUser, UserProfileChangeRequest userProfileChangeRequest) {
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(userProfileChangeRequest);
        return this.zze.zza(this.zza, firebaseUser, userProfileChangeRequest, (zzce) new zzb());
    }

    public final Task<Void> zza(String str, String str2, ActionCodeSettings actionCodeSettings) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        if (actionCodeSettings == null) {
            actionCodeSettings = ActionCodeSettings.zzb();
        }
        String str3 = this.zzi;
        if (str3 != null) {
            actionCodeSettings.zza(str3);
        }
        return this.zze.zza(str, str2, actionCodeSettings);
    }

    public Task<String> verifyPasswordResetCode(String str) {
        Preconditions.checkNotEmpty(str);
        return this.zze.zzd(this.zza, str, this.zzk);
    }

    private final Task<Void> zza(FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential, boolean z) {
        return new zzab(this, z, firebaseUser, emailAuthCredential).zza(this, this.zzk, z ? this.zzm : this.zzn, "EMAIL_PASSWORD_PROVIDER");
    }

    private final Task<AuthResult> zza(String str, String str2, String str3, FirebaseUser firebaseUser, boolean z) {
        return new zzz(this, str, z, firebaseUser, str2, str3).zza(this, str3, this.zzn, "EMAIL_PASSWORD_PROVIDER");
    }

    private final Task<AuthResult> zza(EmailAuthCredential emailAuthCredential, FirebaseUser firebaseUser, boolean z) {
        return new zzac(this, z, firebaseUser, emailAuthCredential).zza(this, this.zzk, this.zzm, "EMAIL_PASSWORD_PROVIDER");
    }

    public FirebaseApp getApp() {
        return this.zza;
    }

    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) FirebaseApp.getInstance().get(FirebaseAuth.class);
    }

    public static FirebaseAuth getInstance(FirebaseApp firebaseApp) {
        return (FirebaseAuth) firebaseApp.get(FirebaseAuth.class);
    }

    public FirebaseAuthSettings getFirebaseAuthSettings() {
        return this.zzg;
    }

    public FirebaseUser getCurrentUser() {
        return this.zzf;
    }

    final PhoneAuthProvider.OnVerificationStateChangedCallbacks zza(PhoneAuthOptions phoneAuthOptions, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, com.google.firebase.auth.internal.zzh zzhVar) {
        return phoneAuthOptions.zzj() ? onVerificationStateChangedCallbacks : new zzl(this, phoneAuthOptions, zzhVar, onVerificationStateChangedCallbacks);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PhoneAuthProvider.OnVerificationStateChangedCallbacks zza(String str, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks) {
        return (this.zzg.zzd() && str != null && str.equals(this.zzg.zza())) ? new zzm(this, onVerificationStateChangedCallbacks) : onVerificationStateChangedCallbacks;
    }

    public final synchronized zzbv zzb() {
        return this.zzl;
    }

    private final synchronized zzbz zzj() {
        return zzj(this);
    }

    private static zzbz zzj(FirebaseAuth firebaseAuth) {
        if (firebaseAuth.zzx == null) {
            firebaseAuth.zzx = new zzbz((FirebaseApp) Preconditions.checkNotNull(firebaseAuth.zza));
        }
        return firebaseAuth.zzx;
    }

    public final Provider<InteropAppCheckTokenProvider> zzc() {
        return this.zzv;
    }

    public final Provider<HeartBeatController> zzd() {
        return this.zzw;
    }

    public String getCustomAuthDomain() {
        return this.zzab;
    }

    public String getLanguageCode() {
        String str;
        synchronized (this.zzh) {
            str = this.zzi;
        }
        return str;
    }

    public String getTenantId() {
        String str;
        synchronized (this.zzj) {
            str = this.zzk;
        }
        return str;
    }

    @Override // com.google.firebase.auth.internal.InternalAuthProvider, com.google.firebase.internal.InternalTokenProvider
    public String getUid() {
        FirebaseUser firebaseUser = this.zzf;
        if (firebaseUser == null) {
            return null;
        }
        return firebaseUser.getUid();
    }

    public final Executor zze() {
        return this.zzy;
    }

    public final Executor zzf() {
        return this.zzz;
    }

    public final Executor zzg() {
        return this.zzaa;
    }

    public FirebaseAuth(FirebaseApp firebaseApp, Provider<InteropAppCheckTokenProvider> provider, Provider<HeartBeatController> provider2, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService, Executor executor4) {
        this(firebaseApp, new zzabj(firebaseApp, executor2, scheduledExecutorService), new zzca(firebaseApp.getApplicationContext(), firebaseApp.getPersistenceKey()), zzcf.zzc(), com.google.firebase.auth.internal.zza.zza(), provider, provider2, executor, executor2, executor3, executor4);
    }

    private FirebaseAuth(FirebaseApp firebaseApp, zzabj zzabjVar, zzca zzcaVar, zzcf zzcfVar, com.google.firebase.auth.internal.zza zzaVar, Provider<InteropAppCheckTokenProvider> provider, Provider<HeartBeatController> provider2, Executor executor, Executor executor2, Executor executor3, Executor executor4) {
        zzagl zza2;
        this.zzb = new CopyOnWriteArrayList();
        this.zzc = new CopyOnWriteArrayList();
        this.zzd = new CopyOnWriteArrayList();
        this.zzh = new Object();
        this.zzj = new Object();
        this.zzm = RecaptchaAction.custom("getOobCode");
        this.zzn = RecaptchaAction.custom("signInWithPassword");
        this.zzo = RecaptchaAction.custom("signUpPassword");
        this.zzp = RecaptchaAction.custom("sendVerificationCode");
        this.zzq = RecaptchaAction.custom("mfaSmsEnrollment");
        this.zzr = RecaptchaAction.custom("mfaSmsSignIn");
        this.zza = (FirebaseApp) Preconditions.checkNotNull(firebaseApp);
        this.zze = (zzabj) Preconditions.checkNotNull(zzabjVar);
        zzca zzcaVar2 = (zzca) Preconditions.checkNotNull(zzcaVar);
        this.zzs = zzcaVar2;
        this.zzg = new com.google.firebase.auth.internal.zzae();
        zzcf zzcfVar2 = (zzcf) Preconditions.checkNotNull(zzcfVar);
        this.zzt = zzcfVar2;
        this.zzu = (com.google.firebase.auth.internal.zza) Preconditions.checkNotNull(zzaVar);
        this.zzv = provider;
        this.zzw = provider2;
        this.zzy = executor2;
        this.zzz = executor3;
        this.zzaa = executor4;
        FirebaseUser zza3 = zzcaVar2.zza();
        this.zzf = zza3;
        if (zza3 != null && (zza2 = zzcaVar2.zza(zza3)) != null) {
            zza(this, this.zzf, zza2, false, false);
        }
        zzcfVar2.zza(this);
    }

    public void addAuthStateListener(AuthStateListener authStateListener) {
        this.zzd.add(authStateListener);
        this.zzaa.execute(new zzu(this, authStateListener));
    }

    public void addIdTokenListener(IdTokenListener idTokenListener) {
        this.zzb.add(idTokenListener);
        this.zzaa.execute(new zzh(this, idTokenListener));
    }

    @Override // com.google.firebase.auth.internal.InternalAuthProvider
    public void addIdTokenListener(com.google.firebase.auth.internal.IdTokenListener idTokenListener) {
        Preconditions.checkNotNull(idTokenListener);
        this.zzc.add(idTokenListener);
        zzj().zza(this.zzc.size());
    }

    public final void zzh() {
        Preconditions.checkNotNull(this.zzs);
        FirebaseUser firebaseUser = this.zzf;
        if (firebaseUser != null) {
            zzca zzcaVar = this.zzs;
            Preconditions.checkNotNull(firebaseUser);
            zzcaVar.zza(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", firebaseUser.getUid()));
            this.zzf = null;
        }
        this.zzs.zza("com.google.firebase.auth.FIREBASE_USER");
        zzb(this, (FirebaseUser) null);
        zza(this, (FirebaseUser) null);
    }

    public static void zza(final FirebaseException firebaseException, PhoneAuthOptions phoneAuthOptions, String str) {
        Log.e("FirebaseAuth", "Invoking verification failure callback for phone number/uid - " + str);
        final PhoneAuthProvider.OnVerificationStateChangedCallbacks zza2 = zzaer.zza(str, phoneAuthOptions.zze(), null);
        phoneAuthOptions.zzi().execute(new Runnable() { // from class: com.google.firebase.auth.zzi
            @Override // java.lang.Runnable
            public final void run() {
                PhoneAuthProvider.OnVerificationStateChangedCallbacks.this.onVerificationFailed(firebaseException);
            }
        });
    }

    public void removeAuthStateListener(AuthStateListener authStateListener) {
        this.zzd.remove(authStateListener);
    }

    public void removeIdTokenListener(IdTokenListener idTokenListener) {
        this.zzb.remove(idTokenListener);
    }

    @Override // com.google.firebase.auth.internal.InternalAuthProvider
    public void removeIdTokenListener(com.google.firebase.auth.internal.IdTokenListener idTokenListener) {
        Preconditions.checkNotNull(idTokenListener);
        this.zzc.remove(idTokenListener);
        zzj().zza(this.zzc.size());
    }

    public void setCustomAuthDomain(String str) {
        Preconditions.checkNotEmpty(str);
        if (str.startsWith("chrome-extension://")) {
            this.zzab = str;
            return;
        }
        try {
            this.zzab = (String) Preconditions.checkNotNull(new URI(str.contains("://") ? str : "http://" + str).getHost());
        } catch (URISyntaxException e) {
            if (Log.isLoggable("FirebaseAuth", 4)) {
                Log.i("FirebaseAuth", "Error parsing URL: '" + str + "', " + e.getMessage());
            }
            this.zzab = str;
        }
    }

    public void setLanguageCode(String str) {
        Preconditions.checkNotEmpty(str);
        synchronized (this.zzh) {
            this.zzi = str;
        }
    }

    public final synchronized void zza(zzbv zzbvVar) {
        this.zzl = zzbvVar;
    }

    public void setTenantId(String str) {
        Preconditions.checkNotEmpty(str);
        synchronized (this.zzj) {
            this.zzk = str;
        }
    }

    public final void zza(FirebaseUser firebaseUser, zzagl zzaglVar, boolean z) {
        zza(firebaseUser, zzaglVar, true, false);
    }

    final void zza(FirebaseUser firebaseUser, zzagl zzaglVar, boolean z, boolean z2) {
        zza(this, firebaseUser, zzaglVar, true, z2);
    }

    public void signOut() {
        zzh();
        zzbz zzbzVar = this.zzx;
        if (zzbzVar != null) {
            zzbzVar.zza();
        }
    }

    private static void zza(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        if (firebaseUser == null) {
            Log.d("FirebaseAuth", "Notifying auth state listeners about a sign-out event.");
        } else {
            Log.d("FirebaseAuth", "Notifying auth state listeners about user ( " + firebaseUser.getUid() + " ).");
        }
        firebaseAuth.zzaa.execute(new zzy(firebaseAuth));
    }

    private static void zzb(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        if (firebaseUser != null) {
            Log.d("FirebaseAuth", "Notifying id token listeners about user ( " + firebaseUser.getUid() + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying id token listeners about a sign-out event.");
        }
        firebaseAuth.zzaa.execute(new zzv(firebaseAuth, new InternalTokenResult(firebaseUser != null ? firebaseUser.zzd() : null)));
    }

    private static void zza(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser, zzagl zzaglVar, boolean z, boolean z2) {
        boolean z3;
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(zzaglVar);
        boolean z4 = true;
        boolean z5 = firebaseAuth.zzf != null && firebaseUser.getUid().equals(firebaseAuth.zzf.getUid());
        if (z5 || !z2) {
            FirebaseUser firebaseUser2 = firebaseAuth.zzf;
            if (firebaseUser2 == null) {
                z3 = true;
            } else {
                boolean z6 = (z5 && firebaseUser2.zzc().zzc().equals(zzaglVar.zzc())) ? false : true;
                z3 = z5 ? false : true;
                z4 = z6;
            }
            Preconditions.checkNotNull(firebaseUser);
            if (firebaseAuth.zzf == null || !firebaseUser.getUid().equals(firebaseAuth.getUid())) {
                firebaseAuth.zzf = firebaseUser;
            } else {
                firebaseAuth.zzf.zza(firebaseUser.getProviderData());
                if (!firebaseUser.isAnonymous()) {
                    firebaseAuth.zzf.zzb();
                }
                List<MultiFactorInfo> enrolledFactors = firebaseUser.getMultiFactor().getEnrolledFactors();
                List<zzan> zzf = firebaseUser.zzf();
                firebaseAuth.zzf.zzc(enrolledFactors);
                firebaseAuth.zzf.zzb(zzf);
            }
            if (z) {
                firebaseAuth.zzs.zzb(firebaseAuth.zzf);
            }
            if (z4) {
                FirebaseUser firebaseUser3 = firebaseAuth.zzf;
                if (firebaseUser3 != null) {
                    firebaseUser3.zza(zzaglVar);
                }
                zzb(firebaseAuth, firebaseAuth.zzf);
            }
            if (z3) {
                zza(firebaseAuth, firebaseAuth.zzf);
            }
            if (z) {
                firebaseAuth.zzs.zza(firebaseUser, zzaglVar);
            }
            FirebaseUser firebaseUser4 = firebaseAuth.zzf;
            if (firebaseUser4 != null) {
                zzj(firebaseAuth).zza(firebaseUser4.zzc());
            }
        }
    }

    public void useAppLanguage() {
        synchronized (this.zzh) {
            this.zzi = zzadx.zza();
        }
    }

    public void useEmulator(String str, int i) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkArgument(i >= 0 && i <= 65535, "Port number must be in the range 0-65535");
        zzafb.zza(this.zza, str, i);
    }

    public static void zza(PhoneAuthOptions phoneAuthOptions) {
        String checkNotEmpty;
        String phoneNumber;
        if (phoneAuthOptions.zzm()) {
            FirebaseAuth zzb2 = phoneAuthOptions.zzb();
            com.google.firebase.auth.internal.zzao zzaoVar = (com.google.firebase.auth.internal.zzao) Preconditions.checkNotNull(phoneAuthOptions.zzc());
            if (zzaoVar.zzd()) {
                phoneNumber = Preconditions.checkNotEmpty(phoneAuthOptions.zzh());
                checkNotEmpty = phoneNumber;
            } else {
                PhoneMultiFactorInfo phoneMultiFactorInfo = (PhoneMultiFactorInfo) Preconditions.checkNotNull(phoneAuthOptions.zzf());
                checkNotEmpty = Preconditions.checkNotEmpty(phoneMultiFactorInfo.getUid());
                phoneNumber = phoneMultiFactorInfo.getPhoneNumber();
            }
            if (phoneAuthOptions.zzd() == null || !zzaer.zza(checkNotEmpty, phoneAuthOptions.zze(), phoneAuthOptions.zza(), phoneAuthOptions.zzi())) {
                zzb2.zzu.zza(zzb2, phoneNumber, phoneAuthOptions.zza(), zzb2.zzi(), phoneAuthOptions.zzj(), phoneAuthOptions.zzl(), zzaoVar.zzd() ? zzb2.zzq : zzb2.zzr).addOnCompleteListener(new zzj(zzb2, phoneAuthOptions, checkNotEmpty));
                return;
            }
            return;
        }
        FirebaseAuth zzb3 = phoneAuthOptions.zzb();
        String checkNotEmpty2 = Preconditions.checkNotEmpty(phoneAuthOptions.zzh());
        if (phoneAuthOptions.zzd() == null && zzaer.zza(checkNotEmpty2, phoneAuthOptions.zze(), phoneAuthOptions.zza(), phoneAuthOptions.zzi())) {
            return;
        }
        zzb3.zzu.zza(zzb3, checkNotEmpty2, phoneAuthOptions.zza(), zzb3.zzi(), phoneAuthOptions.zzj(), phoneAuthOptions.zzl(), zzb3.zzp).addOnCompleteListener(new zzk(zzb3, phoneAuthOptions, checkNotEmpty2));
    }

    public final void zza(PhoneAuthOptions phoneAuthOptions, com.google.firebase.auth.internal.zzh zzhVar) {
        long longValue = phoneAuthOptions.zzg().longValue();
        if (longValue < 0 || longValue > 120) {
            throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
        }
        String checkNotEmpty = Preconditions.checkNotEmpty(phoneAuthOptions.zzh());
        String zzc2 = zzhVar.zzc();
        String zzb2 = zzhVar.zzb();
        String zzd = zzhVar.zzd();
        if (com.google.android.gms.internal.p002firebaseauthapi.zzag.zzc(zzc2) && zzb() != null && zzb().zza("PHONE_PROVIDER")) {
            zzc2 = "NO_RECAPTCHA";
        }
        String str = zzc2;
        zzagz zzagzVar = new zzagz(checkNotEmpty, longValue, phoneAuthOptions.zzd() != null, this.zzi, this.zzk, zzd, zzb2, str, zzi());
        PhoneAuthProvider.OnVerificationStateChangedCallbacks zza2 = zza(checkNotEmpty, phoneAuthOptions.zze());
        if (TextUtils.isEmpty(zzhVar.zzd())) {
            zza2 = zza(phoneAuthOptions, zza2, com.google.firebase.auth.internal.zzh.zza().zzc(zzd).zzb(str).zza(zzb2).zza());
        }
        this.zze.zza(this.zza, zzagzVar, zza2, phoneAuthOptions.zza(), phoneAuthOptions.zzi());
    }

    final boolean zzi() {
        return zzadn.zza(getApp().getApplicationContext());
    }

    public boolean isSignInWithEmailLink(String str) {
        return EmailAuthCredential.zza(str);
    }

    private final boolean zzb(String str) {
        ActionCodeUrl parseLink = ActionCodeUrl.parseLink(str);
        return (parseLink == null || TextUtils.equals(this.zzk, parseLink.zza())) ? false : true;
    }
}
