package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbu {

    @Nullable
    private final zzch zza;

    public static zzbu zza(zzch zzchVar) throws GeneralSecurityException {
        return new zzbu(zzchVar);
    }

    public final zzch zza() throws GeneralSecurityException {
        zzch zzchVar = this.zza;
        return zzchVar != null ? zzchVar : zzcp.zza(zzb().zzk());
    }

    private final zzvu zzb() {
        try {
            zzch zzchVar = this.zza;
            if (zzchVar instanceof zzne) {
                return ((zzne) zzchVar).zzb().zza();
            }
            return ((zzpf) zzof.zza().zza((zzof) this.zza, zzpf.class)).zza();
        } catch (GeneralSecurityException e) {
            throw new zzpp("Parsing parameters failed in getProto(). You probably want to call some Tink register function for " + String.valueOf(this.zza), e);
        }
    }

    private zzbu(zzch zzchVar) {
        this.zza = zzchVar;
    }
}
