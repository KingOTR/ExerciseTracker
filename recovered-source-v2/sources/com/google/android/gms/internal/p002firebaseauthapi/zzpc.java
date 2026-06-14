package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzpc implements zzpj {
    private final String zza;
    private final zzzc zzb;
    private final zzaip zzc;
    private final zzvq.zzb zzd;
    private final zzws zze;

    @Nullable
    private final Integer zzf;

    public static zzpc zza(String str, zzaip zzaipVar, zzvq.zzb zzbVar, zzws zzwsVar, @Nullable Integer num) throws GeneralSecurityException {
        if (zzwsVar == zzws.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new zzpc(str, zzpr.zza(str), zzaipVar, zzbVar, zzwsVar, num);
    }

    public final zzvq.zzb zza() {
        return this.zzd;
    }

    public final zzws zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpj
    public final zzzc zzc() {
        return this.zzb;
    }

    public final zzaip zzd() {
        return this.zzc;
    }

    @Nullable
    public final Integer zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zza;
    }

    private zzpc(String str, zzzc zzzcVar, zzaip zzaipVar, zzvq.zzb zzbVar, zzws zzwsVar, @Nullable Integer num) {
        this.zza = str;
        this.zzb = zzzcVar;
        this.zzc = zzaipVar;
        this.zzd = zzbVar;
        this.zze = zzwsVar;
        this.zzf = num;
    }
}
