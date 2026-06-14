package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: Add missing generic type declarations: [KeyT, SerializationT] */
/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzmz<KeyT, SerializationT> extends zzmw<KeyT, SerializationT> {
    private final /* synthetic */ zzmy zza;

    /* JADX WARN: Incorrect return type in method signature: (TKeyT;Lcom/google/android/gms/internal/firebase-auth-api/zzcn;)TSerializationT; */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmw
    public final zzpj zza(zzbp zzbpVar, @Nullable zzcn zzcnVar) throws GeneralSecurityException {
        return this.zza.zza(zzbpVar, zzcnVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzmz(Class cls, Class cls2, zzmy zzmyVar) {
        super(cls, cls2);
        this.zza = zzmyVar;
    }
}
