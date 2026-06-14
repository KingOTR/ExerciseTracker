package com.example.rungps.ui.sleep;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.profileinstaller.ProfileVerifier;
import com.example.rungps.AppBranding;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.data.SleepSoundEventEntity;
import com.example.rungps.health.SleepScoring;
import com.example.rungps.sleep.SleepHypnogramDisplay;
import com.example.rungps.sleep.SleepNightAnalytics;
import com.example.rungps.sleep.SleepNightInsights;
import com.example.rungps.sleep.SleepScoreConfidence;
import com.google.firebase.firestore.model.Values;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SleepNightDetailSheet.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001aO\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bH\u0007¢\u0006\u0002\u0010\t\u001aQ\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u000e\u001a\u001d\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0002\u0010\u0013¨\u0006\u0014²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u008e\u0002²\u0006\u0012\u0010\u0017\u001a\n \u0018*\u0004\u0018\u00010\u00110\u0011X\u008a\u008e\u0002²\u0006\f\u0010\u0019\u001a\u0004\u0018\u00010\u0011X\u008a\u008e\u0002²\u0006\u0010\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u008a\u008e\u0002²\u0006\f\u0010\u001d\u001a\u0004\u0018\u00010\u0011X\u008a\u008e\u0002²\u0006\n\u0010\u001e\u001a\u00020\u0016X\u008a\u008e\u0002"}, d2 = {"SleepNightDetailSheet", "", "entry", "Lcom/example/rungps/data/SleepEntryEntity;", "onDismiss", "Lkotlin/Function0;", "onDelete", "onUpdate", "Lkotlin/Function1;", "(Lcom/example/rungps/data/SleepEntryEntity;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "SleepNightDetailSheetContent", "e", "sheetState", "Landroidx/compose/material3/SheetState;", "(Lcom/example/rungps/data/SleepEntryEntity;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/SheetState;Landroidx/compose/runtime/Composer;I)V", "StatLine", "label", "", Values.VECTOR_MAP_VECTORS_KEY, "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "app_sideload", "editingWake", "", "wakeText", "kotlin.jvm.PlatformType", "wakeEditError", "soundEvents", "", "Lcom/example/rungps/data/SleepSoundEventEntity;", "soundError", "soundBusy"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepNightDetailSheetKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepNightDetailSheet$lambda$0(SleepEntryEntity sleepEntryEntity, Function0 function0, Function0 function02, Function1 function1, int i, int i2, Composer composer, int i3) {
        SleepNightDetailSheet(sleepEntryEntity, function0, function02, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepNightDetailSheet$lambda$1(SleepEntryEntity sleepEntryEntity, Function0 function0, Function0 function02, Function1 function1, int i, int i2, Composer composer, int i3) {
        SleepNightDetailSheet(sleepEntryEntity, function0, function02, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepNightDetailSheetContent$lambda$24(SleepEntryEntity sleepEntryEntity, Function0 function0, Function0 function02, Function1 function1, SheetState sheetState, int i, Composer composer, int i2) {
        SleepNightDetailSheetContent(sleepEntryEntity, function0, function02, function1, sheetState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StatLine$lambda$26(String str, String str2, int i, Composer composer, int i2) {
        StatLine(str, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SleepNightDetailSheet(final SleepEntryEntity sleepEntryEntity, final Function0<Unit> onDismiss, Function0<Unit> function0, Function1<? super SleepEntryEntity, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function02;
        int i4;
        Function1<? super SleepEntryEntity, Unit> function12;
        final Function0<Unit> function03;
        final Function1<? super SleepEntryEntity, Unit> function13;
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer startRestartGroup = composer.startRestartGroup(-1206442120);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(sleepEntryEntity) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(onDismiss) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            function02 = function0;
            i3 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                function12 = function1;
                i3 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
                if ((i3 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                    Function0<Unit> function04 = i5 != 0 ? null : function02;
                    Function1<? super SleepEntryEntity, Unit> function14 = i4 != 0 ? null : function12;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1206442120, i3, -1, "com.example.rungps.ui.sleep.SleepNightDetailSheet (SleepNightDetailSheet.kt:62)");
                    }
                    SheetState rememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, startRestartGroup, 6, 2);
                    if (sleepEntryEntity == null) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final Function0<Unit> function05 = function04;
                            final Function1<? super SleepEntryEntity, Unit> function15 = function14;
                            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.sleep.SleepNightDetailSheetKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit SleepNightDetailSheet$lambda$0;
                                    SleepNightDetailSheet$lambda$0 = SleepNightDetailSheetKt.SleepNightDetailSheet$lambda$0(SleepEntryEntity.this, onDismiss, function05, function15, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return SleepNightDetailSheet$lambda$0;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    startRestartGroup.startMovableGroup(-60805730, Long.valueOf(sleepEntryEntity.getId()));
                    SleepNightDetailSheetContent(sleepEntryEntity, onDismiss, function04, function14, rememberModalBottomSheetState, startRestartGroup, i3 & 8176);
                    startRestartGroup.endMovableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function03 = function04;
                    function13 = function14;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    function03 = function02;
                    function13 = function12;
                }
                ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
                if (endRestartGroup2 != null) {
                    endRestartGroup2.updateScope(new Function2() { // from class: com.example.rungps.ui.sleep.SleepNightDetailSheetKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit SleepNightDetailSheet$lambda$1;
                            SleepNightDetailSheet$lambda$1 = SleepNightDetailSheetKt.SleepNightDetailSheet$lambda$1(SleepEntryEntity.this, onDismiss, function03, function13, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return SleepNightDetailSheet$lambda$1;
                        }
                    });
                    return;
                }
                return;
            }
            function12 = function1;
            if ((i3 & 1171) == 1170) {
            }
            if (i5 != 0) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            SheetState rememberModalBottomSheetState2 = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, startRestartGroup, 6, 2);
            if (sleepEntryEntity == null) {
            }
        }
        function02 = function0;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function12 = function1;
        if ((i3 & 1171) == 1170) {
        }
        if (i5 != 0) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        SheetState rememberModalBottomSheetState22 = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, startRestartGroup, 6, 2);
        if (sleepEntryEntity == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x03d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void SleepNightDetailSheetContent(final SleepEntryEntity sleepEntryEntity, final Function0<Unit> function0, final Function0<Unit> function02, final Function1<? super SleepEntryEntity, Unit> function1, final SheetState sheetState, Composer composer, final int i) {
        int i2;
        String source;
        boolean z;
        boolean changed;
        Object rememberedValue;
        boolean changed2;
        Object rememberedValue2;
        MutableState mutableState;
        boolean changed3;
        Object rememberedValue3;
        MutableState mutableState2;
        boolean changed4;
        Object rememberedValue4;
        int i3;
        MutableState mutableState3;
        Long valueOf;
        boolean changed5;
        Object rememberedValue5;
        Long l;
        MutableState mutableState4;
        MutableState mutableState5;
        MutableState mutableState6;
        Context context;
        int i4;
        ZoneId zoneId;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1114041399);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(sleepEntryEntity) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(sheetState) ? 16384 : 8192;
        }
        int i5 = i2;
        if ((i5 & 9363) != 9362 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1114041399, i5, -1, "com.example.rungps.ui.sleep.SleepNightDetailSheetContent (SleepNightDetailSheet.kt:78)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Context context2 = (Context) consume;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue6 = compositionScopedCoroutineScopeCanceller;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue6).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.startReplaceGroup(-951642174);
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = ZoneId.systemDefault();
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            ZoneId zoneId2 = (ZoneId) rememberedValue7;
            startRestartGroup.endReplaceGroup();
            long id = sleepEntryEntity.getId();
            startRestartGroup.startReplaceGroup(-951640281);
            boolean changed6 = startRestartGroup.changed(id);
            Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (changed6 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            MutableState mutableState7 = (MutableState) rememberedValue8;
            startRestartGroup.endReplaceGroup();
            long id2 = sleepEntryEntity.getId();
            startRestartGroup.startReplaceGroup(-951638232);
            boolean changed7 = startRestartGroup.changed(id2);
            Object rememberedValue9 = startRestartGroup.rememberedValue();
            if (changed7 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                rememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Instant.ofEpochMilli(sleepEntryEntity.getEndTimeMs()).atZone(zoneId2).format(SleepFormattersKt.getSleepAmPmFmt()), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue9);
            }
            MutableState mutableState8 = (MutableState) rememberedValue9;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-951633111);
            Object rememberedValue10 = startRestartGroup.rememberedValue();
            if (rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                rememberedValue10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue10);
            }
            MutableState mutableState9 = (MutableState) rememberedValue10;
            startRestartGroup.endReplaceGroup();
            SleepNightInsights insights = SleepNightAnalytics.INSTANCE.insights(sleepEntryEntity);
            SleepScoreConfidence.Snapshot forEntry = SleepScoreConfidence.INSTANCE.forEntry(sleepEntryEntity);
            if (SleepScoring.INSTANCE.isSleepCycleSource(sleepEntryEntity.getSource())) {
                source = "Sleep Cycle";
            } else if (SleepScoring.INSTANCE.isOvernightSource(sleepEntryEntity.getSource())) {
                source = AppBranding.OVERNIGHT_SOURCE_LABEL;
            } else {
                source = StringsKt.equals(sleepEntryEntity.getSource(), "health_connect", true) ? "Health Connect" : sleepEntryEntity.getSource();
            }
            String str = source;
            String hypnogramCompact = sleepEntryEntity.getHypnogramCompact();
            if (hypnogramCompact == null || StringsKt.isBlank(hypnogramCompact)) {
                List listOfNotNull = CollectionsKt.listOfNotNull((Object[]) new Integer[]{sleepEntryEntity.getDeepSleepMin(), sleepEntryEntity.getLightSleepMin(), sleepEntryEntity.getRemSleepMin(), sleepEntryEntity.getAwakeSleepMin()});
                if (!(listOfNotNull instanceof Collection) || !listOfNotNull.isEmpty()) {
                    Iterator it = listOfNotNull.iterator();
                    while (it.hasNext()) {
                        if (((Number) it.next()).intValue() > 0) {
                        }
                    }
                }
                z = false;
                long id3 = sleepEntryEntity.getId();
                Object hypnogramCompact2 = sleepEntryEntity.getHypnogramCompact();
                Object notes = sleepEntryEntity.getNotes();
                Object eventMarkersCompact = sleepEntryEntity.getEventMarkersCompact();
                startRestartGroup.startReplaceGroup(-951613676);
                changed = startRestartGroup.changed(id3) | startRestartGroup.changed(hypnogramCompact2) | startRestartGroup.changed(notes) | startRestartGroup.changed(eventMarkersCompact);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = SleepHypnogramDisplay.INSTANCE.chartMeta(sleepEntryEntity);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                SleepHypnogramDisplay.ChartMeta chartMeta = (SleepHypnogramDisplay.ChartMeta) rememberedValue;
                startRestartGroup.endReplaceGroup();
                long id4 = sleepEntryEntity.getId();
                startRestartGroup.startReplaceGroup(-951609206);
                changed2 = startRestartGroup.changed(id4);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                    startRestartGroup.updateRememberedValue(mutableStateOf$default);
                    rememberedValue2 = mutableStateOf$default;
                }
                mutableState = (MutableState) rememberedValue2;
                startRestartGroup.endReplaceGroup();
                long id5 = sleepEntryEntity.getId();
                startRestartGroup.startReplaceGroup(-951606097);
                changed3 = startRestartGroup.changed(id5);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    Object mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    startRestartGroup.updateRememberedValue(mutableStateOf$default2);
                    rememberedValue3 = mutableStateOf$default2;
                }
                mutableState2 = (MutableState) rememberedValue3;
                startRestartGroup.endReplaceGroup();
                long id6 = sleepEntryEntity.getId();
                startRestartGroup.startReplaceGroup(-951603865);
                changed4 = startRestartGroup.changed(id6);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changed4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    i3 = 0;
                    rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                } else {
                    i3 = 0;
                }
                mutableState3 = (MutableState) rememberedValue4;
                startRestartGroup.endReplaceGroup();
                valueOf = Long.valueOf(sleepEntryEntity.getId());
                startRestartGroup.startReplaceGroup(-951601373);
                changed5 = startRestartGroup.changed(mutableState2) | startRestartGroup.changed(mutableState3) | startRestartGroup.changedInstance(context2) | startRestartGroup.changedInstance(sleepEntryEntity) | startRestartGroup.changed(mutableState);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!changed5 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    l = valueOf;
                    mutableState4 = mutableState3;
                    mutableState5 = mutableState2;
                    mutableState6 = mutableState;
                    context = context2;
                    i4 = i3;
                    zoneId = zoneId2;
                    rememberedValue5 = (Function2) new SleepNightDetailSheetKt$SleepNightDetailSheetContent$1$1(mutableState2, mutableState3, context2, sleepEntryEntity, mutableState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                } else {
                    l = valueOf;
                    mutableState4 = mutableState3;
                    mutableState5 = mutableState2;
                    mutableState6 = mutableState;
                    context = context2;
                    i4 = i3;
                    zoneId = zoneId2;
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(l, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, startRestartGroup, i4);
                composer2 = startRestartGroup;
                ModalBottomSheetKt.m1925ModalBottomSheetdYc4hso(function0, null, sheetState, 0.0f, null, 0L, 0L, 0.0f, 0L, null, null, null, ComposableLambdaKt.rememberComposableLambda(1793201684, true, new SleepNightDetailSheetKt$SleepNightDetailSheetContent$2(sleepEntryEntity, str, insights, forEntry, z, chartMeta, mutableState6, mutableState4, mutableState5, zoneId, coroutineScope, context, function1, mutableState7, mutableState8, function02, mutableState9), startRestartGroup, 54), composer2, ((i5 >> 3) & 14) | ((i5 >> 6) & 896), 384, 4090);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            z = true;
            long id32 = sleepEntryEntity.getId();
            Object hypnogramCompact22 = sleepEntryEntity.getHypnogramCompact();
            Object notes2 = sleepEntryEntity.getNotes();
            Object eventMarkersCompact2 = sleepEntryEntity.getEventMarkersCompact();
            startRestartGroup.startReplaceGroup(-951613676);
            changed = startRestartGroup.changed(id32) | startRestartGroup.changed(hypnogramCompact22) | startRestartGroup.changed(notes2) | startRestartGroup.changed(eventMarkersCompact2);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = SleepHypnogramDisplay.INSTANCE.chartMeta(sleepEntryEntity);
            startRestartGroup.updateRememberedValue(rememberedValue);
            SleepHypnogramDisplay.ChartMeta chartMeta2 = (SleepHypnogramDisplay.ChartMeta) rememberedValue;
            startRestartGroup.endReplaceGroup();
            long id42 = sleepEntryEntity.getId();
            startRestartGroup.startReplaceGroup(-951609206);
            changed2 = startRestartGroup.changed(id42);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            Object mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
            startRestartGroup.updateRememberedValue(mutableStateOf$default3);
            rememberedValue2 = mutableStateOf$default3;
            mutableState = (MutableState) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            long id52 = sleepEntryEntity.getId();
            startRestartGroup.startReplaceGroup(-951606097);
            changed3 = startRestartGroup.changed(id52);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed3) {
            }
            Object mutableStateOf$default22 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            startRestartGroup.updateRememberedValue(mutableStateOf$default22);
            rememberedValue3 = mutableStateOf$default22;
            mutableState2 = (MutableState) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            long id62 = sleepEntryEntity.getId();
            startRestartGroup.startReplaceGroup(-951603865);
            changed4 = startRestartGroup.changed(id62);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed4) {
            }
            i3 = 0;
            rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue4);
            mutableState3 = (MutableState) rememberedValue4;
            startRestartGroup.endReplaceGroup();
            valueOf = Long.valueOf(sleepEntryEntity.getId());
            startRestartGroup.startReplaceGroup(-951601373);
            changed5 = startRestartGroup.changed(mutableState2) | startRestartGroup.changed(mutableState3) | startRestartGroup.changedInstance(context2) | startRestartGroup.changedInstance(sleepEntryEntity) | startRestartGroup.changed(mutableState);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (changed5) {
            }
            l = valueOf;
            mutableState4 = mutableState3;
            mutableState5 = mutableState2;
            mutableState6 = mutableState;
            context = context2;
            i4 = i3;
            zoneId = zoneId2;
            rememberedValue5 = (Function2) new SleepNightDetailSheetKt$SleepNightDetailSheetContent$1$1(mutableState2, mutableState3, context2, sleepEntryEntity, mutableState, null);
            startRestartGroup.updateRememberedValue(rememberedValue5);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(l, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue5, startRestartGroup, i4);
            composer2 = startRestartGroup;
            ModalBottomSheetKt.m1925ModalBottomSheetdYc4hso(function0, null, sheetState, 0.0f, null, 0L, 0L, 0.0f, 0L, null, null, null, ComposableLambdaKt.rememberComposableLambda(1793201684, true, new SleepNightDetailSheetKt$SleepNightDetailSheetContent$2(sleepEntryEntity, str, insights, forEntry, z, chartMeta2, mutableState6, mutableState4, mutableState5, zoneId, coroutineScope, context, function1, mutableState7, mutableState8, function02, mutableState9), startRestartGroup, 54), composer2, ((i5 >> 3) & 14) | ((i5 >> 6) & 896), 384, 4090);
            if (ComposerKt.isTraceInProgress()) {
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.sleep.SleepNightDetailSheetKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SleepNightDetailSheetContent$lambda$24;
                    SleepNightDetailSheetContent$lambda$24 = SleepNightDetailSheetKt.SleepNightDetailSheetContent$lambda$24(SleepEntryEntity.this, function0, function02, function1, sheetState, i, (Composer) obj, ((Integer) obj2).intValue());
                    return SleepNightDetailSheetContent$lambda$24;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SleepNightDetailSheetContent$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SleepNightDetailSheetContent$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SleepNightDetailSheetContent$lambda$7(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SleepNightDetailSheetContent$lambda$10(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<SleepSoundEventEntity> SleepNightDetailSheetContent$lambda$15(MutableState<List<SleepSoundEventEntity>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SleepNightDetailSheetContent$lambda$18(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SleepNightDetailSheetContent$lambda$21(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SleepNightDetailSheetContent$lambda$22(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void StatLine(final String str, final String str2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-632977398);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-632977398, i3, -1, "com.example.rungps.ui.sleep.StatLine (SleepNightDetailSheet.kt:448)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
            Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m2376Text4IGK_g(str, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), startRestartGroup, i3 & 14, 0, 65530);
            composer2 = startRestartGroup;
            TextKt.m2376Text4IGK_g(str2, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getTitleMedium(), composer2, ((i3 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.sleep.SleepNightDetailSheetKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit StatLine$lambda$26;
                    StatLine$lambda$26 = SleepNightDetailSheetKt.StatLine$lambda$26(str, str2, i, (Composer) obj, ((Integer) obj2).intValue());
                    return StatLine$lambda$26;
                }
            });
        }
    }
}
