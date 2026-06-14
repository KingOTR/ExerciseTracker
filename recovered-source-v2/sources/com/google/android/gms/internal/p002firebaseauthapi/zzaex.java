package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.logging.Logger;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaex extends zzade {
    private final String zza;
    private final /* synthetic */ zzaew zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaex(zzaew zzaewVar, zzade zzadeVar, String str) {
        super(zzadeVar);
        this.zzb = zzaewVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzade
    public final void zzb(String str) {
        Logger logger;
        HashMap hashMap;
        logger = zzaew.zza;
        logger.d("onCodeSent", new Object[0]);
        hashMap = this.zzb.zzd;
        zzaez zzaezVar = (zzaez) hashMap.get(this.zza);
        if (zzaezVar == null) {
            return;
        }
        Iterator<zzade> it = zzaezVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zzb(str);
        }
        zzaezVar.zzg = true;
        zzaezVar.zzd = str;
        if (zzaezVar.zza <= 0) {
            this.zzb.zzb(this.zza);
        } else if (!zzaezVar.zzc) {
            this.zzb.zze(this.zza);
        } else {
            if (zzag.zzc(zzaezVar.zze)) {
                return;
            }
            zzaew.zza(this.zzb, this.zza);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzade
    public final void zza(Status status) {
        Logger logger;
        HashMap hashMap;
        logger = zzaew.zza;
        logger.e("SMS verification code request failed: " + CommonStatusCodes.getStatusCodeString(status.getStatusCode()) + " " + status.getStatusMessage(), new Object[0]);
        hashMap = this.zzb.zzd;
        zzaez zzaezVar = (zzaez) hashMap.get(this.zza);
        if (zzaezVar == null) {
            return;
        }
        Iterator<zzade> it = zzaezVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zza(status);
        }
        this.zzb.zzc(this.zza);
    }
}
