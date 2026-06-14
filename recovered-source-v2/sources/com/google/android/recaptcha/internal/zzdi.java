package com.google.android.recaptcha.internal;

import java.util.Timer;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
final class zzdi extends SuspendLambda implements Function2 {
    final /* synthetic */ zzdk zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdi(zzdk zzdkVar, Continuation continuation) {
        super(2, continuation);
        this.zza = zzdkVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzdi(this.zza, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdi) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zzda zzdaVar;
        Timer timer;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        zzdk zzdkVar = this.zza;
        synchronized (zzdg.class) {
            zzdaVar = zzdkVar.zze;
            if (zzdaVar != null && zzdaVar.zzb() == 0) {
                timer = zzdk.zza;
                if (timer != null) {
                    timer.cancel();
                }
                zzdk.zza = null;
            }
            zzdkVar.zzg();
            Unit unit = Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
