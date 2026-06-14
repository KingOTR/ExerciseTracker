package com.google.android.gms.internal.p002firebaseauthapi;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzj extends zzk {
    private final char zza;

    public final String toString() {
        char c = this.zza;
        char[] cArr = new char[6];
        cArr[0] = AbstractJsonLexerKt.STRING_ESC;
        cArr[1] = AbstractJsonLexerKt.UNICODE_ESC;
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return "CharMatcher.is('" + String.copyValueOf(cArr) + "')";
    }

    zzj(char c) {
        this.zza = c;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzh
    public final boolean zza(char c) {
        return c == this.zza;
    }
}
