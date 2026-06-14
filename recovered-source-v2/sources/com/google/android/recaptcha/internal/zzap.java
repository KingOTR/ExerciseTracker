package com.google.android.recaptcha.internal;

import android.content.Context;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import java.util.Timer;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzap {
    public CompletableDeferred zza;
    private final CoroutineScope zzb;
    private final zzdc zzc;
    private final StandardIntegrityManager zzd;
    private long zzf;
    private boolean zzh;
    private zzat zze = zzat.zza;
    private final Mutex zzg = MutexKt.Mutex$default(false, 1, null);

    public zzap(Context context, CoroutineScope coroutineScope, zzdc zzdcVar, StandardIntegrityManager standardIntegrityManager, long j) {
        this.zzb = coroutineScope;
        this.zzc = zzdcVar;
        this.zzd = standardIntegrityManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzi(Continuation continuation) throws Exception {
        zzai zzaiVar;
        int i;
        if (continuation instanceof zzai) {
            zzaiVar = (zzai) continuation;
            int i2 = zzaiVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzaiVar.zzc = i2 - Integer.MIN_VALUE;
                Object obj = zzaiVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzaiVar.zzc;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Deferred zza = zzas.zza(this.zzd.prepareIntegrityToken(StandardIntegrityManager.PrepareIntegrityTokenRequest.builder().setCloudProjectNumber(this.zzf).build()));
                    zzaiVar.zzc = 1;
                    obj = zza.await(zzaiVar);
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
        zzaiVar = new zzai(this, continuation);
        Object obj2 = zzaiVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzaiVar.zzc;
        if (i != 0) {
        }
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
    
        if (r7 != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r7 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzj(String str, Continuation continuation) throws Exception {
        zzaj zzajVar;
        int i;
        if (continuation instanceof zzaj) {
            zzajVar = (zzaj) continuation;
            int i2 = zzajVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzajVar.zzc = i2 - Integer.MIN_VALUE;
                Object obj = zzajVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzajVar.zzc;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CompletableDeferred zzf = zzf();
                    zzajVar.zzd = str;
                    zzajVar.zzc = 1;
                    obj = zzf.await(zzajVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ((StandardIntegrityManager.StandardIntegrityToken) obj).token();
                    }
                    str = zzajVar.zzd;
                    ResultKt.throwOnFailure(obj);
                }
                Deferred zza = zzas.zza(((StandardIntegrityManager.StandardIntegrityTokenProvider) obj).request(StandardIntegrityManager.StandardIntegrityTokenRequest.builder().setRequestHash(str).build()));
                zzajVar.zzd = null;
                zzajVar.zzc = 2;
                obj = zza.await(zzajVar);
            }
        }
        zzajVar = new zzaj(this, continuation);
        Object obj2 = zzajVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzajVar.zzc;
        if (i != 0) {
        }
        Deferred zza2 = zzas.zza(((StandardIntegrityManager.StandardIntegrityTokenProvider) obj2).request(StandardIntegrityManager.StandardIntegrityTokenRequest.builder().setRequestHash(str).build()));
        zzajVar.zzd = null;
        zzajVar.zzc = 2;
        obj2 = zza2.await(zzajVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(4:5|6|7|(1:(1:(1:(2:12|13)(2:15|16))(5:17|18|(1:22)|20|21))(3:23|24|25))(5:26|27|(1:29)|20|21)))|33|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
    
        r0.zzd = r7;
        r0.zze = r8;
        r0.zzc = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0062, code lost:
    
        if (zze(r0) != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        r8 = r7;
        r7 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(String str, Continuation continuation) throws Exception {
        zzah zzahVar;
        int i;
        if (continuation instanceof zzah) {
            zzahVar = (zzah) continuation;
            int i2 = zzahVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzahVar.zzc = i2 - Integer.MIN_VALUE;
                Object obj = zzahVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzahVar.zzc;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    zzahVar.zzd = this;
                    zzahVar.zze = str;
                    zzahVar.zzc = 1;
                    Object zzj = zzj(str, zzahVar);
                    if (zzj != coroutine_suspended) {
                        return zzj;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    String str2 = zzahVar.zze;
                    zzap zzapVar = zzahVar.zzd;
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                String str3 = zzahVar.zze;
                zzap zzapVar2 = zzahVar.zzd;
                ResultKt.throwOnFailure(obj);
                zzahVar.zzd = null;
                zzahVar.zze = null;
                zzahVar.zzc = 3;
                Object zzj2 = zzapVar2.zzj(str3, zzahVar);
                if (zzj2 != coroutine_suspended) {
                    return zzj2;
                }
                return coroutine_suspended;
            }
        }
        zzahVar = new zzah(this, continuation);
        Object obj2 = zzahVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzahVar.zzc;
        if (i != 0) {
        }
    }

    public final Object zzd(long j, Continuation continuation) {
        this.zzf = j;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00af, code lost:
    
        if (kotlin.Unit.INSTANCE == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ba, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004f, code lost:
    
        if (r13.lock(null, r0) != r1) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b A[Catch: all -> 0x00b5, TRY_LEAVE, TryCatch #0 {all -> 0x00b5, blocks: (B:18:0x0051, B:20:0x005b, B:23:0x0061), top: B:17:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061 A[Catch: all -> 0x00b5, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00b5, blocks: (B:18:0x0051, B:20:0x005b, B:23:0x0061), top: B:17:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zze(Continuation continuation) {
        zzam zzamVar;
        int i;
        Mutex mutex;
        try {
            if (continuation instanceof zzam) {
                zzamVar = (zzam) continuation;
                int i2 = zzamVar.zzd;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzamVar.zzd = i2 - Integer.MIN_VALUE;
                    Object obj = zzamVar.zzb;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzamVar.zzd;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.zzg;
                        zzamVar.zze = this;
                        zzamVar.zza = mutex;
                        zzamVar.zzd = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        Object obj2 = zzamVar.zza;
                        zzap zzapVar = zzamVar.zze;
                        ResultKt.throwOnFailure(obj);
                        mutex = obj2;
                        this = zzapVar;
                    }
                    if (Intrinsics.areEqual(this.zze, zzat.zza)) {
                        return Unit.INSTANCE;
                    }
                    this.zze = zzat.zzb;
                    Unit unit = Unit.INSTANCE;
                    mutex.unlock(null);
                    zzdc zzdcVar = this.zzc;
                    zzdcVar.zzc(zzdcVar.zzd());
                    zzdcVar.zzb(2);
                    zzdf zzf = zzdcVar.zzf(38);
                    this.zza = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                    BuildersKt__Builders_commonKt.launch$default(this.zzb, null, null, new zzao(this, zzf, null), 3, null);
                    zzamVar.zze = null;
                    zzamVar.zza = null;
                    zzamVar.zzd = 2;
                    if (!this.zzh) {
                        new Timer().schedule(new zzak(this), 28800000L, 28800000L);
                        this.zzh = true;
                    }
                }
            }
            if (Intrinsics.areEqual(this.zze, zzat.zza)) {
            }
        } finally {
            mutex.unlock(null);
        }
        zzamVar = new zzam(this, continuation);
        Object obj3 = zzamVar.zzb;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzamVar.zzd;
        if (i != 0) {
        }
    }

    public final CompletableDeferred zzf() {
        CompletableDeferred completableDeferred = this.zza;
        if (completableDeferred != null) {
            return completableDeferred;
        }
        return null;
    }
}
