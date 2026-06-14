package com.google.android.recaptcha.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
final class zzaz extends Lambda implements Function0 {
    final /* synthetic */ zzbc[] zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaz(zzbc[] zzbcVarArr) {
        super(0);
        this.zza = zzbcVarArr;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Map invoke() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(3), 16));
        for (int i = 0; i < 3; i++) {
            zzbc zzbcVar = this.zza[i];
            Pair pair = TuplesKt.to(Integer.valueOf(zzbcVar.zza()), zzbcVar.zzb());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }
}
