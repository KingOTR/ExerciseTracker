package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
final class zzlk {
    zzlk() {
    }

    public static final List zza(Object obj, long j) {
        zzkz zzkzVar = (zzkz) zzni.zzf(obj, j);
        if (zzkzVar.zzc()) {
            return zzkzVar;
        }
        int size = zzkzVar.size();
        zzkz zzd = zzkzVar.zzd(size == 0 ? 10 : size + size);
        zzni.zzs(obj, j, zzd);
        return zzd;
    }
}
