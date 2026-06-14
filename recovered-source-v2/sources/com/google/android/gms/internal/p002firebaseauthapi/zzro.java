package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzro implements zzci {
    private static final byte[] zza = {0};
    private final zzci zzb;
    private final zzws zzc;
    private final byte[] zzd;

    public static zzci zza(zznc zzncVar) throws GeneralSecurityException {
        byte[] zzb;
        zzpc zza2 = zzncVar.zza(zzbq.zza());
        zzvq zzvqVar = (zzvq) ((zzajy) zzvq.zza().zza(zza2.zzf()).zza(zza2.zzd()).zza(zza2.zza()).zze());
        zzpg.zza();
        zzci zzciVar = (zzci) zzpg.zza(zzvqVar, zzci.class);
        zzws zzb2 = zza2.zzb();
        int i = zzrn.zza[zzb2.ordinal()];
        if (i == 1) {
            zzb = zzog.zza.zzb();
        } else if (i == 2 || i == 3) {
            zzb = zzog.zza(zzncVar.zza().intValue()).zzb();
        } else {
            if (i != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            zzb = zzog.zzb(zzncVar.zza().intValue()).zzb();
        }
        return new zzro(zzciVar, zzb2, zzb);
    }

    private zzro(zzci zzciVar, zzws zzwsVar, byte[] bArr) {
        this.zzb = zzciVar;
        this.zzc = zzwsVar;
        this.zzd = bArr;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzci
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 10) {
            throw new GeneralSecurityException("tag too short");
        }
        if (this.zzc.equals(zzws.LEGACY)) {
            bArr2 = zzxv.zza(bArr2, zza);
        }
        byte[] bArr3 = new byte[0];
        if (!this.zzc.equals(zzws.RAW)) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            bArr = Arrays.copyOfRange(bArr, 5, bArr.length);
            bArr3 = copyOf;
        }
        if (!Arrays.equals(this.zzd, bArr3)) {
            throw new GeneralSecurityException("wrong prefix");
        }
        this.zzb.zza(bArr, bArr2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzci
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        if (this.zzc.equals(zzws.LEGACY)) {
            bArr = zzxv.zza(bArr, zza);
        }
        return zzxv.zza(this.zzd, this.zzb.zza(bArr));
    }
}
