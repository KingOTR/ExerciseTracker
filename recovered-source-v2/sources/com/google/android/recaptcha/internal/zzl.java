package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzl {
    public zzdc zza;
    private final List zzb;

    /* JADX WARN: Multi-variable type inference failed */
    public zzl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ zzl(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        List emptyList = CollectionsKt.emptyList();
        this.zzb = new ArrayList();
        zze[] zzeVarArr = (zze[]) emptyList.toArray(new zze[0]);
        zzg((zze[]) Arrays.copyOf(zzeVarArr, zzeVarArr.length));
    }

    private final void zzg(zze... zzeVarArr) {
        CollectionsKt.addAll(this.zzb, zzeVarArr);
    }

    public final zzdc zza() {
        zzdc zzdcVar = this.zza;
        if (zzdcVar != null) {
            return zzdcVar;
        }
        return null;
    }

    public final Object zzb(String str, long j, Continuation continuation) {
        return CoroutineScopeKt.coroutineScope(new zzh(this, str, j, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(long j, zzpq zzpqVar, Continuation continuation) {
        zzi zziVar;
        int i;
        if (continuation instanceof zzi) {
            zziVar = (zzi) continuation;
            int i2 = zziVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zziVar.zzc = i2 - Integer.MIN_VALUE;
                Object obj = zziVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = zziVar.zzc;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    zzk zzkVar = new zzk(this, j, zzpqVar, null);
                    zziVar.zzc = 1;
                    obj = CoroutineScopeKt.coroutineScope(zzkVar, zziVar);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        zziVar = new zzi(this, continuation);
        Object obj2 = zziVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zziVar.zzc;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    public final List zzd() {
        return this.zzb;
    }

    public final void zze(zze... zzeVarArr) {
        zzg((zze[]) Arrays.copyOf(zzeVarArr, 2));
    }

    public final void zzf(zzqf zzqfVar) {
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            ((zze) it.next()).zzk(zzqfVar);
        }
    }
}
