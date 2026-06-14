package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzuo;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbi implements zzce {
    private final OutputStream zza;

    public static zzce zza(OutputStream outputStream) {
        return new zzbi(outputStream);
    }

    private zzbi(OutputStream outputStream) {
        this.zza = outputStream;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzce
    public final void zza(zzuo zzuoVar) throws IOException {
        try {
            zzuo.zza zzn = zzuoVar.zzn();
            zzuo.zza zzaVar = zzn;
            ((zzuo) ((zzajy) zzn.zza().zze())).zza(this.zza);
        } finally {
            this.zza.close();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzce
    public final void zza(zzwa zzwaVar) throws IOException {
        try {
            zzwaVar.zza(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
