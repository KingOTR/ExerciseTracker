package com.example.rungps.ui.gear;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
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
import androidx.compose.ui.unit.Dp;
import androidx.health.platform.client.SdkConfig;
import androidx.profileinstaller.ProfileVerifier;
import com.example.rungps.gear.GearAdvice;
import com.example.rungps.gear.GearTypes;
import com.example.rungps.ui.components.TabUiKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GearAdviceCards.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \u001a3\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\u0015\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\u0010\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eX\u008a\u008e\u0002"}, d2 = {"GearAdviceSection", "", "modifier", "Landroidx/compose/ui/Modifier;", "maxCards", "", "onOpenGear", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;ILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "GearAdviceRow", "advice", "Lcom/example/rungps/gear/GearAdvice$Advice;", "(Lcom/example/rungps/gear/GearAdvice$Advice;Landroidx/compose/runtime/Composer;I)V", "app_sideload", ""}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GearAdviceCardsKt {

    /* compiled from: GearAdviceCards.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GearAdvice.Urgency.values().length];
            try {
                iArr[GearAdvice.Urgency.REPLACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GearAdvice.Urgency.SOON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GearAdvice.Urgency.GOOD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GearAdviceRow$lambda$10(GearAdvice.Advice advice, int i, Composer composer, int i2) {
        GearAdviceRow(advice, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float GearAdviceRow$lambda$9$lambda$8$lambda$7$lambda$6(float f) {
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GearAdviceSection$lambda$4(Modifier modifier, int i, Function0 function0, int i2, int i3, Composer composer, int i4) {
        GearAdviceSection(modifier, i, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GearAdviceSection$lambda$5(Modifier modifier, int i, Function0 function0, int i2, int i3, Composer composer, int i4) {
        GearAdviceSection(modifier, i, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GearAdviceSection(Modifier modifier, int i, Function0<Unit> function0, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        int i5;
        int i6;
        final Function0<Unit> function02;
        Modifier.Companion companion;
        int i7;
        Object rememberedValue;
        final MutableState mutableState;
        boolean changedInstance;
        GearAdviceCardsKt$GearAdviceSection$1$1 rememberedValue2;
        Composer startRestartGroup = composer.startRestartGroup(-97532599);
        int i8 = i3 & 1;
        if (i8 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 = i;
            i4 |= startRestartGroup.changed(i) ? 32 : 16;
            i6 = i3 & 4;
            if (i6 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                function02 = function0;
                i4 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
                if ((i4 & 147) == 146 || !startRestartGroup.getSkipping()) {
                    companion = i8 != 0 ? Modifier.INSTANCE : modifier2;
                    i7 = i9 != 0 ? 2 : i5;
                    if (i6 != 0) {
                        function02 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-97532599, i4, -1, "com.example.rungps.ui.gear.GearAdviceSection (GearAdviceCards.kt:33)");
                    }
                    ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume = startRestartGroup.consume(localContext);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    Context context = (Context) consume;
                    startRestartGroup.startReplaceGroup(-98166244);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    mutableState = (MutableState) rememberedValue;
                    startRestartGroup.endReplaceGroup();
                    Unit unit = Unit.INSTANCE;
                    startRestartGroup.startReplaceGroup(-98163190);
                    changedInstance = ((i4 & SdkConfig.SDK_VERSION) == 32) | startRestartGroup.changedInstance(context);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new GearAdviceCardsKt$GearAdviceSection$1$1(context, i7, mutableState, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, 6);
                    if (GearAdviceSection$lambda$1(mutableState).isEmpty()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final Modifier modifier3 = companion;
                            final int i10 = i7;
                            final Function0<Unit> function03 = function02;
                            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.gear.GearAdviceCardsKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit GearAdviceSection$lambda$4;
                                    GearAdviceSection$lambda$4 = GearAdviceCardsKt.GearAdviceSection$lambda$4(Modifier.this, i10, function03, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    return GearAdviceSection$lambda$4;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    TabUiKt.TabSectionCard("Gear check", companion, ComposableLambdaKt.rememberComposableLambda(1415949898, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.gear.GearAdviceCardsKt$GearAdviceSection$3
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                            invoke(columnScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(ColumnScope TabSectionCard, Composer composer2, int i11) {
                            List GearAdviceSection$lambda$1;
                            Intrinsics.checkNotNullParameter(TabSectionCard, "$this$TabSectionCard");
                            if ((i11 & 17) != 16 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1415949898, i11, -1, "com.example.rungps.ui.gear.GearAdviceSection.<anonymous> (GearAdviceCards.kt:45)");
                                }
                                Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(10));
                                Function0<Unit> function04 = function02;
                                MutableState<List<GearAdvice.Advice>> mutableState2 = mutableState;
                                ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer2, 6);
                                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, companion2);
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                Composer m3336constructorimpl = Updater.m3336constructorimpl(composer2);
                                Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                composer2.startReplaceGroup(-1623534852);
                                GearAdviceSection$lambda$1 = GearAdviceCardsKt.GearAdviceSection$lambda$1(mutableState2);
                                Iterator it = GearAdviceSection$lambda$1.iterator();
                                while (it.hasNext()) {
                                    GearAdviceCardsKt.GearAdviceRow((GearAdvice.Advice) it.next(), composer2, 0);
                                }
                                composer2.endReplaceGroup();
                                composer2.startReplaceGroup(-1623531881);
                                if (function04 != null) {
                                    ButtonKt.TextButton(function04, null, false, null, null, null, null, null, null, ComposableSingletons$GearAdviceCardsKt.INSTANCE.m7026getLambda1$app_sideload(), composer2, 805306368, 510);
                                }
                                composer2.endReplaceGroup();
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
                    }, startRestartGroup, 54), startRestartGroup, ((i4 << 3) & SdkConfig.SDK_VERSION) | 390, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    companion = modifier2;
                    i7 = i5;
                }
                final Function0<Unit> function04 = function02;
                ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
                if (endRestartGroup2 != null) {
                    final Modifier modifier4 = companion;
                    final int i11 = i7;
                    endRestartGroup2.updateScope(new Function2() { // from class: com.example.rungps.ui.gear.GearAdviceCardsKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit GearAdviceSection$lambda$5;
                            GearAdviceSection$lambda$5 = GearAdviceCardsKt.GearAdviceSection$lambda$5(Modifier.this, i11, function04, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            return GearAdviceSection$lambda$5;
                        }
                    });
                    return;
                }
                return;
            }
            function02 = function0;
            if ((i4 & 147) == 146) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i6 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(localContext2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Context context2 = (Context) consume2;
            startRestartGroup.startReplaceGroup(-98166244);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            mutableState = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            Unit unit2 = Unit.INSTANCE;
            startRestartGroup.startReplaceGroup(-98163190);
            changedInstance = ((i4 & SdkConfig.SDK_VERSION) == 32) | startRestartGroup.changedInstance(context2);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue2 = new GearAdviceCardsKt$GearAdviceSection$1$1(context2, i7, mutableState, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, 6);
            if (GearAdviceSection$lambda$1(mutableState).isEmpty()) {
            }
        }
        i5 = i;
        i6 = i3 & 4;
        if (i6 == 0) {
        }
        function02 = function0;
        if ((i4 & 147) == 146) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i6 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<Context> localContext22 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume22 = startRestartGroup.consume(localContext22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Context context22 = (Context) consume22;
        startRestartGroup.startReplaceGroup(-98166244);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        mutableState = (MutableState) rememberedValue;
        startRestartGroup.endReplaceGroup();
        Unit unit22 = Unit.INSTANCE;
        startRestartGroup.startReplaceGroup(-98163190);
        changedInstance = ((i4 & SdkConfig.SDK_VERSION) == 32) | startRestartGroup.changedInstance(context22);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue2 = new GearAdviceCardsKt$GearAdviceSection$1$1(context22, i7, mutableState, null);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(unit22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, 6);
        if (GearAdviceSection$lambda$1(mutableState).isEmpty()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<GearAdvice.Advice> GearAdviceSection$lambda$1(MutableState<List<GearAdvice.Advice>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GearAdviceRow(final GearAdvice.Advice advice, Composer composer, final int i) {
        int i2;
        long error;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(457003814);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(advice) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(457003814, i2, -1, "com.example.rungps.ui.gear.GearAdviceRow (GearAdviceCards.kt:57)");
            }
            int i3 = WhenMappings.$EnumSwitchMapping$0[advice.getUrgency().ordinal()];
            if (i3 == 1) {
                startRestartGroup.startReplaceGroup(-939118059);
                error = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getError();
                startRestartGroup.endReplaceGroup();
            } else if (i3 == 2) {
                startRestartGroup.startReplaceGroup(-939115912);
                error = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getTertiary();
                startRestartGroup.endReplaceGroup();
            } else {
                if (i3 != 3) {
                    startRestartGroup.startReplaceGroup(-939120642);
                    startRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                startRestartGroup.startReplaceGroup(-939113673);
                error = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getPrimary();
                startRestartGroup.endReplaceGroup();
            }
            long j = error;
            GearAdvice.Thresholds thresholds = GearAdvice.INSTANCE.thresholds(advice.getGearType());
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(4));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
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
            TextKt.m2376Text4IGK_g(GearTypes.INSTANCE.label(advice.getGearType()) + " · " + advice.getGearName(), (Modifier) null, j, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelMedium(), startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
            TextKt.m2376Text4IGK_g(advice.getMessage(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getBodySmall(), startRestartGroup, 0, 0, 65530);
            startRestartGroup.startReplaceGroup(1538722553);
            if (thresholds == null) {
                composer2 = startRestartGroup;
            } else {
                final float coerceIn = RangesKt.coerceIn((float) (advice.getTotalKm() / thresholds.getReplaceKm()), 0.0f, 1.0f);
                startRestartGroup.startReplaceGroup(1778225210);
                boolean changed = startRestartGroup.changed(coerceIn);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: com.example.rungps.ui.gear.GearAdviceCardsKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            float GearAdviceRow$lambda$9$lambda$8$lambda$7$lambda$6;
                            GearAdviceRow$lambda$9$lambda$8$lambda$7$lambda$6 = GearAdviceCardsKt.GearAdviceRow$lambda$9$lambda$8$lambda$7$lambda$6(coerceIn);
                            return Float.valueOf(GearAdviceRow$lambda$9$lambda$8$lambda$7$lambda$6);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                ProgressIndicatorKt.m2054LinearProgressIndicatorGJbTh5U((Function0) rememberedValue, PaddingKt.m688paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m6303constructorimpl(2), 0.0f, 0.0f, 13, null), j, 0L, 0, 0.0f, null, startRestartGroup, 48, MenuKt.InTransitionDuration);
                composer2 = startRestartGroup;
                TextKt.m2376Text4IGK_g(advice.getPercentOfLife() + "% of " + ((int) thresholds.getReplaceKm()) + " km guideline", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), composer2, 0, 0, 65530);
            }
            composer2.endReplaceGroup();
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
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.gear.GearAdviceCardsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit GearAdviceRow$lambda$10;
                    GearAdviceRow$lambda$10 = GearAdviceCardsKt.GearAdviceRow$lambda$10(GearAdvice.Advice.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return GearAdviceRow$lambda$10;
                }
            });
        }
    }
}
