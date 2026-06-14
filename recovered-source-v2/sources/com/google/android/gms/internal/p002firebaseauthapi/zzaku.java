package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaku<K, V> {
    static <K, V> int zza(zzakx<K, V> zzakxVar, K k, V v) {
        return zzajr.zza(zzakxVar.zza, 1, k) + zzajr.zza(zzakxVar.zzc, 2, v);
    }

    static <K, V> void zza(zzajg zzajgVar, zzakx<K, V> zzakxVar, K k, V v) throws IOException {
        zzajr.zza(zzajgVar, zzakxVar.zza, 1, k);
        zzajr.zza(zzajgVar, zzakxVar.zzc, 2, v);
    }
}
