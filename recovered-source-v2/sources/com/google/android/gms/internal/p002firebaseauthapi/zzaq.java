package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: Add missing generic type declarations: [E] */
/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaq<E> extends zzal<E> {
    private final transient int zza;
    private final transient int zzb;
    private final /* synthetic */ zzal zzc;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    final int zza() {
        return this.zzc.zzb() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    final int zzb() {
        return this.zzc.zzb() + this.zza;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal
    /* renamed from: zza */
    public final zzal<E> subList(int i, int i2) {
        zzy.zza(i, i2, this.zzb);
        zzal zzalVar = this.zzc;
        int i3 = this.zza;
        return (zzal) zzalVar.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final E get(int i) {
        zzy.zza(i, this.zzb);
        return this.zzc.get(i + this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzal, java.util.List
    public final /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    zzaq(zzal zzalVar, int i, int i2) {
        this.zzc = zzalVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    @CheckForNull
    final Object[] zzf() {
        return this.zzc.zzf();
    }
}
