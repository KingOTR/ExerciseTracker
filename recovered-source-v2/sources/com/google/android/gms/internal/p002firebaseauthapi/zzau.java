package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzau<E> extends zzak<E> implements Set<E> {

    @CheckForNull
    private transient zzal<E> zza;

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzaz.zza(this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    public zzal<E> zzc() {
        zzal<E> zzalVar = this.zza;
        if (zzalVar != null) {
            return zzalVar;
        }
        zzal<E> zzg = zzg();
        this.zza = zzg;
        return zzg;
    }

    zzal<E> zzg() {
        return zzal.zza(toArray());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    zzau() {
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        return zzaz.zza(this, obj);
    }
}
