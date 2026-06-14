package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzali<T> implements zzalv<T> {
    private final zzalc zza;
    private final zzamo<?, ?> zzb;
    private final boolean zzc;
    private final zzajm<?> zzd;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final int zza(T t) {
        zzamo<?, ?> zzamoVar = this.zzb;
        int zzb = zzamoVar.zzb(zzamoVar.zzd(t));
        return this.zzc ? zzb + this.zzd.zza(t).zza() : zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final int zzb(T t) {
        int hashCode = this.zzb.zzd(t).hashCode();
        return this.zzc ? (hashCode * 53) + this.zzd.zza(t).hashCode() : hashCode;
    }

    static <T> zzali<T> zza(zzamo<?, ?> zzamoVar, zzajm<?> zzajmVar, zzalc zzalcVar) {
        return new zzali<>(zzamoVar, zzajmVar, zzalcVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final T zza() {
        zzalc zzalcVar = this.zza;
        if (zzalcVar instanceof zzajy) {
            return (T) ((zzajy) zzalcVar).zzo();
        }
        return (T) zzalcVar.zzq().zzf();
    }

    private zzali(zzamo<?, ?> zzamoVar, zzajm<?> zzajmVar, zzalc zzalcVar) {
        this.zzb = zzamoVar;
        this.zzc = zzajmVar.zza(zzalcVar);
        this.zzd = zzajmVar;
        this.zza = zzalcVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final void zzd(T t) {
        this.zzb.zzf(t);
        this.zzd.zzc(t);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final void zza(T t, T t2) {
        zzalx.zza(this.zzb, t, t2);
        if (this.zzc) {
            zzalx.zza(this.zzd, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final void zza(T t, zzals zzalsVar, zzajk zzajkVar) throws IOException {
        boolean z;
        zzamo<?, ?> zzamoVar = this.zzb;
        zzajm<?> zzajmVar = this.zzd;
        Object zzc = zzamoVar.zzc(t);
        zzajr<?> zzb = zzajmVar.zzb(t);
        do {
            try {
                if (zzalsVar.zzc() == Integer.MAX_VALUE) {
                    return;
                }
                int zzd = zzalsVar.zzd();
                int i = 0;
                if (zzd == 11) {
                    Object obj = null;
                    zzaip zzaipVar = null;
                    while (zzalsVar.zzc() != Integer.MAX_VALUE) {
                        int zzd2 = zzalsVar.zzd();
                        if (zzd2 == 16) {
                            i = zzalsVar.zzj();
                            obj = zzajmVar.zza(zzajkVar, this.zza, i);
                        } else if (zzd2 == 26) {
                            if (obj != null) {
                                zzajmVar.zza(zzalsVar, obj, zzajkVar, zzb);
                            } else {
                                zzaipVar = zzalsVar.zzp();
                            }
                        } else if (!zzalsVar.zzt()) {
                            break;
                        }
                    }
                    if (zzalsVar.zzd() != 12) {
                        throw zzakf.zzb();
                    }
                    if (zzaipVar != null) {
                        if (obj != null) {
                            zzajmVar.zza(zzaipVar, obj, zzajkVar, zzb);
                        } else {
                            zzamoVar.zza((zzamo<?, ?>) zzc, i, zzaipVar);
                        }
                    }
                } else if ((zzd & 7) == 2) {
                    Object zza = zzajmVar.zza(zzajkVar, this.zza, zzd >>> 3);
                    if (zza != null) {
                        zzajmVar.zza(zzalsVar, zza, zzajkVar, zzb);
                    } else {
                        z = zzamoVar.zza((zzamo<?, ?>) zzc, zzalsVar, 0);
                    }
                } else {
                    z = zzalsVar.zzt();
                }
                z = true;
            } finally {
                zzamoVar.zzb((Object) t, (T) zzc);
            }
        } while (z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099 A[EDGE_INSN: B:24:0x0099->B:25:0x0099 BREAK  A[LOOP:1: B:10:0x0053->B:18:0x0053], SYNTHETIC] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t, byte[] bArr, int i, int i2, zzaik zzaikVar) throws IOException {
        zzajy zzajyVar = (zzajy) t;
        zzamn zzamnVar = zzajyVar.zzb;
        if (zzamnVar == zzamn.zzc()) {
            zzamnVar = zzamn.zzd();
            zzajyVar.zzb = zzamnVar;
        }
        ((zzajy.zzb) t).zza();
        zzajy.zzd zzdVar = null;
        while (i < i2) {
            int zzc = zzail.zzc(bArr, i, zzaikVar);
            int i3 = zzaikVar.zza;
            if (i3 == 11) {
                int i4 = 0;
                zzaip zzaipVar = null;
                while (zzc < i2) {
                    zzc = zzail.zzc(bArr, zzc, zzaikVar);
                    int i5 = zzaikVar.zza;
                    int i6 = i5 >>> 3;
                    int i7 = i5 & 7;
                    if (i6 != 2) {
                        if (i6 == 3) {
                            if (zzdVar != null) {
                                zzalr.zza();
                                throw new NoSuchMethodError();
                            }
                            if (i7 == 2) {
                                zzc = zzail.zza(bArr, zzc, zzaikVar);
                                zzaipVar = (zzaip) zzaikVar.zzc;
                            }
                        }
                        if (i5 != 12) {
                            break;
                        } else {
                            zzc = zzail.zza(i5, bArr, zzc, i2, zzaikVar);
                        }
                    } else if (i7 == 0) {
                        zzc = zzail.zzc(bArr, zzc, zzaikVar);
                        i4 = zzaikVar.zza;
                        zzdVar = (zzajy.zzd) this.zzd.zza(zzaikVar.zzd, this.zza, i4);
                    } else if (i5 != 12) {
                    }
                }
                if (zzaipVar != null) {
                    zzamnVar.zza((i4 << 3) | 2, zzaipVar);
                }
                i = zzc;
            } else if ((i3 & 7) == 2) {
                zzdVar = (zzajy.zzd) this.zzd.zza(zzaikVar.zzd, this.zza, i3 >>> 3);
                if (zzdVar != null) {
                    zzalr.zza();
                    throw new NoSuchMethodError();
                }
                i = zzail.zza(i3, bArr, zzc, i2, zzamnVar, zzaikVar);
            } else {
                i = zzail.zza(i3, bArr, zzc, i2, zzaikVar);
            }
        }
        if (i != i2) {
            throw zzakf.zzg();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final void zza(T t, zzanf zzanfVar) throws IOException {
        Iterator<Map.Entry<?, Object>> zzd = this.zzd.zza(t).zzd();
        while (zzd.hasNext()) {
            Map.Entry<?, Object> next = zzd.next();
            zzajt zzajtVar = (zzajt) next.getKey();
            if (zzajtVar.zzc() != zzand.MESSAGE || zzajtVar.zze() || zzajtVar.zzd()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (next instanceof zzakj) {
                zzanfVar.zza(zzajtVar.zza(), (Object) ((zzakj) next).zza().zzb());
            } else {
                zzanfVar.zza(zzajtVar.zza(), next.getValue());
            }
        }
        zzamo<?, ?> zzamoVar = this.zzb;
        zzamoVar.zza((zzamo<?, ?>) zzamoVar.zzd(t), zzanfVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final boolean zzb(T t, T t2) {
        if (!this.zzb.zzd(t).equals(this.zzb.zzd(t2))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zza(t).equals(this.zzd.zza(t2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final boolean zze(T t) {
        return this.zzd.zza(t).zzg();
    }
}
