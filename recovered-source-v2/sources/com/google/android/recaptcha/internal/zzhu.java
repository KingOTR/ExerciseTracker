package com.google.android.recaptcha.internal;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
final class zzhu extends zzhk implements Serializable {
    private final MessageDigest zza;
    private final int zzb;
    private final boolean zzc;
    private final String zzd;

    zzhu(String str, String str2) {
        MessageDigest zzc = zzc("SHA-256");
        this.zza = zzc;
        this.zzb = zzc.getDigestLength();
        this.zzd = "Hashing.sha256()";
        this.zzc = zzd(zzc);
    }

    private static MessageDigest zzc(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    private static boolean zzd(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    public final String toString() {
        return this.zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzho
    public final zzhp zzb() {
        zzhs zzhsVar = null;
        if (this.zzc) {
            try {
                return new zzht((MessageDigest) this.zza.clone(), this.zzb, zzhsVar);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new zzht(zzc(this.zza.getAlgorithm()), this.zzb, zzhsVar);
    }
}
