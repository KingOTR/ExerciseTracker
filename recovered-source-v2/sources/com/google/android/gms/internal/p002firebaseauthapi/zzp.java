package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzp extends zzn implements Serializable {
    private final Pattern zza;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzn
    public final zzo zza(CharSequence charSequence) {
        return new zzs(this.zza.matcher(charSequence));
    }

    public final String toString() {
        return this.zza.toString();
    }

    zzp(Pattern pattern) {
        this.zza = (Pattern) zzy.zza(pattern);
    }
}
