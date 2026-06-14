package com.google.android.recaptcha.internal;

import java.util.TimerTask;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzak extends TimerTask {
    final /* synthetic */ zzap zza;

    public zzak(zzap zzapVar) {
        this.zza = zzapVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        CoroutineScope coroutineScope;
        zzap zzapVar = this.zza;
        coroutineScope = zzapVar.zzb;
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new zzal(zzapVar, null), 3, null);
    }
}
