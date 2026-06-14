package com.example.rungps.sleep;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MenuKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: SleepHypnogram.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"SleepHypnogramBar", "", "compact", "", "modifier", "Landroidx/compose/ui/Modifier;", "minutesPerBucket", "", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;II)V", "app_sideload"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepHypnogramKt {

    /* compiled from: SleepHypnogram.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SleepStageLabel.values().length];
            try {
                iArr[SleepStageLabel.AWAKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SleepStageLabel.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SleepStageLabel.DEEP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SleepStageLabel.REM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepHypnogramBar$lambda$0(String str, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        SleepHypnogramBar(str, modifier, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepHypnogramBar$lambda$4(String str, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        SleepHypnogramBar(str, modifier, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SleepHypnogramBar(final String str, Modifier modifier, int i, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        int i6;
        final List<SleepStageLabel> decode;
        Modifier modifier3;
        final int i7;
        Composer startRestartGroup = composer.startRestartGroup(13640679);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                i6 = i;
                i4 |= startRestartGroup.changed(i6) ? 256 : 128;
                if ((i4 & 147) == 146 || !startRestartGroup.getSkipping()) {
                    Modifier modifier4 = i8 != 0 ? Modifier.INSTANCE : modifier2;
                    int i9 = i5 != 0 ? 1 : i6;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(13640679, i4, -1, "com.example.rungps.sleep.SleepHypnogramBar (SleepHypnogram.kt:63)");
                    }
                    decode = SleepHypnogramEncoder.INSTANCE.decode(str);
                    if (decode.isEmpty()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final Modifier modifier5 = modifier4;
                            final int i10 = i9;
                            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.sleep.SleepHypnogramKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit SleepHypnogramBar$lambda$0;
                                    SleepHypnogramBar$lambda$0 = SleepHypnogramKt.SleepHypnogramBar$lambda$0(str, modifier5, i10, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    return SleepHypnogramBar$lambda$0;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    ColorScheme colorScheme = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable);
                    Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(6));
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier4);
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
                    modifier3 = modifier4;
                    TextKt.m2376Text4IGK_g("Sleep stages", (Modifier) null, colorScheme.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelLarge(), startRestartGroup, 6, 0, 65530);
                    final long Color = ColorKt.Color(4287931320L);
                    final long Color2 = ColorKt.Color(4286680312L);
                    final long Color3 = ColorKt.Color(4282595530L);
                    final long Color4 = ColorKt.Color(4281652121L);
                    Modifier clip = ClipKt.clip(SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6303constructorimpl(28)), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6303constructorimpl(8)));
                    startRestartGroup.startReplaceGroup(-1913820569);
                    boolean changedInstance = startRestartGroup.changedInstance(decode);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function1() { // from class: com.example.rungps.sleep.SleepHypnogramKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit SleepHypnogramBar$lambda$3$lambda$2$lambda$1;
                                SleepHypnogramBar$lambda$3$lambda$2$lambda$1 = SleepHypnogramKt.SleepHypnogramBar$lambda$3$lambda$2$lambda$1(decode, Color, Color2, Color3, Color4, (DrawScope) obj);
                                return SleepHypnogramBar$lambda$3$lambda$2$lambda$1;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceGroup();
                    CanvasKt.Canvas(clip, (Function1) rememberedValue, startRestartGroup, 0);
                    TextKt.m2376Text4IGK_g("~" + (decode.size() * i9) + " min · Awake · Light · Deep · REM", (Modifier) null, colorScheme.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), startRestartGroup, 0, 0, 65530);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i7 = i9;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    i7 = i6;
                }
                ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
                if (endRestartGroup2 != null) {
                    final Modifier modifier6 = modifier3;
                    endRestartGroup2.updateScope(new Function2() { // from class: com.example.rungps.sleep.SleepHypnogramKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit SleepHypnogramBar$lambda$4;
                            SleepHypnogramBar$lambda$4 = SleepHypnogramKt.SleepHypnogramBar$lambda$4(str, modifier6, i7, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            return SleepHypnogramBar$lambda$4;
                        }
                    });
                    return;
                }
                return;
            }
            i6 = i;
            if ((i4 & 147) == 146) {
            }
            if (i8 != 0) {
            }
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            decode = SleepHypnogramEncoder.INSTANCE.decode(str);
            if (decode.isEmpty()) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        i6 = i;
        if ((i4 & 147) == 146) {
        }
        if (i8 != 0) {
        }
        if (i5 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        decode = SleepHypnogramEncoder.INSTANCE.decode(str);
        if (decode.isEmpty()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepHypnogramBar$lambda$3$lambda$2$lambda$1(List list, long j, long j2, long j3, long j4, DrawScope Canvas) {
        long j5;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        int coerceAtLeast = RangesKt.coerceAtLeast(list.size(), 1);
        float m3671getWidthimpl = Size.m3671getWidthimpl(Canvas.mo4399getSizeNHjbRc()) / coerceAtLeast;
        float m3668getHeightimpl = Size.m3668getHeightimpl(Canvas.mo4399getSizeNHjbRc());
        int i = 0;
        while (i < coerceAtLeast) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[((SleepStageLabel) list.get(i)).ordinal()];
            if (i2 == 1) {
                j5 = j;
            } else if (i2 == 2) {
                j5 = j2;
            } else if (i2 == 3) {
                j5 = j3;
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                j5 = j4;
            }
            DrawScope.m4393drawRectnJ9OG0$default(Canvas, j5, OffsetKt.Offset(i * m3671getWidthimpl, 0.0f), androidx.compose.ui.geometry.SizeKt.Size(m3671getWidthimpl + 0.5f, m3668getHeightimpl), 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
            i++;
            m3668getHeightimpl = m3668getHeightimpl;
        }
        return Unit.INSTANCE;
    }
}
