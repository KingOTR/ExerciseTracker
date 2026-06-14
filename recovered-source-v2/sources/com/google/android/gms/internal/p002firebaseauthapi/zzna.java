package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public class zzna<P> implements zzbs<P> {
    final String zza;
    final zzvq.zzb zzb;
    private final Class<P> zzc;

    public static <P> zzbs<P> zza(String str, Class<P> cls, zzvq.zzb zzbVar, zzalp<? extends zzalc> zzalpVar) {
        return new zzna(str, cls, zzbVar, zzalpVar);
    }

    public static <P> zzcj<P> zza(String str, Class<P> cls, zzalp<? extends zzalc> zzalpVar) {
        return new zznd(str, cls, zzalpVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbs
    public final zzvq zza(zzaip zzaipVar) throws GeneralSecurityException {
        zzpc zzpcVar = (zzpc) zzof.zza().zza(zznv.zza().zza(zzof.zza().zza((zzof) zzpf.zza((zzvu) ((zzajy) zzvu.zza().zza(this.zza).zza(zzaipVar).zza(zzws.RAW).zze()))), (Integer) null), zzpc.class, zzbq.zza());
        return (zzvq) ((zzajy) zzvq.zza().zza(zzpcVar.zzf()).zza(zzpcVar.zzd()).zza(zzpcVar.zza()).zze());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbs
    public final Class<P> zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbs
    public final P zzb(zzaip zzaipVar) throws GeneralSecurityException {
        return (P) zzoc.zza().zza((zzoc) zzof.zza().zza((zzof) zzpc.zza(this.zza, zzaipVar, this.zzb, zzws.RAW, null), zzbq.zza()), (Class) this.zzc);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbs
    public final String zzb() {
        return this.zza;
    }

    zzna(String str, Class<P> cls, zzvq.zzb zzbVar, zzalp<? extends zzalc> zzalpVar) {
        this.zza = str;
        this.zzc = cls;
        this.zzb = zzbVar;
    }
}
