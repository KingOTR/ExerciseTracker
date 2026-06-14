package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzju;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzlj implements zzbo {
    private static final byte[] zza = new byte[0];
    private final zzln zzb;
    private final zzlk zzc;
    private final zzll zzd;
    private final zzlh zze;
    private final int zzf;
    private final byte[] zzg;

    public static zzbo zza(zzjw zzjwVar) throws GeneralSecurityException {
        int i;
        zzya zzyaVar;
        zzln zza2;
        zzju zzc = zzjwVar.zzc();
        zzlk zza3 = zzli.zza(zzc.zze());
        zzll zza4 = zzli.zza(zzc.zzd());
        zzlh zza5 = zzli.zza(zzc.zzb());
        zzju.zzf zze = zzc.zze();
        if (zze.equals(zzju.zzf.zzd)) {
            i = 32;
        } else if (zze.equals(zzju.zzf.zza)) {
            i = 65;
        } else if (zze.equals(zzju.zzf.zzb)) {
            i = 97;
        } else {
            if (!zze.equals(zzju.zzf.zzc)) {
                throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
            }
            i = 133;
        }
        int i2 = i;
        zzju.zzf zze2 = zzjwVar.zzc().zze();
        if (zze2.equals(zzju.zzf.zzd)) {
            zza2 = zzmb.zza(zzjwVar.zze().zza(zzbq.zza()));
        } else {
            if (!zze2.equals(zzju.zzf.zza) && !zze2.equals(zzju.zzf.zzb) && !zze2.equals(zzju.zzf.zzc)) {
                throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
            }
            byte[] zza6 = zzjwVar.zze().zza(zzbq.zza());
            byte[] zzb = ((zzke) ((zzkr) zzjwVar.zzb())).zzd().zzb();
            if (zze2.equals(zzju.zzf.zza)) {
                zzyaVar = zzya.NIST_P256;
            } else if (zze2.equals(zzju.zzf.zzb)) {
                zzyaVar = zzya.NIST_P384;
            } else {
                if (!zze2.equals(zzju.zzf.zzc)) {
                    throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
                }
                zzyaVar = zzya.NIST_P521;
            }
            zza2 = zzlz.zza(zza6, zzb, zzyaVar);
        }
        return new zzlj(zza2, zza3, zza4, zza5, i2, zzjwVar.zzg());
    }

    private zzlj(zzln zzlnVar, zzlk zzlkVar, zzll zzllVar, zzlh zzlhVar, int i, zzzc zzzcVar) {
        this.zzb = zzlnVar;
        this.zzc = zzlkVar;
        this.zzd = zzllVar;
        this.zze = zzlhVar;
        this.zzf = i;
        this.zzg = zzzcVar.zzb();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbo
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzg;
        int length = bArr3.length + this.zzf;
        if (bArr.length < length) {
            throw new GeneralSecurityException("Ciphertext is too short.");
        }
        if (!zzpr.zza(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
        }
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return zzlg.zza(Arrays.copyOfRange(bArr, this.zzg.length, length), this.zzb, this.zzc, this.zzd, this.zze, bArr2).zza(bArr, length, zza);
    }
}
