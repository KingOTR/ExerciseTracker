package com.example.rungps.ui.sleep;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.data.SleepSoundEventEntity;
import com.example.rungps.sleep.SleepAnalyticsCompact;
import com.example.rungps.sleep.SleepAudioQualityClassifier;
import com.example.rungps.sleep.SleepConfidenceStaging;
import com.example.rungps.sleep.SleepCycleLineChartKt;
import com.example.rungps.sleep.SleepHypnogramDisplay;
import com.example.rungps.sleep.SleepNightInsights;
import com.example.rungps.sleep.SleepScoreConfidence;
import com.example.rungps.sleep.SleepSoundKinds;
import com.example.rungps.ui.components.TabUiKt;
import com.example.rungps.ui.components.VisualGaugeKt;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SleepNightDetailSheet.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SleepNightDetailSheetKt$SleepNightDetailSheetContent$2 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ SleepScoreConfidence.Snapshot $confidence;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ SleepEntryEntity $e;
    final /* synthetic */ MutableState<Boolean> $editingWake$delegate;
    final /* synthetic */ boolean $hasStages;
    final /* synthetic */ Function0<Unit> $onDelete;
    final /* synthetic */ Function1<SleepEntryEntity, Unit> $onUpdate;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ MutableState<Boolean> $soundBusy$delegate;
    final /* synthetic */ MutableState<String> $soundError$delegate;
    final /* synthetic */ MutableState<List<SleepSoundEventEntity>> $soundEvents$delegate;
    final /* synthetic */ String $src;
    final /* synthetic */ SleepHypnogramDisplay.ChartMeta $stageChartMeta;
    final /* synthetic */ SleepNightInsights $stats;
    final /* synthetic */ MutableState<String> $wakeEditError$delegate;
    final /* synthetic */ MutableState<String> $wakeText$delegate;
    final /* synthetic */ ZoneId $zone;

    /* JADX WARN: Multi-variable type inference failed */
    SleepNightDetailSheetKt$SleepNightDetailSheetContent$2(SleepEntryEntity sleepEntryEntity, String str, SleepNightInsights sleepNightInsights, SleepScoreConfidence.Snapshot snapshot, boolean z, SleepHypnogramDisplay.ChartMeta chartMeta, MutableState<List<SleepSoundEventEntity>> mutableState, MutableState<Boolean> mutableState2, MutableState<String> mutableState3, ZoneId zoneId, CoroutineScope coroutineScope, Context context, Function1<? super SleepEntryEntity, Unit> function1, MutableState<Boolean> mutableState4, MutableState<String> mutableState5, Function0<Unit> function0, MutableState<String> mutableState6) {
        this.$e = sleepEntryEntity;
        this.$src = str;
        this.$stats = sleepNightInsights;
        this.$confidence = snapshot;
        this.$hasStages = z;
        this.$stageChartMeta = chartMeta;
        this.$soundEvents$delegate = mutableState;
        this.$soundBusy$delegate = mutableState2;
        this.$soundError$delegate = mutableState3;
        this.$zone = zoneId;
        this.$scope = coroutineScope;
        this.$ctx = context;
        this.$onUpdate = function1;
        this.$editingWake$delegate = mutableState4;
        this.$wakeText$delegate = mutableState5;
        this.$onDelete = function0;
        this.$wakeEditError$delegate = mutableState6;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v24 ??, still in use, count: 1, list:
          (r3v24 ?? I:java.lang.Object) from 0x0132: INVOKE (r31v0 ?? I:androidx.compose.runtime.Composer), (r3v24 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:465)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public final void invoke(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v24 ??, still in use, count: 1, list:
          (r3v24 ?? I:java.lang.Object) from 0x0132: INVOKE (r31v0 ?? I:androidx.compose.runtime.Composer), (r3v24 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:465)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r30v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e6, code lost:
    
        if (r2 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit invoke$lambda$3$lambda$2(final SleepEntryEntity sleepEntryEntity, boolean z, Function1 function1, final Function0 function0, final String str, final SleepNightInsights sleepNightInsights, final SleepScoreConfidence.Snapshot snapshot, final SleepHypnogramDisplay.ChartMeta chartMeta, final MutableState mutableState, final MutableState mutableState2, final MutableState mutableState3, final ZoneId zoneId, final CoroutineScope coroutineScope, final Context context, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, LazyListScope LazyColumn) {
        List SleepNightDetailSheetContent$lambda$15;
        boolean SleepNightDetailSheetContent$lambda$21;
        String SleepNightDetailSheetContent$lambda$18;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(630985984, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) != 16 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(630985984, i, -1, "com.example.rungps.ui.sleep.SleepNightDetailSheetContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SleepNightDetailSheet.kt:127)");
                    }
                    TextKt.m2376Text4IGK_g(SleepFormattersKt.formatSleepRange$default(SleepEntryEntity.this.getStartTimeMs(), SleepEntryEntity.this.getEndTimeMs(), null, 4, null), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleLarge(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(581151721, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) != 16 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(581151721, i, -1, "com.example.rungps.ui.sleep.SleepNightDetailSheetContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SleepNightDetailSheet.kt:134)");
                    }
                    TextStyle labelMedium = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelMedium();
                    TextKt.m2376Text4IGK_g(str, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, labelMedium, composer, 0, 0, 65530);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1451973320, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$3
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) != 16 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1451973320, i, -1, "com.example.rungps.ui.sleep.SleepNightDetailSheetContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SleepNightDetailSheet.kt:141)");
                    }
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Arrangement.HorizontalOrVertical spaceEvenly = Arrangement.INSTANCE.getSpaceEvenly();
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    SleepNightInsights sleepNightInsights2 = SleepNightInsights.this;
                    SleepScoreConfidence.Snapshot snapshot2 = snapshot;
                    SleepEntryEntity sleepEntryEntity2 = sleepEntryEntity;
                    ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceEvenly, centerVertically, composer, 54);
                    ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor);
                    } else {
                        composer.useNode();
                    }
                    Composer m3336constructorimpl = Updater.m3336constructorimpl(composer);
                    Updater.m3343setimpl(m3336constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    float f = 8;
                    VisualGaugeKt.m7007ArcScoreGaugeiHT50w(sleepNightInsights2.getQuality(), 0, null, PaddingKt.m684padding3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(f)), 0.0f, "Quality", Integer.valueOf(snapshot2.getPercent()), composer, 199680, 22);
                    Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f));
                    ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer, 6);
                    ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, companion);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor2);
                    } else {
                        composer.useNode();
                    }
                    Composer m3336constructorimpl2 = Updater.m3336constructorimpl(composer);
                    Updater.m3343setimpl(m3336constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3336constructorimpl2.getInserting() || !Intrinsics.areEqual(m3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m3343setimpl(m3336constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    SleepNightDetailSheetKt.StatLine("In bed", SleepFormattersKt.formatDurationMinutes(sleepNightInsights2.getInBedMin()), composer, 6);
                    SleepNightDetailSheetKt.StatLine("Asleep", SleepFormattersKt.formatDurationMinutes(sleepNightInsights2.getAsleepMin()), composer, 6);
                    Integer efficiencyPct = sleepNightInsights2.getEfficiencyPct();
                    composer.startReplaceGroup(-461572577);
                    if (efficiencyPct != null) {
                        SleepNightDetailSheetKt.StatLine("Efficiency", efficiencyPct.intValue() + "%", composer, 6);
                    }
                    composer.endReplaceGroup();
                    Integer timeToFallAsleepMin = sleepEntryEntity2.getTimeToFallAsleepMin();
                    Integer num = (timeToFallAsleepMin == null || timeToFallAsleepMin.intValue() <= 0) ? null : timeToFallAsleepMin;
                    composer.startReplaceGroup(-461569162);
                    if (num != null) {
                        SleepNightDetailSheetKt.StatLine("Fell asleep", num.intValue() + "m", composer, 6);
                    }
                    composer.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1972172377, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$4
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) != 16 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1972172377, i, -1, "com.example.rungps.ui.sleep.SleepNightDetailSheetContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SleepNightDetailSheet.kt:163)");
                    }
                    TextKt.m2376Text4IGK_g(SleepScoreConfidence.Snapshot.this.getLabel() + " · " + SleepScoreConfidence.Snapshot.this.getDetail(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 0, 0, 65530);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }), 3, null);
        if (sleepEntryEntity.getMicCoverageRatio() != null || sleepEntryEntity.getStageConfidenceMean() != null || sleepEntryEntity.getConsistencyScore() != null) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1567631035, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$5
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) != 16 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1567631035, i, -1, "com.example.rungps.ui.sleep.SleepNightDetailSheetContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SleepNightDetailSheet.kt:171)");
                        }
                        final SleepEntryEntity sleepEntryEntity2 = SleepEntryEntity.this;
                        TabUiKt.TabSectionCard("Tracking quality (v2)", null, ComposableLambdaKt.rememberComposableLambda(1905749190, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$5.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                                invoke(columnScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(ColumnScope TabSectionCard, Composer composer2, int i2) {
                                int i3;
                                SleepAudioQualityClassifier.NightSummary quality;
                                SleepAudioQualityClassifier.NightSummary quality2;
                                Intrinsics.checkNotNullParameter(TabSectionCard, "$this$TabSectionCard");
                                if ((i2 & 17) != 16 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1905749190, i2, -1, "com.example.rungps.ui.sleep.SleepNightDetailSheetContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SleepNightDetailSheet.kt:172)");
                                    }
                                    Float micCoverageRatio = SleepEntryEntity.this.getMicCoverageRatio();
                                    composer2.startReplaceGroup(-1174471632);
                                    if (micCoverageRatio != null) {
                                        SleepNightDetailSheetKt.StatLine("Mic coverage", ((int) (micCoverageRatio.floatValue() * 100)) + "%", composer2, 6);
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    composer2.endReplaceGroup();
                                    Float stageConfidenceMean = SleepEntryEntity.this.getStageConfidenceMean();
                                    composer2.startReplaceGroup(-1174466308);
                                    if (stageConfidenceMean != null) {
                                        SleepNightDetailSheetKt.StatLine("Stage confidence", ((int) (stageConfidenceMean.floatValue() * 100)) + "% (estimated)", composer2, 6);
                                        Unit unit2 = Unit.INSTANCE;
                                    }
                                    composer2.endReplaceGroup();
                                    String sleepAnalyticsJson = SleepEntryEntity.this.getSleepAnalyticsJson();
                                    composer2.startReplaceGroup(-1174460805);
                                    boolean changed = composer2.changed(sleepAnalyticsJson);
                                    SleepEntryEntity sleepEntryEntity3 = SleepEntryEntity.this;
                                    Object rememberedValue = composer2.rememberedValue();
                                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = SleepAnalyticsCompact.INSTANCE.parse(sleepEntryEntity3.getSleepAnalyticsJson());
                                        composer2.updateRememberedValue(rememberedValue);
                                    }
                                    SleepAnalyticsCompact sleepAnalyticsCompact = (SleepAnalyticsCompact) rememberedValue;
                                    composer2.endReplaceGroup();
                                    boolean z2 = false;
                                    if (sleepAnalyticsCompact != null && (quality2 = sleepAnalyticsCompact.getQuality()) != null && !quality2.getReliable()) {
                                        z2 = true;
                                    }
                                    Float breathRateMean = SleepEntryEntity.this.getBreathRateMean();
                                    if (breathRateMean == null || breathRateMean.floatValue() <= 0.0f || z2) {
                                        breathRateMean = null;
                                    }
                                    composer2.startReplaceGroup(-1174450455);
                                    if (breathRateMean != null) {
                                        SleepNightDetailSheetKt.StatLine("Breath rate", "~" + ((int) breathRateMean.floatValue()) + " bpm", composer2, 6);
                                        Unit unit3 = Unit.INSTANCE;
                                    }
                                    composer2.endReplaceGroup();
                                    composer2.startReplaceGroup(-1174445819);
                                    if (sleepAnalyticsCompact != null && (quality = sleepAnalyticsCompact.getQuality()) != null && !quality.getReliable()) {
                                        TextKt.m2376Text4IGK_g("Respiratory rate unreliable — reposition phone away from fan and pillow.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getTertiary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getLabelSmall(), composer2, 6, 0, 65530);
                                    }
                                    composer2.endReplaceGroup();
                                    String fusionSource = SleepEntryEntity.this.getFusionSource();
                                    String str2 = (fusionSource == null || StringsKt.isBlank(fusionSource)) ? null : fusionSource;
                                    composer2.startReplaceGroup(-1174431260);
                                    if (str2 == null) {
                                        i3 = 6;
                                    } else {
                                        String replace$default = StringsKt.replace$default(str2, '_', ' ', false, 4, (Object) null);
                                        i3 = 6;
                                        SleepNightDetailSheetKt.StatLine("Fusion", replace$default, composer2, 6);
                                        Unit unit4 = Unit.INSTANCE;
                                    }
                                    composer2.endReplaceGroup();
                                    Integer consistencyScore = SleepEntryEntity.this.getConsistencyScore();
                                    if (consistencyScore == null || consistencyScore.intValue() <= 0) {
                                        consistencyScore = null;
                                    }
                                    composer2.startReplaceGroup(-1174425818);
                                    if (consistencyScore != null) {
                                        SleepNightDetailSheetKt.StatLine("Bedtime consistency", consistencyScore.intValue() + "/100", composer2, i3);
                                        Unit unit5 = Unit.INSTANCE;
                                    }
                                    composer2.endReplaceGroup();
                                    Float sleepDebtHours = SleepEntryEntity.this.getSleepDebtHours();
                                    if (sleepDebtHours == null || sleepDebtHours.floatValue() <= 0.5f) {
                                        sleepDebtHours = null;
                                    }
                                    composer2.startReplaceGroup(-1174420264);
                                    if (sleepDebtHours != null) {
                                        float floatValue = sleepDebtHours.floatValue();
                                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                        String format = String.format("%.1f h", Arrays.copyOf(new Object[]{Float.valueOf(floatValue)}, 1));
                                        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                                        SleepNightDetailSheetKt.StatLine("Sleep debt (7d)", format, composer2, i3);
                                        Unit unit6 = Unit.INSTANCE;
                                    }
                                    composer2.endReplaceGroup();
                                    String osaRiskHint = SleepEntryEntity.this.getOsaRiskHint();
                                    if (osaRiskHint == null || !Intrinsics.areEqual(osaRiskHint, "elevated")) {
                                        osaRiskHint = null;
                                    }
                                    composer2.startReplaceGroup(-1174413804);
                                    if (osaRiskHint != null) {
                                        TextKt.m2376Text4IGK_g("Elevated breathing-disturbance hint — not a medical diagnosis.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getTertiary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getLabelSmall(), composer2, 6, 0, 65530);
                                        Unit unit7 = Unit.INSTANCE;
                                    }
                                    composer2.endReplaceGroup();
                                    String osaTier = sleepAnalyticsCompact != null ? sleepAnalyticsCompact.getOsaTier() : null;
                                    if (osaTier != null) {
                                        TextKt.m2376Text4IGK_g("Multi-night wellness tier: " + osaTier + " (screening only, not AHI).", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getLabelSmall(), composer2, 0, 0, 65530);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }, composer, 54), composer, 390, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer.skipToGroupEnd();
                }
            }), 3, null);
        }
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1101350778, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$6
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1101350778, i, -1, "com.example.rungps.ui.sleep.SleepNightDetailSheetContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SleepNightDetailSheet.kt:219)");
                }
                SleepNightStatsSectionKt.SleepNightStatsSection(SleepEntryEntity.this, null, composer, 0, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        if (z) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(834106094, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$7
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) != 16 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(834106094, i, -1, "com.example.rungps.ui.sleep.SleepNightDetailSheetContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SleepNightDetailSheet.kt:224)");
                        }
                        final SleepHypnogramDisplay.ChartMeta chartMeta2 = SleepHypnogramDisplay.ChartMeta.this;
                        final SleepEntryEntity sleepEntryEntity2 = sleepEntryEntity;
                        TabUiKt.TabSectionCard("Sleep stages", null, ComposableLambdaKt.rememberComposableLambda(1562913327, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$7.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                                invoke(columnScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(ColumnScope TabSectionCard, Composer composer2, int i2) {
                                Composer composer3 = composer2;
                                Intrinsics.checkNotNullParameter(TabSectionCard, "$this$TabSectionCard");
                                if ((i2 & 17) != 16 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1562913327, i2, -1, "com.example.rungps.ui.sleep.SleepNightDetailSheetContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SleepNightDetailSheet.kt:225)");
                                    }
                                    SleepConfidenceStaging.ViewMeta confidenceView = SleepHypnogramDisplay.ChartMeta.this.getConfidenceView();
                                    composer3.startReplaceGroup(-1174379964);
                                    int i3 = 6;
                                    if (confidenceView != null) {
                                        TextKt.m2376Text4IGK_g(confidenceView.getLabel(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getLabelSmall(), composer2, 0, 0, 65530);
                                        i3 = 6;
                                        composer3 = composer2;
                                        SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(6)), composer3, 6);
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    composer2.endReplaceGroup();
                                    SleepSnoreMetricsCardKt.SleepSnoreMetricsCard(sleepEntryEntity2, null, composer3, 0, 2);
                                    SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(8)), composer3, i3);
                                    SleepCycleLineChartKt.m6922SleepCycleLineChartrpjkMjA(sleepEntryEntity2.getHypnogramCompact(), sleepEntryEntity2.getStartTimeMs(), sleepEntryEntity2.getEndTimeMs(), sleepEntryEntity2.getDeepSleepMin(), sleepEntryEntity2.getLightSleepMin(), sleepEntryEntity2.getRemSleepMin(), sleepEntryEntity2.getAwakeSleepMin(), sleepEntryEntity2.getEventMarkersCompact(), sleepEntryEntity2.getSnoreEvents(), SleepHypnogramDisplay.ChartMeta.this.isPartialTracking(), SleepHypnogramDisplay.ChartMeta.this.getMessage(), SleepChartGesturesKt.sleepChartTouchPriority(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null)), 0.0f, 0, false, composer2, 0, 0, 28672);
                                    float f = 10;
                                    SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(f)), composer2, 6);
                                    SleepDisturbanceTimelineKt.SleepDisturbanceTimeline(sleepEntryEntity2, SleepChartGesturesKt.sleepChartTouchPriority(Modifier.INSTANCE), composer2, 0, 0);
                                    SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(f)), composer2, 6);
                                    SleepBreathingDisruptionsCardKt.SleepBreathingDisruptionsCard(sleepEntryEntity2, SleepChartGesturesKt.sleepChartTouchPriority(Modifier.INSTANCE), false, composer2, 384, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }, composer, 54), composer, 390, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer.skipToGroupEnd();
                }
            }), 3, null);
        } else {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$SleepNightDetailSheetKt.INSTANCE.m7494getLambda1$app_sideload(), 3, null);
        }
        SleepNightDetailSheetContent$lambda$15 = SleepNightDetailSheetKt.SleepNightDetailSheetContent$lambda$15(mutableState);
        if (SleepNightDetailSheetContent$lambda$15.isEmpty()) {
            SleepNightDetailSheetContent$lambda$21 = SleepNightDetailSheetKt.SleepNightDetailSheetContent$lambda$21(mutableState2);
            if (!SleepNightDetailSheetContent$lambda$21) {
                SleepNightDetailSheetContent$lambda$18 = SleepNightDetailSheetKt.SleepNightDetailSheetContent$lambda$18(mutableState3);
            }
        }
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1704927693, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$8

            /* compiled from: SleepNightDetailSheet.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: com.example.rungps.ui.sleep.SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$8$1, reason: invalid class name */
            static final class AnonymousClass1 implements Function3<ColumnScope, Composer, Integer, Unit> {
                final /* synthetic */ Context $ctx;
                final /* synthetic */ CoroutineScope $scope;
                final /* synthetic */ MutableState<Boolean> $soundBusy$delegate;
                final /* synthetic */ MutableState<String> $soundError$delegate;
                final /* synthetic */ MutableState<List<SleepSoundEventEntity>> $soundEvents$delegate;
                final /* synthetic */ ZoneId $zone;

                AnonymousClass1(MutableState<String> mutableState, MutableState<List<SleepSoundEventEntity>> mutableState2, MutableState<Boolean> mutableState3, ZoneId zoneId, CoroutineScope coroutineScope, Context context) {
                    this.$soundError$delegate = mutableState;
                    this.$soundEvents$delegate = mutableState2;
                    this.$soundBusy$delegate = mutableState3;
                    this.$zone = zoneId;
                    this.$scope = coroutineScope;
                    this.$ctx = context;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
                    invoke(columnScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(ColumnScope TabSectionCard, Composer composer, int i) {
                    String SleepNightDetailSheetContent$lambda$18;
                    Composer composer2;
                    List SleepNightDetailSheetContent$lambda$15;
                    List SleepNightDetailSheetContent$lambda$152;
                    List<SleepSoundEventEntity> SleepNightDetailSheetContent$lambda$153;
                    boolean SleepNightDetailSheetContent$lambda$21;
                    boolean SleepNightDetailSheetContent$lambda$212;
                    boolean SleepNightDetailSheetContent$lambda$213;
                    String SleepNightDetailSheetContent$lambda$182;
                    boolean SleepNightDetailSheetContent$lambda$214;
                    String SleepNightDetailSheetContent$lambda$183;
                    Intrinsics.checkNotNullParameter(TabSectionCard, "$this$TabSectionCard");
                    if ((i & 17) != 16 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1861232370, i, -1, "com.example.rungps.ui.sleep.SleepNightDetailSheetContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SleepNightDetailSheet.kt:277)");
                        }
                        composer.startReplaceGroup(-1174298887);
                        SleepNightDetailSheetContent$lambda$18 = SleepNightDetailSheetKt.SleepNightDetailSheetContent$lambda$18(this.$soundError$delegate);
                        if (SleepNightDetailSheetContent$lambda$18 != null) {
                            SleepNightDetailSheetContent$lambda$183 = SleepNightDetailSheetKt.SleepNightDetailSheetContent$lambda$18(this.$soundError$delegate);
                            if (SleepNightDetailSheetContent$lambda$183 == null) {
                                SleepNightDetailSheetContent$lambda$183 = "";
                            }
                            TextKt.m2376Text4IGK_g(SleepNightDetailSheetContent$lambda$183, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 0, 0, 65530);
                            composer2 = composer;
                            SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(8)), composer2, 6);
                        } else {
                            composer2 = composer;
                        }
                        composer.endReplaceGroup();
                        composer2.startReplaceGroup(-1174285873);
                        SleepNightDetailSheetContent$lambda$15 = SleepNightDetailSheetKt.SleepNightDetailSheetContent$lambda$15(this.$soundEvents$delegate);
                        if (SleepNightDetailSheetContent$lambda$15.isEmpty()) {
                            SleepNightDetailSheetContent$lambda$214 = SleepNightDetailSheetKt.SleepNightDetailSheetContent$lambda$21(this.$soundBusy$delegate);
                            if (SleepNightDetailSheetContent$lambda$214) {
                                TextKt.m2376Text4IGK_g("Loading clips…", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodySmall(), composer, 6, 0, 65530);
                            }
                        }
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(-1174274116);
                        SleepNightDetailSheetContent$lambda$152 = SleepNightDetailSheetKt.SleepNightDetailSheetContent$lambda$15(this.$soundEvents$delegate);
                        if (SleepNightDetailSheetContent$lambda$152.isEmpty()) {
                            SleepNightDetailSheetContent$lambda$213 = SleepNightDetailSheetKt.SleepNightDetailSheetContent$lambda$21(this.$soundBusy$delegate);
                            if (!SleepNightDetailSheetContent$lambda$213) {
                                SleepNightDetailSheetContent$lambda$182 = SleepNightDetailSheetKt.SleepNightDetailSheetContent$lambda$18(this.$soundError$delegate);
                                if (SleepNightDetailSheetContent$lambda$182 == null) {
                                    TextKt.m2376Text4IGK_g("No sound clips saved for this night.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 6, 0, 65530);
                                }
                            }
                        }
                        composer.endReplaceGroup();
                        SleepNightDetailSheetContent$lambda$153 = SleepNightDetailSheetKt.SleepNightDetailSheetContent$lambda$15(this.$soundEvents$delegate);
                        ZoneId zoneId = this.$zone;
                        CoroutineScope coroutineScope = this.$scope;
                        MutableState<Boolean> mutableState = this.$soundBusy$delegate;
                        Context context = this.$ctx;
                        MutableState<List<SleepSoundEventEntity>> mutableState2 = this.$soundEvents$delegate;
                        for (final SleepSoundEventEntity sleepSoundEventEntity : SleepNightDetailSheetContent$lambda$153) {
                            String format = Instant.ofEpochMilli(sleepSoundEventEntity.getEventTimeMs()).atZone(zoneId).format(DateTimeFormatter.ofPattern("h:mm a"));
                            String label = SleepSoundKinds.INSTANCE.label(sleepSoundEventEntity.getKind());
                            SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(10)), composer, 6);
                            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                            ZoneId zoneId2 = zoneId;
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                            final CoroutineScope coroutineScope2 = coroutineScope;
                            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor);
                            } else {
                                composer.useNode();
                            }
                            Composer m3336constructorimpl = Updater.m3336constructorimpl(composer);
                            Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            final MutableState<List<SleepSoundEventEntity>> mutableState3 = mutableState2;
                            final Context context2 = context;
                            final MutableState<Boolean> mutableState4 = mutableState;
                            TextKt.m2376Text4IGK_g(label + " · " + format, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleSmall(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
                            TextKt.m2376Text4IGK_g("Intensity " + RangesKt.coerceIn((int) (sleepSoundEventEntity.getIntensity() * 100), 0, 100) + "%", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 0, 0, 65530);
                            SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(6)), composer, 6);
                            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
                            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer, 6);
                            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default2);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor2);
                            } else {
                                composer.useNode();
                            }
                            Composer m3336constructorimpl2 = Updater.m3336constructorimpl(composer);
                            Updater.m3343setimpl(m3336constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m3336constructorimpl2.getInserting() || !Intrinsics.areEqual(m3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m3343setimpl(m3336constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            composer.startReplaceGroup(-1636228773);
                            boolean changedInstance = composer.changedInstance(coroutineScope2) | composer.changed(mutableState4) | composer.changedInstance(context2) | composer.changedInstance(sleepSoundEventEntity);
                            Object rememberedValue = composer.rememberedValue();
                            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0438: CONSTRUCTOR (r1v49 'rememberedValue' java.lang.Object) = 
                                      (r17v0 'coroutineScope2' kotlinx.coroutines.CoroutineScope A[DONT_INLINE])
                                      (r28v0 'context2' android.content.Context A[DONT_INLINE])
                                      (r30v0 'mutableState4' androidx.compose.runtime.MutableState<java.lang.Boolean> A[DONT_INLINE])
                                      (r9v1 'sleepSoundEventEntity' com.example.rungps.data.SleepSoundEventEntity A[DONT_INLINE])
                                     A[MD:(kotlinx.coroutines.CoroutineScope, android.content.Context, androidx.compose.runtime.MutableState, com.example.rungps.data.SleepSoundEventEntity):void (m)] (LINE:322) call: com.example.rungps.ui.sleep.SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$8$1$$ExternalSyntheticLambda0.<init>(kotlinx.coroutines.CoroutineScope, android.content.Context, androidx.compose.runtime.MutableState, com.example.rungps.data.SleepSoundEventEntity):void type: CONSTRUCTOR in method: com.example.rungps.ui.sleep.SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$8.1.invoke(androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):void, file: classes3.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:207)
                                    	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.example.rungps.ui.sleep.SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$8$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                    	... 35 more
                                    */
                                /*
                                    Method dump skipped, instructions count: 1321
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.example.rungps.ui.sleep.SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$8.AnonymousClass1.invoke(androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):void");
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$6$lambda$5$lambda$4$lambda$1$lambda$0(CoroutineScope coroutineScope, Context context, MutableState mutableState, SleepSoundEventEntity sleepSoundEventEntity) {
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$8$1$1$1$1$1$1$1(context, mutableState, sleepSoundEventEntity, null), 3, null);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$6$lambda$5$lambda$4$lambda$3$lambda$2(CoroutineScope coroutineScope, MutableState mutableState, Context context, SleepSoundEventEntity sleepSoundEventEntity, MutableState mutableState2) {
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$8$1$1$1$1$2$1$1(mutableState, context, sleepSoundEventEntity, mutableState2, null), 3, null);
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                            invoke(lazyItemScope, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(LazyItemScope item, Composer composer, int i) {
                            Intrinsics.checkNotNullParameter(item, "$this$item");
                            if ((i & 17) != 16 || !composer.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1704927693, i, -1, "com.example.rungps.ui.sleep.SleepNightDetailSheetContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SleepNightDetailSheet.kt:276)");
                                }
                                TabUiKt.TabSectionCard("Night sounds", null, ComposableLambdaKt.rememberComposableLambda(-1861232370, true, new AnonymousClass1(mutableState3, mutableState, mutableState2, zoneId, coroutineScope, context), composer, 54), composer, 390, 2);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer.skipToGroupEnd();
                        }
                    }), 3, null);
                    if (function1 != null) {
                        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-577153268, true, new SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$9$1(mutableState4, sleepEntryEntity, zoneId, mutableState5, mutableState6, function1)), 3, null);
                    }
                    if (function0 != null) {
                        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1212405738, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$10$1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                invoke(lazyItemScope, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(LazyItemScope item, Composer composer, int i) {
                                Intrinsics.checkNotNullParameter(item, "$this$item");
                                if ((i & 17) != 16 || !composer.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1212405738, i, -1, "com.example.rungps.ui.sleep.SleepNightDetailSheetContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SleepNightDetailSheet.kt:435)");
                                    }
                                    ButtonKt.TextButton(function0, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, null, null, null, null, null, ComposableSingletons$SleepNightDetailSheetKt.INSTANCE.m7501getLambda8$app_sideload(), composer, 805306416, 508);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer.skipToGroupEnd();
                            }
                        }), 3, null);
                    }
                    return Unit.INSTANCE;
                }
            }
