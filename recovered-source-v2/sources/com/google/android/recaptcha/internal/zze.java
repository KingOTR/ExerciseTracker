package com.google.android.recaptcha.internal;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.TimeoutKt;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public abstract class zze {
    private boolean zza;

    protected zzdf zza(String str) {
        throw null;
    }

    protected zzdf zzb() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081 A[Catch: Exception -> 0x004e, TryCatch #0 {Exception -> 0x004e, blocks: (B:23:0x004a, B:24:0x0074, B:26:0x0081, B:27:0x0084), top: B:22:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(String str, long j, Continuation continuation) throws zzbj {
        zza zzaVar;
        int i;
        long j2;
        Exception exc;
        String str2;
        Object obj;
        zzdf zzdfVar;
        Object obj2;
        String str3;
        if (continuation instanceof zza) {
            zzaVar = (zza) continuation;
            int i2 = zzaVar.zze;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzaVar.zze = i2 - Integer.MIN_VALUE;
                Object obj3 = zzaVar.zzc;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzaVar.zze;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj3);
                    zzdf zza = zza(str);
                    try {
                        zzb zzbVar = new zzb(this, str, null);
                        zzaVar.zza = this;
                        zzaVar.zzf = str;
                        zzaVar.zzg = zza;
                        zzaVar.zzb = j;
                        zzaVar.zze = 1;
                        Object withTimeout = TimeoutKt.withTimeout(j, zzbVar, zzaVar);
                        if (withTimeout == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj2 = this;
                        zzdfVar = zza;
                        obj3 = withTimeout;
                    } catch (Exception e) {
                        j2 = j;
                        exc = e;
                        str2 = str;
                        obj = this;
                        zzdfVar = zza;
                        zzbj zza2 = zzf.zza(exc, new zzbj(zzbh.zzb, zzbg.zzaq, exc.getClass().getSimpleName()));
                        if (zzdfVar != null) {
                        }
                        zzaVar.zza = obj;
                        zzaVar.zzf = str2;
                        zzaVar.zzg = null;
                        zzaVar.zze = 2;
                        if (((zze) obj).zzi(str2, j2, exc, zzaVar) != coroutine_suspended) {
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj3);
                            return Result.m7905constructorimpl(obj3);
                        }
                        str3 = zzaVar.zzf;
                        obj = zzaVar.zza;
                        ResultKt.throwOnFailure(obj3);
                        Result.Companion companion = Result.INSTANCE;
                        zzaVar.zza = null;
                        zzaVar.zzf = null;
                        zzaVar.zze = 3;
                        obj3 = ((zze) obj).zzd(str3, zzaVar);
                        if (obj3 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Result.m7905constructorimpl(obj3);
                    }
                    j = zzaVar.zzb;
                    zzdfVar = zzaVar.zzg;
                    str = zzaVar.zzf;
                    obj2 = zzaVar.zza;
                    try {
                        ResultKt.throwOnFailure(obj3);
                    } catch (Exception e2) {
                        j2 = j;
                        exc = e2;
                        str2 = str;
                        obj = obj2;
                        zzbj zza22 = zzf.zza(exc, new zzbj(zzbh.zzb, zzbg.zzaq, exc.getClass().getSimpleName()));
                        if (zzdfVar != null) {
                            zzdfVar.zzb(zza22);
                        }
                        zzaVar.zza = obj;
                        zzaVar.zzf = str2;
                        zzaVar.zzg = null;
                        zzaVar.zze = 2;
                        if (((zze) obj).zzi(str2, j2, exc, zzaVar) != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str3 = str2;
                        Result.Companion companion2 = Result.INSTANCE;
                        zzaVar.zza = null;
                        zzaVar.zzf = null;
                        zzaVar.zze = 3;
                        obj3 = ((zze) obj).zzd(str3, zzaVar);
                        if (obj3 == coroutine_suspended) {
                        }
                        return Result.m7905constructorimpl(obj3);
                    }
                }
                Object value = ((Result) obj3).getValue();
                ResultKt.throwOnFailure(value);
                zzpw zzpwVar = (zzpw) value;
                if (zzdfVar != null) {
                    zzdfVar.zza();
                }
                return Result.m7905constructorimpl(zzpwVar);
            }
        }
        zzaVar = new zza(this, continuation);
        Object obj32 = zzaVar.zzc;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzaVar.zze;
        if (i != 0) {
        }
        Object value2 = ((Result) obj32).getValue();
        ResultKt.throwOnFailure(value2);
        zzpw zzpwVar2 = (zzpw) value2;
        if (zzdfVar != null) {
        }
        return Result.m7905constructorimpl(zzpwVar2);
    }

    protected abstract Object zzd(String str, Continuation continuation);

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0080, code lost:
    
        if (r9 != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091 A[Catch: Exception -> 0x0099, TryCatch #0 {Exception -> 0x0099, blocks: (B:29:0x0082, B:31:0x0091, B:32:0x0094, B:48:0x0071), top: B:47:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zze(long j, zzpq zzpqVar, Continuation continuation) throws zzbj {
        zzc zzcVar;
        int i;
        zzdf zzb;
        Object withTimeout;
        Exception e;
        Object zzj;
        zze zzeVar;
        zzdf zzdfVar;
        zzbj zzbjVar;
        zzbj zzbjVar2;
        if (continuation instanceof zzc) {
            zzcVar = (zzc) continuation;
            int i2 = zzcVar.zzd;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzcVar.zzd = i2 - Integer.MIN_VALUE;
                Object obj = zzcVar.zzb;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zzcVar.zzd;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    zzb = zzb();
                    if (this.zza) {
                        zzb.zza();
                        Result.Companion companion = Result.INSTANCE;
                        return Result.m7905constructorimpl(Unit.INSTANCE);
                    }
                    try {
                        zzd zzdVar = new zzd(this, zzpqVar, null);
                        zzcVar.zza = this;
                        zzcVar.zze = zzb;
                        zzcVar.zzd = 1;
                        withTimeout = TimeoutKt.withTimeout(j, zzdVar, zzcVar);
                    } catch (Exception e2) {
                        e = e2;
                        this.zza = false;
                        zzcVar.zza = this;
                        zzcVar.zze = zzb;
                        zzcVar.zzd = 2;
                        zzj = this.zzj(e, zzcVar);
                        if (zzj != coroutine_suspended) {
                            zzeVar = this;
                            zzdfVar = zzb;
                            obj = zzj;
                            zzbjVar = (zzbj) obj;
                            if (zzdfVar != null) {
                            }
                            zzcVar.zza = zzbjVar;
                            zzcVar.zze = null;
                            zzcVar.zzd = 3;
                            if (zzeVar.zzg(zzbjVar, zzcVar) != coroutine_suspended) {
                            }
                        }
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            zzbjVar2 = (zzbj) zzcVar.zza;
                            ResultKt.throwOnFailure(obj);
                            Result.Companion companion2 = Result.INSTANCE;
                            return Result.m7905constructorimpl(ResultKt.createFailure(zzbjVar2));
                        }
                        zzdfVar = zzcVar.zze;
                        zzeVar = (zze) zzcVar.zza;
                        ResultKt.throwOnFailure(obj);
                        zzbjVar = (zzbj) obj;
                        if (zzdfVar != null) {
                            zzdfVar.zzb(zzbjVar);
                        }
                        zzcVar.zza = zzbjVar;
                        zzcVar.zze = null;
                        zzcVar.zzd = 3;
                        if (zzeVar.zzg(zzbjVar, zzcVar) != coroutine_suspended) {
                            zzbjVar2 = zzbjVar;
                            Result.Companion companion22 = Result.INSTANCE;
                            return Result.m7905constructorimpl(ResultKt.createFailure(zzbjVar2));
                        }
                        return coroutine_suspended;
                    }
                    zzdf zzdfVar2 = zzcVar.zze;
                    zze zzeVar2 = (zze) zzcVar.zza;
                    try {
                        ResultKt.throwOnFailure(obj);
                        zzb = zzdfVar2;
                        this = zzeVar2;
                        withTimeout = obj;
                    } catch (Exception e3) {
                        e = e3;
                        zzb = zzdfVar2;
                        this = zzeVar2;
                        this.zza = false;
                        zzcVar.zza = this;
                        zzcVar.zze = zzb;
                        zzcVar.zzd = 2;
                        zzj = this.zzj(e, zzcVar);
                        if (zzj != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                }
                ResultKt.throwOnFailure(((Result) withTimeout).getValue());
                Unit unit = Unit.INSTANCE;
                this.zza = true;
                if (zzb != null) {
                    zzb.zza();
                }
                return Result.m7905constructorimpl(unit);
            }
        }
        zzcVar = new zzc(this, continuation);
        Object obj2 = zzcVar.zzb;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzcVar.zzd;
        if (i != 0) {
        }
        ResultKt.throwOnFailure(((Result) withTimeout).getValue());
        Unit unit2 = Unit.INSTANCE;
        this.zza = true;
        if (zzb != null) {
        }
        return Result.m7905constructorimpl(unit2);
    }

    protected abstract Object zzf(String str, Continuation continuation) throws zzbj;

    protected Object zzg(zzbj zzbjVar, Continuation continuation) {
        return Unit.INSTANCE;
    }

    protected abstract Object zzh(zzpq zzpqVar, Continuation continuation) throws zzbj;

    protected Object zzi(String str, long j, Exception exc, Continuation continuation) {
        return Unit.INSTANCE;
    }

    protected Object zzj(Exception exc, Continuation continuation) {
        return zzf.zza(exc, new zzbj(zzbh.zzb, zzbg.zzaq, exc.getClass().getSimpleName()));
    }

    protected void zzk(zzqf zzqfVar) {
    }

    public final boolean zzl() {
        return this.zza;
    }
}
