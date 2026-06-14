package com.google.android.gms.internal.p002firebaseauthapi;

import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzby {
    private boolean zza;
    private zzbr zzb;

    @Nullable
    private final zzch zzc;
    private zzbx zzd;

    @Nullable
    private zzbv zze;

    public final zzby zza() {
        zzbv zzbvVar = this.zze;
        if (zzbvVar != null) {
            zzbvVar.zzb();
        }
        this.zza = true;
        return this;
    }

    public final zzby zzb() {
        zzbx zzbxVar;
        zzbxVar = zzbx.zza;
        this.zzd = zzbxVar;
        return this;
    }

    private zzby(zzch zzchVar) {
        this.zzb = zzbr.zza;
        this.zzd = null;
        this.zze = null;
        this.zzc = zzchVar;
    }
}
