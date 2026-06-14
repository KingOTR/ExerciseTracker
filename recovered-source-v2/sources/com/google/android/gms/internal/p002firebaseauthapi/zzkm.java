package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzua;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzkm {
    public static final zzvu zza;
    private static final byte[] zzb;

    @Deprecated
    private static zzvu zza(zzup zzupVar, zzur zzurVar, zztu zztuVar, zzvu zzvuVar, zzws zzwsVar, byte[] bArr) {
        zzua.zza zza2 = zzua.zza();
        zzum zzumVar = (zzum) ((zzajy) zzum.zza().zza(zzupVar).zza(zzurVar).zza(zzaip.zza(bArr)).zze());
        return (zzvu) ((zzajy) zzvu.zza().zza(zzjl.zza()).zza(zzwsVar).zza(((zzua) ((zzajy) zza2.zza((zzud) ((zzajy) zzud.zzc().zza(zzumVar).zza((zztx) ((zzajy) zztx.zza().zza(zzvuVar).zze())).zza(zztuVar).zze())).zze())).a_()).zze());
    }

    static {
        byte[] bArr = new byte[0];
        zzb = bArr;
        zza = zza(zzup.NIST_P256, zzur.SHA256, zztu.UNCOMPRESSED, zzct.zza, zzws.TINK, bArr);
        zza(zzup.NIST_P256, zzur.SHA256, zztu.COMPRESSED, zzct.zza, zzws.RAW, bArr);
        zza(zzup.NIST_P256, zzur.SHA256, zztu.UNCOMPRESSED, zzct.zzb, zzws.TINK, bArr);
    }
}
