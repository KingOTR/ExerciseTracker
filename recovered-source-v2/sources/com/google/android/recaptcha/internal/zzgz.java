package com.google.android.recaptcha.internal;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzgz {
    private boolean zza;
    private long zzb;
    private long zzc;

    zzgz() {
    }

    public static zzgz zzb() {
        zzgz zzgzVar = new zzgz();
        zzgzVar.zze();
        return zzgzVar;
    }

    public static zzgz zzc() {
        return new zzgz();
    }

    private final long zzg() {
        return this.zza ? (System.nanoTime() - this.zzc) + this.zzb : this.zzb;
    }

    public final String toString() {
        String str;
        long zzg = zzg();
        TimeUnit timeUnit = TimeUnit.DAYS.convert(zzg, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.DAYS : TimeUnit.HOURS.convert(zzg, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.HOURS : TimeUnit.MINUTES.convert(zzg, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.MINUTES : TimeUnit.SECONDS.convert(zzg, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.SECONDS : TimeUnit.MILLISECONDS.convert(zzg, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.MILLISECONDS : TimeUnit.MICROSECONDS.convert(zzg, TimeUnit.NANOSECONDS) > 0 ? TimeUnit.MICROSECONDS : TimeUnit.NANOSECONDS;
        String format = String.format(Locale.ROOT, "%.4g", Double.valueOf(zzg / TimeUnit.NANOSECONDS.convert(1L, timeUnit)));
        switch (zzgy.zza[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        return format + " " + str;
    }

    public final long zza(TimeUnit timeUnit) {
        return timeUnit.convert(zzg(), TimeUnit.NANOSECONDS);
    }

    public final zzgz zzd() {
        this.zzb = 0L;
        this.zza = false;
        return this;
    }

    public final zzgz zze() {
        zzgx.zze(!this.zza, "This stopwatch is already running.");
        this.zza = true;
        this.zzc = System.nanoTime();
        return this;
    }

    public final zzgz zzf() {
        long nanoTime = System.nanoTime();
        zzgx.zze(this.zza, "This stopwatch is already stopped.");
        this.zza = false;
        this.zzb += nanoTime - this.zzc;
        return this;
    }
}
