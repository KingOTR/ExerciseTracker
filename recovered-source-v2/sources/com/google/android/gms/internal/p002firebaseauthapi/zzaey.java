package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.tasks.OnFailureListener;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaey implements OnFailureListener {
    zzaey(zzaew zzaewVar) {
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        Logger logger;
        logger = zzaew.zza;
        logger.e("SmsRetrieverClient failed to start: " + exc.getMessage(), new Object[0]);
    }
}
