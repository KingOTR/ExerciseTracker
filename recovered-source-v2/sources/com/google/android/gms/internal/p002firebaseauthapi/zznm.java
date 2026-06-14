package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zznm {

    @Nullable
    private ArrayList<zznp> zza = new ArrayList<>();
    private zzng zzb = zzng.zza;

    @Nullable
    private Integer zzc = null;

    public final zznm zza(zzbr zzbrVar, int i, String str, String str2) {
        ArrayList<zznp> arrayList = this.zza;
        if (arrayList == null) {
            throw new IllegalStateException("addEntry cannot be called after build()");
        }
        arrayList.add(new zznp(zzbrVar, i, str, str2));
        return this;
    }

    public final zznm zza(zzng zzngVar) {
        if (this.zza == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build()");
        }
        this.zzb = zzngVar;
        return this;
    }

    public final zznm zza(int i) {
        if (this.zza == null) {
            throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
        }
        this.zzc = Integer.valueOf(i);
        return this;
    }

    public final zznn zza() throws GeneralSecurityException {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        Integer num = this.zzc;
        if (num != null) {
            int intValue = num.intValue();
            ArrayList<zznp> arrayList = this.zza;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                zznp zznpVar = arrayList.get(i);
                i++;
                if (zznpVar.zza() == intValue) {
                }
            }
            throw new GeneralSecurityException("primary key ID is not present in entries");
        }
        zznn zznnVar = new zznn(this.zzb, Collections.unmodifiableList(this.zza), this.zzc);
        this.zza = null;
        return zznnVar;
    }
}
