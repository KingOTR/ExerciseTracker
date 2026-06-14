package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzafh extends zzagx {
    private String zza;
    private String zzb;
    private String zzc;
    private zzaga zzd;
    private String zze;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagx
    public final zzagx zza(String str) {
        if (str == null) {
            throw new NullPointerException("Null idToken");
        }
        this.zze = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagx
    public final zzagx zzb(String str) {
        if (str == null) {
            throw new NullPointerException("Null providerId");
        }
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagx
    public final zzagx zzc(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagx
    public final zzagx zzd(String str) {
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagx
    public final zzagx zza(zzaga zzagaVar) {
        if (zzagaVar == null) {
            throw new NullPointerException("Null tokenType");
        }
        this.zzd = zzagaVar;
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzagx
    public final zzagy zza() {
        if (this.zza == null || this.zzc == null || this.zzd == null || this.zze == null) {
            StringBuilder sb = new StringBuilder();
            if (this.zza == null) {
                sb.append(" providerId");
            }
            if (this.zzc == null) {
                sb.append(" token");
            }
            if (this.zzd == null) {
                sb.append(" tokenType");
            }
            if (this.zze == null) {
                sb.append(" idToken");
            }
            throw new IllegalStateException("Missing required properties:" + String.valueOf(sb));
        }
        return new zzafi(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }

    zzafh() {
    }
}
