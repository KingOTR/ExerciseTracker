package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzkx implements zzkw {
    private final zziv zza;
    private final int zzb;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkw
    public final int zza() {
        return this.zzb;
    }

    public zzkx(zziv zzivVar) {
        this.zza = zzivVar;
        this.zzb = zzivVar.zzb();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkw
    public final byte[] zza(byte[] bArr, byte[] bArr2, int i) throws GeneralSecurityException {
        byte[] bArr3;
        if (bArr2.length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr2, i, bArr2.length);
        zzbl zza = zzxt.zza(zzio.zzb().zza(this.zza).zza(zzze.zza(bArr, zzbq.zza())).zza());
        bArr3 = zzks.zza;
        return zza.zza(copyOfRange, bArr3);
    }
}
