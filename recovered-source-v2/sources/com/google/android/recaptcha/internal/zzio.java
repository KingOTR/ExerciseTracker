package com.google.android.recaptcha.internal;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
final class zzio extends zzip {
    final /* synthetic */ zziv zza;
    private int zzb = 0;
    private final int zzc;

    zzio(zziv zzivVar) {
        this.zza = zzivVar;
        this.zzc = zzivVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zzir
    public final byte zza() {
        int i = this.zzb;
        if (i >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i + 1;
        return this.zza.zzb(i);
    }
}
