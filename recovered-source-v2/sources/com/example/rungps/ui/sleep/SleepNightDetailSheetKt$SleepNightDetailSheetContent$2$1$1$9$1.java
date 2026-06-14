package com.example.rungps.ui.sleep;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.sleep.SleepEntryTimeEditor;
import com.example.rungps.sleep.SleepEntryValidator;
import com.example.rungps.ui.components.TabUiKt;
import com.example.rungps.ui.sleep.SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$9$1;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: SleepNightDetailSheet.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$9$1 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ SleepEntryEntity $e;
    final /* synthetic */ MutableState<Boolean> $editingWake$delegate;
    final /* synthetic */ Function1<SleepEntryEntity, Unit> $save;
    final /* synthetic */ MutableState<String> $wakeEditError$delegate;
    final /* synthetic */ MutableState<String> $wakeText$delegate;
    final /* synthetic */ ZoneId $zone;

    /* JADX WARN: Multi-variable type inference failed */
    SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$9$1(MutableState<String> mutableState, SleepEntryEntity sleepEntryEntity, ZoneId zoneId, MutableState<Boolean> mutableState2, MutableState<String> mutableState3, Function1<? super SleepEntryEntity, Unit> function1) {
        this.$wakeText$delegate = mutableState;
        this.$e = sleepEntryEntity;
        this.$zone = zoneId;
        this.$editingWake$delegate = mutableState2;
        this.$wakeEditError$delegate = mutableState3;
        this.$save = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope item, Composer composer, int i) {
        boolean SleepNightDetailSheetContent$lambda$4;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) != 16 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-577153268, i, -1, "com.example.rungps.ui.sleep.SleepNightDetailSheetContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SleepNightDetailSheet.kt:363)");
            }
            SleepNightDetailSheetContent$lambda$4 = SleepNightDetailSheetKt.SleepNightDetailSheetContent$lambda$4(this.$editingWake$delegate);
            if (!SleepNightDetailSheetContent$lambda$4) {
                composer.startReplaceGroup(-2038665118);
                composer.startReplaceGroup(-1174139760);
                boolean changed = composer.changed(this.$wakeText$delegate) | composer.changedInstance(this.$e) | composer.changedInstance(this.$zone) | composer.changed(this.$editingWake$delegate);
                final SleepEntryEntity sleepEntryEntity = this.$e;
                final ZoneId zoneId = this.$zone;
                final MutableState<String> mutableState = this.$wakeText$delegate;
                final MutableState<String> mutableState2 = this.$wakeEditError$delegate;
                final MutableState<Boolean> mutableState3 = this.$editingWake$delegate;
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: com.example.rungps.ui.sleep.SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$9$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$1$lambda$0;
                            invoke$lambda$1$lambda$0 = SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$9$1.invoke$lambda$1$lambda$0(SleepEntryEntity.this, zoneId, mutableState, mutableState2, mutableState3);
                            return invoke$lambda$1$lambda$0;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                ButtonKt.OutlinedButton((Function0) rememberedValue, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, null, null, null, null, null, ComposableSingletons$SleepNightDetailSheetKt.INSTANCE.m7497getLambda4$app_sideload(), composer, 805306416, 508);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-2038059781);
                TabUiKt.TabSectionCard("Correct wake time", null, ComposableLambdaKt.rememberComposableLambda(103142825, true, new AnonymousClass2(this.$wakeText$delegate, this.$wakeEditError$delegate, this.$editingWake$delegate, this.$e, this.$save), composer, 54), composer, 390, 2);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SleepEntryEntity sleepEntryEntity, ZoneId zoneId, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        mutableState.setValue(Instant.ofEpochMilli(sleepEntryEntity.getEndTimeMs()).atZone(zoneId).format(SleepFormattersKt.getSleepAmPmFmt()));
        mutableState2.setValue(null);
        SleepNightDetailSheetKt.SleepNightDetailSheetContent$lambda$5(mutableState3, true);
        return Unit.INSTANCE;
    }

    /* compiled from: SleepNightDetailSheet.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.example.rungps.ui.sleep.SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$9$1$2, reason: invalid class name */
    static final class AnonymousClass2 implements Function3<ColumnScope, Composer, Integer, Unit> {
        final /* synthetic */ SleepEntryEntity $e;
        final /* synthetic */ MutableState<Boolean> $editingWake$delegate;
        final /* synthetic */ Function1<SleepEntryEntity, Unit> $save;
        final /* synthetic */ MutableState<String> $wakeEditError$delegate;
        final /* synthetic */ MutableState<String> $wakeText$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<Boolean> mutableState3, SleepEntryEntity sleepEntryEntity, Function1<? super SleepEntryEntity, Unit> function1) {
            this.$wakeText$delegate = mutableState;
            this.$wakeEditError$delegate = mutableState2;
            this.$editingWake$delegate = mutableState3;
            this.$e = sleepEntryEntity;
            this.$save = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            invoke(columnScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(ColumnScope TabSectionCard, Composer composer, int i) {
            String SleepNightDetailSheetContent$lambda$7;
            String SleepNightDetailSheetContent$lambda$10;
            final String SleepNightDetailSheetContent$lambda$102;
            Intrinsics.checkNotNullParameter(TabSectionCard, "$this$TabSectionCard");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(103142825, i, -1, "com.example.rungps.ui.sleep.SleepNightDetailSheetContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SleepNightDetailSheet.kt:376)");
                }
                TextKt.m2376Text4IGK_g("Use if you forgot to stop tracking or the alarm time was wrong. Stages and duration are recalculated.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 6, 0, 65530);
                SleepNightDetailSheetContent$lambda$7 = SleepNightDetailSheetKt.SleepNightDetailSheetContent$lambda$7(this.$wakeText$delegate);
                Intrinsics.checkNotNullExpressionValue(SleepNightDetailSheetContent$lambda$7, "access$SleepNightDetailSheetContent$lambda$7(...)");
                SleepNightDetailSheetContent$lambda$10 = SleepNightDetailSheetKt.SleepNightDetailSheetContent$lambda$10(this.$wakeEditError$delegate);
                boolean z = SleepNightDetailSheetContent$lambda$10 != null;
                SleepNightDetailSheetContent$lambda$102 = SleepNightDetailSheetKt.SleepNightDetailSheetContent$lambda$10(this.$wakeEditError$delegate);
                composer.startReplaceGroup(-461174955);
                ComposableLambda rememberComposableLambda = SleepNightDetailSheetContent$lambda$102 == null ? null : ComposableLambdaKt.rememberComposableLambda(1614268619, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$9$1$2$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1614268619, i2, -1, "com.example.rungps.ui.sleep.SleepNightDetailSheetContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SleepNightDetailSheet.kt:387)");
                        }
                        TextKt.m2376Text4IGK_g(SleepNightDetailSheetContent$lambda$102, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54);
                composer.endReplaceGroup();
                composer.startReplaceGroup(-461183629);
                boolean changed = composer.changed(this.$wakeText$delegate);
                final MutableState<String> mutableState = this.$wakeText$delegate;
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: com.example.rungps.ui.sleep.SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$9$1$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit invoke$lambda$2$lambda$1;
                            invoke$lambda$2$lambda$1 = SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$9$1.AnonymousClass2.invoke$lambda$2$lambda$1(MutableState.this, (String) obj);
                            return invoke$lambda$2$lambda$1;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                TextFieldKt.TextField(SleepNightDetailSheetContent$lambda$7, (Function1<? super String, Unit>) rememberedValue, (Modifier) null, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$SleepNightDetailSheetKt.INSTANCE.m7498getLambda5$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) rememberComposableLambda, z, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, composer, 1572864, 12582912, 0, 8245180);
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
                final MutableState<Boolean> mutableState2 = this.$editingWake$delegate;
                final MutableState<String> mutableState3 = this.$wakeText$delegate;
                final SleepEntryEntity sleepEntryEntity = this.$e;
                final Function1<SleepEntryEntity, Unit> function1 = this.$save;
                final MutableState<String> mutableState4 = this.$wakeEditError$delegate;
                ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer, 6);
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
                final RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                composer.startReplaceGroup(-422704808);
                boolean changed2 = composer.changed(mutableState2);
                Object rememberedValue2 = composer.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function0() { // from class: com.example.rungps.ui.sleep.SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$9$1$2$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$11$lambda$4$lambda$3;
                            invoke$lambda$11$lambda$4$lambda$3 = SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$9$1.AnonymousClass2.invoke$lambda$11$lambda$4$lambda$3(MutableState.this, mutableState4);
                            return invoke$lambda$11$lambda$4$lambda$3;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                composer.endReplaceGroup();
                ButtonKt.OutlinedButton((Function0) rememberedValue2, RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), false, null, null, null, null, null, null, ComposableSingletons$SleepNightDetailSheetKt.INSTANCE.m7499getLambda6$app_sideload(), composer, 805306368, 508);
                composer.startReplaceGroup(-422691651);
                boolean changed3 = composer.changed(mutableState3) | composer.changedInstance(sleepEntryEntity) | composer.changed(mutableState2) | composer.changed(function1);
                Object rememberedValue3 = composer.rememberedValue();
                if (changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new Function0() { // from class: com.example.rungps.ui.sleep.SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$9$1$2$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$11$lambda$10$lambda$9;
                            invoke$lambda$11$lambda$10$lambda$9 = SleepNightDetailSheetKt$SleepNightDetailSheetContent$2$1$1$9$1.AnonymousClass2.invoke$lambda$11$lambda$10$lambda$9(RowScope.this, sleepEntryEntity, function1, mutableState3, mutableState4, mutableState2);
                            return invoke$lambda$11$lambda$10$lambda$9;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue3);
                }
                composer.endReplaceGroup();
                ButtonKt.Button((Function0) rememberedValue3, RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), false, null, null, null, null, null, null, ComposableSingletons$SleepNightDetailSheetKt.INSTANCE.m7500getLambda7$app_sideload(), composer, 805306368, 508);
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
        public static final Unit invoke$lambda$2$lambda$1(MutableState mutableState, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            mutableState.setValue(StringsKt.take(it, 16));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$11$lambda$4$lambda$3(MutableState mutableState, MutableState mutableState2) {
            SleepNightDetailSheetKt.SleepNightDetailSheetContent$lambda$5(mutableState, false);
            mutableState2.setValue(null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$11$lambda$10$lambda$9(RowScope rowScope, SleepEntryEntity sleepEntryEntity, Function1 function1, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
            String SleepNightDetailSheetContent$lambda$7;
            long wakeTimeToEpochMs;
            Object m7905constructorimpl;
            SleepNightDetailSheetContent$lambda$7 = SleepNightDetailSheetKt.SleepNightDetailSheetContent$lambda$7(mutableState);
            Intrinsics.checkNotNullExpressionValue(SleepNightDetailSheetContent$lambda$7, "access$SleepNightDetailSheetContent$lambda$7(...)");
            LocalTime parseSleepClockTime = SleepFormattersKt.parseSleepClockTime(SleepNightDetailSheetContent$lambda$7);
            if (parseSleepClockTime != null) {
                wakeTimeToEpochMs = SleepEntryTimeEditor.INSTANCE.wakeTimeToEpochMs(parseSleepClockTime.getHour(), parseSleepClockTime.getMinute(), sleepEntryEntity.getStartTimeMs(), (r18 & 8) != 0 ? System.currentTimeMillis() : 0L, (r18 & 16) != 0 ? ZoneId.systemDefault() : null);
                try {
                    Result.Companion companion = Result.INSTANCE;
                    m7905constructorimpl = Result.m7905constructorimpl(SleepEntryTimeEditor.INSTANCE.adjustEndTime(sleepEntryEntity, wakeTimeToEpochMs));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                }
                Throwable m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(m7905constructorimpl);
                if (m7908exceptionOrNullimpl != null) {
                    String message = m7908exceptionOrNullimpl.getMessage();
                    if (message == null) {
                        message = "Invalid wake time";
                    }
                    mutableState2.setValue(message);
                    return Unit.INSTANCE;
                }
                SleepEntryEntity sleepEntryEntity2 = (SleepEntryEntity) m7905constructorimpl;
                String validate = SleepEntryValidator.INSTANCE.validate(sleepEntryEntity2);
                if (validate != null) {
                    mutableState2.setValue(validate);
                    return Unit.INSTANCE;
                }
                mutableState2.setValue(null);
                SleepNightDetailSheetKt.SleepNightDetailSheetContent$lambda$5(mutableState3, false);
                function1.invoke(sleepEntryEntity2);
                return Unit.INSTANCE;
            }
            mutableState2.setValue("Use 7:00 AM or 07:00");
            return Unit.INSTANCE;
        }
    }
}
