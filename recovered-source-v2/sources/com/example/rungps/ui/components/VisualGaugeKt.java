package com.example.rungps.ui.components;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ColorScheme;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
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
import com.example.rungps.ui.theme.EarthColors;
import com.google.firebase.firestore.model.Values;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: VisualGauge.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a]\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a1\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"ArcScoreGauge", "", "score", "", "maxScore", "segments", "", "Lcom/example/rungps/ui/components/GaugeSegment;", "modifier", "Landroidx/compose/ui/Modifier;", "size", "Landroidx/compose/ui/unit/Dp;", "centerLabel", "", "confidencePercent", "ArcScoreGauge-iHT-50w", "(IILjava/util/List;Landroidx/compose/ui/Modifier;FLjava/lang/String;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;II)V", "AccentStatChip", "label", Values.VECTOR_MAP_VECTORS_KEY, "accent", "Landroidx/compose/ui/graphics/Color;", "AccentStatChip-cf5BqRc", "(Ljava/lang/String;Ljava/lang/String;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_sideload"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VisualGaugeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccentStatChip_cf5BqRc$lambda$12(String str, String str2, long j, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m7006AccentStatChipcf5BqRc(str, str2, j, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ArcScoreGauge_iHT_50w$lambda$7(int i, int i2, List list, Modifier modifier, float f, String str, Integer num, int i3, int i4, Composer composer, int i5) {
        m7007ArcScoreGaugeiHT50w(i, i2, list, modifier, f, str, num, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0235  */
    /* renamed from: ArcScoreGauge-iHT-50w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m7007ArcScoreGaugeiHT50w(final int i, int i2, List<GaugeSegment> list, Modifier modifier, float f, String str, Integer num, Composer composer, final int i3, final int i4) {
        int i5;
        int i6;
        List<GaugeSegment> list2;
        int i7;
        Modifier modifier2;
        int i8;
        float f2;
        int i9;
        String str2;
        int i10;
        Integer num2;
        final float m6303constructorimpl;
        String str3;
        final ColorScheme colorScheme;
        long m7649getSandstone0d7_KjU;
        int i11;
        int currentCompositeKeyHash;
        Composer m3336constructorimpl;
        boolean changed;
        Object rememberedValue;
        int currentCompositeKeyHash2;
        Composer m3336constructorimpl2;
        String str4;
        final Modifier modifier3;
        final List<GaugeSegment> list3;
        final String str5;
        final Integer num3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1416128267);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (startRestartGroup.changed(i) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i12 = i4 & 2;
        if (i12 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= startRestartGroup.changed(i2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i3 & 384) == 0) {
                list2 = list;
                i5 |= startRestartGroup.changedInstance(list2) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    modifier2 = modifier;
                    i5 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i3 & 24576) == 0) {
                        f2 = f;
                        i5 |= startRestartGroup.changed(f2) ? 16384 : 8192;
                        i9 = i4 & 32;
                        if (i9 != 0) {
                            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((196608 & i3) == 0) {
                            str2 = str;
                            i5 |= startRestartGroup.changed(str2) ? 131072 : 65536;
                            i10 = i4 & 64;
                            if (i10 == 0) {
                                i5 |= 1572864;
                                num2 = num;
                            } else {
                                num2 = num;
                                if ((i3 & 1572864) == 0) {
                                    i5 |= startRestartGroup.changed(num2) ? 1048576 : 524288;
                                }
                            }
                            if ((i5 & 599187) == 599186 || !startRestartGroup.getSkipping()) {
                                int i13 = i12 == 0 ? 100 : i2;
                                if (i6 != 0) {
                                    list2 = CollectionsKt.emptyList();
                                }
                                Modifier.Companion companion = i7 == 0 ? Modifier.INSTANCE : modifier2;
                                m6303constructorimpl = i8 == 0 ? Dp.m6303constructorimpl(132) : f2;
                                str3 = i9 == 0 ? null : str2;
                                Integer num4 = i10 == 0 ? num2 : null;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1416128267, i5, -1, "com.example.rungps.ui.components.ArcScoreGauge (VisualGauge.kt:40)");
                                }
                                colorScheme = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable);
                                final float coerceIn = RangesKt.coerceIn(i / RangesKt.coerceAtLeast(i13, 1), 0.0f, 1.0f);
                                final long surfaceContainerHigh = colorScheme.getSurfaceContainerHigh();
                                if (i < 80) {
                                    m7649getSandstone0d7_KjU = EarthColors.INSTANCE.m7645getRecoveryLow0d7_KjU();
                                } else if (i >= 55) {
                                    m7649getSandstone0d7_KjU = EarthColors.INSTANCE.m7653getTeal0d7_KjU();
                                } else {
                                    m7649getSandstone0d7_KjU = EarthColors.INSTANCE.m7649getSandstone0d7_KjU();
                                }
                                Modifier m729size3ABfNKs = SizeKt.m729size3ABfNKs(companion, m6303constructorimpl);
                                i11 = i13;
                                Alignment center = Alignment.INSTANCE.getCenter();
                                Modifier modifier4 = companion;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m729size3ABfNKs);
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                final Integer num5 = num4;
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
                                Updater.m3343setimpl(m3336constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                Modifier m729size3ABfNKs2 = SizeKt.m729size3ABfNKs(Modifier.INSTANCE, m6303constructorimpl);
                                startRestartGroup.startReplaceGroup(1506507334);
                                changed = ((57344 & i5) != 16384) | startRestartGroup.changed(surfaceContainerHigh) | ((3670016 & i5) != 1048576) | startRestartGroup.changed(colorScheme) | startRestartGroup.changedInstance(list2) | startRestartGroup.changed(coerceIn) | startRestartGroup.changed(m7649getSandstone0d7_KjU);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    final float f3 = 135.0f;
                                    final float f4 = 270.0f;
                                    final float f5 = m6303constructorimpl;
                                    final List<GaugeSegment> list4 = list2;
                                    final long j = m7649getSandstone0d7_KjU;
                                    rememberedValue = new Function1() { // from class: com.example.rungps.ui.components.VisualGaugeKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit ArcScoreGauge_iHT_50w$lambda$6$lambda$4$lambda$3;
                                            ArcScoreGauge_iHT_50w$lambda$6$lambda$4$lambda$3 = VisualGaugeKt.ArcScoreGauge_iHT_50w$lambda$6$lambda$4$lambda$3(f5, surfaceContainerHigh, f3, f4, num5, list4, coerceIn, j, colorScheme, (DrawScope) obj);
                                            return ArcScoreGauge_iHT_50w$lambda$6$lambda$4$lambda$3;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceGroup();
                                CanvasKt.Canvas(m729size3ABfNKs2, (Function1) rememberedValue, startRestartGroup, 0);
                                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
                                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                startRestartGroup.startReusableNode();
                                if (!startRestartGroup.getInserting()) {
                                    startRestartGroup.createNode(constructor2);
                                } else {
                                    startRestartGroup.useNode();
                                }
                                m3336constructorimpl2 = Updater.m3336constructorimpl(startRestartGroup);
                                Updater.m3343setimpl(m3336constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (!m3336constructorimpl2.getInserting() || !Intrinsics.areEqual(m3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m3343setimpl(m3336constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                TextKt.m2376Text4IGK_g(String.valueOf(i), (Modifier) null, colorScheme.getOnSurface(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getDisplaySmall(), startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
                                startRestartGroup.startReplaceGroup(-1097737013);
                                str4 = str3;
                                if (str4 != null && !StringsKt.isBlank(str4)) {
                                    TextKt.m2376Text4IGK_g(str3, (Modifier) null, colorScheme.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), startRestartGroup, (i5 >> 15) & 14, 0, 65530);
                                }
                                startRestartGroup.endReplaceGroup();
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.endNode();
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.endNode();
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier4;
                                list3 = list2;
                                str5 = str3;
                                num3 = num5;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                i11 = i2;
                                list3 = list2;
                                modifier3 = modifier2;
                                num3 = num2;
                                m6303constructorimpl = f2;
                                str5 = str2;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                final int i14 = i11;
                                endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.components.VisualGaugeKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit ArcScoreGauge_iHT_50w$lambda$7;
                                        ArcScoreGauge_iHT_50w$lambda$7 = VisualGaugeKt.ArcScoreGauge_iHT_50w$lambda$7(i, i14, list3, modifier3, m6303constructorimpl, str5, num3, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                        return ArcScoreGauge_iHT_50w$lambda$7;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        str2 = str;
                        i10 = i4 & 64;
                        if (i10 == 0) {
                        }
                        if ((i5 & 599187) == 599186) {
                        }
                        if (i12 == 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        colorScheme = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable);
                        final float coerceIn2 = RangesKt.coerceIn(i / RangesKt.coerceAtLeast(i13, 1), 0.0f, 1.0f);
                        final long surfaceContainerHigh2 = colorScheme.getSurfaceContainerHigh();
                        if (i < 80) {
                        }
                        Modifier m729size3ABfNKs3 = SizeKt.m729size3ABfNKs(companion, m6303constructorimpl);
                        i11 = i13;
                        Alignment center2 = Alignment.INSTANCE.getCenter();
                        Modifier modifier42 = companion;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m729size3ABfNKs3);
                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                        final Integer num52 = num4;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                        }
                        m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
                        Updater.m3343setimpl(m3336constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3336constructorimpl.getInserting()) {
                        }
                        m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
                        Updater.m3343setimpl(m3336constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        Modifier m729size3ABfNKs22 = SizeKt.m729size3ABfNKs(Modifier.INSTANCE, m6303constructorimpl);
                        startRestartGroup.startReplaceGroup(1506507334);
                        changed = ((57344 & i5) != 16384) | startRestartGroup.changed(surfaceContainerHigh2) | ((3670016 & i5) != 1048576) | startRestartGroup.changed(colorScheme) | startRestartGroup.changedInstance(list2) | startRestartGroup.changed(coerceIn2) | startRestartGroup.changed(m7649getSandstone0d7_KjU);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changed) {
                        }
                        final float f32 = 135.0f;
                        final float f42 = 270.0f;
                        final float f52 = m6303constructorimpl;
                        final List list42 = list2;
                        final long j2 = m7649getSandstone0d7_KjU;
                        rememberedValue = new Function1() { // from class: com.example.rungps.ui.components.VisualGaugeKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit ArcScoreGauge_iHT_50w$lambda$6$lambda$4$lambda$3;
                                ArcScoreGauge_iHT_50w$lambda$6$lambda$4$lambda$3 = VisualGaugeKt.ArcScoreGauge_iHT_50w$lambda$6$lambda$4$lambda$3(f52, surfaceContainerHigh2, f32, f42, num52, list42, coerceIn2, j2, colorScheme, (DrawScope) obj);
                                return ArcScoreGauge_iHT_50w$lambda$6$lambda$4$lambda$3;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        startRestartGroup.endReplaceGroup();
                        CanvasKt.Canvas(m729size3ABfNKs22, (Function1) rememberedValue, startRestartGroup, 0);
                        Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        Modifier.Companion companion22 = Modifier.INSTANCE;
                        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, startRestartGroup, 48);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, companion22);
                        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                        }
                        m3336constructorimpl2 = Updater.m3336constructorimpl(startRestartGroup);
                        Updater.m3343setimpl(m3336constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3336constructorimpl2.getInserting()) {
                        }
                        m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
                        Updater.m3343setimpl(m3336constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        TextKt.m2376Text4IGK_g(String.valueOf(i), (Modifier) null, colorScheme.getOnSurface(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getDisplaySmall(), startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
                        startRestartGroup.startReplaceGroup(-1097737013);
                        str4 = str3;
                        if (str4 != null) {
                            TextKt.m2376Text4IGK_g(str3, (Modifier) null, colorScheme.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), startRestartGroup, (i5 >> 15) & 14, 0, 65530);
                        }
                        startRestartGroup.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier42;
                        list3 = list2;
                        str5 = str3;
                        num3 = num52;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    f2 = f;
                    i9 = i4 & 32;
                    if (i9 != 0) {
                    }
                    str2 = str;
                    i10 = i4 & 64;
                    if (i10 == 0) {
                    }
                    if ((i5 & 599187) == 599186) {
                    }
                    if (i12 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    colorScheme = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable);
                    final float coerceIn22 = RangesKt.coerceIn(i / RangesKt.coerceAtLeast(i13, 1), 0.0f, 1.0f);
                    final long surfaceContainerHigh22 = colorScheme.getSurfaceContainerHigh();
                    if (i < 80) {
                    }
                    Modifier m729size3ABfNKs32 = SizeKt.m729size3ABfNKs(companion, m6303constructorimpl);
                    i11 = i13;
                    Alignment center22 = Alignment.INSTANCE.getCenter();
                    Modifier modifier422 = companion;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(center22, false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, m729size3ABfNKs32);
                    Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                    final Integer num522 = num4;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
                    Updater.m3343setimpl(m3336constructorimpl, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3336constructorimpl.getInserting()) {
                    }
                    m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32);
                    Updater.m3343setimpl(m3336constructorimpl, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                    Modifier m729size3ABfNKs222 = SizeKt.m729size3ABfNKs(Modifier.INSTANCE, m6303constructorimpl);
                    startRestartGroup.startReplaceGroup(1506507334);
                    changed = ((57344 & i5) != 16384) | startRestartGroup.changed(surfaceContainerHigh22) | ((3670016 & i5) != 1048576) | startRestartGroup.changed(colorScheme) | startRestartGroup.changedInstance(list2) | startRestartGroup.changed(coerceIn22) | startRestartGroup.changed(m7649getSandstone0d7_KjU);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    final float f322 = 135.0f;
                    final float f422 = 270.0f;
                    final float f522 = m6303constructorimpl;
                    final List list422 = list2;
                    final long j22 = m7649getSandstone0d7_KjU;
                    rememberedValue = new Function1() { // from class: com.example.rungps.ui.components.VisualGaugeKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit ArcScoreGauge_iHT_50w$lambda$6$lambda$4$lambda$3;
                            ArcScoreGauge_iHT_50w$lambda$6$lambda$4$lambda$3 = VisualGaugeKt.ArcScoreGauge_iHT_50w$lambda$6$lambda$4$lambda$3(f522, surfaceContainerHigh22, f322, f422, num522, list422, coerceIn22, j22, colorScheme, (DrawScope) obj);
                            return ArcScoreGauge_iHT_50w$lambda$6$lambda$4$lambda$3;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    startRestartGroup.endReplaceGroup();
                    CanvasKt.Canvas(m729size3ABfNKs222, (Function1) rememberedValue, startRestartGroup, 0);
                    Alignment.Horizontal centerHorizontally22 = Alignment.INSTANCE.getCenterHorizontally();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    Modifier.Companion companion222 = Modifier.INSTANCE;
                    MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally22, startRestartGroup, 48);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion222);
                    Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    m3336constructorimpl2 = Updater.m3336constructorimpl(startRestartGroup);
                    Updater.m3343setimpl(m3336constructorimpl2, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m3336constructorimpl2.getInserting()) {
                    }
                    m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
                    Updater.m3343setimpl(m3336constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
                    TextKt.m2376Text4IGK_g(String.valueOf(i), (Modifier) null, colorScheme.getOnSurface(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getDisplaySmall(), startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
                    startRestartGroup.startReplaceGroup(-1097737013);
                    str4 = str3;
                    if (str4 != null) {
                    }
                    startRestartGroup.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier422;
                    list3 = list2;
                    str5 = str3;
                    num3 = num522;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                modifier2 = modifier;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                f2 = f;
                i9 = i4 & 32;
                if (i9 != 0) {
                }
                str2 = str;
                i10 = i4 & 64;
                if (i10 == 0) {
                }
                if ((i5 & 599187) == 599186) {
                }
                if (i12 == 0) {
                }
                if (i6 != 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i10 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                colorScheme = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable);
                final float coerceIn222 = RangesKt.coerceIn(i / RangesKt.coerceAtLeast(i13, 1), 0.0f, 1.0f);
                final long surfaceContainerHigh222 = colorScheme.getSurfaceContainerHigh();
                if (i < 80) {
                }
                Modifier m729size3ABfNKs322 = SizeKt.m729size3ABfNKs(companion, m6303constructorimpl);
                i11 = i13;
                Alignment center222 = Alignment.INSTANCE.getCenter();
                Modifier modifier4222 = companion;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(center222, false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, m729size3ABfNKs322);
                Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
                final Integer num5222 = num4;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
                Updater.m3343setimpl(m3336constructorimpl, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3336constructorimpl.getInserting()) {
                }
                m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash322);
                Updater.m3343setimpl(m3336constructorimpl, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
                Modifier m729size3ABfNKs2222 = SizeKt.m729size3ABfNKs(Modifier.INSTANCE, m6303constructorimpl);
                startRestartGroup.startReplaceGroup(1506507334);
                changed = ((57344 & i5) != 16384) | startRestartGroup.changed(surfaceContainerHigh222) | ((3670016 & i5) != 1048576) | startRestartGroup.changed(colorScheme) | startRestartGroup.changedInstance(list2) | startRestartGroup.changed(coerceIn222) | startRestartGroup.changed(m7649getSandstone0d7_KjU);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                final float f3222 = 135.0f;
                final float f4222 = 270.0f;
                final float f5222 = m6303constructorimpl;
                final List list4222 = list2;
                final long j222 = m7649getSandstone0d7_KjU;
                rememberedValue = new Function1() { // from class: com.example.rungps.ui.components.VisualGaugeKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit ArcScoreGauge_iHT_50w$lambda$6$lambda$4$lambda$3;
                        ArcScoreGauge_iHT_50w$lambda$6$lambda$4$lambda$3 = VisualGaugeKt.ArcScoreGauge_iHT_50w$lambda$6$lambda$4$lambda$3(f5222, surfaceContainerHigh222, f3222, f4222, num5222, list4222, coerceIn222, j222, colorScheme, (DrawScope) obj);
                        return ArcScoreGauge_iHT_50w$lambda$6$lambda$4$lambda$3;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceGroup();
                CanvasKt.Canvas(m729size3ABfNKs2222, (Function1) rememberedValue, startRestartGroup, 0);
                Alignment.Horizontal centerHorizontally222 = Alignment.INSTANCE.getCenterHorizontally();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                Modifier.Companion companion2222 = Modifier.INSTANCE;
                MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally222, startRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2222);
                Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m3336constructorimpl2 = Updater.m3336constructorimpl(startRestartGroup);
                Updater.m3343setimpl(m3336constructorimpl2, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3336constructorimpl2.getInserting()) {
                }
                m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2222);
                Updater.m3343setimpl(m3336constructorimpl2, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
                TextKt.m2376Text4IGK_g(String.valueOf(i), (Modifier) null, colorScheme.getOnSurface(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getDisplaySmall(), startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
                startRestartGroup.startReplaceGroup(-1097737013);
                str4 = str3;
                if (str4 != null) {
                }
                startRestartGroup.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4222;
                list3 = list2;
                str5 = str3;
                num3 = num5222;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            list2 = list;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            modifier2 = modifier;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            f2 = f;
            i9 = i4 & 32;
            if (i9 != 0) {
            }
            str2 = str;
            i10 = i4 & 64;
            if (i10 == 0) {
            }
            if ((i5 & 599187) == 599186) {
            }
            if (i12 == 0) {
            }
            if (i6 != 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if (i10 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            colorScheme = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable);
            final float coerceIn2222 = RangesKt.coerceIn(i / RangesKt.coerceAtLeast(i13, 1), 0.0f, 1.0f);
            final long surfaceContainerHigh2222 = colorScheme.getSurfaceContainerHigh();
            if (i < 80) {
            }
            Modifier m729size3ABfNKs3222 = SizeKt.m729size3ABfNKs(companion, m6303constructorimpl);
            i11 = i13;
            Alignment center2222 = Alignment.INSTANCE.getCenter();
            Modifier modifier42222 = companion;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2222 = BoxKt.maybeCachedBoxMeasurePolicy(center2222, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3222 = ComposedModifierKt.materializeModifier(startRestartGroup, m729size3ABfNKs3222);
            Function0<ComposeUiNode> constructor3222 = ComposeUiNode.INSTANCE.getConstructor();
            final Integer num52222 = num4;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
            Updater.m3343setimpl(m3336constructorimpl, maybeCachedBoxMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap3222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3336constructorimpl.getInserting()) {
            }
            m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3222);
            Updater.m3343setimpl(m3336constructorimpl, materializeModifier3222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
            Modifier m729size3ABfNKs22222 = SizeKt.m729size3ABfNKs(Modifier.INSTANCE, m6303constructorimpl);
            startRestartGroup.startReplaceGroup(1506507334);
            changed = ((57344 & i5) != 16384) | startRestartGroup.changed(surfaceContainerHigh2222) | ((3670016 & i5) != 1048576) | startRestartGroup.changed(colorScheme) | startRestartGroup.changedInstance(list2) | startRestartGroup.changed(coerceIn2222) | startRestartGroup.changed(m7649getSandstone0d7_KjU);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            final float f32222 = 135.0f;
            final float f42222 = 270.0f;
            final float f52222 = m6303constructorimpl;
            final List list42222 = list2;
            final long j2222 = m7649getSandstone0d7_KjU;
            rememberedValue = new Function1() { // from class: com.example.rungps.ui.components.VisualGaugeKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit ArcScoreGauge_iHT_50w$lambda$6$lambda$4$lambda$3;
                    ArcScoreGauge_iHT_50w$lambda$6$lambda$4$lambda$3 = VisualGaugeKt.ArcScoreGauge_iHT_50w$lambda$6$lambda$4$lambda$3(f52222, surfaceContainerHigh2222, f32222, f42222, num52222, list42222, coerceIn2222, j2222, colorScheme, (DrawScope) obj);
                    return ArcScoreGauge_iHT_50w$lambda$6$lambda$4$lambda$3;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            CanvasKt.Canvas(m729size3ABfNKs22222, (Function1) rememberedValue, startRestartGroup, 0);
            Alignment.Horizontal centerHorizontally2222 = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier.Companion companion22222 = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy2222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2222, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion22222);
            Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m3336constructorimpl2 = Updater.m3336constructorimpl(startRestartGroup);
            Updater.m3343setimpl(m3336constructorimpl2, columnMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m3336constructorimpl2.getInserting()) {
            }
            m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22222);
            Updater.m3343setimpl(m3336constructorimpl2, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2222 = ColumnScopeInstance.INSTANCE;
            TextKt.m2376Text4IGK_g(String.valueOf(i), (Modifier) null, colorScheme.getOnSurface(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getDisplaySmall(), startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
            startRestartGroup.startReplaceGroup(-1097737013);
            str4 = str3;
            if (str4 != null) {
            }
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier42222;
            list3 = list2;
            str5 = str3;
            num3 = num52222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        list2 = list;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        modifier2 = modifier;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        f2 = f;
        i9 = i4 & 32;
        if (i9 != 0) {
        }
        str2 = str;
        i10 = i4 & 64;
        if (i10 == 0) {
        }
        if ((i5 & 599187) == 599186) {
        }
        if (i12 == 0) {
        }
        if (i6 != 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i10 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        colorScheme = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable);
        final float coerceIn22222 = RangesKt.coerceIn(i / RangesKt.coerceAtLeast(i13, 1), 0.0f, 1.0f);
        final long surfaceContainerHigh22222 = colorScheme.getSurfaceContainerHigh();
        if (i < 80) {
        }
        Modifier m729size3ABfNKs32222 = SizeKt.m729size3ABfNKs(companion, m6303constructorimpl);
        i11 = i13;
        Alignment center22222 = Alignment.INSTANCE.getCenter();
        Modifier modifier422222 = companion;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy22222 = BoxKt.maybeCachedBoxMeasurePolicy(center22222, false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap32222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier32222 = ComposedModifierKt.materializeModifier(startRestartGroup, m729size3ABfNKs32222);
        Function0<ComposeUiNode> constructor32222 = ComposeUiNode.INSTANCE.getConstructor();
        final Integer num522222 = num4;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
        Updater.m3343setimpl(m3336constructorimpl, maybeCachedBoxMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap32222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3336constructorimpl.getInserting()) {
        }
        m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32222);
        Updater.m3343setimpl(m3336constructorimpl, materializeModifier32222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance22222 = BoxScopeInstance.INSTANCE;
        Modifier m729size3ABfNKs222222 = SizeKt.m729size3ABfNKs(Modifier.INSTANCE, m6303constructorimpl);
        startRestartGroup.startReplaceGroup(1506507334);
        changed = ((57344 & i5) != 16384) | startRestartGroup.changed(surfaceContainerHigh22222) | ((3670016 & i5) != 1048576) | startRestartGroup.changed(colorScheme) | startRestartGroup.changedInstance(list2) | startRestartGroup.changed(coerceIn22222) | startRestartGroup.changed(m7649getSandstone0d7_KjU);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        final float f322222 = 135.0f;
        final float f422222 = 270.0f;
        final float f522222 = m6303constructorimpl;
        final List list422222 = list2;
        final long j22222 = m7649getSandstone0d7_KjU;
        rememberedValue = new Function1() { // from class: com.example.rungps.ui.components.VisualGaugeKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit ArcScoreGauge_iHT_50w$lambda$6$lambda$4$lambda$3;
                ArcScoreGauge_iHT_50w$lambda$6$lambda$4$lambda$3 = VisualGaugeKt.ArcScoreGauge_iHT_50w$lambda$6$lambda$4$lambda$3(f522222, surfaceContainerHigh22222, f322222, f422222, num522222, list422222, coerceIn22222, j22222, colorScheme, (DrawScope) obj);
                return ArcScoreGauge_iHT_50w$lambda$6$lambda$4$lambda$3;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        CanvasKt.Canvas(m729size3ABfNKs222222, (Function1) rememberedValue, startRestartGroup, 0);
        Alignment.Horizontal centerHorizontally22222 = Alignment.INSTANCE.getCenterHorizontally();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        Modifier.Companion companion222222 = Modifier.INSTANCE;
        MeasurePolicy columnMeasurePolicy22222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally22222, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap222222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier222222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion222222);
        Function0<ComposeUiNode> constructor222222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m3336constructorimpl2 = Updater.m3336constructorimpl(startRestartGroup);
        Updater.m3343setimpl(m3336constructorimpl2, columnMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap222222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3336constructorimpl2.getInserting()) {
        }
        m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222222);
        Updater.m3343setimpl(m3336constructorimpl2, materializeModifier222222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance22222 = ColumnScopeInstance.INSTANCE;
        TextKt.m2376Text4IGK_g(String.valueOf(i), (Modifier) null, colorScheme.getOnSurface(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getDisplaySmall(), startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
        startRestartGroup.startReplaceGroup(-1097737013);
        str4 = str3;
        if (str4 != null) {
        }
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier422222;
        list3 = list2;
        str5 = str3;
        num3 = num522222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ArcScoreGauge_iHT_50w$lambda$6$lambda$4$lambda$3(float f, long j, float f2, float f3, Integer num, List list, float f4, long j2, ColorScheme colorScheme, DrawScope Canvas) {
        int m4197getRoundKaPHkGw;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float f5 = Canvas.mo376toPx0680j_4(f) * 0.09f;
        float f6 = (f5 / 2.0f) + 4.0f;
        float f7 = 2 * f6;
        long Size = androidx.compose.ui.geometry.SizeKt.Size(Size.m3671getWidthimpl(Canvas.mo4399getSizeNHjbRc()) - f7, Size.m3668getHeightimpl(Canvas.mo4399getSizeNHjbRc()) - f7);
        long Offset = OffsetKt.Offset(f6, f6);
        DrawScope.m4378drawArcyD3GUKo$default(Canvas, j, f2, f3, false, Offset, Size, 0.0f, new Stroke(f5, 0.0f, StrokeCap.INSTANCE.m4197getRoundKaPHkGw(), 0, null, 26, null), null, 0, 832, null);
        if (num != null) {
            float coerceIn = RangesKt.coerceIn(num.intValue(), 15, 98) / 100.0f;
            DrawScope.m4378drawArcyD3GUKo$default(Canvas, Color.m3842copywmQWz5c$default(colorScheme.getOutline(), (0.35f * coerceIn) + 0.25f, 0.0f, 0.0f, 0.0f, 14, null), f2, f3 * coerceIn, false, OffsetKt.Offset(Offset.m3602getXimpl(Offset) - 3.0f, Offset.m3603getYimpl(Offset) - 3.0f), androidx.compose.ui.geometry.SizeKt.Size(Size.m3671getWidthimpl(Size) + 6.0f, Size.m3668getHeightimpl(Size) + 6.0f), 0.0f, new Stroke(f5 * 0.45f, 0.0f, StrokeCap.INSTANCE.m4197getRoundKaPHkGw(), 0, null, 26, null), null, 0, 832, null);
        }
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((GaugeSegment) obj).getFraction() > 0.01f) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = arrayList;
            float coerceIn2 = RangesKt.coerceIn((float) Math.toDegrees(f5 / RangesKt.coerceAtLeast(RangesKt.coerceAtMost(Size.m3671getWidthimpl(Size), Size.m3668getHeightimpl(Size)) / 2.0f, 1.0f)), 1.2f, 6.0f);
            int i = 0;
            float f8 = f2;
            for (Object obj2 : arrayList2) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                GaugeSegment gaugeSegment = (GaugeSegment) obj2;
                float fraction = f3 * gaugeSegment.getFraction();
                float f9 = i > 0 ? coerceIn2 : 0.0f;
                float f10 = f8 - f9;
                float f11 = fraction + f9;
                if (arrayList2.size() == 1) {
                    m4197getRoundKaPHkGw = StrokeCap.INSTANCE.m4197getRoundKaPHkGw();
                } else if (i == 0) {
                    m4197getRoundKaPHkGw = StrokeCap.INSTANCE.m4197getRoundKaPHkGw();
                } else {
                    m4197getRoundKaPHkGw = i == CollectionsKt.getLastIndex(arrayList2) ? StrokeCap.INSTANCE.m4197getRoundKaPHkGw() : StrokeCap.INSTANCE.m4196getButtKaPHkGw();
                }
                DrawScope.m4378drawArcyD3GUKo$default(Canvas, gaugeSegment.m6963getColor0d7_KjU(), f10, f11, false, Offset, Size, 0.0f, new Stroke(f5, 0.0f, m4197getRoundKaPHkGw, 0, null, 26, null), null, 0, 832, null);
                f8 += fraction;
                i = i2;
            }
        } else if (f4 > 0.0f) {
            DrawScope.m4378drawArcyD3GUKo$default(Canvas, j2, f2, f3 * f4, false, Offset, Size, 0.0f, new Stroke(f5, 0.0f, StrokeCap.INSTANCE.m4197getRoundKaPHkGw(), 0, null, 26, null), null, 0, 832, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x009b  */
    /* renamed from: AccentStatChip-cf5BqRc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m7006AccentStatChipcf5BqRc(final String label, final String value, final long j, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int currentCompositeKeyHash;
        Composer m3336constructorimpl;
        boolean z;
        Object rememberedValue;
        int currentCompositeKeyHash2;
        Composer m3336constructorimpl2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        Composer startRestartGroup = composer.startRestartGroup(-1664361083);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(label) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(value) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(j) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i3;
            if ((i4 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1664361083, i4, -1, "com.example.rungps.ui.components.AccentStatChip (VisualGauge.kt:148)");
                }
                ColorScheme colorScheme = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable);
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m564spacedBy0680j_4, centerVertically, startRestartGroup, 54);
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
                Modifier m731sizeVpY3zN4 = SizeKt.m731sizeVpY3zN4(Modifier.INSTANCE, Dp.m6303constructorimpl(4), Dp.m6303constructorimpl(28));
                startRestartGroup.startReplaceGroup(606882000);
                z = (i4 & 896) != 256;
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: com.example.rungps.ui.components.VisualGaugeKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit AccentStatChip_cf5BqRc$lambda$11$lambda$9$lambda$8;
                            AccentStatChip_cf5BqRc$lambda$11$lambda$9$lambda$8 = VisualGaugeKt.AccentStatChip_cf5BqRc$lambda$11$lambda$9$lambda$8(j, (DrawScope) obj);
                            return AccentStatChip_cf5BqRc$lambda$11$lambda$9$lambda$8;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                CanvasKt.Canvas(m731sizeVpY3zN4, (Function1) rememberedValue, startRestartGroup, 6);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.useNode();
                } else {
                    startRestartGroup.createNode(constructor2);
                }
                m3336constructorimpl2 = Updater.m3336constructorimpl(startRestartGroup);
                Updater.m3343setimpl(m3336constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3336constructorimpl2.getInserting() || !Intrinsics.areEqual(m3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m3343setimpl(m3336constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Modifier modifier5 = modifier4;
                TextKt.m2376Text4IGK_g(label, (Modifier) null, colorScheme.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), startRestartGroup, i4 & 14, 0, 65530);
                composer2 = startRestartGroup;
                TextKt.m2376Text4IGK_g(value, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getTitleSmall(), composer2, ((i4 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
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
                endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.components.VisualGaugeKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit AccentStatChip_cf5BqRc$lambda$12;
                        AccentStatChip_cf5BqRc$lambda$12 = VisualGaugeKt.AccentStatChip_cf5BqRc$lambda$12(label, value, j, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return AccentStatChip_cf5BqRc$lambda$12;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 1171) == 1170) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ColorScheme colorScheme2 = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable);
        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
        Arrangement.HorizontalOrVertical m564spacedBy0680j_42 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m564spacedBy0680j_42, centerVertically2, startRestartGroup, 54);
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
        Updater.m3343setimpl(m3336constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3336constructorimpl.getInserting()) {
        }
        m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
        Updater.m3343setimpl(m3336constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
        Modifier m731sizeVpY3zN42 = SizeKt.m731sizeVpY3zN4(Modifier.INSTANCE, Dp.m6303constructorimpl(4), Dp.m6303constructorimpl(28));
        startRestartGroup.startReplaceGroup(606882000);
        if ((i4 & 896) != 256) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = new Function1() { // from class: com.example.rungps.ui.components.VisualGaugeKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit AccentStatChip_cf5BqRc$lambda$11$lambda$9$lambda$8;
                AccentStatChip_cf5BqRc$lambda$11$lambda$9$lambda$8 = VisualGaugeKt.AccentStatChip_cf5BqRc$lambda$11$lambda$9$lambda$8(j, (DrawScope) obj);
                return AccentStatChip_cf5BqRc$lambda$11$lambda$9$lambda$8;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        CanvasKt.Canvas(m731sizeVpY3zN42, (Function1) rememberedValue, startRestartGroup, 6);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        Modifier.Companion companion2 = Modifier.INSTANCE;
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m3336constructorimpl2 = Updater.m3336constructorimpl(startRestartGroup);
        Updater.m3343setimpl(m3336constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3336constructorimpl2.getInserting()) {
        }
        m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
        Updater.m3343setimpl(m3336constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        Modifier modifier52 = modifier4;
        TextKt.m2376Text4IGK_g(label, (Modifier) null, colorScheme2.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), startRestartGroup, i4 & 14, 0, 65530);
        composer2 = startRestartGroup;
        TextKt.m2376Text4IGK_g(value, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getTitleSmall(), composer2, ((i4 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
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
    public static final Unit AccentStatChip_cf5BqRc$lambda$11$lambda$9$lambda$8(long j, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        DrawScope.m4395drawRoundRectuAw5IA$default(Canvas, j, 0L, Canvas.mo4399getSizeNHjbRc(), CornerRadiusKt.CornerRadius(4.0f, 4.0f), null, 0.0f, null, 0, 242, null);
        return Unit.INSTANCE;
    }
}
