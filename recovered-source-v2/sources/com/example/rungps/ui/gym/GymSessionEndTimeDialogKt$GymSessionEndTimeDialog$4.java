package com.example.rungps.ui.gym;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.example.rungps.ui.components.ScrollSafeAlarmTimePickerKt;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: GymSessionEndTimeDialog.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class GymSessionEndTimeDialogKt$GymSessionEndTimeDialog$4 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MutableState<LocalDate> $endDate$delegate;
    final /* synthetic */ MutableIntState $hour$delegate;
    final /* synthetic */ long $initialEndAtMs;
    final /* synthetic */ long $lastSetAtMs;
    final /* synthetic */ String $lastSetLabel;
    final /* synthetic */ MutableIntState $minute$delegate;
    final /* synthetic */ long $startedAtMs;
    final /* synthetic */ String $startedLabel;
    final /* synthetic */ ZoneId $zone;

    GymSessionEndTimeDialogKt$GymSessionEndTimeDialog$4(String str, String str2, MutableIntState mutableIntState, MutableIntState mutableIntState2, long j, long j2, ZoneId zoneId, MutableState<LocalDate> mutableState, long j3) {
        this.$startedLabel = str;
        this.$lastSetLabel = str2;
        this.$hour$delegate = mutableIntState;
        this.$minute$delegate = mutableIntState2;
        this.$lastSetAtMs = j;
        this.$initialEndAtMs = j2;
        this.$zone = zoneId;
        this.$endDate$delegate = mutableState;
        this.$startedAtMs = j3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        String str;
        final ZoneId zoneId;
        String str2;
        long j;
        String str3;
        LocalDate GymSessionEndTimeDialog$lambda$2;
        LocalDate GymSessionEndTimeDialog$lambda$22;
        LocalDate GymSessionEndTimeDialog$lambda$23;
        int GymSessionEndTimeDialog$lambda$5;
        int GymSessionEndTimeDialog$lambda$8;
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1430189315, i, -1, "com.example.rungps.ui.gym.GymSessionEndTimeDialog.<anonymous> (GymSessionEndTimeDialog.kt:75)");
            }
            Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(10));
            String str4 = this.$startedLabel;
            String str5 = this.$lastSetLabel;
            final MutableIntState mutableIntState = this.$hour$delegate;
            final MutableIntState mutableIntState2 = this.$minute$delegate;
            final long j2 = this.$lastSetAtMs;
            final long j3 = this.$initialEndAtMs;
            ZoneId zoneId2 = this.$zone;
            final MutableState<LocalDate> mutableState = this.$endDate$delegate;
            final long j4 = this.$startedAtMs;
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
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
            TextKt.m2376Text4IGK_g("Recovery uses when you finished training, not when you tap Finish. Default is about 15 min after your last logged set.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 0, 0, 65530);
            TextKt.m2376Text4IGK_g("Started: " + str4, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 0, 0, 65534);
            TextKt.m2376Text4IGK_g("Last set logged: " + str5, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 0, 0, 65534);
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical m564spacedBy0680j_42 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m564spacedBy0680j_42, Alignment.INSTANCE.getTop(), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
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
            composer.startReplaceGroup(-101209969);
            boolean changed = composer.changed(j2) | composer.changed(j3) | composer.changedInstance(zoneId2) | composer.changed(mutableState) | composer.changed(mutableIntState) | composer.changed(mutableIntState2) | composer.changed(j4);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                str = "C101@5126L9:Row.kt#2w3rfo";
                zoneId = zoneId2;
                str2 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                j = j4;
                str3 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                Object obj = new Function0() { // from class: com.example.rungps.ui.gym.GymSessionEndTimeDialogKt$GymSessionEndTimeDialog$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$14$lambda$4$lambda$1$lambda$0;
                        invoke$lambda$14$lambda$4$lambda$1$lambda$0 = GymSessionEndTimeDialogKt$GymSessionEndTimeDialog$4.invoke$lambda$14$lambda$4$lambda$1$lambda$0(j2, j3, j4, zoneId, mutableState, mutableIntState, mutableIntState2);
                        return invoke$lambda$14$lambda$4$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(obj);
                rememberedValue = obj;
            } else {
                str = "C101@5126L9:Row.kt#2w3rfo";
                zoneId = zoneId2;
                str2 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                j = j4;
                str3 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
            }
            composer.endReplaceGroup();
            String str6 = str;
            ButtonKt.TextButton((Function0) rememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$GymSessionEndTimeDialogKt.INSTANCE.m7064getLambda2$app_sideload(), composer, 805306368, 510);
            composer.startReplaceGroup(-101199699);
            final ZoneId zoneId3 = zoneId;
            boolean changedInstance = composer.changedInstance(zoneId3) | composer.changed(mutableState) | composer.changed(mutableIntState) | composer.changed(mutableIntState2);
            Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: com.example.rungps.ui.gym.GymSessionEndTimeDialogKt$GymSessionEndTimeDialog$4$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$14$lambda$4$lambda$3$lambda$2;
                        invoke$lambda$14$lambda$4$lambda$3$lambda$2 = GymSessionEndTimeDialogKt$GymSessionEndTimeDialog$4.invoke$lambda$14$lambda$4$lambda$3$lambda$2(zoneId3, mutableState, mutableIntState, mutableIntState2);
                        return invoke$lambda$14$lambda$4$lambda$3$lambda$2;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceGroup();
            ButtonKt.TextButton((Function0) rememberedValue2, null, false, null, null, null, null, null, null, ComposableSingletons$GymSessionEndTimeDialogKt.INSTANCE.m7065getLambda3$app_sideload(), composer, 805306368, 510);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, str3);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default2);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, str2);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer m3336constructorimpl3 = Updater.m3336constructorimpl(composer);
            Updater.m3343setimpl(m3336constructorimpl3, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3336constructorimpl3.getInserting() || !Intrinsics.areEqual(m3336constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m3336constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m3336constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m3343setimpl(m3336constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, str6);
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            composer.startReplaceGroup(-101189627);
            boolean changed2 = composer.changed(mutableState);
            Object rememberedValue3 = composer.rememberedValue();
            if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function0() { // from class: com.example.rungps.ui.gym.GymSessionEndTimeDialogKt$GymSessionEndTimeDialog$4$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$14$lambda$9$lambda$6$lambda$5;
                        invoke$lambda$14$lambda$9$lambda$6$lambda$5 = GymSessionEndTimeDialogKt$GymSessionEndTimeDialog$4.invoke$lambda$14$lambda$9$lambda$6$lambda$5(MutableState.this);
                        return invoke$lambda$14$lambda$9$lambda$6$lambda$5;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            Function0 function0 = (Function0) rememberedValue3;
            composer.endReplaceGroup();
            GymSessionEndTimeDialog$lambda$2 = GymSessionEndTimeDialogKt.GymSessionEndTimeDialog$lambda$2(mutableState);
            ButtonKt.OutlinedButton(function0, null, GymSessionEndTimeDialog$lambda$2.isAfter(Instant.ofEpochMilli(j).atZone(zoneId3).toLocalDate()), null, null, null, null, null, null, ComposableSingletons$GymSessionEndTimeDialogKt.INSTANCE.m7066getLambda4$app_sideload(), composer, 805306368, 506);
            GymSessionEndTimeDialog$lambda$22 = GymSessionEndTimeDialogKt.GymSessionEndTimeDialog$lambda$2(mutableState);
            String localDate = GymSessionEndTimeDialog$lambda$22.toString();
            Intrinsics.checkNotNullExpressionValue(localDate, "toString(...)");
            TextKt.m2376Text4IGK_g(localDate, rowScopeInstance2.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterVertically()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleSmall(), composer, 0, 0, 65532);
            composer.startReplaceGroup(-101173628);
            boolean changed3 = composer.changed(mutableState);
            Object rememberedValue4 = composer.rememberedValue();
            if (changed3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new Function0() { // from class: com.example.rungps.ui.gym.GymSessionEndTimeDialogKt$GymSessionEndTimeDialog$4$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$14$lambda$9$lambda$8$lambda$7;
                        invoke$lambda$14$lambda$9$lambda$8$lambda$7 = GymSessionEndTimeDialogKt$GymSessionEndTimeDialog$4.invoke$lambda$14$lambda$9$lambda$8$lambda$7(MutableState.this);
                        return invoke$lambda$14$lambda$9$lambda$8$lambda$7;
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            composer.endReplaceGroup();
            GymSessionEndTimeDialog$lambda$23 = GymSessionEndTimeDialogKt.GymSessionEndTimeDialog$lambda$2(mutableState);
            ButtonKt.OutlinedButton((Function0) rememberedValue4, null, !GymSessionEndTimeDialog$lambda$23.isAfter(LocalDate.now(zoneId3).plusDays(1L)), null, null, null, null, null, null, ComposableSingletons$GymSessionEndTimeDialogKt.INSTANCE.m7067getLambda5$app_sideload(), composer, 805306368, 506);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            GymSessionEndTimeDialog$lambda$5 = GymSessionEndTimeDialogKt.GymSessionEndTimeDialog$lambda$5(mutableIntState);
            GymSessionEndTimeDialog$lambda$8 = GymSessionEndTimeDialogKt.GymSessionEndTimeDialog$lambda$8(mutableIntState2);
            composer.startReplaceGroup(1026794321);
            boolean changed4 = composer.changed(mutableIntState);
            Object rememberedValue5 = composer.rememberedValue();
            if (changed4 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new Function1() { // from class: com.example.rungps.ui.gym.GymSessionEndTimeDialogKt$GymSessionEndTimeDialog$4$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Unit invoke$lambda$14$lambda$11$lambda$10;
                        invoke$lambda$14$lambda$11$lambda$10 = GymSessionEndTimeDialogKt$GymSessionEndTimeDialog$4.invoke$lambda$14$lambda$11$lambda$10(MutableIntState.this, ((Integer) obj2).intValue());
                        return invoke$lambda$14$lambda$11$lambda$10;
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
            }
            Function1 function1 = (Function1) rememberedValue5;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1026795987);
            boolean changed5 = composer.changed(mutableIntState2);
            Object rememberedValue6 = composer.rememberedValue();
            if (changed5 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new Function1() { // from class: com.example.rungps.ui.gym.GymSessionEndTimeDialogKt$GymSessionEndTimeDialog$4$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Unit invoke$lambda$14$lambda$13$lambda$12;
                        invoke$lambda$14$lambda$13$lambda$12 = GymSessionEndTimeDialogKt$GymSessionEndTimeDialog$4.invoke$lambda$14$lambda$13$lambda$12(MutableIntState.this, ((Integer) obj2).intValue());
                        return invoke$lambda$14$lambda$13$lambda$12;
                    }
                };
                composer.updateRememberedValue(rememberedValue6);
            }
            composer.endReplaceGroup();
            ScrollSafeAlarmTimePickerKt.ScrollSafeAlarmTimePicker(GymSessionEndTimeDialog$lambda$5, GymSessionEndTimeDialog$lambda$8, function1, (Function1) rememberedValue6, null, 1, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 16);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$14$lambda$4$lambda$1$lambda$0(long j, long j2, long j3, ZoneId zoneId, MutableState mutableState, MutableIntState mutableIntState, MutableIntState mutableIntState2) {
        if (j <= 0) {
            j = j2;
        }
        GymSessionEndTimeDialogKt.GymSessionEndTimeDialog$applyEndMs(zoneId, mutableState, mutableIntState, mutableIntState2, RangesKt.coerceAtLeast(j + 900000, j3));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$14$lambda$4$lambda$3$lambda$2(ZoneId zoneId, MutableState mutableState, MutableIntState mutableIntState, MutableIntState mutableIntState2) {
        GymSessionEndTimeDialogKt.GymSessionEndTimeDialog$applyEndMs(zoneId, mutableState, mutableIntState, mutableIntState2, System.currentTimeMillis());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$14$lambda$9$lambda$6$lambda$5(MutableState mutableState) {
        LocalDate GymSessionEndTimeDialog$lambda$2;
        GymSessionEndTimeDialog$lambda$2 = GymSessionEndTimeDialogKt.GymSessionEndTimeDialog$lambda$2(mutableState);
        mutableState.setValue(GymSessionEndTimeDialog$lambda$2.minusDays(1L));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$14$lambda$9$lambda$8$lambda$7(MutableState mutableState) {
        LocalDate GymSessionEndTimeDialog$lambda$2;
        GymSessionEndTimeDialog$lambda$2 = GymSessionEndTimeDialogKt.GymSessionEndTimeDialog$lambda$2(mutableState);
        mutableState.setValue(GymSessionEndTimeDialog$lambda$2.plusDays(1L));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$14$lambda$11$lambda$10(MutableIntState mutableIntState, int i) {
        mutableIntState.setIntValue(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$14$lambda$13$lambda$12(MutableIntState mutableIntState, int i) {
        mutableIntState.setIntValue(i);
        return Unit.INSTANCE;
    }
}
