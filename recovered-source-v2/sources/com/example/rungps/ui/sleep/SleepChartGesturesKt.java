package com.example.rungps.ui.sleep;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SleepChartGestures.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"sleepChartTouchPriority", "Landroidx/compose/ui/Modifier;", "sleepTimelineScrubGuard", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "sleepSliderTouchGuard", "app_sideload"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepChartGesturesKt {
    public static final Modifier sleepChartTouchPriority(Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return SuspendingPointerInputFilterKt.pointerInput(modifier, Unit.INSTANCE, new SleepChartGesturesKt$sleepChartTouchPriority$1(null));
    }

    public static final Modifier sleepTimelineScrubGuard(Modifier modifier, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        composer.startReplaceGroup(374444508);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(374444508, i, -1, "com.example.rungps.ui.sleep.sleepTimelineScrubGuard (SleepChartGestures.kt:45)");
        }
        ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localView);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final View view = (View) consume;
        composer.startReplaceGroup(-563562578);
        boolean changedInstance = composer.changedInstance(view);
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: com.example.rungps.ui.sleep.SleepChartGesturesKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    boolean sleepTimelineScrubGuard$lambda$1$lambda$0;
                    sleepTimelineScrubGuard$lambda$1$lambda$0 = SleepChartGesturesKt.sleepTimelineScrubGuard$lambda$1$lambda$0(view, (MotionEvent) obj);
                    return Boolean.valueOf(sleepTimelineScrubGuard$lambda$1$lambda$0);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        Modifier pointerInteropFilter$default = PointerInteropFilter_androidKt.pointerInteropFilter$default(modifier, null, (Function1) rememberedValue, 1, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return pointerInteropFilter$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r4 != 3) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean sleepTimelineScrubGuard$lambda$1$lambda$0(View view, MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                }
            }
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
            return false;
        }
        for (ViewParent parent2 = view.getParent(); parent2 != null; parent2 = parent2.getParent()) {
            parent2.requestDisallowInterceptTouchEvent(true);
        }
        return false;
    }

    public static final Modifier sleepSliderTouchGuard(Modifier modifier, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        composer.startReplaceGroup(-1453740340);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1453740340, i, -1, "com.example.rungps.ui.sleep.sleepSliderTouchGuard (SleepChartGestures.kt:71)");
        }
        ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localView);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final View view = (View) consume;
        composer.startReplaceGroup(859336901);
        boolean changedInstance = composer.changedInstance(view);
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function1() { // from class: com.example.rungps.ui.sleep.SleepChartGesturesKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    boolean sleepSliderTouchGuard$lambda$3$lambda$2;
                    sleepSliderTouchGuard$lambda$3$lambda$2 = SleepChartGesturesKt.sleepSliderTouchGuard$lambda$3$lambda$2(view, (MotionEvent) obj);
                    return Boolean.valueOf(sleepSliderTouchGuard$lambda$3$lambda$2);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        Modifier pointerInteropFilter$default = PointerInteropFilter_androidKt.pointerInteropFilter$default(modifier, null, (Function1) rememberedValue, 1, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return pointerInteropFilter$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean sleepSliderTouchGuard$lambda$3$lambda$2(View view, MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        } else if (actionMasked == 1 || actionMasked == 3) {
            for (ViewParent parent2 = view.getParent(); parent2 != null; parent2 = parent2.getParent()) {
                parent2.requestDisallowInterceptTouchEvent(false);
            }
        }
        return false;
    }
}
