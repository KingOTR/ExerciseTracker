package com.google.firebase.auth.internal;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzadg;
import com.google.android.gms.internal.p002firebaseauthapi.zzaep;
import com.google.android.gms.internal.p002firebaseauthapi.zzafb;
import com.google.android.gms.internal.p002firebaseauthapi.zzagh;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.FirebaseAuthMissingActivityForRecaptchaException;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes4.dex */
public class zza {
    private static final String zza = "zza";
    private static final zza zzb = new zza();
    private String zzc;

    public final Task<zzh> zza(final FirebaseAuth firebaseAuth, final String str, final Activity activity, final boolean z, boolean z2, boolean z3, final RecaptchaAction recaptchaAction) {
        zzae zzaeVar = (zzae) firebaseAuth.getFirebaseAuthSettings();
        final zzcf zzc = zzcf.zzc();
        if (zzafb.zza(firebaseAuth.getApp()) || zzaeVar.zze()) {
            return Tasks.forResult(new zzo().zza());
        }
        String str2 = zza;
        Log.i(str2, "ForceRecaptchaV2Flow from phoneAuthOptions = " + z2 + ", ForceRecaptchav2Flow from firebaseSettings = " + zzaeVar.zzc());
        boolean z4 = z2 || zzaeVar.zzc();
        final TaskCompletionSource<zzh> taskCompletionSource = new TaskCompletionSource<>();
        Task<String> zzb2 = zzc.zzb();
        if (zzb2 != null) {
            if (zzb2.isSuccessful()) {
                return Tasks.forResult(new zzo().zzc(zzb2.getResult()).zza());
            }
            Log.e(str2, "Error in previous reCAPTCHAV2 flow: " + zzb2.getException().getMessage());
            Log.e(str2, "Continuing with application verification as normal");
        }
        if (z4 || z3) {
            zza(firebaseAuth, str, activity, z, z4, zzc, taskCompletionSource);
        } else {
            final boolean z5 = false;
            firebaseAuth.initializeRecaptchaConfig().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.firebase.auth.internal.zzc
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    zza.this.zza(taskCompletionSource, firebaseAuth, recaptchaAction, str, activity, z, z5, zzc, task);
                }
            });
        }
        return taskCompletionSource.getTask();
    }

    public static zza zza() {
        return zzb;
    }

    private zza() {
    }

    private final void zza(FirebaseAuth firebaseAuth, zzcf zzcfVar, Activity activity, TaskCompletionSource<zzh> taskCompletionSource) {
        Task<String> task;
        if (activity == null) {
            taskCompletionSource.setException(new FirebaseAuthMissingActivityForRecaptchaException());
            return;
        }
        zzbm.zza(firebaseAuth.getApp().getApplicationContext(), firebaseAuth);
        Preconditions.checkNotNull(activity);
        TaskCompletionSource<String> taskCompletionSource2 = new TaskCompletionSource<>();
        if (!zzav.zza().zza(activity, taskCompletionSource2)) {
            task = Tasks.forException(zzadg.zza(new Status(17057, "reCAPTCHA flow already in progress")));
        } else {
            new zzaep(firebaseAuth, activity).zza();
            task = taskCompletionSource2.getTask();
        }
        task.addOnSuccessListener(new zzi(this, taskCompletionSource)).addOnFailureListener(new zzf(this, taskCompletionSource));
    }

    final /* synthetic */ void zza(TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, zzcf zzcfVar, Activity activity, Task task) {
        if (task.isSuccessful() && task.getResult() != null && !TextUtils.isEmpty(((IntegrityTokenResponse) task.getResult()).token())) {
            taskCompletionSource.setResult(new zzo().zza(((IntegrityTokenResponse) task.getResult()).token()).zza());
        } else {
            Log.e(zza, "Play Integrity Token fetch failed, falling back to Recaptcha" + (task.getException() == null ? "" : task.getException().getMessage()));
            zza(firebaseAuth, zzcfVar, activity, taskCompletionSource);
        }
    }

    final /* synthetic */ void zza(TaskCompletionSource taskCompletionSource, FirebaseAuth firebaseAuth, RecaptchaAction recaptchaAction, String str, Activity activity, boolean z, boolean z2, zzcf zzcfVar, Task task) {
        if (!task.isSuccessful()) {
            Log.e(zza, "Failed to initialize reCAPTCHA config: " + task.getException().getMessage());
        }
        if (firebaseAuth.zzb() != null && firebaseAuth.zzb().zzb("PHONE_PROVIDER")) {
            firebaseAuth.zzb().zza(firebaseAuth.getTenantId(), false, recaptchaAction).addOnSuccessListener(new zzd(this, taskCompletionSource)).addOnFailureListener(new zze(this, firebaseAuth, str, activity, z, z2, zzcfVar, taskCompletionSource));
        } else {
            zza(firebaseAuth, str, activity, z, z2, zzcfVar, (TaskCompletionSource<zzh>) taskCompletionSource);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(final FirebaseAuth firebaseAuth, String str, final Activity activity, boolean z, boolean z2, final zzcf zzcfVar, final TaskCompletionSource<zzh> taskCompletionSource) {
        Task<zzagh> zza2;
        if (z && !z2) {
            IntegrityManager create = IntegrityManagerFactory.create(firebaseAuth.getApp().getApplicationContext());
            if (!TextUtils.isEmpty(this.zzc)) {
                zza2 = Tasks.forResult(new zzagh(this.zzc));
            } else {
                zza2 = firebaseAuth.zza();
            }
            zza2.continueWithTask(firebaseAuth.zzf(), new zzg(this, str, create)).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.firebase.auth.internal.zzb
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    zza.this.zza(taskCompletionSource, firebaseAuth, zzcfVar, activity, task);
                }
            });
            return;
        }
        zza(firebaseAuth, zzcfVar, activity, taskCompletionSource);
    }

    public static boolean zza(Exception exc) {
        if (exc instanceof FirebaseAuthMissingActivityForRecaptchaException) {
            return true;
        }
        return (exc instanceof FirebaseAuthException) && ((FirebaseAuthException) exc).getErrorCode().endsWith("UNAUTHORIZED_DOMAIN");
    }
}
