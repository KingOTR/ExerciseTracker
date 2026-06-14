package com.example.rungps.ui.gym;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.health.platform.client.SdkConfig;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GymSetLoggedTime.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\u001a\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a5\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001a7\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\fH\u0003¢\u0006\u0002\u0010\u0015\"\u0018\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0003¨\u0006\u0016²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\u0012\u0010\u0019\u001a\n \u0002*\u0004\u0018\u00010\u00050\u0005X\u008a\u008e\u0002"}, d2 = {"timeFmt", "Ljava/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "Ljava/time/format/DateTimeFormatter;", "formatSetLoggedAt", "", "ms", "", "GymSetLoggedTimeLabel", "", "loggedAtMs", "onTimeChosen", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SetTimeEditDialog", "initialMs", "onDismiss", "Lkotlin/Function0;", "onSave", "(JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "app_sideload", "showEdit", "", "text"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymSetLoggedTimeKt {
    private static final DateTimeFormatter timeFmt = DateTimeFormatter.ofPattern("h:mm a", Locale.US);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GymSetLoggedTimeLabel$lambda$0(Long l, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GymSetLoggedTimeLabel(l, function1, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GymSetLoggedTimeLabel$lambda$10(Long l, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GymSetLoggedTimeLabel(l, function1, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SetTimeEditDialog$lambda$14(long j, Function0 function0, Function1 function1, int i, Composer composer, int i2) {
        SetTimeEditDialog(j, function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final String formatSetLoggedAt(long j) {
        String format = LocalDateTime.ofInstant(Instant.ofEpochMilli(j), ZoneId.systemDefault()).format(timeFmt);
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GymSetLoggedTimeLabel(final Long l, final Function1<? super Long, Unit> onTimeChosen, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        Intrinsics.checkNotNullParameter(onTimeChosen, "onTimeChosen");
        Composer startRestartGroup = composer.startRestartGroup(2055802373);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(l) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(onTimeChosen) ? 32 : 16;
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
                    ComposerKt.traceEventStart(2055802373, i3, -1, "com.example.rungps.ui.gym.GymSetLoggedTimeLabel (GymSetLoggedTime.kt:30)");
                }
                if (l != null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        final Modifier modifier4 = modifier3;
                        endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.gym.GymSetLoggedTimeKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit GymSetLoggedTimeLabel$lambda$0;
                                GymSetLoggedTimeLabel$lambda$0 = GymSetLoggedTimeKt.GymSetLoggedTimeLabel$lambda$0(l, onTimeChosen, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return GymSetLoggedTimeLabel$lambda$0;
                            }
                        });
                        return;
                    }
                    return;
                }
                startRestartGroup.startReplaceGroup(-1606608495);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final MutableState mutableState = (MutableState) rememberedValue;
                startRestartGroup.endReplaceGroup();
                String formatSetLoggedAt = formatSetLoggedAt(l.longValue());
                TextStyle labelSmall = MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall();
                long onSurfaceVariant = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant();
                startRestartGroup.startReplaceGroup(-1606600990);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function0() { // from class: com.example.rungps.ui.gym.GymSetLoggedTimeKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit GymSetLoggedTimeLabel$lambda$5$lambda$4;
                            GymSetLoggedTimeLabel$lambda$5$lambda$4 = GymSetLoggedTimeKt.GymSetLoggedTimeLabel$lambda$5$lambda$4(MutableState.this);
                            return GymSetLoggedTimeLabel$lambda$5$lambda$4;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceGroup();
                int i5 = i3;
                TextKt.m2376Text4IGK_g(formatSetLoggedAt, ClickableKt.m272clickableXHw0xAI$default(modifier3, false, null, null, (Function0) rememberedValue2, 7, null), onSurfaceVariant, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, labelSmall, startRestartGroup, 0, 0, 65528);
                if (GymSetLoggedTimeLabel$lambda$2(mutableState)) {
                    long longValue = l.longValue();
                    startRestartGroup.startReplaceGroup(-1606596701);
                    Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new Function0() { // from class: com.example.rungps.ui.gym.GymSetLoggedTimeKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit GymSetLoggedTimeLabel$lambda$7$lambda$6;
                                GymSetLoggedTimeLabel$lambda$7$lambda$6 = GymSetLoggedTimeKt.GymSetLoggedTimeLabel$lambda$7$lambda$6(MutableState.this);
                                return GymSetLoggedTimeLabel$lambda$7$lambda$6;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    Function0 function0 = (Function0) rememberedValue3;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(-1606595307);
                    boolean z = (i5 & SdkConfig.SDK_VERSION) == 32;
                    Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (z || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new Function1() { // from class: com.example.rungps.ui.gym.GymSetLoggedTimeKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit GymSetLoggedTimeLabel$lambda$9$lambda$8;
                                GymSetLoggedTimeLabel$lambda$9$lambda$8 = GymSetLoggedTimeKt.GymSetLoggedTimeLabel$lambda$9$lambda$8(Function1.this, mutableState, ((Long) obj).longValue());
                                return GymSetLoggedTimeLabel$lambda$9$lambda$8;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    startRestartGroup.endReplaceGroup();
                    SetTimeEditDialog(longValue, function0, (Function1) rememberedValue4, startRestartGroup, (i5 & 14) | 48);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
            if (endRestartGroup2 != null) {
                final Modifier modifier5 = modifier3;
                endRestartGroup2.updateScope(new Function2() { // from class: com.example.rungps.ui.gym.GymSetLoggedTimeKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit GymSetLoggedTimeLabel$lambda$10;
                        GymSetLoggedTimeLabel$lambda$10 = GymSetLoggedTimeKt.GymSetLoggedTimeLabel$lambda$10(l, onTimeChosen, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return GymSetLoggedTimeLabel$lambda$10;
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
        if (l != null) {
        }
    }

    private static final boolean GymSetLoggedTimeLabel$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void GymSetLoggedTimeLabel$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GymSetLoggedTimeLabel$lambda$5$lambda$4(MutableState mutableState) {
        GymSetLoggedTimeLabel$lambda$3(mutableState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GymSetLoggedTimeLabel$lambda$7$lambda$6(MutableState mutableState) {
        GymSetLoggedTimeLabel$lambda$3(mutableState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GymSetLoggedTimeLabel$lambda$9$lambda$8(Function1 function1, MutableState mutableState, long j) {
        function1.invoke(Long.valueOf(j));
        GymSetLoggedTimeLabel$lambda$3(mutableState, false);
        return Unit.INSTANCE;
    }

    private static final void SetTimeEditDialog(final long j, final Function0<Unit> function0, final Function1<? super Long, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(410736237);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(410736237, i2, -1, "com.example.rungps.ui.gym.SetTimeEditDialog (GymSetLoggedTime.kt:53)");
            }
            LocalDateTime ofInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(j), ZoneId.systemDefault());
            startRestartGroup.startReplaceGroup(-1163592518);
            boolean z = (i2 & 14) == 4;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ofInstant.format(DateTimeFormatter.ofPattern("HH:mm")), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            AndroidAlertDialog_androidKt.m1443AlertDialogOix01E0(function0, ComposableLambdaKt.rememberComposableLambda(1195272373, true, new GymSetLoggedTimeKt$SetTimeEditDialog$1(mutableState, ofInstant, function1), startRestartGroup, 54), null, ComposableLambdaKt.rememberComposableLambda(488675767, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.gym.GymSetLoggedTimeKt$SetTimeEditDialog$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(488675767, i3, -1, "com.example.rungps.ui.gym.SetTimeEditDialog.<anonymous> (GymSetLoggedTime.kt:81)");
                    }
                    ButtonKt.TextButton(function0, null, false, null, null, null, null, null, null, ComposableSingletons$GymSetLoggedTimeKt.INSTANCE.m7075getLambda2$app_sideload(), composer3, 805306368, 510);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), null, ComposableSingletons$GymSetLoggedTimeKt.INSTANCE.m7076getLambda3$app_sideload(), ComposableLambdaKt.rememberComposableLambda(1576264506, true, new GymSetLoggedTimeKt$SetTimeEditDialog$3(mutableState), startRestartGroup, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, composer2, ((i2 >> 3) & 14) | 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.gym.GymSetLoggedTimeKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SetTimeEditDialog$lambda$14;
                    SetTimeEditDialog$lambda$14 = GymSetLoggedTimeKt.SetTimeEditDialog$lambda$14(j, function0, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                    return SetTimeEditDialog$lambda$14;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SetTimeEditDialog$lambda$12(MutableState<String> mutableState) {
        return mutableState.getValue();
    }
}
