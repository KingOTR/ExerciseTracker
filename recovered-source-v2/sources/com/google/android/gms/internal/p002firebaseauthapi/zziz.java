package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zziz implements zzpd<zzbl, zzbl> {
    private static final zziz zza = new zziz();
    private static final zzor<zznc, zzbl> zzb = zzor.zza(new zzot() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjc
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzot
        public final Object zza(zzbp zzbpVar) {
            return zzjj.zza((zznc) zzbpVar);
        }
    }, zznc.class, zzbl.class);

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpd
    public final Class<zzbl> zza() {
        return zzbl.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpd
    public final Class<zzbl> zzb() {
        return zzbl.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpd
    public final /* synthetic */ zzbl zza(zzoz<zzbl> zzozVar) throws GeneralSecurityException {
        return new zzjb(zzozVar);
    }

    zziz() {
    }

    public static void zzc() throws GeneralSecurityException {
        zzoc.zza().zza(zza);
        zzoc.zza().zza(zzb);
    }
}
