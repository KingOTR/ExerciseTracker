package com.example.rungps.ui.sleep;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SliderKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
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
import com.example.rungps.sleep.SleepBreathingDisruptionAnalyzer;
import com.example.rungps.sleep.SleepMinuteEvent;
import com.example.rungps.ui.icons.EtIcons;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

/* compiled from: SleepBreathingDisruptionsCard.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SleepBreathingDisruptionsCardKt$SleepBreathingDisruptionsCard$3$1 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ SleepBreathingDisruptionAnalyzer.NightMetrics $breathing;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ List<SleepMinuteEvent> $disturbanceEvents;
    final /* synthetic */ SleepEntryEntity $entry;
    final /* synthetic */ List<SleepMinuteEvent> $events;
    final /* synthetic */ DateTimeFormatter $fmt;
    final /* synthetic */ int $inBedMinutes;
    final /* synthetic */ ColorScheme $scheme;
    final /* synthetic */ MutableIntState $selectedMinute$delegate;
    final /* synthetic */ long $snoreColor;
    final /* synthetic */ int $snoreMinutes;
    final /* synthetic */ long $talkColor;
    final /* synthetic */ int $talkMinutes;
    final /* synthetic */ ZoneId $zone;

    SleepBreathingDisruptionsCardKt$SleepBreathingDisruptionsCard$3$1(SleepBreathingDisruptionAnalyzer.NightMetrics nightMetrics, ColorScheme colorScheme, int i, List<SleepMinuteEvent> list, MutableIntState mutableIntState, long j, long j2, List<SleepMinuteEvent> list2, SleepEntryEntity sleepEntryEntity, ZoneId zoneId, DateTimeFormatter dateTimeFormatter, int i2, int i3, Context context) {
        this.$breathing = nightMetrics;
        this.$scheme = colorScheme;
        this.$inBedMinutes = i;
        this.$disturbanceEvents = list;
        this.$selectedMinute$delegate = mutableIntState;
        this.$snoreColor = j;
        this.$talkColor = j2;
        this.$events = list2;
        this.$entry = sleepEntryEntity;
        this.$zone = zoneId;
        this.$fmt = dateTimeFormatter;
        this.$snoreMinutes = i2;
        this.$talkMinutes = i3;
        this.$ctx = context;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0899  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0758  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(ColumnScope Card, Composer composer, int i) {
        String str;
        String str2;
        String str3;
        ColorScheme colorScheme;
        int i2;
        String str4;
        Modifier modifier;
        final MutableIntState mutableIntState;
        String str5;
        int SleepBreathingDisruptionsCard$lambda$9;
        int SleepBreathingDisruptionsCard$lambda$92;
        int SleepBreathingDisruptionsCard$lambda$93;
        boolean z;
        String str6;
        int currentCompositeKeyHash;
        Composer m3336constructorimpl;
        boolean changedInstance;
        Object rememberedValue;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1869154572, i, -1, "com.example.rungps.ui.sleep.SleepBreathingDisruptionsCard.<anonymous>.<anonymous> (SleepBreathingDisruptionsCard.kt:113)");
        }
        float f = 12;
        Modifier m684padding3ABfNKs = PaddingKt.m684padding3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(f));
        float f2 = 8;
        Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f2));
        SleepBreathingDisruptionAnalyzer.NightMetrics nightMetrics = this.$breathing;
        final ColorScheme colorScheme2 = this.$scheme;
        final int i3 = this.$inBedMinutes;
        final List<SleepMinuteEvent> list = this.$disturbanceEvents;
        MutableIntState mutableIntState2 = this.$selectedMinute$delegate;
        final long j = this.$snoreColor;
        final long j2 = this.$talkColor;
        List<SleepMinuteEvent> list2 = this.$events;
        SleepEntryEntity sleepEntryEntity = this.$entry;
        ZoneId zoneId = this.$zone;
        DateTimeFormatter dateTimeFormatter = this.$fmt;
        int i4 = this.$snoreMinutes;
        int i5 = this.$talkMinutes;
        final Context context = this.$ctx;
        ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer, 6);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m684padding3ABfNKs);
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
        Composer m3336constructorimpl2 = Updater.m3336constructorimpl(composer);
        Updater.m3343setimpl(m3336constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m3336constructorimpl2.getInserting() || !Intrinsics.areEqual(m3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash);
        }
        Updater.m3343setimpl(m3336constructorimpl2, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
        ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), composer, 6);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
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
        Composer m3336constructorimpl3 = Updater.m3336constructorimpl(composer);
        Updater.m3343setimpl(m3336constructorimpl3, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3343setimpl(m3336constructorimpl3, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m3336constructorimpl3.getInserting() || !Intrinsics.areEqual(m3336constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            m3336constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m3336constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash2);
        }
        Updater.m3343setimpl(m3336constructorimpl3, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        Arrangement.HorizontalOrVertical m564spacedBy0680j_42 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(2));
        ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_42, Alignment.INSTANCE.getStart(), composer, 6);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, companion);
        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor3);
        } else {
            composer.useNode();
        }
        Composer m3336constructorimpl4 = Updater.m3336constructorimpl(composer);
        Updater.m3343setimpl(m3336constructorimpl4, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3343setimpl(m3336constructorimpl4, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m3336constructorimpl4.getInserting() || !Intrinsics.areEqual(m3336constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            m3336constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            m3336constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash3);
        }
        Updater.m3343setimpl(m3336constructorimpl4, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        TextKt.m2376Text4IGK_g("Breathing disruptions", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleSmall(), composer, 196614, 0, 65502);
        TextKt.m2376Text4IGK_g("Screening hint only — not OSA or AHI diagnosis", (Modifier) null, colorScheme2.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 6, 0, 65530);
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
        composer.startReplaceGroup(-3068257);
        if (nightMetrics != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(nightMetrics.getDisruptionsPerHour())}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            TextKt.m2376Text4IGK_g("Disruptions/hr " + format + " · clusters " + nightMetrics.getClusterCount() + " · longest pause " + nightMetrics.getLongestPauseSec() + "s · recovery breaths " + nightMetrics.getRecoveryBreaths(), (Modifier) null, colorScheme2.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 0, 0, 65530);
            Unit unit = Unit.INSTANCE;
            Unit unit2 = Unit.INSTANCE;
        }
        composer.endReplaceGroup();
        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        Arrangement.HorizontalOrVertical m564spacedBy0680j_43 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f));
        ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m564spacedBy0680j_43, Alignment.INSTANCE.getTop(), composer, 6);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default2);
        Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor4);
        } else {
            composer.useNode();
        }
        Composer m3336constructorimpl5 = Updater.m3336constructorimpl(composer);
        Updater.m3343setimpl(m3336constructorimpl5, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3343setimpl(m3336constructorimpl5, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m3336constructorimpl5.getInserting() || !Intrinsics.areEqual(m3336constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
            m3336constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
            m3336constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash4);
        }
        Updater.m3343setimpl(m3336constructorimpl5, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
        SleepBreathingDisruptionsCardKt.m7554LegendDotIv8Zu3U(j, "Snore", composer, 48);
        SleepBreathingDisruptionsCardKt.m7554LegendDotIv8Zu3U(j2, "Voice", composer, 48);
        SleepBreathingDisruptionsCardKt.m7554LegendDotIv8Zu3U(colorScheme2.getTertiary(), "Breath pause", composer, 48);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Modifier sleepChartTouchPriority = SleepChartGesturesKt.sleepChartTouchPriority(BackgroundKt.m239backgroundbw27NRU$default(ClipKt.clip(SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6303constructorimpl(72)), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6303constructorimpl(10))), colorScheme2.getSurface(), null, 2, null));
        Integer valueOf = Integer.valueOf(i3);
        composer.startReplaceGroup(-3029930);
        boolean changed = composer.changed(mutableIntState2) | composer.changed(i3);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = (Function2) new SleepBreathingDisruptionsCardKt$SleepBreathingDisruptionsCard$3$1$1$4$1(i3, mutableIntState2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(sleepChartTouchPriority, valueOf, list, (Function2) rememberedValue2);
        composer.startReplaceGroup(-3007509);
        boolean changed2 = composer.changed(i3) | composer.changed(colorScheme2) | composer.changedInstance(list) | composer.changed(j) | composer.changed(j2) | composer.changed(mutableIntState2);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            str = "C101@5126L9:Row.kt#2w3rfo";
            str2 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
            str3 = "Snore";
            colorScheme = colorScheme2;
            i2 = 0;
            str4 = "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo";
            modifier = pointerInput;
            mutableIntState = mutableIntState2;
            str5 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
            rememberedValue3 = new Function1() { // from class: com.example.rungps.ui.sleep.SleepBreathingDisruptionsCardKt$SleepBreathingDisruptionsCard$3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$13$lambda$7$lambda$6;
                    invoke$lambda$13$lambda$7$lambda$6 = SleepBreathingDisruptionsCardKt$SleepBreathingDisruptionsCard$3$1.invoke$lambda$13$lambda$7$lambda$6(i3, colorScheme2, list, j, j2, mutableIntState, (DrawScope) obj);
                    return invoke$lambda$13$lambda$7$lambda$6;
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        } else {
            str = "C101@5126L9:Row.kt#2w3rfo";
            str4 = "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo";
            str2 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
            str3 = "Snore";
            colorScheme = colorScheme2;
            modifier = pointerInput;
            mutableIntState = mutableIntState2;
            str5 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
            i2 = 0;
        }
        composer.endReplaceGroup();
        CanvasKt.Canvas(modifier, (Function1) rememberedValue3, composer, i2);
        SleepBreathingDisruptionsCard$lambda$9 = SleepBreathingDisruptionsCardKt.SleepBreathingDisruptionsCard$lambda$9(mutableIntState);
        float f3 = SleepBreathingDisruptionsCard$lambda$9;
        ClosedFloatingPointRange<Float> rangeTo = RangesKt.rangeTo(0.0f, RangesKt.coerceAtLeast(i3 - 1, 1));
        int coerceIn = RangesKt.coerceIn(i3 / 12, i2, 48);
        Modifier sleepSliderTouchGuard = SleepChartGesturesKt.sleepSliderTouchGuard(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer, 6);
        composer.startReplaceGroup(-2919540);
        final MutableIntState mutableIntState3 = mutableIntState;
        boolean changed3 = composer.changed(mutableIntState3) | composer.changed(i3);
        Object rememberedValue4 = composer.rememberedValue();
        if (changed3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new Function1() { // from class: com.example.rungps.ui.sleep.SleepBreathingDisruptionsCardKt$SleepBreathingDisruptionsCard$3$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$13$lambda$9$lambda$8;
                    invoke$lambda$13$lambda$9$lambda$8 = SleepBreathingDisruptionsCardKt$SleepBreathingDisruptionsCard$3$1.invoke$lambda$13$lambda$9$lambda$8(i3, mutableIntState3, ((Float) obj).floatValue());
                    return invoke$lambda$13$lambda$9$lambda$8;
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        composer.endReplaceGroup();
        String str7 = str;
        String str8 = str4;
        SliderKt.Slider(f3, (Function1) rememberedValue4, sleepSliderTouchGuard, false, rangeTo, coerceIn, null, null, null, composer, 0, 456);
        SleepBreathingDisruptionsCard$lambda$92 = SleepBreathingDisruptionsCardKt.SleepBreathingDisruptionsCard$lambda$9(mutableIntState3);
        final SleepMinuteEvent sleepMinuteEvent = (SleepMinuteEvent) CollectionsKt.getOrNull(list2, RangesKt.coerceIn(SleepBreathingDisruptionsCard$lambda$92, i2, CollectionsKt.getLastIndex(list2)));
        long startTimeMs = sleepEntryEntity.getStartTimeMs();
        SleepBreathingDisruptionsCard$lambda$93 = SleepBreathingDisruptionsCardKt.SleepBreathingDisruptionsCard$lambda$9(mutableIntState3);
        long j3 = startTimeMs + (SleepBreathingDisruptionsCard$lambda$93 * 60000);
        if (sleepMinuteEvent != null) {
            z = true;
            if (sleepMinuteEvent.getSnore()) {
                str6 = str3;
                TextKt.m2376Text4IGK_g(str6 + " · " + Instant.ofEpochMilli(j3).atZone(zoneId).format(dateTimeFormatter), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
                Modifier fillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical m564spacedBy0680j_44 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f2));
                ComposerKt.sourceInformationMarkerStart(composer, 693286680, str8);
                MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(m564spacedBy0680j_44, Alignment.INSTANCE.getTop(), composer, 6);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, str5);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default3);
                Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, str2);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.useNode();
                } else {
                    composer.createNode(constructor5);
                }
                m3336constructorimpl = Updater.m3336constructorimpl(composer);
                Updater.m3343setimpl(m3336constructorimpl, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash5);
                }
                Updater.m3343setimpl(m3336constructorimpl, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -407840262, str7);
                RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                composer.startReplaceGroup(-1557014770);
                changedInstance = composer.changedInstance(context) | composer.changed(sleepMinuteEvent);
                rememberedValue = composer.rememberedValue();
                if (!changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: com.example.rungps.ui.sleep.SleepBreathingDisruptionsCardKt$SleepBreathingDisruptionsCard$3$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$13$lambda$12$lambda$11$lambda$10;
                            invoke$lambda$13$lambda$12$lambda$11$lambda$10 = SleepBreathingDisruptionsCardKt$SleepBreathingDisruptionsCard$3$1.invoke$lambda$13$lambda$12$lambda$11$lambda$10(context, sleepMinuteEvent);
                            return invoke$lambda$13$lambda$12$lambda$11$lambda$10;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                ButtonKt.OutlinedButton((Function0) rememberedValue, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1672034736, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.SleepBreathingDisruptionsCardKt$SleepBreathingDisruptionsCard$3$1$1$7$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                        invoke(rowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope OutlinedButton, Composer composer2, int i6) {
                        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
                        if ((i6 & 17) != 16 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1672034736, i6, -1, "com.example.rungps.ui.sleep.SleepBreathingDisruptionsCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SleepBreathingDisruptionsCard.kt:271)");
                            }
                            Arrangement.HorizontalOrVertical m564spacedBy0680j_45 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            SleepMinuteEvent sleepMinuteEvent2 = SleepMinuteEvent.this;
                            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            MeasurePolicy rowMeasurePolicy4 = RowKt.rowMeasurePolicy(m564spacedBy0680j_45, centerVertically, composer2, 54);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                            Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(composer2, companion2);
                            Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor6);
                            } else {
                                composer2.useNode();
                            }
                            Composer m3336constructorimpl6 = Updater.m3336constructorimpl(composer2);
                            Updater.m3343setimpl(m3336constructorimpl6, rowMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3343setimpl(m3336constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m3336constructorimpl6.getInserting() || !Intrinsics.areEqual(m3336constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                                m3336constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                                m3336constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                            }
                            Updater.m3343setimpl(m3336constructorimpl6, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
                            IconKt.m1833Iconww6aTOc(EtIcons.INSTANCE.getPlay(), "Play marker preview tone", (Modifier) null, 0L, composer2, 54, 12);
                            TextKt.m2376Text4IGK_g(((sleepMinuteEvent2 == null || !sleepMinuteEvent2.getSnore()) && (sleepMinuteEvent2 == null || !sleepMinuteEvent2.getTalk())) ? "Preview (quiet)" : "Preview disturbance", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, composer, 54), composer, 805306416, 508);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                TextKt.m2376Text4IGK_g("Preview plays a short synthesized snore or voice sample. Movement is not shown here. Scrub the chart or slider above.", (Modifier) null, colorScheme.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 6, 0, 65530);
                TextKt.m2376Text4IGK_g("Totals: " + i4 + " snore · " + i5 + " voice minutes", (Modifier) null, colorScheme.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 0, 0, 65530);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                if (ComposerKt.isTraceInProgress()) {
                    return;
                }
                ComposerKt.traceEventEnd();
                return;
            }
        } else {
            z = true;
        }
        str6 = (sleepMinuteEvent == null || sleepMinuteEvent.getBreathPause() != z) ? (sleepMinuteEvent == null || sleepMinuteEvent.getTalk() != z) ? "Quiet" : "Noise / voice" : "Breath pause";
        TextKt.m2376Text4IGK_g(str6 + " · " + Instant.ofEpochMilli(j3).atZone(zoneId).format(dateTimeFormatter), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
        Modifier fillMaxWidth$default32 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        Arrangement.HorizontalOrVertical m564spacedBy0680j_442 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f2));
        ComposerKt.sourceInformationMarkerStart(composer, 693286680, str8);
        MeasurePolicy rowMeasurePolicy32 = RowKt.rowMeasurePolicy(m564spacedBy0680j_442, Alignment.INSTANCE.getTop(), composer, 6);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, str5);
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap52 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier52 = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default32);
        Function0<ComposeUiNode> constructor52 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, str2);
        if (!(composer.getApplier() instanceof Applier)) {
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
        }
        m3336constructorimpl = Updater.m3336constructorimpl(composer);
        Updater.m3343setimpl(m3336constructorimpl, rowMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap52, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash52 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3336constructorimpl.getInserting()) {
        }
        m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash52);
        Updater.m3343setimpl(m3336constructorimpl, materializeModifier52, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -407840262, str7);
        RowScopeInstance rowScopeInstance32 = RowScopeInstance.INSTANCE;
        composer.startReplaceGroup(-1557014770);
        changedInstance = composer.changedInstance(context) | composer.changed(sleepMinuteEvent);
        rememberedValue = composer.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue = new Function0() { // from class: com.example.rungps.ui.sleep.SleepBreathingDisruptionsCardKt$SleepBreathingDisruptionsCard$3$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invoke$lambda$13$lambda$12$lambda$11$lambda$10;
                invoke$lambda$13$lambda$12$lambda$11$lambda$10 = SleepBreathingDisruptionsCardKt$SleepBreathingDisruptionsCard$3$1.invoke$lambda$13$lambda$12$lambda$11$lambda$10(context, sleepMinuteEvent);
                return invoke$lambda$13$lambda$12$lambda$11$lambda$10;
            }
        };
        composer.updateRememberedValue(rememberedValue);
        composer.endReplaceGroup();
        ButtonKt.OutlinedButton((Function0) rememberedValue, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1672034736, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.SleepBreathingDisruptionsCardKt$SleepBreathingDisruptionsCard$3$1$1$7$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                invoke(rowScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(RowScope OutlinedButton, Composer composer2, int i6) {
                Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
                if ((i6 & 17) != 16 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1672034736, i6, -1, "com.example.rungps.ui.sleep.SleepBreathingDisruptionsCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SleepBreathingDisruptionsCard.kt:271)");
                    }
                    Arrangement.HorizontalOrVertical m564spacedBy0680j_45 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    SleepMinuteEvent sleepMinuteEvent2 = SleepMinuteEvent.this;
                    ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    MeasurePolicy rowMeasurePolicy4 = RowKt.rowMeasurePolicy(m564spacedBy0680j_45, centerVertically, composer2, 54);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(composer2, companion2);
                    Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor6);
                    } else {
                        composer2.useNode();
                    }
                    Composer m3336constructorimpl6 = Updater.m3336constructorimpl(composer2);
                    Updater.m3343setimpl(m3336constructorimpl6, rowMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(m3336constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3336constructorimpl6.getInserting() || !Intrinsics.areEqual(m3336constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                        m3336constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                        m3336constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                    }
                    Updater.m3343setimpl(m3336constructorimpl6, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
                    IconKt.m1833Iconww6aTOc(EtIcons.INSTANCE.getPlay(), "Play marker preview tone", (Modifier) null, 0L, composer2, 54, 12);
                    TextKt.m2376Text4IGK_g(((sleepMinuteEvent2 == null || !sleepMinuteEvent2.getSnore()) && (sleepMinuteEvent2 == null || !sleepMinuteEvent2.getTalk())) ? "Preview (quiet)" : "Preview disturbance", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, composer, 54), composer, 805306416, 508);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        TextKt.m2376Text4IGK_g("Preview plays a short synthesized snore or voice sample. Movement is not shown here. Scrub the chart or slider above.", (Modifier) null, colorScheme.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 6, 0, 65530);
        TextKt.m2376Text4IGK_g("Totals: " + i4 + " snore · " + i5 + " voice minutes", (Modifier) null, colorScheme.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 0, 0, 65530);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$13$lambda$7$lambda$6(int i, ColorScheme colorScheme, List list, long j, long j2, MutableIntState mutableIntState, DrawScope Canvas) {
        float f;
        float f2;
        int SleepBreathingDisruptionsCard$lambda$9;
        long tertiary;
        int SleepBreathingDisruptionsCard$lambda$92;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float m3671getWidthimpl = Size.m3671getWidthimpl(Canvas.mo4399getSizeNHjbRc());
        float m3668getHeightimpl = Size.m3668getHeightimpl(Canvas.mo4399getSizeNHjbRc());
        float f3 = m3668getHeightimpl * 0.55f;
        int coerceAtLeast = RangesKt.coerceAtLeast(i, 1);
        float f4 = f3;
        float f5 = m3668getHeightimpl;
        DrawScope.m4385drawLineNGM6Ib0$default(Canvas, Color.m3842copywmQWz5c$default(colorScheme.getOnSurfaceVariant(), 0.25f, 0.0f, 0.0f, 0.0f, 14, null), OffsetKt.Offset(0.0f, f3), OffsetKt.Offset(m3671getWidthimpl, f3), 1.25f, 0, null, 0.0f, null, 0, 496, null);
        Path Path = AndroidPath_androidKt.Path();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            float f6 = (i3 / 48) * m3671getWidthimpl;
            f = f5;
            f2 = f4;
            float f7 = f2 - (0.06f * f);
            if (i3 == 0) {
                Path.moveTo(f6, f7);
            } else {
                Path.lineTo(f6, f7);
            }
            if (i3 == 48) {
                break;
            }
            i3++;
            f4 = f2;
            f5 = f;
        }
        DrawScope.m4389drawPathLG529CI$default(Canvas, Path, Color.m3842copywmQWz5c$default(colorScheme.getOnSurfaceVariant(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, new Stroke(1.5f, 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SleepMinuteEvent sleepMinuteEvent = (SleepMinuteEvent) it.next();
            int coerceIn = RangesKt.coerceIn(sleepMinuteEvent.getMinuteIndex(), i2, coerceAtLeast - 1);
            float coerceAtLeast2 = (coerceIn / RangesKt.coerceAtLeast(r3, 1)) * m3671getWidthimpl;
            float coerceAtLeast3 = RangesKt.coerceAtLeast(f2 - ((invoke$lambda$13$lambda$7$lambda$6$ampFor(sleepMinuteEvent) * f) * 0.48f), 4.0f);
            if (sleepMinuteEvent.getSnore()) {
                tertiary = j;
            } else {
                tertiary = sleepMinuteEvent.getBreathPause() ? colorScheme.getTertiary() : j2;
            }
            long Offset = OffsetKt.Offset(coerceAtLeast2, f2);
            long Offset2 = OffsetKt.Offset(coerceAtLeast2, coerceAtLeast3);
            SleepBreathingDisruptionsCard$lambda$92 = SleepBreathingDisruptionsCardKt.SleepBreathingDisruptionsCard$lambda$9(mutableIntState);
            DrawScope.m4385drawLineNGM6Ib0$default(Canvas, tertiary, Offset, Offset2, coerceIn == SleepBreathingDisruptionsCard$lambda$92 ? 4.0f : 2.5f, 0, null, 0.0f, null, 0, 496, null);
            f2 = f2;
            i2 = i2;
            f = f;
        }
        SleepBreathingDisruptionsCard$lambda$9 = SleepBreathingDisruptionsCardKt.SleepBreathingDisruptionsCard$lambda$9(mutableIntState);
        float coerceAtLeast4 = (SleepBreathingDisruptionsCard$lambda$9 / RangesKt.coerceAtLeast(coerceAtLeast - 1, 1)) * m3671getWidthimpl;
        DrawScope.m4385drawLineNGM6Ib0$default(Canvas, Color.m3842copywmQWz5c$default(colorScheme.getPrimary(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), OffsetKt.Offset(coerceAtLeast4, 0.0f), OffsetKt.Offset(coerceAtLeast4, f), 2.0f, 0, null, 0.0f, null, 0, 496, null);
        return Unit.INSTANCE;
    }

    private static final float invoke$lambda$13$lambda$7$lambda$6$ampFor(SleepMinuteEvent sleepMinuteEvent) {
        if (sleepMinuteEvent.getSnore()) {
            return 1.0f;
        }
        if (sleepMinuteEvent.getTalk()) {
            return 0.72f;
        }
        return sleepMinuteEvent.getBreathPause() ? 0.55f : 0.12f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$13$lambda$9$lambda$8(int i, MutableIntState mutableIntState, float f) {
        mutableIntState.setIntValue(RangesKt.coerceIn((int) f, 0, i - 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$13$lambda$12$lambda$11$lambda$10(Context context, SleepMinuteEvent sleepMinuteEvent) {
        SleepMarkerPreviewSound.INSTANCE.play(context, sleepMinuteEvent != null && sleepMinuteEvent.getSnore(), sleepMinuteEvent != null && sleepMinuteEvent.getTalk(), false);
        return Unit.INSTANCE;
    }
}
