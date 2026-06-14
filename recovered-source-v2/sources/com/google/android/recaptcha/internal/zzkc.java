package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
final class zzkc {
    private final Object zza;
    private final int zzb;

    zzkc(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzkc)) {
            return false;
        }
        zzkc zzkcVar = (zzkc) obj;
        return this.zza == zzkcVar.zza && this.zzb == zzkcVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
