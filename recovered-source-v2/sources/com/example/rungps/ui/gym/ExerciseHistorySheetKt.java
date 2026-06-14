package com.example.rungps.ui.gym;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
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
import com.example.rungps.analytics.ExerciseHistoryPoint;
import com.example.rungps.ui.components.BarChartValue;
import com.example.rungps.ui.components.LabeledBarChartKt;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;

/* compiled from: ExerciseHistorySheet.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"ExerciseHistoryDialog", "", "exerciseName", "", "points", "", "Lcom/example/rungps/analytics/ExerciseHistoryPoint;", "onDismiss", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_sideload"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExerciseHistorySheetKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExerciseHistoryDialog$lambda$0(String str, List list, Function0 function0, int i, Composer composer, int i2) {
        ExerciseHistoryDialog(str, list, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ExerciseHistoryDialog(final String exerciseName, final List<ExerciseHistoryPoint> points, final Function0<Unit> onDismiss, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(exerciseName, "exerciseName");
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer startRestartGroup = composer.startRestartGroup(2078421801);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(exerciseName) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(points) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(onDismiss) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2078421801, i2, -1, "com.example.rungps.ui.gym.ExerciseHistoryDialog (ExerciseHistorySheet.kt:24)");
            }
            composer2 = startRestartGroup;
            AndroidAlertDialog_androidKt.m1443AlertDialogOix01E0(onDismiss, ComposableLambdaKt.rememberComposableLambda(1092046305, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.gym.ExerciseHistorySheetKt$ExerciseHistoryDialog$1
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
                        ComposerKt.traceEventStart(1092046305, i3, -1, "com.example.rungps.ui.gym.ExerciseHistoryDialog.<anonymous> (ExerciseHistorySheet.kt:91)");
                    }
                    ButtonKt.TextButton(onDismiss, null, false, null, null, null, null, null, null, ComposableSingletons$ExerciseHistorySheetKt.INSTANCE.m7055getLambda1$app_sideload(), composer3, 805306368, 510);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), null, null, null, ComposableLambdaKt.rememberComposableLambda(-1852600739, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.gym.ExerciseHistorySheetKt$ExerciseHistoryDialog$2
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
                        ComposerKt.traceEventStart(-1852600739, i3, -1, "com.example.rungps.ui.gym.ExerciseHistoryDialog.<anonymous> (ExerciseHistorySheet.kt:27)");
                    }
                    TextKt.m2376Text4IGK_g(exerciseName, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(632462972, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.gym.ExerciseHistorySheetKt$ExerciseHistoryDialog$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    Double valueOf;
                    Integer valueOf2;
                    String str;
                    String str2;
                    boolean z;
                    String str3;
                    if ((i3 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(632462972, i3, -1, "com.example.rungps.ui.gym.ExerciseHistoryDialog.<anonymous> (ExerciseHistorySheet.kt:29)");
                        }
                        Integer num = null;
                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
                        List<ExerciseHistoryPoint> list = points;
                        ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer3, 6);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer m3336constructorimpl = Updater.m3336constructorimpl(composer3);
                        Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        if (list.isEmpty()) {
                            composer3.startReplaceGroup(1208077368);
                            TextKt.m2376Text4IGK_g("No logged sets yet.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 6, 0, 131066);
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(1208295050);
                            List<ExerciseHistoryPoint> list2 = list;
                            Iterator<T> it = list2.iterator();
                            if (it.hasNext()) {
                                double weightKg = ((ExerciseHistoryPoint) it.next()).getWeightKg();
                                while (it.hasNext()) {
                                    weightKg = Math.max(weightKg, ((ExerciseHistoryPoint) it.next()).getWeightKg());
                                }
                                valueOf = Double.valueOf(weightKg);
                            } else {
                                valueOf = null;
                            }
                            double doubleValue = valueOf != null ? valueOf.doubleValue() : 0.0d;
                            Iterator<T> it2 = list2.iterator();
                            if (it2.hasNext()) {
                                ExerciseHistoryPoint exerciseHistoryPoint = (ExerciseHistoryPoint) it2.next();
                                int bestReps = exerciseHistoryPoint.getBestReps();
                                Integer reps = exerciseHistoryPoint.getReps();
                                valueOf2 = Integer.valueOf(RangesKt.coerceAtLeast(bestReps, reps != null ? reps.intValue() : 0));
                                while (it2.hasNext()) {
                                    ExerciseHistoryPoint exerciseHistoryPoint2 = (ExerciseHistoryPoint) it2.next();
                                    int bestReps2 = exerciseHistoryPoint2.getBestReps();
                                    Integer reps2 = exerciseHistoryPoint2.getReps();
                                    Integer valueOf3 = Integer.valueOf(RangesKt.coerceAtLeast(bestReps2, reps2 != null ? reps2.intValue() : 0));
                                    if (valueOf2.compareTo(valueOf3) < 0) {
                                        valueOf2 = valueOf3;
                                    }
                                }
                            } else {
                                valueOf2 = null;
                            }
                            Integer num2 = valueOf2;
                            int intValue = num2 != null ? num2.intValue() : 0;
                            Iterator<T> it3 = list2.iterator();
                            if (it3.hasNext()) {
                                num = Integer.valueOf(((ExerciseHistoryPoint) it3.next()).getSetsDone());
                                while (it3.hasNext()) {
                                    Integer valueOf4 = Integer.valueOf(((ExerciseHistoryPoint) it3.next()).getSetsDone());
                                    if (num.compareTo(valueOf4) < 0) {
                                        num = valueOf4;
                                    }
                                }
                            }
                            Integer num3 = num;
                            int intValue2 = num3 != null ? num3.intValue() : 0;
                            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                            String format = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(doubleValue)}, 1));
                            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                            String str4 = "format(...)";
                            String str5 = "%.1f";
                            TextKt.m2376Text4IGK_g("Best: " + format + " kg · " + intValue + " reps · " + intValue2 + " sets logged", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getTitleSmall(), composer3, 0, 0, 65534);
                            TextKt.m2376Text4IGK_g("Top sessions by weight", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getLabelMedium(), composer3, 6, 0, 65530);
                            Composer composer4 = composer3;
                            composer4.startReplaceGroup(454652314);
                            final Comparator comparator = new Comparator() { // from class: com.example.rungps.ui.gym.ExerciseHistorySheetKt$ExerciseHistoryDialog$3$invoke$lambda$10$$inlined$compareByDescending$1
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.util.Comparator
                                public final int compare(T t, T t2) {
                                    return ComparisonsKt.compareValues(Double.valueOf(((ExerciseHistoryPoint) t2).getWeightKg()), Double.valueOf(((ExerciseHistoryPoint) t).getWeightKg()));
                                }
                            };
                            final Comparator comparator2 = new Comparator() { // from class: com.example.rungps.ui.gym.ExerciseHistorySheetKt$ExerciseHistoryDialog$3$invoke$lambda$10$$inlined$thenByDescending$1
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.util.Comparator
                                public final int compare(T t, T t2) {
                                    int compare = comparator.compare(t, t2);
                                    if (compare != 0) {
                                        return compare;
                                    }
                                    int reps3 = ((ExerciseHistoryPoint) t2).getReps();
                                    if (reps3 == null) {
                                        reps3 = 0;
                                    }
                                    Integer num4 = reps3;
                                    int reps4 = ((ExerciseHistoryPoint) t).getReps();
                                    if (reps4 == null) {
                                        reps4 = 0;
                                    }
                                    return ComparisonsKt.compareValues(num4, reps4);
                                }
                            };
                            List<ExerciseHistoryPoint> list3 = list2;
                            Iterator it4 = CollectionsKt.take(CollectionsKt.sortedWith(list3, new Comparator() { // from class: com.example.rungps.ui.gym.ExerciseHistorySheetKt$ExerciseHistoryDialog$3$invoke$lambda$10$$inlined$thenByDescending$2
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.util.Comparator
                                public final int compare(T t, T t2) {
                                    int compare = comparator2.compare(t, t2);
                                    return compare != 0 ? compare : ComparisonsKt.compareValues(Long.valueOf(((ExerciseHistoryPoint) t2).getSessionStartedAtMs()), Long.valueOf(((ExerciseHistoryPoint) t).getSessionStartedAtMs()));
                                }
                            }), 6).iterator();
                            while (true) {
                                str = ": ";
                                if (!it4.hasNext()) {
                                    break;
                                }
                                ExerciseHistoryPoint exerciseHistoryPoint3 = (ExerciseHistoryPoint) it4.next();
                                String format2 = new SimpleDateFormat("d MMM yyyy", Locale.getDefault()).format(new Date(exerciseHistoryPoint3.getSessionStartedAtMs()));
                                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                                String str6 = str5;
                                String format3 = String.format(Locale.US, str6, Arrays.copyOf(new Object[]{Double.valueOf(exerciseHistoryPoint3.getWeightKg())}, 1));
                                String str7 = str4;
                                Intrinsics.checkNotNullExpressionValue(format3, str7);
                                Object reps3 = exerciseHistoryPoint3.getReps();
                                if (reps3 == null) {
                                    reps3 = "?";
                                }
                                TextKt.m2376Text4IGK_g(format2 + ": " + format3 + " kg × " + reps3, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer4, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getBodySmall(), composer3, 0, 0, 65530);
                                composer4 = composer3;
                                str5 = str6;
                                list3 = list3;
                                str4 = str7;
                            }
                            String str8 = str4;
                            String str9 = str5;
                            composer3.endReplaceGroup();
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d/M", Locale.getDefault());
                            List<ExerciseHistoryPoint> sortedWith = CollectionsKt.sortedWith(list3, new Comparator() { // from class: com.example.rungps.ui.gym.ExerciseHistorySheetKt$ExerciseHistoryDialog$3$invoke$lambda$10$$inlined$sortedBy$1
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.util.Comparator
                                public final int compare(T t, T t2) {
                                    return ComparisonsKt.compareValues(Long.valueOf(((ExerciseHistoryPoint) t).getSessionStartedAtMs()), Long.valueOf(((ExerciseHistoryPoint) t2).getSessionStartedAtMs()));
                                }
                            });
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sortedWith, 10));
                            for (ExerciseHistoryPoint exerciseHistoryPoint4 : sortedWith) {
                                int bestReps3 = exerciseHistoryPoint4.getBestReps();
                                Integer reps4 = exerciseHistoryPoint4.getReps();
                                int coerceAtLeast = RangesKt.coerceAtLeast(bestReps3, reps4 != null ? reps4.intValue() : 0);
                                String format4 = simpleDateFormat.format(new Date(exerciseHistoryPoint4.getSessionStartedAtMs()));
                                Intrinsics.checkNotNullExpressionValue(format4, str8);
                                arrayList.add(new BarChartValue(format4, coerceAtLeast));
                            }
                            String str10 = str8;
                            LabeledBarChartKt.LabeledVerticalBarChart(arrayList, null, " reps", "Need at least one session.", null, composer3, 3456, 18);
                            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("d MMM", Locale.getDefault());
                            for (ExerciseHistoryPoint exerciseHistoryPoint5 : CollectionsKt.reversed(CollectionsKt.takeLast(list, 4))) {
                                int bestReps4 = exerciseHistoryPoint5.getBestReps();
                                Integer reps5 = exerciseHistoryPoint5.getReps();
                                int coerceAtLeast2 = RangesKt.coerceAtLeast(bestReps4, reps5 != null ? reps5.intValue() : 0);
                                String format5 = simpleDateFormat2.format(new Date(exerciseHistoryPoint5.getSessionStartedAtMs()));
                                int setsDone = exerciseHistoryPoint5.getSetsDone();
                                if (exerciseHistoryPoint5.getWeightKg() > 0.0d) {
                                    StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                                    z = true;
                                    str2 = str9;
                                    String format6 = String.format(Locale.US, str2, Arrays.copyOf(new Object[]{Double.valueOf(exerciseHistoryPoint5.getWeightKg())}, 1));
                                    Intrinsics.checkNotNullExpressionValue(format6, str10);
                                    str3 = " @ " + format6 + " kg";
                                } else {
                                    str2 = str9;
                                    z = true;
                                    str3 = "";
                                }
                                TextKt.m2376Text4IGK_g(format5 + str + setsDone + " sets · best " + coerceAtLeast2 + " reps" + str3, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodySmall(), composer3, 0, 0, 65530);
                                str9 = str2;
                                simpleDateFormat2 = simpleDateFormat2;
                                str = str;
                                str10 = str10;
                            }
                            composer3.endReplaceGroup();
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, startRestartGroup, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, composer2, ((i2 >> 6) & 14) | 1769520, 0, 16284);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.gym.ExerciseHistorySheetKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ExerciseHistoryDialog$lambda$0;
                    ExerciseHistoryDialog$lambda$0 = ExerciseHistorySheetKt.ExerciseHistoryDialog$lambda$0(exerciseName, points, onDismiss, i, (Composer) obj, ((Integer) obj2).intValue());
                    return ExerciseHistoryDialog$lambda$0;
                }
            });
        }
    }
}
