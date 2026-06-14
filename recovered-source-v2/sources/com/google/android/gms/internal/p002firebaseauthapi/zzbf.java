package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbf implements zzcb {
    private final InputStream zza;

    public static zzcb zza(byte[] bArr) {
        return new zzbf(new ByteArrayInputStream(bArr));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcb
    public final zzuo zza() throws IOException {
        try {
            return zzuo.zza(this.zza, zzajk.zza());
        } finally {
            this.zza.close();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcb
    public final zzwa zzb() throws IOException {
        try {
            return zzwa.zza(this.zza, zzajk.zza());
        } finally {
            this.zza.close();
        }
    }

    private zzbf(InputStream inputStream) {
        this.zza = inputStream;
    }
}
