package com.google.android.recaptcha.internal;

import java.util.Map;
import kotlin.jvm.functions.Function0;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzba {
    public static final zzbb zza() {
        zzbb zzbbVar;
        Function0 function0;
        zzbbVar = zzbb.zzb;
        if (zzbbVar != null) {
            return zzbbVar;
        }
        function0 = zzbb.zzc;
        zzbb zzbbVar2 = new zzbb((Map) function0.invoke(), null);
        zzbb.zzb = zzbbVar2;
        return zzbbVar2;
    }

    public static final void zzb(zzbc... zzbcVarArr) {
        zzbb.zzc = new zzaz(zzbcVarArr);
    }
}
