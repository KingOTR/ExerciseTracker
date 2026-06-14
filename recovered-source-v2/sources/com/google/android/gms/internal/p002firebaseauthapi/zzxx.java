package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzjp;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.EllipticCurve;
import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzxx implements zzbo {
    private final ECPrivateKey zza;
    private final zzxz zzb;
    private final String zzc;
    private final byte[] zzd;
    private final zzyd zze;
    private final zzkw zzf;
    private final byte[] zzg;

    public static zzbo zza(zzjs zzjsVar) throws GeneralSecurityException {
        ECPrivateKey zza = zzyb.zza(zzxw.zza.zza((zzmm<zzya, zzjp.zzc>) zzjsVar.zzc().zzd()), zzmj.zza(zzjsVar.zze().zza(zzbq.zza())));
        byte[] bArr = new byte[0];
        if (zzjsVar.zzc().zzh() != null) {
            bArr = zzjsVar.zzc().zzh().zzb();
        }
        return new zzxx(zza, bArr, zzxw.zza(zzjsVar.zzc().zze()), zzxw.zzb.zza((zzmm<zzyd, zzjp.zze>) zzjsVar.zzc().zzf()), zzks.zza(zzjsVar.zzc()), zzjsVar.zzg().zzb());
    }

    private zzxx(ECPrivateKey eCPrivateKey, byte[] bArr, String str, zzyd zzydVar, zzkw zzkwVar, byte[] bArr2) {
        this.zza = eCPrivateKey;
        this.zzb = new zzxz(eCPrivateKey);
        this.zzd = bArr;
        this.zzc = str;
        this.zze = zzydVar;
        this.zzf = zzkwVar;
        this.zzg = bArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i;
        int i2;
        if (!zzpr.zza(this.zzg, bArr)) {
            throw new GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
        }
        int length = this.zzg.length;
        EllipticCurve curve = this.zza.getParams().getCurve();
        zzyd zzydVar = this.zze;
        int zza = zzyb.zza(curve);
        int ordinal = zzydVar.ordinal();
        if (ordinal == 0) {
            zza *= 2;
        } else if (ordinal != 1) {
            if (ordinal != 2) {
                throw new GeneralSecurityException("unknown EC point format");
            }
            i = zza * 2;
            i2 = i + length;
            if (bArr.length >= i2) {
                throw new GeneralSecurityException("ciphertext too short");
            }
            return this.zzf.zza(this.zzb.zza(Arrays.copyOfRange(bArr, length, i2), this.zzc, this.zzd, bArr2, this.zzf.zza(), this.zze), bArr, i2);
        }
        i = zza + 1;
        i2 = i + length;
        if (bArr.length >= i2) {
        }
    }
}
