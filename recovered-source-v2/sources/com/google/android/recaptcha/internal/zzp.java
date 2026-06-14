package com.google.android.recaptcha.internal;

import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzp implements zzaa {
    private final zzdc zza;
    private final zzbl zzb;
    private boolean zzc = true;

    public zzp(zzdc zzdcVar, zzbl zzblVar) {
        this.zza = zzdcVar;
        this.zzb = zzblVar;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final int zza() {
        return 25;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final zzdc zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final Object zzc(String str, Continuation continuation) {
        zzbl zzblVar = this.zzb;
        zzdf zzb = zzab.zzb(this, str);
        String zza = zzblVar.zza();
        zzb.zza();
        zzrj zzf = zzrm.zzf();
        zzrk zzf2 = zzrl.zzf();
        zzf2.zzv(zza);
        zzf.zzd(CollectionsKt.listOf(zzf2.zzj()));
        return zzab.zza(this, (zzrm) zzf.zzj());
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final Object zzd(zzps zzpsVar, Continuation continuation) {
        zzdf zzc = zzab.zzc(this);
        if (zzpsVar.zzJ().length() == 0) {
            this.zzc = false;
            zzc.zzb(new zzbj(zzbh.zzb, zzbg.zzac, null));
            return Unit.INSTANCE;
        }
        this.zzb.zzb(MapsKt.mapOf(TuplesKt.to("_GRECAPTCHA_KC", zzpsVar.zzJ())));
        zzc.zza();
        return Unit.INSTANCE;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final void zze(zzqf zzqfVar) {
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final boolean zzf() {
        return this.zzc;
    }
}
