package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzby extends Exception {
    private final Throwable zza;
    private final zzrh zzb;
    private final int zzc;
    private final int zzd;

    public zzby(int i, int i2, Throwable th) {
        this.zzc = i;
        this.zzd = i2;
        this.zza = th;
        zzrh zzf = zzri.zzf();
        zzf.zzp(i2);
        zzf.zzq(i);
        this.zzb = zzf;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.zza;
    }

    public final zzrh zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzd;
    }
}
