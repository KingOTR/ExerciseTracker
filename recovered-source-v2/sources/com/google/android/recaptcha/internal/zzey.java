package com.google.android.recaptcha.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
final class zzey extends Lambda implements Function2 {
    final /* synthetic */ zzek zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzey(zzek zzekVar, String str, int i) {
        super(2);
        this.zza = zzekVar;
        this.zzb = str;
        this.zzc = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object[] objArr = (Object[]) obj;
        this.zza.zzi().zzb(this.zzb, (String) obj2);
        int i = this.zzc;
        if (i != -1) {
            this.zza.zzc().zze(i, objArr);
        }
        return Unit.INSTANCE;
    }
}
