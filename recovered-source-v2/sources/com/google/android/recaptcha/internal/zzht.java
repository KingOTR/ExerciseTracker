package com.google.android.recaptcha.internal;

import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
final class zzht extends zzhj {
    private final MessageDigest zza;
    private final int zzb;
    private boolean zzc;

    /* synthetic */ zzht(MessageDigest messageDigest, int i, zzhs zzhsVar) {
        this.zza = messageDigest;
        this.zzb = i;
    }

    private final void zzc() {
        zzgx.zze(!this.zzc, "Cannot re-use a Hasher after calling hash() on it");
    }

    @Override // com.google.android.recaptcha.internal.zzhj
    protected final void zza(byte[] bArr, int i, int i2) {
        zzc();
        this.zza.update(bArr, 0, i2);
    }

    @Override // com.google.android.recaptcha.internal.zzhp
    public final zzhn zzb() {
        zzc();
        this.zzc = true;
        int i = this.zzb;
        if (i == this.zza.getDigestLength()) {
            byte[] digest = this.zza.digest();
            int i2 = zzhn.zzb;
            return new zzhm(digest);
        }
        byte[] copyOf = Arrays.copyOf(this.zza.digest(), i);
        int i3 = zzhn.zzb;
        return new zzhm(copyOf);
    }
}
