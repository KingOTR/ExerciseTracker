package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaie;
import com.google.android.gms.internal.p002firebaseauthapi.zzaif;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzaif<MessageType extends zzaif<MessageType, BuilderType>, BuilderType extends zzaie<MessageType, BuilderType>> implements zzalc {
    protected int zza = 0;

    int zzi() {
        throw new UnsupportedOperationException();
    }

    int zza(zzalv zzalvVar) {
        int zzi = zzi();
        if (zzi != -1) {
            return zzi;
        }
        int zza = zzalvVar.zza(this);
        zzb(zza);
        return zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalc
    public final zzaip a_() {
        try {
            zzaiu zzc = zzaip.zzc(zzl());
            zza(zzc.zzb());
            return zzc.zza();
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + this.getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    void zzb(int i) {
        throw new UnsupportedOperationException();
    }

    public final void zza(OutputStream outputStream) throws IOException {
        zzajg zza = zzajg.zza(outputStream, zzajg.zzf(zzl()));
        zza(zza);
        zza.zzc();
    }

    public final byte[] zzk() {
        try {
            byte[] bArr = new byte[zzl()];
            zzajg zzb = zzajg.zzb(bArr);
            zza(zzb);
            zzb.zzb();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
        }
    }
}
