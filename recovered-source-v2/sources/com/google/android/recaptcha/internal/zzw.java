package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
final class zzw extends SuspendLambda implements Function2 {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzpq zzd;
    final /* synthetic */ zzx zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzw(zzpq zzpqVar, zzx zzxVar, Continuation continuation) {
        super(2, continuation);
        this.zzd = zzpqVar;
        this.zze = zzxVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzw(this.zzd, this.zze, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzw) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        Object obj2;
        Iterator it;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.zzc != 0) {
            Object obj3 = this.zzb;
            Object obj4 = this.zza;
            ResultKt.throwOnFailure(obj);
            it = obj3;
            obj2 = obj4;
        } else {
            ResultKt.throwOnFailure(obj);
            if (!this.zzd.zzO()) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m7904boximpl(Result.m7905constructorimpl(ResultKt.createFailure(new zzbj(zzbh.zzb, zzbg.zzac, null))));
            }
            zzpq zzpqVar = this.zzd;
            zzx zzxVar = this.zze;
            zzps zzj = zzpqVar.zzj();
            zzxVar.zzc = zzj.zzi();
            list = this.zze.zzb;
            it = list.iterator();
            obj2 = zzj;
        }
        while (it.hasNext()) {
            zzaa zzaaVar = (zzaa) it.next();
            this.zza = obj2;
            this.zzb = it;
            this.zzc = 1;
            if (zzaaVar.zzd((zzps) obj2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        Result.Companion companion2 = Result.INSTANCE;
        return Result.m7904boximpl(Result.m7905constructorimpl(Unit.INSTANCE));
    }
}
