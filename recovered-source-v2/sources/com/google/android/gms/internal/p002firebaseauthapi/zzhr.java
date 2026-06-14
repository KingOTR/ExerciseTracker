package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzhr implements zzbg {
    private final zzbg zza;
    private final byte[] zzb;

    public static zzbg zza(zznc zzncVar) throws GeneralSecurityException {
        byte[] zzb;
        zzpc zza = zzncVar.zza(zzbq.zza());
        zzvq zzvqVar = (zzvq) ((zzajy) zzvq.zza().zza(zza.zzf()).zza(zza.zzd()).zza(zza.zza()).zze());
        zzpg.zza();
        zzbg zzbgVar = (zzbg) zzpg.zza(zzvqVar, zzbg.class);
        zzws zzb2 = zza.zzb();
        int i = zzhu.zza[zzb2.ordinal()];
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
        return new zzhr(zzbgVar, zzb);
    }

    public static zzbg zza(zzbg zzbgVar, zzzc zzzcVar) {
        return new zzhr(zzbgVar, zzzcVar.zzb());
    }

    private zzhr(zzbg zzbgVar, byte[] bArr) {
        this.zza = zzbgVar;
        if (bArr.length != 0 && bArr.length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbg
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return this.zza.zza(bArr, bArr2);
        }
        if (!zzpr.zza(bArr3, bArr)) {
            throw new GeneralSecurityException("wrong prefix");
        }
        return this.zza.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbg
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return this.zza.zzb(bArr, bArr2);
        }
        return zzxv.zza(bArr3, this.zza.zzb(bArr, bArr2));
    }
}
