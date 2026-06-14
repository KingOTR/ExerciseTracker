package com.google.android.recaptcha.internal;

import android.content.ContentResolver;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzm implements zzaa {
    private final zzdc zza;
    private final ContentResolver zzb;

    public zzm(zzdc zzdcVar, ContentResolver contentResolver) {
        this.zza = zzdcVar;
        this.zzb = contentResolver;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final int zza() {
        return 17;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final zzdc zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final Object zzc(String str, Continuation continuation) {
        ContentResolver contentResolver = this.zzb;
        zzdf zzb = zzab.zzb(this, str);
        String zza = zzau.zza(contentResolver);
        zzb.zza();
        zzrj zzf = zzrm.zzf();
        zzrk zzf2 = zzrl.zzf();
        zzf2.zzv(zza);
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
