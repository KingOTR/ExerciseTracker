package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
final class zzjc implements zzmj {
    private final zzjb zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzjc(zzjb zzjbVar) {
        byte[] bArr = zzla.zzb;
        this.zza = zzjbVar;
        zzjbVar.zzc = this;
    }

    private final void zzP(Object obj, zzmk zzmkVar, zzkd zzkdVar) throws IOException {
        int i = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzmkVar.zzh(obj, this, zzkdVar);
            if (this.zzb == this.zzc) {
            } else {
                throw zzlc.zzg();
            }
        } finally {
            this.zzc = i;
        }
    }

    private final void zzQ(Object obj, zzmk zzmkVar, zzkd zzkdVar) throws IOException {
        zzjb zzjbVar = this.zza;
        int zzn = zzjbVar.zzn();
        if (zzjbVar.zza >= zzjbVar.zzb) {
            throw new zzlc("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int zze = this.zza.zze(zzn);
        this.zza.zza++;
        zzmkVar.zzh(obj, this, zzkdVar);
        this.zza.zzz(0);
        r3.zza--;
        this.zza.zzA(zze);
    }

    private final void zzR(int i) throws IOException {
        if (this.zza.zzd() != i) {
            throw zzlc.zzi();
        }
    }

    private final void zzS(int i) throws IOException {
        if ((this.zzb & 7) != i) {
            throw zzlc.zza();
        }
    }

    private static final void zzT(int i) throws IOException {
        if ((i & 3) != 0) {
            throw zzlc.zzg();
        }
    }

    private static final void zzU(int i) throws IOException {
        if ((i & 7) != 0) {
            throw zzlc.zzg();
        }
    }

    public static zzjc zzq(zzjb zzjbVar) {
        zzjc zzjcVar = zzjbVar.zzc;
        return zzjcVar != null ? zzjcVar : new zzjc(zzjbVar);
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzA(List list) throws IOException {
        int zzm;
        int i;
        if (list instanceof zzlm) {
            zzlm zzlmVar = (zzlm) list;
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw zzlc.zza();
                }
                int zzn = this.zza.zzn();
                zzU(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    zzlmVar.zzg(this.zza.zzo());
                } while (this.zza.zzd() < zzd);
                return;
            }
            do {
                zzlmVar.zzg(this.zza.zzo());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i = this.zza.zzm();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw zzlc.zza();
                }
                int zzn2 = this.zza.zzn();
                zzU(zzn2);
                int zzd2 = this.zza.zzd() + zzn2;
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                } while (this.zza.zzd() < zzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzo()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i = zzm;
        }
        this.zzd = i;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzB(List list) throws IOException {
        int zzm;
        int i;
        if (list instanceof zzkk) {
            zzkk zzkkVar = (zzkk) list;
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    zzkkVar.zzf(this.zza.zzc());
                } while (this.zza.zzd() < zzd);
                return;
            }
            if (i2 != 5) {
                throw zzlc.zza();
            }
            do {
                zzkkVar.zzf(this.zza.zzc());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i = this.zza.zzm();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 2) {
                int zzn2 = this.zza.zzn();
                zzT(zzn2);
                int zzd2 = this.zza.zzd() + zzn2;
                do {
                    list.add(Float.valueOf(this.zza.zzc()));
                } while (this.zza.zzd() < zzd2);
                return;
            }
            if (i3 != 5) {
                throw zzlc.zza();
            }
            do {
                list.add(Float.valueOf(this.zza.zzc()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i = zzm;
        }
        this.zzd = i;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    @Deprecated
    public final void zzC(List list, zzmk zzmkVar, zzkd zzkdVar) throws IOException {
        int zzm;
        int i = this.zzb;
        if ((i & 7) != 3) {
            throw zzlc.zza();
        }
        do {
            Object zze = zzmkVar.zze();
            zzP(zze, zzmkVar, zzkdVar);
            zzmkVar.zzf(zze);
            list.add(zze);
            if (this.zza.zzC() || this.zzd != 0) {
                return;
            } else {
                zzm = this.zza.zzm();
            }
        } while (zzm == i);
        this.zzd = zzm;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzD(List list) throws IOException {
        int zzm;
        int i;
        if (list instanceof zzkt) {
            zzkt zzktVar = (zzkt) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar = this.zza;
                int zzd = zzjbVar.zzd() + zzjbVar.zzn();
                do {
                    zzktVar.zzh(this.zza.zzh());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                zzktVar.zzh(this.zza.zzh());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i = this.zza.zzm();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar2 = this.zza;
                int zzd2 = zzjbVar2.zzd() + zzjbVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i = zzm;
        }
        this.zzd = i;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzE(List list) throws IOException {
        int zzm;
        int i;
        if (list instanceof zzlm) {
            zzlm zzlmVar = (zzlm) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar = this.zza;
                int zzd = zzjbVar.zzd() + zzjbVar.zzn();
                do {
                    zzlmVar.zzg(this.zza.zzp());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                zzlmVar.zzg(this.zza.zzp());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i = this.zza.zzm();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar2 = this.zza;
                int zzd2 = zzjbVar2.zzd() + zzjbVar2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzp()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i = zzm;
        }
        this.zzd = i;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzF(List list, zzmk zzmkVar, zzkd zzkdVar) throws IOException {
        int zzm;
        int i = this.zzb;
        if ((i & 7) != 2) {
            throw zzlc.zza();
        }
        do {
            Object zze = zzmkVar.zze();
            zzQ(zze, zzmkVar, zzkdVar);
            zzmkVar.zzf(zze);
            list.add(zze);
            if (this.zza.zzC() || this.zzd != 0) {
                return;
            } else {
                zzm = this.zza.zzm();
            }
        } while (zzm == i);
        this.zzd = zzm;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzG(List list) throws IOException {
        int zzm;
        int i;
        if (list instanceof zzkt) {
            zzkt zzktVar = (zzkt) list;
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    zzktVar.zzh(this.zza.zzk());
                } while (this.zza.zzd() < zzd);
                return;
            }
            if (i2 != 5) {
                throw zzlc.zza();
            }
            do {
                zzktVar.zzh(this.zza.zzk());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i = this.zza.zzm();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 2) {
                int zzn2 = this.zza.zzn();
                zzT(zzn2);
                int zzd2 = this.zza.zzd() + zzn2;
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                } while (this.zza.zzd() < zzd2);
                return;
            }
            if (i3 != 5) {
                throw zzlc.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzk()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i = zzm;
        }
        this.zzd = i;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzH(List list) throws IOException {
        int zzm;
        int i;
        if (list instanceof zzlm) {
            zzlm zzlmVar = (zzlm) list;
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw zzlc.zza();
                }
                int zzn = this.zza.zzn();
                zzU(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    zzlmVar.zzg(this.zza.zzt());
                } while (this.zza.zzd() < zzd);
                return;
            }
            do {
                zzlmVar.zzg(this.zza.zzt());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i = this.zza.zzm();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw zzlc.zza();
                }
                int zzn2 = this.zza.zzn();
                zzU(zzn2);
                int zzd2 = this.zza.zzd() + zzn2;
                do {
                    list.add(Long.valueOf(this.zza.zzt()));
                } while (this.zza.zzd() < zzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzt()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i = zzm;
        }
        this.zzd = i;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzI(List list) throws IOException {
        int zzm;
        int i;
        if (list instanceof zzkt) {
            zzkt zzktVar = (zzkt) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar = this.zza;
                int zzd = zzjbVar.zzd() + zzjbVar.zzn();
                do {
                    zzktVar.zzh(this.zza.zzl());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                zzktVar.zzh(this.zza.zzl());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i = this.zza.zzm();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar2 = this.zza;
                int zzd2 = zzjbVar2.zzd() + zzjbVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzl()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzl()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i = zzm;
        }
        this.zzd = i;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzJ(List list) throws IOException {
        int zzm;
        int i;
        if (list instanceof zzlm) {
            zzlm zzlmVar = (zzlm) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar = this.zza;
                int zzd = zzjbVar.zzd() + zzjbVar.zzn();
                do {
                    zzlmVar.zzg(this.zza.zzu());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                zzlmVar.zzg(this.zza.zzu());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i = this.zza.zzm();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar2 = this.zza;
                int zzd2 = zzjbVar2.zzd() + zzjbVar2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzu()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzu()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i = zzm;
        }
        this.zzd = i;
    }

    public final void zzK(List list, boolean z) throws IOException {
        int zzm;
        int i;
        if ((this.zzb & 7) != 2) {
            throw zzlc.zza();
        }
        if ((list instanceof zzlj) && !z) {
            zzlj zzljVar = (zzlj) list;
            do {
                zzp();
                zzljVar.zzb();
                if (this.zza.zzC()) {
                    return;
                } else {
                    i = this.zza.zzm();
                }
            } while (i == this.zzb);
        } else {
            do {
                list.add(z ? zzs() : zzr());
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i = zzm;
        }
        this.zzd = i;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzL(List list) throws IOException {
        int zzm;
        int i;
        if (list instanceof zzkt) {
            zzkt zzktVar = (zzkt) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar = this.zza;
                int zzd = zzjbVar.zzd() + zzjbVar.zzn();
                do {
                    zzktVar.zzh(this.zza.zzn());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                zzktVar.zzh(this.zza.zzn());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i = this.zza.zzm();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar2 = this.zza;
                int zzd2 = zzjbVar2.zzd() + zzjbVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzn()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzn()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i = zzm;
        }
        this.zzd = i;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzM(List list) throws IOException {
        int zzm;
        int i;
        if (list instanceof zzlm) {
            zzlm zzlmVar = (zzlm) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar = this.zza;
                int zzd = zzjbVar.zzd() + zzjbVar.zzn();
                do {
                    zzlmVar.zzg(this.zza.zzv());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                zzlmVar.zzg(this.zza.zzv());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i = this.zza.zzm();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar2 = this.zza;
                int zzd2 = zzjbVar2.zzd() + zzjbVar2.zzn();
                do {
                    list.add(Long.valueOf(this.zza.zzv()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzv()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i = zzm;
        }
        this.zzd = i;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final boolean zzN() throws IOException {
        zzS(0);
        return this.zza.zzD();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final boolean zzO() throws IOException {
        int i;
        if (this.zza.zzC() || (i = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zzE(i);
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final double zza() throws IOException {
        zzS(1);
        return this.zza.zzb();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final float zzb() throws IOException {
        zzS(5);
        return this.zza.zzc();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final int zzc() throws IOException {
        int i = this.zzd;
        if (i != 0) {
            this.zzb = i;
            this.zzd = 0;
        } else {
            i = this.zza.zzm();
            this.zzb = i;
        }
        if (i == 0 || i == this.zzc) {
            return Integer.MAX_VALUE;
        }
        return i >>> 3;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final int zze() throws IOException {
        zzS(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final int zzf() throws IOException {
        zzS(5);
        return this.zza.zzg();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final int zzg() throws IOException {
        zzS(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final int zzh() throws IOException {
        zzS(5);
        return this.zza.zzk();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final int zzi() throws IOException {
        zzS(0);
        return this.zza.zzl();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final int zzj() throws IOException {
        zzS(0);
        return this.zza.zzn();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final long zzk() throws IOException {
        zzS(1);
        return this.zza.zzo();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final long zzl() throws IOException {
        zzS(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final long zzm() throws IOException {
        zzS(1);
        return this.zza.zzt();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final long zzn() throws IOException {
        zzS(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final long zzo() throws IOException {
        zzS(0);
        return this.zza.zzv();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final zziv zzp() throws IOException {
        zzS(2);
        return this.zza.zzw();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final String zzr() throws IOException {
        zzS(2);
        return this.zza.zzx();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final String zzs() throws IOException {
        zzS(2);
        return this.zza.zzy();
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzt(Object obj, zzmk zzmkVar, zzkd zzkdVar) throws IOException {
        zzS(3);
        zzP(obj, zzmkVar, zzkdVar);
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzu(Object obj, zzmk zzmkVar, zzkd zzkdVar) throws IOException {
        zzS(2);
        zzQ(obj, zzmkVar, zzkdVar);
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzv(List list) throws IOException {
        int zzm;
        int i;
        if (list instanceof zzim) {
            zzim zzimVar = (zzim) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar = this.zza;
                int zzd = zzjbVar.zzd() + zzjbVar.zzn();
                do {
                    zzimVar.zze(this.zza.zzD());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                zzimVar.zze(this.zza.zzD());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i = this.zza.zzm();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar2 = this.zza;
                int zzd2 = zzjbVar2.zzd() + zzjbVar2.zzn();
                do {
                    list.add(Boolean.valueOf(this.zza.zzD()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            do {
                list.add(Boolean.valueOf(this.zza.zzD()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i = zzm;
        }
        this.zzd = i;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzw(List list) throws IOException {
        int zzm;
        if ((this.zzb & 7) != 2) {
            throw zzlc.zza();
        }
        do {
            list.add(zzp());
            if (this.zza.zzC()) {
                return;
            } else {
                zzm = this.zza.zzm();
            }
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzx(List list) throws IOException {
        int zzm;
        int i;
        if (list instanceof zzjx) {
            zzjx zzjxVar = (zzjx) list;
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw zzlc.zza();
                }
                int zzn = this.zza.zzn();
                zzU(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    zzjxVar.zzf(this.zza.zzb());
                } while (this.zza.zzd() < zzd);
                return;
            }
            do {
                zzjxVar.zzf(this.zza.zzb());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i = this.zza.zzm();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw zzlc.zza();
                }
                int zzn2 = this.zza.zzn();
                zzU(zzn2);
                int zzd2 = this.zza.zzd() + zzn2;
                do {
                    list.add(Double.valueOf(this.zza.zzb()));
                } while (this.zza.zzd() < zzd2);
                return;
            }
            do {
                list.add(Double.valueOf(this.zza.zzb()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i = zzm;
        }
        this.zzd = i;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzy(List list) throws IOException {
        int zzm;
        int i;
        if (list instanceof zzkt) {
            zzkt zzktVar = (zzkt) list;
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar = this.zza;
                int zzd = zzjbVar.zzd() + zzjbVar.zzn();
                do {
                    zzktVar.zzh(this.zza.zzf());
                } while (this.zza.zzd() < zzd);
                zzR(zzd);
                return;
            }
            do {
                zzktVar.zzh(this.zza.zzf());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i = this.zza.zzm();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw zzlc.zza();
                }
                zzjb zzjbVar2 = this.zza;
                int zzd2 = zzjbVar2.zzd() + zzjbVar2.zzn();
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                } while (this.zza.zzd() < zzd2);
                zzR(zzd2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i = zzm;
        }
        this.zzd = i;
    }

    @Override // com.google.android.recaptcha.internal.zzmj
    public final void zzz(List list) throws IOException {
        int zzm;
        int i;
        if (list instanceof zzkt) {
            zzkt zzktVar = (zzkt) list;
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    zzktVar.zzh(this.zza.zzg());
                } while (this.zza.zzd() < zzd);
                return;
            }
            if (i2 != 5) {
                throw zzlc.zza();
            }
            do {
                zzktVar.zzh(this.zza.zzg());
                if (this.zza.zzC()) {
                    return;
                } else {
                    i = this.zza.zzm();
                }
            } while (i == this.zzb);
        } else {
            int i3 = this.zzb & 7;
            if (i3 == 2) {
                int zzn2 = this.zza.zzn();
                zzT(zzn2);
                int zzd2 = this.zza.zzd() + zzn2;
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzd() < zzd2);
                return;
            }
            if (i3 != 5) {
                throw zzlc.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (this.zza.zzC()) {
                    return;
                } else {
                    zzm = this.zza.zzm();
                }
            } while (zzm == this.zzb);
            i = zzm;
        }
        this.zzd = i;
    }
}
