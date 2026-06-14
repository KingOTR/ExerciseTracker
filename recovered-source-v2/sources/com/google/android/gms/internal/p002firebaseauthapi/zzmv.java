package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: Add missing generic type declarations: [SerializationT] */
/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzmv<SerializationT> extends zzms<SerializationT> {
    private final /* synthetic */ zzmu zza;

    /* JADX WARN: Incorrect types in method signature: (TSerializationT;Lcom/google/android/gms/internal/firebase-auth-api/zzcn;)Lcom/google/android/gms/internal/firebase-auth-api/zzbp; */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzms
    public final zzbp zza(zzpj zzpjVar, @Nullable zzcn zzcnVar) throws GeneralSecurityException {
        return this.zza.zza(zzpjVar, zzcnVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzmv(zzzc zzzcVar, Class cls, zzmu zzmuVar) {
        super(zzzcVar, cls);
        this.zza = zzmuVar;
    }
}
