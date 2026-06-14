package com.example.rungps.ui.components;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: MuscleAtlasBridge.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001d\u001a\u00020\u0005H\u0007J\b\u0010\u001e\u001a\u00020\u000bH\u0007J\u0010\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0005H\u0007J\u0010\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020#H\u0007R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/example/rungps/ui/components/MuscleAtlasBridge;", "", "<init>", "()V", "latestJson", "", "getLatestJson", "()Ljava/lang/String;", "setLatestJson", "(Ljava/lang/String;)V", "darkTheme", "", "getDarkTheme", "()Z", "setDarkTheme", "(Z)V", "muscleClickHandler", "Lkotlin/Function1;", "", "getMuscleClickHandler", "()Lkotlin/jvm/functions/Function1;", "setMuscleClickHandler", "(Lkotlin/jvm/functions/Function1;)V", "heightReadyHandler", "", "getHeightReadyHandler", "setHeightReadyHandler", "mainHandler", "Landroid/os/Handler;", "getInitialState", "isDarkTheme", "onMuscleClicked", "muscleId", "onAtlasHeight", "heightPx", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MuscleAtlasBridge {
    public static final int $stable = 8;
    private volatile boolean darkTheme;
    private volatile Function1<? super Integer, Unit> heightReadyHandler;
    private volatile String latestJson = "{}";
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private volatile Function1<? super String, Unit> muscleClickHandler;

    public final String getLatestJson() {
        return this.latestJson;
    }

    public final void setLatestJson(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.latestJson = str;
    }

    public final boolean getDarkTheme() {
        return this.darkTheme;
    }

    public final void setDarkTheme(boolean z) {
        this.darkTheme = z;
    }

    public final Function1<String, Unit> getMuscleClickHandler() {
        return this.muscleClickHandler;
    }

    public final void setMuscleClickHandler(Function1<? super String, Unit> function1) {
        this.muscleClickHandler = function1;
    }

    public final Function1<Integer, Unit> getHeightReadyHandler() {
        return this.heightReadyHandler;
    }

    public final void setHeightReadyHandler(Function1<? super Integer, Unit> function1) {
        this.heightReadyHandler = function1;
    }

    @JavascriptInterface
    /* renamed from: getInitialState, reason: from getter */
    public final String getLatestJson() {
        return this.latestJson;
    }

    @JavascriptInterface
    public final boolean isDarkTheme() {
        return this.darkTheme;
    }

    @JavascriptInterface
    public final void onMuscleClicked(String muscleId) {
        final Function1<? super String, Unit> function1;
        Intrinsics.checkNotNullParameter(muscleId, "muscleId");
        final String obj = StringsKt.trim((CharSequence) muscleId).toString();
        if (obj.length() == 0 || (function1 = this.muscleClickHandler) == null) {
            return;
        }
        this.mainHandler.post(new Runnable() { // from class: com.example.rungps.ui.components.MuscleAtlasBridge$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                Function1.this.invoke(obj);
            }
        });
    }

    @JavascriptInterface
    public final void onAtlasHeight(double heightPx) {
        final int coerceIn = RangesKt.coerceIn((int) heightPx, 80, 900);
        final Function1<? super Integer, Unit> function1 = this.heightReadyHandler;
        if (function1 == null) {
            return;
        }
        this.mainHandler.post(new Runnable() { // from class: com.example.rungps.ui.components.MuscleAtlasBridge$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                MuscleAtlasBridge.onAtlasHeight$lambda$1(Function1.this, coerceIn);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAtlasHeight$lambda$1(Function1 function1, int i) {
        function1.invoke(Integer.valueOf(i));
    }
}
