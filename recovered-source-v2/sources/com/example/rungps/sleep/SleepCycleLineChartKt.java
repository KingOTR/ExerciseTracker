package com.example.rungps.sleep;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.SliderKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.health.platform.client.SdkConfig;
import androidx.profileinstaller.ProfileVerifier;
import com.example.rungps.ui.sleep.SleepChartGesturesKt;
import com.example.rungps.ui.sleep.SleepFormattersKt;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.Grouping;
import kotlin.collections.GroupingKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: SleepCycleLineChart.kt */
@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a¯\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a/\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u001f\u0010 \u001a\u001f\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u0003H\u0003¢\u0006\u0004\b$\u0010%\u001a$\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010*\u001a\u00020\bH\u0002\u001a \u0010+\u001a\u00020\b2\u0006\u0010,\u001a\u00020\b2\u0006\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020\bH\u0002\u001a#\u0010/\u001a\u00020\u00012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010\u0015\u001a\u00020\bH\u0003¢\u0006\u0002\u00100\u001a\u0010\u00101\u001a\u00020\u00032\u0006\u00102\u001a\u00020\bH\u0002\u001a \u00103\u001a\u00020\b2\u0006\u00104\u001a\u00020\b2\u0006\u00105\u001a\u00020\b2\u0006\u00106\u001a\u00020\bH\u0002\u001a\u001e\u00107\u001a\u00020\u00012\u0006\u00108\u001a\u0002092\f\u0010:\u001a\b\u0012\u0004\u0012\u00020;0'H\u0002\u001a\u0010\u0010<\u001a\u00020\u00032\u0006\u0010=\u001a\u00020(H\u0002\u001aK\u0010>\u001a\b\u0012\u0004\u0012\u00020(0'2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010?\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010A¨\u0006B²\u0006\n\u0010C\u001a\u00020\bX\u008a\u008e\u0002"}, d2 = {"SleepCycleLineChart", "", "compact", "", "startTimeMs", "", "endTimeMs", "deepMin", "", "lightMin", "remMin", "awakeMin", "eventMarkersCompact", "snoreEvents", "isPartialTracking", "", "partialTrackingMessage", "modifier", "Landroidx/compose/ui/Modifier;", "heightDp", "Landroidx/compose/ui/unit/Dp;", "minutesPerBucket", "interactive", "SleepCycleLineChart-rpjkMjA", "(Ljava/lang/String;JJLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;ZLjava/lang/String;Landroidx/compose/ui/Modifier;FIZLandroidx/compose/runtime/Composer;III)V", "EventLegend", "snore", "Landroidx/compose/ui/graphics/Color;", "talk", "move", "partial", "EventLegend-RGew2ao", "(JJJZLandroidx/compose/runtime/Composer;I)V", "LegendDot", "color", "label", "LegendDot-Iv8Zu3U", "(JLjava/lang/String;Landroidx/compose/runtime/Composer;I)V", "downsampleStagesPreserveTransitions", "", "Lcom/example/rungps/sleep/SleepStageLabel;", "stages", "targetPoints", "inferMinutesPerBucket", "compactLen", "inBedMin", "stagePoints", "StageDurationSummary", "(Ljava/util/List;ILandroidx/compose/runtime/Composer;I)V", "formatStageMin", "min", "chartIndexToNightMinute", "chartIndex", "chartPoints", "nightMinutes", "appendStepHypnogram", "path", "Landroidx/compose/ui/graphics/Path;", "points", "Landroidx/compose/ui/geometry/Offset;", "stageLabel", "stage", "synthesizeStages", "startMs", "endMs", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;JJ)Ljava/util/List;", "app_sideload", "selectedMinute"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepCycleLineChartKt {

    /* compiled from: SleepCycleLineChart.kt */
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
                iArr[SleepStageLabel.REM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SleepStageLabel.DEEP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventLegend_RGew2ao$lambda$27(long j, long j2, long j3, boolean z, int i, Composer composer, int i2) {
        m6920EventLegendRGew2ao(j, j2, j3, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LegendDot_Iv8Zu3U$lambda$29(long j, String str, int i, Composer composer, int i2) {
        m6921LegendDotIv8Zu3U(j, str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepCycleLineChart_rpjkMjA$lambda$25(String str, long j, long j2, Integer num, Integer num2, Integer num3, Integer num4, String str2, Integer num5, boolean z, String str3, Modifier modifier, float f, int i, boolean z2, int i2, int i3, int i4, Composer composer, int i5) {
        m6922SleepCycleLineChartrpjkMjA(str, j, j2, num, num2, num3, num4, str2, num5, z, str3, modifier, f, i, z2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepCycleLineChart_rpjkMjA$lambda$6(String str, long j, long j2, Integer num, Integer num2, Integer num3, Integer num4, String str2, Integer num5, boolean z, String str3, Modifier modifier, float f, int i, boolean z2, int i2, int i3, int i4, Composer composer, int i5) {
        m6922SleepCycleLineChartrpjkMjA(str, j, j2, num, num2, num3, num4, str2, num5, z, str3, modifier, f, i, z2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StageDurationSummary$lambda$33(List list, int i, int i2, Composer composer, int i3) {
        StageDurationSummary(list, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StageDurationSummary$lambda$44(List list, int i, int i2, Composer composer, int i3) {
        StageDurationSummary(list, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StageDurationSummary$lambda$45(List list, int i, int i2, Composer composer, int i3) {
        StageDurationSummary(list, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x025c  */
    /* JADX WARN: Type inference failed for: r7v64 */
    /* JADX WARN: Type inference failed for: r7v65, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v79 */
    /* renamed from: SleepCycleLineChart-rpjkMjA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m6922SleepCycleLineChartrpjkMjA(final String str, final long j, final long j2, Integer num, Integer num2, Integer num3, Integer num4, String str2, Integer num5, boolean z, String str3, Modifier modifier, float f, int i, boolean z2, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        String str4;
        Integer num6;
        boolean z3;
        boolean z4;
        Object rememberedValue;
        final int intValue;
        boolean changed;
        String str5;
        Object decode;
        List<SleepStageLabel> list;
        boolean changed2;
        Object rememberedValue2;
        boolean changed3;
        Object rememberedValue3;
        List list2;
        boolean z5;
        Object rememberedValue4;
        int i17;
        ZoneId zoneId;
        List list3;
        final MutableIntState mutableIntState;
        Modifier.Companion companion;
        ?? r7;
        float f2;
        final Integer num7;
        final Integer num8;
        final Integer num9;
        final Integer num10;
        final float f3;
        final boolean z6;
        final int i18;
        final boolean z7;
        final Integer num11;
        final Modifier modifier2;
        final String str6;
        final String str7;
        String str8;
        Composer startRestartGroup = composer.startRestartGroup(211393319);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (startRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
        } else if ((i2 & 384) == 0) {
            i5 |= startRestartGroup.changed(j2) ? 256 : 128;
        }
        int i19 = i4 & 8;
        if (i19 != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= startRestartGroup.changed(num) ? 2048 : 1024;
            i6 = i4 & 16;
            if (i6 == 0) {
                i5 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i5 |= startRestartGroup.changed(num2) ? 16384 : 8192;
                i7 = i4 & 32;
                if (i7 != 0) {
                    i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i5 |= startRestartGroup.changed(num3) ? 131072 : 65536;
                }
                i8 = i4 & 64;
                if (i8 != 0) {
                    i5 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i5 |= startRestartGroup.changed(num4) ? 1048576 : 524288;
                }
                i9 = i4 & 128;
                if (i9 != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i5 |= startRestartGroup.changed(str2) ? 8388608 : 4194304;
                }
                i10 = i4 & 256;
                if (i10 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    i5 |= startRestartGroup.changed(num5) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                i11 = i4 & 512;
                if (i11 != 0) {
                    i5 |= 805306368;
                } else if ((i2 & 805306368) == 0) {
                    i5 |= startRestartGroup.changed(z) ? 536870912 : 268435456;
                }
                i12 = i4 & 1024;
                if (i12 != 0) {
                    i13 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    i13 = i3 | (startRestartGroup.changed(str3) ? 4 : 2);
                } else {
                    i13 = i3;
                }
                i14 = i4 & 2048;
                if (i14 != 0) {
                    i13 |= 48;
                } else if ((i3 & 48) == 0) {
                    i13 |= startRestartGroup.changed(modifier) ? 32 : 16;
                }
                int i20 = i13;
                i15 = i4 & 4096;
                if (i15 != 0) {
                    i20 |= 384;
                } else if ((i3 & 384) == 0) {
                    i20 |= startRestartGroup.changed(f) ? 256 : 128;
                    i16 = i4 & 16384;
                    if (i16 == 0) {
                        i20 |= 24576;
                    } else if ((i3 & 24576) == 0) {
                        i20 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                        if ((i5 & 306783379) == 306783378 || (i20 & 8339) != 8338 || !startRestartGroup.getSkipping()) {
                            Integer num12 = i19 != 0 ? null : num;
                            Integer num13 = i6 != 0 ? null : num2;
                            Integer num14 = i7 != 0 ? null : num3;
                            Integer num15 = i8 != 0 ? null : num4;
                            str4 = i9 != 0 ? null : str2;
                            num6 = i10 != 0 ? null : num5;
                            z3 = i11 != 0 ? false : z;
                            String str9 = i12 != 0 ? null : str3;
                            Modifier modifier3 = i14 != 0 ? Modifier.INSTANCE : modifier;
                            float m6303constructorimpl = i15 != 0 ? Dp.m6303constructorimpl(180) : f;
                            int i21 = (i4 & 8192) != 0 ? 1 : i;
                            boolean z8 = i16 != 0 ? true : z2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(211393319, i5, i20, "com.example.rungps.sleep.SleepCycleLineChart (SleepCycleLineChart.kt:66)");
                            }
                            startRestartGroup.startReplaceGroup(337154293);
                            z4 = ((i5 & SdkConfig.SDK_VERSION) == 32) | ((i5 & 896) == 256);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z4 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = Integer.valueOf(RangesKt.coerceIn((int) ((j2 - j) / 60000), 1, 900));
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            intValue = ((Number) rememberedValue).intValue();
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(337158780);
                            int i22 = i5 & 14;
                            int i23 = i5 & 1879048192;
                            changed = ((i5 & 7168) == 2048) | (i22 == 4) | ((57344 & i5) == 16384) | ((458752 & i5) == 131072) | ((3670016 & i5) == 1048576) | (i23 == 536870912) | startRestartGroup.changed(intValue);
                            Object rememberedValue5 = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                str5 = str;
                                decode = SleepHypnogramEncoder.INSTANCE.decode(str5);
                                if (z3) {
                                    List<SleepStageLabel> synthesizeStages = synthesizeStages(num12, num13, num14, num15, j, j2);
                                    if (!synthesizeStages.isEmpty()) {
                                        decode = synthesizeStages;
                                    }
                                    decode = (List) decode;
                                } else if (((Collection) decode).isEmpty()) {
                                    decode = synthesizeStages(num12, num13, num14, num15, j, j2);
                                }
                                startRestartGroup.updateRememberedValue(decode);
                            } else {
                                decode = rememberedValue5;
                                str5 = str;
                            }
                            list = (List) decode;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(337174630);
                            changed2 = (i22 == 4) | startRestartGroup.changed(intValue);
                            final float f4 = m6303constructorimpl;
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = Integer.valueOf(inferMinutesPerBucket(str5 != null ? str.length() : list.size(), intValue, list.size()));
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            int intValue2 = ((Number) rememberedValue2).intValue();
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(337179727);
                            changed3 = startRestartGroup.changed(list) | (i23 == 536870912);
                            rememberedValue3 = startRestartGroup.rememberedValue();
                            if (!changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                if (!z3) {
                                    if (list.size() > 360) {
                                        list = downsampleStagesPreserveTransitions(list, 240);
                                    } else if (list.size() > 200) {
                                        list = downsampleStagesPreserveTransitions(list, 160);
                                    }
                                }
                                startRestartGroup.updateRememberedValue(list);
                                rememberedValue3 = list;
                            }
                            list2 = (List) rememberedValue3;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(337190645);
                            z5 = ((29360128 & i5) == 8388608) | (i22 == 4) | ((234881024 & i5) == 67108864);
                            rememberedValue4 = startRestartGroup.rememberedValue();
                            if (!z5 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = SleepEventMarkersEncoder.INSTANCE.resolve(str4, str5, num6);
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            final List list4 = (List) rememberedValue4;
                            startRestartGroup.endReplaceGroup();
                            if (list2.isEmpty()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup != null) {
                                    final Integer num16 = num12;
                                    final Integer num17 = num13;
                                    final Integer num18 = num14;
                                    final Integer num19 = num6;
                                    final Integer num20 = num15;
                                    final String str10 = str4;
                                    final String str11 = str9;
                                    final Modifier modifier4 = modifier3;
                                    final boolean z9 = z3;
                                    final int i24 = i21;
                                    final boolean z10 = z8;
                                    endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.sleep.SleepCycleLineChartKt$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            Unit SleepCycleLineChart_rpjkMjA$lambda$6;
                                            SleepCycleLineChart_rpjkMjA$lambda$6 = SleepCycleLineChartKt.SleepCycleLineChart_rpjkMjA$lambda$6(str, j, j2, num16, num17, num18, num20, str10, num19, z9, str11, modifier4, f4, i24, z10, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                            return SleepCycleLineChart_rpjkMjA$lambda$6;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            Integer num21 = num6;
                            final String str12 = str9;
                            Modifier modifier5 = modifier3;
                            startRestartGroup.startReplaceGroup(337197302);
                            boolean changed4 = startRestartGroup.changed(list2);
                            Object rememberedValue6 = startRestartGroup.rememberedValue();
                            if (changed4 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue6 = SnapshotIntStateKt.mutableIntStateOf(0);
                                startRestartGroup.updateRememberedValue(rememberedValue6);
                            }
                            MutableIntState mutableIntState2 = (MutableIntState) rememberedValue6;
                            startRestartGroup.endReplaceGroup();
                            final ColorScheme colorScheme = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable);
                            final long Color = ColorKt.Color(4287931320L);
                            final long Color2 = ColorKt.Color(4286680312L);
                            final long Color3 = ColorKt.Color(4282595530L);
                            final long Color4 = ColorKt.Color(4281652121L);
                            String str13 = str4;
                            final long tertiary = colorScheme.getTertiary();
                            final long m3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(colorScheme.getOnSurface(), 0.45f, 0.0f, 0.0f, 0.0f, 14, null);
                            final long Color5 = ColorKt.Color(4294286859L);
                            final long Color6 = ColorKt.Color(4289222135L);
                            final long Color7 = ColorKt.Color(4281908728L);
                            ZoneId systemDefault = ZoneId.systemDefault();
                            String format = Instant.ofEpochMilli(j).atZone(systemDefault).format(SleepFormattersKt.getSleepAmPmFmt());
                            String format2 = Instant.ofEpochMilli(j2).atZone(systemDefault).format(SleepFormattersKt.getSleepAmPmFmt());
                            long j3 = j2 - j;
                            String format3 = Instant.ofEpochMilli(j + (j3 / 2)).atZone(systemDefault).format(SleepFormattersKt.getSleepAmPmFmt());
                            RangesKt.coerceAtLeast(j3, 1L);
                            Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(6));
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier5);
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
                            startRestartGroup.startReplaceGroup(-1054634858);
                            if (!z3 || (str8 = str12) == null || StringsKt.isBlank(str8)) {
                                i17 = i5;
                                zoneId = systemDefault;
                            } else {
                                i17 = i5;
                                zoneId = systemDefault;
                                SurfaceKt.m2226SurfaceT9BRK9s(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6303constructorimpl(10)), Color.m3842copywmQWz5c$default(colorScheme.getTertiaryContainer(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1729951493, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.sleep.SleepCycleLineChartKt$SleepCycleLineChart$2$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num22) {
                                        invoke(composer2, num22.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i25) {
                                        if ((i25 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1729951493, i25, -1, "com.example.rungps.sleep.SleepCycleLineChart.<anonymous>.<anonymous> (SleepCycleLineChart.kt:121)");
                                            }
                                            TextStyle bodySmall = MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodySmall();
                                            TextKt.m2376Text4IGK_g(str12, PaddingKt.m684padding3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(10)), ColorScheme.this.getOnTertiaryContainer(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, bodySmall, composer2, 48, 0, 65528);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }, startRestartGroup, 54), startRestartGroup, 12582918, MenuKt.InTransitionDuration);
                            }
                            startRestartGroup.endReplaceGroup();
                            int i25 = i17;
                            ZoneId zoneId2 = zoneId;
                            TextKt.m2376Text4IGK_g("Stages: awake (bottom) → light → REM → deep (top)", (Modifier) null, colorScheme.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), startRestartGroup, 6, 0, 65530);
                            if (z8 && !z3) {
                                startRestartGroup.startReplaceGroup(1666840956);
                                TextKt.m2376Text4IGK_g("Drag or tap the chart to inspect snore, talking, and movement", (Modifier) null, colorScheme.getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), startRestartGroup, 6, 0, 65530);
                                startRestartGroup.endReplaceGroup();
                            } else if (z8) {
                                startRestartGroup.startReplaceGroup(1667087375);
                                TextKt.m2376Text4IGK_g("Drag or tap — smooth estimate from in-bed time (mic tracked partial night)", (Modifier) null, colorScheme.getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), startRestartGroup, 6, 0, 65530);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(1667316093);
                                startRestartGroup.endReplaceGroup();
                            }
                            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Arrangement.HorizontalOrVertical m564spacedBy0680j_42 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(4));
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m564spacedBy0680j_42, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            int i26 = intValue2;
                            String str14 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, str14);
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
                            float f5 = f4;
                            float f6 = 10;
                            Modifier m688paddingqDBjuR0$default = PaddingKt.m688paddingqDBjuR0$default(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, f5), 0.0f, Dp.m6303constructorimpl(f6), 0.0f, Dp.m6303constructorimpl(18), 5, null);
                            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(spaceBetween, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m688paddingqDBjuR0$default);
                            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, str14);
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor3);
                            } else {
                                startRestartGroup.useNode();
                            }
                            Composer m3336constructorimpl3 = Updater.m3336constructorimpl(startRestartGroup);
                            Updater.m3343setimpl(m3336constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3343setimpl(m3336constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m3336constructorimpl3.getInserting() || !Intrinsics.areEqual(m3336constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                m3336constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                m3336constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m3343setimpl(m3336constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                            startRestartGroup.startReplaceGroup(432816116);
                            Iterator it = CollectionsKt.listOf((Object[]) new String[]{"Deep", "REM", "Light", "Awake"}).iterator();
                            while (it.hasNext()) {
                                TextKt.m2376Text4IGK_g((String) it.next(), (Modifier) null, colorScheme.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), startRestartGroup, 0, 0, 65530);
                                f6 = f6;
                                f5 = f5;
                                i26 = i26;
                                str14 = str14;
                            }
                            float f7 = f6;
                            float f8 = f5;
                            String str15 = str14;
                            int i27 = i26;
                            startRestartGroup.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            Modifier clip = ClipKt.clip(SizeKt.m715height3ABfNKs(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), f8), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6303constructorimpl(12)));
                            startRestartGroup.startReplaceGroup(1252914041);
                            if (z8) {
                                Modifier sleepChartTouchPriority = SleepChartGesturesKt.sleepChartTouchPriority(Modifier.INSTANCE);
                                list3 = list2;
                                Object[] objArr = {list3, list4, Integer.valueOf(intValue)};
                                startRestartGroup.startReplaceGroup(1252919723);
                                mutableIntState = mutableIntState2;
                                boolean changed5 = startRestartGroup.changed(mutableIntState) | startRestartGroup.changedInstance(list3);
                                SleepCycleLineChartKt$SleepCycleLineChart$2$2$2$1 rememberedValue7 = startRestartGroup.rememberedValue();
                                if (changed5 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue7 = new SleepCycleLineChartKt$SleepCycleLineChart$2$2$2$1(list3, mutableIntState, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue7);
                                }
                                startRestartGroup.endReplaceGroup();
                                companion = SuspendingPointerInputFilterKt.pointerInput(sleepChartTouchPriority, objArr, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue7);
                            } else {
                                list3 = list2;
                                mutableIntState = mutableIntState2;
                                companion = Modifier.INSTANCE;
                            }
                            startRestartGroup.endReplaceGroup();
                            Modifier then = clip.then(companion);
                            startRestartGroup.startReplaceGroup(1252974230);
                            boolean changedInstance = startRestartGroup.changedInstance(list3) | startRestartGroup.changed(m3842copywmQWz5c$default) | startRestartGroup.changed(colorScheme) | startRestartGroup.changed(tertiary) | (i23 == 536870912) | startRestartGroup.changedInstance(list4) | startRestartGroup.changed(intValue) | startRestartGroup.changed(mutableIntState);
                            Object rememberedValue8 = startRestartGroup.rememberedValue();
                            if (changedInstance || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                final List list5 = list3;
                                final boolean z11 = z3;
                                final MutableIntState mutableIntState3 = mutableIntState;
                                rememberedValue8 = new Function1() { // from class: com.example.rungps.sleep.SleepCycleLineChartKt$$ExternalSyntheticLambda6
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit SleepCycleLineChart_rpjkMjA$lambda$24$lambda$18$lambda$17$lambda$16;
                                        SleepCycleLineChart_rpjkMjA$lambda$24$lambda$18$lambda$17$lambda$16 = SleepCycleLineChartKt.SleepCycleLineChart_rpjkMjA$lambda$24$lambda$18$lambda$17$lambda$16(list5, m3842copywmQWz5c$default, colorScheme, Color, Color2, Color3, Color4, tertiary, z11, list4, intValue, Color5, Color6, Color7, mutableIntState3, (DrawScope) obj);
                                        return SleepCycleLineChart_rpjkMjA$lambda$24$lambda$18$lambda$17$lambda$16;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue8);
                            }
                            startRestartGroup.endReplaceGroup();
                            CanvasKt.Canvas(then, (Function1) rememberedValue8, startRestartGroup, 0);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            m6920EventLegendRGew2ao(Color5, Color6, Color7, z3, startRestartGroup, ((i25 >> 18) & 7168) | 438);
                            StageDurationSummary(list3, i27, startRestartGroup, 0);
                            startRestartGroup.startReplaceGroup(-1054313045);
                            if (!z8 || list3.size() <= 2) {
                                r7 = 1;
                            } else {
                                r7 = 1;
                                final int coerceAtLeast = RangesKt.coerceAtLeast(list3.size() - 1, 1);
                                float coerceIn = RangesKt.coerceIn(SleepCycleLineChart_rpjkMjA$lambda$8(mutableIntState), 0, coerceAtLeast);
                                ClosedFloatingPointRange<Float> rangeTo = RangesKt.rangeTo(0.0f, coerceAtLeast);
                                int coerceIn2 = RangesKt.coerceIn(coerceAtLeast - 1, 0, 24);
                                Modifier sleepSliderTouchGuard = SleepChartGesturesKt.sleepSliderTouchGuard(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), startRestartGroup, 6);
                                startRestartGroup.startReplaceGroup(-1054306219);
                                boolean changed6 = startRestartGroup.changed(mutableIntState) | startRestartGroup.changed(coerceAtLeast);
                                Object rememberedValue9 = startRestartGroup.rememberedValue();
                                if (changed6 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue9 = new Function1() { // from class: com.example.rungps.sleep.SleepCycleLineChartKt$$ExternalSyntheticLambda7
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            Unit SleepCycleLineChart_rpjkMjA$lambda$24$lambda$20$lambda$19;
                                            SleepCycleLineChart_rpjkMjA$lambda$24$lambda$20$lambda$19 = SleepCycleLineChartKt.SleepCycleLineChart_rpjkMjA$lambda$24$lambda$20$lambda$19(coerceAtLeast, mutableIntState, ((Float) obj).floatValue());
                                            return SleepCycleLineChart_rpjkMjA$lambda$24$lambda$20$lambda$19;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue9);
                                }
                                startRestartGroup.endReplaceGroup();
                                SliderKt.Slider(coerceIn, (Function1) rememberedValue9, sleepSliderTouchGuard, false, rangeTo, coerceIn2, null, null, null, startRestartGroup, 0, 456);
                            }
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(-1054294197);
                            int size = list3.size();
                            int SleepCycleLineChart_rpjkMjA$lambda$8 = SleepCycleLineChart_rpjkMjA$lambda$8(mutableIntState);
                            if (SleepCycleLineChart_rpjkMjA$lambda$8 < 0 || SleepCycleLineChart_rpjkMjA$lambda$8 >= size) {
                                f2 = f8;
                            } else {
                                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(localContext);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                Context context = (Context) consume;
                                int chartIndexToNightMinute = chartIndexToNightMinute(SleepCycleLineChart_rpjkMjA$lambda$8(mutableIntState), list3.size(), RangesKt.coerceAtLeast(list4.size(), intValue));
                                SleepMinuteEvent sleepMinuteEvent = (SleepMinuteEvent) CollectionsKt.getOrNull(list4, chartIndexToNightMinute);
                                String format4 = Instant.ofEpochMilli(j + (chartIndexToNightMinute * 60000)).atZone(zoneId2).format(SleepFormattersKt.getSleepAmPmFmt());
                                SleepStageLabel sleepStageLabel = (SleepStageLabel) list3.get(SleepCycleLineChart_rpjkMjA$lambda$8(mutableIntState));
                                List createListBuilder = CollectionsKt.createListBuilder();
                                createListBuilder.add(stageLabel(sleepStageLabel));
                                if (sleepMinuteEvent != null) {
                                    if (sleepMinuteEvent.getSnore()) {
                                        createListBuilder.add("Snore / noise");
                                    }
                                    if (sleepMinuteEvent.getTalk()) {
                                        createListBuilder.add("Talking / voice");
                                    }
                                    if (sleepMinuteEvent.getMovement()) {
                                        createListBuilder.add("Movement spike");
                                    }
                                    Unit unit = Unit.INSTANCE;
                                    Unit unit2 = Unit.INSTANCE;
                                }
                                if ((sleepMinuteEvent == null || !sleepMinuteEvent.getHasMarker()) && sleepStageLabel == SleepStageLabel.AWAKE) {
                                    createListBuilder.add("Awake (possible disturbance)");
                                }
                                f2 = f8;
                                SurfaceKt.m2226SurfaceT9BRK9s(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, r7, null), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6303constructorimpl(f7)), colorScheme.getSurfaceContainerHigh(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(948848034, r7, new SleepCycleLineChartKt$SleepCycleLineChart$2$4(format4, CollectionsKt.build(createListBuilder), colorScheme, sleepMinuteEvent, context), startRestartGroup, 54), startRestartGroup, 12582918, MenuKt.InTransitionDuration);
                            }
                            startRestartGroup.endReplaceGroup();
                            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, r7, null);
                            Arrangement.HorizontalOrVertical spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween2, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
                            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, str15);
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor4);
                            } else {
                                startRestartGroup.useNode();
                            }
                            Composer m3336constructorimpl4 = Updater.m3336constructorimpl(startRestartGroup);
                            Updater.m3343setimpl(m3336constructorimpl4, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3343setimpl(m3336constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m3336constructorimpl4.getInserting() || !Intrinsics.areEqual(m3336constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                m3336constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                m3336constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                            }
                            Updater.m3343setimpl(m3336constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                            Intrinsics.checkNotNull(format);
                            float f9 = f2;
                            TextKt.m2376Text4IGK_g(format, (Modifier) null, colorScheme.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), startRestartGroup, 0, 0, 65530);
                            Intrinsics.checkNotNull(format3);
                            TextKt.m2376Text4IGK_g(format3, (Modifier) null, colorScheme.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), startRestartGroup, 0, 0, 65530);
                            Intrinsics.checkNotNull(format2);
                            TextKt.m2376Text4IGK_g(format2, (Modifier) null, colorScheme.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), startRestartGroup, 0, 0, 65530);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            TextKt.m2376Text4IGK_g("~" + (list3.size() * i27) + " min timeline · tap markers for detail", PaddingKt.m688paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6303constructorimpl(2), 0.0f, 0.0f, 13, null), colorScheme.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), startRestartGroup, 48, 0, 65528);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            startRestartGroup.endNode();
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            num7 = num12;
                            num8 = num13;
                            num9 = num14;
                            num10 = num15;
                            f3 = f9;
                            z6 = z3;
                            i18 = i21;
                            z7 = z8;
                            num11 = num21;
                            modifier2 = modifier5;
                            str6 = str12;
                            str7 = str13;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            num7 = num;
                            num8 = num2;
                            num9 = num3;
                            num10 = num4;
                            str7 = str2;
                            num11 = num5;
                            z6 = z;
                            str6 = str3;
                            modifier2 = modifier;
                            f3 = f;
                            i18 = i;
                            z7 = z2;
                        }
                        ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
                        if (endRestartGroup2 != null) {
                            endRestartGroup2.updateScope(new Function2() { // from class: com.example.rungps.sleep.SleepCycleLineChartKt$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit SleepCycleLineChart_rpjkMjA$lambda$25;
                                    SleepCycleLineChart_rpjkMjA$lambda$25 = SleepCycleLineChartKt.SleepCycleLineChart_rpjkMjA$lambda$25(str, j, j2, num7, num8, num9, num10, str7, num11, z6, str6, modifier2, f3, i18, z7, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                    return SleepCycleLineChart_rpjkMjA$lambda$25;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if ((i5 & 306783379) == 306783378) {
                    }
                    if (i19 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if ((i4 & 8192) != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceGroup(337154293);
                    z4 = ((i5 & SdkConfig.SDK_VERSION) == 32) | ((i5 & 896) == 256);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z4) {
                    }
                    rememberedValue = Integer.valueOf(RangesKt.coerceIn((int) ((j2 - j) / 60000), 1, 900));
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    intValue = ((Number) rememberedValue).intValue();
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(337158780);
                    int i222 = i5 & 14;
                    if (i222 == 4) {
                    }
                    int i232 = i5 & 1879048192;
                    changed = ((i5 & 7168) == 2048) | (i222 == 4) | ((57344 & i5) == 16384) | ((458752 & i5) == 131072) | ((3670016 & i5) == 1048576) | (i232 == 536870912) | startRestartGroup.changed(intValue);
                    Object rememberedValue52 = startRestartGroup.rememberedValue();
                    if (changed) {
                    }
                    str5 = str;
                    decode = SleepHypnogramEncoder.INSTANCE.decode(str5);
                    if (z3) {
                    }
                    startRestartGroup.updateRememberedValue(decode);
                    list = (List) decode;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(337174630);
                    changed2 = (i222 == 4) | startRestartGroup.changed(intValue);
                    final float f42 = m6303constructorimpl;
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changed2) {
                    }
                    rememberedValue2 = Integer.valueOf(inferMinutesPerBucket(str5 != null ? str.length() : list.size(), intValue, list.size()));
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    int intValue22 = ((Number) rememberedValue2).intValue();
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(337179727);
                    changed3 = startRestartGroup.changed(list) | (i232 == 536870912);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed3) {
                    }
                    if (!z3) {
                    }
                    startRestartGroup.updateRememberedValue(list);
                    rememberedValue3 = list;
                    list2 = (List) rememberedValue3;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(337190645);
                    z5 = ((29360128 & i5) == 8388608) | (i222 == 4) | ((234881024 & i5) == 67108864);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!z5) {
                    }
                    rememberedValue4 = SleepEventMarkersEncoder.INSTANCE.resolve(str4, str5, num6);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                    final List list42 = (List) rememberedValue4;
                    startRestartGroup.endReplaceGroup();
                    if (list2.isEmpty()) {
                    }
                }
                i16 = i4 & 16384;
                if (i16 == 0) {
                }
                if ((i5 & 306783379) == 306783378) {
                }
                if (i19 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if (i12 != 0) {
                }
                if (i14 != 0) {
                }
                if (i15 != 0) {
                }
                if ((i4 & 8192) != 0) {
                }
                if (i16 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceGroup(337154293);
                z4 = ((i5 & SdkConfig.SDK_VERSION) == 32) | ((i5 & 896) == 256);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z4) {
                }
                rememberedValue = Integer.valueOf(RangesKt.coerceIn((int) ((j2 - j) / 60000), 1, 900));
                startRestartGroup.updateRememberedValue(rememberedValue);
                intValue = ((Number) rememberedValue).intValue();
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(337158780);
                int i2222 = i5 & 14;
                if (i2222 == 4) {
                }
                int i2322 = i5 & 1879048192;
                changed = ((i5 & 7168) == 2048) | (i2222 == 4) | ((57344 & i5) == 16384) | ((458752 & i5) == 131072) | ((3670016 & i5) == 1048576) | (i2322 == 536870912) | startRestartGroup.changed(intValue);
                Object rememberedValue522 = startRestartGroup.rememberedValue();
                if (changed) {
                }
                str5 = str;
                decode = SleepHypnogramEncoder.INSTANCE.decode(str5);
                if (z3) {
                }
                startRestartGroup.updateRememberedValue(decode);
                list = (List) decode;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(337174630);
                changed2 = (i2222 == 4) | startRestartGroup.changed(intValue);
                final float f422 = m6303constructorimpl;
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed2) {
                }
                rememberedValue2 = Integer.valueOf(inferMinutesPerBucket(str5 != null ? str.length() : list.size(), intValue, list.size()));
                startRestartGroup.updateRememberedValue(rememberedValue2);
                int intValue222 = ((Number) rememberedValue2).intValue();
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(337179727);
                changed3 = startRestartGroup.changed(list) | (i2322 == 536870912);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed3) {
                }
                if (!z3) {
                }
                startRestartGroup.updateRememberedValue(list);
                rememberedValue3 = list;
                list2 = (List) rememberedValue3;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(337190645);
                z5 = ((29360128 & i5) == 8388608) | (i2222 == 4) | ((234881024 & i5) == 67108864);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!z5) {
                }
                rememberedValue4 = SleepEventMarkersEncoder.INSTANCE.resolve(str4, str5, num6);
                startRestartGroup.updateRememberedValue(rememberedValue4);
                final List list422 = (List) rememberedValue4;
                startRestartGroup.endReplaceGroup();
                if (list2.isEmpty()) {
                }
            }
            i7 = i4 & 32;
            if (i7 != 0) {
            }
            i8 = i4 & 64;
            if (i8 != 0) {
            }
            i9 = i4 & 128;
            if (i9 != 0) {
            }
            i10 = i4 & 256;
            if (i10 != 0) {
            }
            i11 = i4 & 512;
            if (i11 != 0) {
            }
            i12 = i4 & 1024;
            if (i12 != 0) {
            }
            i14 = i4 & 2048;
            if (i14 != 0) {
            }
            int i202 = i13;
            i15 = i4 & 4096;
            if (i15 != 0) {
            }
            i16 = i4 & 16384;
            if (i16 == 0) {
            }
            if ((i5 & 306783379) == 306783378) {
            }
            if (i19 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (i12 != 0) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            if ((i4 & 8192) != 0) {
            }
            if (i16 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceGroup(337154293);
            z4 = ((i5 & SdkConfig.SDK_VERSION) == 32) | ((i5 & 896) == 256);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z4) {
            }
            rememberedValue = Integer.valueOf(RangesKt.coerceIn((int) ((j2 - j) / 60000), 1, 900));
            startRestartGroup.updateRememberedValue(rememberedValue);
            intValue = ((Number) rememberedValue).intValue();
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(337158780);
            int i22222 = i5 & 14;
            if (i22222 == 4) {
            }
            int i23222 = i5 & 1879048192;
            changed = ((i5 & 7168) == 2048) | (i22222 == 4) | ((57344 & i5) == 16384) | ((458752 & i5) == 131072) | ((3670016 & i5) == 1048576) | (i23222 == 536870912) | startRestartGroup.changed(intValue);
            Object rememberedValue5222 = startRestartGroup.rememberedValue();
            if (changed) {
            }
            str5 = str;
            decode = SleepHypnogramEncoder.INSTANCE.decode(str5);
            if (z3) {
            }
            startRestartGroup.updateRememberedValue(decode);
            list = (List) decode;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(337174630);
            changed2 = (i22222 == 4) | startRestartGroup.changed(intValue);
            final float f4222 = m6303constructorimpl;
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue2 = Integer.valueOf(inferMinutesPerBucket(str5 != null ? str.length() : list.size(), intValue, list.size()));
            startRestartGroup.updateRememberedValue(rememberedValue2);
            int intValue2222 = ((Number) rememberedValue2).intValue();
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(337179727);
            changed3 = startRestartGroup.changed(list) | (i23222 == 536870912);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed3) {
            }
            if (!z3) {
            }
            startRestartGroup.updateRememberedValue(list);
            rememberedValue3 = list;
            list2 = (List) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(337190645);
            z5 = ((29360128 & i5) == 8388608) | (i22222 == 4) | ((234881024 & i5) == 67108864);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!z5) {
            }
            rememberedValue4 = SleepEventMarkersEncoder.INSTANCE.resolve(str4, str5, num6);
            startRestartGroup.updateRememberedValue(rememberedValue4);
            final List list4222 = (List) rememberedValue4;
            startRestartGroup.endReplaceGroup();
            if (list2.isEmpty()) {
            }
        }
        i6 = i4 & 16;
        if (i6 == 0) {
        }
        i7 = i4 & 32;
        if (i7 != 0) {
        }
        i8 = i4 & 64;
        if (i8 != 0) {
        }
        i9 = i4 & 128;
        if (i9 != 0) {
        }
        i10 = i4 & 256;
        if (i10 != 0) {
        }
        i11 = i4 & 512;
        if (i11 != 0) {
        }
        i12 = i4 & 1024;
        if (i12 != 0) {
        }
        i14 = i4 & 2048;
        if (i14 != 0) {
        }
        int i2022 = i13;
        i15 = i4 & 4096;
        if (i15 != 0) {
        }
        i16 = i4 & 16384;
        if (i16 == 0) {
        }
        if ((i5 & 306783379) == 306783378) {
        }
        if (i19 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (i12 != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        if ((i4 & 8192) != 0) {
        }
        if (i16 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(337154293);
        z4 = ((i5 & SdkConfig.SDK_VERSION) == 32) | ((i5 & 896) == 256);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z4) {
        }
        rememberedValue = Integer.valueOf(RangesKt.coerceIn((int) ((j2 - j) / 60000), 1, 900));
        startRestartGroup.updateRememberedValue(rememberedValue);
        intValue = ((Number) rememberedValue).intValue();
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(337158780);
        int i222222 = i5 & 14;
        if (i222222 == 4) {
        }
        int i232222 = i5 & 1879048192;
        changed = ((i5 & 7168) == 2048) | (i222222 == 4) | ((57344 & i5) == 16384) | ((458752 & i5) == 131072) | ((3670016 & i5) == 1048576) | (i232222 == 536870912) | startRestartGroup.changed(intValue);
        Object rememberedValue52222 = startRestartGroup.rememberedValue();
        if (changed) {
        }
        str5 = str;
        decode = SleepHypnogramEncoder.INSTANCE.decode(str5);
        if (z3) {
        }
        startRestartGroup.updateRememberedValue(decode);
        list = (List) decode;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(337174630);
        changed2 = (i222222 == 4) | startRestartGroup.changed(intValue);
        final float f42222 = m6303constructorimpl;
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue2 = Integer.valueOf(inferMinutesPerBucket(str5 != null ? str.length() : list.size(), intValue, list.size()));
        startRestartGroup.updateRememberedValue(rememberedValue2);
        int intValue22222 = ((Number) rememberedValue2).intValue();
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(337179727);
        changed3 = startRestartGroup.changed(list) | (i232222 == 536870912);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!changed3) {
        }
        if (!z3) {
        }
        startRestartGroup.updateRememberedValue(list);
        rememberedValue3 = list;
        list2 = (List) rememberedValue3;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(337190645);
        z5 = ((29360128 & i5) == 8388608) | (i222222 == 4) | ((234881024 & i5) == 67108864);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!z5) {
        }
        rememberedValue4 = SleepEventMarkersEncoder.INSTANCE.resolve(str4, str5, num6);
        startRestartGroup.updateRememberedValue(rememberedValue4);
        final List list42222 = (List) rememberedValue4;
        startRestartGroup.endReplaceGroup();
        if (list2.isEmpty()) {
        }
    }

    private static final int SleepCycleLineChart_rpjkMjA$lambda$8(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepCycleLineChart_rpjkMjA$lambda$24$lambda$18$lambda$17$lambda$16(List list, long j, ColorScheme colorScheme, long j2, long j3, long j4, long j5, long j6, boolean z, List list2, int i, long j7, long j8, long j9, MutableIntState mutableIntState, DrawScope Canvas) {
        long j10;
        DrawContext drawContext;
        int i2;
        float f;
        float f2;
        float f3;
        float f4;
        int i3;
        int coerceIn;
        long m3878getTransparent0d7_KjU;
        long m3842copywmQWz5c$default;
        long j11;
        DrawContext drawContext2;
        int i4;
        List list3 = list;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float m3671getWidthimpl = Size.m3671getWidthimpl(Canvas.mo4399getSizeNHjbRc()) - 8.0f;
        float m3668getHeightimpl = Size.m3668getHeightimpl(Canvas.mo4399getSizeNHjbRc()) - 18.0f;
        int coerceAtLeast = RangesKt.coerceAtLeast(list.size(), 2);
        float f5 = m3668getHeightimpl - 10.0f;
        float f6 = m3671getWidthimpl - 8.0f;
        float f7 = m3668getHeightimpl;
        DrawScope.m4385drawLineNGM6Ib0$default(Canvas, j, OffsetKt.Offset(8.0f, m3668getHeightimpl), OffsetKt.Offset(m3671getWidthimpl, m3668getHeightimpl), 2.0f, 0, null, 0.0f, null, 0, 496, null);
        float f8 = 8.0f;
        DrawScope.m4385drawLineNGM6Ib0$default(Canvas, j, OffsetKt.Offset(8.0f, f7), OffsetKt.Offset(8.0f, 10.0f), 2.0f, 0, null, 0.0f, null, 0, 496, null);
        int m3832getIntersectrtfAjoo = ClipOp.INSTANCE.m3832getIntersectrtfAjoo();
        DrawContext drawContext3 = Canvas.getDrawContext();
        long mo4320getSizeNHjbRc = drawContext3.mo4320getSizeNHjbRc();
        drawContext3.getCanvas().save();
        try {
            drawContext3.getTransform().mo4323clipRectN_I0leg(8.0f, 10.0f, m3671getWidthimpl, f7, m3832getIntersectrtfAjoo);
            int i5 = 0;
            while (true) {
                i2 = 4;
                f = 3.0f;
                if (i5 >= 4) {
                    break;
                }
                float f9 = f5;
                float f10 = f7;
                float f11 = f10 - ((i5 / 3.0f) * f9);
                try {
                    i4 = i5;
                    j11 = mo4320getSizeNHjbRc;
                    drawContext2 = drawContext3;
                } catch (Throwable th) {
                    th = th;
                    j11 = mo4320getSizeNHjbRc;
                    drawContext2 = drawContext3;
                }
                try {
                    DrawScope.m4385drawLineNGM6Ib0$default(Canvas, Color.m3842copywmQWz5c$default(colorScheme.getOnSurface(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), OffsetKt.Offset(f8, f11), OffsetKt.Offset(m3671getWidthimpl, f11), 1.0f, 0, null, 0.0f, null, 0, 496, null);
                    i5 = i4 + 1;
                    drawContext3 = drawContext2;
                    f7 = f10;
                    f5 = f9;
                    mo4320getSizeNHjbRc = j11;
                    f8 = 8.0f;
                } catch (Throwable th2) {
                    th = th2;
                    drawContext = drawContext2;
                    j10 = j11;
                    drawContext.getCanvas().restore();
                    drawContext.mo4321setSizeuvyYCjk(j10);
                    throw th;
                }
            }
            long j12 = mo4320getSizeNHjbRc;
            DrawContext drawContext4 = drawContext3;
            float f12 = f5;
            float f13 = f7;
            List list4 = list3;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
            int i6 = 0;
            for (Object obj : list4) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                int i8 = coerceAtLeast;
                float f14 = f6;
                float SleepCycleLineChart_rpjkMjA$lambda$24$lambda$18$lambda$17$lambda$16$xForMinute = SleepCycleLineChart_rpjkMjA$lambda$24$lambda$18$lambda$17$lambda$16$xForMinute(8.0f, i8, f14, i6);
                float f15 = f13;
                float f16 = f12;
                arrayList.add(Offset.m3591boximpl(OffsetKt.Offset(SleepCycleLineChart_rpjkMjA$lambda$24$lambda$18$lambda$17$lambda$16$xForMinute, SleepCycleLineChart_rpjkMjA$lambda$24$lambda$18$lambda$17$lambda$16$stageY(3.0f, f15, f16, (SleepStageLabel) obj))));
                f12 = f16;
                f13 = f15;
                coerceAtLeast = i8;
                f6 = f14;
                i6 = i7;
            }
            int i9 = coerceAtLeast;
            float f17 = f6;
            float f18 = f13;
            float f19 = f12;
            ArrayList arrayList2 = arrayList;
            int i10 = 1;
            int size = arrayList2.size() - 1;
            int i11 = 0;
            while (i11 < size) {
                SleepStageLabel sleepStageLabel = (SleepStageLabel) list3.get(i11);
                int i12 = WhenMappings.$EnumSwitchMapping$0[sleepStageLabel.ordinal()];
                if (i12 == i10) {
                    m3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(j2, 0.14f, 0.0f, 0.0f, 0.0f, 14, null);
                } else if (i12 == 2) {
                    m3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(j3, 0.16f, 0.0f, 0.0f, 0.0f, 14, null);
                } else if (i12 != 3) {
                    if (i12 != i2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    m3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(j4, 0.22f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    m3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(j5, 0.18f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                float SleepCycleLineChart_rpjkMjA$lambda$24$lambda$18$lambda$17$lambda$16$stageY = SleepCycleLineChart_rpjkMjA$lambda$24$lambda$18$lambda$17$lambda$16$stageY(f, f18, f19, sleepStageLabel);
                int i13 = i11 + 1;
                DrawScope.m4393drawRectnJ9OG0$default(Canvas, m3842copywmQWz5c$default, OffsetKt.Offset(Offset.m3602getXimpl(((Offset) arrayList2.get(i11)).getPackedValue()), SleepCycleLineChart_rpjkMjA$lambda$24$lambda$18$lambda$17$lambda$16$stageY), androidx.compose.ui.geometry.SizeKt.Size(Offset.m3602getXimpl(((Offset) arrayList2.get(i13)).getPackedValue()) - Offset.m3602getXimpl(((Offset) arrayList2.get(i11)).getPackedValue()), f18 - SleepCycleLineChart_rpjkMjA$lambda$24$lambda$18$lambda$17$lambda$16$stageY), 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
                f17 = f17;
                size = size;
                i11 = i13;
                i2 = i2;
                f19 = f19;
                f18 = f18;
                i9 = i9;
                f = 3.0f;
                i10 = 1;
                list3 = list;
            }
            float f20 = f19;
            float f21 = f18;
            int i14 = i9;
            float f22 = f17;
            Path Path = AndroidPath_androidKt.Path();
            appendStepHypnogram(Path, arrayList2);
            DrawScope.m4389drawPathLG529CI$default(Canvas, Path, Color.m3842copywmQWz5c$default(j6, z ? 0.88f : 1.0f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, new Stroke(z ? 2.5f : 2.75f, 0.0f, StrokeCap.INSTANCE.m4197getRoundKaPHkGw(), StrokeJoin.INSTANCE.m4208getRoundLxFBmk8(), z ? PathEffect.Companion.dashPathEffect$default(PathEffect.INSTANCE, new float[]{14.0f, 10.0f}, 0.0f, 2, null) : null, 2, null), null, 0, 52, null);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                SleepMinuteEvent sleepMinuteEvent = (SleepMinuteEvent) it.next();
                if (sleepMinuteEvent.getHasMarker()) {
                    int i15 = i - 1;
                    int coerceIn2 = RangesKt.coerceIn(sleepMinuteEvent.getMinuteIndex(), 0, i15);
                    if (i <= 1) {
                        coerceIn = 0;
                        i3 = i14;
                    } else {
                        float f23 = coerceIn2 / i15;
                        i3 = i14;
                        coerceIn = RangesKt.coerceIn((int) (f23 * (i3 - 1)), 0, CollectionsKt.getLastIndex(list));
                    }
                    float SleepCycleLineChart_rpjkMjA$lambda$24$lambda$18$lambda$17$lambda$16$xForMinute2 = SleepCycleLineChart_rpjkMjA$lambda$24$lambda$18$lambda$17$lambda$16$xForMinute(8.0f, i3, f22, coerceIn);
                    f2 = f22;
                    f3 = f20;
                    f4 = f21;
                    float coerceIn3 = RangesKt.coerceIn(SleepCycleLineChart_rpjkMjA$lambda$24$lambda$18$lambda$17$lambda$16$stageY(3.0f, f4, f3, (SleepStageLabel) list.get(coerceIn)) - 12.0f, 14.0f, f4 - 4.0f);
                    if (sleepMinuteEvent.getSnore()) {
                        m3878getTransparent0d7_KjU = j7;
                    } else if (sleepMinuteEvent.getTalk()) {
                        m3878getTransparent0d7_KjU = j8;
                    } else {
                        m3878getTransparent0d7_KjU = sleepMinuteEvent.getMovement() ? j9 : Color.INSTANCE.m3878getTransparent0d7_KjU();
                    }
                    if (!Color.m3844equalsimpl0(m3878getTransparent0d7_KjU, Color.INSTANCE.m3878getTransparent0d7_KjU())) {
                        long Offset = OffsetKt.Offset(SleepCycleLineChart_rpjkMjA$lambda$24$lambda$18$lambda$17$lambda$16$xForMinute2, coerceIn3);
                        DrawScope.m4380drawCircleVaOC9Bg$default(Canvas, colorScheme.getSurface(), 9.0f, Offset, 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
                        DrawScope.m4380drawCircleVaOC9Bg$default(Canvas, m3878getTransparent0d7_KjU, 7.0f, Offset, 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
                        DrawScope.m4380drawCircleVaOC9Bg$default(Canvas, Color.m3842copywmQWz5c$default(m3878getTransparent0d7_KjU, 0.35f, 0.0f, 0.0f, 0.0f, 14, null), 10.0f, Offset, 0.0f, new Stroke(2.0f, 0.0f, 0, 0, null, 30, null), null, 0, 104, null);
                    }
                } else {
                    f2 = f22;
                    f3 = f20;
                    f4 = f21;
                    i3 = i14;
                }
                i14 = i3;
                f22 = f2;
                f21 = f4;
                f20 = f3;
            }
            float f24 = f22;
            float f25 = f20;
            float f26 = f21;
            int i16 = i14;
            int size2 = list.size();
            int SleepCycleLineChart_rpjkMjA$lambda$8 = SleepCycleLineChart_rpjkMjA$lambda$8(mutableIntState);
            if (SleepCycleLineChart_rpjkMjA$lambda$8 >= 0 && SleepCycleLineChart_rpjkMjA$lambda$8 < size2) {
                float SleepCycleLineChart_rpjkMjA$lambda$24$lambda$18$lambda$17$lambda$16$xForMinute3 = SleepCycleLineChart_rpjkMjA$lambda$24$lambda$18$lambda$17$lambda$16$xForMinute(8.0f, i16, f24, SleepCycleLineChart_rpjkMjA$lambda$8(mutableIntState));
                DrawScope.m4385drawLineNGM6Ib0$default(Canvas, Color.m3842copywmQWz5c$default(colorScheme.getPrimary(), 0.75f, 0.0f, 0.0f, 0.0f, 14, null), OffsetKt.Offset(SleepCycleLineChart_rpjkMjA$lambda$24$lambda$18$lambda$17$lambda$16$xForMinute3, 10.0f), OffsetKt.Offset(SleepCycleLineChart_rpjkMjA$lambda$24$lambda$18$lambda$17$lambda$16$xForMinute3, f26), 2.0f, 0, null, 0.0f, null, 0, 496, null);
                float coerceIn4 = RangesKt.coerceIn(SleepCycleLineChart_rpjkMjA$lambda$24$lambda$18$lambda$17$lambda$16$stageY(3.0f, f26, f25, (SleepStageLabel) list.get(SleepCycleLineChart_rpjkMjA$lambda$8(mutableIntState))), 10.0f, f26);
                DrawScope.m4380drawCircleVaOC9Bg$default(Canvas, Color.m3842copywmQWz5c$default(colorScheme.getPrimary(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null), 7.5f, OffsetKt.Offset(SleepCycleLineChart_rpjkMjA$lambda$24$lambda$18$lambda$17$lambda$16$xForMinute3, coerceIn4), 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
                DrawScope.m4380drawCircleVaOC9Bg$default(Canvas, colorScheme.getSurface(), 3.5f, OffsetKt.Offset(SleepCycleLineChart_rpjkMjA$lambda$24$lambda$18$lambda$17$lambda$16$xForMinute3, coerceIn4), 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
            }
            drawContext4.getCanvas().restore();
            drawContext4.mo4321setSizeuvyYCjk(j12);
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            th = th3;
            j10 = mo4320getSizeNHjbRc;
            drawContext = drawContext3;
        }
    }

    private static final float SleepCycleLineChart_rpjkMjA$lambda$24$lambda$18$lambda$17$lambda$16$stageLevel(SleepStageLabel sleepStageLabel) {
        int i = WhenMappings.$EnumSwitchMapping$0[sleepStageLabel.ordinal()];
        if (i == 1) {
            return 0.0f;
        }
        if (i == 2) {
            return 1.0f;
        }
        if (i == 3) {
            return 2.0f;
        }
        if (i == 4) {
            return 3.0f;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final float SleepCycleLineChart_rpjkMjA$lambda$24$lambda$18$lambda$17$lambda$16$stageY(float f, float f2, float f3, SleepStageLabel sleepStageLabel) {
        return f2 - ((RangesKt.coerceIn(SleepCycleLineChart_rpjkMjA$lambda$24$lambda$18$lambda$17$lambda$16$stageLevel(sleepStageLabel), 0.0f, f) / f) * f3);
    }

    private static final float SleepCycleLineChart_rpjkMjA$lambda$24$lambda$18$lambda$17$lambda$16$xForMinute(float f, int i, float f2, int i2) {
        return f + ((i2 / RangesKt.coerceAtLeast(i - 1, 1)) * f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepCycleLineChart_rpjkMjA$lambda$24$lambda$20$lambda$19(int i, MutableIntState mutableIntState, float f) {
        mutableIntState.setIntValue(RangesKt.coerceIn((int) f, 0, i));
        return Unit.INSTANCE;
    }

    /* renamed from: EventLegend-RGew2ao, reason: not valid java name */
    private static final void m6920EventLegendRGew2ao(final long j, final long j2, final long j3, final boolean z, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1422799976);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(j2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(j3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1422799976, i2, -1, "com.example.rungps.sleep.EventLegend (SleepCycleLineChart.kt:431)");
            }
            ColorScheme colorScheme = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable);
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(12));
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
            m6921LegendDotIv8Zu3U(j, "Snore", startRestartGroup, (i2 & 14) | 48);
            m6921LegendDotIv8Zu3U(j2, "Talk", startRestartGroup, ((i2 >> 3) & 14) | 48);
            m6921LegendDotIv8Zu3U(j3, "Move", startRestartGroup, ((i2 >> 6) & 14) | 48);
            String str = z ? "· dashed = estimated stages" : "· line = stage";
            composer2 = startRestartGroup;
            TextKt.m2376Text4IGK_g(str, PaddingKt.m688paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6303constructorimpl(2), 0.0f, 0.0f, 13, null), colorScheme.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), composer2, 48, 0, 65528);
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
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.sleep.SleepCycleLineChartKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit EventLegend_RGew2ao$lambda$27;
                    EventLegend_RGew2ao$lambda$27 = SleepCycleLineChartKt.EventLegend_RGew2ao$lambda$27(j, j2, j3, z, i, (Composer) obj, ((Integer) obj2).intValue());
                    return EventLegend_RGew2ao$lambda$27;
                }
            });
        }
    }

    /* renamed from: LegendDot-Iv8Zu3U, reason: not valid java name */
    private static final void m6921LegendDotIv8Zu3U(final long j, final String str, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1281051602);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1281051602, i2, -1, "com.example.rungps.sleep.LegendDot (SleepCycleLineChart.kt:450)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(4));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m564spacedBy0680j_4, centerVertically, startRestartGroup, 54);
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
            BoxKt.Box(BackgroundKt.m238backgroundbw27NRU(SizeKt.m729size3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(8)), j, RoundedCornerShapeKt.getCircleShape()), startRestartGroup, 0);
            composer2 = startRestartGroup;
            TextKt.m2376Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), composer2, (i2 >> 3) & 14, 0, 65534);
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
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.sleep.SleepCycleLineChartKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit LegendDot_Iv8Zu3U$lambda$29;
                    LegendDot_Iv8Zu3U$lambda$29 = SleepCycleLineChartKt.LegendDot_Iv8Zu3U$lambda$29(j, str, i, (Composer) obj, ((Integer) obj2).intValue());
                    return LegendDot_Iv8Zu3U$lambda$29;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final List<SleepStageLabel> downsampleStagesPreserveTransitions(List<? extends SleepStageLabel> list, int i) {
        if (list.size() <= i) {
            return list;
        }
        LinkedHashSet linkedSetOf = SetsKt.linkedSetOf(0, Integer.valueOf(CollectionsKt.getLastIndex(list)));
        int size = list.size();
        for (int i2 = 1; i2 < size; i2++) {
            int i3 = i2 - 1;
            if (list.get(i2) != list.get(i3)) {
                linkedSetOf.add(Integer.valueOf(i2));
                linkedSetOf.add(Integer.valueOf(i3));
            }
        }
        List sorted = CollectionsKt.sorted(linkedSetOf);
        if (sorted.size() > i) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(0);
            linkedHashSet.add(Integer.valueOf(CollectionsKt.getLastIndex(list)));
            ArrayList arrayList = new ArrayList();
            for (Object obj : sorted) {
                int intValue = ((Number) obj).intValue();
                if (intValue != 0 && intValue != CollectionsKt.getLastIndex(list)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = arrayList;
            int coerceAtLeast = RangesKt.coerceAtLeast(i - 2, 0);
            if (coerceAtLeast > 0 && !arrayList2.isEmpty()) {
                float size2 = arrayList2.size() / coerceAtLeast;
                for (int i4 = 0; i4 < coerceAtLeast; i4++) {
                    linkedHashSet.add(arrayList2.get(RangesKt.coerceIn((int) (i4 * size2), 0, CollectionsKt.getLastIndex(arrayList2))));
                }
            }
            List sorted2 = CollectionsKt.sorted(linkedHashSet);
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(sorted2, 10));
            Iterator it = sorted2.iterator();
            while (it.hasNext()) {
                arrayList3.add((SleepStageLabel) list.get(((Number) it.next()).intValue()));
            }
            return arrayList3;
        }
        List list2 = sorted;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList4.add((SleepStageLabel) list.get(((Number) it2.next()).intValue()));
        }
        return arrayList4;
    }

    private static final int inferMinutesPerBucket(int i, int i2, int i3) {
        if (i <= 0 || i3 <= 0) {
            return 1;
        }
        int i4 = i2 + 8;
        int i5 = i * 6;
        if (i2 - 8 > i5 || i5 > i4) {
            return RangesKt.coerceIn((int) (i2 / i3), 1, 10);
        }
        return 6;
    }

    private static final void StageDurationSummary(final List<? extends SleepStageLabel> list, final int i, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-509223327);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-509223327, i3, -1, "com.example.rungps.sleep.StageDurationSummary (SleepCycleLineChart.kt:496)");
            }
            if (list.isEmpty()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.sleep.SleepCycleLineChartKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit StageDurationSummary$lambda$33;
                            StageDurationSummary$lambda$33 = SleepCycleLineChartKt.StageDurationSummary$lambda$33(list, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return StageDurationSummary$lambda$33;
                        }
                    });
                    return;
                }
                return;
            }
            ColorScheme colorScheme = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable);
            final List<? extends SleepStageLabel> list2 = list;
            Map eachCount = GroupingKt.eachCount(new Grouping<SleepStageLabel, SleepStageLabel>() { // from class: com.example.rungps.sleep.SleepCycleLineChartKt$StageDurationSummary$$inlined$groupingBy$1
                @Override // kotlin.collections.Grouping
                public Iterator<SleepStageLabel> sourceIterator() {
                    return list2.iterator();
                }

                @Override // kotlin.collections.Grouping
                public SleepStageLabel keyOf(SleepStageLabel element) {
                    return element;
                }
            });
            List createListBuilder = CollectionsKt.createListBuilder();
            Integer valueOf = Integer.valueOf(StageDurationSummary$minFor(eachCount, i, SleepStageLabel.DEEP));
            if (valueOf.intValue() <= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                createListBuilder.add("Deep " + formatStageMin(valueOf.intValue()));
            }
            Integer valueOf2 = Integer.valueOf(StageDurationSummary$minFor(eachCount, i, SleepStageLabel.REM));
            if (valueOf2.intValue() <= 0) {
                valueOf2 = null;
            }
            if (valueOf2 != null) {
                createListBuilder.add("REM " + formatStageMin(valueOf2.intValue()));
            }
            Integer valueOf3 = Integer.valueOf(StageDurationSummary$minFor(eachCount, i, SleepStageLabel.LIGHT));
            if (valueOf3.intValue() <= 0) {
                valueOf3 = null;
            }
            if (valueOf3 != null) {
                createListBuilder.add("Light " + formatStageMin(valueOf3.intValue()));
            }
            Integer valueOf4 = Integer.valueOf(StageDurationSummary$minFor(eachCount, i, SleepStageLabel.AWAKE));
            Integer num = valueOf4.intValue() > 0 ? valueOf4 : null;
            if (num != null) {
                createListBuilder.add("Awake " + formatStageMin(num.intValue()));
            }
            List build = CollectionsKt.build(createListBuilder);
            if (build.isEmpty()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
                if (endRestartGroup2 != null) {
                    endRestartGroup2.updateScope(new Function2() { // from class: com.example.rungps.sleep.SleepCycleLineChartKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit StageDurationSummary$lambda$44;
                            StageDurationSummary$lambda$44 = SleepCycleLineChartKt.StageDurationSummary$lambda$44(list, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return StageDurationSummary$lambda$44;
                        }
                    });
                    return;
                }
                return;
            }
            composer2 = startRestartGroup;
            TextKt.m2376Text4IGK_g(CollectionsKt.joinToString$default(build, " · ", null, null, 0, null, null, 62, null), (Modifier) null, colorScheme.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), composer2, 0, 0, 65530);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup3 = composer2.endRestartGroup();
        if (endRestartGroup3 != null) {
            endRestartGroup3.updateScope(new Function2() { // from class: com.example.rungps.sleep.SleepCycleLineChartKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit StageDurationSummary$lambda$45;
                    StageDurationSummary$lambda$45 = SleepCycleLineChartKt.StageDurationSummary$lambda$45(list, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return StageDurationSummary$lambda$45;
                }
            });
        }
    }

    private static final int StageDurationSummary$minFor(Map<SleepStageLabel, Integer> map, int i, SleepStageLabel sleepStageLabel) {
        Integer num = map.get(sleepStageLabel);
        return (num != null ? num.intValue() : 0) * i;
    }

    private static final String formatStageMin(int i) {
        StringBuilder sb;
        if (i >= 60) {
            int i2 = i / 60;
            i %= 60;
            sb = new StringBuilder().append(i2).append("h ");
        } else {
            sb = new StringBuilder();
        }
        return sb.append(i).append("m").toString();
    }

    private static final int chartIndexToNightMinute(int i, int i2, int i3) {
        if (i2 <= 1 || i3 <= 1) {
            return RangesKt.coerceIn(i, 0, RangesKt.coerceAtLeast(i3 - 1, 0));
        }
        int i4 = i3 - 1;
        return RangesKt.coerceIn((int) ((i / (i2 - 1)) * i4), 0, i4);
    }

    private static final void appendStepHypnogram(Path path, List<Offset> list) {
        if (list.isEmpty()) {
            return;
        }
        path.moveTo(Offset.m3602getXimpl(list.get(0).getPackedValue()), Offset.m3603getYimpl(list.get(0).getPackedValue()));
        if (list.size() == 1) {
            return;
        }
        int size = list.size();
        for (int i = 1; i < size; i++) {
            long packedValue = list.get(i - 1).getPackedValue();
            long packedValue2 = list.get(i).getPackedValue();
            path.lineTo(Offset.m3602getXimpl(packedValue2), Offset.m3603getYimpl(packedValue));
            path.lineTo(Offset.m3602getXimpl(packedValue2), Offset.m3603getYimpl(packedValue2));
        }
    }

    private static final String stageLabel(SleepStageLabel sleepStageLabel) {
        int i = WhenMappings.$EnumSwitchMapping$0[sleepStageLabel.ordinal()];
        if (i == 1) {
            return "Awake";
        }
        if (i == 2) {
            return "Light sleep";
        }
        if (i == 3) {
            return "REM";
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return "Deep sleep";
    }

    private static final List<SleepStageLabel> synthesizeStages(Integer num, Integer num2, Integer num3, Integer num4, long j, long j2) {
        int coerceAtLeast = RangesKt.coerceAtLeast(num != null ? num.intValue() : 0, 0);
        int coerceAtLeast2 = RangesKt.coerceAtLeast(num2 != null ? num2.intValue() : 0, 0);
        int coerceAtLeast3 = RangesKt.coerceAtLeast(num3 != null ? num3.intValue() : 0, 0);
        int coerceAtLeast4 = RangesKt.coerceAtLeast(num4 != null ? num4.intValue() : 0, 0);
        if (coerceAtLeast + coerceAtLeast2 + coerceAtLeast3 + coerceAtLeast4 <= 0) {
            return CollectionsKt.emptyList();
        }
        int coerceIn = RangesKt.coerceIn((int) ((j2 - j) / 60000), 60, 480);
        ArrayList arrayList = new ArrayList(coerceIn);
        for (int i = 0; i < coerceIn; i++) {
            arrayList.add(SleepStageLabel.LIGHT);
        }
        ArrayList arrayList2 = arrayList;
        synthesizeStages$scatter(coerceIn, arrayList2, RangesKt.coerceAtMost(coerceAtLeast4, 8), SleepStageLabel.AWAKE, 0.0f, 0.06f);
        synthesizeStages$scatter(coerceIn, arrayList2, RangesKt.coerceAtLeast(coerceAtLeast4 - RangesKt.coerceAtMost(coerceAtLeast4, 8), 0), SleepStageLabel.AWAKE, 0.9f, 1.0f);
        synthesizeStages$scatter(coerceIn, arrayList2, RangesKt.coerceAtLeast(coerceAtLeast2 / 4, 5), SleepStageLabel.LIGHT, 0.02f, 0.12f);
        int i2 = coerceAtLeast;
        for (int i3 = (int) (coerceIn * 0.1f); i3 < coerceIn * 0.88d && (i2 > 0 || coerceAtLeast3 > 0); i3 += 90) {
            int i4 = coerceIn - 1;
            IntRange intRange = new IntRange(i3 + 12, RangesKt.coerceAtMost(i3 + 35, i4));
            int first = intRange.getFirst();
            int last = intRange.getLast();
            if (first <= last) {
                while (i2 > 0) {
                    arrayList2.set(first, SleepStageLabel.DEEP);
                    i2--;
                    if (first == last) {
                        break;
                    }
                    first++;
                }
            }
            IntRange intRange2 = new IntRange(i3 + 62, RangesKt.coerceAtMost(i3 + 82, i4));
            int first2 = intRange2.getFirst();
            int last2 = intRange2.getLast();
            if (first2 <= last2) {
                while (coerceAtLeast3 > 0) {
                    arrayList2.set(first2, SleepStageLabel.REM);
                    coerceAtLeast3--;
                    if (first2 != last2) {
                        first2++;
                    }
                }
            }
        }
        synthesizeStages$scatter(coerceIn, arrayList2, i2, SleepStageLabel.DEEP, 0.12f, 0.85f);
        synthesizeStages$scatter(coerceIn, arrayList2, coerceAtLeast3, SleepStageLabel.REM, 0.15f, 0.92f);
        synthesizeStages$scatter(coerceIn, arrayList2, coerceAtLeast2, SleepStageLabel.LIGHT, 0.05f, 0.95f);
        return arrayList2;
    }

    private static final void synthesizeStages$scatter(int i, List<SleepStageLabel> list, int i2, SleepStageLabel sleepStageLabel, float f, float f2) {
        if (i2 <= 0) {
            return;
        }
        float f3 = i;
        int coerceIn = RangesKt.coerceIn((int) (f * f3), 0, i - 1);
        int coerceAtLeast = RangesKt.coerceAtLeast(RangesKt.coerceIn((int) (f3 * f2), coerceIn + 1, i) - coerceIn, 1);
        for (int i3 = 0; i3 < i2; i3++) {
            list.set(RangesKt.coerceIn((int) (((i3 + 0.5f) / i2) * coerceAtLeast), 0, coerceAtLeast - 1) + coerceIn, sleepStageLabel);
        }
    }
}
