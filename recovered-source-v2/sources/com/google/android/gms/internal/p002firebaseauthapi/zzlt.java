package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzlt implements zzbo {
    private final zzbo zza;
    private final byte[] zzb;

    public static zzbo zza(zznc zzncVar) throws GeneralSecurityException {
        byte[] zzb;
        zzpc zza = zzncVar.zza(zzbq.zza());
        zzbo zzboVar = (zzbo) zzco.zza((zzvq) ((zzajy) zzvq.zza().zza(zza.zzf()).zza(zza.zzd()).zza(zza.zza()).zze()), zzbo.class);
        zzws zzb2 = zza.zzb();
        int i = zzls.zza[zzb2.ordinal()];
        if (i == 1) {
            zzb = zzog.zza.zzb();
        } else if (i == 2 || i == 3) {
            zzb = zzog.zza(zzncVar.zza().intValue()).zzb();
        } else {
            if (i != 4) {
                throw new GeneralSecurityException("unknown output prefix type " + String.valueOf(zzb2));
            }
            zzb = zzog.zzb(zzncVar.zza().intValue()).zzb();
        }
        return new zzlt(zzboVar, zzb);
    }

    private zzlt(zzbo zzboVar, byte[] bArr) {
        this.zza = zzboVar;
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbo
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return this.zza.zza(bArr, bArr2);
        }
        if (!zzpr.zza(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
        }
        return this.zza.zza(Arrays.copyOfRange(bArr, this.zzb.length, bArr.length), bArr2);
    }
}
