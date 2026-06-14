package com.google.android.recaptcha.internal;

import androidx.compose.animation.core.AnimationKt;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.annotation.Nullable;
import kotlin.time.DurationKt;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zznr {
    private static final ThreadLocal zza;

    static {
        zzmy zzi = zzmz.zzi();
        zzi.zze(-62135596800L);
        zzi.zzd(0);
        zzmy zzi2 = zzmz.zzi();
        zzi2.zze(253402300799L);
        zzi2.zzd(999999999);
        zzmy zzi3 = zzmz.zzi();
        zzi3.zze(0L);
        zzi3.zzd(0);
        zza = new zznq();
        zzd("now");
        zzd("getEpochSecond");
        zzd("getNano");
    }

    public static zzmz zza(zzmz zzmzVar) {
        long zzg = zzmzVar.zzg();
        boolean zze = zze(zzg);
        int zzf = zzmzVar.zzf();
        if (!zze || zzf < 0 || zzf >= 1000000000) {
            throw new IllegalArgumentException(String.format("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", Long.valueOf(zzg), Integer.valueOf(zzf)));
        }
        return zzmzVar;
    }

    public static zzmz zzb(long j) {
        long j2 = j / 1000;
        if (!zze(j2)) {
            throw new IllegalArgumentException(String.format("Timestamp is not valid. Input seconds is too large. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. ", Long.valueOf(j2)));
        }
        int i = (int) ((j % 1000) * AnimationKt.MillisToNanos);
        if (i <= -1000000000 || i >= 1000000000) {
            j2 = zzic.zza(j2, i / Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
            i %= Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
        }
        if (i < 0) {
            i += Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
            j2 = zzic.zzb(j2, 1L);
        }
        zzmy zzi = zzmz.zzi();
        zzi.zze(j2);
        zzi.zzd(i);
        zzmz zzmzVar = (zzmz) zzi.zzj();
        zza(zzmzVar);
        return zzmzVar;
    }

    public static String zzc(zzmz zzmzVar) {
        zza(zzmzVar);
        long zzg = zzmzVar.zzg();
        int zzf = zzmzVar.zzf();
        StringBuilder sb = new StringBuilder();
        sb.append(((SimpleDateFormat) zza.get()).format(new Date(zzg * 1000)));
        if (zzf != 0) {
            sb.append(".");
            sb.append(zzf % DurationKt.NANOS_IN_MILLIS == 0 ? String.format(Locale.ENGLISH, "%1$03d", Integer.valueOf(zzf / DurationKt.NANOS_IN_MILLIS)) : zzf % 1000 == 0 ? String.format(Locale.ENGLISH, "%1$06d", Integer.valueOf(zzf / 1000)) : String.format(Locale.ENGLISH, "%1$09d", Integer.valueOf(zzf)));
        }
        sb.append("Z");
        return sb.toString();
    }

    @Nullable
    private static Method zzd(String str) {
        try {
            return Class.forName("java.time.Instant").getMethod(str, new Class[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean zze(long j) {
        return j >= -62135596800L && j <= 253402300799L;
    }
}
