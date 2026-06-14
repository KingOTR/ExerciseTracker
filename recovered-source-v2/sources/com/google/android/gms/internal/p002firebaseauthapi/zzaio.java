package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.NoSuchElementException;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaio extends zzaiq {
    private int zza = 0;
    private final int zzb;
    private final /* synthetic */ zzaip zzc;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiv
    public final byte zza() {
        int i = this.zza;
        if (i >= this.zzb) {
            throw new NoSuchElementException();
        }
        this.zza = i + 1;
        return this.zzc.zzb(i);
    }

    zzaio(zzaip zzaipVar) {
        this.zzc = zzaipVar;
        this.zzb = zzaipVar.zzb();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza < this.zzb;
    }
}
