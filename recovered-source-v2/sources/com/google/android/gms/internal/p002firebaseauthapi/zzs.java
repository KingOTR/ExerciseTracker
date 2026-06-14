package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.regex.Matcher;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzs extends zzo {
    private final Matcher zza;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzo
    public final int zza() {
        return this.zza.end();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzo
    public final int zzb() {
        return this.zza.start();
    }

    zzs(Matcher matcher) {
        this.zza = (Matcher) zzy.zza(matcher);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzo
    public final boolean zza(int i) {
        return this.zza.find(i);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzo
    public final boolean zzc() {
        return this.zza.matches();
    }
}
