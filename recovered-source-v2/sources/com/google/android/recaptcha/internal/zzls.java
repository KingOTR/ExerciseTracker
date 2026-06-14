package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
final class zzls {
    zzls() {
    }

    public static final boolean zza(Object obj) {
        return !((zzlr) obj).zze();
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzlr zzlrVar = (zzlr) obj;
        zzlr zzlrVar2 = (zzlr) obj2;
        if (!zzlrVar2.isEmpty()) {
            if (!zzlrVar.zze()) {
                zzlrVar = zzlrVar.zzb();
            }
            zzlrVar.zzd(zzlrVar2);
        }
        return zzlrVar;
    }
}
