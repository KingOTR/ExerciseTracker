package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzef extends zzee {
    private final Function2 zza;
    private final String zzb;

    public zzef(Function2 function2, String str, Object obj) {
        super(obj);
        this.zza = function2;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzee
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        Collection emptyList;
        if (!Intrinsics.areEqual(method.getName(), this.zzb)) {
            return false;
        }
        zzrj zzf = zzrm.zzf();
        if (objArr != null) {
            emptyList = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                zzrk zzf2 = zzrl.zzf();
                zzf2.zzv(obj2.toString());
                emptyList.add((zzrl) zzf2.zzj());
            }
        } else {
            emptyList = CollectionsKt.emptyList();
        }
        zzf.zzd(emptyList);
        zzrm zzrmVar = (zzrm) zzf.zzj();
        Function2 function2 = this.zza;
        byte[] zzd = zzrmVar.zzd();
        function2.invoke(objArr, zzhz.zzh().zzi(zzd, 0, zzd.length));
        return true;
    }
}
