package com.google.android.recaptcha.internal;

import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzdn {
    public static final zzoy zza(zzbt zzbtVar, zzbt zzbtVar2) {
        zzox zzf = zzoy.zzf();
        zzf.zzp(zznr.zzb(zzbtVar.zzb()));
        zzf.zzq(zznp.zza(zzbtVar.zza(TimeUnit.NANOSECONDS)));
        zzf.zzd(zznr.zzb(zzbtVar2.zzb()));
        zzf.zze(zznp.zza(zzbtVar2.zza(TimeUnit.NANOSECONDS)));
        return (zzoy) zzf.zzj();
    }
}
