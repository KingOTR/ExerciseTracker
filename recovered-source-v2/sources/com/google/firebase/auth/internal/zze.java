package com.google.firebase.auth.internal;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes4.dex */
final class zze implements OnFailureListener {
    private final /* synthetic */ FirebaseAuth zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ Activity zzc;
    private final /* synthetic */ boolean zzd;
    private final /* synthetic */ boolean zze;
    private final /* synthetic */ zzcf zzf;
    private final /* synthetic */ TaskCompletionSource zzg;
    private final /* synthetic */ zza zzh;

    zze(zza zzaVar, FirebaseAuth firebaseAuth, String str, Activity activity, boolean z, boolean z2, zzcf zzcfVar, TaskCompletionSource taskCompletionSource) {
        this.zza = firebaseAuth;
        this.zzb = str;
        this.zzc = activity;
        this.zzd = z;
        this.zze = z2;
        this.zzf = zzcfVar;
        this.zzg = taskCompletionSource;
        this.zzh = zzaVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        String str;
        str = zza.zza;
        Log.e(str, "Failed to get reCAPTCHA enterprise token: " + exc.getMessage() + "\n\n Using fallback methods.");
        if (this.zza.zzb().zza("PHONE_PROVIDER")) {
            this.zzh.zza(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, (TaskCompletionSource<zzh>) this.zzg);
        } else {
            this.zzg.setResult(new zzo().zza());
        }
    }
}
