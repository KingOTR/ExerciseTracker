package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcv implements zzpd<zzbg, zzbg> {
    private static final zzcv zza = new zzcv();
    private static final zzor<zznc, zzbg> zzb = zzor.zza(new zzot() { // from class: com.google.android.gms.internal.firebase-auth-api.zzcy
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzot
        public final Object zza(zzbp zzbpVar) {
            return zzhr.zza((zznc) zzbpVar);
        }
    }, zznc.class, zzbg.class);

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpd
    public final Class<zzbg> zza() {
        return zzbg.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpd
    public final Class<zzbg> zzb() {
        return zzbg.class;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpd
    public final /* synthetic */ zzbg zza(zzoz<zzbg> zzozVar) throws GeneralSecurityException {
        return new zzcx(zzozVar);
    }

    zzcv() {
    }

    public static void zzc() throws GeneralSecurityException {
        zzoc.zza().zza(zza);
        zzoc.zza().zza(zzb);
    }
}
