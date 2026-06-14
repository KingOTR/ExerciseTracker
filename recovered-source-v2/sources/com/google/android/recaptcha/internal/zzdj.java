package com.google.android.recaptcha.internal;

import android.content.ContentValues;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
final class zzdj extends SuspendLambda implements Function2 {
    final /* synthetic */ zzdk zza;
    final /* synthetic */ zzre zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdj(zzdk zzdkVar, zzre zzreVar, Continuation continuation) {
        super(2, continuation);
        this.zza = zzdkVar;
        this.zzb = zzreVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzdj(this.zza, this.zzb, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdj) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zzda zzdaVar;
        zzda zzdaVar2;
        zzda zzdaVar3;
        zzda zzdaVar4;
        zzda zzdaVar5;
        zzda zzdaVar6;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        zzre zzreVar = this.zzb;
        zzdk zzdkVar = this.zza;
        synchronized (zzdg.class) {
            zzdaVar = zzdkVar.zze;
            if (zzdaVar != null) {
                byte[] zzd = zzreVar.zzd();
                zzdb zzdbVar = new zzdb(zzhz.zzg().zzi(zzd, 0, zzd.length), System.currentTimeMillis(), 0);
                zzdaVar2 = zzdkVar.zze;
                ContentValues contentValues = new ContentValues();
                contentValues.put("ss", zzdbVar.zzc());
                contentValues.put("ts", Long.valueOf(zzdbVar.zzb()));
                zzdaVar2.getWritableDatabase().insert("ce", null, contentValues);
                zzdaVar3 = zzdkVar.zze;
                int zzb = zzdaVar3.zzb() - 500;
                if (zzb > 0) {
                    zzdaVar5 = zzdkVar.zze;
                    List take = CollectionsKt.take(zzdaVar5.zzd(), zzb);
                    zzdaVar6 = zzdkVar.zze;
                    zzdaVar6.zza(take);
                }
                zzdaVar4 = zzdkVar.zze;
                if (zzdaVar4.zzb() >= 20) {
                    zzdkVar.zzg();
                }
            }
            Unit unit = Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
