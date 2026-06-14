package com.example.rungps.ui.onboarding;

import android.content.Context;
import com.example.rungps.data.AppPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;

/* compiled from: OnboardingWizard.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\n"}, d2 = {"Lcom/example/rungps/ui/onboarding/OnboardingPrefs;", "", "<init>", "()V", "isDone", "", "context", "Landroid/content/Context;", "markDone", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OnboardingPrefs {
    public static final int $stable = 0;
    public static final OnboardingPrefs INSTANCE = new OnboardingPrefs();

    private OnboardingPrefs() {
    }

    public final boolean isDone(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return AppPreferences.INSTANCE.isOnboardingDoneBlocking(context);
    }

    public final void markDone(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        BuildersKt__BuildersKt.runBlocking$default(null, new OnboardingPrefs$markDone$1$1(AppPreferences.INSTANCE, context, null), 1, null);
    }
}
