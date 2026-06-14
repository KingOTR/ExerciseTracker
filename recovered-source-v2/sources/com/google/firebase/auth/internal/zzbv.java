package com.google.firebase.auth.internal;

import androidx.webkit.ProxyConfig;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzagm;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes4.dex */
public final class zzbv {
    FirebaseApp zza;
    zzbu zzb;
    private final Object zzc;
    private final Map<String, Task<RecaptchaTasksClient>> zzd;
    private zzagm zze;
    private FirebaseAuth zzf;

    private final Task<RecaptchaTasksClient> zzc(String str) {
        Task<RecaptchaTasksClient> task;
        synchronized (this.zzc) {
            task = this.zzd.get(str);
        }
        return task;
    }

    public final Task<String> zza(String str, Boolean bool, RecaptchaAction recaptchaAction) {
        String zzd = zzd(str);
        Task<RecaptchaTasksClient> zzc = zzc(zzd);
        if (bool.booleanValue() || zzc == null) {
            zzc = zza(zzd, bool);
        }
        return zzc.continueWithTask(new zzbx(this, recaptchaAction));
    }

    public final Task<RecaptchaTasksClient> zza(String str, Boolean bool) {
        Task<RecaptchaTasksClient> zzc;
        String zzd = zzd(str);
        return (bool.booleanValue() || (zzc = zzc(zzd)) == null) ? this.zzf.zza("RECAPTCHA_ENTERPRISE").continueWithTask(new zzby(this, zzd)) : zzc;
    }

    private static String zzd(String str) {
        return com.google.android.gms.internal.p002firebaseauthapi.zzag.zzc(str) ? ProxyConfig.MATCH_ALL_SCHEMES : str;
    }

    static /* synthetic */ void zza(zzbv zzbvVar, zzagm zzagmVar, Task task, String str) {
        synchronized (zzbvVar.zzc) {
            zzbvVar.zze = zzagmVar;
            zzbvVar.zzd.put(str, task);
        }
    }

    public zzbv(FirebaseApp firebaseApp, FirebaseAuth firebaseAuth) {
        this(firebaseApp, firebaseAuth, new zzbt());
    }

    private zzbv(FirebaseApp firebaseApp, FirebaseAuth firebaseAuth, zzbu zzbuVar) {
        this.zzc = new Object();
        this.zzd = new HashMap();
        this.zza = firebaseApp;
        this.zzf = firebaseAuth;
        this.zzb = zzbuVar;
    }

    public final boolean zza(String str) {
        String zzb;
        Preconditions.checkNotNull(str);
        zzagm zzagmVar = this.zze;
        if (zzagmVar == null || (zzb = zzagmVar.zzb(str)) == null) {
            return false;
        }
        return zzb.equals("AUDIT");
    }

    public final boolean zzb(String str) {
        boolean z;
        synchronized (this.zzc) {
            zzagm zzagmVar = this.zze;
            z = zzagmVar != null && zzagmVar.zzc(str);
        }
        return z;
    }
}
