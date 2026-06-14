package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.google.android.recaptcha.RecaptchaTasksClient;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Deferred;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzcx implements RecaptchaClient, RecaptchaTasksClient {
    private static final Regex zza = new Regex("^[a-zA-Z0-9/_]{0,100}$");
    private final Application zzb;
    private final zzl zzc;
    private final String zzd;
    private final zzbv zze;
    private final zzpq zzf;
    private final zzdc zzg;
    private final zzbl zzh;
    private final zzbo zzi;

    public zzcx(Application application, zzl zzlVar, String str, zzbo zzboVar, zzbv zzbvVar, zzpq zzpqVar, zzdc zzdcVar, zzbl zzblVar, zzds zzdsVar) {
        this.zzb = application;
        this.zzc = zzlVar;
        this.zzd = str;
        this.zzi = zzboVar;
        this.zze = zzbvVar;
        this.zzf = zzpqVar;
        this.zzg = zzdcVar;
        this.zzh = zzblVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzf(long j, String str, zzdc zzdcVar, Continuation continuation) {
        zzcp zzcpVar;
        int i;
        Exception e;
        zzdf zzdfVar;
        if (continuation instanceof zzcp) {
            zzcpVar = (zzcp) continuation;
            int i2 = zzcpVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzcpVar.zzc = i2 - Integer.MIN_VALUE;
                Object obj = zzcpVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzcpVar.zzc;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    zzdf zzf = zzdcVar.zzf(27);
                    try {
                        zzl zzlVar = this.zzc;
                        zzcpVar.zzd = zzf;
                        zzcpVar.zzc = 1;
                        obj = zzlVar.zzb(str, j, zzcpVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        zzdfVar = zzf;
                    } catch (Exception e2) {
                        e = e2;
                        zzdfVar = zzf;
                        if (!(e instanceof zzbj)) {
                        }
                        zzdfVar.zzb(r5);
                        throw r5;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zzdfVar = zzcpVar.zzd;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Exception e3) {
                        e = e3;
                        zzbj zzbjVar = !(e instanceof zzbj) ? (zzbj) e : new zzbj(zzbh.zzb, zzbg.zzaa, null);
                        zzdfVar.zzb(zzbjVar);
                        throw zzbjVar;
                    }
                }
                zzpw zzpwVar = (zzpw) obj;
                zzdfVar.zza();
                return zzpwVar;
            }
        }
        zzcpVar = new zzcp(this, continuation);
        Object obj2 = zzcpVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzcpVar.zzc;
        if (i != 0) {
        }
        zzpw zzpwVar2 = (zzpw) obj2;
        zzdfVar.zza();
        return zzpwVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0121 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzg(RecaptchaAction recaptchaAction, long j, Continuation continuation) {
        zzcs zzcsVar;
        Object obj;
        Object coroutine_suspended;
        int i;
        zzdc zza2;
        zzdf zzf;
        zzcx zzcxVar;
        zzcx zzcxVar2;
        RecaptchaAction recaptchaAction2;
        double d;
        zzdf zzdfVar;
        zzdc zzdcVar;
        zzbj zzbjVar;
        try {
            if (continuation instanceof zzcs) {
                zzcsVar = (zzcs) continuation;
                int i2 = zzcsVar.zzf;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzcsVar.zzf = i2 - Integer.MIN_VALUE;
                    zzcs zzcsVar2 = zzcsVar;
                    obj = zzcsVar2.zzd;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzcsVar2.zzf;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        String uuid = UUID.randomUUID().toString();
                        zza2 = this.zzg.zza();
                        zza2.zzc(uuid);
                        zzf = zza2.zzf(9);
                        double d2 = j;
                        try {
                            zzdf zzf2 = zza2.zzf(7);
                            zzbj zzbjVar2 = !zza.matches(recaptchaAction.getAction()) ? new zzbj(zzbh.zzg, zzbg.zzh, null) : null;
                            if (j < 5000) {
                                zzbjVar2 = new zzbj(zzbh.zzb, zzbg.zzI, null);
                            }
                            if (zzbjVar2 != null) {
                                zzf2.zzb(zzbjVar2);
                                throw zzbjVar2;
                            }
                            zzf2.zza();
                            zzcsVar2.zzg = this;
                            zzcsVar2.zza = recaptchaAction;
                            zzcsVar2.zzb = zza2;
                            zzcsVar2.zzh = zzf;
                            double d3 = 0.55d * d2;
                            zzcsVar2.zzc = d3;
                            zzcsVar2.zzf = 1;
                            obj = zzf((long) (0.45d * d2), uuid, zza2, zzcsVar2);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            zzcxVar2 = this;
                            recaptchaAction2 = recaptchaAction;
                            d = d3;
                        } catch (Exception e) {
                            e = e;
                            zzcxVar = this;
                            zzdfVar = zzf;
                            if (e instanceof zzbj) {
                            }
                            zzdfVar.zzb(zzbjVar);
                            Result.Companion companion = Result.INSTANCE;
                            return Result.m7905constructorimpl(ResultKt.createFailure(zzbjVar.zzc()));
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            zzdfVar = (zzdf) zzcsVar2.zzb;
                            zzdcVar = (zzdc) zzcsVar2.zza;
                            zzcxVar = zzcsVar2.zzg;
                            try {
                                ResultKt.throwOnFailure(obj);
                                zzqf zzqfVar = (zzqf) obj;
                                zzcxVar.zzh(zzqfVar, zzdcVar);
                                zzdfVar.zza();
                                Result.Companion companion2 = Result.INSTANCE;
                                return Result.m7905constructorimpl(zzqfVar.zzj());
                            } catch (Exception e2) {
                                e = e2;
                                if (e instanceof zzbj) {
                                    zzbjVar = new zzbj(zzbh.zzb, zzbg.zzX, e.getClass().getSimpleName());
                                } else {
                                    zzbjVar = (zzbj) e;
                                    if (Intrinsics.areEqual(zzbjVar.zzb(), zzbh.zzc) && !zzcxVar.zzi(zzcxVar.zzb)) {
                                        zzbjVar = new zzbj(zzbh.zzc, zzbg.zzap, null);
                                    }
                                }
                                zzdfVar.zzb(zzbjVar);
                                Result.Companion companion3 = Result.INSTANCE;
                                return Result.m7905constructorimpl(ResultKt.createFailure(zzbjVar.zzc()));
                            }
                        }
                        d = zzcsVar2.zzc;
                        zzdf zzdfVar2 = zzcsVar2.zzh;
                        zzdc zzdcVar2 = (zzdc) zzcsVar2.zzb;
                        RecaptchaAction recaptchaAction3 = (RecaptchaAction) zzcsVar2.zza;
                        zzcxVar2 = zzcsVar2.zzg;
                        try {
                            ResultKt.throwOnFailure(obj);
                            zzf = zzdfVar2;
                            zza2 = zzdcVar2;
                            recaptchaAction2 = recaptchaAction3;
                        } catch (Exception e3) {
                            e = e3;
                            zzdfVar = zzdfVar2;
                            zzcxVar = zzcxVar2;
                            if (e instanceof zzbj) {
                            }
                            zzdfVar.zzb(zzbjVar);
                            Result.Companion companion32 = Result.INSTANCE;
                            return Result.m7905constructorimpl(ResultKt.createFailure(zzbjVar.zzc()));
                        }
                    }
                    zzcsVar2.zzg = zzcxVar2;
                    zzcsVar2.zza = zza2;
                    zzcsVar2.zzb = zzf;
                    zzcsVar2.zzh = null;
                    zzcsVar2.zzf = 2;
                    obj = BuildersKt.withContext(zzcxVar2.zzi.zza().getCoroutineContext(), new zzcv((long) d, zza2, zzcxVar2, recaptchaAction2, (zzpw) obj, null), zzcsVar2);
                    if (obj != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    zzcxVar = zzcxVar2;
                    zzdcVar = zza2;
                    zzdfVar = zzf;
                    zzqf zzqfVar2 = (zzqf) obj;
                    zzcxVar.zzh(zzqfVar2, zzdcVar);
                    zzdfVar.zza();
                    Result.Companion companion22 = Result.INSTANCE;
                    return Result.m7905constructorimpl(zzqfVar2.zzj());
                }
            }
            zzcsVar2.zzg = zzcxVar2;
            zzcsVar2.zza = zza2;
            zzcsVar2.zzb = zzf;
            zzcsVar2.zzh = null;
            zzcsVar2.zzf = 2;
            obj = BuildersKt.withContext(zzcxVar2.zzi.zza().getCoroutineContext(), new zzcv((long) d, zza2, zzcxVar2, recaptchaAction2, (zzpw) obj, null), zzcsVar2);
            if (obj != coroutine_suspended) {
            }
        } catch (Exception e4) {
            e = e4;
            zzcxVar = zzcxVar2;
            zzdfVar = zzf;
            if (e instanceof zzbj) {
            }
            zzdfVar.zzb(zzbjVar);
            Result.Companion companion322 = Result.INSTANCE;
            return Result.m7905constructorimpl(ResultKt.createFailure(zzbjVar.zzc()));
        }
        zzcsVar = new zzcs(this, continuation);
        zzcs zzcsVar22 = zzcsVar;
        obj = zzcsVar22.zzd;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzcsVar22.zzf;
        if (i != 0) {
        }
    }

    private final void zzh(zzqf zzqfVar, zzdc zzdcVar) {
        zzdf zzf = zzdcVar.zzf(29);
        try {
            List<zzqh> zzk = zzqfVar.zzk();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(zzk, 10)), 16));
            for (zzqh zzqhVar : zzk) {
                Pair pair = TuplesKt.to(zzqhVar.zzg(), zzqhVar.zzi());
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            this.zzh.zzb(linkedHashMap);
            this.zzc.zzf(zzqfVar);
            zzf.zza();
        } catch (Exception e) {
            zzbj zzbjVar = e instanceof zzbj ? (zzbj) e : new zzbj(zzbh.zzb, zzbg.zzaa, null);
            zzf.zzb(zzbjVar);
            throw zzbjVar;
        }
    }

    private final boolean zzi(Application application) {
        int i = zzbb.zza;
        return zzbk.zzb(application);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* renamed from: execute-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo7684execute0E7RQCE(RecaptchaAction recaptchaAction, long j, Continuation<? super Result<String>> continuation) {
        zzcq zzcqVar;
        int i;
        if (continuation instanceof zzcq) {
            zzcqVar = (zzcq) continuation;
            int i2 = zzcqVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzcqVar.zzc = i2 - Integer.MIN_VALUE;
                Object obj = zzcqVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzcqVar.zzc;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((Result) obj).getValue();
                }
                ResultKt.throwOnFailure(obj);
                zzcqVar.zzc = 1;
                Object zzg = zzg(recaptchaAction, j, zzcqVar);
                return zzg == coroutine_suspended ? coroutine_suspended : zzg;
            }
        }
        zzcqVar = new zzcq(this, continuation);
        Object obj2 = zzcqVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzcqVar.zzc;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* renamed from: execute-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo7685executegIAlus(RecaptchaAction recaptchaAction, Continuation<? super Result<String>> continuation) {
        zzcr zzcrVar;
        int i;
        if (continuation instanceof zzcr) {
            zzcrVar = (zzcr) continuation;
            int i2 = zzcrVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzcrVar.zzc = i2 - Integer.MIN_VALUE;
                Object obj = zzcrVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzcrVar.zzc;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((Result) obj).getValue();
                }
                ResultKt.throwOnFailure(obj);
                zzcrVar.zzc = 1;
                Object mo7684execute0E7RQCE = mo7684execute0E7RQCE(recaptchaAction, 10000L, zzcrVar);
                return mo7684execute0E7RQCE == coroutine_suspended ? coroutine_suspended : mo7684execute0E7RQCE;
            }
        }
        zzcrVar = new zzcr(this, continuation);
        Object obj2 = zzcrVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzcrVar.zzc;
        if (i == 0) {
        }
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction) {
        Deferred async$default;
        async$default = BuildersKt__Builders_commonKt.async$default(this.zzi.zzb(), null, null, new zzct(this, recaptchaAction, 10000L, null), 3, null);
        return zzax.zza(async$default);
    }

    public final String zze() {
        return this.zzd;
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction, long j) {
        Deferred async$default;
        async$default = BuildersKt__Builders_commonKt.async$default(this.zzi.zzb(), null, null, new zzct(this, recaptchaAction, j, null), 3, null);
        return zzax.zza(async$default);
    }
}
