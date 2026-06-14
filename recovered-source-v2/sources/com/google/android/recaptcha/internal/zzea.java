package com.google.android.recaptcha.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzea implements zzdv {
    private final CoroutineScope zza;
    private final zzem zzb;
    private final zzge zzc;
    private final Map zzd;

    public zzea(CoroutineScope coroutineScope, zzem zzemVar, zzge zzgeVar, Map map) {
        this.zza = coroutineScope;
        this.zzb = zzemVar;
        this.zzc = zzgeVar;
        this.zzd = map;
    }

    public static final /* synthetic */ void zzf(zzea zzeaVar, zzrs zzrsVar, zzek zzekVar) {
        zzgz zzb = zzgz.zzb();
        int zza = zzekVar.zza();
        zzfe zzfeVar = (zzfe) zzeaVar.zzd.get(Integer.valueOf(zzrsVar.zzf()));
        if (zzfeVar == null) {
            throw new zzby(5, 2, null);
        }
        int zzg = zzrsVar.zzg();
        zzrr[] zzrrVarArr = (zzrr[]) zzrsVar.zzj().toArray(new zzrr[0]);
        zzfeVar.zza(zzg, zzekVar, (zzrr[]) Arrays.copyOf(zzrrVarArr, zzrrVarArr.length));
        if (zza == zzekVar.zza()) {
            zzekVar.zzg(zzekVar.zza() + 1);
        }
        zzb.zzf();
        long zza2 = zzb.zza(TimeUnit.MICROSECONDS);
        int i = zzbq.zza;
        int zzk = zzrsVar.zzk();
        if (zzk == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzbq.zza(zzk - 2, zza2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzg(List list, zzek zzekVar, Continuation continuation) {
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new zzdx(zzekVar, list, this, null), continuation);
        return coroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzh(Exception exc, zzek zzekVar, Continuation continuation) {
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new zzdy(exc, zzekVar, this, null), continuation);
        return coroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : Unit.INSTANCE;
    }

    @Override // com.google.android.recaptcha.internal.zzdv
    public final void zza(String str) {
        BuildersKt__Builders_commonKt.launch$default(this.zza, null, null, new zzdz(new zzek(this.zzb), this, str, null), 3, null);
    }
}
