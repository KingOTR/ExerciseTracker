package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzft;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfp extends zzcu {
    private final zzft zza;
    private final zzze zzb;
    private final zzzc zzc;

    @Nullable
    private final Integer zzd;

    public static zzfp zza(zzft zzftVar, zzze zzzeVar, @Nullable Integer num) throws GeneralSecurityException {
        zzzc zzb;
        if (zzftVar.zzc() != zzft.zza.zzb && num == null) {
            throw new GeneralSecurityException("For given Variant " + String.valueOf(zzftVar.zzc()) + " the value of idRequirement must be non-null");
        }
        if (zzftVar.zzc() == zzft.zza.zzb && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzzeVar.zza() != 32) {
            throw new GeneralSecurityException("XAesGcmKey key must be constructed with key of length 32 bytes, not " + zzzeVar.zza());
        }
        if (zzftVar.zzc() == zzft.zza.zzb) {
            zzb = zzog.zza;
        } else {
            if (zzftVar.zzc() != zzft.zza.zza) {
                throw new IllegalStateException("Unknown Variant: " + String.valueOf(zzftVar.zzc()));
            }
            zzb = zzog.zzb(num.intValue());
        }
        return new zzfp(zzftVar, zzzeVar, zzb, num);
    }

    public final zzft zzb() {
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

    private zzfp(zzft zzftVar, zzze zzzeVar, zzzc zzzcVar, @Nullable Integer num) {
        this.zza = zzftVar;
        this.zzb = zzzeVar;
        this.zzc = zzzcVar;
        this.zzd = num;
    }
}
