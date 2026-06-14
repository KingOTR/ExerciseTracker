package com.example.rungps.ui.main;

import android.content.Context;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.example.rungps.ble.BleClient;
import com.example.rungps.ble.BleStatus;
import com.example.rungps.data.Repository;
import com.example.rungps.data.SoccerSessionEntity;
import com.example.rungps.ui.sport.SportTrackingPrefs;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SoccerTabContent.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\u0010\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u008a\u0084\u0002²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u008e\u0002²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010\u0011\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010\u0014\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u008e\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0010X\u008a\u008e\u0002"}, d2 = {"SoccerTabContent", "", "ble", "Lcom/example/rungps/ble/BleClient;", "bleStatus", "Lcom/example/rungps/ble/BleStatus;", "onOpenWatchConnect", "Lkotlin/Function0;", "(Lcom/example/rungps/ble/BleClient;Lcom/example/rungps/ble/BleStatus;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_sideload", "sessions", "", "Lcom/example/rungps/data/SoccerSessionEntity;", "showAdd", "", "kind", "", "dateText", "warmupText", "playText", "trainingMinText", "intensity", "", "notesText"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SoccerTabContentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SoccerTabContent$lambda$37(BleClient bleClient, BleStatus bleStatus, Function0 function0, int i, Composer composer, int i2) {
        SoccerTabContent(bleClient, bleStatus, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void SoccerTabContent(final BleClient ble, final BleStatus bleStatus, final Function0<Unit> onOpenWatchConnect, Composer composer, final int i) {
        int i2;
        final MutableState mutableState;
        Object obj;
        Composer composer2;
        Intrinsics.checkNotNullParameter(ble, "ble");
        Intrinsics.checkNotNullParameter(bleStatus, "bleStatus");
        Intrinsics.checkNotNullParameter(onOpenWatchConnect, "onOpenWatchConnect");
        Composer startRestartGroup = composer.startRestartGroup(-225294742);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(ble) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(bleStatus) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(onOpenWatchConnect) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-225294742, i2, -1, "com.example.rungps.ui.main.SoccerTabContent (SoccerTabContent.kt:50)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Context context = (Context) consume;
            startRestartGroup.startReplaceGroup(-583123957);
            boolean changed = startRestartGroup.changed(context);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = Repository.INSTANCE.get(context);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Repository repository = (Repository) rememberedValue;
            startRestartGroup.endReplaceGroup();
            State collectAsState = SnapshotStateKt.collectAsState(repository.soccerSessionsFlow(), CollectionsKt.emptyList(), null, startRestartGroup, 48, 2);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue2 = compositionScopedCoroutineScopeCanceller;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue2).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.startReplaceGroup(-583118053);
            boolean changed2 = startRestartGroup.changed(context);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = SportTrackingPrefs.INSTANCE.displayName(context);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            final String str = (String) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-583115704);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            MutableState mutableState2 = (MutableState) rememberedValue4;
            startRestartGroup.endReplaceGroup();
            Object[] objArr = new Object[0];
            startRestartGroup.startReplaceGroup(-583113535);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new Function0() { // from class: com.example.rungps.ui.main.SoccerTabContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState SoccerTabContent$lambda$7$lambda$6;
                        SoccerTabContent$lambda$7$lambda$6 = SoccerTabContentKt.SoccerTabContent$lambda$7$lambda$6();
                        return SoccerTabContent$lambda$7$lambda$6;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            startRestartGroup.endReplaceGroup();
            MutableState mutableState3 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr, (Saver) null, (String) null, (Function0) rememberedValue5, startRestartGroup, 3072, 6);
            Object[] objArr2 = new Object[0];
            startRestartGroup.startReplaceGroup(-583111436);
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new Function0() { // from class: com.example.rungps.ui.main.SoccerTabContentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState SoccerTabContent$lambda$11$lambda$10;
                        SoccerTabContent$lambda$11$lambda$10 = SoccerTabContentKt.SoccerTabContent$lambda$11$lambda$10();
                        return SoccerTabContent$lambda$11$lambda$10;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            startRestartGroup.endReplaceGroup();
            MutableState mutableState4 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) rememberedValue6, startRestartGroup, 3072, 6);
            Object[] objArr3 = new Object[0];
            startRestartGroup.startReplaceGroup(-583108706);
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new Function0() { // from class: com.example.rungps.ui.main.SoccerTabContentKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState SoccerTabContent$lambda$15$lambda$14;
                        SoccerTabContent$lambda$15$lambda$14 = SoccerTabContentKt.SoccerTabContent$lambda$15$lambda$14();
                        return SoccerTabContent$lambda$15$lambda$14;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            startRestartGroup.endReplaceGroup();
            MutableState mutableState5 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr3, (Saver) null, (String) null, (Function0) rememberedValue7, startRestartGroup, 3072, 6);
            Object[] objArr4 = new Object[0];
            startRestartGroup.startReplaceGroup(-583106722);
            Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = new Function0() { // from class: com.example.rungps.ui.main.SoccerTabContentKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState SoccerTabContent$lambda$19$lambda$18;
                        SoccerTabContent$lambda$19$lambda$18 = SoccerTabContentKt.SoccerTabContent$lambda$19$lambda$18();
                        return SoccerTabContent$lambda$19$lambda$18;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            startRestartGroup.endReplaceGroup();
            MutableState mutableState6 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr4, (Saver) null, (String) null, (Function0) rememberedValue8, startRestartGroup, 3072, 6);
            Object[] objArr5 = new Object[0];
            startRestartGroup.startReplaceGroup(-583104514);
            Object rememberedValue9 = startRestartGroup.rememberedValue();
            if (rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                rememberedValue9 = new Function0() { // from class: com.example.rungps.ui.main.SoccerTabContentKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState SoccerTabContent$lambda$23$lambda$22;
                        SoccerTabContent$lambda$23$lambda$22 = SoccerTabContentKt.SoccerTabContent$lambda$23$lambda$22();
                        return SoccerTabContent$lambda$23$lambda$22;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue9);
            }
            startRestartGroup.endReplaceGroup();
            MutableState mutableState7 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr5, (Saver) null, (String) null, (Function0) rememberedValue9, startRestartGroup, 3072, 6);
            Object[] objArr6 = new Object[0];
            startRestartGroup.startReplaceGroup(-583102501);
            Object rememberedValue10 = startRestartGroup.rememberedValue();
            if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                rememberedValue10 = new Function0() { // from class: com.example.rungps.ui.main.SoccerTabContentKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState SoccerTabContent$lambda$27$lambda$26;
                        SoccerTabContent$lambda$27$lambda$26 = SoccerTabContentKt.SoccerTabContent$lambda$27$lambda$26();
                        return SoccerTabContent$lambda$27$lambda$26;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue10);
            }
            startRestartGroup.endReplaceGroup();
            MutableState mutableState8 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr6, (Saver) null, (String) null, (Function0) rememberedValue10, startRestartGroup, 3072, 6);
            Object[] objArr7 = new Object[0];
            startRestartGroup.startReplaceGroup(-583100580);
            Object rememberedValue11 = startRestartGroup.rememberedValue();
            if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                rememberedValue11 = new Function0() { // from class: com.example.rungps.ui.main.SoccerTabContentKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState SoccerTabContent$lambda$31$lambda$30;
                        SoccerTabContent$lambda$31$lambda$30 = SoccerTabContentKt.SoccerTabContent$lambda$31$lambda$30();
                        return SoccerTabContent$lambda$31$lambda$30;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue11);
            }
            startRestartGroup.endReplaceGroup();
            MutableState mutableState9 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr7, (Saver) null, (String) null, (Function0) rememberedValue11, startRestartGroup, 3072, 6);
            startRestartGroup.startReplaceGroup(-583087214);
            if (SoccerTabContent$lambda$4(mutableState2)) {
                startRestartGroup.startReplaceGroup(-583089799);
                Object rememberedValue12 = startRestartGroup.rememberedValue();
                if (rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                    mutableState = mutableState2;
                    rememberedValue12 = new Function0() { // from class: com.example.rungps.ui.main.SoccerTabContentKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit SoccerTabContent$lambda$36$lambda$35;
                            SoccerTabContent$lambda$36$lambda$35 = SoccerTabContentKt.SoccerTabContent$lambda$36$lambda$35(MutableState.this);
                            return SoccerTabContent$lambda$36$lambda$35;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue12);
                } else {
                    mutableState = mutableState2;
                }
                startRestartGroup.endReplaceGroup();
                obj = null;
                AndroidAlertDialog_androidKt.m1443AlertDialogOix01E0((Function0) rememberedValue12, ComposableLambdaKt.rememberComposableLambda(1941314493, true, new SoccerTabContentKt$SoccerTabContent$2(mutableState4, context, mutableState3, mutableState7, mutableState5, mutableState6, coroutineScope, repository, mutableState8, mutableState9, str, mutableState), startRestartGroup, 54), null, ComposableLambdaKt.rememberComposableLambda(-1943042437, true, new SoccerTabContentKt$SoccerTabContent$3(mutableState), startRestartGroup, 54), null, ComposableLambdaKt.rememberComposableLambda(-1532432071, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.SoccerTabContentKt$SoccerTabContent$4
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
                            ComposerKt.traceEventStart(-1532432071, i3, -1, "com.example.rungps.ui.main.SoccerTabContent.<anonymous> (SoccerTabContent.kt:77)");
                        }
                        TextKt.m2376Text4IGK_g("Log " + str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(820356760, true, new SoccerTabContentKt$SoccerTabContent$5(mutableState4, mutableState7, mutableState5, mutableState6, mutableState8, mutableState9, mutableState3), startRestartGroup, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, startRestartGroup, 1772598, 0, 16276);
            } else {
                mutableState = mutableState2;
                obj = null;
            }
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, obj), null, CardDefaults.INSTANCE.m1511cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, startRestartGroup, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-1890805668, true, new SoccerTabContentKt$SoccerTabContent$6(bleStatus, onOpenWatchConnect, str, mutableState, ble, context, collectAsState, coroutineScope, repository), composer2, 54), composer2, 196614, 26);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.main.SoccerTabContentKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Unit SoccerTabContent$lambda$37;
                    SoccerTabContent$lambda$37 = SoccerTabContentKt.SoccerTabContent$lambda$37(BleClient.this, bleStatus, onOpenWatchConnect, i, (Composer) obj2, ((Integer) obj3).intValue());
                    return SoccerTabContent$lambda$37;
                }
            });
        }
    }

    private static final boolean SoccerTabContent$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SoccerTabContent$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState SoccerTabContent$lambda$7$lambda$6() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("MATCH", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SoccerTabContent$lambda$8(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState SoccerTabContent$lambda$11$lambda$10() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(LocalDate.now().toString(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SoccerTabContent$lambda$12(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState SoccerTabContent$lambda$15$lambda$14() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("15", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SoccerTabContent$lambda$16(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState SoccerTabContent$lambda$19$lambda$18() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("60", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SoccerTabContent$lambda$20(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState SoccerTabContent$lambda$23$lambda$22() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("60", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SoccerTabContent$lambda$24(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState SoccerTabContent$lambda$27$lambda$26() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(7, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int SoccerTabContent$lambda$28(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SoccerTabContent$lambda$29(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState SoccerTabContent$lambda$31$lambda$30() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SoccerTabContent$lambda$32(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long SoccerTabContent$parseDateToMs(String str) {
        Object m7905constructorimpl;
        ZoneId systemDefault = ZoneId.systemDefault();
        try {
            Result.Companion companion = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(Long.valueOf(LocalDate.parse(StringsKt.trim((CharSequence) str).toString()).atStartOfDay(systemDefault).toInstant().toEpochMilli()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
            m7905constructorimpl = null;
        }
        return (Long) m7905constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SoccerTabContent$lambda$36$lambda$35(MutableState mutableState) {
        SoccerTabContent$lambda$5(mutableState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<SoccerSessionEntity> SoccerTabContent$lambda$1(State<? extends List<SoccerSessionEntity>> state) {
        return state.getValue();
    }
}
