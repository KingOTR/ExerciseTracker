package com.google.android.recaptcha.internal;

import android.content.Context;
import java.nio.charset.StandardCharsets;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzag implements zzaa {
    private final zzdc zza;
    private final zzap zzb;
    private boolean zzc = true;
    private String zzd = "";
    private final int zze;

    public zzag(zzdc zzdcVar, Context context, CoroutineScope coroutineScope, zzap zzapVar, int i) {
        this.zza = zzdcVar;
        this.zzb = zzapVar;
        this.zze = i;
    }

    private static final String zzi(zziv zzivVar) {
        zzhz zzg = zzhz.zzg();
        byte[] zzl = zzivVar.zzl();
        byte[] zzd = zzhr.zza().zza(zzg.zzi(zzl, 0, zzl.length), StandardCharsets.UTF_8).zzd();
        zziv zzk = zziv.zzk(zzd, 0, zzd.length);
        zzhz zzh = zzhz.zzh();
        byte[] zzl2 = zzk.zzl();
        return zzh.zzi(zzl2, 0, zzl2.length);
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final zzdc zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final Object zzc(String str, Continuation continuation) {
        return CoroutineScopeKt.coroutineScope(new zzae(this, str, null), continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        if (r2.zzd(r6, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.google.android.recaptcha.internal.zzaa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzd(zzps zzpsVar, Continuation continuation) {
        zzaf zzafVar;
        Object coroutine_suspended;
        int i;
        zzdf zzc;
        zzap zzapVar;
        zzdf zzdfVar;
        if (continuation instanceof zzaf) {
            zzafVar = (zzaf) continuation;
            int i2 = zzafVar.zzd;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzafVar.zzd = i2 - Integer.MIN_VALUE;
                Object obj = zzafVar.zzb;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzafVar.zzd;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    zzc = zzab.zzc(this);
                    if (this.zze != 3 || zzpsVar.zzf() == 0) {
                        this.zzc = false;
                        zzc.zzb(new zzbj(zzbh.zzb, zzbg.zzac, null));
                        return Unit.INSTANCE;
                    }
                    this.zzd = zzi(zzpsVar.zzg());
                    zzap zzapVar2 = this.zzb;
                    long zzf = zzpsVar.zzf();
                    zzafVar.zza = this;
                    zzafVar.zze = zzc;
                    zzafVar.zzd = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zzdfVar = (zzdf) zzafVar.zza;
                        ResultKt.throwOnFailure(obj);
                        zzdfVar.zza();
                        return Unit.INSTANCE;
                    }
                    zzdf zzdfVar2 = zzafVar.zze;
                    zzag zzagVar = (zzag) zzafVar.zza;
                    ResultKt.throwOnFailure(obj);
                    zzc = zzdfVar2;
                    this = zzagVar;
                }
                zzapVar = this.zzb;
                zzafVar.zza = zzc;
                zzafVar.zze = null;
                zzafVar.zzd = 2;
                if (zzapVar.zze(zzafVar) != coroutine_suspended) {
                    zzdfVar = zzc;
                    zzdfVar.zza();
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
        }
        zzafVar = new zzaf(this, continuation);
        Object obj2 = zzafVar.zzb;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzafVar.zzd;
        if (i != 0) {
        }
        zzapVar = this.zzb;
        zzafVar.zza = zzc;
        zzafVar.zze = null;
        zzafVar.zzd = 2;
        if (zzapVar.zze(zzafVar) != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final void zze(zzqf zzqfVar) {
        this.zzd = zzi(zzqfVar.zzf());
    }

    @Override // com.google.android.recaptcha.internal.zzaa
    public final boolean zzf() {
        return this.zzc;
    }
}
