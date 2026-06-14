package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public abstract class zzjg extends zzin {
    private static final Logger zzb = Logger.getLogger(zzjg.class.getName());
    private static final boolean zzc = zzni.zzx();
    zzjh zza;

    private zzjg() {
        throw null;
    }

    /* synthetic */ zzjg(zzjf zzjfVar) {
    }

    @Deprecated
    static int zzt(int i, zzlx zzlxVar, zzmk zzmkVar) {
        int zzx = zzx(i << 3);
        return zzx + zzx + ((zzig) zzlxVar).zza(zzmkVar);
    }

    public static int zzu(zzlx zzlxVar) {
        int zzn = zzlxVar.zzn();
        return zzx(zzn) + zzn;
    }

    static int zzv(zzlx zzlxVar, zzmk zzmkVar) {
        int zza = ((zzig) zzlxVar).zza(zzmkVar);
        return zzx(zza) + zza;
    }

    public static int zzw(String str) {
        int length;
        try {
            length = zznl.zzc(str);
        } catch (zznk unused) {
            length = str.getBytes(zzla.zza).length;
        }
        return zzx(length) + length;
    }

    public static int zzx(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int zzy(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static zzjg zzz(byte[] bArr, int i, int i2) {
        return new zzjd(bArr, 0, i2);
    }

    public final void zzA() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void zzB(String str, zznk zznkVar) throws IOException {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zznkVar);
        byte[] bytes = str.getBytes(zzla.zza);
        try {
            int length = bytes.length;
            zzq(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzje(e);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b) throws IOException;

    public abstract void zzd(int i, boolean z) throws IOException;

    public abstract void zze(int i, zziv zzivVar) throws IOException;

    public abstract void zzf(int i, int i2) throws IOException;

    public abstract void zzg(int i) throws IOException;

    public abstract void zzh(int i, long j) throws IOException;

    public abstract void zzi(long j) throws IOException;

    public abstract void zzj(int i, int i2) throws IOException;

    public abstract void zzk(int i) throws IOException;

    public abstract void zzl(byte[] bArr, int i, int i2) throws IOException;

    public abstract void zzm(int i, String str) throws IOException;

    public abstract void zzo(int i, int i2) throws IOException;

    public abstract void zzp(int i, int i2) throws IOException;

    public abstract void zzq(int i) throws IOException;

    public abstract void zzr(int i, long j) throws IOException;

    public abstract void zzs(long j) throws IOException;
}
