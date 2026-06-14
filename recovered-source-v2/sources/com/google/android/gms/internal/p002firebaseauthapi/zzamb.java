package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzamb extends zzamc {
    private final /* synthetic */ zzalw zza;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzamc, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new zzaly(this.zza);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzamb(zzalw zzalwVar) {
        super(zzalwVar);
        this.zza = zzalwVar;
    }
}
