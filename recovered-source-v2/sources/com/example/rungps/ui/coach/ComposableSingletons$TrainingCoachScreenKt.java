package com.example.rungps.ui.coach;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TrainingCoachScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$TrainingCoachScreenKt {
    public static final ComposableSingletons$TrainingCoachScreenKt INSTANCE = new ComposableSingletons$TrainingCoachScreenKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f74lambda1 = ComposableLambdaKt.composableLambdaInstance(-1599101352, false, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.coach.ComposableSingletons$TrainingCoachScreenKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1599101352, i, -1, "com.example.rungps.ui.coach.ComposableSingletons$TrainingCoachScreenKt.lambda-1.<anonymous> (TrainingCoachScreen.kt:132)");
                }
                Modifier m684padding3ABfNKs = PaddingKt.m684padding3ABfNKs(BackgroundKt.background$default(Modifier.INSTANCE, Brush.Companion.m3792horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3833boximpl(Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).m1593getPrimary0d7_KjU(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m3833boximpl(Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).m1608getTertiary0d7_KjU(), 0.75f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), Dp.m6303constructorimpl(20));
                ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m684padding3ABfNKs);
                Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
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
                Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                TextKt.m2376Text4IGK_g("Running coach", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).m1583getOnPrimary0d7_KjU(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getHeadlineSmall(), composer, 196614, 0, 65498);
                TextKt.m2376Text4IGK_g("Describe distance, time, pace, and timeframe — we use your PBs (and estimates for in-between distances like 8 km).", PaddingKt.m688paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6303constructorimpl(6), 0.0f, 0.0f, 13, null), Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).m1583getOnPrimary0d7_KjU(), 0.92f, 0.0f, 0.0f, 0.0f, 14, null), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 54, 0, 65528);
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
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f79lambda2 = ComposableLambdaKt.composableLambdaInstance(-135200482, false, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.coach.ComposableSingletons$TrainingCoachScreenKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-135200482, i, -1, "com.example.rungps.ui.coach.ComposableSingletons$TrainingCoachScreenKt.lambda-2.<anonymous> (TrainingCoachScreen.kt:170)");
            }
            TextKt.m2376Text4IGK_g("e.g. 8 km in 40 min in 10 weeks", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f80lambda3 = ComposableLambdaKt.composableLambdaInstance(-409271531, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.coach.ComposableSingletons$TrainingCoachScreenKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope Button, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-409271531, i, -1, "com.example.rungps.ui.coach.ComposableSingletons$TrainingCoachScreenKt.lambda-3.<anonymous> (TrainingCoachScreen.kt:193)");
            }
            TextKt.m2376Text4IGK_g("Build my plan", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 196614, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f81lambda4 = ComposableLambdaKt.composableLambdaInstance(713898594, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.coach.ComposableSingletons$TrainingCoachScreenKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope Button, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(713898594, i, -1, "com.example.rungps.ui.coach.ComposableSingletons$TrainingCoachScreenKt.lambda-4.<anonymous> (TrainingCoachScreen.kt:241)");
            }
            TextKt.m2376Text4IGK_g("Save plan as template to follow", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 196614, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-5, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f82lambda5 = ComposableLambdaKt.composableLambdaInstance(-1569596496, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.coach.ComposableSingletons$TrainingCoachScreenKt$lambda-5$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope Button, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1569596496, i, -1, "com.example.rungps.ui.coach.ComposableSingletons$TrainingCoachScreenKt.lambda-5.<anonymous> (TrainingCoachScreen.kt:290)");
            }
            TextKt.m2376Text4IGK_g("Start template", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-6, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f83lambda6 = ComposableLambdaKt.composableLambdaInstance(-1694392654, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.coach.ComposableSingletons$TrainingCoachScreenKt$lambda-6$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope OutlinedButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1694392654, i, -1, "com.example.rungps.ui.coach.ComposableSingletons$TrainingCoachScreenKt.lambda-6.<anonymous> (TrainingCoachScreen.kt:301)");
            }
            TextKt.m2376Text4IGK_g("Clear", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-7, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f84lambda7 = ComposableLambdaKt.composableLambdaInstance(-396799979, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.coach.ComposableSingletons$TrainingCoachScreenKt$lambda-7$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope Button, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-396799979, i, -1, "com.example.rungps.ui.coach.ComposableSingletons$TrainingCoachScreenKt.lambda-7.<anonymous> (TrainingCoachScreen.kt:326)");
            }
            TextKt.m2376Text4IGK_g("Mark done", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-8, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f85lambda8 = ComposableLambdaKt.composableLambdaInstance(-203732758, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.coach.ComposableSingletons$TrainingCoachScreenKt$lambda-8$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope Button, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-203732758, i, -1, "com.example.rungps.ui.coach.ComposableSingletons$TrainingCoachScreenKt.lambda-8.<anonymous> (TrainingCoachScreen.kt:360)");
            }
            TextKt.m2376Text4IGK_g("Start", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-9, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f86lambda9 = ComposableLambdaKt.composableLambdaInstance(1526874214, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.coach.ComposableSingletons$TrainingCoachScreenKt$lambda-9$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope OutlinedButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1526874214, i, -1, "com.example.rungps.ui.coach.ComposableSingletons$TrainingCoachScreenKt.lambda-9.<anonymous> (TrainingCoachScreen.kt:362)");
            }
            TextKt.m2376Text4IGK_g("Cancel", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-10, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f75lambda10 = ComposableLambdaKt.composableLambdaInstance(661712214, false, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.coach.ComposableSingletons$TrainingCoachScreenKt$lambda-10$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(661712214, i, -1, "com.example.rungps.ui.coach.ComposableSingletons$TrainingCoachScreenKt.lambda-10.<anonymous> (TrainingCoachScreen.kt:340)");
            }
            TextKt.m2376Text4IGK_g("Start plan?", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-11, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f76lambda11 = ComposableLambdaKt.composableLambdaInstance(-1886743071, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.coach.ComposableSingletons$TrainingCoachScreenKt$lambda-11$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope Button, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1886743071, i, -1, "com.example.rungps.ui.coach.ComposableSingletons$TrainingCoachScreenKt.lambda-11.<anonymous> (TrainingCoachScreen.kt:394)");
            }
            TextKt.m2376Text4IGK_g("Save & start", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-12, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f77lambda12 = ComposableLambdaKt.composableLambdaInstance(-925786531, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.coach.ComposableSingletons$TrainingCoachScreenKt$lambda-12$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope OutlinedButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-925786531, i, -1, "com.example.rungps.ui.coach.ComposableSingletons$TrainingCoachScreenKt.lambda-12.<anonymous> (TrainingCoachScreen.kt:396)");
            }
            TextKt.m2376Text4IGK_g("Cancel", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-13, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f78lambda13 = ComposableLambdaKt.composableLambdaInstance(877186893, false, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.coach.ComposableSingletons$TrainingCoachScreenKt$lambda-13$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(877186893, i, -1, "com.example.rungps.ui.coach.ComposableSingletons$TrainingCoachScreenKt.lambda-13.<anonymous> (TrainingCoachScreen.kt:370)");
            }
            TextKt.m2376Text4IGK_g("Save as template?", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$app_sideload, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6931getLambda1$app_sideload() {
        return f74lambda1;
    }

    /* renamed from: getLambda-10$app_sideload, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6932getLambda10$app_sideload() {
        return f75lambda10;
    }

    /* renamed from: getLambda-11$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m6933getLambda11$app_sideload() {
        return f76lambda11;
    }

    /* renamed from: getLambda-12$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m6934getLambda12$app_sideload() {
        return f77lambda12;
    }

    /* renamed from: getLambda-13$app_sideload, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6935getLambda13$app_sideload() {
        return f78lambda13;
    }

    /* renamed from: getLambda-2$app_sideload, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6936getLambda2$app_sideload() {
        return f79lambda2;
    }

    /* renamed from: getLambda-3$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m6937getLambda3$app_sideload() {
        return f80lambda3;
    }

    /* renamed from: getLambda-4$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m6938getLambda4$app_sideload() {
        return f81lambda4;
    }

    /* renamed from: getLambda-5$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m6939getLambda5$app_sideload() {
        return f82lambda5;
    }

    /* renamed from: getLambda-6$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m6940getLambda6$app_sideload() {
        return f83lambda6;
    }

    /* renamed from: getLambda-7$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m6941getLambda7$app_sideload() {
        return f84lambda7;
    }

    /* renamed from: getLambda-8$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m6942getLambda8$app_sideload() {
        return f85lambda8;
    }

    /* renamed from: getLambda-9$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m6943getLambda9$app_sideload() {
        return f86lambda9;
    }
}
