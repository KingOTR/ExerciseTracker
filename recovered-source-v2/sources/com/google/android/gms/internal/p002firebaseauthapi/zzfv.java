package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzga;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfv extends zzcu {
    private final zzga zza;
    private final zzze zzb;
    private final zzzc zzc;

    @Nullable
    private final Integer zzd;

    public static zzfv zza(zzga.zza zzaVar, zzze zzzeVar, @Nullable Integer num) throws GeneralSecurityException {
        zzzc zzb;
        if (zzaVar != zzga.zza.zzc && num == null) {
            throw new GeneralSecurityException("For given Variant " + String.valueOf(zzaVar) + " the value of idRequirement must be non-null");
        }
        if (zzaVar == zzga.zza.zzc && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzzeVar.zza() != 32) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + zzzeVar.zza());
        }
        zzga zza = zzga.zza(zzaVar);
        if (zza.zzb() == zzga.zza.zzc) {
            zzb = zzog.zza;
        } else if (zza.zzb() == zzga.zza.zzb) {
            zzb = zzog.zza(num.intValue());
        } else {
            if (zza.zzb() != zzga.zza.zza) {
                throw new IllegalStateException("Unknown Variant: " + String.valueOf(zza.zzb()));
            }
            zzb = zzog.zzb(num.intValue());
        }
        return new zzfv(zza, zzzeVar, zzb, num);
    }

    public final zzga zzb() {
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

    private zzfv(zzga zzgaVar, zzze zzzeVar, zzzc zzzcVar, @Nullable Integer num) {
        this.zza = zzgaVar;
        this.zzb = zzzeVar;
        this.zzc = zzzcVar;
        this.zzd = num;
    }
}
