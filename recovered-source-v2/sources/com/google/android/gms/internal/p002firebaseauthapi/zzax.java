package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzax<K> extends zzau<K> {
    private final transient zzap<K, ?> zza;
    private final transient zzal<K> zzb;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    final int zza(Object[] objArr, int i) {
        return zzc().zza(objArr, i);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    final boolean zze() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzau, com.google.android.gms.internal.p002firebaseauthapi.zzak
    public final zzal<K> zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    /* renamed from: zzd */
    public final zzbc<K> iterator() {
        return (zzbc) zzc().iterator();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzau, com.google.android.gms.internal.p002firebaseauthapi.zzak, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }

    zzax(zzap<K, ?> zzapVar, zzal<K> zzalVar) {
        this.zza = zzapVar;
        this.zzb = zzalVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return this.zza.get(obj) != null;
    }
}
