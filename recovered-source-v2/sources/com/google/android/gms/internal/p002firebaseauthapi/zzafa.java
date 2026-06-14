package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.logging.Logger;
import java.util.HashMap;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzafa extends BroadcastReceiver {
    private final String zza;
    private final /* synthetic */ zzaew zzb;

    public zzafa(zzaew zzaewVar, String str) {
        this.zzb = zzaewVar;
        this.zza = str;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        HashMap hashMap;
        Logger logger;
        Logger logger2;
        if (SmsRetriever.SMS_RETRIEVED_ACTION.equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            if (((Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS")).getStatusCode() == 0) {
                String str = (String) extras.get(SmsRetriever.EXTRA_SMS_MESSAGE);
                hashMap = this.zzb.zzd;
                zzaez zzaezVar = (zzaez) hashMap.get(this.zza);
                if (zzaezVar == null) {
                    logger2 = zzaew.zza;
                    logger2.e("Verification code received with no active retrieval session.", new Object[0]);
                } else {
                    zzaezVar.zze = zzaew.zza(str);
                    if (zzaezVar.zze == null) {
                        logger = zzaew.zza;
                        logger.e("Unable to extract verification code.", new Object[0]);
                    } else if (!zzag.zzc(zzaezVar.zzd)) {
                        zzaew.zza(this.zzb, this.zza);
                    }
                }
            }
            context.getApplicationContext().unregisterReceiver(this);
        }
    }
}
