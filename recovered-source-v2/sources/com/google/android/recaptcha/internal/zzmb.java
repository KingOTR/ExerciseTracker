package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
final class zzmb implements zzmk {
    private final zzlx zza;
    private final zznb zzb;
    private final boolean zzc;
    private final zzke zzd;

    private zzmb(zznb zznbVar, zzke zzkeVar, zzlx zzlxVar) {
        this.zzb = zznbVar;
        this.zzc = zzkeVar.zzj(zzlxVar);
        this.zzd = zzkeVar;
        this.zza = zzlxVar;
    }

    static zzmb zzc(zznb zznbVar, zzke zzkeVar, zzlx zzlxVar) {
        return new zzmb(zznbVar, zzkeVar, zzlxVar);
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final int zza(Object obj) {
        zznb zznbVar = this.zzb;
        int zzb = zznbVar.zzb(zznbVar.zzd(obj));
        return this.zzc ? zzb + this.zzd.zzb(obj).zzb() : zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final int zzb(Object obj) {
        int hashCode = this.zzb.zzd(obj).hashCode();
        return this.zzc ? (hashCode * 53) + this.zzd.zzb(obj).zza.hashCode() : hashCode;
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final Object zze() {
        zzlx zzlxVar = this.zza;
        return zzlxVar instanceof zzks ? ((zzks) zzlxVar).zzt() : zzlxVar.zzaa().zzk();
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final void zzf(Object obj) {
        this.zzb.zzm(obj);
        this.zzd.zzf(obj);
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final void zzg(Object obj, Object obj2) {
        zzmm.zzr(this.zzb, obj, obj2);
        if (this.zzc) {
            zzmm.zzq(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final void zzh(Object obj, zzmj zzmjVar, zzkd zzkdVar) throws IOException {
        boolean zzO;
        zznb zznbVar = this.zzb;
        Object zzc = zznbVar.zzc(obj);
        zzke zzkeVar = this.zzd;
        zzki zzc2 = zzkeVar.zzc(obj);
        while (zzmjVar.zzc() != Integer.MAX_VALUE) {
            try {
                int zzd = zzmjVar.zzd();
                if (zzd != 11) {
                    if ((zzd & 7) == 2) {
                        Object zzd2 = zzkeVar.zzd(zzkdVar, this.zza, zzd >>> 3);
                        if (zzd2 != null) {
                            zzkeVar.zzg(zzmjVar, zzd2, zzkdVar, zzc2);
                        } else {
                            zzO = zznbVar.zzr(zzc, zzmjVar);
                        }
                    } else {
                        zzO = zzmjVar.zzO();
                    }
                    if (!zzO) {
                        break;
                    }
                } else {
                    Object obj2 = null;
                    int i = 0;
                    zziv zzivVar = null;
                    while (zzmjVar.zzc() != Integer.MAX_VALUE) {
                        int zzd3 = zzmjVar.zzd();
                        if (zzd3 == 16) {
                            i = zzmjVar.zzj();
                            obj2 = zzkeVar.zzd(zzkdVar, this.zza, i);
                        } else if (zzd3 == 26) {
                            if (obj2 != null) {
                                zzkeVar.zzg(zzmjVar, obj2, zzkdVar, zzc2);
                            } else {
                                zzivVar = zzmjVar.zzp();
                            }
                        } else if (!zzmjVar.zzO()) {
                            break;
                        }
                    }
                    if (zzmjVar.zzd() != 12) {
                        throw zzlc.zzb();
                    }
                    if (zzivVar != null) {
                        if (obj2 != null) {
                            zzkeVar.zzh(zzivVar, obj2, zzkdVar, zzc2);
                        } else {
                            zznbVar.zzk(zzc, i, zzivVar);
                        }
                    }
                }
            } finally {
                zznbVar.zzn(obj, zzc);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088 A[EDGE_INSN: B:24:0x0088->B:25:0x0088 BREAK  A[LOOP:1: B:10:0x004a->B:18:0x004a], SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzmk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzik zzikVar) throws IOException {
        zzks zzksVar = (zzks) obj;
        zznc zzncVar = zzksVar.zzc;
        if (zzncVar == zznc.zzc()) {
            zzncVar = zznc.zzf();
            zzksVar.zzc = zzncVar;
        }
        ((zzko) obj).zzi();
        Object obj2 = null;
        while (i < i2) {
            int zzi = zzil.zzi(bArr, i, zzikVar);
            int i3 = zzikVar.zza;
            if (i3 == 11) {
                int i4 = 0;
                zziv zzivVar = null;
                while (zzi < i2) {
                    zzi = zzil.zzi(bArr, zzi, zzikVar);
                    int i5 = zzikVar.zza;
                    int i6 = i5 >>> 3;
                    int i7 = i5 & 7;
                    if (i6 != 2) {
                        if (i6 == 3) {
                            if (obj2 != null) {
                                int i8 = zzmg.zza;
                                throw null;
                            }
                            if (i7 == 2) {
                                zzi = zzil.zza(bArr, zzi, zzikVar);
                                zzivVar = (zziv) zzikVar.zzc;
                            }
                        }
                        if (i5 != 12) {
                            break;
                        } else {
                            zzi = zzil.zzo(i5, bArr, zzi, i2, zzikVar);
                        }
                    } else if (i7 == 0) {
                        zzi = zzil.zzi(bArr, zzi, zzikVar);
                        i4 = zzikVar.zza;
                        obj2 = this.zzd.zzd(zzikVar.zzd, this.zza, i4);
                    } else if (i5 != 12) {
                    }
                }
                if (zzivVar != null) {
                    zzncVar.zzj((i4 << 3) | 2, zzivVar);
                }
                i = zzi;
            } else if ((i3 & 7) == 2) {
                obj2 = this.zzd.zzd(zzikVar.zzd, this.zza, i3 >>> 3);
                if (obj2 != null) {
                    int i9 = zzmg.zza;
                    throw null;
                }
                i = zzil.zzh(i3, bArr, zzi, i2, zzncVar, zzikVar);
            } else {
                i = zzil.zzo(i3, bArr, zzi, i2, zzikVar);
            }
        }
        if (i != i2) {
            throw zzlc.zzg();
        }
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final void zzj(Object obj, zzno zznoVar) throws IOException {
        Iterator zzf = this.zzd.zzb(obj).zzf();
        while (zzf.hasNext()) {
            Map.Entry entry = (Map.Entry) zzf.next();
            zzkh zzkhVar = (zzkh) entry.getKey();
            if (zzkhVar.zze() != zznn.MESSAGE) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            zzkhVar.zzg();
            zzkhVar.zzf();
            if (entry instanceof zzlf) {
                zznoVar.zzw(zzkhVar.zza(), ((zzlf) entry).zza().zzb());
            } else {
                zznoVar.zzw(zzkhVar.zza(), entry.getValue());
            }
        }
        zznb zznbVar = this.zzb;
        zznbVar.zzp(zznbVar.zzd(obj), zznoVar);
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final boolean zzk(Object obj, Object obj2) {
        zznb zznbVar = this.zzb;
        if (!zznbVar.zzd(obj).equals(zznbVar.zzd(obj2))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zzb(obj).equals(this.zzd.zzb(obj2));
        }
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final boolean zzl(Object obj) {
        return this.zzd.zzb(obj).zzk();
    }
}
