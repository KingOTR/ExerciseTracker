package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzpp extends RuntimeException {
    public static <T> T zza(zzpo<T> zzpoVar) {
        try {
            return zzpoVar.zza();
        } catch (Exception e) {
            throw new zzpp(e);
        }
    }

    public zzpp(String str) {
        super(str);
    }

    private zzpp(Throwable th) {
        super(th);
    }

    public zzpp(String str, Throwable th) {
        super(str, th);
    }
}
