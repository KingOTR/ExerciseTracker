package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzat<E> extends zzal<E> {
    static final zzal<Object> zza = new zzat(new Object[0], 0);
    private final transient Object[] zzb;
    private final transient int zzc;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal, com.google.android.gms.internal.p002firebaseauthapi.zzak
    final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzb, 0, objArr, i, this.zzc);
        return i + this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    final int zzb() {
        return 0;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    final boolean zze() {
        return false;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    final int zza() {
        return this.zzc;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // java.util.List
    public final E get(int i) {
        zzy.zza(i, this.zzc);
        return (E) Objects.requireNonNull(this.zzb[i]);
    }

    zzat(Object[] objArr, int i) {
        this.zzb = objArr;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    final Object[] zzf() {
        return this.zzb;
    }
}
