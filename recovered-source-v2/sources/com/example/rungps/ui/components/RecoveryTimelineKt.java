package com.example.rungps.ui.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
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
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.health.platform.client.SdkConfig;
import androidx.profileinstaller.ProfileVerifier;
import com.example.rungps.recovery.RecoveryModel;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: RecoveryTimeline.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\u001a-\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a\u001d\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\f\u001a\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u008e\u0002"}, d2 = {"RecoveryTimeline", "", "segments", "", "Lcom/example/rungps/ui/components/RecoveryTimelineSegment;", "nowMs", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "RecoverySegmentScale", "seg", "(Lcom/example/rungps/ui/components/RecoveryTimelineSegment;JLandroidx/compose/runtime/Composer;I)V", "formatShortTime", "", "ms", "app_sideload", "showEach", ""}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RecoveryTimelineKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecoverySegmentScale$lambda$17(RecoveryTimelineSegment recoveryTimelineSegment, long j, int i, Composer composer, int i2) {
        RecoverySegmentScale(recoveryTimelineSegment, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecoveryTimeline$lambda$0(List list, long j, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RecoveryTimeline(list, j, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecoveryTimeline$lambda$14(List list, long j, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RecoveryTimeline(list, j, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RecoveryTimeline(final List<RecoveryTimelineSegment> segments, final long j, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        long j2;
        long j3;
        Intrinsics.checkNotNullParameter(segments, "segments");
        Composer startRestartGroup = composer.startRestartGroup(1667620749);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(segments) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i3 & 147) == 146 || !startRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1667620749, i3, -1, "com.example.rungps.ui.components.RecoveryTimeline (RecoveryTimeline.kt:51)");
                }
                if (!segments.isEmpty()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        final Modifier modifier4 = modifier3;
                        endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.components.RecoveryTimelineKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit RecoveryTimeline$lambda$0;
                                RecoveryTimeline$lambda$0 = RecoveryTimelineKt.RecoveryTimeline$lambda$0(segments, j, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return RecoveryTimeline$lambda$0;
                            }
                        });
                        return;
                    }
                    return;
                }
                ColorScheme colorScheme = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable);
                startRestartGroup.startReplaceGroup(-2010296693);
                boolean changed = startRestartGroup.changed(segments);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(segments.size() <= 1), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final MutableState mutableState = (MutableState) rememberedValue;
                startRestartGroup.endReplaceGroup();
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(14));
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
                Modifier modifier5 = modifier3;
                int i5 = i3;
                TextKt.m2376Text4IGK_g((segments.size() <= 1 || RecoveryTimeline$lambda$2(mutableState)) ? "Each bar is one activity clearing. The dot is where you are now." : "Combined clearing from " + segments.size() + " recent sessions. The dot is where you are now.", (Modifier) null, colorScheme.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getBodySmall(), startRestartGroup, 0, 0, 65530);
                if (segments.size() > 1 && !RecoveryTimeline$lambda$2(mutableState)) {
                    startRestartGroup.startReplaceGroup(-480600830);
                    startRestartGroup.startReplaceGroup(677234120);
                    boolean changed2 = startRestartGroup.changed(segments);
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        List<RecoveryTimelineSegment> list = segments;
                        Iterator<T> it = list.iterator();
                        if (!it.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        long recoveryStartMs = ((RecoveryTimelineSegment) it.next()).getRecoveryStartMs();
                        loop0: while (true) {
                            j2 = recoveryStartMs;
                            while (it.hasNext()) {
                                recoveryStartMs = ((RecoveryTimelineSegment) it.next()).getRecoveryStartMs();
                                if (j2 > recoveryStartMs) {
                                    break;
                                }
                            }
                        }
                        Iterator<T> it2 = list.iterator();
                        if (it2.hasNext()) {
                            long endMs = ((RecoveryTimelineSegment) it2.next()).getEndMs();
                            loop2: while (true) {
                                j3 = endMs;
                                while (it2.hasNext()) {
                                    endMs = ((RecoveryTimelineSegment) it2.next()).getEndMs();
                                    if (j3 < endMs) {
                                        break;
                                    }
                                }
                            }
                            Object recoveryTimelineSegment = new RecoveryTimelineSegment("All activities clearing", "COMBINED", j2, j3, colorScheme.getPrimary(), CollectionsKt.joinToString$default(list, " · ", null, null, 0, null, new Function1() { // from class: com.example.rungps.ui.components.RecoveryTimelineKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    CharSequence RecoveryTimeline$lambda$13$lambda$7$lambda$6;
                                    RecoveryTimeline$lambda$13$lambda$7$lambda$6 = RecoveryTimelineKt.RecoveryTimeline$lambda$13$lambda$7$lambda$6((RecoveryTimelineSegment) obj);
                                    return RecoveryTimeline$lambda$13$lambda$7$lambda$6;
                                }
                            }, 30, null), null);
                            startRestartGroup.updateRememberedValue(recoveryTimelineSegment);
                            rememberedValue2 = recoveryTimelineSegment;
                        } else {
                            throw new NoSuchElementException();
                        }
                    }
                    startRestartGroup.endReplaceGroup();
                    RecoverySegmentScale((RecoveryTimelineSegment) rememberedValue2, j, startRestartGroup, i5 & SdkConfig.SDK_VERSION);
                    startRestartGroup.startReplaceGroup(677250884);
                    boolean changed3 = startRestartGroup.changed(mutableState);
                    Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new Function0() { // from class: com.example.rungps.ui.components.RecoveryTimelineKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit RecoveryTimeline$lambda$13$lambda$9$lambda$8;
                                RecoveryTimeline$lambda$13$lambda$9$lambda$8 = RecoveryTimelineKt.RecoveryTimeline$lambda$13$lambda$9$lambda$8(MutableState.this);
                                return RecoveryTimeline$lambda$13$lambda$9$lambda$8;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    startRestartGroup.endReplaceGroup();
                    ButtonKt.TextButton((Function0) rememberedValue3, null, false, null, null, null, null, null, null, ComposableSingletons$RecoveryTimelineKt.INSTANCE.m6955getLambda1$app_sideload(), startRestartGroup, 805306368, 510);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-479956061);
                    startRestartGroup.startReplaceGroup(677254734);
                    Iterator<T> it3 = segments.iterator();
                    while (it3.hasNext()) {
                        RecoverySegmentScale((RecoveryTimelineSegment) it3.next(), j, startRestartGroup, i5 & SdkConfig.SDK_VERSION);
                    }
                    startRestartGroup.endReplaceGroup();
                    if (segments.size() > 1) {
                        startRestartGroup.startReplaceGroup(677260037);
                        boolean changed4 = startRestartGroup.changed(mutableState);
                        Object rememberedValue4 = startRestartGroup.rememberedValue();
                        if (changed4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new Function0() { // from class: com.example.rungps.ui.components.RecoveryTimelineKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit RecoveryTimeline$lambda$13$lambda$12$lambda$11;
                                    RecoveryTimeline$lambda$13$lambda$12$lambda$11 = RecoveryTimelineKt.RecoveryTimeline$lambda$13$lambda$12$lambda$11(MutableState.this);
                                    return RecoveryTimeline$lambda$13$lambda$12$lambda$11;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        startRestartGroup.endReplaceGroup();
                        ButtonKt.TextButton((Function0) rememberedValue4, null, false, null, null, null, null, null, null, ComposableSingletons$RecoveryTimelineKt.INSTANCE.m6956getLambda2$app_sideload(), startRestartGroup, 805306368, 510);
                    }
                    startRestartGroup.endReplaceGroup();
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier5;
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
            if (endRestartGroup2 != null) {
                final Modifier modifier6 = modifier2;
                endRestartGroup2.updateScope(new Function2() { // from class: com.example.rungps.ui.components.RecoveryTimelineKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit RecoveryTimeline$lambda$14;
                        RecoveryTimeline$lambda$14 = RecoveryTimelineKt.RecoveryTimeline$lambda$14(segments, j, modifier6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return RecoveryTimeline$lambda$14;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        if (!segments.isEmpty()) {
        }
    }

    private static final boolean RecoveryTimeline$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void RecoveryTimeline$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence RecoveryTimeline$lambda$13$lambda$7$lambda$6(RecoveryTimelineSegment it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getLabel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecoveryTimeline$lambda$13$lambda$9$lambda$8(MutableState mutableState) {
        RecoveryTimeline$lambda$3(mutableState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecoveryTimeline$lambda$13$lambda$12$lambda$11(MutableState mutableState) {
        RecoveryTimeline$lambda$3(mutableState, false);
        return Unit.INSTANCE;
    }

    private static final void RecoverySegmentScale(final RecoveryTimelineSegment recoveryTimelineSegment, final long j, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(515350353);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(recoveryTimelineSegment) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(515350353, i2, -1, "com.example.rungps.ui.components.RecoverySegmentScale (RecoveryTimeline.kt:97)");
            }
            final ColorScheme colorScheme = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable);
            long coerceAtLeast = RangesKt.coerceAtLeast(recoveryTimelineSegment.getEndMs() - recoveryTimelineSegment.getRecoveryStartMs(), 1L);
            long coerceIn = RangesKt.coerceIn(j - recoveryTimelineSegment.getRecoveryStartMs(), 0L, coerceAtLeast);
            long coerceAtLeast2 = RangesKt.coerceAtLeast(recoveryTimelineSegment.getEndMs() - j, 0L);
            final float coerceIn2 = RangesKt.coerceIn(coerceIn / coerceAtLeast, 0.0f, 1.0f);
            int roundToInt = MathKt.roundToInt(100 * coerceIn2);
            Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(6));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
            TextKt.m2376Text4IGK_g(recoveryTimelineSegment.getLabel(), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m6242getEllipsisgIe3tQ8(), false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelLarge(), startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 3120, 55262);
            String subtitle = recoveryTimelineSegment.getSubtitle();
            if (subtitle == null) {
                subtitle = RecoveryModel.INSTANCE.formatRemaining(coerceAtLeast2) + " left · " + roundToInt + "% cleared";
            }
            TextKt.m2376Text4IGK_g(subtitle, (Modifier) null, colorScheme.getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getBodySmall(), startRestartGroup, 0, 3072, 57338);
            BoxWithConstraintsKt.BoxWithConstraints(BackgroundKt.m239backgroundbw27NRU$default(ClipKt.clip(SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6303constructorimpl(28)), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6303constructorimpl(8))), colorScheme.getSurfaceContainerHigh(), null, 2, null), null, false, ComposableLambdaKt.rememberComposableLambda(1894083589, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.components.RecoveryTimelineKt$RecoverySegmentScale$1$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer3, Integer num) {
                    invoke(boxWithConstraintsScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer3, int i3) {
                    int i4;
                    Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((i3 & 6) == 0) {
                        i4 = i3 | (composer3.changed(BoxWithConstraints) ? 4 : 2);
                    } else {
                        i4 = i3;
                    }
                    if ((i4 & 19) != 18 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1894083589, i4, -1, "com.example.rungps.ui.components.RecoverySegmentScale.<anonymous>.<anonymous> (RecoveryTimeline.kt:126)");
                        }
                        float mo593getMaxWidthD9Ej5fM = BoxWithConstraints.mo593getMaxWidthD9Ej5fM();
                        BoxKt.Box(BackgroundKt.m239backgroundbw27NRU$default(SizeKt.m734width3ABfNKs(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6303constructorimpl(coerceIn2 * mo593getMaxWidthD9Ej5fM)), Color.m3842copywmQWz5c$default(recoveryTimelineSegment.m6978getColor0d7_KjU(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer3, 0);
                        BoxKt.Box(BackgroundKt.m239backgroundbw27NRU$default(ClipKt.clip(PaddingKt.m686paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(SizeKt.m734width3ABfNKs(OffsetKt.m645offsetVpY3zN4$default(Modifier.INSTANCE, ((Dp) RangesKt.coerceAtLeast(Dp.m6301boximpl(Dp.m6303constructorimpl(Dp.m6303constructorimpl(mo593getMaxWidthD9Ej5fM * coerceIn2) - Dp.m6303constructorimpl(5))), Dp.m6301boximpl(Dp.m6303constructorimpl(0)))).m6317unboximpl(), 0.0f, 2, null), Dp.m6303constructorimpl(10)), 0.0f, 1, null), 0.0f, Dp.m6303constructorimpl(4), 1, null), RoundedCornerShapeKt.getCircleShape()), colorScheme.getOnSurface(), null, 2, null), composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, startRestartGroup, 54), startRestartGroup, 3072, 6);
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3336constructorimpl2 = Updater.m3336constructorimpl(startRestartGroup);
            Updater.m3343setimpl(m3336constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3336constructorimpl2.getInserting() || !Intrinsics.areEqual(m3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3343setimpl(m3336constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m2376Text4IGK_g("Started " + formatShortTime(recoveryTimelineSegment.getRecoveryStartMs()), (Modifier) null, colorScheme.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), startRestartGroup, 0, 0, 65530);
            String str = "Clears " + formatShortTime(recoveryTimelineSegment.getEndMs());
            TextStyle labelSmall = MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall();
            long onSurfaceVariant = colorScheme.getOnSurfaceVariant();
            composer2 = startRestartGroup;
            TextKt.m2376Text4IGK_g(str, (Modifier) null, onSurfaceVariant, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, labelSmall, composer2, 0, 0, 65530);
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
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.components.RecoveryTimelineKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit RecoverySegmentScale$lambda$17;
                    RecoverySegmentScale$lambda$17 = RecoveryTimelineKt.RecoverySegmentScale$lambda$17(RecoveryTimelineSegment.this, j, i, (Composer) obj, ((Integer) obj2).intValue());
                    return RecoverySegmentScale$lambda$17;
                }
            });
        }
    }

    private static final String formatShortTime(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int i = calendar.get(10);
        int i2 = calendar.get(12);
        boolean z = calendar.get(9) == 0;
        if (i == 0) {
            i = 12;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%d:%02d %s", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), z ? "am" : "pm"}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
