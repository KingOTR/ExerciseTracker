package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzjj implements zzbl {
    private final zzbl zza;
    private final zzws zzb;
    private final byte[] zzc;

    public static zzbl zza(zznc zzncVar) throws GeneralSecurityException {
        byte[] zzb;
        zzpc zza = zzncVar.zza(zzbq.zza());
        zzvq zzvqVar = (zzvq) ((zzajy) zzvq.zza().zza(zza.zzf()).zza(zza.zzd()).zza(zza.zza()).zze());
        zzpg.zza();
        zzbl zzblVar = (zzbl) zzpg.zza(zzvqVar, zzbl.class);
        zzws zzb2 = zza.zzb();
        int i = zzjm.zza[zzb2.ordinal()];
        if (i == 1) {
            zzb = zzog.zza.zzb();
        } else if (i == 2 || i == 3) {
            zzb = zzog.zza(zzncVar.zza().intValue()).zzb();
        } else {
            if (i != 4) {
                throw new GeneralSecurityException("unknown output prefix type " + zzb2.zza());
            }
            zzb = zzog.zzb(zzncVar.zza().intValue()).zzb();
        }
        return new zzjj(zzblVar, zzb2, zzb);
    }

    private zzjj(zzbl zzblVar, zzws zzwsVar, byte[] bArr) {
        this.zza = zzblVar;
        this.zzb = zzwsVar;
        this.zzc = bArr;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbl
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (this.zzb == zzws.RAW) {
            return this.zza.zza(bArr, bArr2);
        }
        if (!zzpr.zza(this.zzc, bArr)) {
            throw new GeneralSecurityException("wrong prefix");
        }
        return this.zza.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
    }
}
