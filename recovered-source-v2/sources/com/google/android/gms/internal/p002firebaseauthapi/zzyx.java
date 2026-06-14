package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzil;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzyx implements zzrq {
    private static final zzil.zza zza = zzil.zza.zzb;
    private final ThreadLocal<Mac> zzb;
    private final String zzc;
    private final Key zzd;
    private final int zze;

    public zzyx(String str, Key key) throws GeneralSecurityException {
        zzyw zzywVar = new zzyw(this);
        this.zzb = zzywVar;
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zzc = str;
        this.zzd = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        str.hashCode();
        switch (str) {
            case "HMACSHA1":
                this.zze = 20;
                break;
            case "HMACSHA224":
                this.zze = 28;
                break;
            case "HMACSHA256":
                this.zze = 32;
                break;
            case "HMACSHA384":
                this.zze = 48;
                break;
            case "HMACSHA512":
                this.zze = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + str);
        }
        zzywVar.get();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzrq
    public final byte[] zza(byte[] bArr, int i) throws GeneralSecurityException {
        if (i > this.zze) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        this.zzb.get().update(bArr);
        return Arrays.copyOf(this.zzb.get().doFinal(), i);
    }
}
