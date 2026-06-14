package com.google.firebase.auth.internal;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.internal.p002firebaseauthapi.zzagl;
import com.google.firebase.FirebaseApp;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes4.dex */
public final class zzbz {
    private volatile int zza;
    private final zzas zzb;
    private volatile boolean zzc;

    public zzbz(FirebaseApp firebaseApp) {
        this(firebaseApp.getApplicationContext(), new zzas(firebaseApp));
    }

    private zzbz(Context context, zzas zzasVar) {
        this.zzc = false;
        this.zza = 0;
        this.zzb = zzasVar;
        BackgroundDetector.initialize((Application) context.getApplicationContext());
        BackgroundDetector.getInstance().addListener(new zzcc(this));
    }

    public final void zza() {
        this.zzb.zzb();
    }

    public final void zza(int i) {
        if (i > 0 && this.zza == 0) {
            this.zza = i;
            if (zzb()) {
                this.zzb.zzc();
            }
        } else if (i == 0 && this.zza != 0) {
            this.zzb.zzb();
        }
        this.zza = i;
    }

    public final void zza(zzagl zzaglVar) {
        if (zzaglVar == null) {
            return;
        }
        long zza = zzaglVar.zza();
        if (zza <= 0) {
            zza = 3600;
        }
        long zzb = zzaglVar.zzb() + (zza * 1000);
        zzas zzasVar = this.zzb;
        zzasVar.zza = zzb;
        zzasVar.zzb = -1L;
        if (zzb()) {
            this.zzb.zzc();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zzb() {
        return this.zza > 0 && !this.zzc;
    }
}
