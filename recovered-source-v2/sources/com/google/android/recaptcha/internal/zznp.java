package com.google.android.recaptcha.internal;

import okhttp3.internal.http2.Http2Connection;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zznp {
    static {
        zzjz zzi = zzka.zzi();
        zzi.zze(-315576000000L);
        zzi.zzd(-999999999);
        zzjz zzi2 = zzka.zzi();
        zzi2.zze(315576000000L);
        zzi2.zzd(999999999);
        zzjz zzi3 = zzka.zzi();
        zzi3.zze(0L);
        zzi3.zzd(0);
    }

    public static zzka zza(long j) {
        int i = (int) (j % 1000000000);
        long j2 = j / 1000000000;
        if (i <= -1000000000 || i >= 1000000000) {
            j2 = zzic.zza(j2, i / Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
            i %= Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
        }
        if (j2 > 0 && i < 0) {
            i += Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
            j2--;
        }
        if (j2 < 0 && i > 0) {
            i -= 1000000000;
            j2++;
        }
        zzjz zzi = zzka.zzi();
        zzi.zze(j2);
        zzi.zzd(i);
        zzka zzkaVar = (zzka) zzi.zzj();
        long zzg = zzkaVar.zzg();
        int zzf = zzkaVar.zzf();
        if (zzg < -315576000000L || zzg > 315576000000L || zzf < -999999999 || zzf >= 1000000000 || ((zzg < 0 || zzf < 0) && (zzg > 0 || zzf > 0))) {
            throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(zzg), Integer.valueOf(zzf)));
        }
        return zzkaVar;
    }
}
