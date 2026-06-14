package com.example.rungps.ui.sleep;

import android.content.Context;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.profileinstaller.ProfileVerifier;
import com.example.rungps.health.HealthConnectManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HealthConnectSleepBanner.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"HealthConnectSleepBanner", "", "hc", "Lcom/example/rungps/health/HealthConnectManager;", "hasSleepPermissions", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/example/rungps/health/HealthConnectManager;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_sideload"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HealthConnectSleepBannerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HealthConnectSleepBanner$lambda$0(HealthConnectManager healthConnectManager, boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HealthConnectSleepBanner(healthConnectManager, z, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HealthConnectSleepBanner$lambda$1(HealthConnectManager healthConnectManager, boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HealthConnectSleepBanner(healthConnectManager, z, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HealthConnectSleepBanner(final HealthConnectManager hc, final boolean z, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        boolean isReady;
        long m3842copywmQWz5c$default;
        Modifier modifier4;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(hc, "hc");
        Composer startRestartGroup = composer.startRestartGroup(-1266857013);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(hc) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i3 & 147) == 146 || !startRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1266857013, i3, -1, "com.example.rungps.ui.sleep.HealthConnectSleepBanner (HealthConnectSleepBanner.kt:25)");
                }
                if (!hc.isReady() && z) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
                    if (endRestartGroup2 != null) {
                        final Modifier modifier5 = modifier3;
                        endRestartGroup2.updateScope(new Function2() { // from class: com.example.rungps.ui.sleep.HealthConnectSleepBannerKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit HealthConnectSleepBanner$lambda$0;
                                HealthConnectSleepBanner$lambda$0 = HealthConnectSleepBannerKt.HealthConnectSleepBanner$lambda$0(HealthConnectManager.this, z, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return HealthConnectSleepBanner$lambda$0;
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
                Context context = (Context) consume;
                ColorScheme colorScheme = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable);
                isReady = hc.isReady();
                boolean z2 = !isReady;
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                CardDefaults cardDefaults = CardDefaults.INSTANCE;
                if (isReady) {
                    m3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(colorScheme.getErrorContainer(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    m3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(colorScheme.getSecondaryContainer(), 0.45f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                modifier4 = modifier3;
                CardKt.Card(fillMaxWidth$default, null, cardDefaults.m1511cardColorsro_MJ88(m3842copywmQWz5c$default, 0L, 0L, 0L, startRestartGroup, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(2143333913, true, new HealthConnectSleepBannerKt$HealthConnectSleepBanner$2(z2, hc, colorScheme, context), startRestartGroup, 54), startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 26);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final Modifier modifier6 = modifier4;
                endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.sleep.HealthConnectSleepBannerKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit HealthConnectSleepBanner$lambda$1;
                        HealthConnectSleepBanner$lambda$1 = HealthConnectSleepBannerKt.HealthConnectSleepBanner$lambda$1(HealthConnectManager.this, z, modifier6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return HealthConnectSleepBanner$lambda$1;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        if (!hc.isReady()) {
        }
        ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume2 = startRestartGroup.consume(localContext2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Context context2 = (Context) consume2;
        ColorScheme colorScheme2 = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable);
        isReady = hc.isReady();
        boolean z22 = !isReady;
        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
        CardDefaults cardDefaults2 = CardDefaults.INSTANCE;
        if (isReady) {
        }
        modifier4 = modifier3;
        CardKt.Card(fillMaxWidth$default2, null, cardDefaults2.m1511cardColorsro_MJ88(m3842copywmQWz5c$default, 0L, 0L, 0L, startRestartGroup, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(2143333913, true, new HealthConnectSleepBannerKt$HealthConnectSleepBanner$2(z22, hc, colorScheme2, context2), startRestartGroup, 54), startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 26);
        if (ComposerKt.isTraceInProgress()) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
