package com.google.android.recaptcha.internal;

import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzf {
    public static final zzbj zza(Exception exc, zzbj zzbjVar) {
        return exc instanceof TimeoutCancellationException ? new zzbj(zzbh.zzb, zzbg.zzb, null) : exc instanceof zzbj ? (zzbj) exc : zzbjVar;
    }
}
