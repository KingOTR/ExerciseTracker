package com.google.android.gms.internal.p002firebaseauthapi;

import javax.annotation.CheckForNull;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
abstract class zzae extends zzf<String> {
    final CharSequence zza;
    private final zzh zzb;
    private final boolean zzc;
    private int zzd = 0;
    private int zze;

    abstract int zza(int i);

    abstract int zzb(int i);

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzf
    @CheckForNull
    protected final /* synthetic */ String zza() {
        int i = this.zzd;
        while (true) {
            int i2 = this.zzd;
            if (i2 == -1) {
                zzb();
                return null;
            }
            int zzb = zzb(i2);
            if (zzb == -1) {
                zzb = this.zza.length();
                this.zzd = -1;
            } else {
                this.zzd = zza(zzb);
            }
            int i3 = this.zzd;
            if (i3 != i) {
                while (i < zzb && this.zzb.zza(this.zza.charAt(i))) {
                    i++;
                }
                while (zzb > i && this.zzb.zza(this.zza.charAt(zzb - 1))) {
                    zzb--;
                }
                int i4 = this.zze;
                if (i4 == 1) {
                    zzb = this.zza.length();
                    this.zzd = -1;
                    while (zzb > i && this.zzb.zza(this.zza.charAt(zzb - 1))) {
                        zzb--;
                    }
                } else {
                    this.zze = i4 - 1;
                }
                return this.zza.subSequence(i, zzb).toString();
            }
            int i5 = i3 + 1;
            this.zzd = i5;
            if (i5 > this.zza.length()) {
                this.zzd = -1;
            }
        }
    }

    protected zzae(zzx zzxVar, CharSequence charSequence) {
        zzh zzhVar;
        int i;
        zzhVar = zzxVar.zza;
        this.zzb = zzhVar;
        this.zzc = false;
        i = zzxVar.zzc;
        this.zze = i;
        this.zza = charSequence;
    }
}
