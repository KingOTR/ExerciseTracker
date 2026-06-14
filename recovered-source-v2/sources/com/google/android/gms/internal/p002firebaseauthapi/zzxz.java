package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzxz {
    private ECPrivateKey zza;

    public zzxz(ECPrivateKey eCPrivateKey) {
        this.zza = eCPrivateKey;
    }

    public final byte[] zza(byte[] bArr, String str, byte[] bArr2, byte[] bArr3, int i, zzyd zzydVar) throws GeneralSecurityException {
        byte[] zza = zzxv.zza(bArr, zzyb.zza(this.zza, zzyb.zza(this.zza.getParams(), zzydVar, bArr)));
        Mac zza2 = zzyf.zzb.zza(str);
        if (i > zza2.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        if (bArr2 == null || bArr2.length == 0) {
            zza2.init(new SecretKeySpec(new byte[zza2.getMacLength()], str));
        } else {
            zza2.init(new SecretKeySpec(bArr2, str));
        }
        byte[] bArr4 = new byte[i];
        zza2.init(new SecretKeySpec(zza2.doFinal(zza), str));
        byte[] bArr5 = new byte[0];
        int i2 = 1;
        int i3 = 0;
        while (true) {
            zza2.update(bArr5);
            zza2.update(bArr3);
            zza2.update((byte) i2);
            bArr5 = zza2.doFinal();
            if (bArr5.length + i3 < i) {
                System.arraycopy(bArr5, 0, bArr4, i3, bArr5.length);
                i3 += bArr5.length;
                i2++;
            } else {
                System.arraycopy(bArr5, 0, bArr4, i3, i - i3);
                return bArr4;
            }
        }
    }
}
