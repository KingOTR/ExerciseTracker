package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzyw extends ThreadLocal<Mac> {
    private final /* synthetic */ zzyx zza;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.ThreadLocal
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() {
        String str;
        Key key;
        try {
            zzyf<zzyo, Mac> zzyfVar = zzyf.zzb;
            str = this.zza.zzc;
            Mac zza = zzyfVar.zza(str);
            key = this.zza.zzd;
            zza.init(key);
            return zza;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    zzyw(zzyx zzyxVar) {
        this.zza = zzyxVar;
    }
}
