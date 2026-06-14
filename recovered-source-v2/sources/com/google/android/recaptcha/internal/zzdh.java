package com.google.android.recaptcha.internal;

import java.util.TimerTask;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzdh extends TimerTask {
    final /* synthetic */ zzdk zza;

    public zzdh(zzdk zzdkVar) {
        this.zza = zzdkVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        CoroutineScope coroutineScope;
        zzdk zzdkVar = this.zza;
        coroutineScope = zzdkVar.zzd;
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new zzdi(zzdkVar, null), 3, null);
    }
}
