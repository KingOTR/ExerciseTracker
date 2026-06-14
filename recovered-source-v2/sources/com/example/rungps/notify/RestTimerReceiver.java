package com.example.rungps.notify;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.ToneGenerator;
import com.example.rungps.util.HapticFeedback;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RestTimerReceiver.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"Lcom/example/rungps/notify/RestTimerReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RestTimerReceiver extends BroadcastReceiver {
    public static final int $stable = 0;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Intrinsics.areEqual(intent != null ? intent.getAction() : null, RestTimerScheduler.ACTION_REST_DONE)) {
            RestTimerNotifier.INSTANCE.showRestComplete(context);
            HapticFeedback.INSTANCE.pulse(context, HapticFeedback.Pattern.RestDone);
            try {
                Result.Companion companion = Result.INSTANCE;
                RestTimerReceiver restTimerReceiver = this;
                Result.m7905constructorimpl(Boolean.valueOf(new ToneGenerator(5, 80).startTone(24, 200)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
        }
    }
}
