package com.google.android.recaptcha.internal;

import android.app.Application;
import android.webkit.WebView;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaException;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzco {
    private static zzcx zzb;
    public static final zzco zza = new zzco();
    private static final String zzc = UUID.randomUUID().toString();
    private static final Mutex zzd = MutexKt.Mutex$default(false, 1, null);
    private static final zzbo zzf = new zzbo();
    private static final zzl zze = new zzl(null, 1, 0 == true ? 1 : 0);

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i = zzbb.zza;
        zzba.zzb(new zzbc("com.google.android.recaptcha.internal.zzbf".hashCode(), new zzbf(null, 1, null)), new zzbc("com.google.android.recaptcha.internal.zzeb".hashCode(), new zzeb()), new zzbc("com.google.android.recaptcha.internal.zzbk".hashCode(), new zzbk()));
    }

    private zzco() {
    }

    public static final /* synthetic */ zzcx zza(zzco zzcoVar, String str) {
        zzcx zzcxVar = zzb;
        if (zzcxVar == null) {
            return null;
        }
        if (Intrinsics.areEqual(zzcxVar.zze(), str)) {
            return zzcxVar;
        }
        throw new zzbj(zzbh.zzd, zzbg.zzan, null);
    }

    public static final Object zzg(Application application, String str, long j, zzdq zzdqVar, Continuation continuation) throws TimeoutCancellationException, ApiException, RecaptchaException {
        return BuildersKt.withContext(zzf.zzb().getCoroutineContext(), new zzcc(application, str, j, null, null), continuation);
    }

    public static final Task zzh(Application application, String str, long j) throws TimeoutCancellationException, ApiException, RecaptchaException {
        Deferred async$default;
        async$default = BuildersKt__Builders_commonKt.async$default(zzf.zza(), null, null, new zzch(application, str, j, null), 3, null);
        return zzax.zza(async$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r12v5, types: [com.google.android.recaptcha.internal.zzdf] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzi(String str, Application application, Function2 function2, Continuation continuation) {
        zzcn zzcnVar;
        int i;
        try {
            if (continuation instanceof zzcn) {
                zzcnVar = (zzcn) continuation;
                int i2 = zzcnVar.zzc;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzcnVar.zzc = i2 - Integer.MIN_VALUE;
                    Object obj = zzcnVar.zza;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzcnVar.zzc;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        zzbv zzbvVar = new zzbv("https://www.recaptcha.net/recaptcha/api3");
                        zzbo zzboVar = zzf;
                        String uuid = UUID.randomUUID().toString();
                        zzdc zzdcVar = new zzdc(str, zzc, uuid, application, new zzdk(application, new zzdm(zzbvVar.zzc()), zzboVar.zza()), null);
                        zzdcVar.zzc(uuid);
                        zzdf zzf2 = zzdcVar.zzf(6);
                        zzcnVar.zzd = zzf2;
                        zzcnVar.zzc = 1;
                        obj = function2.invoke(zzdcVar, zzcnVar);
                        str = zzf2;
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        zzdf zzdfVar = zzcnVar.zzd;
                        ResultKt.throwOnFailure(obj);
                        str = zzdfVar;
                    }
                    str.zza();
                    return obj;
                }
            }
            if (i != 0) {
            }
            str.zza();
            return obj;
        } catch (zzbj e) {
            str.zzb(e);
            throw e.zzc();
        } catch (Exception e2) {
            zzbj zzbjVar = new zzbj(zzbh.zzb, zzbg.zza, e2.getMessage());
            str.zzb(zzbjVar);
            throw zzbjVar.zzc();
        }
        zzcnVar = new zzcn(this, continuation);
        Object obj2 = zzcnVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzcnVar.zzc;
    }

    private final void zzj(String str) {
        try {
            zzpj zzj = zzpj.zzj(zzhz.zzh().zzj(str));
            int i = zzbb.zza;
            ((zzeb) LazyKt.lazy(zzci.zza).getValue()).zza(zzj);
        } catch (Exception e) {
            throw new zzbj(zzbh.zzl, zzbg.zzao, e.getMessage());
        }
    }

    private final boolean zzk(Application application) {
        int i = zzbb.zza;
        return zzbk.zzb(application);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzl(Application application, String str, long j, zzdc zzdcVar, zzbv zzbvVar, WebView webView, zzdq zzdqVar, zzbo zzboVar, Continuation continuation) {
        zzcf zzcfVar;
        Object obj;
        Object coroutine_suspended;
        int i;
        int i2;
        Application application2;
        zzbl zzblVar;
        zzdc zzdcVar2;
        zzbv zzbvVar2;
        zzdq zzdqVar2;
        zzbo zzboVar2;
        String str2;
        double d;
        WebView webView2;
        zzco zzcoVar;
        zzbo zzboVar3;
        Application application3;
        zzbv zzbvVar3;
        String str3;
        zzpq zzpqVar;
        zzbl zzblVar2;
        double d2;
        zzdc zzdcVar3;
        Object zzc2;
        zzpq zzpqVar2;
        String str4;
        Object obj2;
        zzdc zzdcVar4;
        Application application4;
        zzbv zzbvVar4;
        zzbo zzboVar4;
        Throwable m7908exceptionOrNullimpl;
        if (continuation instanceof zzcf) {
            zzcfVar = (zzcf) continuation;
            int i3 = zzcfVar.zzk;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                zzcfVar.zzk = i3 - Integer.MIN_VALUE;
                zzcf zzcfVar2 = zzcfVar;
                obj = zzcfVar2.zzi;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzcfVar2.zzk;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    double d3 = j;
                    zzbl zzblVar3 = new zzbl(application);
                    zzcfVar2.zza = this;
                    zzcfVar2.zzb = application;
                    zzcfVar2.zzc = str;
                    zzcfVar2.zzd = zzdcVar;
                    zzcfVar2.zze = zzbvVar;
                    zzcfVar2.zzf = null;
                    zzcfVar2.zzg = zzdqVar;
                    zzcfVar2.zzm = zzboVar;
                    zzcfVar2.zzl = zzblVar3;
                    double d4 = 0.4d * d3;
                    zzcfVar2.zzh = d4;
                    zzcfVar2.zzk = 1;
                    i2 = 2;
                    obj = BuildersKt.withContext(zzboVar.zza().getCoroutineContext(), new zzck((long) (d3 * 0.6d), application, str, zzdcVar, zzblVar3, zzdqVar, zzbvVar, null), zzcfVar2);
                    if (obj != coroutine_suspended) {
                        application2 = application;
                        zzblVar = zzblVar3;
                        zzdcVar2 = zzdcVar;
                        zzbvVar2 = zzbvVar;
                        zzdqVar2 = zzdqVar;
                        zzboVar2 = zzboVar;
                        str2 = str;
                        d = d4;
                        webView2 = null;
                        zzcoVar = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Throwable th = (Throwable) zzcfVar2.zza;
                            ResultKt.throwOnFailure(obj);
                            throw th;
                        }
                        zzpq zzpqVar3 = (zzpq) zzcfVar2.zzf;
                        zzbo zzboVar5 = (zzbo) zzcfVar2.zze;
                        zzbv zzbvVar5 = (zzbv) zzcfVar2.zzd;
                        zzdc zzdcVar5 = (zzdc) zzcfVar2.zzc;
                        String str5 = (String) zzcfVar2.zzb;
                        application4 = (Application) zzcfVar2.zza;
                        ResultKt.throwOnFailure(obj);
                        obj2 = ((Result) obj).getValue();
                        zzpqVar2 = zzpqVar3;
                        zzboVar4 = zzboVar5;
                        zzbvVar4 = zzbvVar5;
                        zzdcVar4 = zzdcVar5;
                        str4 = str5;
                        m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(obj2);
                        if (m7908exceptionOrNullimpl != null) {
                            return new zzcx(application4, zze, str4, zzboVar4, zzbvVar4, zzpqVar2, zzdcVar4, new zzbl(application4), new zzds());
                        }
                        JobKt__JobKt.cancelChildren$default(zzboVar4.zzd().getCoroutineContext(), (CancellationException) null, 1, (Object) null);
                        List list = SequencesKt.toList(JobKt.getJob(zzboVar4.zzd().getCoroutineContext()).getChildren());
                        zzcfVar2.zza = m7908exceptionOrNullimpl;
                        zzcfVar2.zzb = null;
                        zzcfVar2.zzc = null;
                        zzcfVar2.zzd = null;
                        zzcfVar2.zze = null;
                        zzcfVar2.zzf = null;
                        zzcfVar2.zzk = 4;
                        if (AwaitKt.joinAll(list, zzcfVar2) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        throw m7908exceptionOrNullimpl;
                    }
                    double d5 = zzcfVar2.zzh;
                    zzpqVar = (zzpq) zzcfVar2.zzg;
                    zzbl zzblVar4 = (zzbl) zzcfVar2.zzf;
                    zzbo zzboVar6 = (zzbo) zzcfVar2.zze;
                    zzbv zzbvVar6 = (zzbv) zzcfVar2.zzd;
                    zzdc zzdcVar6 = (zzdc) zzcfVar2.zzc;
                    String str6 = (String) zzcfVar2.zzb;
                    Application application5 = (Application) zzcfVar2.zza;
                    ResultKt.throwOnFailure(obj);
                    zzboVar3 = zzboVar6;
                    zzbvVar3 = zzbvVar6;
                    application3 = application5;
                    d2 = d5;
                    zzblVar2 = zzblVar4;
                    zzdcVar3 = zzdcVar6;
                    str3 = str6;
                    Application application6 = application3;
                    String str7 = str3;
                    zzdc zzdcVar7 = zzdcVar3;
                    zzx zzxVar = new zzx(zzblVar2, application3, zzdcVar3.zza(), zzboVar3, null, 16, null);
                    zzl zzlVar = zze;
                    zzlVar.zze(zzxVar, (zzgv) obj);
                    zzlVar.zza = zzdcVar7.zza();
                    zzcfVar2.zza = application6;
                    zzcfVar2.zzb = str7;
                    zzcfVar2.zzc = zzdcVar7;
                    zzcfVar2.zzd = zzbvVar3;
                    zzcfVar2.zze = zzboVar3;
                    zzcfVar2.zzf = zzpqVar;
                    zzcfVar2.zzg = null;
                    zzcfVar2.zzk = 3;
                    zzc2 = zzlVar.zzc((long) d2, zzpqVar, zzcfVar2);
                    if (zzc2 != coroutine_suspended) {
                        zzpqVar2 = zzpqVar;
                        str4 = str7;
                        obj2 = zzc2;
                        zzdcVar4 = zzdcVar7;
                        application4 = application6;
                        zzbvVar4 = zzbvVar3;
                        zzboVar4 = zzboVar3;
                        m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(obj2);
                        if (m7908exceptionOrNullimpl != null) {
                        }
                    }
                    return coroutine_suspended;
                }
                double d6 = zzcfVar2.zzh;
                zzbl zzblVar5 = zzcfVar2.zzl;
                zzbo zzboVar7 = zzcfVar2.zzm;
                zzdq zzdqVar3 = (zzdq) zzcfVar2.zzg;
                webView2 = (WebView) zzcfVar2.zzf;
                zzbv zzbvVar7 = (zzbv) zzcfVar2.zze;
                zzdcVar2 = (zzdc) zzcfVar2.zzd;
                str2 = (String) zzcfVar2.zzc;
                Application application7 = (Application) zzcfVar2.zzb;
                zzcoVar = (zzco) zzcfVar2.zza;
                ResultKt.throwOnFailure(obj);
                zzdqVar2 = zzdqVar3;
                zzbvVar2 = zzbvVar7;
                application2 = application7;
                i2 = 2;
                zzboVar2 = zzboVar7;
                d = d6;
                zzblVar = zzblVar5;
                zzpq zzpqVar4 = (zzpq) obj;
                zzcoVar.zzj(zzpqVar4.zzM());
                zzdc zza2 = zzdcVar2.zza();
                zzcfVar2.zza = application2;
                zzcfVar2.zzb = str2;
                zzcfVar2.zzc = zzdcVar2;
                zzcfVar2.zzd = zzbvVar2;
                zzcfVar2.zze = zzboVar2;
                zzcfVar2.zzf = zzblVar;
                zzcfVar2.zzg = zzpqVar4;
                zzcfVar2.zzm = null;
                zzcfVar2.zzl = null;
                zzcfVar2.zzh = d;
                zzcfVar2.zzk = i2;
                zzdc zzdcVar8 = zzdcVar2;
                String str8 = str2;
                zzbl zzblVar6 = zzblVar;
                double d7 = d;
                zzboVar3 = zzboVar2;
                obj = BuildersKt.withContext(zzboVar2.zzb().getCoroutineContext(), new zzcg(webView2, application2, zzbvVar2, zza2, zzboVar2, zzdqVar2, null), zzcfVar2);
                if (obj != coroutine_suspended) {
                    application3 = application2;
                    zzbvVar3 = zzbvVar2;
                    str3 = str8;
                    zzpqVar = zzpqVar4;
                    zzblVar2 = zzblVar6;
                    d2 = d7;
                    zzdcVar3 = zzdcVar8;
                    Application application62 = application3;
                    String str72 = str3;
                    zzdc zzdcVar72 = zzdcVar3;
                    zzx zzxVar2 = new zzx(zzblVar2, application3, zzdcVar3.zza(), zzboVar3, null, 16, null);
                    zzl zzlVar2 = zze;
                    zzlVar2.zze(zzxVar2, (zzgv) obj);
                    zzlVar2.zza = zzdcVar72.zza();
                    zzcfVar2.zza = application62;
                    zzcfVar2.zzb = str72;
                    zzcfVar2.zzc = zzdcVar72;
                    zzcfVar2.zzd = zzbvVar3;
                    zzcfVar2.zze = zzboVar3;
                    zzcfVar2.zzf = zzpqVar;
                    zzcfVar2.zzg = null;
                    zzcfVar2.zzk = 3;
                    zzc2 = zzlVar2.zzc((long) d2, zzpqVar, zzcfVar2);
                    if (zzc2 != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        zzcfVar = new zzcf(this, continuation);
        zzcf zzcfVar22 = zzcfVar;
        obj = zzcfVar22.zzi;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzcfVar22.zzk;
        if (i != 0) {
        }
        zzpq zzpqVar42 = (zzpq) obj;
        zzcoVar.zzj(zzpqVar42.zzM());
        zzdc zza22 = zzdcVar2.zza();
        zzcfVar22.zza = application2;
        zzcfVar22.zzb = str2;
        zzcfVar22.zzc = zzdcVar2;
        zzcfVar22.zzd = zzbvVar2;
        zzcfVar22.zze = zzboVar2;
        zzcfVar22.zzf = zzblVar;
        zzcfVar22.zzg = zzpqVar42;
        zzcfVar22.zzm = null;
        zzcfVar22.zzl = null;
        zzcfVar22.zzh = d;
        zzcfVar22.zzk = i2;
        zzdc zzdcVar82 = zzdcVar2;
        String str82 = str2;
        zzbl zzblVar62 = zzblVar;
        double d72 = d;
        zzboVar3 = zzboVar2;
        obj = BuildersKt.withContext(zzboVar2.zzb().getCoroutineContext(), new zzcg(webView2, application2, zzbvVar2, zza22, zzboVar2, zzdqVar2, null), zzcfVar22);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzm(Application application, String str, long j, zzbv zzbvVar, WebView webView, zzdq zzdqVar, zzbo zzboVar, zzdc zzdcVar, Continuation continuation) {
        zzcm zzcmVar;
        int i;
        zzbj e;
        zzco zzcoVar = this;
        Application application2 = application;
        try {
            if (continuation instanceof zzcm) {
                zzcmVar = (zzcm) continuation;
                int i2 = zzcmVar.zzd;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzcmVar.zzd = i2 - Integer.MIN_VALUE;
                    zzcm zzcmVar2 = zzcmVar;
                    Object obj = zzcmVar2.zzb;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzcmVar2.zzd;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        try {
                            zzdq zzdqVar2 = new zzdq(new zzbs(application2), new zzdo());
                            zzcmVar2.zze = zzcoVar;
                            zzcmVar2.zza = application2;
                            zzcmVar2.zzd = 1;
                            obj = zzl(application, str, j, zzdcVar, zzbvVar, null, zzdqVar2, zzboVar, zzcmVar2);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } catch (zzbj e2) {
                            e = e2;
                            if (Intrinsics.areEqual(e.zzb(), zzbh.zzc)) {
                            }
                            throw e;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj2 = zzcmVar2.zza;
                        zzco zzcoVar2 = zzcmVar2.zze;
                        try {
                            ResultKt.throwOnFailure(obj);
                            application2 = obj2;
                            zzcoVar = zzcoVar2;
                        } catch (zzbj e3) {
                            e = e3;
                            application2 = obj2;
                            zzcoVar = zzcoVar2;
                            if (Intrinsics.areEqual(e.zzb(), zzbh.zzc) || zzcoVar.zzk(application2)) {
                                throw e;
                            }
                            throw new zzbj(zzbh.zzc, zzbg.zzap, null);
                        }
                    }
                    zzcx zzcxVar = (zzcx) obj;
                    zzb = zzcxVar;
                    return zzcxVar;
                }
            }
            if (i != 0) {
            }
            zzcx zzcxVar2 = (zzcx) obj;
            zzb = zzcxVar2;
            return zzcxVar2;
        } catch (RecaptchaException e4) {
            throw e4;
        } catch (Exception e5) {
            throw new zzbj(zzbh.zzb, zzbg.zza, e5.getMessage());
        }
        zzcmVar = new zzcm(this, continuation);
        zzcm zzcmVar22 = zzcmVar;
        Object obj3 = zzcmVar22.zzb;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzcmVar22.zzd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r1v10, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [kotlinx.coroutines.sync.Mutex] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zze(Application application, String str, long j, zzbv zzbvVar, WebView webView, zzdq zzdqVar, zzbo zzboVar, Continuation continuation) throws TimeoutCancellationException, ApiException, RecaptchaException {
        zzcd zzcdVar;
        Object obj;
        Object coroutine_suspended;
        int i;
        String str2;
        zzbo zzboVar2;
        Object obj2;
        zzbv zzbvVar2;
        long j2;
        Application application2;
        ?? r1;
        try {
            if (continuation instanceof zzcd) {
                zzcdVar = (zzcd) continuation;
                int i2 = zzcdVar.zzf;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzcdVar.zzf = i2 - Integer.MIN_VALUE;
                    obj = zzcdVar.zzd;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzcdVar.zzf;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex = zzd;
                        zzcdVar.zza = application;
                        str2 = str;
                        zzcdVar.zzg = str2;
                        zzcdVar.zzh = zzbvVar;
                        zzcdVar.zzi = zzboVar;
                        zzcdVar.zzb = mutex;
                        zzcdVar.zzc = j;
                        zzcdVar.zzf = 1;
                        if (mutex.lock(null, zzcdVar) != coroutine_suspended) {
                            zzboVar2 = zzboVar;
                            obj2 = mutex;
                            zzbvVar2 = zzbvVar;
                            j2 = j;
                            application2 = application;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r1 = (Mutex) zzcdVar.zza;
                        try {
                            ResultKt.throwOnFailure(obj);
                            r1 = r1;
                            zzcx zzcxVar = (zzcx) obj;
                            r1.unlock(null);
                            return zzcxVar;
                        } catch (Throwable th) {
                            th = th;
                            r1.unlock(null);
                            throw th;
                        }
                    }
                    long j3 = zzcdVar.zzc;
                    obj2 = zzcdVar.zzb;
                    zzboVar2 = zzcdVar.zzi;
                    zzbv zzbvVar3 = zzcdVar.zzh;
                    String str3 = zzcdVar.zzg;
                    application2 = (Application) zzcdVar.zza;
                    ResultKt.throwOnFailure(obj);
                    zzbvVar2 = zzbvVar3;
                    j2 = j3;
                    str2 = str3;
                    zzco zzcoVar = zza;
                    zzce zzceVar = new zzce(str2, application2, j2, zzbvVar2, null, null, zzboVar2, null);
                    zzcdVar.zza = obj2;
                    zzcdVar.zzg = null;
                    zzcdVar.zzh = null;
                    zzcdVar.zzi = null;
                    zzcdVar.zzb = null;
                    zzcdVar.zzf = 2;
                    obj = zzcoVar.zzi(str2, application2, zzceVar, zzcdVar);
                    if (obj != coroutine_suspended) {
                        r1 = obj2;
                        zzcx zzcxVar2 = (zzcx) obj;
                        r1.unlock(null);
                        return zzcxVar2;
                    }
                    return coroutine_suspended;
                }
            }
            zzco zzcoVar2 = zza;
            zzce zzceVar2 = new zzce(str2, application2, j2, zzbvVar2, null, null, zzboVar2, null);
            zzcdVar.zza = obj2;
            zzcdVar.zzg = null;
            zzcdVar.zzh = null;
            zzcdVar.zzi = null;
            zzcdVar.zzb = null;
            zzcdVar.zzf = 2;
            obj = zzcoVar2.zzi(str2, application2, zzceVar2, zzcdVar);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (Throwable th2) {
            th = th2;
            r1 = obj2;
            r1.unlock(null);
            throw th;
        }
        zzcdVar = new zzcd(this, continuation);
        obj = zzcdVar.zzd;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzcdVar.zzf;
        if (i != 0) {
        }
    }
}
