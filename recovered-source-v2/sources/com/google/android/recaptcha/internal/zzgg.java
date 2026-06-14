package com.google.android.recaptcha.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.UInt;
import kotlin.collections.CollectionsKt;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzgg implements zzge {
    private final zzgf zza;

    public zzgg(zzgf zzgfVar, zzgd zzgdVar) {
        this.zza = zzgfVar;
    }

    private final zzrg zzb(String str, List list) throws zzby {
        zzgb zzgbVar;
        if (str.length() == 0) {
            throw new zzby(3, 17, null);
        }
        try {
            long zza = this.zza.zza(CollectionsKt.toLongArray(list));
            zzgbVar = zzgc.zza;
            zzgc zzgcVar = new zzgc(zza, 255L, zzgbVar);
            StringBuilder sb = new StringBuilder(str.length());
            for (int i = 0; i < str.length(); i++) {
                sb.append((char) UInt.m8000constructorimpl(UInt.m8000constructorimpl(str.charAt(i)) ^ UInt.m8000constructorimpl((int) zzgcVar.zza())));
            }
            return zzrg.zzg(zzhz.zzh().zzj(sb.toString()));
        } catch (Exception e) {
            throw new zzby(3, 18, e);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzge
    public final zzrg zza(zzro zzroVar) throws zzby {
        zzgz zzb = zzgz.zzb();
        zzrg zzb2 = zzb(zzroVar.zzj(), zzroVar.zzk());
        zzb.zzf();
        long zza = zzb.zza(TimeUnit.MICROSECONDS);
        int i = zzbq.zza;
        zzbq.zza(zzbr.zzh.zza(), zza);
        return zzb2;
    }
}
