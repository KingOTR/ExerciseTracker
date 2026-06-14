package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public class zzaj<E> extends zzam<E> {
    Object[] zza;
    int zzb;
    boolean zzc;

    public zzaj<E> zza(E e) {
        zzy.zza(e);
        Object[] objArr = this.zza;
        int zza = zza(objArr.length, this.zzb + 1);
        if (zza > objArr.length || this.zzc) {
            this.zza = Arrays.copyOf(this.zza, zza);
            this.zzc = false;
        }
        Object[] objArr2 = this.zza;
        int i = this.zzb;
        this.zzb = i + 1;
        objArr2[i] = e;
        return this;
    }

    zzaj(int i) {
        zzai.zza(4, "initialCapacity");
        this.zza = new Object[4];
        this.zzb = 0;
    }
}
