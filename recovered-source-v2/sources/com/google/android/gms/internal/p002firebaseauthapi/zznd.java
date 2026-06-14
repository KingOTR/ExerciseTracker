package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zznd<P> extends zzna<P> implements zzcj<P> {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcj
    public final zzvq zzc(zzaip zzaipVar) throws GeneralSecurityException {
        Object zza = zzof.zza().zza((zzof) zzpc.zza(this.zza, zzaipVar, this.zzb, zzws.RAW, null), zzbq.zza());
        if (!(zza instanceof zzck)) {
            throw new GeneralSecurityException("Key not private key");
        }
        zzpc zzpcVar = (zzpc) zzof.zza().zza(((zzck) zza).zzb(), zzpc.class, zzbq.zza());
        return (zzvq) ((zzajy) zzvq.zza().zza(zzpcVar.zzf()).zza(zzpcVar.zzd()).zza(zzpcVar.zza()).zze());
    }

    protected zznd(String str, Class<P> cls, zzalp<? extends zzalc> zzalpVar) {
        super(str, cls, zzvq.zzb.ASYMMETRIC_PRIVATE, zzalpVar);
    }
}
