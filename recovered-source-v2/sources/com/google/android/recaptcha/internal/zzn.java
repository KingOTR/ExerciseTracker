package com.google.android.recaptcha.internal;

import android.os.Build;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzn implements zzaa {
    private final zzdc zza;

    public zzn(zzdc zzdcVar) {
        this.zza = zzdcVar;
    }

    private static final zzrl zzg(String str) {
        zzrk zzf = zzrl.zzf();
        zzf.zzv(str);
        return (zzrl) zzf.zzj();
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final int zza() {
        return 11;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final zzdc zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final Object zzc(String str, Continuation continuation) {
        zzdf zzb = zzab.zzb(this, str);
        zzrj zzf = zzrm.zzf();
        zzf.zzd(CollectionsKt.listOf((Object[]) new zzrl[]{zzg(Build.MANUFACTURER), zzg(Build.MODEL), zzg(Build.DEVICE), zzg(Build.HARDWARE), zzg(Build.FINGERPRINT), zzg(Build.PRODUCT), zzg(Build.BOARD), zzg(Build.BRAND), zzg(ArraysKt.joinToString$default(Build.SUPPORTED_ABIS, ",", "[", "]", 0, (CharSequence) null, (Function1) null, 56, (Object) null))}));
        zzb.zza();
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
