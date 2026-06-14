package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.regex.Pattern;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzw implements zzu {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzu
    public final zzn zza(String str) {
        return new zzp(Pattern.compile(str));
    }

    private zzw() {
    }
}
