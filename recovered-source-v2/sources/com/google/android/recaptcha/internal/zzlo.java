package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
final class zzlo implements zzlv {
    private final zzlv[] zza;

    zzlo(zzlv... zzlvVarArr) {
        this.zza = zzlvVarArr;
    }

    @Override // com.google.android.recaptcha.internal.zzlv
    public final zzlu zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            zzlv zzlvVar = this.zza[i];
            if (zzlvVar.zzc(cls)) {
                return zzlvVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(cls.getName())));
    }

    @Override // com.google.android.recaptcha.internal.zzlv
    public final boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zza[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
