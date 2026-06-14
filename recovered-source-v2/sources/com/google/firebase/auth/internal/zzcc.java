package com.google.firebase.auth.internal;

import com.google.android.gms.common.api.internal.BackgroundDetector;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes4.dex */
final class zzcc implements BackgroundDetector.BackgroundStateChangeListener {
    private final /* synthetic */ zzbz zza;

    zzcc(zzbz zzbzVar) {
        this.zza = zzbzVar;
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z) {
        boolean zzb;
        zzas zzasVar;
        if (z) {
            this.zza.zzc = true;
            this.zza.zza();
            return;
        }
        this.zza.zzc = false;
        zzb = this.zza.zzb();
        if (zzb) {
            zzasVar = this.zza.zzb;
            zzasVar.zzc();
        }
    }
}
