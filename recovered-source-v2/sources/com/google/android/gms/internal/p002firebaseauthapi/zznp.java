package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zznp {
    private final zzbr zza;
    private final int zzb;
    private final String zzc;
    private final String zzd;

    public final int zza() {
        return this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    private zznp(zzbr zzbrVar, int i, String str, String str2) {
        this.zza = zzbrVar;
        this.zzb = i;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zznp)) {
            return false;
        }
        zznp zznpVar = (zznp) obj;
        return this.zza == zznpVar.zza && this.zzb == zznpVar.zzb && this.zzc.equals(zznpVar.zzc) && this.zzd.equals(zznpVar.zzd);
    }
}
