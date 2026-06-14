package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzkg implements zzpd<zzbo, zzbo> {
    private static final zzkg zza = new zzkg();
    private static final zzor<zznc, zzbo> zzb = zzor.zza(new zzot() { // from class: com.google.android.gms.internal.firebase-auth-api.zzkj
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzot
        public final Object zza(zzbp zzbpVar) {
            return zzlt.zza((zznc) zzbpVar);
        }
    }, zznc.class, zzbo.class);

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpd
    public final Class<zzbo> zza() {
        return zzbo.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpd
    public final Class<zzbo> zzb() {
        return zzbo.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpd
    public final /* synthetic */ zzbo zza(zzoz<zzbo> zzozVar) throws GeneralSecurityException {
        return new zzki(zzozVar);
    }

    zzkg() {
    }

    public static void zzc() throws GeneralSecurityException {
        zzoc.zza().zza(zza);
        zzoc.zza().zza(zzb);
    }
}
