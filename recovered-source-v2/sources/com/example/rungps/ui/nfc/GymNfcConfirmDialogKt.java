package com.example.rungps.ui.nfc;

import android.content.Context;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.example.rungps.nfc.GymNfcBattery;
import com.example.rungps.nfc.GymNfcGuard;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GymNfcConfirmDialog.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\u001au\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0002\u0010\u0010¨\u0006\u0011²\u0006\n\u0010\u0012\u001a\u00020\rX\u008a\u008e\u0002"}, d2 = {"GymNfcConfirmDialog", "", "confirmSeq", "", "prompt", "", "handledConfirmSeq", "onHandledSeq", "Lkotlin/Function1;", "onClearPrompt", "Lkotlin/Function0;", "recoveryBlocksStart", "Lkotlin/coroutines/Continuation;", "", "", "onConfirm", "(ILjava/lang/String;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_sideload", "recoveryBlocked"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymNfcConfirmDialogKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GymNfcConfirmDialog$lambda$0(int i, String str, int i2, Function1 function1, Function0 function0, Function1 function12, Function0 function02, int i3, Composer composer, int i4) {
        GymNfcConfirmDialog(i, str, i2, function1, function0, function12, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GymNfcConfirmDialog$lambda$7(int i, String str, int i2, Function1 function1, Function0 function0, Function1 function12, Function0 function02, int i3, Composer composer, int i4) {
        GymNfcConfirmDialog(i, str, i2, function1, function0, function12, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
        return Unit.INSTANCE;
    }

    public static final void GymNfcConfirmDialog(final int i, final String str, final int i2, final Function1<? super Integer, Unit> onHandledSeq, final Function0<Unit> onClearPrompt, final Function1<? super Continuation<? super Boolean>, ? extends Object> recoveryBlocksStart, final Function0<Unit> onConfirm, Composer composer, final int i3) {
        int i4;
        Composer composer2;
        Intrinsics.checkNotNullParameter(onHandledSeq, "onHandledSeq");
        Intrinsics.checkNotNullParameter(onClearPrompt, "onClearPrompt");
        Intrinsics.checkNotNullParameter(recoveryBlocksStart, "recoveryBlocksStart");
        Intrinsics.checkNotNullParameter(onConfirm, "onConfirm");
        Composer startRestartGroup = composer.startRestartGroup(-2009726399);
        if ((i3 & 6) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= startRestartGroup.changed(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(onHandledSeq) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= startRestartGroup.changedInstance(onClearPrompt) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= startRestartGroup.changedInstance(recoveryBlocksStart) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= startRestartGroup.changedInstance(onConfirm) ? 1048576 : 524288;
        }
        if ((599187 & i4) != 599186 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2009726399, i4, -1, "com.example.rungps.ui.nfc.GymNfcConfirmDialog (GymNfcConfirmDialog.kt:29)");
            }
            if (str == null || i <= i2) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.nfc.GymNfcConfirmDialogKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit GymNfcConfirmDialog$lambda$0;
                            GymNfcConfirmDialog$lambda$0 = GymNfcConfirmDialogKt.GymNfcConfirmDialog$lambda$0(i, str, i2, onHandledSeq, onClearPrompt, recoveryBlocksStart, onConfirm, i3, (Composer) obj, ((Integer) obj2).intValue());
                            return GymNfcConfirmDialog$lambda$0;
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
            final Context context = (Context) consume;
            final boolean areEqual = Intrinsics.areEqual(str, "finish");
            final boolean isAtGym = GymNfcGuard.INSTANCE.isAtGym(context);
            final boolean isPowerSave = GymNfcBattery.INSTANCE.isPowerSave(context);
            startRestartGroup.startReplaceGroup(-652453721);
            int i5 = i4 & 14;
            boolean z = i5 == 4;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final MutableState mutableState = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            Integer valueOf = Integer.valueOf(i);
            Boolean valueOf2 = Boolean.valueOf(areEqual);
            startRestartGroup.startReplaceGroup(-652450851);
            boolean changed = startRestartGroup.changed(mutableState) | startRestartGroup.changed(areEqual) | startRestartGroup.changedInstance(recoveryBlocksStart);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (Function2) new GymNfcConfirmDialogKt$GymNfcConfirmDialog$2$1(areEqual, recoveryBlocksStart, mutableState, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf, valueOf2, (Function2) rememberedValue2, startRestartGroup, i5);
            startRestartGroup.startReplaceGroup(-652446235);
            boolean z2 = ((i4 & 7168) == 2048) | (i5 == 4) | ((i4 & 57344) == 16384);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function0() { // from class: com.example.rungps.ui.nfc.GymNfcConfirmDialogKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit GymNfcConfirmDialog$lambda$6$lambda$5;
                        GymNfcConfirmDialog$lambda$6$lambda$5 = GymNfcConfirmDialogKt.GymNfcConfirmDialog$lambda$6$lambda$5(Function1.this, i, onClearPrompt);
                        return GymNfcConfirmDialog$lambda$6$lambda$5;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            AndroidAlertDialog_androidKt.m1443AlertDialogOix01E0((Function0) rememberedValue3, ComposableLambdaKt.rememberComposableLambda(-1486243191, true, new GymNfcConfirmDialogKt$GymNfcConfirmDialog$4(onHandledSeq, i, onClearPrompt, context, areEqual, onConfirm), composer2, 54), null, ComposableLambdaKt.rememberComposableLambda(1400998155, true, new GymNfcConfirmDialogKt$GymNfcConfirmDialog$5(onHandledSeq, i, onClearPrompt), composer2, 54), null, ComposableLambdaKt.rememberComposableLambda(-6727795, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.nfc.GymNfcConfirmDialogKt$GymNfcConfirmDialog$6
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i6) {
                    if ((i6 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-6727795, i6, -1, "com.example.rungps.ui.nfc.GymNfcConfirmDialog.<anonymous> (GymNfcConfirmDialog.kt:44)");
                    }
                    TextKt.m2376Text4IGK_g(areEqual ? "Finish gym session?" : "Start gym session?", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54), ComposableLambdaKt.rememberComposableLambda(-710590770, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.nfc.GymNfcConfirmDialogKt$GymNfcConfirmDialog$7
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i6) {
                    boolean GymNfcConfirmDialog$lambda$2;
                    if ((i6 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-710590770, i6, -1, "com.example.rungps.ui.nfc.GymNfcConfirmDialog.<anonymous> (GymNfcConfirmDialog.kt:46)");
                        }
                        boolean z3 = areEqual;
                        boolean z4 = isAtGym;
                        Context context2 = context;
                        boolean z5 = isPowerSave;
                        MutableState<Boolean> mutableState2 = mutableState;
                        StringBuilder sb = new StringBuilder();
                        if (z3) {
                            sb.append("Save and close your open gym session?");
                        } else if (z4) {
                            sb.append("Start your next split day?");
                        } else {
                            String nearestGymName = GymNfcGuard.INSTANCE.nearestGymName(context2);
                            if (nearestGymName != null) {
                                sb.append("You're away from " + nearestGymName + ". Start a session anyway?");
                            } else {
                                sb.append("You're not at a saved gym location. Start a session anyway?");
                            }
                        }
                        GymNfcConfirmDialog$lambda$2 = GymNfcConfirmDialogKt.GymNfcConfirmDialog$lambda$2(mutableState2);
                        if (GymNfcConfirmDialog$lambda$2) {
                            sb.append("\n\nRecovery suggests rest today — starting hard training is not recommended.");
                        }
                        if (z5) {
                            sb.append("\n\nBattery saver is on — NFC scans less often until you turn it off.");
                        }
                        String sb2 = sb.toString();
                        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
                        TextKt.m2376Text4IGK_g(sb2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, composer2, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, composer2, 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup2 = composer2.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.updateScope(new Function2() { // from class: com.example.rungps.ui.nfc.GymNfcConfirmDialogKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit GymNfcConfirmDialog$lambda$7;
                    GymNfcConfirmDialog$lambda$7 = GymNfcConfirmDialogKt.GymNfcConfirmDialog$lambda$7(i, str, i2, onHandledSeq, onClearPrompt, recoveryBlocksStart, onConfirm, i3, (Composer) obj, ((Integer) obj2).intValue());
                    return GymNfcConfirmDialog$lambda$7;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean GymNfcConfirmDialog$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GymNfcConfirmDialog$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GymNfcConfirmDialog$lambda$6$lambda$5(Function1 function1, int i, Function0 function0) {
        function1.invoke(Integer.valueOf(i));
        function0.invoke();
        return Unit.INSTANCE;
    }
}
