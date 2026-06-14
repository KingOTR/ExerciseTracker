package com.google.android.recaptcha.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
final class zzao extends SuspendLambda implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzap zzc;
    final /* synthetic */ zzdf zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzao(zzap zzapVar, zzdf zzdfVar, Continuation continuation) {
        super(2, continuation);
        this.zzc = zzapVar;
        this.zzd = zzdfVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzao(this.zzc, this.zzd, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzao) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Exception e;
        Throwable th;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.zzb != 0) {
            obj2 = this.zza;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception e2) {
                e = e2;
                CompletableDeferred zzf = this.zzc.zzf();
                th = (Throwable) ((Ref.ObjectRef) obj2).element;
                if (th == null) {
                    th = e;
                }
                zzf.completeExceptionally(th);
                this.zzc.zze = zzat.zza;
                this.zzd.zzb(new zzbj(zzbh.zzb, zzbg.zza, e.getMessage()));
                return Unit.INSTANCE;
            }
        } else {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            try {
                zzan zzanVar = new zzan(this.zzc, this.zzd, objectRef, null);
                this.zza = objectRef;
                this.zzb = 1;
                if (TimeoutKt.withTimeout(60000L, zzanVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Exception e3) {
                obj2 = objectRef;
                e = e3;
                CompletableDeferred zzf2 = this.zzc.zzf();
                th = (Throwable) ((Ref.ObjectRef) obj2).element;
                if (th == null) {
                }
                zzf2.completeExceptionally(th);
                this.zzc.zze = zzat.zza;
                this.zzd.zzb(new zzbj(zzbh.zzb, zzbg.zza, e.getMessage()));
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }
}
