package com.google.android.recaptcha.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzci extends Lambda implements Function0 {
    public static final zzci zza = new zzci();

    public zzci() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = zzbb.zza;
        Object zzb = zzba.zza().zzb("com.google.android.recaptcha.internal.zzeb".hashCode());
        if (zzb != null) {
            return (zzeb) zzb;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.google.android.libraries.abuse.recaptcha.vm.allowlist.AllowlistHandler");
    }
}
