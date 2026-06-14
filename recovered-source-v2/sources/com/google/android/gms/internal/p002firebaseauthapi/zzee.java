package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzei;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzee extends zzcu {
    private final zzei zza;
    private final zzze zzb;
    private final zzzc zzc;

    @Nullable
    private final Integer zzd;

    public static zzee zza(zzei.zza zzaVar, zzze zzzeVar, @Nullable Integer num) throws GeneralSecurityException {
        zzzc zzb;
        if (zzaVar != zzei.zza.zzc && num == null) {
            throw new GeneralSecurityException("For given Variant " + String.valueOf(zzaVar) + " the value of idRequirement must be non-null");
        }
        if (zzaVar == zzei.zza.zzc && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzzeVar.zza() != 32) {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + zzzeVar.zza());
        }
        zzei zza = zzei.zza(zzaVar);
        if (zza.zzb() == zzei.zza.zzc) {
            zzb = zzog.zza;
        } else if (zza.zzb() == zzei.zza.zzb) {
            zzb = zzog.zza(num.intValue());
        } else {
            if (zza.zzb() != zzei.zza.zza) {
                throw new IllegalStateException("Unknown Variant: " + String.valueOf(zza.zzb()));
            }
            zzb = zzog.zzb(num.intValue());
        }
        return new zzee(zza, zzzeVar, zzb, num);
    }

    public final zzei zzb() {
        return this.zza;
    }

    public final zzzc zzc() {
        return this.zzc;
    }

    public final zzze zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbp
    @Nullable
    public final Integer zza() {
        return this.zzd;
    }

    private zzee(zzei zzeiVar, zzze zzzeVar, zzzc zzzcVar, @Nullable Integer num) {
        this.zza = zzeiVar;
        this.zzb = zzzeVar;
        this.zzc = zzzcVar;
        this.zzd = num;
    }
}
