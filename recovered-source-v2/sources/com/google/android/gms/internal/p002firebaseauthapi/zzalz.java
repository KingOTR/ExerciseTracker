package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [FieldDescriptorT] */
/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzalz<FieldDescriptorT> extends zzalw<FieldDescriptorT, Object> {
    zzalz() {
        super();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalw
    public final void zzd() {
        if (!zze()) {
            for (int i = 0; i < zza(); i++) {
                Map.Entry<FieldDescriptorT, Object> zza = zza(i);
                if (((zzajt) zza.getKey()).zze()) {
                    zza.setValue(Collections.unmodifiableList((List) zza.getValue()));
                }
            }
            for (Map.Entry<FieldDescriptorT, Object> entry : zzb()) {
                if (((zzajt) entry.getKey()).zze()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zzd();
    }
}
