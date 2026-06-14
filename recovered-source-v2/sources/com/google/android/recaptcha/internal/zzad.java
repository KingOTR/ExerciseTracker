package com.google.android.recaptcha.internal;

import android.os.Build;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzad implements zzaa {
    private final zzdc zza;

    public zzad(zzdc zzdcVar) {
        this.zza = zzdcVar;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final int zza() {
        return 10;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final zzdc zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final Object zzc(String str, Continuation continuation) {
        zzdf zzb = zzab.zzb(this, str);
        int i = Build.VERSION.SDK_INT;
        zzb.zza();
        zzrj zzf = zzrm.zzf();
        zzrk zzf2 = zzrl.zzf();
        zzf2.zzv(String.valueOf(i));
        zzf.zzd(CollectionsKt.listOf(zzf2.zzj()));
        return zzab.zza(this, (zzrm) zzf.zzj());
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final Object zzd(zzps zzpsVar, Continuation continuation) {
        zzab.zzc(this).zza();
        return Unit.INSTANCE;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final void zze(zzqf zzqfVar) {
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final boolean zzf() {
        return true;
    }
}
