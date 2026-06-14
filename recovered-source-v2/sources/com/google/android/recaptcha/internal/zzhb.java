package com.google.android.recaptcha.internal;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzhb extends zzhf implements Serializable {
    final int zza;
    private final Queue zzb;

    public static zzhb zza(int i) {
        return new zzhb(i);
    }

    @Override // com.google.android.recaptcha.internal.zzhd, java.util.Collection
    public final boolean addAll(Collection collection) {
        int size = collection.size();
        if (size < this.zza) {
            return zzhi.zza(this, collection.iterator());
        }
        clear();
        int i = this.zza;
        collection.getClass();
        int i2 = size - i;
        zzgx.zzb(i2 >= 0, "number to skip cannot be negative");
        return zzhi.zza(this, new zzhh(collection, i2).iterator());
    }

    @Override // com.google.android.recaptcha.internal.zzhf, java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzhd, com.google.android.recaptcha.internal.zzhe
    protected final /* synthetic */ Object zzb() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzhf, com.google.android.recaptcha.internal.zzhd
    protected final /* synthetic */ Collection zzc() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzhf
    protected final Queue zzd() {
        return this.zzb;
    }

    private zzhb(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(zzha.zza("maxSize (%s) must >= 0", Integer.valueOf(i)));
        }
        this.zzb = new ArrayDeque(i);
        this.zza = i;
    }

    @Override // com.google.android.recaptcha.internal.zzhd, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        obj.getClass();
        if (this.zza == 0) {
            return true;
        }
        if (size() == this.zza) {
            this.zzb.remove();
        }
        this.zzb.add(obj);
        return true;
    }
}
