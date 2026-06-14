package com.google.android.recaptcha.internal;

import com.google.common.base.Ascii;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public abstract class zzhn {
    private static final char[] zza = "0123456789abcdef".toCharArray();
    public static final /* synthetic */ int zzb = 0;

    zzhn() {
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof zzhn) {
            zzhn zzhnVar = (zzhn) obj;
            if (zzb() == zzhnVar.zzb() && zzc(zzhnVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (zzb() >= 32) {
            return zza();
        }
        byte[] zze = zze();
        int i = zze[0] & 255;
        for (int i2 = 1; i2 < zze.length; i2++) {
            i |= (zze[i2] & 255) << (i2 * 8);
        }
        return i;
    }

    public final String toString() {
        byte[] zze = zze();
        int length = zze.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b : zze) {
            char[] cArr = zza;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & Ascii.SI]);
        }
        return sb.toString();
    }

    public abstract int zza();

    public abstract int zzb();

    abstract boolean zzc(zzhn zzhnVar);

    public abstract byte[] zzd();

    byte[] zze() {
        throw null;
    }
}
