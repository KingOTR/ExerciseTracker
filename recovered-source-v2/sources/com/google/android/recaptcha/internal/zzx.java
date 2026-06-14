package com.google.android.recaptcha.internal;

import android.content.Context;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzx extends zze {
    private final zzdc zza;
    private final List zzb;
    private zziv zzc;
    private final Map zzd;

    public /* synthetic */ zzx(zzbl zzblVar, Context context, zzdc zzdcVar, zzbo zzboVar, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        zzdc zza = zzdcVar.zza();
        CoroutineScope zzc = zzboVar.zzc();
        zzap zzapVar = new zzap(context, zzc, zza, IntegrityManagerFactory.createStandard(context), 28800000L);
        int i2 = zzbz.zza;
        List listOf = CollectionsKt.listOf((Object[]) new zzaa[]{new zzad(zzdcVar.zza()), new zzp(zzdcVar.zza(), zzblVar), new zzm(zzdcVar.zza(), context.getContentResolver()), new zzn(zzdcVar.zza()), new zzag(zza, context, zzc, zzapVar, zzbz.zza(context))});
        this.zza = zzdcVar;
        this.zzb = listOf;
        this.zzd = new LinkedHashMap();
    }

    public static final /* synthetic */ String zzo(zzx zzxVar, zzri zzriVar) {
        zziv zzivVar = zzxVar.zzc;
        if (zzivVar == null) {
            zzivVar = null;
        }
        byte[] zzd = zzriVar.zzd();
        return zzca.zza(zzhz.zzh().zzi(zzd, 0, zzd.length), zzivVar);
    }

    public static final /* synthetic */ String zzp(zzx zzxVar, zzrm zzrmVar) {
        zziv zzivVar = zzxVar.zzc;
        if (zzivVar == null) {
            zzivVar = null;
        }
        byte[] zzd = zzrmVar.zzd();
        return zzca.zza(zzhz.zzh().zzi(zzd, 0, zzd.length), zzivVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzpw zzt(String str) {
        zzqm zzqmVar = (zzqm) this.zzd.remove(str);
        zzpv zzf = zzpw.zzf();
        zzf.zzd(str);
        if (zzqmVar != null) {
            byte[] zzd = ((zzqn) zzqmVar.zzj()).zzd();
            String zzi = zzhz.zzh().zzi(zzd, 0, zzd.length);
            zzpt zzf2 = zzpu.zzf();
            zzf2.zzd(zzi);
            zzf.zze(zzf2);
        }
        return (zzpw) zzf.zzj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzu(String str, zzaa zzaaVar, Continuation continuation) {
        zzq zzqVar;
        int i;
        if (continuation instanceof zzq) {
            zzqVar = (zzq) continuation;
            int i2 = zzqVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzqVar.zzc = i2 - Integer.MIN_VALUE;
                Object obj = zzqVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzqVar.zzc;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    zzr zzrVar = new zzr(zzaaVar, str, this, null);
                    zzqVar.zzc = 1;
                    obj = CoroutineScopeKt.coroutineScope(zzrVar, zzqVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            }
        }
        zzqVar = new zzq(this, continuation);
        Object obj2 = zzqVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzqVar.zzc;
        if (i != 0) {
        }
        return obj2;
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final zzdf zza(String str) {
        zzdc zzdcVar = this.zza;
        zzdcVar.zzc(str);
        return zzdcVar.zzf(35);
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final zzdf zzb() {
        zzdc zzdcVar = this.zza;
        zzdcVar.zzc(zzdcVar.zzd());
        return zzdcVar.zzf(34);
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final Object zzd(String str, Continuation continuation) {
        return zzt(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final Object zzf(String str, Continuation continuation) {
        zzs zzsVar;
        int i;
        if (continuation instanceof zzs) {
            zzsVar = (zzs) continuation;
            int i2 = zzsVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzsVar.zzc = i2 - Integer.MIN_VALUE;
                Object obj = zzsVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzsVar.zzc;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    zzu zzuVar = new zzu(str, this, null);
                    zzsVar.zzc = 1;
                    obj = CoroutineScopeKt.coroutineScope(zzuVar, zzsVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        zzsVar = new zzs(this, continuation);
        Object obj2 = zzsVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzsVar.zzc;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final Object zzh(zzpq zzpqVar, Continuation continuation) {
        zzv zzvVar;
        int i;
        if (continuation instanceof zzv) {
            zzvVar = (zzv) continuation;
            int i2 = zzvVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzvVar.zzc = i2 - Integer.MIN_VALUE;
                Object obj = zzvVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzvVar.zzc;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    zzw zzwVar = new zzw(zzpqVar, this, null);
                    zzvVar.zzc = 1;
                    obj = CoroutineScopeKt.coroutineScope(zzwVar, zzvVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        zzvVar = new zzv(this, continuation);
        Object obj2 = zzvVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzvVar.zzc;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final void zzk(zzqf zzqfVar) {
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            ((zzaa) it.next()).zze(zzqfVar);
        }
    }

    public final Map zzr() {
        return this.zzd;
    }
}
