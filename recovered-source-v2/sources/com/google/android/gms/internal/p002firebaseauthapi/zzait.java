package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzait extends zzaiw {
    private final int zzc;
    private final int zzd;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiw, com.google.android.gms.internal.p002firebaseauthapi.zzaip
    public final byte zza(int i) {
        int zzb = zzb();
        if (((zzb - (i + 1)) | i) >= 0) {
            return this.zzb[this.zzc + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiw, com.google.android.gms.internal.p002firebaseauthapi.zzaip
    final byte zzb(int i) {
        return this.zzb[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiw
    protected final int zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiw, com.google.android.gms.internal.p002firebaseauthapi.zzaip
    public final int zzb() {
        return this.zzd;
    }

    zzait(byte[] bArr, int i, int i2) {
        super(bArr);
        zza(i, i + i2, bArr.length);
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiw, com.google.android.gms.internal.p002firebaseauthapi.zzaip
    protected final void zza(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zzb, zze(), bArr, 0, i3);
    }
}
