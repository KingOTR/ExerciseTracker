package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zznc extends zzbp {
    private final zzpc zza;

    public final zzpc zza(@Nullable zzcn zzcnVar) throws GeneralSecurityException {
        zza(this.zza, zzcnVar);
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbp
    @Nullable
    public final Integer zza() {
        return this.zza.zze();
    }

    public zznc(zzpc zzpcVar, @Nullable zzcn zzcnVar) throws GeneralSecurityException {
        zza(zzpcVar, zzcnVar);
        this.zza = zzpcVar;
    }

    private static void zza(zzpc zzpcVar, @Nullable zzcn zzcnVar) throws GeneralSecurityException {
        int i = zznf.zza[zzpcVar.zza().ordinal()];
        if (i == 1 || i == 2) {
            zzcn.zza(zzcnVar);
        }
    }
}
