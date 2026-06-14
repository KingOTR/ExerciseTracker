package com.example.rungps.ui.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;

/* compiled from: HomeTrendCards.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\u001aE\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002\u001a \u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u000f\u001a\u00020\rH\u0002\u001a\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\rH\u0002\u001a\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002\u001a\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¨\u0006\u0016"}, d2 = {"HomeTrendCards", "", "runKmLast4Weeks", "", "", "rideKmLast4Weeks", "gymTonnageLast4Weeks", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "padWeekSeries", "values", "weekDeltaHint", "", "weeks", "unit", "formatDelta", "delta", "formatKm", "km", "formatGymKg", "kg", "app_sideload"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HomeTrendCardsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeTrendCards$lambda$3(List list, List list2, List list3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HomeTrendCards(list, list2, list3, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeTrendCards$lambda$5(List list, List list2, List list3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HomeTrendCards(list, list2, list3, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HomeTrendCards(final List<Double> runKmLast4Weeks, List<Double> list, List<Double> list2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        List<Double> list3;
        int i4;
        List<Double> list4;
        int i5;
        Modifier modifier2;
        List<Double> emptyList;
        List<Double> list5;
        Iterator<T> it;
        final List<Double> list6;
        final Modifier modifier3;
        List<Double> list7;
        Iterator<T> it2;
        List<Double> list8;
        Iterator<T> it3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(runKmLast4Weeks, "runKmLast4Weeks");
        Composer startRestartGroup = composer.startRestartGroup(-727295061);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(runKmLast4Weeks) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            list3 = list;
            i3 |= startRestartGroup.changedInstance(list3) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                list4 = list2;
                i3 |= startRestartGroup.changedInstance(list4) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    modifier2 = modifier;
                    i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
                    if ((i3 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                        emptyList = i6 == 0 ? CollectionsKt.emptyList() : list3;
                        List<Double> emptyList2 = i4 == 0 ? CollectionsKt.emptyList() : list4;
                        Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-727295061, i3, -1, "com.example.rungps.ui.components.HomeTrendCards (HomeTrendCards.kt:18)");
                        }
                        List<Double> padWeekSeries = padWeekSeries(runKmLast4Weeks);
                        List<Double> padWeekSeries2 = padWeekSeries(emptyList);
                        List<Double> padWeekSeries3 = padWeekSeries(emptyList2);
                        list5 = padWeekSeries;
                        if ((list5 instanceof Collection) || !list5.isEmpty()) {
                            it = list5.iterator();
                            while (it.hasNext()) {
                                if (((Number) it.next()).doubleValue() > 0.01d) {
                                    break;
                                }
                            }
                        }
                        list7 = padWeekSeries2;
                        if ((list7 instanceof Collection) || !list7.isEmpty()) {
                            it2 = list7.iterator();
                            while (it2.hasNext()) {
                                if (((Number) it2.next()).doubleValue() > 0.01d) {
                                    break;
                                }
                            }
                        }
                        list8 = padWeekSeries3;
                        if ((list8 instanceof Collection) || !list8.isEmpty()) {
                            it3 = list8.iterator();
                            while (it3.hasNext()) {
                                if (((Number) it3.next()).doubleValue() > 1.0d) {
                                    ColorScheme colorScheme = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable);
                                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                                    Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
                                    Updater.m3343setimpl(m3336constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    Modifier modifier5 = modifier4;
                                    MetricTileKt.m6967MetricTileT042LqI("Run km", formatKm(((Number) CollectionsKt.last((List) padWeekSeries)).doubleValue()), colorScheme.getPrimary(), RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), weekDeltaHint$default(padWeekSeries, null, 2, null), startRestartGroup, 6, 0);
                                    MetricTileKt.m6967MetricTileT042LqI("Ride km", formatKm(((Number) CollectionsKt.last((List) padWeekSeries2)).doubleValue()), Color.m3842copywmQWz5c$default(colorScheme.getPrimary(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), weekDeltaHint$default(padWeekSeries2, null, 2, null), startRestartGroup, 6, 0);
                                    MetricTileKt.m6967MetricTileT042LqI("Gym kg", formatGymKg(((Number) CollectionsKt.last((List) padWeekSeries3)).doubleValue()), colorScheme.getSecondary(), RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), weekDeltaHint(padWeekSeries3, "kg"), startRestartGroup, 6, 0);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    startRestartGroup.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    list6 = emptyList2;
                                    modifier3 = modifier5;
                                }
                            }
                        }
                        final Modifier modifier6 = modifier4;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                            final List<Double> list9 = emptyList;
                            final List<Double> list10 = emptyList2;
                            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.components.HomeTrendCardsKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit HomeTrendCards$lambda$3;
                                    HomeTrendCards$lambda$3 = HomeTrendCardsKt.HomeTrendCards$lambda$3(runKmLast4Weeks, list9, list10, modifier6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    return HomeTrendCards$lambda$3;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    startRestartGroup.skipToGroupEnd();
                    emptyList = list3;
                    list6 = list4;
                    modifier3 = modifier2;
                    ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
                    if (endRestartGroup2 != null) {
                        final List<Double> list11 = emptyList;
                        endRestartGroup2.updateScope(new Function2() { // from class: com.example.rungps.ui.components.HomeTrendCardsKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit HomeTrendCards$lambda$5;
                                HomeTrendCards$lambda$5 = HomeTrendCardsKt.HomeTrendCards$lambda$5(runKmLast4Weeks, list11, list6, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return HomeTrendCards$lambda$5;
                            }
                        });
                        return;
                    }
                    return;
                }
                modifier2 = modifier;
                if ((i3 & 1171) == 1170) {
                }
                if (i6 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                List<Double> padWeekSeries4 = padWeekSeries(runKmLast4Weeks);
                List<Double> padWeekSeries22 = padWeekSeries(emptyList);
                List<Double> padWeekSeries32 = padWeekSeries(emptyList2);
                list5 = padWeekSeries4;
                if (list5 instanceof Collection) {
                }
                it = list5.iterator();
                while (it.hasNext()) {
                }
                list7 = padWeekSeries22;
                if (list7 instanceof Collection) {
                }
                it2 = list7.iterator();
                while (it2.hasNext()) {
                }
                list8 = padWeekSeries32;
                if (list8 instanceof Collection) {
                }
                it3 = list8.iterator();
                while (it3.hasNext()) {
                }
                final Modifier modifier62 = modifier4;
                if (ComposerKt.isTraceInProgress()) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            list4 = list2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            modifier2 = modifier;
            if ((i3 & 1171) == 1170) {
            }
            if (i6 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            List<Double> padWeekSeries42 = padWeekSeries(runKmLast4Weeks);
            List<Double> padWeekSeries222 = padWeekSeries(emptyList);
            List<Double> padWeekSeries322 = padWeekSeries(emptyList2);
            list5 = padWeekSeries42;
            if (list5 instanceof Collection) {
            }
            it = list5.iterator();
            while (it.hasNext()) {
            }
            list7 = padWeekSeries222;
            if (list7 instanceof Collection) {
            }
            it2 = list7.iterator();
            while (it2.hasNext()) {
            }
            list8 = padWeekSeries322;
            if (list8 instanceof Collection) {
            }
            it3 = list8.iterator();
            while (it3.hasNext()) {
            }
            final Modifier modifier622 = modifier4;
            if (ComposerKt.isTraceInProgress()) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        list3 = list;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        list4 = list2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
        }
        if (i6 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        List<Double> padWeekSeries422 = padWeekSeries(runKmLast4Weeks);
        List<Double> padWeekSeries2222 = padWeekSeries(emptyList);
        List<Double> padWeekSeries3222 = padWeekSeries(emptyList2);
        list5 = padWeekSeries422;
        if (list5 instanceof Collection) {
        }
        it = list5.iterator();
        while (it.hasNext()) {
        }
        list7 = padWeekSeries2222;
        if (list7 instanceof Collection) {
        }
        it2 = list7.iterator();
        while (it2.hasNext()) {
        }
        list8 = padWeekSeries3222;
        if (list8 instanceof Collection) {
        }
        it3 = list8.iterator();
        while (it3.hasNext()) {
        }
        final Modifier modifier6222 = modifier4;
        if (ComposerKt.isTraceInProgress()) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final List<Double> padWeekSeries(List<Double> list) {
        boolean isEmpty = list.isEmpty();
        Double valueOf = Double.valueOf(0.0d);
        int i = 0;
        if (isEmpty) {
            ArrayList arrayList = new ArrayList(4);
            while (i < 4) {
                arrayList.add(valueOf);
                i++;
            }
            return arrayList;
        }
        List takeLast = CollectionsKt.takeLast(list, 4);
        int size = 4 - takeLast.size();
        ArrayList arrayList2 = new ArrayList(size);
        while (i < size) {
            arrayList2.add(valueOf);
            i++;
        }
        return CollectionsKt.plus((Collection) arrayList2, (Iterable) takeLast);
    }

    static /* synthetic */ String weekDeltaHint$default(List list, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "km";
        }
        return weekDeltaHint(list, str);
    }

    private static final String weekDeltaHint(List<Double> list, String str) {
        Double d = (Double) CollectionsKt.lastOrNull((List) list);
        double doubleValue = d != null ? d.doubleValue() : 0.0d;
        Double d2 = (Double) CollectionsKt.lastOrNull(CollectionsKt.dropLast(list, 1));
        double doubleValue2 = doubleValue - (d2 != null ? d2.doubleValue() : 0.0d);
        double d3 = Intrinsics.areEqual(str, "kg") ? 50.0d : 0.2d;
        if (doubleValue2 > d3) {
            return "↑ " + formatDelta(doubleValue2, str) + " vs prior week";
        }
        if (doubleValue2 < (-d3)) {
            return "↓ " + formatDelta(-doubleValue2, str) + " vs prior week";
        }
        return "Similar to prior week";
    }

    private static final String formatDelta(double d, String str) {
        if (Intrinsics.areEqual(str, "kg")) {
            return formatGymKg(d);
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    private static final String formatKm(double d) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    private static final String formatGymKg(double d) {
        if (d >= 10000.0d) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.US, "%.1fk", Arrays.copyOf(new Object[]{Double.valueOf(d / 1000.0d)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return format;
        }
        if (d >= 1000.0d) {
            return (MathKt.roundToInt((d / 1000.0d) * 10) / 10.0d) + "k";
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String format2 = String.format(Locale.US, "%.0f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        return format2;
    }
}
