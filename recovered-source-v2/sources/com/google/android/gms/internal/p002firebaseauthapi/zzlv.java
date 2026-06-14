package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzlv implements zzbn {
    public static zzbn zza(zznc zzncVar) throws GeneralSecurityException {
        byte[] zzb;
        zzpc zza = zzncVar.zza(zzbq.zza());
        zzbn zzbnVar = (zzbn) zzco.zza((zzvq) ((zzajy) zzvq.zza().zza(zza.zzf()).zza(zza.zzd()).zza(zza.zza()).zze()), zzbn.class);
        zzws zzb2 = zza.zzb();
        int i = zzlu.zza[zzb2.ordinal()];
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
        return new zzlv(zzbnVar, zzb);
    }

    private zzlv(zzbn zzbnVar, byte[] bArr) {
    }
}
