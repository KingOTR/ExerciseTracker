package com.google.android.recaptcha.internal;

import java.io.IOException;
import org.mapsforge.core.model.Tag;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public abstract class zzhz {
    private static final zzhz zza;
    private static final zzhz zzb;

    static {
        char[] cArr;
        Character valueOf = Character.valueOf(Tag.KEY_VALUE_SEPARATOR);
        zza = new zzhw("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", valueOf);
        zzb = new zzhw("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", valueOf);
        new zzhy("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", valueOf);
        new zzhy("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", valueOf);
        zzhv zzhvVar = new zzhv("base16()", "0123456789ABCDEF".toCharArray());
        new zzhy(zzhvVar, null);
        char[] cArr2 = new char[512];
        cArr = zzhvVar.zzf;
        zzgx.zza(cArr.length == 16);
        for (int i = 0; i < 256; i++) {
            cArr2[i] = zzhvVar.zza(i >>> 4);
            cArr2[i | 256] = zzhvVar.zza(i & 15);
        }
    }

    zzhz() {
    }

    public static zzhz zzg() {
        return zza;
    }

    public static zzhz zzh() {
        return zzb;
    }

    abstract int zza(byte[] bArr, CharSequence charSequence) throws zzhx;

    abstract void zzb(Appendable appendable, byte[] bArr, int i, int i2) throws IOException;

    abstract int zzc(int i);

    abstract int zzd(int i);

    CharSequence zze(CharSequence charSequence) {
        throw null;
    }

    public final String zzi(byte[] bArr, int i, int i2) {
        zzgx.zzd(0, i2, bArr.length);
        StringBuilder sb = new StringBuilder(zzd(i2));
        try {
            zzb(sb, bArr, 0, i2);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final byte[] zzj(CharSequence charSequence) {
        try {
            CharSequence zze = zze(charSequence);
            int zzc = zzc(zze.length());
            byte[] bArr = new byte[zzc];
            int zza2 = zza(bArr, zze);
            if (zza2 == zzc) {
                return bArr;
            }
            byte[] bArr2 = new byte[zza2];
            System.arraycopy(bArr, 0, bArr2, 0, zza2);
            return bArr2;
        } catch (zzhx e) {
            throw new IllegalArgumentException(e);
        }
    }
}
