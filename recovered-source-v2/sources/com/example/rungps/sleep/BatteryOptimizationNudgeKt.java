package com.example.rungps.sleep;

import android.content.Context;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: BatteryOptimizationNudge.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"BatteryOptimizationCard", "", "overnightActive", "", "runRecording", "modifier", "Landroidx/compose/ui/Modifier;", "(ZZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_sideload"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BatteryOptimizationNudgeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BatteryOptimizationCard$lambda$0(boolean z, boolean z2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BatteryOptimizationCard(z, z2, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BatteryOptimizationCard$lambda$1(boolean z, boolean z2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BatteryOptimizationCard(z, z2, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BatteryOptimizationCard(boolean z, boolean z2, Modifier modifier, Composer composer, final int i, final int i2) {
        boolean z3;
        int i3;
        boolean z4;
        int i4;
        Modifier modifier2;
        final boolean z5;
        Context context;
        Composer startRestartGroup = composer.startRestartGroup(1717790221);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            z3 = z;
        } else if ((i & 6) == 0) {
            z3 = z;
            i3 = (startRestartGroup.changed(z3) ? 4 : 2) | i;
        } else {
            z3 = z;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            z4 = z2;
            i3 |= startRestartGroup.changed(z4) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
                if ((i3 & 147) == 146 || !startRestartGroup.getSkipping()) {
                    if (i5 != 0) {
                        z3 = false;
                    }
                    z5 = i6 != 0 ? false : z4;
                    Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1717790221, i3, -1, "com.example.rungps.sleep.BatteryOptimizationCard (BatteryOptimizationNudge.kt:101)");
                    }
                    ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume = startRestartGroup.consume(localContext);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    context = (Context) consume;
                    if (!BatteryOptimizationNudge.INSTANCE.shouldShow(context, z3, z5)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final boolean z6 = z3;
                            final Modifier modifier4 = modifier3;
                            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.sleep.BatteryOptimizationNudgeKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit BatteryOptimizationCard$lambda$0;
                                    BatteryOptimizationCard$lambda$0 = BatteryOptimizationNudgeKt.BatteryOptimizationCard$lambda$0(z6, z5, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return BatteryOptimizationCard$lambda$0;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    ColorScheme colorScheme = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable);
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    RoundedCornerShape m967RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6303constructorimpl(16));
                    long tertiaryContainer = colorScheme.getTertiaryContainer();
                    ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-654144024, true, new BatteryOptimizationNudgeKt$BatteryOptimizationCard$2(z5, colorScheme, context), startRestartGroup, 54);
                    Modifier modifier5 = modifier3;
                    SurfaceKt.m2226SurfaceT9BRK9s(fillMaxWidth$default, m967RoundedCornerShape0680j_4, tertiaryContainer, 0L, 0.0f, 0.0f, null, rememberComposableLambda, startRestartGroup, 12582912, MenuKt.InTransitionDuration);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier5;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    z5 = z4;
                }
                ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
                if (endRestartGroup2 != null) {
                    final boolean z7 = z3;
                    final Modifier modifier6 = modifier2;
                    endRestartGroup2.updateScope(new Function2() { // from class: com.example.rungps.sleep.BatteryOptimizationNudgeKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit BatteryOptimizationCard$lambda$1;
                            BatteryOptimizationCard$lambda$1 = BatteryOptimizationNudgeKt.BatteryOptimizationCard$lambda$1(z7, z5, modifier6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return BatteryOptimizationCard$lambda$1;
                        }
                    });
                    return;
                }
                return;
            }
            modifier2 = modifier;
            if ((i3 & 147) == 146) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(localContext2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            context = (Context) consume2;
            if (!BatteryOptimizationNudge.INSTANCE.shouldShow(context, z3, z5)) {
            }
        }
        z4 = z2;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<Context> localContext22 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume22 = startRestartGroup.consume(localContext22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        context = (Context) consume22;
        if (!BatteryOptimizationNudge.INSTANCE.shouldShow(context, z3, z5)) {
        }
    }
}
