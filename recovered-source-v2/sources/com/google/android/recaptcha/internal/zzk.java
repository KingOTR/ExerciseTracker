package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
final class zzk extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzpq zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzk(zzl zzlVar, long j, zzpq zzpqVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzlVar;
        this.zzc = j;
        this.zzd = zzpqVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzk zzkVar = new zzk(this.zzb, this.zzc, this.zzd, continuation);
        zzkVar.zze = obj;
        return zzkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzk) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zzdf zzf;
        Object awaitAll;
        Deferred async$default;
        Object m7905constructorimpl;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.zza != 0) {
            zzdf zzdfVar = (zzdf) this.zze;
            ResultKt.throwOnFailure(obj);
            zzf = zzdfVar;
            awaitAll = obj;
        } else {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.zze;
            zzl zzlVar = this.zzb;
            zzdc zza = zzlVar.zza();
            zza.zzc(zzlVar.zza().zzd());
            zzf = zza.zzf(30);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzd().iterator();
            while (it.hasNext()) {
                async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new zzj((zze) it.next(), this.zzc, this.zzd, null), 3, null);
                arrayList.add(async$default);
            }
            Deferred[] deferredArr = (Deferred[]) arrayList.toArray(new Deferred[0]);
            Deferred[] deferredArr2 = (Deferred[]) Arrays.copyOf(deferredArr, deferredArr.length);
            this.zze = zzf;
            this.zza = 1;
            awaitAll = AwaitKt.awaitAll(deferredArr2, this);
            if (awaitAll == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        List list = (List) awaitAll;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!Result.m7911isFailureimpl(((Result) it2.next()).getValue())) {
                    zzf.zza();
                    m7905constructorimpl = Result.m7905constructorimpl(Unit.INSTANCE);
                    break;
                }
            }
        }
        zzbj zzbjVar = new zzbj(zzbh.zzb, zzbg.zzY, null);
        zzf.zzb(zzbjVar);
        Result.Companion companion = Result.INSTANCE;
        m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(zzbjVar));
        return Result.m7904boximpl(m7905constructorimpl);
    }
}
