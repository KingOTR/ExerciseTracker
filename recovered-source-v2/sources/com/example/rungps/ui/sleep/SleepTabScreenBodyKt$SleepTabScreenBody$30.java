package com.example.rungps.ui.sleep;

import android.content.Context;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SliderKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
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
import androidx.profileinstaller.ProfileVerifier;
import com.example.rungps.sleep.SleepMlFeedbackApply;
import com.example.rungps.sleep.SleepOvernightStore;
import com.example.rungps.sleep.SleepWakeRecap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: SleepTabScreenBody.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SleepTabScreenBodyKt$SleepTabScreenBody$30 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ String $alarmAuditLine;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<SleepMlFeedbackApply.Kind> $hypnoFeedback$delegate;
    final /* synthetic */ State<Integer> $recoverableSampleCount$delegate;
    final /* synthetic */ String $smartUnavailable;
    final /* synthetic */ MutableState<String> $wakeError$delegate;
    final /* synthetic */ MutableIntState $wakeMood$delegate;
    final /* synthetic */ MutableState<String> $wakeText$delegate;

    SleepTabScreenBodyKt$SleepTabScreenBody$30(Context context, String str, String str2, MutableState<String> mutableState, State<Integer> state, MutableState<SleepMlFeedbackApply.Kind> mutableState2, MutableIntState mutableIntState, MutableState<String> mutableState3) {
        this.$ctx = context;
        this.$alarmAuditLine = str;
        this.$smartUnavailable = str2;
        this.$wakeText$delegate = mutableState;
        this.$recoverableSampleCount$delegate = state;
        this.$hypnoFeedback$delegate = mutableState2;
        this.$wakeMood$delegate = mutableIntState;
        this.$wakeError$delegate = mutableState3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        String str;
        MutableState<String> mutableState;
        MutableIntState mutableIntState;
        State<Integer> state;
        MutableState<SleepMlFeedbackApply.Kind> mutableState2;
        MutableState<String> mutableState3;
        String str2;
        String str3;
        String str4;
        Context context;
        Composer composer2;
        int SleepTabScreenBody$lambda$246;
        boolean z;
        int SleepTabScreenBody$lambda$144;
        final MutableIntState mutableIntState2;
        int SleepTabScreenBody$lambda$1442;
        String SleepTabScreenBody$lambda$249;
        String SleepTabScreenBody$lambda$252;
        final String SleepTabScreenBody$lambda$2522;
        SleepMlFeedbackApply.Kind SleepTabScreenBody$lambda$147;
        final MutableState<SleepMlFeedbackApply.Kind> mutableState4;
        SleepMlFeedbackApply.Kind SleepTabScreenBody$lambda$1472;
        final MutableState<SleepMlFeedbackApply.Kind> mutableState5;
        SleepMlFeedbackApply.Kind SleepTabScreenBody$lambda$1473;
        int SleepTabScreenBody$lambda$2462;
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-788814852, i, -1, "com.example.rungps.ui.sleep.SleepTabScreenBody.<anonymous> (SleepTabScreenBody.kt:1538)");
            }
            Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
            Context context2 = this.$ctx;
            String str5 = this.$alarmAuditLine;
            String str6 = this.$smartUnavailable;
            MutableState<String> mutableState6 = this.$wakeText$delegate;
            State<Integer> state2 = this.$recoverableSampleCount$delegate;
            MutableState<SleepMlFeedbackApply.Kind> mutableState7 = this.$hypnoFeedback$delegate;
            MutableIntState mutableIntState3 = this.$wakeMood$delegate;
            MutableState<String> mutableState8 = this.$wakeError$delegate;
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
            if (SleepOvernightStore.INSTANCE.isRecoverableStale(context2)) {
                composer.startReplaceGroup(2133655213);
                SleepTabScreenBody$lambda$2462 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$246(state2);
                str = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                mutableState = mutableState8;
                mutableIntState = mutableIntState3;
                state = state2;
                mutableState2 = mutableState7;
                mutableState3 = mutableState6;
                str2 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                str4 = str6;
                str3 = str5;
                TextKt.m2376Text4IGK_g("Overnight tracking stopped early — save your night to keep " + SleepTabScreenBody$lambda$2462 + " samples.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 0, 0, 65530);
                composer.endReplaceGroup();
                composer2 = composer;
                context = context2;
            } else {
                str = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                mutableState = mutableState8;
                mutableIntState = mutableIntState3;
                state = state2;
                mutableState2 = mutableState7;
                mutableState3 = mutableState6;
                str2 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                str3 = str5;
                str4 = str6;
                if (SleepOvernightStore.INSTANCE.alarmFired(context2)) {
                    composer.startReplaceGroup(2134042124);
                    context = context2;
                    TextKt.m2376Text4IGK_g("Your wake alarm fired — save your night when you're ready.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 6, 0, 65530);
                    composer.endReplaceGroup();
                    composer2 = composer;
                } else {
                    context = context2;
                    composer2 = composer;
                    composer2.startReplaceGroup(2134342917);
                    composer.endReplaceGroup();
                }
            }
            composer2.startReplaceGroup(1731419218);
            if (str3 != null) {
                TextKt.m2376Text4IGK_g(str3, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodySmall(), composer, 0, 0, 65530);
                Unit unit = Unit.INSTANCE;
                Unit unit2 = Unit.INSTANCE;
            }
            composer.endReplaceGroup();
            composer.startReplaceGroup(1731429317);
            if (str4 != null) {
                TextKt.m2376Text4IGK_g(str4, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 0, 0, 65530);
                Unit unit3 = Unit.INSTANCE;
                Unit unit4 = Unit.INSTANCE;
            }
            composer.endReplaceGroup();
            String consume = SleepWakeRecap.INSTANCE.consume(context);
            composer.startReplaceGroup(1731439372);
            if (consume != null) {
                TextKt.m2376Text4IGK_g(consume, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 0, 0, 65530);
                Unit unit5 = Unit.INSTANCE;
                Unit unit6 = Unit.INSTANCE;
            }
            composer.endReplaceGroup();
            composer.startReplaceGroup(1731450763);
            SleepTabScreenBody$lambda$246 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$246(state);
            if (SleepTabScreenBody$lambda$246 > 0) {
                TextKt.m2376Text4IGK_g("Hypnogram feedback (optional)", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelMedium(), composer, 196614, 0, 65502);
                Arrangement.HorizontalOrVertical m564spacedBy0680j_42 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(6));
                ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m564spacedBy0680j_42, Alignment.INSTANCE.getTop(), composer, 6);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, str);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, companion2);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, str2);
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
                SleepTabScreenBody$lambda$147 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$147(mutableState2);
                boolean z2 = SleepTabScreenBody$lambda$147 == SleepMlFeedbackApply.Kind.LOOKS_RIGHT;
                composer.startReplaceGroup(-1115000097);
                Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    mutableState4 = mutableState2;
                    rememberedValue = new Function0() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$30$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$15$lambda$9$lambda$4$lambda$3;
                            invoke$lambda$15$lambda$9$lambda$4$lambda$3 = SleepTabScreenBodyKt$SleepTabScreenBody$30.invoke$lambda$15$lambda$9$lambda$4$lambda$3(MutableState.this);
                            return invoke$lambda$15$lambda$9$lambda$4$lambda$3;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                } else {
                    mutableState4 = mutableState2;
                }
                composer.endReplaceGroup();
                MutableState<SleepMlFeedbackApply.Kind> mutableState9 = mutableState4;
                z = false;
                ChipKt.FilterChip(z2, (Function0) rememberedValue, ComposableSingletons$SleepTabScreenBodyKt.INSTANCE.m7533getLambda38$app_sideload(), null, false, null, null, null, null, null, null, null, composer, 432, 0, 4088);
                SleepTabScreenBody$lambda$1472 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$147(mutableState9);
                boolean z3 = SleepTabScreenBody$lambda$1472 == SleepMlFeedbackApply.Kind.TOO_AWAKE;
                composer.startReplaceGroup(-1114979909);
                Object rememberedValue2 = composer.rememberedValue();
                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    mutableState5 = mutableState9;
                    rememberedValue2 = new Function0() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$30$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$15$lambda$9$lambda$6$lambda$5;
                            invoke$lambda$15$lambda$9$lambda$6$lambda$5 = SleepTabScreenBodyKt$SleepTabScreenBody$30.invoke$lambda$15$lambda$9$lambda$6$lambda$5(MutableState.this);
                            return invoke$lambda$15$lambda$9$lambda$6$lambda$5;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                } else {
                    mutableState5 = mutableState9;
                }
                composer.endReplaceGroup();
                final MutableState<SleepMlFeedbackApply.Kind> mutableState10 = mutableState5;
                ChipKt.FilterChip(z3, (Function0) rememberedValue2, ComposableSingletons$SleepTabScreenBodyKt.INSTANCE.m7534getLambda39$app_sideload(), null, false, null, null, null, null, null, null, null, composer, 432, 0, 4088);
                SleepTabScreenBody$lambda$1473 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$147(mutableState10);
                boolean z4 = SleepTabScreenBody$lambda$1473 == SleepMlFeedbackApply.Kind.TOO_MUCH_DEEP;
                composer.startReplaceGroup(-1114959613);
                Object rememberedValue3 = composer.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new Function0() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$30$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$15$lambda$9$lambda$8$lambda$7;
                            invoke$lambda$15$lambda$9$lambda$8$lambda$7 = SleepTabScreenBodyKt$SleepTabScreenBody$30.invoke$lambda$15$lambda$9$lambda$8$lambda$7(MutableState.this);
                            return invoke$lambda$15$lambda$9$lambda$8$lambda$7;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue3);
                }
                composer.endReplaceGroup();
                ChipKt.FilterChip(z4, (Function0) rememberedValue3, ComposableSingletons$SleepTabScreenBodyKt.INSTANCE.m7536getLambda40$app_sideload(), null, false, null, null, null, null, null, null, null, composer, 432, 0, 4088);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
            } else {
                z = false;
            }
            composer.endReplaceGroup();
            TextKt.m2376Text4IGK_g("Rate your wake-up (1 = tired, 5 = great)", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            SleepTabScreenBody$lambda$144 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$144(mutableIntState);
            float f = SleepTabScreenBody$lambda$144;
            composer.startReplaceGroup(1731528746);
            Object rememberedValue4 = composer.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                mutableIntState2 = mutableIntState;
                rememberedValue4 = new Function1() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$30$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$15$lambda$11$lambda$10;
                        invoke$lambda$15$lambda$11$lambda$10 = SleepTabScreenBodyKt$SleepTabScreenBody$30.invoke$lambda$15$lambda$11$lambda$10(MutableIntState.this, ((Float) obj).floatValue());
                        return invoke$lambda$15$lambda$11$lambda$10;
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            } else {
                mutableIntState2 = mutableIntState;
            }
            composer.endReplaceGroup();
            SliderKt.Slider(f, (Function1) rememberedValue4, null, false, RangesKt.rangeTo(1.0f, 5.0f), 3, null, null, null, composer, 196656, 460);
            SleepTabScreenBody$lambda$1442 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$144(mutableIntState2);
            TextKt.m2376Text4IGK_g(SleepTabScreenBody$lambda$1442 + " / 5", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 131038);
            SleepTabScreenBody$lambda$249 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$249(mutableState3);
            Intrinsics.checkNotNullExpressionValue(SleepTabScreenBody$lambda$249, "access$SleepTabScreenBody$lambda$249(...)");
            SleepTabScreenBody$lambda$252 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$252(mutableState);
            boolean z5 = SleepTabScreenBody$lambda$252 != null ? true : z;
            SleepTabScreenBody$lambda$2522 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$252(mutableState);
            composer.startReplaceGroup(1731547225);
            ComposableLambda rememberComposableLambda = SleepTabScreenBody$lambda$2522 == null ? null : ComposableLambdaKt.rememberComposableLambda(1888194683, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$30$1$6$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i2) {
                    if ((i2 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1888194683, i2, -1, "com.example.rungps.ui.sleep.SleepTabScreenBody.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SleepTabScreenBody.kt:1629)");
                    }
                    TextKt.m2376Text4IGK_g(SleepTabScreenBody$lambda$2522, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54);
            composer.endReplaceGroup();
            composer.startReplaceGroup(1731539479);
            final MutableState<String> mutableState11 = mutableState3;
            boolean changed = composer.changed(mutableState11);
            Object rememberedValue5 = composer.rememberedValue();
            if (changed || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new Function1() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$30$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$15$lambda$14$lambda$13;
                        invoke$lambda$15$lambda$14$lambda$13 = SleepTabScreenBodyKt$SleepTabScreenBody$30.invoke$lambda$15$lambda$14$lambda$13(MutableState.this, (String) obj);
                        return invoke$lambda$15$lambda$14$lambda$13;
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
            }
            composer.endReplaceGroup();
            TextFieldKt.TextField(SleepTabScreenBody$lambda$249, (Function1<? super String, Unit>) rememberedValue5, (Modifier) null, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$SleepTabScreenBodyKt.INSTANCE.m7537getLambda41$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) rememberComposableLambda, z5, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, composer, 1572864, 12582912, 0, 8245180);
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
    public static final Unit invoke$lambda$15$lambda$9$lambda$4$lambda$3(MutableState mutableState) {
        SleepMlFeedbackApply.Kind SleepTabScreenBody$lambda$147;
        SleepTabScreenBody$lambda$147 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$147(mutableState);
        mutableState.setValue(SleepTabScreenBody$lambda$147 == SleepMlFeedbackApply.Kind.LOOKS_RIGHT ? null : SleepMlFeedbackApply.Kind.LOOKS_RIGHT);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$15$lambda$9$lambda$6$lambda$5(MutableState mutableState) {
        SleepMlFeedbackApply.Kind SleepTabScreenBody$lambda$147;
        SleepTabScreenBody$lambda$147 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$147(mutableState);
        mutableState.setValue(SleepTabScreenBody$lambda$147 == SleepMlFeedbackApply.Kind.TOO_AWAKE ? null : SleepMlFeedbackApply.Kind.TOO_AWAKE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$15$lambda$9$lambda$8$lambda$7(MutableState mutableState) {
        SleepMlFeedbackApply.Kind SleepTabScreenBody$lambda$147;
        SleepTabScreenBody$lambda$147 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$147(mutableState);
        mutableState.setValue(SleepTabScreenBody$lambda$147 == SleepMlFeedbackApply.Kind.TOO_MUCH_DEEP ? null : SleepMlFeedbackApply.Kind.TOO_MUCH_DEEP);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$15$lambda$11$lambda$10(MutableIntState mutableIntState, float f) {
        mutableIntState.setIntValue(RangesKt.coerceIn(MathKt.roundToInt(f), 1, 5));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$15$lambda$14$lambda$13(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(StringsKt.take(it, 16));
        return Unit.INSTANCE;
    }
}
