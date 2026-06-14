package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzkv implements zzkw {
    private final zzdg zza;
    private final int zzb;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkw
    public final int zza() {
        return this.zzb;
    }

    public zzkv(zzdg zzdgVar) {
        this.zza = zzdgVar;
        this.zzb = zzdgVar.zzb() + zzdgVar.zzc();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkw
    public final byte[] zza(byte[] bArr, byte[] bArr2, int i) throws GeneralSecurityException {
        byte[] bArr3;
        if (bArr2.length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr2, i, bArr2.length);
        zzbg zza = zzyc.zza(zzcz.zzb().zza(this.zza).zza(zzze.zza(Arrays.copyOf(bArr, this.zza.zzb()), zzbq.zza())).zzb(zzze.zza(Arrays.copyOfRange(bArr, this.zza.zzb(), this.zza.zzb() + this.zza.zzc()), zzbq.zza())).zza());
        bArr3 = zzks.zza;
        return zza.zza(copyOfRange, bArr3);
    }
}
