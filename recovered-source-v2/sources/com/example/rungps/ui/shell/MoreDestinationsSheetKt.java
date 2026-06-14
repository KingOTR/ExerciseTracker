package com.example.rungps.ui.shell;

import android.content.Context;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.navigation.NavController;
import com.example.rungps.ui.sport.SportTrackingPrefs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.maplibre.android.style.layers.Property;

/* compiled from: MoreDestinationsSheet.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"MoreDestinationsSheet", "", Property.VISIBLE, "", "navController", "Landroidx/navigation/NavController;", "onDismiss", "Lkotlin/Function0;", "(ZLandroidx/navigation/NavController;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_sideload"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MoreDestinationsSheetKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreDestinationsSheet$lambda$0(boolean z, NavController navController, Function0 function0, int i, Composer composer, int i2) {
        MoreDestinationsSheet(z, navController, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MoreDestinationsSheet$lambda$1(boolean z, NavController navController, Function0 function0, int i, Composer composer, int i2) {
        MoreDestinationsSheet(z, navController, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void MoreDestinationsSheet(final boolean z, final NavController navController, final Function0<Unit> onDismiss, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer startRestartGroup = composer.startRestartGroup(-1988112625);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(navController) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(onDismiss) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1988112625, i2, -1, "com.example.rungps.ui.shell.MoreDestinationsSheet (MoreDestinationsSheet.kt:31)");
            }
            SheetState rememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, startRestartGroup, 6, 2);
            if (!z) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.shell.MoreDestinationsSheetKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit MoreDestinationsSheet$lambda$0;
                            MoreDestinationsSheet$lambda$0 = MoreDestinationsSheetKt.MoreDestinationsSheet$lambda$0(z, navController, onDismiss, i, (Composer) obj, ((Integer) obj2).intValue());
                            return MoreDestinationsSheet$lambda$0;
                        }
                    });
                    return;
                }
                return;
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            composer2 = startRestartGroup;
            ModalBottomSheetKt.m1925ModalBottomSheetdYc4hso(onDismiss, null, rememberModalBottomSheetState, 0.0f, null, 0L, 0L, 0.0f, 0L, null, null, null, ComposableLambdaKt.rememberComposableLambda(823935378, true, new MoreDestinationsSheetKt$MoreDestinationsSheet$2(navController, onDismiss, SportTrackingPrefs.INSTANCE.displayName((Context) consume)), startRestartGroup, 54), composer2, (i2 >> 6) & 14, 384, 4090);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup2 = composer2.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.updateScope(new Function2() { // from class: com.example.rungps.ui.shell.MoreDestinationsSheetKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MoreDestinationsSheet$lambda$1;
                    MoreDestinationsSheet$lambda$1 = MoreDestinationsSheetKt.MoreDestinationsSheet$lambda$1(z, navController, onDismiss, i, (Composer) obj, ((Integer) obj2).intValue());
                    return MoreDestinationsSheet$lambda$1;
                }
            });
        }
    }
}
