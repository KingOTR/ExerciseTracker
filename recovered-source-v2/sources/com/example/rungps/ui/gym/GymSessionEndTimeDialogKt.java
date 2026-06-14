package com.example.rungps.ui.gym;

import androidx.autofill.HintConstants;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
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
import com.example.rungps.ui.sleep.SleepFormattersKt;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: GymSessionEndTimeDialog.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001af\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0010¨\u0006\u0011²\u0006\u0012\u0010\u0012\u001a\n \u0014*\u0004\u0018\u00010\u00130\u0013X\u008a\u008e\u0002²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u008e\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0016X\u008a\u008e\u0002"}, d2 = {"GymSessionEndTimeDialog", "", "startedAtMs", "", "lastSetAtMs", "initialEndAtMs", "title", "", "confirmLabel", "onConfirm", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "endedAtMs", "onDismiss", "Lkotlin/Function0;", "(JJJLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_sideload", "endDate", "Ljava/time/LocalDate;", "kotlin.jvm.PlatformType", "hour", "", "minute"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymSessionEndTimeDialogKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GymSessionEndTimeDialog$lambda$10(long j, long j2, long j3, String str, String str2, Function1 function1, Function0 function0, int i, Composer composer, int i2) {
        GymSessionEndTimeDialog(j, j2, j3, str, str2, function1, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void GymSessionEndTimeDialog(final long j, final long j2, final long j3, final String title, final String confirmLabel, final Function1<? super Long, Unit> onConfirm, final Function0<Unit> onDismiss, Composer composer, final int i) {
        int i2;
        String str;
        Composer composer2;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(confirmLabel, "confirmLabel");
        Intrinsics.checkNotNullParameter(onConfirm, "onConfirm");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer startRestartGroup = composer.startRestartGroup(1214950314);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(j2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(j3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(title) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(confirmLabel) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(onConfirm) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(onDismiss) ? 1048576 : 524288;
        }
        int i3 = i2;
        if ((599187 & i3) != 599186 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1214950314, i3, -1, "com.example.rungps.ui.gym.GymSessionEndTimeDialog (GymSessionEndTimeDialog.kt:38)");
            }
            startRestartGroup.startReplaceGroup(1408912521);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = ZoneId.systemDefault();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ZoneId zoneId = (ZoneId) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1408914366);
            int i4 = i3 & 896;
            boolean z = i4 == 256;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Instant.ofEpochMilli(j3).atZone(zoneId).toLocalDate(), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState = (MutableState) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1408918744);
            boolean z2 = i4 == 256;
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = SnapshotIntStateKt.mutableIntStateOf(Instant.ofEpochMilli(j3).atZone(zoneId).getHour());
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            MutableIntState mutableIntState = (MutableIntState) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1408923002);
            boolean z3 = i4 == 256;
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (z3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = SnapshotIntStateKt.mutableIntStateOf(Instant.ofEpochMilli(j3).atZone(zoneId).getMinute());
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            MutableIntState mutableIntState2 = (MutableIntState) rememberedValue4;
            startRestartGroup.endReplaceGroup();
            if (j2 > 0) {
                str = Instant.ofEpochMilli(j2).atZone(zoneId).format(SleepFormattersKt.getSleepAmPmFmt());
            } else {
                str = "—";
            }
            composer2 = startRestartGroup;
            AndroidAlertDialog_androidKt.m1443AlertDialogOix01E0(onDismiss, ComposableLambdaKt.rememberComposableLambda(1439098466, true, new GymSessionEndTimeDialogKt$GymSessionEndTimeDialog$1(onConfirm, j, zoneId, mutableState, mutableIntState, mutableIntState2, confirmLabel), composer2, 54), null, ComposableLambdaKt.rememberComposableLambda(2009370272, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.gym.GymSessionEndTimeDialogKt$GymSessionEndTimeDialog$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2009370272, i5, -1, "com.example.rungps.ui.gym.GymSessionEndTimeDialog.<anonymous> (GymSessionEndTimeDialog.kt:127)");
                    }
                    ButtonKt.TextButton(onDismiss, null, false, null, null, null, null, null, null, ComposableSingletons$GymSessionEndTimeDialogKt.INSTANCE.m7063getLambda1$app_sideload(), composer3, 805306368, 510);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54), null, ComposableLambdaKt.rememberComposableLambda(-1715325218, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.gym.GymSessionEndTimeDialogKt$GymSessionEndTimeDialog$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1715325218, i5, -1, "com.example.rungps.ui.gym.GymSessionEndTimeDialog.<anonymous> (GymSessionEndTimeDialog.kt:73)");
                    }
                    TextKt.m2376Text4IGK_g(title, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54), ComposableLambdaKt.rememberComposableLambda(-1430189315, true, new GymSessionEndTimeDialogKt$GymSessionEndTimeDialog$4(Instant.ofEpochMilli(j).atZone(zoneId).format(SleepFormattersKt.getSleepAmPmFmt()), str, mutableIntState, mutableIntState2, j2, j3, zoneId, mutableState, j), composer2, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, composer2, ((i3 >> 18) & 14) | 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.gym.GymSessionEndTimeDialogKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit GymSessionEndTimeDialog$lambda$10;
                    GymSessionEndTimeDialog$lambda$10 = GymSessionEndTimeDialogKt.GymSessionEndTimeDialog$lambda$10(j, j2, j3, title, confirmLabel, onConfirm, onDismiss, i, (Composer) obj, ((Integer) obj2).intValue());
                    return GymSessionEndTimeDialog$lambda$10;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocalDate GymSessionEndTimeDialog$lambda$2(MutableState<LocalDate> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int GymSessionEndTimeDialog$lambda$5(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int GymSessionEndTimeDialog$lambda$8(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GymSessionEndTimeDialog$applyEndMs(ZoneId zoneId, MutableState<LocalDate> mutableState, MutableIntState mutableIntState, MutableIntState mutableIntState2, long j) {
        ZonedDateTime atZone = Instant.ofEpochMilli(j).atZone(zoneId);
        mutableState.setValue(atZone.toLocalDate());
        mutableIntState.setIntValue(atZone.getHour());
        mutableIntState2.setIntValue(atZone.getMinute());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.time.ZonedDateTime] */
    public static final long GymSessionEndTimeDialog$buildEndMs(long j, ZoneId zoneId, MutableState<LocalDate> mutableState, MutableIntState mutableIntState, MutableIntState mutableIntState2) {
        LocalDate localDate = Instant.ofEpochMilli(j).atZone(zoneId).toLocalDate();
        LocalDate GymSessionEndTimeDialog$lambda$2 = GymSessionEndTimeDialog$lambda$2(mutableState);
        Intrinsics.checkNotNull(localDate);
        return RangesKt.coerceAtLeast(LocalDateTime.of((LocalDate) RangesKt.coerceAtLeast(GymSessionEndTimeDialog$lambda$2, localDate), LocalTime.of(GymSessionEndTimeDialog$lambda$5(mutableIntState), GymSessionEndTimeDialog$lambda$8(mutableIntState2))).atZone(zoneId).toInstant().toEpochMilli(), j);
    }
}
