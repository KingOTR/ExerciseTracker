package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
final class zzkl implements zzlv {
    private static final zzkl zza = new zzkl();

    private zzkl() {
    }

    public static zzkl zza() {
        return zza;
    }

    @Override // com.google.android.recaptcha.internal.zzlv
    public final zzlu zzb(Class cls) {
        if (!zzks.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(cls.getName())));
        }
        try {
            return (zzlu) zzks.zzs(cls.asSubclass(zzks.class)).zzh(3, null, null);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(String.valueOf(cls.getName())), e);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzlv
    public final boolean zzc(Class cls) {
        return zzks.class.isAssignableFrom(cls);
    }
}
