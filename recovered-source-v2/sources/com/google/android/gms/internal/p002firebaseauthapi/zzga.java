package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzga extends zzcw {
    private final zza zza;

    public final int hashCode() {
        return Objects.hash(zzga.class, this.zza);
    }

    public final zza zzb() {
        return this.zza;
    }

    public static zzga zzc() {
        return new zzga(zza.zzc);
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static final class zza {
        public static final zza zza = new zza("TINK");
        public static final zza zzb = new zza("CRUNCHY");
        public static final zza zzc = new zza("NO_PREFIX");
        private final String zzd;

        public final String toString() {
            return this.zzd;
        }

        private zza(String str) {
            this.zzd = str;
        }
    }

    public static zzga zza(zza zzaVar) {
        return new zzga(zzaVar);
    }

    public final String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + String.valueOf(this.zza) + ")";
    }

    private zzga(zza zzaVar) {
        this.zza = zzaVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzga) && ((zzga) obj).zza == this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzch
    public final boolean zza() {
        return this.zza != zza.zzc;
    }
}
