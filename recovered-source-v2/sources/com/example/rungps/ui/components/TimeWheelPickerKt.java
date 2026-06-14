package com.example.rungps.ui.components;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
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
import androidx.health.platform.client.SdkConfig;
import com.google.firebase.firestore.model.Values;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TimeWheelPicker.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\u001aO\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001aI\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00142\u0006\u0010\u0015\u001a\u00020\b2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u0017\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\u0018²\u0006\n\u0010\u0019\u001a\u00020\bX\u008a\u0084\u0002"}, d2 = {"WheelItemHeight", "Landroidx/compose/ui/unit/Dp;", "F", "WheelViewportHeight", "WheelVerticalPad", "TimeWheelPicker", "", "hour", "", "minute", "onHourChange", "Lkotlin/Function1;", "onMinuteChange", "modifier", "Landroidx/compose/ui/Modifier;", "(IILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "NumberWheel", "label", "", "values", "", Values.VECTOR_MAP_VECTORS_KEY, "onValueChange", "(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_sideload", "centeredIndex"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TimeWheelPickerKt {
    private static final float WheelItemHeight;
    private static final float WheelVerticalPad;
    private static final float WheelViewportHeight;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NumberWheel$lambda$15(String str, List list, int i, Function1 function1, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        NumberWheel(str, list, i, function1, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimeWheelPicker$lambda$1(int i, int i2, Function1 function1, Function1 function12, Modifier modifier, int i3, int i4, Composer composer, int i5) {
        TimeWheelPicker(i, i2, function1, function12, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TimeWheelPicker(final int i, final int i2, final Function1<? super Integer, Unit> onHourChange, final Function1<? super Integer, Unit> onMinuteChange, Modifier modifier, Composer composer, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        int currentCompositeKeyHash;
        Composer m3336constructorimpl;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(onHourChange, "onHourChange");
        Intrinsics.checkNotNullParameter(onMinuteChange, "onMinuteChange");
        Composer startRestartGroup = composer.startRestartGroup(-1389532029);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (startRestartGroup.changed(i) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= startRestartGroup.changed(i2) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            i5 |= startRestartGroup.changedInstance(onHourChange) ? 256 : 128;
        }
        if ((i4 & 8) != 0) {
            i5 |= 3072;
        } else if ((i3 & 3072) == 0) {
            i5 |= startRestartGroup.changedInstance(onMinuteChange) ? 2048 : 1024;
        }
        int i7 = i4 & 16;
        if (i7 != 0) {
            i5 |= 24576;
        } else if ((i3 & 24576) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i6 = i5;
            if ((i6 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1389532029, i6, -1, "com.example.rungps.ui.components.TimeWheelPicker (TimeWheelPicker.kt:39)");
                }
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
                Updater.m3343setimpl(m3336constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                int i8 = i6 << 3;
                Modifier modifier5 = modifier4;
                NumberWheel("Hour", CollectionsKt.toList(new IntRange(0, 23)), i, onHourChange, RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, ((i6 << 6) & 896) | 6 | (i8 & 7168), 0);
                composer2 = startRestartGroup;
                TextKt.m2376Text4IGK_g(":", PaddingKt.m686paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m6303constructorimpl(4), 0.0f, 2, null), 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getHeadlineMedium(), composer2, 196662, 0, 65500);
                NumberWheel("Min", CollectionsKt.toList(new IntRange(0, 59)), i2, onMinuteChange, RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composer2, (i8 & 896) | 6 | (i6 & 7168), 0);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.components.TimeWheelPickerKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit TimeWheelPicker$lambda$1;
                        TimeWheelPicker$lambda$1 = TimeWheelPickerKt.TimeWheelPicker$lambda$1(i, i2, onHourChange, onMinuteChange, modifier3, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                        return TimeWheelPicker$lambda$1;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i6 = i5;
        if ((i6 & 9363) == 9362) {
        }
        if (i7 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
        Updater.m3343setimpl(m3336constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3336constructorimpl.getInserting()) {
        }
        m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
        Updater.m3343setimpl(m3336constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
        int i82 = i6 << 3;
        Modifier modifier52 = modifier4;
        NumberWheel("Hour", CollectionsKt.toList(new IntRange(0, 23)), i, onHourChange, RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, ((i6 << 6) & 896) | 6 | (i82 & 7168), 0);
        composer2 = startRestartGroup;
        TextKt.m2376Text4IGK_g(":", PaddingKt.m686paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m6303constructorimpl(4), 0.0f, 2, null), 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getHeadlineMedium(), composer2, 196662, 0, 65500);
        NumberWheel("Min", CollectionsKt.toList(new IntRange(0, 59)), i2, onMinuteChange, RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null), composer2, (i82 & 896) | 6 | (i6 & 7168), 0);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier52;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NumberWheel(final String label, final List<Integer> values, final int i, final Function1<? super Integer, Unit> onValueChange, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        boolean changed;
        Object rememberedValue;
        Iterator<T> it;
        Object next;
        Integer num;
        int intValue;
        int intValue2;
        boolean changed2;
        Object rememberedValue2;
        final LazyListState rememberLazyListState;
        Object rememberedValue3;
        State state;
        Integer valueOf;
        boolean changedInstance;
        TimeWheelPickerKt$NumberWheel$1$1 rememberedValue4;
        State state2;
        LazyListState lazyListState;
        Integer num2;
        int i6;
        boolean changedInstance2;
        TimeWheelPickerKt$NumberWheel$2$1 rememberedValue5;
        int currentCompositeKeyHash;
        Composer m3336constructorimpl;
        Composer composer2;
        int currentCompositeKeyHash2;
        Composer m3336constructorimpl2;
        boolean changedInstance3;
        Object rememberedValue6;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        int i7 = i;
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer startRestartGroup = composer.startRestartGroup(1676350096);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(label) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(values) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changed(i7) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(onValueChange) ? 2048 : 1024;
        }
        int i8 = i3 & 16;
        if (i8 != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i5 = i4;
            if ((i5 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1676350096, i5, -1, "com.example.rungps.ui.components.NumberWheel (TimeWheelPicker.kt:71)");
                }
                startRestartGroup.startReplaceGroup(1034969613);
                changed = ((i5 & 896) != 256) | startRestartGroup.changed(values);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    it = values.iterator();
                    if (it.hasNext()) {
                        next = null;
                    } else {
                        next = it.next();
                        if (it.hasNext()) {
                            int abs = Math.abs(((Number) next).intValue() - i7);
                            while (true) {
                                Object next2 = it.next();
                                int abs2 = Math.abs(((Number) next2).intValue() - i7);
                                if (abs > abs2) {
                                    abs = abs2;
                                    next = next2;
                                }
                                if (!it.hasNext()) {
                                    break;
                                } else {
                                    i7 = i;
                                }
                            }
                        }
                    }
                    num = (Integer) next;
                    if (num == null) {
                        intValue = num.intValue();
                    } else {
                        Integer num3 = (Integer) CollectionsKt.firstOrNull((List) values);
                        intValue = num3 != null ? num3.intValue() : 0;
                    }
                    rememberedValue = Integer.valueOf(intValue);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                intValue2 = ((Number) rememberedValue).intValue();
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1034974164);
                changed2 = startRestartGroup.changed(intValue2) | startRestartGroup.changed(values);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = Integer.valueOf(RangesKt.coerceAtLeast(values.indexOf(Integer.valueOf(intValue2)), 0));
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                final int intValue3 = ((Number) rememberedValue2).intValue();
                startRestartGroup.endReplaceGroup();
                rememberLazyListState = LazyListStateKt.rememberLazyListState(intValue3, 0, startRestartGroup, 0, 2);
                FlingBehavior rememberSnapFlingBehavior = LazyListSnapLayoutInfoProviderKt.rememberSnapFlingBehavior(rememberLazyListState, null, startRestartGroup, 0, 2);
                startRestartGroup.startReplaceGroup(1034983356);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.example.rungps.ui.components.TimeWheelPickerKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int NumberWheel$lambda$7$lambda$6;
                            NumberWheel$lambda$7$lambda$6 = TimeWheelPickerKt.NumberWheel$lambda$7$lambda$6(LazyListState.this, intValue3);
                            return Integer.valueOf(NumberWheel$lambda$7$lambda$6);
                        }
                    });
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                state = (State) rememberedValue3;
                startRestartGroup.endReplaceGroup();
                valueOf = Integer.valueOf(intValue2);
                startRestartGroup.startReplaceGroup(1034998716);
                changedInstance = startRestartGroup.changedInstance(values) | startRestartGroup.changed(intValue2) | startRestartGroup.changed(rememberLazyListState);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changedInstance || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    state2 = state;
                    lazyListState = rememberLazyListState;
                    num2 = valueOf;
                    i6 = intValue2;
                    rememberedValue4 = new TimeWheelPickerKt$NumberWheel$1$1(values, intValue2, rememberLazyListState, state2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                } else {
                    num2 = valueOf;
                    state2 = state;
                    lazyListState = rememberLazyListState;
                    i6 = intValue2;
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(num2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, 0);
                startRestartGroup.startReplaceGroup(1035004397);
                int i9 = i6;
                changedInstance2 = startRestartGroup.changedInstance(values) | startRestartGroup.changed(i9) | ((i5 & 7168) != 2048);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!changedInstance2 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new TimeWheelPickerKt$NumberWheel$2$1(state2, values, i9, onValueChange, null);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                startRestartGroup.endReplaceGroup();
                LazyListState lazyListState2 = lazyListState;
                EffectsKt.LaunchedEffect(lazyListState2, values, (Function2) rememberedValue5, startRestartGroup, i5 & SdkConfig.SDK_VERSION);
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier4);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.useNode();
                } else {
                    startRestartGroup.createNode(constructor);
                }
                m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
                Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Modifier modifier5 = modifier4;
                TextKt.m2376Text4IGK_g(label, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), startRestartGroup, i5 & 14, 0, 65530);
                Modifier m715height3ABfNKs = SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), WheelViewportHeight);
                Alignment center = Alignment.INSTANCE.getCenter();
                composer2 = startRestartGroup;
                ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, m715height3ABfNKs);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.useNode();
                } else {
                    composer2.createNode(constructor2);
                }
                m3336constructorimpl2 = Updater.m3336constructorimpl(composer2);
                Updater.m3343setimpl(m3336constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3336constructorimpl2.getInserting() || !Intrinsics.areEqual(m3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m3343setimpl(m3336constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                PaddingValues m679PaddingValuesYgX7TsA$default = PaddingKt.m679PaddingValuesYgX7TsA$default(0.0f, WheelVerticalPad, 1, null);
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                composer2.startReplaceGroup(-1313407842);
                changedInstance3 = composer2.changedInstance(values);
                rememberedValue6 = composer2.rememberedValue();
                if (!changedInstance3 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    final State state3 = state2;
                    rememberedValue6 = new Function1() { // from class: com.example.rungps.ui.components.TimeWheelPickerKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit NumberWheel$lambda$14$lambda$13$lambda$12$lambda$11;
                            NumberWheel$lambda$14$lambda$13$lambda$12$lambda$11 = TimeWheelPickerKt.NumberWheel$lambda$14$lambda$13$lambda$12$lambda$11(values, state3, (LazyListScope) obj);
                            return NumberWheel$lambda$14$lambda$13$lambda$12$lambda$11;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue6);
                }
                composer2.endReplaceGroup();
                LazyDslKt.LazyColumn(fillMaxWidth$default, lazyListState2, m679PaddingValuesYgX7TsA$default, false, null, centerHorizontally2, rememberSnapFlingBehavior, false, (Function1) rememberedValue6, composer2, 196998, 152);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.components.TimeWheelPickerKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit NumberWheel$lambda$15;
                        NumberWheel$lambda$15 = TimeWheelPickerKt.NumberWheel$lambda$15(label, values, i, onValueChange, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        return NumberWheel$lambda$15;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i5 = i4;
        if ((i5 & 9363) == 9362) {
        }
        if (i8 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(1034969613);
        changed = ((i5 & 896) != 256) | startRestartGroup.changed(values);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        it = values.iterator();
        if (it.hasNext()) {
        }
        num = (Integer) next;
        if (num == null) {
        }
        rememberedValue = Integer.valueOf(intValue);
        startRestartGroup.updateRememberedValue(rememberedValue);
        intValue2 = ((Number) rememberedValue).intValue();
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1034974164);
        changed2 = startRestartGroup.changed(intValue2) | startRestartGroup.changed(values);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue2 = Integer.valueOf(RangesKt.coerceAtLeast(values.indexOf(Integer.valueOf(intValue2)), 0));
        startRestartGroup.updateRememberedValue(rememberedValue2);
        final int intValue32 = ((Number) rememberedValue2).intValue();
        startRestartGroup.endReplaceGroup();
        rememberLazyListState = LazyListStateKt.rememberLazyListState(intValue32, 0, startRestartGroup, 0, 2);
        FlingBehavior rememberSnapFlingBehavior2 = LazyListSnapLayoutInfoProviderKt.rememberSnapFlingBehavior(rememberLazyListState, null, startRestartGroup, 0, 2);
        startRestartGroup.startReplaceGroup(1034983356);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
        }
        state = (State) rememberedValue3;
        startRestartGroup.endReplaceGroup();
        valueOf = Integer.valueOf(intValue2);
        startRestartGroup.startReplaceGroup(1034998716);
        changedInstance = startRestartGroup.changedInstance(values) | startRestartGroup.changed(intValue2) | startRestartGroup.changed(rememberLazyListState);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (changedInstance) {
        }
        state2 = state;
        lazyListState = rememberLazyListState;
        num2 = valueOf;
        i6 = intValue2;
        rememberedValue4 = new TimeWheelPickerKt$NumberWheel$1$1(values, intValue2, rememberLazyListState, state2, null);
        startRestartGroup.updateRememberedValue(rememberedValue4);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(num2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue4, startRestartGroup, 0);
        startRestartGroup.startReplaceGroup(1035004397);
        int i92 = i6;
        changedInstance2 = startRestartGroup.changedInstance(values) | startRestartGroup.changed(i92) | ((i5 & 7168) != 2048);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (!changedInstance2) {
        }
        rememberedValue5 = new TimeWheelPickerKt$NumberWheel$2$1(state2, values, i92, onValueChange, null);
        startRestartGroup.updateRememberedValue(rememberedValue5);
        startRestartGroup.endReplaceGroup();
        LazyListState lazyListState22 = lazyListState;
        EffectsKt.LaunchedEffect(lazyListState22, values, (Function2) rememberedValue5, startRestartGroup, i5 & SdkConfig.SDK_VERSION);
        Alignment.Horizontal centerHorizontally3 = Alignment.INSTANCE.getCenterHorizontally();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally3, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, modifier4);
        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
        Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3336constructorimpl.getInserting()) {
        }
        m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
        Updater.m3343setimpl(m3336constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        Modifier modifier52 = modifier4;
        TextKt.m2376Text4IGK_g(label, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), startRestartGroup, i5 & 14, 0, 65530);
        Modifier m715height3ABfNKs2 = SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), WheelViewportHeight);
        Alignment center2 = Alignment.INSTANCE.getCenter();
        composer2 = startRestartGroup;
        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(composer2, m715height3ABfNKs2);
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(composer2.getApplier() instanceof Applier)) {
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
        }
        m3336constructorimpl2 = Updater.m3336constructorimpl(composer2);
        Updater.m3343setimpl(m3336constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3336constructorimpl2.getInserting()) {
        }
        m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
        Updater.m3343setimpl(m3336constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        Alignment.Horizontal centerHorizontally22 = Alignment.INSTANCE.getCenterHorizontally();
        PaddingValues m679PaddingValuesYgX7TsA$default2 = PaddingKt.m679PaddingValuesYgX7TsA$default(0.0f, WheelVerticalPad, 1, null);
        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        composer2.startReplaceGroup(-1313407842);
        changedInstance3 = composer2.changedInstance(values);
        rememberedValue6 = composer2.rememberedValue();
        if (!changedInstance3) {
        }
        final State state32 = state2;
        rememberedValue6 = new Function1() { // from class: com.example.rungps.ui.components.TimeWheelPickerKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit NumberWheel$lambda$14$lambda$13$lambda$12$lambda$11;
                NumberWheel$lambda$14$lambda$13$lambda$12$lambda$11 = TimeWheelPickerKt.NumberWheel$lambda$14$lambda$13$lambda$12$lambda$11(values, state32, (LazyListScope) obj);
                return NumberWheel$lambda$14$lambda$13$lambda$12$lambda$11;
            }
        };
        composer2.updateRememberedValue(rememberedValue6);
        composer2.endReplaceGroup();
        LazyDslKt.LazyColumn(fillMaxWidth$default2, lazyListState22, m679PaddingValuesYgX7TsA$default2, false, null, centerHorizontally22, rememberSnapFlingBehavior2, false, (Function1) rememberedValue6, composer2, 196998, 152);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier52;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int NumberWheel$lambda$7$lambda$6(LazyListState lazyListState, int i) {
        Object obj;
        LazyListLayoutInfo layoutInfo = lazyListState.getLayoutInfo();
        if (layoutInfo.getVisibleItemsInfo().isEmpty()) {
            return i;
        }
        int viewportStartOffset = (layoutInfo.getViewportStartOffset() + layoutInfo.getViewportEndOffset()) / 2;
        Iterator<T> it = layoutInfo.getVisibleItemsInfo().iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) next;
                int abs = Math.abs((lazyListItemInfo.getOffset() + (lazyListItemInfo.getSize() / 2)) - viewportStartOffset);
                do {
                    Object next2 = it.next();
                    LazyListItemInfo lazyListItemInfo2 = (LazyListItemInfo) next2;
                    int abs2 = Math.abs((lazyListItemInfo2.getOffset() + (lazyListItemInfo2.getSize() / 2)) - viewportStartOffset);
                    if (abs > abs2) {
                        next = next2;
                        abs = abs2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        LazyListItemInfo lazyListItemInfo3 = (LazyListItemInfo) obj;
        return lazyListItemInfo3 != null ? lazyListItemInfo3.getIndex() : lazyListState.getFirstVisibleItemIndex();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NumberWheel$lambda$14$lambda$13$lambda$12$lambda$11(final List list, final State state, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.items$default(LazyColumn, list.size(), null, null, ComposableLambdaKt.composableLambdaInstance(119901271, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.components.TimeWheelPickerKt$NumberWheel$3$1$1$1$1
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope items, int i, Composer composer, int i2) {
                int i3;
                int NumberWheel$lambda$8;
                TextStyle bodyLarge;
                float f;
                Intrinsics.checkNotNullParameter(items, "$this$items");
                if ((i2 & 48) == 0) {
                    i3 = i2 | (composer.changed(i) ? 32 : 16);
                } else {
                    i3 = i2;
                }
                if ((i3 & 145) != 144 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(119901271, i3, -1, "com.example.rungps.ui.components.NumberWheel.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimeWheelPicker.kt:121)");
                    }
                    NumberWheel$lambda$8 = TimeWheelPickerKt.NumberWheel$lambda$8(state);
                    boolean z = i == NumberWheel$lambda$8;
                    String format = String.format("%02d", Arrays.copyOf(new Object[]{list.get(i)}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                    if (z) {
                        composer.startReplaceGroup(-71130029);
                        bodyLarge = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getHeadlineSmall();
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(-71030953);
                        bodyLarge = MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyLarge();
                        composer.endReplaceGroup();
                    }
                    TextStyle textStyle = bodyLarge;
                    FontWeight.Companion companion = FontWeight.INSTANCE;
                    FontWeight semiBold = z ? companion.getSemiBold() : companion.getNormal();
                    int m6192getCentere0LSkKk = TextAlign.INSTANCE.m6192getCentere0LSkKk();
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    f = TimeWheelPickerKt.WheelItemHeight;
                    TextKt.m2376Text4IGK_g(format, PaddingKt.m686paddingVpY3zN4$default(AlphaKt.alpha(SizeKt.m715height3ABfNKs(fillMaxWidth$default, f), z ? 1.0f : 0.45f), 0.0f, Dp.m6303constructorimpl(8), 1, null), 0L, 0L, (FontStyle) null, semiBold, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6185boximpl(m6192getCentere0LSkKk), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle, composer, 0, 0, 64988);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }), 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int NumberWheel$lambda$8(State<Integer> state) {
        return state.getValue().intValue();
    }

    static {
        float m6303constructorimpl = Dp.m6303constructorimpl(44);
        WheelItemHeight = m6303constructorimpl;
        float m6303constructorimpl2 = Dp.m6303constructorimpl(132);
        WheelViewportHeight = m6303constructorimpl2;
        WheelVerticalPad = Dp.m6303constructorimpl(Dp.m6303constructorimpl(m6303constructorimpl2 - m6303constructorimpl) / 2);
    }
}
