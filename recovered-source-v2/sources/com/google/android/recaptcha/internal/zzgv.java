package com.google.android.recaptcha.internal;

import android.content.Context;
import android.webkit.WebView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzgv extends zze {
    public CompletableDeferred zza;
    public zzdv zzb;
    private final WebView zzc;
    private final Context zzd;
    private final zzbv zze;
    private final zzdc zzf;
    private final zzdq zzg;
    private final Map zzh = zzgw.zza();
    private final Map zzi = new LinkedHashMap();
    private final zzgz zzj = zzgz.zzc();
    private final zzgo zzk;
    private final zzdc zzl;
    private zzdf zzm;
    private final zzbo zzn;

    public zzgv(WebView webView, Context context, zzbv zzbvVar, zzdc zzdcVar, zzbo zzboVar, zzdq zzdqVar) {
        this.zzc = webView;
        this.zzd = context;
        this.zze = zzbvVar;
        this.zzf = zzdcVar;
        this.zzn = zzboVar;
        this.zzg = zzdqVar;
        zzgo zzgoVar = new zzgo(this);
        this.zzk = zzgoVar;
        zzdc zza = zzdcVar.zza();
        zza.zzc(zzdcVar.zzd());
        this.zzl = zza;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.addJavascriptInterface(zzgoVar, "RN");
        webView.setWebViewClient(new zzgp(this));
    }

    public static final /* synthetic */ void zzv(zzgv zzgvVar, String str) {
        zzgvVar.zzm = zzgvVar.zzl.zzf(26);
        try {
            zzgvVar.zzc.loadDataWithBaseURL(zzgvVar.zze.zza(), str, "text/html", "utf-8", null);
        } catch (Exception unused) {
            zzbj zzbjVar = new zzbj(zzbh.zzb, zzbg.zzU, null);
            zzdf zzdfVar = zzgvVar.zzm;
            if (zzdfVar != null) {
                zzdfVar.zzb(zzbjVar);
            }
            zzgvVar.zzm = null;
            zzgvVar.zzu().completeExceptionally(zzbjVar);
        }
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final zzdf zza(String str) {
        zzdc zzdcVar = this.zzf;
        zzdcVar.zzc(str);
        return zzdcVar.zzf(33);
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final zzdf zzb() {
        zzdc zzdcVar = this.zzf;
        zzdcVar.zzc(zzdcVar.zzd());
        return zzdcVar.zzf(32);
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final Object zzd(String str, Continuation continuation) {
        zzpv zzf = zzpw.zzf();
        zzf.zzd(str);
        return zzf.zzj();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final Object zzf(String str, Continuation continuation) {
        zzgs zzgsVar;
        int i;
        try {
            if (continuation instanceof zzgs) {
                zzgsVar = (zzgs) continuation;
                int i2 = zzgsVar.zzc;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzgsVar.zzc = i2 - Integer.MIN_VALUE;
                    Object obj = zzgsVar.zza;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzgsVar.zzc;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                        this.zzi.put(str, CompletableDeferred$default);
                        zzqw zzf = zzqx.zzf();
                        zzf.zzd(str);
                        byte[] zzd = ((zzqx) zzf.zzj()).zzd();
                        BuildersKt__Builders_commonKt.launch$default(this.zzn.zzb(), null, null, new zzgt(this, zzhz.zzh().zzi(zzd, 0, zzd.length), null), 3, null);
                        zzgsVar.zzd = this;
                        zzgsVar.zze = str;
                        zzgsVar.zzc = 1;
                        obj = CompletableDeferred$default.await(zzgsVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str = zzgsVar.zze;
                        zzgv zzgvVar = zzgsVar.zzd;
                        ResultKt.throwOnFailure(obj);
                    }
                    zzpw zzpwVar = (zzpw) obj;
                    zzpv zzpvVar = (zzpv) zzpwVar.zzq();
                    zzpz zzf2 = zzqa.zzf();
                    zzf2.zzd(zzpwVar.zzJ());
                    zzpvVar.zzp(zzf2);
                    zzpx zzf3 = zzpy.zzf();
                    zzf3.zzd(zzpwVar.zzj());
                    zzf3.zze(zzpwVar.zzK());
                    zzpvVar.zzq(zzf3);
                    Result.Companion companion = Result.INSTANCE;
                    return Result.m7905constructorimpl(zzpvVar.zzj());
                }
            }
            if (i != 0) {
            }
            zzpw zzpwVar2 = (zzpw) obj;
            zzpv zzpvVar2 = (zzpv) zzpwVar2.zzq();
            zzpz zzf22 = zzqa.zzf();
            zzf22.zzd(zzpwVar2.zzJ());
            zzpvVar2.zzp(zzf22);
            zzpx zzf32 = zzpy.zzf();
            zzf32.zzd(zzpwVar2.zzj());
            zzf32.zze(zzpwVar2.zzK());
            zzpvVar2.zzq(zzf32);
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m7905constructorimpl(zzpvVar2.zzj());
        } catch (Exception e) {
            zzbj zza = zzf.zza(e, new zzbj(zzbh.zzb, zzbg.zzW, e.getClass().getSimpleName()));
            CompletableDeferred completableDeferred = (CompletableDeferred) this.zzi.remove(str);
            if (completableDeferred != null) {
                Boxing.boxBoolean(completableDeferred.completeExceptionally(zza));
            }
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m7905constructorimpl(ResultKt.createFailure(zza));
        }
        zzgsVar = new zzgs(this, continuation);
        Object obj2 = zzgsVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzgsVar.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final Object zzg(zzbj zzbjVar, Continuation continuation) {
        if (Intrinsics.areEqual(zzbjVar.zza(), zzbg.zzb)) {
            zzdf zzdfVar = this.zzm;
            if (zzdfVar != null) {
                zzdfVar.zzb(zzbjVar);
            }
            this.zzm = null;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // com.google.android.recaptcha.internal.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final Object zzh(zzpq zzpqVar, Continuation continuation) {
        zzgu zzguVar;
        int i;
        try {
            if (continuation instanceof zzgu) {
                zzguVar = (zzgu) continuation;
                int i2 = zzguVar.zzc;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzguVar.zzc = i2 - Integer.MIN_VALUE;
                    Object obj = zzguVar.zza;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzguVar.zzc;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        this.zzb = zzy(zzpqVar, new zzcb(zzpqVar.zzf()));
                        this.zza = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                        Boxing.boxInt(zzu().hashCode());
                        this.zzj.zzd();
                        this.zzj.zze();
                        BuildersKt__Builders_commonKt.launch$default(this.zzn.zza(), null, null, new zzgr(this, zzpqVar, null), 3, null);
                        Boxing.boxInt(zzu().hashCode());
                        CompletableDeferred zzu = zzu();
                        zzguVar.zzc = 1;
                        if (zzu.await(zzguVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    Unit unit = Unit.INSTANCE;
                    Result.Companion companion = Result.INSTANCE;
                    return Result.m7905constructorimpl(unit);
                }
            }
            if (i != 0) {
            }
            Unit unit2 = Unit.INSTANCE;
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m7905constructorimpl(unit2);
        } catch (Exception e) {
            e.getMessage();
            zzbj zza = zzf.zza(e, new zzbj(zzbh.zzb, zzbg.zzV, e.getClass().getSimpleName()));
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m7905constructorimpl(ResultKt.createFailure(zza));
        }
        zzguVar = new zzgu(this, continuation);
        Object obj2 = zzguVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzguVar.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final Object zzi(String str, long j, Exception exc, Continuation continuation) {
        CompletableDeferred completableDeferred = (CompletableDeferred) this.zzi.remove(str);
        if (completableDeferred != null) {
            Boxing.boxBoolean(completableDeferred.completeExceptionally(exc));
        }
        return Unit.INSTANCE;
    }

    @Override // com.google.android.recaptcha.internal.zze
    protected final Object zzj(Exception exc, Continuation continuation) {
        Long zza = this.zzk.zza();
        if ((exc instanceof TimeoutCancellationException) && zza == null) {
            return new zzbj(zzbh.zzc, zzbg.zzH, null);
        }
        return zzf.zza(exc, new zzbj(zzbh.zzb, zzbg.zzV, exc.getClass().getSimpleName()));
    }

    public final WebView zzm() {
        return this.zzc;
    }

    public final zzdq zzp() {
        return this.zzg;
    }

    public final zzgo zzq() {
        return this.zzk;
    }

    public final CompletableDeferred zzu() {
        CompletableDeferred completableDeferred = this.zza;
        if (completableDeferred != null) {
            return completableDeferred;
        }
        return null;
    }

    public final zzea zzy(zzpq zzpqVar, zzcb zzcbVar) {
        zzed zzedVar = new zzed(this.zzc, this.zzn.zzb());
        zzgf zzgfVar = new zzgf();
        zzgfVar.zzb(CollectionsKt.toLongArray(zzpqVar.zzN()));
        zzem zzemVar = new zzem(zzedVar, zzcbVar, new zzbu());
        zzgg zzggVar = new zzgg(zzgfVar, new zzgd());
        zzemVar.zze(3, this.zzd);
        zzemVar.zze(5, zzgm.class.getMethod("cs", new Object[0].getClass()));
        zzemVar.zze(6, new zzgh(this.zzd));
        zzemVar.zze(7, new zzgj());
        zzemVar.zze(8, new zzgn(this.zzd));
        zzemVar.zze(9, new zzgk(this.zzd));
        zzemVar.zze(10, new zzgi(this.zzd));
        return new zzea(this.zzn.zzd(), zzemVar, zzggVar, zzdu.zza());
    }
}
