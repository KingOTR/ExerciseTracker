package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzlg {
    private static final byte[] zza = new byte[0];
    private final zzlh zzb;
    private final BigInteger zzc;
    private final byte[] zzd;
    private final byte[] zze;
    private BigInteger zzf = BigInteger.ZERO;

    public static zzlg zza(byte[] bArr, zzln zzlnVar, zzlk zzlkVar, zzll zzllVar, zzlh zzlhVar, byte[] bArr2) throws GeneralSecurityException {
        byte[] zza2 = zzlkVar.zza(bArr, zzlnVar);
        byte[] bArr3 = zzlq.zza;
        byte[] zza3 = zzlq.zza(zzlkVar.zza(), zzllVar.zzb(), zzlhVar.zzc());
        byte[] bArr4 = zzlq.zzl;
        byte[] bArr5 = zza;
        byte[] zza4 = zzxv.zza(bArr3, zzllVar.zza(bArr4, bArr5, "psk_id_hash", zza3), zzllVar.zza(zzlq.zzl, bArr2, "info_hash", zza3));
        byte[] zza5 = zzllVar.zza(zza2, bArr5, "secret", zza3);
        byte[] zza6 = zzllVar.zza(zza5, zza4, DatabaseFileArchive.COLUMN_KEY, zza3, zzlhVar.zza());
        byte[] zza7 = zzllVar.zza(zza5, zza4, "base_nonce", zza3, zzlhVar.zzb());
        zzlhVar.zzb();
        return new zzlg(bArr, zza6, zza7, BigInteger.ONE.shiftLeft(96).subtract(BigInteger.ONE), zzlhVar);
    }

    private zzlg(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, zzlh zzlhVar) {
        this.zzd = bArr2;
        this.zze = bArr3;
        this.zzc = bigInteger;
        this.zzb = zzlhVar;
    }

    private final synchronized byte[] zza() throws GeneralSecurityException {
        byte[] zza2;
        zza2 = zzxv.zza(this.zze, zzmj.zza(this.zzf, this.zzb.zzb()));
        if (this.zzf.compareTo(this.zzc) >= 0) {
            throw new GeneralSecurityException("message limit reached");
        }
        this.zzf = this.zzf.add(BigInteger.ONE);
        return zza2;
    }

    final byte[] zza(byte[] bArr, int i, byte[] bArr2) throws GeneralSecurityException {
        return this.zzb.zza(this.zzd, zza(), bArr, i, bArr2);
    }
}
