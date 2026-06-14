package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
final class zzjh implements zzno {
    private final zzjg zza;

    private zzjh(zzjg zzjgVar) {
        byte[] bArr = zzla.zzb;
        this.zza = zzjgVar;
        zzjgVar.zza = this;
    }

    public static zzjh zza(zzjg zzjgVar) {
        zzjh zzjhVar = zzjgVar.zza;
        return zzjhVar != null ? zzjhVar : new zzjh(zzjgVar);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzB(int i, int i2) throws IOException {
        zzjg zzjgVar = this.zza;
        zzjgVar.zzp(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzD(int i, long j) throws IOException {
        zzjg zzjgVar = this.zza;
        zzjgVar.zzr(i, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.recaptcha.internal.zzno
    @Deprecated
    public final void zzF(int i) throws IOException {
        this.zza.zzo(i, 3);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzG(int i, String str) throws IOException {
        this.zza.zzm(i, str);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzI(int i, int i2) throws IOException {
        this.zza.zzp(i, i2);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzK(int i, long j) throws IOException {
        this.zza.zzr(i, j);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzb(int i, boolean z) throws IOException {
        this.zza.zzd(i, z);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzd(int i, zziv zzivVar) throws IOException {
        this.zza.zze(i, zzivVar);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zze(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zze(i, (zziv) list.get(i2));
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzf(int i, double d) throws IOException {
        this.zza.zzh(i, Double.doubleToRawLongBits(d));
    }

    @Override // com.google.android.recaptcha.internal.zzno
    @Deprecated
    public final void zzh(int i) throws IOException {
        this.zza.zzo(i, 4);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzi(int i, int i2) throws IOException {
        this.zza.zzj(i, i2);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzk(int i, int i2) throws IOException {
        this.zza.zzf(i, i2);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzm(int i, long j) throws IOException {
        this.zza.zzh(i, j);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzo(int i, float f) throws IOException {
        this.zza.zzf(i, Float.floatToRawIntBits(f));
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzq(int i, Object obj, zzmk zzmkVar) throws IOException {
        zzjg zzjgVar = this.zza;
        zzjgVar.zzo(i, 3);
        zzmkVar.zzj((zzlx) obj, zzjgVar.zza);
        zzjgVar.zzo(i, 4);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzr(int i, int i2) throws IOException {
        this.zza.zzj(i, i2);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzt(int i, long j) throws IOException {
        this.zza.zzr(i, j);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzv(int i, Object obj, zzmk zzmkVar) throws IOException {
        zzlx zzlxVar = (zzlx) obj;
        zzjd zzjdVar = (zzjd) this.zza;
        zzjdVar.zzq((i << 3) | 2);
        zzjdVar.zzq(((zzig) zzlxVar).zza(zzmkVar));
        zzmkVar.zzj(zzlxVar, zzjdVar.zza);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzw(int i, Object obj) throws IOException {
        if (obj instanceof zziv) {
            zzjd zzjdVar = (zzjd) this.zza;
            zzjdVar.zzq(11);
            zzjdVar.zzp(2, i);
            zzjdVar.zze(3, (zziv) obj);
            zzjdVar.zzq(12);
            return;
        }
        zzjg zzjgVar = this.zza;
        zzlx zzlxVar = (zzlx) obj;
        zzjd zzjdVar2 = (zzjd) zzjgVar;
        zzjdVar2.zzq(11);
        zzjdVar2.zzp(2, i);
        zzjdVar2.zzq(26);
        zzjdVar2.zzq(zzlxVar.zzn());
        zzlxVar.zze(zzjgVar);
        zzjdVar2.zzq(12);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzx(int i, int i2) throws IOException {
        this.zza.zzf(i, i2);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzz(int i, long j) throws IOException {
        this.zza.zzh(i, j);
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzH(int i, List list) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzlj)) {
            while (i2 < list.size()) {
                this.zza.zzm(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        zzlj zzljVar = (zzlj) list;
        while (i2 < list.size()) {
            Object zzc = zzljVar.zzc();
            if (zzc instanceof String) {
                this.zza.zzm(i, (String) zzc);
            } else {
                this.zza.zze(i, (zziv) zzc);
            }
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzJ(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzkt)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzp(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzjg.zzx(((Integer) list.get(i4)).intValue());
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzq(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzkt zzktVar = (zzkt) list;
        if (!z) {
            while (i2 < zzktVar.size()) {
                this.zza.zzp(i, zzktVar.zze(i2));
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzktVar.size(); i6++) {
            i5 += zzjg.zzx(zzktVar.zze(i6));
        }
        this.zza.zzq(i5);
        while (i2 < zzktVar.size()) {
            this.zza.zzq(zzktVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzL(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzlm)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzr(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            this.zza.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzjg.zzy(((Long) list.get(i4)).longValue());
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzs(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzlm zzlmVar = (zzlm) list;
        if (!z) {
            while (i2 < zzlmVar.size()) {
                this.zza.zzr(i, zzlmVar.zze(i2));
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzlmVar.size(); i6++) {
            i5 += zzjg.zzy(zzlmVar.zze(i6));
        }
        this.zza.zzq(i5);
        while (i2 < zzlmVar.size()) {
            this.zza.zzs(zzlmVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzl(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzkt)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzf(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzg(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzkt zzktVar = (zzkt) list;
        if (!z) {
            while (i2 < zzktVar.size()) {
                this.zza.zzf(i, zzktVar.zze(i2));
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzktVar.size(); i6++) {
            zzktVar.zze(i6);
            i5 += 4;
        }
        this.zza.zzq(i5);
        while (i2 < zzktVar.size()) {
            this.zza.zzg(zzktVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzn(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzlm)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            this.zza.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzi(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzlm zzlmVar = (zzlm) list;
        if (!z) {
            while (i2 < zzlmVar.size()) {
                this.zza.zzh(i, zzlmVar.zze(i2));
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzlmVar.size(); i6++) {
            zzlmVar.zze(i6);
            i5 += 8;
        }
        this.zza.zzq(i5);
        while (i2 < zzlmVar.size()) {
            this.zza.zzi(zzlmVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzc(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzim)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzd(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            this.zza.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzb(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        zzim zzimVar = (zzim) list;
        if (!z) {
            while (i2 < zzimVar.size()) {
                this.zza.zzd(i, zzimVar.zzf(i2));
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzimVar.size(); i6++) {
            zzimVar.zzf(i6);
            i5++;
        }
        this.zza.zzq(i5);
        while (i2 < zzimVar.size()) {
            this.zza.zzb(zzimVar.zzf(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzs(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzkt)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzj(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzjg.zzy(((Integer) list.get(i4)).intValue());
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzk(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzkt zzktVar = (zzkt) list;
        if (!z) {
            while (i2 < zzktVar.size()) {
                this.zza.zzj(i, zzktVar.zze(i2));
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzktVar.size(); i6++) {
            i5 += zzjg.zzy(zzktVar.zze(i6));
        }
        this.zza.zzq(i5);
        while (i2 < zzktVar.size()) {
            this.zza.zzk(zzktVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzA(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzlm)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            this.zza.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzi(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzlm zzlmVar = (zzlm) list;
        if (!z) {
            while (i2 < zzlmVar.size()) {
                this.zza.zzh(i, zzlmVar.zze(i2));
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzlmVar.size(); i6++) {
            zzlmVar.zze(i6);
            i5 += 8;
        }
        this.zza.zzq(i5);
        while (i2 < zzlmVar.size()) {
            this.zza.zzi(zzlmVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzg(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzjx)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            this.zza.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        zzjx zzjxVar = (zzjx) list;
        if (!z) {
            while (i2 < zzjxVar.size()) {
                this.zza.zzh(i, Double.doubleToRawLongBits(zzjxVar.zze(i2)));
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzjxVar.size(); i6++) {
            zzjxVar.zze(i6);
            i5 += 8;
        }
        this.zza.zzq(i5);
        while (i2 < zzjxVar.size()) {
            this.zza.zzi(Double.doubleToRawLongBits(zzjxVar.zze(i2)));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzp(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzkk)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzf(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            this.zza.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        zzkk zzkkVar = (zzkk) list;
        if (!z) {
            while (i2 < zzkkVar.size()) {
                this.zza.zzf(i, Float.floatToRawIntBits(zzkkVar.zze(i2)));
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzkkVar.size(); i6++) {
            zzkkVar.zze(i6);
            i5 += 4;
        }
        this.zza.zzq(i5);
        while (i2 < zzkkVar.size()) {
            this.zza.zzg(Float.floatToRawIntBits(zzkkVar.zze(i2)));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzy(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzkt)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzf(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzg(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzkt zzktVar = (zzkt) list;
        if (!z) {
            while (i2 < zzktVar.size()) {
                this.zza.zzf(i, zzktVar.zze(i2));
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzktVar.size(); i6++) {
            zzktVar.zze(i6);
            i5 += 4;
        }
        this.zza.zzq(i5);
        while (i2 < zzktVar.size()) {
            this.zza.zzg(zzktVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzC(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzkt)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzjg zzjgVar = this.zza;
                    int intValue = ((Integer) list.get(i2)).intValue();
                    zzjgVar.zzp(i, (intValue >> 31) ^ (intValue + intValue));
                    i2++;
                }
                return;
            }
            this.zza.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue2 = ((Integer) list.get(i4)).intValue();
                i3 += zzjg.zzx((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                zzjg zzjgVar2 = this.zza;
                int intValue3 = ((Integer) list.get(i2)).intValue();
                zzjgVar2.zzq((intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
            return;
        }
        zzkt zzktVar = (zzkt) list;
        if (!z) {
            while (i2 < zzktVar.size()) {
                zzjg zzjgVar3 = this.zza;
                int zze = zzktVar.zze(i2);
                zzjgVar3.zzp(i, (zze >> 31) ^ (zze + zze));
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzktVar.size(); i6++) {
            int zze2 = zzktVar.zze(i6);
            i5 += zzjg.zzx((zze2 >> 31) ^ (zze2 + zze2));
        }
        this.zza.zzq(i5);
        while (i2 < zzktVar.size()) {
            zzjg zzjgVar4 = this.zza;
            int zze3 = zzktVar.zze(i2);
            zzjgVar4.zzq((zze3 >> 31) ^ (zze3 + zze3));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzE(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzlm)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzjg zzjgVar = this.zza;
                    long longValue = ((Long) list.get(i2)).longValue();
                    zzjgVar.zzr(i, (longValue >> 63) ^ (longValue + longValue));
                    i2++;
                }
                return;
            }
            this.zza.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue2 = ((Long) list.get(i4)).longValue();
                i3 += zzjg.zzy((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                zzjg zzjgVar2 = this.zza;
                long longValue3 = ((Long) list.get(i2)).longValue();
                zzjgVar2.zzs((longValue3 >> 63) ^ (longValue3 + longValue3));
                i2++;
            }
            return;
        }
        zzlm zzlmVar = (zzlm) list;
        if (!z) {
            while (i2 < zzlmVar.size()) {
                zzjg zzjgVar3 = this.zza;
                long zze = zzlmVar.zze(i2);
                zzjgVar3.zzr(i, (zze >> 63) ^ (zze + zze));
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzlmVar.size(); i6++) {
            long zze2 = zzlmVar.zze(i6);
            i5 += zzjg.zzy((zze2 >> 63) ^ (zze2 + zze2));
        }
        this.zza.zzq(i5);
        while (i2 < zzlmVar.size()) {
            zzjg zzjgVar4 = this.zza;
            long zze3 = zzlmVar.zze(i2);
            zzjgVar4.zzs((zze3 >> 63) ^ (zze3 + zze3));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzj(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzkt)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzj(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzjg.zzy(((Integer) list.get(i4)).intValue());
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzk(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzkt zzktVar = (zzkt) list;
        if (!z) {
            while (i2 < zzktVar.size()) {
                this.zza.zzj(i, zzktVar.zze(i2));
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzktVar.size(); i6++) {
            i5 += zzjg.zzy(zzktVar.zze(i6));
        }
        this.zza.zzq(i5);
        while (i2 < zzktVar.size()) {
            this.zza.zzk(zzktVar.zze(i2));
            i2++;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzno
    public final void zzu(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzlm)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzr(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            this.zza.zzo(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzjg.zzy(((Long) list.get(i4)).longValue());
            }
            this.zza.zzq(i3);
            while (i2 < list.size()) {
                this.zza.zzs(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzlm zzlmVar = (zzlm) list;
        if (!z) {
            while (i2 < zzlmVar.size()) {
                this.zza.zzr(i, zzlmVar.zze(i2));
                i2++;
            }
            return;
        }
        this.zza.zzo(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzlmVar.size(); i6++) {
            i5 += zzjg.zzy(zzlmVar.zze(i6));
        }
        this.zza.zzq(i5);
        while (i2 < zzlmVar.size()) {
            this.zza.zzs(zzlmVar.zze(i2));
            i2++;
        }
    }
}
