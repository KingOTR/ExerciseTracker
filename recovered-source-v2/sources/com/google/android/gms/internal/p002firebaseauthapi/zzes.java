package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzer;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public class zzes extends zzcu {
    private final zzer zza;
    private final zzzc zzb;

    @Nullable
    private final Integer zzc;

    public static zzes zza(zzer zzerVar, @Nullable Integer num) throws GeneralSecurityException {
        zzzc zza;
        if (zzerVar.zzb() == zzer.zza.zza) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zza = zzzc.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (zzerVar.zzb() != zzer.zza.zzb) {
                throw new GeneralSecurityException("Unknown Variant: " + String.valueOf(zzerVar.zzb()));
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zza = zzzc.zza(new byte[0]);
        }
        return new zzes(zzerVar, zza, num);
    }

    public final zzer zzb() {
        return this.zza;
    }

    public final zzzc zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbp
    public final Integer zza() {
        return this.zzc;
    }

    private zzes(zzer zzerVar, zzzc zzzcVar, @Nullable Integer num) {
        this.zza = zzerVar;
        this.zzb = zzzcVar;
        this.zzc = num;
    }
}
