package com.google.android.recaptcha.internal;

import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.core.integrity.model.StandardIntegrityErrorCode;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
final class zzae extends SuspendLambda implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzag zzc;
    final /* synthetic */ String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzae(zzag zzagVar, String str, Continuation continuation) {
        super(2, continuation);
        this.zzc = zzagVar;
        this.zzd = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzae(this.zzc, this.zzd, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzae) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.google.android.recaptcha.internal.zzdf] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zzaa zzaaVar;
        zzap zzapVar;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        zzdf zzdfVar = this.zzb;
        try {
        } catch (Exception e) {
            zzdfVar.zzb(new zzbj(zzbh.zzb, zzbg.zzab, e.getMessage()));
            zzag zzagVar = this.zzc;
            this.zza = zzagVar;
            int i = 2;
            this.zzb = 2;
            if (e instanceof StandardIntegrityException) {
                int errorCode = ((StandardIntegrityException) e).getErrorCode();
                if (errorCode == -100) {
                    i = 44;
                } else if (errorCode == -12) {
                    i = 39;
                } else if (errorCode == -3) {
                    i = 30;
                } else if (errorCode == -2) {
                    i = 29;
                } else if (errorCode != -1) {
                    switch (errorCode) {
                        case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                            i = 54;
                            break;
                        case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                            i = 53;
                            break;
                        case -17:
                            i = 52;
                            break;
                        case -16:
                            i = 43;
                            break;
                        case -15:
                            i = 42;
                            break;
                        case -14:
                            i = 41;
                            break;
                        default:
                            switch (errorCode) {
                                case -9:
                                    i = 36;
                                    break;
                                case -8:
                                    i = 35;
                                    break;
                                case -7:
                                    i = 34;
                                    break;
                                case -6:
                                    i = 33;
                                    break;
                                case -5:
                                    i = 32;
                                    break;
                            }
                    }
                } else {
                    i = 28;
                }
            } else {
                i = 45;
            }
            zzrh zzf = zzri.zzf();
            zzf.zzp(i);
            zzf.zzq(15);
            obj = zzf.zzj();
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            zzaaVar = zzagVar;
        }
        if (zzdfVar == 0) {
            ResultKt.throwOnFailure(obj);
            zzdf zzb = zzab.zzb(this.zzc, this.zzd);
            zzag zzagVar2 = this.zzc;
            zzapVar = zzagVar2.zzb;
            str = zzagVar2.zzd;
            this.zza = zzb;
            this.zzb = 1;
            obj = zzapVar.zzc(str, this);
            zzdfVar = zzb;
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (zzdfVar != 1) {
                zzaaVar = (zzaa) this.zza;
                ResultKt.throwOnFailure(obj);
                int zza = zzaaVar.zza();
                zzrh zzrhVar = (zzrh) ((zzri) obj).zzq();
                zzrhVar.zze(zzaaVar.zza());
                return new zzy(zza, (zzri) zzrhVar.zzj());
            }
            zzdf zzdfVar2 = (zzdf) this.zza;
            ResultKt.throwOnFailure(obj);
            zzdfVar = zzdfVar2;
        }
        zzdfVar.zza();
        zzag zzagVar3 = this.zzc;
        zzrj zzf2 = zzrm.zzf();
        zzrk zzf3 = zzrl.zzf();
        zzf3.zzv((String) obj);
        zzf2.zze((zzrl) zzf3.zzj());
        return zzab.zza(zzagVar3, (zzrm) zzf2.zzj());
    }
}
