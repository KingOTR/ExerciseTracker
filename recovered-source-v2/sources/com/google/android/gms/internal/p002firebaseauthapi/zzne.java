package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.health.connect.client.records.metadata.DeviceTypes;
import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzne extends zzch {
    private final zzpf zza;

    public final int hashCode() {
        return Objects.hash(this.zza.zza(), this.zza.zzc());
    }

    public final zzpf zzb() {
        return this.zza;
    }

    public final String toString() {
        String str;
        String zzf = this.zza.zza().zzf();
        int i = zznh.zza[this.zza.zza().zzd().ordinal()];
        if (i == 1) {
            str = "TINK";
        } else if (i == 2) {
            str = "LEGACY";
        } else if (i == 3) {
            str = "RAW";
        } else if (i == 4) {
            str = "CRUNCHY";
        } else {
            str = DeviceTypes.UNKNOWN;
        }
        return String.format("(typeUrl=%s, outputPrefixType=%s)", zzf, str);
    }

    public zzne(zzpf zzpfVar) {
        this.zza = zzpfVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzne)) {
            return false;
        }
        zzpf zzpfVar = ((zzne) obj).zza;
        return this.zza.zza().zzd().equals(zzpfVar.zza().zzd()) && this.zza.zza().zzf().equals(zzpfVar.zza().zzf()) && this.zza.zza().zze().equals(zzpfVar.zza().zze());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzch
    public final boolean zza() {
        return this.zza.zza().zzd() != zzws.RAW;
    }
}
