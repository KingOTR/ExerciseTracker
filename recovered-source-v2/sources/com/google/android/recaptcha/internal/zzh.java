package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Arrays;
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
final class zzh extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzh(zzl zzlVar, String str, long j, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzlVar;
        this.zzc = str;
        this.zzd = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzh zzhVar = new zzh(this.zzb, this.zzc, this.zzd, continuation);
        zzhVar.zze = obj;
        return zzhVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzh) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object awaitAll;
        zzdf zzdfVar;
        Deferred async$default;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.zza != 0) {
            zzdfVar = (zzdf) this.zze;
            ResultKt.throwOnFailure(obj);
            awaitAll = obj;
        } else {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.zze;
            zzl zzlVar = this.zzb;
            String str = this.zzc;
            zzdc zza = zzlVar.zza();
            zza.zzc(str);
            zzdf zzf = zza.zzf(31);
            ArrayList arrayList = new ArrayList();
            for (zze zzeVar : this.zzb.zzd()) {
                if (zzeVar.zzl()) {
                    async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new zzg(zzeVar, this.zzc, this.zzd, null), 3, null);
                    arrayList.add(async$default);
                }
            }
            Deferred[] deferredArr = (Deferred[]) arrayList.toArray(new Deferred[0]);
            Deferred[] deferredArr2 = (Deferred[]) Arrays.copyOf(deferredArr, deferredArr.length);
            this.zze = zzf;
            this.zza = 1;
            awaitAll = AwaitKt.awaitAll(deferredArr2, this);
            if (awaitAll == coroutine_suspended) {
                return coroutine_suspended;
            }
            zzdfVar = zzf;
        }
        String str2 = this.zzc;
        zzpv zzf2 = zzpw.zzf();
        zzf2.zzd(str2);
        Iterator it = ((List) awaitAll).iterator();
        while (it.hasNext()) {
            Object value = ((Result) it.next()).getValue();
            if (Result.m7912isSuccessimpl(value)) {
                zzf2.zzg((zzpw) value);
            }
        }
        zzpw zzpwVar = (zzpw) zzf2.zzj();
        zzdfVar.zza();
        return zzpwVar;
    }
}
