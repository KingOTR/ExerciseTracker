package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.health.platform.client.SdkConfig;
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import org.maplibre.android.style.layers.Property;

/* compiled from: Slider.kt */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JB\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ3\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\u0010!J\u0096\u0001\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u0017\u001a\u00020\r2!\b\u0002\u0010\"\u001a\u001b\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0012\u0018\u00010#¢\u0006\u0002\b&2%\b\u0002\u0010'\u001a\u001f\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00120(¢\u0006\u0002\b&2\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010-J3\u0010\u001e\u001a\u00020\u00122\u0006\u0010.\u001a\u00020/2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\u00100J3\u0010\u001e\u001a\u00020\u00122\u0006\u00101\u001a\u0002022\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0002\u00103J\u0096\u0001\u0010\u001e\u001a\u00020\u00122\u0006\u00101\u001a\u0002022\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u0017\u001a\u00020\r2!\b\u0002\u0010\"\u001a\u001b\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0012\u0018\u00010#¢\u0006\u0002\b&2%\b\u0002\u0010'\u001a\u001f\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00120(¢\u0006\u0002\b&2\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u00104J\r\u0010\u0017\u001a\u00020\rH\u0007¢\u0006\u0002\u00105Jv\u0010\u0017\u001a\u00020\r2\b\b\u0002\u00106\u001a\u00020)2\b\b\u0002\u00107\u001a\u00020)2\b\b\u0002\u00108\u001a\u00020)2\b\b\u0002\u00109\u001a\u00020)2\b\b\u0002\u0010:\u001a\u00020)2\b\b\u0002\u0010;\u001a\u00020)2\b\b\u0002\u0010<\u001a\u00020)2\b\b\u0002\u0010=\u001a\u00020)2\b\b\u0002\u0010>\u001a\u00020)2\b\b\u0002\u0010?\u001a\u00020)H\u0007ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ2\u0010\"\u001a\u00020\u00122\u0006\u0010B\u001a\u00020$2\u0006\u0010C\u001a\u00020%2\u0006\u0010D\u001a\u00020\u00042\u0006\u0010E\u001a\u00020)H\u0002ø\u0001\u0000¢\u0006\u0004\bF\u0010GJÄ\u0001\u0010H\u001a\u00020\u0012*\u00020$2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020L2\u0006\u00109\u001a\u00020)2\u0006\u00107\u001a\u00020)2\u0006\u0010:\u001a\u00020)2\u0006\u00108\u001a\u00020)2\u0006\u0010N\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u00042\u0006\u0010P\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042\u001f\u0010\"\u001a\u001b\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0012\u0018\u00010#¢\u0006\u0002\b&2#\u0010'\u001a\u001f\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00120(¢\u0006\u0002\b&2\u0006\u0010Q\u001a\u00020\u0019H\u0002ø\u0001\u0000¢\u0006\u0004\bR\u0010SJ>\u0010T\u001a\u00020\u0012*\u00020$2\u0006\u0010C\u001a\u00020%2\u0006\u0010D\u001a\u00020U2\u0006\u0010E\u001a\u00020)2\u0006\u0010V\u001a\u00020L2\u0006\u0010W\u001a\u00020LH\u0002ø\u0001\u0000¢\u0006\u0004\bX\u0010YR\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\u00020\r*\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Z"}, d2 = {"Landroidx/compose/material3/SliderDefaults;", "", "()V", "TickSize", "Landroidx/compose/ui/unit/Dp;", "getTickSize-D9Ej5fM", "()F", "F", "TrackStopIndicatorSize", "getTrackStopIndicatorSize-D9Ej5fM", "trackPath", "Landroidx/compose/ui/graphics/Path;", "defaultSliderColors", "Landroidx/compose/material3/SliderColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultSliderColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/SliderColors;", "Thumb", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "modifier", "Landroidx/compose/ui/Modifier;", "colors", "enabled", "", "thumbSize", "Landroidx/compose/ui/unit/DpSize;", "Thumb-9LiSoMs", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZJLandroidx/compose/runtime/Composer;II)V", "Track", "rangeSliderState", "Landroidx/compose/material3/RangeSliderState;", "(Landroidx/compose/material3/RangeSliderState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V", "drawStopIndicator", "Lkotlin/Function2;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ExtensionFunctionType;", "drawTick", "Lkotlin/Function3;", "Landroidx/compose/ui/graphics/Color;", "thumbTrackGapSize", "trackInsideCornerSize", "Track-4EFweAY", "(Landroidx/compose/material3/RangeSliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFLandroidx/compose/runtime/Composer;II)V", "sliderPositions", "Landroidx/compose/material3/SliderPositions;", "(Landroidx/compose/material3/SliderPositions;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V", "sliderState", "Landroidx/compose/material3/SliderState;", "(Landroidx/compose/material3/SliderState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/material3/SliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;FFLandroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SliderColors;", "thumbColor", "activeTrackColor", "activeTickColor", "inactiveTrackColor", "inactiveTickColor", "disabledThumbColor", "disabledActiveTrackColor", "disabledActiveTickColor", "disabledInactiveTrackColor", "disabledInactiveTickColor", "colors-q0g_0yA", "(JJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SliderColors;", "drawScope", "offset", "size", "color", "drawStopIndicator-x3O1jOs", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFJ)V", "drawTrack", "tickFractions", "", "activeRangeStart", "", "activeRangeEnd", Property.ICON_TEXT_FIT_HEIGHT, "startThumbWidth", "endThumbWidth", "isRangeSlider", "drawTrack-ngJ0SCU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;[FFFJJJJFFFFFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Z)V", "drawTrackPath", "Landroidx/compose/ui/geometry/Size;", "startCornerRadius", "endCornerRadius", "drawTrackPath-Cx2C_VA", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFF)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SliderDefaults {
    public static final int $stable = 0;
    public static final SliderDefaults INSTANCE = new SliderDefaults();
    private static final float TrackStopIndicatorSize = SliderTokens.INSTANCE.m3182getStopIndicatorSizeD9Ej5fM();
    private static final float TickSize = SliderTokens.INSTANCE.m3182getStopIndicatorSizeD9Ej5fM();
    private static final Path trackPath = AndroidPath_androidKt.Path();

    private SliderDefaults() {
    }

    public final SliderColors colors(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, 1376295968, "C(colors)845@36907L11:Slider.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1376295968, i, -1, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:845)");
        }
        SliderColors defaultSliderColors$material3_release = getDefaultSliderColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return defaultSliderColors$material3_release;
    }

    /* renamed from: colors-q0g_0yA, reason: not valid java name */
    public final SliderColors m2178colorsq0g_0yA(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, Composer composer, int i, int i2, int i3) {
        long j11;
        ComposerKt.sourceInformationMarkerStart(composer, 885588574, "C(colors)P(9:c#ui.graphics.Color,1:c#ui.graphics.Color,0:c#ui.graphics.Color,8:c#ui.graphics.Color,7:c#ui.graphics.Color,6:c#ui.graphics.Color,3:c#ui.graphics.Color,2:c#ui.graphics.Color,5:c#ui.graphics.Color,4:c#ui.graphics.Color)887@39230L11:Slider.kt#uh7d8r");
        long m3879getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j;
        long m3879getUnspecified0d7_KjU2 = (i3 & 2) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j2;
        long m3879getUnspecified0d7_KjU3 = (i3 & 4) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j3;
        long m3879getUnspecified0d7_KjU4 = (i3 & 8) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j4;
        long m3879getUnspecified0d7_KjU5 = (i3 & 16) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j5;
        long m3879getUnspecified0d7_KjU6 = (i3 & 32) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j6;
        long m3879getUnspecified0d7_KjU7 = (i3 & 64) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j7;
        long m3879getUnspecified0d7_KjU8 = (i3 & 128) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j8;
        long m3879getUnspecified0d7_KjU9 = (i3 & 256) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j9;
        long m3879getUnspecified0d7_KjU10 = (i3 & 512) != 0 ? Color.INSTANCE.m3879getUnspecified0d7_KjU() : j10;
        if (ComposerKt.isTraceInProgress()) {
            j11 = m3879getUnspecified0d7_KjU6;
            ComposerKt.traceEventStart(885588574, i, i2, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:887)");
        } else {
            j11 = m3879getUnspecified0d7_KjU6;
        }
        SliderColors m2156copyK518z4 = getDefaultSliderColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m2156copyK518z4(m3879getUnspecified0d7_KjU, m3879getUnspecified0d7_KjU2, m3879getUnspecified0d7_KjU3, m3879getUnspecified0d7_KjU4, m3879getUnspecified0d7_KjU5, j11, m3879getUnspecified0d7_KjU7, m3879getUnspecified0d7_KjU8, m3879getUnspecified0d7_KjU9, m3879getUnspecified0d7_KjU10);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return m2156copyK518z4;
    }

    public final SliderColors getDefaultSliderColors$material3_release(ColorScheme colorScheme) {
        SliderColors defaultSliderColorsCached = colorScheme.getDefaultSliderColorsCached();
        if (defaultSliderColorsCached != null) {
            return defaultSliderColorsCached;
        }
        SliderColors sliderColors = new SliderColors(ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getHandleColor()), ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getActiveTrackColor()), ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getInactiveTrackColor()), ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getInactiveTrackColor()), ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getActiveTrackColor()), ColorKt.m3888compositeOverOWjLjI(Color.m3842copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getDisabledHandleColor()), SliderTokens.INSTANCE.getDisabledHandleOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), Color.m3842copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getDisabledActiveTrackColor()), SliderTokens.INSTANCE.getDisabledActiveTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m3842copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getDisabledInactiveTrackColor()), SliderTokens.INSTANCE.getDisabledInactiveTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m3842copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getDisabledInactiveTrackColor()), SliderTokens.INSTANCE.getDisabledInactiveTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m3842copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SliderTokens.INSTANCE.getDisabledActiveTrackColor()), SliderTokens.INSTANCE.getDisabledActiveTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultSliderColorsCached$material3_release(sliderColors);
        return sliderColors;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0060  */
    /* renamed from: Thumb-9LiSoMs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2175Thumb9LiSoMs(final MutableInteractionSource mutableInteractionSource, Modifier modifier, SliderColors sliderColors, boolean z, long j, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        SliderColors sliderColors2;
        int i4;
        boolean z2;
        int i5;
        long j2;
        long j3;
        Object rememberedValue;
        boolean z3;
        SliderDefaults$Thumb$1$1 rememberedValue2;
        ScopeUpdateScope endRestartGroup;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-290277409);
        ComposerKt.sourceInformation(startRestartGroup, "C(Thumb)P(2,3!,4:c#ui.unit.DpSize)947@42562L8,951@42678L46,952@42767L658,952@42733L692,975@43824L5,971@43620L220:Slider.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(mutableInteractionSource) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    sliderColors2 = sliderColors;
                    if (startRestartGroup.changed(sliderColors2)) {
                        i6 = 256;
                        i3 |= i6;
                    }
                } else {
                    sliderColors2 = sliderColors;
                }
                i6 = 128;
                i3 |= i6;
            } else {
                sliderColors2 = sliderColors;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    j2 = j;
                    i3 |= startRestartGroup.changed(j2) ? 16384 : 8192;
                    if ((i2 & 32) == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i3 |= startRestartGroup.changed(this) ? 131072 : 65536;
                    }
                    if ((i3 & 74899) == 74898 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i7 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i2 & 4) != 0) {
                                SliderColors colors = colors(startRestartGroup, (i3 >> 15) & 14);
                                i3 &= -897;
                                sliderColors2 = colors;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if (i5 != 0) {
                                j3 = SliderKt.ThumbSize;
                                j2 = j3;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-290277409, i3, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:950)");
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1068636116, "CC(remember):Slider.kt#9igjgp");
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = SnapshotStateKt.mutableStateListOf();
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1068632656, "CC(remember):Slider.kt#9igjgp");
                        int i8 = i3 & 14;
                        z3 = i8 == 4;
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!z3 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList, null);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        EffectsKt.LaunchedEffect(mutableInteractionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, i8);
                        SpacerKt.Spacer(BackgroundKt.m238backgroundbw27NRU(HoverableKt.hoverable$default(SizeKt.m730size6HolHcs(modifier2, snapshotStateList.isEmpty() ? DpSize.m6394copyDwJknco$default(j2, Dp.m6303constructorimpl(DpSize.m6401getWidthD9Ej5fM(j2) / 2), 0.0f, 2, null) : j2), mutableInteractionSource, false, 2, null), sliderColors2.m2167thumbColorvNxB06k$material3_release(z2), ShapesKt.getValue(SliderTokens.INSTANCE.getHandleShape(), startRestartGroup, 6)), startRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                    }
                    final SliderColors sliderColors3 = sliderColors2;
                    final boolean z4 = z2;
                    final long j4 = j2;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final Modifier modifier3 = modifier2;
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Thumb$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i9) {
                                SliderDefaults.this.m2175Thumb9LiSoMs(mutableInteractionSource, modifier3, sliderColors3, z4, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                j2 = j;
                if ((i2 & 32) == 0) {
                }
                if ((i3 & 74899) == 74898) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i7 != 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1068636116, "CC(remember):Slider.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                SnapshotStateList snapshotStateList2 = (SnapshotStateList) rememberedValue;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1068632656, "CC(remember):Slider.kt#9igjgp");
                int i82 = i3 & 14;
                if (i82 == 4) {
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!z3) {
                }
                rememberedValue2 = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                EffectsKt.LaunchedEffect(mutableInteractionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, i82);
                SpacerKt.Spacer(BackgroundKt.m238backgroundbw27NRU(HoverableKt.hoverable$default(SizeKt.m730size6HolHcs(modifier2, snapshotStateList2.isEmpty() ? DpSize.m6394copyDwJknco$default(j2, Dp.m6303constructorimpl(DpSize.m6401getWidthD9Ej5fM(j2) / 2), 0.0f, 2, null) : j2), mutableInteractionSource, false, 2, null), sliderColors2.m2167thumbColorvNxB06k$material3_release(z2), ShapesKt.getValue(SliderTokens.INSTANCE.getHandleShape(), startRestartGroup, 6)), startRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                final SliderColors sliderColors32 = sliderColors2;
                final boolean z42 = z2;
                final long j42 = j2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            j2 = j;
            if ((i2 & 32) == 0) {
            }
            if ((i3 & 74899) == 74898) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i7 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1068636116, "CC(remember):Slider.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            SnapshotStateList snapshotStateList22 = (SnapshotStateList) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1068632656, "CC(remember):Slider.kt#9igjgp");
            int i822 = i3 & 14;
            if (i822 == 4) {
            }
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!z3) {
            }
            rememberedValue2 = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList22, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.LaunchedEffect(mutableInteractionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, i822);
            SpacerKt.Spacer(BackgroundKt.m238backgroundbw27NRU(HoverableKt.hoverable$default(SizeKt.m730size6HolHcs(modifier2, snapshotStateList22.isEmpty() ? DpSize.m6394copyDwJknco$default(j2, Dp.m6303constructorimpl(DpSize.m6401getWidthD9Ej5fM(j2) / 2), 0.0f, 2, null) : j2), mutableInteractionSource, false, 2, null), sliderColors2.m2167thumbColorvNxB06k$material3_release(z2), ShapesKt.getValue(SliderTokens.INSTANCE.getHandleShape(), startRestartGroup, 6)), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            final SliderColors sliderColors322 = sliderColors2;
            final boolean z422 = z2;
            final long j422 = j2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        j2 = j;
        if ((i2 & 32) == 0) {
        }
        if ((i3 & 74899) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i7 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1068636116, "CC(remember):Slider.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        SnapshotStateList snapshotStateList222 = (SnapshotStateList) rememberedValue;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1068632656, "CC(remember):Slider.kt#9igjgp");
        int i8222 = i3 & 14;
        if (i8222 == 4) {
        }
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!z3) {
        }
        rememberedValue2 = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList222, null);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        EffectsKt.LaunchedEffect(mutableInteractionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, i8222);
        SpacerKt.Spacer(BackgroundKt.m238backgroundbw27NRU(HoverableKt.hoverable$default(SizeKt.m730size6HolHcs(modifier2, snapshotStateList222.isEmpty() ? DpSize.m6394copyDwJknco$default(j2, Dp.m6303constructorimpl(DpSize.m6401getWidthD9Ej5fM(j2) / 2), 0.0f, 2, null) : j2), mutableInteractionSource, false, 2, null), sliderColors2.m2167thumbColorvNxB06k$material3_release(z2), ShapesKt.getValue(SliderTokens.INSTANCE.getHandleShape(), startRestartGroup, 6)), startRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        final SliderColors sliderColors3222 = sliderColors2;
        final boolean z4222 = z2;
        final long j4222 = j2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0065  */
    @Deprecated(message = "Use version that supports slider state")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Track(final SliderPositions sliderPositions, Modifier modifier, SliderColors sliderColors, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        SliderColors sliderColors2;
        int i4;
        boolean z2;
        int i5;
        Modifier modifier3;
        SliderColors sliderColors3;
        boolean z3;
        boolean changed;
        Object rememberedValue;
        boolean z4;
        final SliderColors sliderColors4;
        final Modifier modifier4;
        final boolean z5;
        ScopeUpdateScope endRestartGroup;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-1546713545);
        ComposerKt.sourceInformation(startRestartGroup, "C(Track)P(3,2)997@44755L8,1004@45160L1834,1004@45108L1886:Slider.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(sliderPositions) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    sliderColors2 = sliderColors;
                    if (startRestartGroup.changed(sliderColors2)) {
                        i6 = 256;
                        i3 |= i6;
                    }
                } else {
                    sliderColors2 = sliderColors;
                }
                i6 = 128;
                i3 |= i6;
            } else {
                sliderColors2 = sliderColors;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changed(this) ? 16384 : 8192;
                }
                if ((i3 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        if (i7 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            SliderColors colors = colors(startRestartGroup, (i3 >> 12) & 14);
                            i3 &= -897;
                            sliderColors2 = colors;
                        }
                        if (i4 != 0) {
                            i5 = i3;
                            modifier3 = modifier2;
                            sliderColors3 = sliderColors2;
                            z3 = true;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1546713545, i5, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:999)");
                            }
                            final long m2169trackColorWaAFU9c$material3_release = sliderColors3.m2169trackColorWaAFU9c$material3_release(z3, false);
                            final long m2169trackColorWaAFU9c$material3_release2 = sliderColors3.m2169trackColorWaAFU9c$material3_release(z3, true);
                            Modifier modifier5 = modifier3;
                            final long m2168tickColorWaAFU9c$material3_release = sliderColors3.m2168tickColorWaAFU9c$material3_release(z3, false);
                            final long m2168tickColorWaAFU9c$material3_release2 = sliderColors3.m2168tickColorWaAFU9c$material3_release(z3, true);
                            Modifier m715height3ABfNKs = SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null), SliderKt.getTrackHeight());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -801023075, "CC(remember):Slider.kt#9igjgp");
                            changed = startRestartGroup.changed(m2169trackColorWaAFU9c$material3_release) | ((i5 & 14) != 4) | startRestartGroup.changed(m2169trackColorWaAFU9c$material3_release2) | startRestartGroup.changed(m2168tickColorWaAFU9c$material3_release) | startRestartGroup.changed(m2168tickColorWaAFU9c$material3_release2);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                z4 = z3;
                                sliderColors4 = sliderColors3;
                                rememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                        invoke2(drawScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(DrawScope drawScope) {
                                        boolean z6 = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
                                        long Offset = OffsetKt.Offset(0.0f, Offset.m3603getYimpl(drawScope.mo4398getCenterF1C5BW0()));
                                        long Offset2 = OffsetKt.Offset(Size.m3671getWidthimpl(drawScope.mo4399getSizeNHjbRc()), Offset.m3603getYimpl(drawScope.mo4398getCenterF1C5BW0()));
                                        long j = z6 ? Offset2 : Offset;
                                        long j2 = z6 ? Offset : Offset2;
                                        float f = drawScope.mo376toPx0680j_4(SliderDefaults.INSTANCE.m2179getTickSizeD9Ej5fM());
                                        float f2 = drawScope.mo376toPx0680j_4(SliderKt.getTrackHeight());
                                        long j3 = j2;
                                        long j4 = j;
                                        DrawScope.m4385drawLineNGM6Ib0$default(drawScope, m2169trackColorWaAFU9c$material3_release, j, j2, f2, StrokeCap.INSTANCE.m4197getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                        DrawScope.m4385drawLineNGM6Ib0$default(drawScope, m2169trackColorWaAFU9c$material3_release2, OffsetKt.Offset(Offset.m3602getXimpl(j4) + ((Offset.m3602getXimpl(j3) - Offset.m3602getXimpl(j4)) * sliderPositions.getActiveRange().getStart().floatValue()), Offset.m3603getYimpl(drawScope.mo4398getCenterF1C5BW0())), OffsetKt.Offset(Offset.m3602getXimpl(j4) + ((Offset.m3602getXimpl(j3) - Offset.m3602getXimpl(j4)) * sliderPositions.getActiveRange().getEndInclusive().floatValue()), Offset.m3603getYimpl(drawScope.mo4398getCenterF1C5BW0())), f2, StrokeCap.INSTANCE.m4197getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                        float[] tickFractions = sliderPositions.getTickFractions();
                                        SliderPositions sliderPositions2 = sliderPositions;
                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        int length = tickFractions.length;
                                        for (int i8 = 0; i8 < length; i8++) {
                                            float f3 = tickFractions[i8];
                                            Boolean valueOf = Boolean.valueOf(f3 > sliderPositions2.getActiveRange().getEndInclusive().floatValue() || f3 < sliderPositions2.getActiveRange().getStart().floatValue());
                                            Object obj = linkedHashMap.get(valueOf);
                                            if (obj == null) {
                                                obj = (List) new ArrayList();
                                                linkedHashMap.put(valueOf, obj);
                                            }
                                            ((List) obj).add(Float.valueOf(f3));
                                        }
                                        long j5 = m2168tickColorWaAFU9c$material3_release;
                                        long j6 = m2168tickColorWaAFU9c$material3_release2;
                                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                                            boolean booleanValue = ((Boolean) entry.getKey()).booleanValue();
                                            List list = (List) entry.getValue();
                                            ArrayList arrayList = new ArrayList(list.size());
                                            int size = list.size();
                                            int i9 = 0;
                                            while (i9 < size) {
                                                arrayList.add(Offset.m3591boximpl(OffsetKt.Offset(Offset.m3602getXimpl(OffsetKt.m3625lerpWko1d7g(j4, j3, ((Number) list.get(i9)).floatValue())), Offset.m3603getYimpl(drawScope.mo4398getCenterF1C5BW0()))));
                                                i9++;
                                                list = list;
                                            }
                                            long j7 = j4;
                                            long j8 = j3;
                                            DrawScope.m4390drawPointsF8ZwMP8$default(drawScope, arrayList, PointMode.INSTANCE.m4149getPointsr_lszbg(), booleanValue ? j5 : j6, f, StrokeCap.INSTANCE.m4197getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                            j6 = j6;
                                            j3 = j8;
                                            j4 = j7;
                                        }
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            } else {
                                z4 = z3;
                                sliderColors4 = sliderColors3;
                            }
                            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                            CanvasKt.Canvas(m715height3ABfNKs, (Function1) rememberedValue, startRestartGroup, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier5;
                            z5 = z4;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                    }
                    i5 = i3;
                    modifier3 = modifier2;
                    sliderColors3 = sliderColors2;
                    z3 = z2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final long m2169trackColorWaAFU9c$material3_release3 = sliderColors3.m2169trackColorWaAFU9c$material3_release(z3, false);
                    final long m2169trackColorWaAFU9c$material3_release22 = sliderColors3.m2169trackColorWaAFU9c$material3_release(z3, true);
                    Modifier modifier52 = modifier3;
                    final long m2168tickColorWaAFU9c$material3_release3 = sliderColors3.m2168tickColorWaAFU9c$material3_release(z3, false);
                    final long m2168tickColorWaAFU9c$material3_release22 = sliderColors3.m2168tickColorWaAFU9c$material3_release(z3, true);
                    Modifier m715height3ABfNKs2 = SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(modifier52, 0.0f, 1, null), SliderKt.getTrackHeight());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -801023075, "CC(remember):Slider.kt#9igjgp");
                    changed = startRestartGroup.changed(m2169trackColorWaAFU9c$material3_release3) | ((i5 & 14) != 4) | startRestartGroup.changed(m2169trackColorWaAFU9c$material3_release22) | startRestartGroup.changed(m2168tickColorWaAFU9c$material3_release3) | startRestartGroup.changed(m2168tickColorWaAFU9c$material3_release22);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (changed) {
                    }
                    z4 = z3;
                    sliderColors4 = sliderColors3;
                    rememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            boolean z6 = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
                            long Offset = OffsetKt.Offset(0.0f, Offset.m3603getYimpl(drawScope.mo4398getCenterF1C5BW0()));
                            long Offset2 = OffsetKt.Offset(Size.m3671getWidthimpl(drawScope.mo4399getSizeNHjbRc()), Offset.m3603getYimpl(drawScope.mo4398getCenterF1C5BW0()));
                            long j = z6 ? Offset2 : Offset;
                            long j2 = z6 ? Offset : Offset2;
                            float f = drawScope.mo376toPx0680j_4(SliderDefaults.INSTANCE.m2179getTickSizeD9Ej5fM());
                            float f2 = drawScope.mo376toPx0680j_4(SliderKt.getTrackHeight());
                            long j3 = j2;
                            long j4 = j;
                            DrawScope.m4385drawLineNGM6Ib0$default(drawScope, m2169trackColorWaAFU9c$material3_release3, j, j2, f2, StrokeCap.INSTANCE.m4197getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                            DrawScope.m4385drawLineNGM6Ib0$default(drawScope, m2169trackColorWaAFU9c$material3_release22, OffsetKt.Offset(Offset.m3602getXimpl(j4) + ((Offset.m3602getXimpl(j3) - Offset.m3602getXimpl(j4)) * sliderPositions.getActiveRange().getStart().floatValue()), Offset.m3603getYimpl(drawScope.mo4398getCenterF1C5BW0())), OffsetKt.Offset(Offset.m3602getXimpl(j4) + ((Offset.m3602getXimpl(j3) - Offset.m3602getXimpl(j4)) * sliderPositions.getActiveRange().getEndInclusive().floatValue()), Offset.m3603getYimpl(drawScope.mo4398getCenterF1C5BW0())), f2, StrokeCap.INSTANCE.m4197getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                            float[] tickFractions = sliderPositions.getTickFractions();
                            SliderPositions sliderPositions2 = sliderPositions;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            int length = tickFractions.length;
                            for (int i8 = 0; i8 < length; i8++) {
                                float f3 = tickFractions[i8];
                                Boolean valueOf = Boolean.valueOf(f3 > sliderPositions2.getActiveRange().getEndInclusive().floatValue() || f3 < sliderPositions2.getActiveRange().getStart().floatValue());
                                Object obj = linkedHashMap.get(valueOf);
                                if (obj == null) {
                                    obj = (List) new ArrayList();
                                    linkedHashMap.put(valueOf, obj);
                                }
                                ((List) obj).add(Float.valueOf(f3));
                            }
                            long j5 = m2168tickColorWaAFU9c$material3_release3;
                            long j6 = m2168tickColorWaAFU9c$material3_release22;
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                boolean booleanValue = ((Boolean) entry.getKey()).booleanValue();
                                List list = (List) entry.getValue();
                                ArrayList arrayList = new ArrayList(list.size());
                                int size = list.size();
                                int i9 = 0;
                                while (i9 < size) {
                                    arrayList.add(Offset.m3591boximpl(OffsetKt.Offset(Offset.m3602getXimpl(OffsetKt.m3625lerpWko1d7g(j4, j3, ((Number) list.get(i9)).floatValue())), Offset.m3603getYimpl(drawScope.mo4398getCenterF1C5BW0()))));
                                    i9++;
                                    list = list;
                                }
                                long j7 = j4;
                                long j8 = j3;
                                DrawScope.m4390drawPointsF8ZwMP8$default(drawScope, arrayList, PointMode.INSTANCE.m4149getPointsr_lszbg(), booleanValue ? j5 : j6, f, StrokeCap.INSTANCE.m4197getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                j6 = j6;
                                j3 = j8;
                                j4 = j7;
                            }
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    CanvasKt.Canvas(m715height3ABfNKs2, (Function1) rememberedValue, startRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier52;
                    z5 = z4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    sliderColors4 = sliderColors2;
                    z5 = z2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i8) {
                            SliderDefaults.this.Track(sliderPositions, modifier4, sliderColors4, z5, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            z2 = z;
            if ((i2 & 16) != 0) {
            }
            if ((i3 & 9363) == 9362) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i7 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i4 != 0) {
            }
            i5 = i3;
            modifier3 = modifier2;
            sliderColors3 = sliderColors2;
            z3 = z2;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            final long m2169trackColorWaAFU9c$material3_release32 = sliderColors3.m2169trackColorWaAFU9c$material3_release(z3, false);
            final long m2169trackColorWaAFU9c$material3_release222 = sliderColors3.m2169trackColorWaAFU9c$material3_release(z3, true);
            Modifier modifier522 = modifier3;
            final long m2168tickColorWaAFU9c$material3_release32 = sliderColors3.m2168tickColorWaAFU9c$material3_release(z3, false);
            final long m2168tickColorWaAFU9c$material3_release222 = sliderColors3.m2168tickColorWaAFU9c$material3_release(z3, true);
            Modifier m715height3ABfNKs22 = SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(modifier522, 0.0f, 1, null), SliderKt.getTrackHeight());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -801023075, "CC(remember):Slider.kt#9igjgp");
            changed = startRestartGroup.changed(m2169trackColorWaAFU9c$material3_release32) | ((i5 & 14) != 4) | startRestartGroup.changed(m2169trackColorWaAFU9c$material3_release222) | startRestartGroup.changed(m2168tickColorWaAFU9c$material3_release32) | startRestartGroup.changed(m2168tickColorWaAFU9c$material3_release222);
            rememberedValue = startRestartGroup.rememberedValue();
            if (changed) {
            }
            z4 = z3;
            sliderColors4 = sliderColors3;
            rememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                    invoke2(drawScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(DrawScope drawScope) {
                    boolean z6 = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
                    long Offset = OffsetKt.Offset(0.0f, Offset.m3603getYimpl(drawScope.mo4398getCenterF1C5BW0()));
                    long Offset2 = OffsetKt.Offset(Size.m3671getWidthimpl(drawScope.mo4399getSizeNHjbRc()), Offset.m3603getYimpl(drawScope.mo4398getCenterF1C5BW0()));
                    long j = z6 ? Offset2 : Offset;
                    long j2 = z6 ? Offset : Offset2;
                    float f = drawScope.mo376toPx0680j_4(SliderDefaults.INSTANCE.m2179getTickSizeD9Ej5fM());
                    float f2 = drawScope.mo376toPx0680j_4(SliderKt.getTrackHeight());
                    long j3 = j2;
                    long j4 = j;
                    DrawScope.m4385drawLineNGM6Ib0$default(drawScope, m2169trackColorWaAFU9c$material3_release32, j, j2, f2, StrokeCap.INSTANCE.m4197getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                    DrawScope.m4385drawLineNGM6Ib0$default(drawScope, m2169trackColorWaAFU9c$material3_release222, OffsetKt.Offset(Offset.m3602getXimpl(j4) + ((Offset.m3602getXimpl(j3) - Offset.m3602getXimpl(j4)) * sliderPositions.getActiveRange().getStart().floatValue()), Offset.m3603getYimpl(drawScope.mo4398getCenterF1C5BW0())), OffsetKt.Offset(Offset.m3602getXimpl(j4) + ((Offset.m3602getXimpl(j3) - Offset.m3602getXimpl(j4)) * sliderPositions.getActiveRange().getEndInclusive().floatValue()), Offset.m3603getYimpl(drawScope.mo4398getCenterF1C5BW0())), f2, StrokeCap.INSTANCE.m4197getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                    float[] tickFractions = sliderPositions.getTickFractions();
                    SliderPositions sliderPositions2 = sliderPositions;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int length = tickFractions.length;
                    for (int i8 = 0; i8 < length; i8++) {
                        float f3 = tickFractions[i8];
                        Boolean valueOf = Boolean.valueOf(f3 > sliderPositions2.getActiveRange().getEndInclusive().floatValue() || f3 < sliderPositions2.getActiveRange().getStart().floatValue());
                        Object obj = linkedHashMap.get(valueOf);
                        if (obj == null) {
                            obj = (List) new ArrayList();
                            linkedHashMap.put(valueOf, obj);
                        }
                        ((List) obj).add(Float.valueOf(f3));
                    }
                    long j5 = m2168tickColorWaAFU9c$material3_release32;
                    long j6 = m2168tickColorWaAFU9c$material3_release222;
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        boolean booleanValue = ((Boolean) entry.getKey()).booleanValue();
                        List list = (List) entry.getValue();
                        ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        int i9 = 0;
                        while (i9 < size) {
                            arrayList.add(Offset.m3591boximpl(OffsetKt.Offset(Offset.m3602getXimpl(OffsetKt.m3625lerpWko1d7g(j4, j3, ((Number) list.get(i9)).floatValue())), Offset.m3603getYimpl(drawScope.mo4398getCenterF1C5BW0()))));
                            i9++;
                            list = list;
                        }
                        long j7 = j4;
                        long j8 = j3;
                        DrawScope.m4390drawPointsF8ZwMP8$default(drawScope, arrayList, PointMode.INSTANCE.m4149getPointsr_lszbg(), booleanValue ? j5 : j6, f, StrokeCap.INSTANCE.m4197getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                        j6 = j6;
                        j3 = j8;
                        j4 = j7;
                    }
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            CanvasKt.Canvas(m715height3ABfNKs22, (Function1) rememberedValue, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier522;
            z5 = z4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i2 & 16) != 0) {
        }
        if ((i3 & 9363) == 9362) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i7 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i4 != 0) {
        }
        i5 = i3;
        modifier3 = modifier2;
        sliderColors3 = sliderColors2;
        z3 = z2;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        final long m2169trackColorWaAFU9c$material3_release322 = sliderColors3.m2169trackColorWaAFU9c$material3_release(z3, false);
        final long m2169trackColorWaAFU9c$material3_release2222 = sliderColors3.m2169trackColorWaAFU9c$material3_release(z3, true);
        Modifier modifier5222 = modifier3;
        final long m2168tickColorWaAFU9c$material3_release322 = sliderColors3.m2168tickColorWaAFU9c$material3_release(z3, false);
        final long m2168tickColorWaAFU9c$material3_release2222 = sliderColors3.m2168tickColorWaAFU9c$material3_release(z3, true);
        Modifier m715height3ABfNKs222 = SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(modifier5222, 0.0f, 1, null), SliderKt.getTrackHeight());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -801023075, "CC(remember):Slider.kt#9igjgp");
        changed = startRestartGroup.changed(m2169trackColorWaAFU9c$material3_release322) | ((i5 & 14) != 4) | startRestartGroup.changed(m2169trackColorWaAFU9c$material3_release2222) | startRestartGroup.changed(m2168tickColorWaAFU9c$material3_release322) | startRestartGroup.changed(m2168tickColorWaAFU9c$material3_release2222);
        rememberedValue = startRestartGroup.rememberedValue();
        if (changed) {
        }
        z4 = z3;
        sliderColors4 = sliderColors3;
        rememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DrawScope drawScope) {
                boolean z6 = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
                long Offset = OffsetKt.Offset(0.0f, Offset.m3603getYimpl(drawScope.mo4398getCenterF1C5BW0()));
                long Offset2 = OffsetKt.Offset(Size.m3671getWidthimpl(drawScope.mo4399getSizeNHjbRc()), Offset.m3603getYimpl(drawScope.mo4398getCenterF1C5BW0()));
                long j = z6 ? Offset2 : Offset;
                long j2 = z6 ? Offset : Offset2;
                float f = drawScope.mo376toPx0680j_4(SliderDefaults.INSTANCE.m2179getTickSizeD9Ej5fM());
                float f2 = drawScope.mo376toPx0680j_4(SliderKt.getTrackHeight());
                long j3 = j2;
                long j4 = j;
                DrawScope.m4385drawLineNGM6Ib0$default(drawScope, m2169trackColorWaAFU9c$material3_release322, j, j2, f2, StrokeCap.INSTANCE.m4197getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                DrawScope.m4385drawLineNGM6Ib0$default(drawScope, m2169trackColorWaAFU9c$material3_release2222, OffsetKt.Offset(Offset.m3602getXimpl(j4) + ((Offset.m3602getXimpl(j3) - Offset.m3602getXimpl(j4)) * sliderPositions.getActiveRange().getStart().floatValue()), Offset.m3603getYimpl(drawScope.mo4398getCenterF1C5BW0())), OffsetKt.Offset(Offset.m3602getXimpl(j4) + ((Offset.m3602getXimpl(j3) - Offset.m3602getXimpl(j4)) * sliderPositions.getActiveRange().getEndInclusive().floatValue()), Offset.m3603getYimpl(drawScope.mo4398getCenterF1C5BW0())), f2, StrokeCap.INSTANCE.m4197getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                float[] tickFractions = sliderPositions.getTickFractions();
                SliderPositions sliderPositions2 = sliderPositions;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int length = tickFractions.length;
                for (int i8 = 0; i8 < length; i8++) {
                    float f3 = tickFractions[i8];
                    Boolean valueOf = Boolean.valueOf(f3 > sliderPositions2.getActiveRange().getEndInclusive().floatValue() || f3 < sliderPositions2.getActiveRange().getStart().floatValue());
                    Object obj = linkedHashMap.get(valueOf);
                    if (obj == null) {
                        obj = (List) new ArrayList();
                        linkedHashMap.put(valueOf, obj);
                    }
                    ((List) obj).add(Float.valueOf(f3));
                }
                long j5 = m2168tickColorWaAFU9c$material3_release322;
                long j6 = m2168tickColorWaAFU9c$material3_release2222;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    boolean booleanValue = ((Boolean) entry.getKey()).booleanValue();
                    List list = (List) entry.getValue();
                    ArrayList arrayList = new ArrayList(list.size());
                    int size = list.size();
                    int i9 = 0;
                    while (i9 < size) {
                        arrayList.add(Offset.m3591boximpl(OffsetKt.Offset(Offset.m3602getXimpl(OffsetKt.m3625lerpWko1d7g(j4, j3, ((Number) list.get(i9)).floatValue())), Offset.m3603getYimpl(drawScope.mo4398getCenterF1C5BW0()))));
                        i9++;
                        list = list;
                    }
                    long j7 = j4;
                    long j8 = j3;
                    DrawScope.m4390drawPointsF8ZwMP8$default(drawScope, arrayList, PointMode.INSTANCE.m4149getPointsr_lszbg(), booleanValue ? j5 : j6, f, StrokeCap.INSTANCE.m4197getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                    j6 = j6;
                    j3 = j8;
                    j4 = j7;
                }
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        CanvasKt.Canvas(m715height3ABfNKs222, (Function1) rememberedValue, startRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier4 = modifier5222;
        z5 = z4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0062  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the overload that takes `drawStopIndicator`, `drawTick`, `thumbTrackGapSize` and `trackInsideCornerSize`, see `LegacySliderSample` on how to restore the previous behavior", replaceWith = @ReplaceWith(expression = "Track(sliderState, modifier, enabled, colors, drawStopIndicator, drawTick, thumbTrackGapSize, trackInsideCornerSize)", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void Track(final SliderState sliderState, Modifier modifier, SliderColors sliderColors, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        final SliderColors sliderColors2;
        int i4;
        boolean z2;
        SliderColors sliderColors3;
        Modifier modifier3;
        SliderColors sliderColors4;
        boolean z3;
        float f;
        float f2;
        final boolean z4;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(593554206);
        ComposerKt.sourceInformation(startRestartGroup, "C(Track)P(3,2)1079@48295L8,1082@48353L213:Slider.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(sliderState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    sliderColors2 = sliderColors;
                    if (startRestartGroup.changed(sliderColors2)) {
                        i5 = 256;
                        i3 |= i5;
                    }
                } else {
                    sliderColors2 = sliderColors;
                }
                i5 = 128;
                i3 |= i5;
            } else {
                sliderColors2 = sliderColors;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changed(this) ? 16384 : 8192;
                }
                if ((i3 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier.Companion companion = i6 != 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 4) != 0) {
                            sliderColors3 = colors(startRestartGroup, (i3 >> 12) & 14);
                            i3 &= -897;
                        } else {
                            sliderColors3 = sliderColors2;
                        }
                        if (i4 != 0) {
                            modifier3 = companion;
                            sliderColors4 = sliderColors3;
                            z3 = true;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(593554206, i3, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1081)");
                            }
                            f = SliderKt.ThumbTrackGapSize;
                            f2 = SliderKt.TrackInsideCornerSize;
                            m2177Track4EFweAY(sliderState, modifier3, z3, sliderColors4, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, f, f2, startRestartGroup, (i3 & 14) | 14155776 | (i3 & SdkConfig.SDK_VERSION) | ((i3 >> 3) & 896) | ((i3 << 3) & 7168) | ((i3 << 12) & 234881024), 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier3;
                            sliderColors2 = sliderColors4;
                            z4 = z3;
                        } else {
                            modifier3 = companion;
                            sliderColors4 = sliderColors3;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        modifier3 = modifier2;
                        sliderColors4 = sliderColors2;
                    }
                    z3 = z2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    f = SliderKt.ThumbTrackGapSize;
                    f2 = SliderKt.TrackInsideCornerSize;
                    m2177Track4EFweAY(sliderState, modifier3, z3, sliderColors4, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, f, f2, startRestartGroup, (i3 & 14) | 14155776 | (i3 & SdkConfig.SDK_VERSION) | ((i3 >> 3) & 896) | ((i3 << 3) & 7168) | ((i3 << 12) & 234881024), 48);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier3;
                    sliderColors2 = sliderColors4;
                    z4 = z3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    z4 = z2;
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i7) {
                            SliderDefaults.this.Track(sliderState, modifier2, sliderColors2, z4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            z2 = z;
            if ((i2 & 16) != 0) {
            }
            if ((i3 & 9363) == 9362) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i4 != 0) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i2 & 16) != 0) {
        }
        if ((i3 & 9363) == 9362) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i4 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0290, code lost:
    
        if (r13.changed(r5) == false) goto L176;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0273  */
    /* renamed from: Track-4EFweAY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2177Track4EFweAY(final SliderState sliderState, Modifier modifier, boolean z, SliderColors sliderColors, Function2<? super DrawScope, ? super Offset, Unit> function2, Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function3, float f, float f2, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        final boolean z2;
        SliderColors sliderColors2;
        Function2<? super DrawScope, ? super Offset, Unit> function22;
        int i5;
        Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function32;
        int i6;
        int i7;
        float f3;
        final SliderColors sliderColors3;
        Function2<? super DrawScope, ? super Offset, Unit> function23;
        Modifier modifier2;
        Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function33;
        float f4;
        float f5;
        SliderColors sliderColors4;
        boolean z3;
        Function2<? super DrawScope, ? super Offset, Unit> function24;
        float f6;
        Function2<? super DrawScope, ? super Offset, Unit> function25;
        boolean z4;
        boolean z5;
        Object rememberedValue;
        final Function2<? super DrawScope, ? super Offset, Unit> function26;
        SliderColors sliderColors5;
        Modifier modifier3;
        boolean z6;
        Modifier modifier4;
        Composer composer2;
        final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function34;
        final Function2<? super DrawScope, ? super Offset, Unit> function27;
        final float f7;
        final boolean z7;
        final SliderColors sliderColors6;
        final float f8;
        final Modifier modifier5;
        ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(49984771);
        ComposerKt.sourceInformation(startRestartGroup, "C(Track)P(5,4,3!3,6:c#ui.unit.Dp,7:c#ui.unit.Dp)1114@49756L8,1115@49825L232,1137@50806L7,1138@50862L595,1133@50659L798:Slider.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(sliderState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        sliderColors2 = sliderColors;
                        if (startRestartGroup.changed(sliderColors2)) {
                            i10 = 2048;
                            i3 |= i10;
                        }
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    i10 = 1024;
                    i3 |= i10;
                } else {
                    sliderColors2 = sliderColors;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        function22 = function2;
                        if (startRestartGroup.changedInstance(function22)) {
                            i9 = 16384;
                            i3 |= i9;
                        }
                    } else {
                        function22 = function2;
                    }
                    i9 = 8192;
                    i3 |= i9;
                } else {
                    function22 = function2;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    function32 = function3;
                } else {
                    function32 = function3;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i3 |= startRestartGroup.changedInstance(function32) ? 131072 : 65536;
                    }
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= startRestartGroup.changed(f) ? 1048576 : 524288;
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                    i3 |= 12582912;
                    f3 = f2;
                } else {
                    f3 = f2;
                    if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changed(f3) ? 8388608 : 4194304;
                    }
                }
                if ((i2 & 256) == 0) {
                    i8 = (100663296 & i) == 0 ? startRestartGroup.changed(this) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432 : 100663296;
                    if ((38347923 & i3) == 38347922 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i11 == 0 ? Modifier.INSTANCE : modifier;
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) == 0) {
                                sliderColors3 = colors(startRestartGroup, (i3 >> 24) & 14);
                                i3 &= -7169;
                            } else {
                                sliderColors3 = sliderColors2;
                            }
                            if ((i2 & 16) == 0) {
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -800875397, "CC(remember):Slider.kt#9igjgp");
                                boolean z8 = ((((i3 & 7168) ^ 3072) > 2048 && startRestartGroup.changed(sliderColors3)) || (i3 & 3072) == 2048) | ((i3 & 896) == 256);
                                Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (z8 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = (Function2) new Function2<DrawScope, Offset, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$4$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope, Offset offset) {
                                            m2182invokeUv8p0NA(drawScope, offset.getPackedValue());
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                                        public final void m2182invokeUv8p0NA(DrawScope drawScope, long j) {
                                            SliderDefaults.INSTANCE.m2172drawStopIndicatorx3O1jOs(drawScope, j, SliderDefaults.INSTANCE.m2180getTrackStopIndicatorSizeD9Ej5fM(), SliderColors.this.m2169trackColorWaAFU9c$material3_release(z2, true));
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                function23 = (Function2) rememberedValue2;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                i3 &= -57345;
                            } else {
                                function23 = function22;
                            }
                            SliderDefaults$Track$5 sliderDefaults$Track$5 = i5 == 0 ? new Function3<DrawScope, Offset, Color, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$5
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope, Offset offset, Color color) {
                                    m2183invokewPWG1Vc(drawScope, offset.getPackedValue(), color.m3853unboximpl());
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke-wPWG1Vc, reason: not valid java name */
                                public final void m2183invokewPWG1Vc(DrawScope drawScope, long j, long j2) {
                                    SliderDefaults.INSTANCE.m2172drawStopIndicatorx3O1jOs(drawScope, j, SliderDefaults.INSTANCE.m2179getTickSizeD9Ej5fM(), j2);
                                }
                            } : function32;
                            float f9 = i6 == 0 ? SliderKt.ThumbTrackGapSize : f;
                            if (i7 == 0) {
                                f6 = SliderKt.TrackInsideCornerSize;
                                modifier2 = companion;
                                f4 = f6;
                                z3 = z2;
                                function33 = sliderDefaults$Track$5;
                                f5 = f9;
                                sliderColors4 = sliderColors3;
                            } else {
                                modifier2 = companion;
                                function33 = sliderDefaults$Track$5;
                                f4 = f3;
                                f5 = f9;
                                sliderColors4 = sliderColors3;
                                z3 = z2;
                            }
                            function24 = function23;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            f5 = f;
                            f4 = f3;
                            function33 = function32;
                            modifier2 = modifier;
                            z3 = z2;
                            function24 = function22;
                            sliderColors4 = sliderColors2;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(49984771, i3, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1128)");
                        }
                        final long m2169trackColorWaAFU9c$material3_release = sliderColors4.m2169trackColorWaAFU9c$material3_release(z3, false);
                        final long m2169trackColorWaAFU9c$material3_release2 = sliderColors4.m2169trackColorWaAFU9c$material3_release(z3, true);
                        final long m2168tickColorWaAFU9c$material3_release = sliderColors4.m2168tickColorWaAFU9c$material3_release(z3, false);
                        Function2<? super DrawScope, ? super Offset, Unit> function28 = function24;
                        final long m2168tickColorWaAFU9c$material3_release2 = sliderColors4.m2168tickColorWaAFU9c$material3_release(z3, true);
                        boolean z9 = z3;
                        Modifier m715height3ABfNKs = SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), SliderKt.getTrackHeight());
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                        SliderColors sliderColors7 = sliderColors4;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(localLayoutDirection);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Modifier rotate = RotateKt.rotate(m715height3ABfNKs, consume != LayoutDirection.Rtl ? 180.0f : 0.0f);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -800841850, "CC(remember):Slider.kt#9igjgp");
                        boolean changedInstance = startRestartGroup.changedInstance(sliderState) | startRestartGroup.changed(m2169trackColorWaAFU9c$material3_release) | startRestartGroup.changed(m2169trackColorWaAFU9c$material3_release2) | startRestartGroup.changed(m2168tickColorWaAFU9c$material3_release) | startRestartGroup.changed(m2168tickColorWaAFU9c$material3_release2) | ((3670016 & i3) != 1048576) | ((29360128 & i3) != 8388608);
                        if (((57344 & i3) ^ 24576) <= 16384) {
                            function25 = function28;
                        } else {
                            function25 = function28;
                        }
                        if ((i3 & 24576) != 16384) {
                            z4 = false;
                            z5 = z4 | changedInstance | ((i3 & 458752) == 131072);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z5 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                function26 = function25;
                                sliderColors5 = sliderColors7;
                                modifier3 = rotate;
                                z6 = z9;
                                modifier4 = modifier2;
                                final float f10 = f5;
                                final float f11 = f4;
                                composer2 = startRestartGroup;
                                final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function35 = function33;
                                rememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$6$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                        invoke2(drawScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(DrawScope drawScope) {
                                        SliderDefaults.INSTANCE.m2173drawTrackngJ0SCU(drawScope, SliderState.this.getTickFractions(), 0.0f, SliderState.this.getCoercedValueAsFraction$material3_release(), m2169trackColorWaAFU9c$material3_release, m2169trackColorWaAFU9c$material3_release2, m2168tickColorWaAFU9c$material3_release, m2168tickColorWaAFU9c$material3_release2, drawScope.mo372toDpu2uoSUM(SliderState.this.getTrackHeight$material3_release()), drawScope.mo373toDpu2uoSUM(0), drawScope.mo372toDpu2uoSUM(SliderState.this.getThumbWidth$material3_release()), f10, f11, function26, function35, false);
                                    }
                                };
                                composer2.updateRememberedValue(rememberedValue);
                            } else {
                                sliderColors5 = sliderColors7;
                                function26 = function25;
                                modifier3 = rotate;
                                composer2 = startRestartGroup;
                                z6 = z9;
                                modifier4 = modifier2;
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            CanvasKt.Canvas(modifier3, (Function1) rememberedValue, composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function34 = function33;
                            function27 = function26;
                            f7 = f5;
                            z7 = z6;
                            sliderColors6 = sliderColors5;
                            f8 = f4;
                            modifier5 = modifier4;
                        }
                        z4 = true;
                        z5 = z4 | changedInstance | ((i3 & 458752) == 131072);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (z5) {
                        }
                        function26 = function25;
                        sliderColors5 = sliderColors7;
                        modifier3 = rotate;
                        z6 = z9;
                        modifier4 = modifier2;
                        final float f102 = f5;
                        final float f112 = f4;
                        composer2 = startRestartGroup;
                        final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function352 = function33;
                        rememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$6$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DrawScope drawScope) {
                                SliderDefaults.INSTANCE.m2173drawTrackngJ0SCU(drawScope, SliderState.this.getTickFractions(), 0.0f, SliderState.this.getCoercedValueAsFraction$material3_release(), m2169trackColorWaAFU9c$material3_release, m2169trackColorWaAFU9c$material3_release2, m2168tickColorWaAFU9c$material3_release, m2168tickColorWaAFU9c$material3_release2, drawScope.mo372toDpu2uoSUM(SliderState.this.getTrackHeight$material3_release()), drawScope.mo373toDpu2uoSUM(0), drawScope.mo372toDpu2uoSUM(SliderState.this.getThumbWidth$material3_release()), f102, f112, function26, function352, false);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        CanvasKt.Canvas(modifier3, (Function1) rememberedValue, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function34 = function33;
                        function27 = function26;
                        f7 = f5;
                        z7 = z6;
                        sliderColors6 = sliderColors5;
                        f8 = f4;
                        modifier5 = modifier4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier5 = modifier;
                        z7 = z2;
                        sliderColors6 = sliderColors2;
                        f8 = f3;
                        function27 = function22;
                        function34 = function32;
                        composer2 = startRestartGroup;
                        f7 = f;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$7
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i12) {
                                SliderDefaults.this.m2177Track4EFweAY(sliderState, modifier5, z7, sliderColors6, function27, function34, f7, f8, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= i8;
                if ((38347923 & i3) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i11 == 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 8) == 0) {
                }
                if ((i2 & 16) == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                function24 = function23;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final long m2169trackColorWaAFU9c$material3_release3 = sliderColors4.m2169trackColorWaAFU9c$material3_release(z3, false);
                final long m2169trackColorWaAFU9c$material3_release22 = sliderColors4.m2169trackColorWaAFU9c$material3_release(z3, true);
                final long m2168tickColorWaAFU9c$material3_release3 = sliderColors4.m2168tickColorWaAFU9c$material3_release(z3, false);
                Function2<? super DrawScope, ? super Offset, Unit> function282 = function24;
                final long m2168tickColorWaAFU9c$material3_release22 = sliderColors4.m2168tickColorWaAFU9c$material3_release(z3, true);
                boolean z92 = z3;
                Modifier m715height3ABfNKs2 = SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), SliderKt.getTrackHeight());
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                SliderColors sliderColors72 = sliderColors4;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(localLayoutDirection2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier rotate2 = RotateKt.rotate(m715height3ABfNKs2, consume2 != LayoutDirection.Rtl ? 180.0f : 0.0f);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -800841850, "CC(remember):Slider.kt#9igjgp");
                boolean changedInstance2 = startRestartGroup.changedInstance(sliderState) | startRestartGroup.changed(m2169trackColorWaAFU9c$material3_release3) | startRestartGroup.changed(m2169trackColorWaAFU9c$material3_release22) | startRestartGroup.changed(m2168tickColorWaAFU9c$material3_release3) | startRestartGroup.changed(m2168tickColorWaAFU9c$material3_release22) | ((3670016 & i3) != 1048576) | ((29360128 & i3) != 8388608);
                if (((57344 & i3) ^ 24576) <= 16384) {
                }
                if ((i3 & 24576) != 16384) {
                }
                z4 = true;
                z5 = z4 | changedInstance2 | ((i3 & 458752) == 131072);
                rememberedValue = startRestartGroup.rememberedValue();
                if (z5) {
                }
                function26 = function25;
                sliderColors5 = sliderColors72;
                modifier3 = rotate2;
                z6 = z92;
                modifier4 = modifier2;
                final float f1022 = f5;
                final float f1122 = f4;
                composer2 = startRestartGroup;
                final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function3522 = function33;
                rememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$6$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        SliderDefaults.INSTANCE.m2173drawTrackngJ0SCU(drawScope, SliderState.this.getTickFractions(), 0.0f, SliderState.this.getCoercedValueAsFraction$material3_release(), m2169trackColorWaAFU9c$material3_release3, m2169trackColorWaAFU9c$material3_release22, m2168tickColorWaAFU9c$material3_release3, m2168tickColorWaAFU9c$material3_release22, drawScope.mo372toDpu2uoSUM(SliderState.this.getTrackHeight$material3_release()), drawScope.mo373toDpu2uoSUM(0), drawScope.mo372toDpu2uoSUM(SliderState.this.getThumbWidth$material3_release()), f1022, f1122, function26, function3522, false);
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                CanvasKt.Canvas(modifier3, (Function1) rememberedValue, composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                function34 = function33;
                function27 = function26;
                f7 = f5;
                z7 = z6;
                sliderColors6 = sliderColors5;
                f8 = f4;
                modifier5 = modifier4;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            if ((i2 & 256) == 0) {
            }
            i3 |= i8;
            if ((38347923 & i3) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i11 == 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 8) == 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            function24 = function23;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            final long m2169trackColorWaAFU9c$material3_release32 = sliderColors4.m2169trackColorWaAFU9c$material3_release(z3, false);
            final long m2169trackColorWaAFU9c$material3_release222 = sliderColors4.m2169trackColorWaAFU9c$material3_release(z3, true);
            final long m2168tickColorWaAFU9c$material3_release32 = sliderColors4.m2168tickColorWaAFU9c$material3_release(z3, false);
            Function2<? super DrawScope, ? super Offset, Unit> function2822 = function24;
            final long m2168tickColorWaAFU9c$material3_release222 = sliderColors4.m2168tickColorWaAFU9c$material3_release(z3, true);
            boolean z922 = z3;
            Modifier m715height3ABfNKs22 = SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), SliderKt.getTrackHeight());
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22 = CompositionLocalsKt.getLocalLayoutDirection();
            SliderColors sliderColors722 = sliderColors4;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume22 = startRestartGroup.consume(localLayoutDirection22);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier rotate22 = RotateKt.rotate(m715height3ABfNKs22, consume22 != LayoutDirection.Rtl ? 180.0f : 0.0f);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -800841850, "CC(remember):Slider.kt#9igjgp");
            boolean changedInstance22 = startRestartGroup.changedInstance(sliderState) | startRestartGroup.changed(m2169trackColorWaAFU9c$material3_release32) | startRestartGroup.changed(m2169trackColorWaAFU9c$material3_release222) | startRestartGroup.changed(m2168tickColorWaAFU9c$material3_release32) | startRestartGroup.changed(m2168tickColorWaAFU9c$material3_release222) | ((3670016 & i3) != 1048576) | ((29360128 & i3) != 8388608);
            if (((57344 & i3) ^ 24576) <= 16384) {
            }
            if ((i3 & 24576) != 16384) {
            }
            z4 = true;
            z5 = z4 | changedInstance22 | ((i3 & 458752) == 131072);
            rememberedValue = startRestartGroup.rememberedValue();
            if (z5) {
            }
            function26 = function25;
            sliderColors5 = sliderColors722;
            modifier3 = rotate22;
            z6 = z922;
            modifier4 = modifier2;
            final float f10222 = f5;
            final float f11222 = f4;
            composer2 = startRestartGroup;
            final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function35222 = function33;
            rememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$6$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                    invoke2(drawScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(DrawScope drawScope) {
                    SliderDefaults.INSTANCE.m2173drawTrackngJ0SCU(drawScope, SliderState.this.getTickFractions(), 0.0f, SliderState.this.getCoercedValueAsFraction$material3_release(), m2169trackColorWaAFU9c$material3_release32, m2169trackColorWaAFU9c$material3_release222, m2168tickColorWaAFU9c$material3_release32, m2168tickColorWaAFU9c$material3_release222, drawScope.mo372toDpu2uoSUM(SliderState.this.getTrackHeight$material3_release()), drawScope.mo373toDpu2uoSUM(0), drawScope.mo372toDpu2uoSUM(SliderState.this.getThumbWidth$material3_release()), f10222, f11222, function26, function35222, false);
                }
            };
            composer2.updateRememberedValue(rememberedValue);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            CanvasKt.Canvas(modifier3, (Function1) rememberedValue, composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            function34 = function33;
            function27 = function26;
            f7 = f5;
            z7 = z6;
            sliderColors6 = sliderColors5;
            f8 = f4;
            modifier5 = modifier4;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        if ((i2 & 256) == 0) {
        }
        i3 |= i8;
        if ((38347923 & i3) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i11 == 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        function24 = function23;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        final long m2169trackColorWaAFU9c$material3_release322 = sliderColors4.m2169trackColorWaAFU9c$material3_release(z3, false);
        final long m2169trackColorWaAFU9c$material3_release2222 = sliderColors4.m2169trackColorWaAFU9c$material3_release(z3, true);
        final long m2168tickColorWaAFU9c$material3_release322 = sliderColors4.m2168tickColorWaAFU9c$material3_release(z3, false);
        Function2<? super DrawScope, ? super Offset, Unit> function28222 = function24;
        final long m2168tickColorWaAFU9c$material3_release2222 = sliderColors4.m2168tickColorWaAFU9c$material3_release(z3, true);
        boolean z9222 = z3;
        Modifier m715height3ABfNKs222 = SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), SliderKt.getTrackHeight());
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection222 = CompositionLocalsKt.getLocalLayoutDirection();
        SliderColors sliderColors7222 = sliderColors4;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume222 = startRestartGroup.consume(localLayoutDirection222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Modifier rotate222 = RotateKt.rotate(m715height3ABfNKs222, consume222 != LayoutDirection.Rtl ? 180.0f : 0.0f);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -800841850, "CC(remember):Slider.kt#9igjgp");
        boolean changedInstance222 = startRestartGroup.changedInstance(sliderState) | startRestartGroup.changed(m2169trackColorWaAFU9c$material3_release322) | startRestartGroup.changed(m2169trackColorWaAFU9c$material3_release2222) | startRestartGroup.changed(m2168tickColorWaAFU9c$material3_release322) | startRestartGroup.changed(m2168tickColorWaAFU9c$material3_release2222) | ((3670016 & i3) != 1048576) | ((29360128 & i3) != 8388608);
        if (((57344 & i3) ^ 24576) <= 16384) {
        }
        if ((i3 & 24576) != 16384) {
        }
        z4 = true;
        z5 = z4 | changedInstance222 | ((i3 & 458752) == 131072);
        rememberedValue = startRestartGroup.rememberedValue();
        if (z5) {
        }
        function26 = function25;
        sliderColors5 = sliderColors7222;
        modifier3 = rotate222;
        z6 = z9222;
        modifier4 = modifier2;
        final float f102222 = f5;
        final float f112222 = f4;
        composer2 = startRestartGroup;
        final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function352222 = function33;
        rememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$6$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DrawScope drawScope) {
                SliderDefaults.INSTANCE.m2173drawTrackngJ0SCU(drawScope, SliderState.this.getTickFractions(), 0.0f, SliderState.this.getCoercedValueAsFraction$material3_release(), m2169trackColorWaAFU9c$material3_release322, m2169trackColorWaAFU9c$material3_release2222, m2168tickColorWaAFU9c$material3_release322, m2168tickColorWaAFU9c$material3_release2222, drawScope.mo372toDpu2uoSUM(SliderState.this.getTrackHeight$material3_release()), drawScope.mo373toDpu2uoSUM(0), drawScope.mo372toDpu2uoSUM(SliderState.this.getThumbWidth$material3_release()), f102222, f112222, function26, function352222, false);
            }
        };
        composer2.updateRememberedValue(rememberedValue);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        CanvasKt.Canvas(modifier3, (Function1) rememberedValue, composer2, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        function34 = function33;
        function27 = function26;
        f7 = f5;
        z7 = z6;
        sliderColors6 = sliderColors5;
        f8 = f4;
        modifier5 = modifier4;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0062  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the overload that takes `drawStopIndicator`, `drawTick`, `thumbTrackGapSize` and `trackInsideCornerSize`, see `LegacyRangeSliderSample` on how to restore the previous behavior", replaceWith = @ReplaceWith(expression = "Track(rangeSliderState, modifier, colors, enabled, drawStopIndicator, drawTick, thumbTrackGapSize, trackInsideCornerSize)", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void Track(final RangeSliderState rangeSliderState, Modifier modifier, SliderColors sliderColors, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        final SliderColors sliderColors2;
        int i4;
        boolean z2;
        SliderColors sliderColors3;
        Modifier modifier3;
        SliderColors sliderColors4;
        boolean z3;
        float f;
        float f2;
        final boolean z4;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(-1617869097);
        ComposerKt.sourceInformation(startRestartGroup, "C(Track)P(3,2)1187@52807L8,1190@52865L218:Slider.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(rangeSliderState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    sliderColors2 = sliderColors;
                    if (startRestartGroup.changed(sliderColors2)) {
                        i5 = 256;
                        i3 |= i5;
                    }
                } else {
                    sliderColors2 = sliderColors;
                }
                i5 = 128;
                i3 |= i5;
            } else {
                sliderColors2 = sliderColors;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changed(this) ? 16384 : 8192;
                }
                if ((i3 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier.Companion companion = i6 != 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 4) != 0) {
                            sliderColors3 = colors(startRestartGroup, (i3 >> 12) & 14);
                            i3 &= -897;
                        } else {
                            sliderColors3 = sliderColors2;
                        }
                        if (i4 != 0) {
                            modifier3 = companion;
                            sliderColors4 = sliderColors3;
                            z3 = true;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1617869097, i3, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1189)");
                            }
                            f = SliderKt.ThumbTrackGapSize;
                            f2 = SliderKt.TrackInsideCornerSize;
                            m2176Track4EFweAY(rangeSliderState, modifier3, z3, sliderColors4, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, f, f2, startRestartGroup, (i3 & 14) | 14155776 | (i3 & SdkConfig.SDK_VERSION) | ((i3 >> 3) & 896) | ((i3 << 3) & 7168) | ((i3 << 12) & 234881024), 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier3;
                            sliderColors2 = sliderColors4;
                            z4 = z3;
                        } else {
                            modifier3 = companion;
                            sliderColors4 = sliderColors3;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        modifier3 = modifier2;
                        sliderColors4 = sliderColors2;
                    }
                    z3 = z2;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    f = SliderKt.ThumbTrackGapSize;
                    f2 = SliderKt.TrackInsideCornerSize;
                    m2176Track4EFweAY(rangeSliderState, modifier3, z3, sliderColors4, (Function2<? super DrawScope, ? super Offset, Unit>) null, (Function3<? super DrawScope, ? super Offset, ? super Color, Unit>) null, f, f2, startRestartGroup, (i3 & 14) | 14155776 | (i3 & SdkConfig.SDK_VERSION) | ((i3 >> 3) & 896) | ((i3 << 3) & 7168) | ((i3 << 12) & 234881024), 48);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier3;
                    sliderColors2 = sliderColors4;
                    z4 = z3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    z4 = z2;
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$8
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i7) {
                            SliderDefaults.this.Track(rangeSliderState, modifier2, sliderColors2, z4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            z2 = z;
            if ((i2 & 16) != 0) {
            }
            if ((i3 & 9363) == 9362) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i6 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i4 != 0) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i2 & 16) != 0) {
        }
        if ((i3 & 9363) == 9362) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i6 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i4 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0290, code lost:
    
        if (r13.changed(r5) == false) goto L176;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0273  */
    /* renamed from: Track-4EFweAY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2176Track4EFweAY(final RangeSliderState rangeSliderState, Modifier modifier, boolean z, SliderColors sliderColors, Function2<? super DrawScope, ? super Offset, Unit> function2, Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function3, float f, float f2, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        final boolean z2;
        SliderColors sliderColors2;
        Function2<? super DrawScope, ? super Offset, Unit> function22;
        int i5;
        Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function32;
        int i6;
        int i7;
        float f3;
        final SliderColors sliderColors3;
        Function2<? super DrawScope, ? super Offset, Unit> function23;
        Modifier modifier2;
        Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function33;
        float f4;
        float f5;
        SliderColors sliderColors4;
        boolean z3;
        Function2<? super DrawScope, ? super Offset, Unit> function24;
        float f6;
        Function2<? super DrawScope, ? super Offset, Unit> function25;
        boolean z4;
        boolean z5;
        Object rememberedValue;
        final Function2<? super DrawScope, ? super Offset, Unit> function26;
        SliderColors sliderColors5;
        Modifier modifier3;
        boolean z6;
        Modifier modifier4;
        Composer composer2;
        final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function34;
        final Function2<? super DrawScope, ? super Offset, Unit> function27;
        final float f7;
        final boolean z7;
        final SliderColors sliderColors6;
        final float f8;
        final Modifier modifier5;
        ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-541824132);
        ComposerKt.sourceInformation(startRestartGroup, "C(Track)P(5,4,3!3,6:c#ui.unit.Dp,7:c#ui.unit.Dp)1222@54320L8,1223@54389L232,1245@55370L7,1246@55426L706,1241@55223L909:Slider.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(rangeSliderState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        sliderColors2 = sliderColors;
                        if (startRestartGroup.changed(sliderColors2)) {
                            i10 = 2048;
                            i3 |= i10;
                        }
                    } else {
                        sliderColors2 = sliderColors;
                    }
                    i10 = 1024;
                    i3 |= i10;
                } else {
                    sliderColors2 = sliderColors;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        function22 = function2;
                        if (startRestartGroup.changedInstance(function22)) {
                            i9 = 16384;
                            i3 |= i9;
                        }
                    } else {
                        function22 = function2;
                    }
                    i9 = 8192;
                    i3 |= i9;
                } else {
                    function22 = function2;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    function32 = function3;
                } else {
                    function32 = function3;
                    if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i3 |= startRestartGroup.changedInstance(function32) ? 131072 : 65536;
                    }
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= startRestartGroup.changed(f) ? 1048576 : 524288;
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                    i3 |= 12582912;
                    f3 = f2;
                } else {
                    f3 = f2;
                    if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changed(f3) ? 8388608 : 4194304;
                    }
                }
                if ((i2 & 256) == 0) {
                    i8 = (100663296 & i) == 0 ? startRestartGroup.changed(this) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432 : 100663296;
                    if ((38347923 & i3) == 38347922 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i11 == 0 ? Modifier.INSTANCE : modifier;
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) == 0) {
                                sliderColors3 = colors(startRestartGroup, (i3 >> 24) & 14);
                                i3 &= -7169;
                            } else {
                                sliderColors3 = sliderColors2;
                            }
                            if ((i2 & 16) == 0) {
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -800729349, "CC(remember):Slider.kt#9igjgp");
                                boolean z8 = ((((i3 & 7168) ^ 3072) > 2048 && startRestartGroup.changed(sliderColors3)) || (i3 & 3072) == 2048) | ((i3 & 896) == 256);
                                Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (z8 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = (Function2) new Function2<DrawScope, Offset, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$9$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope, Offset offset) {
                                            m2184invokeUv8p0NA(drawScope, offset.getPackedValue());
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                                        public final void m2184invokeUv8p0NA(DrawScope drawScope, long j) {
                                            SliderDefaults.INSTANCE.m2172drawStopIndicatorx3O1jOs(drawScope, j, SliderDefaults.INSTANCE.m2180getTrackStopIndicatorSizeD9Ej5fM(), SliderColors.this.m2169trackColorWaAFU9c$material3_release(z2, true));
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                function23 = (Function2) rememberedValue2;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                i3 &= -57345;
                            } else {
                                function23 = function22;
                            }
                            SliderDefaults$Track$10 sliderDefaults$Track$10 = i5 == 0 ? new Function3<DrawScope, Offset, Color, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$10
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope, Offset offset, Color color) {
                                    m2181invokewPWG1Vc(drawScope, offset.getPackedValue(), color.m3853unboximpl());
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke-wPWG1Vc, reason: not valid java name */
                                public final void m2181invokewPWG1Vc(DrawScope drawScope, long j, long j2) {
                                    SliderDefaults.INSTANCE.m2172drawStopIndicatorx3O1jOs(drawScope, j, SliderDefaults.INSTANCE.m2179getTickSizeD9Ej5fM(), j2);
                                }
                            } : function32;
                            float f9 = i6 == 0 ? SliderKt.ThumbTrackGapSize : f;
                            if (i7 == 0) {
                                f6 = SliderKt.TrackInsideCornerSize;
                                modifier2 = companion;
                                f4 = f6;
                                z3 = z2;
                                function33 = sliderDefaults$Track$10;
                                f5 = f9;
                                sliderColors4 = sliderColors3;
                            } else {
                                modifier2 = companion;
                                function33 = sliderDefaults$Track$10;
                                f4 = f3;
                                f5 = f9;
                                sliderColors4 = sliderColors3;
                                z3 = z2;
                            }
                            function24 = function23;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            f5 = f;
                            f4 = f3;
                            function33 = function32;
                            modifier2 = modifier;
                            z3 = z2;
                            function24 = function22;
                            sliderColors4 = sliderColors2;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-541824132, i3, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1236)");
                        }
                        final long m2169trackColorWaAFU9c$material3_release = sliderColors4.m2169trackColorWaAFU9c$material3_release(z3, false);
                        final long m2169trackColorWaAFU9c$material3_release2 = sliderColors4.m2169trackColorWaAFU9c$material3_release(z3, true);
                        final long m2168tickColorWaAFU9c$material3_release = sliderColors4.m2168tickColorWaAFU9c$material3_release(z3, false);
                        Function2<? super DrawScope, ? super Offset, Unit> function28 = function24;
                        final long m2168tickColorWaAFU9c$material3_release2 = sliderColors4.m2168tickColorWaAFU9c$material3_release(z3, true);
                        boolean z9 = z3;
                        Modifier m715height3ABfNKs = SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), SliderKt.getTrackHeight());
                        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
                        SliderColors sliderColors7 = sliderColors4;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume = startRestartGroup.consume(localLayoutDirection);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        Modifier rotate = RotateKt.rotate(m715height3ABfNKs, consume != LayoutDirection.Rtl ? 180.0f : 0.0f);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -800695691, "CC(remember):Slider.kt#9igjgp");
                        boolean changedInstance = startRestartGroup.changedInstance(rangeSliderState) | startRestartGroup.changed(m2169trackColorWaAFU9c$material3_release) | startRestartGroup.changed(m2169trackColorWaAFU9c$material3_release2) | startRestartGroup.changed(m2168tickColorWaAFU9c$material3_release) | startRestartGroup.changed(m2168tickColorWaAFU9c$material3_release2) | ((3670016 & i3) != 1048576) | ((29360128 & i3) != 8388608);
                        if (((57344 & i3) ^ 24576) <= 16384) {
                            function25 = function28;
                        } else {
                            function25 = function28;
                        }
                        if ((i3 & 24576) != 16384) {
                            z4 = false;
                            z5 = z4 | changedInstance | ((i3 & 458752) == 131072);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!z5 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                function26 = function25;
                                sliderColors5 = sliderColors7;
                                modifier3 = rotate;
                                z6 = z9;
                                modifier4 = modifier2;
                                final float f10 = f5;
                                final float f11 = f4;
                                composer2 = startRestartGroup;
                                final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function35 = function33;
                                rememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$11$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                        invoke2(drawScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(DrawScope drawScope) {
                                        SliderDefaults.INSTANCE.m2173drawTrackngJ0SCU(drawScope, RangeSliderState.this.getTickFractions(), RangeSliderState.this.getCoercedActiveRangeStartAsFraction$material3_release(), RangeSliderState.this.getCoercedActiveRangeEndAsFraction$material3_release(), m2169trackColorWaAFU9c$material3_release, m2169trackColorWaAFU9c$material3_release2, m2168tickColorWaAFU9c$material3_release, m2168tickColorWaAFU9c$material3_release2, drawScope.mo372toDpu2uoSUM(RangeSliderState.this.getTrackHeight$material3_release()), drawScope.mo372toDpu2uoSUM(RangeSliderState.this.getStartThumbWidth$material3_release()), drawScope.mo372toDpu2uoSUM(RangeSliderState.this.getEndThumbWidth$material3_release()), f10, f11, function26, function35, true);
                                    }
                                };
                                composer2.updateRememberedValue(rememberedValue);
                            } else {
                                sliderColors5 = sliderColors7;
                                function26 = function25;
                                modifier3 = rotate;
                                composer2 = startRestartGroup;
                                z6 = z9;
                                modifier4 = modifier2;
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            CanvasKt.Canvas(modifier3, (Function1) rememberedValue, composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function34 = function33;
                            function27 = function26;
                            f7 = f5;
                            z7 = z6;
                            sliderColors6 = sliderColors5;
                            f8 = f4;
                            modifier5 = modifier4;
                        }
                        z4 = true;
                        z5 = z4 | changedInstance | ((i3 & 458752) == 131072);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (z5) {
                        }
                        function26 = function25;
                        sliderColors5 = sliderColors7;
                        modifier3 = rotate;
                        z6 = z9;
                        modifier4 = modifier2;
                        final float f102 = f5;
                        final float f112 = f4;
                        composer2 = startRestartGroup;
                        final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function352 = function33;
                        rememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$11$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DrawScope drawScope) {
                                SliderDefaults.INSTANCE.m2173drawTrackngJ0SCU(drawScope, RangeSliderState.this.getTickFractions(), RangeSliderState.this.getCoercedActiveRangeStartAsFraction$material3_release(), RangeSliderState.this.getCoercedActiveRangeEndAsFraction$material3_release(), m2169trackColorWaAFU9c$material3_release, m2169trackColorWaAFU9c$material3_release2, m2168tickColorWaAFU9c$material3_release, m2168tickColorWaAFU9c$material3_release2, drawScope.mo372toDpu2uoSUM(RangeSliderState.this.getTrackHeight$material3_release()), drawScope.mo372toDpu2uoSUM(RangeSliderState.this.getStartThumbWidth$material3_release()), drawScope.mo372toDpu2uoSUM(RangeSliderState.this.getEndThumbWidth$material3_release()), f102, f112, function26, function352, true);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        CanvasKt.Canvas(modifier3, (Function1) rememberedValue, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function34 = function33;
                        function27 = function26;
                        f7 = f5;
                        z7 = z6;
                        sliderColors6 = sliderColors5;
                        f8 = f4;
                        modifier5 = modifier4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier5 = modifier;
                        z7 = z2;
                        sliderColors6 = sliderColors2;
                        f8 = f3;
                        function27 = function22;
                        function34 = function32;
                        composer2 = startRestartGroup;
                        f7 = f;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$12
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i12) {
                                SliderDefaults.this.m2176Track4EFweAY(rangeSliderState, modifier5, z7, sliderColors6, function27, function34, f7, f8, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= i8;
                if ((38347923 & i3) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i11 == 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 8) == 0) {
                }
                if ((i2 & 16) == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                function24 = function23;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final long m2169trackColorWaAFU9c$material3_release3 = sliderColors4.m2169trackColorWaAFU9c$material3_release(z3, false);
                final long m2169trackColorWaAFU9c$material3_release22 = sliderColors4.m2169trackColorWaAFU9c$material3_release(z3, true);
                final long m2168tickColorWaAFU9c$material3_release3 = sliderColors4.m2168tickColorWaAFU9c$material3_release(z3, false);
                Function2<? super DrawScope, ? super Offset, Unit> function282 = function24;
                final long m2168tickColorWaAFU9c$material3_release22 = sliderColors4.m2168tickColorWaAFU9c$material3_release(z3, true);
                boolean z92 = z3;
                Modifier m715height3ABfNKs2 = SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), SliderKt.getTrackHeight());
                ProvidableCompositionLocal<LayoutDirection> localLayoutDirection2 = CompositionLocalsKt.getLocalLayoutDirection();
                SliderColors sliderColors72 = sliderColors4;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(localLayoutDirection2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                Modifier rotate2 = RotateKt.rotate(m715height3ABfNKs2, consume2 != LayoutDirection.Rtl ? 180.0f : 0.0f);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -800695691, "CC(remember):Slider.kt#9igjgp");
                boolean changedInstance2 = startRestartGroup.changedInstance(rangeSliderState) | startRestartGroup.changed(m2169trackColorWaAFU9c$material3_release3) | startRestartGroup.changed(m2169trackColorWaAFU9c$material3_release22) | startRestartGroup.changed(m2168tickColorWaAFU9c$material3_release3) | startRestartGroup.changed(m2168tickColorWaAFU9c$material3_release22) | ((3670016 & i3) != 1048576) | ((29360128 & i3) != 8388608);
                if (((57344 & i3) ^ 24576) <= 16384) {
                }
                if ((i3 & 24576) != 16384) {
                }
                z4 = true;
                z5 = z4 | changedInstance2 | ((i3 & 458752) == 131072);
                rememberedValue = startRestartGroup.rememberedValue();
                if (z5) {
                }
                function26 = function25;
                sliderColors5 = sliderColors72;
                modifier3 = rotate2;
                z6 = z92;
                modifier4 = modifier2;
                final float f1022 = f5;
                final float f1122 = f4;
                composer2 = startRestartGroup;
                final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function3522 = function33;
                rememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$11$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        SliderDefaults.INSTANCE.m2173drawTrackngJ0SCU(drawScope, RangeSliderState.this.getTickFractions(), RangeSliderState.this.getCoercedActiveRangeStartAsFraction$material3_release(), RangeSliderState.this.getCoercedActiveRangeEndAsFraction$material3_release(), m2169trackColorWaAFU9c$material3_release3, m2169trackColorWaAFU9c$material3_release22, m2168tickColorWaAFU9c$material3_release3, m2168tickColorWaAFU9c$material3_release22, drawScope.mo372toDpu2uoSUM(RangeSliderState.this.getTrackHeight$material3_release()), drawScope.mo372toDpu2uoSUM(RangeSliderState.this.getStartThumbWidth$material3_release()), drawScope.mo372toDpu2uoSUM(RangeSliderState.this.getEndThumbWidth$material3_release()), f1022, f1122, function26, function3522, true);
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                CanvasKt.Canvas(modifier3, (Function1) rememberedValue, composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                function34 = function33;
                function27 = function26;
                f7 = f5;
                z7 = z6;
                sliderColors6 = sliderColors5;
                f8 = f4;
                modifier5 = modifier4;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            if ((i2 & 256) == 0) {
            }
            i3 |= i8;
            if ((38347923 & i3) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i11 == 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 8) == 0) {
            }
            if ((i2 & 16) == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            function24 = function23;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            final long m2169trackColorWaAFU9c$material3_release32 = sliderColors4.m2169trackColorWaAFU9c$material3_release(z3, false);
            final long m2169trackColorWaAFU9c$material3_release222 = sliderColors4.m2169trackColorWaAFU9c$material3_release(z3, true);
            final long m2168tickColorWaAFU9c$material3_release32 = sliderColors4.m2168tickColorWaAFU9c$material3_release(z3, false);
            Function2<? super DrawScope, ? super Offset, Unit> function2822 = function24;
            final long m2168tickColorWaAFU9c$material3_release222 = sliderColors4.m2168tickColorWaAFU9c$material3_release(z3, true);
            boolean z922 = z3;
            Modifier m715height3ABfNKs22 = SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), SliderKt.getTrackHeight());
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection22 = CompositionLocalsKt.getLocalLayoutDirection();
            SliderColors sliderColors722 = sliderColors4;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume22 = startRestartGroup.consume(localLayoutDirection22);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Modifier rotate22 = RotateKt.rotate(m715height3ABfNKs22, consume22 != LayoutDirection.Rtl ? 180.0f : 0.0f);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -800695691, "CC(remember):Slider.kt#9igjgp");
            boolean changedInstance22 = startRestartGroup.changedInstance(rangeSliderState) | startRestartGroup.changed(m2169trackColorWaAFU9c$material3_release32) | startRestartGroup.changed(m2169trackColorWaAFU9c$material3_release222) | startRestartGroup.changed(m2168tickColorWaAFU9c$material3_release32) | startRestartGroup.changed(m2168tickColorWaAFU9c$material3_release222) | ((3670016 & i3) != 1048576) | ((29360128 & i3) != 8388608);
            if (((57344 & i3) ^ 24576) <= 16384) {
            }
            if ((i3 & 24576) != 16384) {
            }
            z4 = true;
            z5 = z4 | changedInstance22 | ((i3 & 458752) == 131072);
            rememberedValue = startRestartGroup.rememberedValue();
            if (z5) {
            }
            function26 = function25;
            sliderColors5 = sliderColors722;
            modifier3 = rotate22;
            z6 = z922;
            modifier4 = modifier2;
            final float f10222 = f5;
            final float f11222 = f4;
            composer2 = startRestartGroup;
            final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function35222 = function33;
            rememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$11$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                    invoke2(drawScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(DrawScope drawScope) {
                    SliderDefaults.INSTANCE.m2173drawTrackngJ0SCU(drawScope, RangeSliderState.this.getTickFractions(), RangeSliderState.this.getCoercedActiveRangeStartAsFraction$material3_release(), RangeSliderState.this.getCoercedActiveRangeEndAsFraction$material3_release(), m2169trackColorWaAFU9c$material3_release32, m2169trackColorWaAFU9c$material3_release222, m2168tickColorWaAFU9c$material3_release32, m2168tickColorWaAFU9c$material3_release222, drawScope.mo372toDpu2uoSUM(RangeSliderState.this.getTrackHeight$material3_release()), drawScope.mo372toDpu2uoSUM(RangeSliderState.this.getStartThumbWidth$material3_release()), drawScope.mo372toDpu2uoSUM(RangeSliderState.this.getEndThumbWidth$material3_release()), f10222, f11222, function26, function35222, true);
                }
            };
            composer2.updateRememberedValue(rememberedValue);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            CanvasKt.Canvas(modifier3, (Function1) rememberedValue, composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            function34 = function33;
            function27 = function26;
            f7 = f5;
            z7 = z6;
            sliderColors6 = sliderColors5;
            f8 = f4;
            modifier5 = modifier4;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        if ((i2 & 256) == 0) {
        }
        i3 |= i8;
        if ((38347923 & i3) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i11 == 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        function24 = function23;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        final long m2169trackColorWaAFU9c$material3_release322 = sliderColors4.m2169trackColorWaAFU9c$material3_release(z3, false);
        final long m2169trackColorWaAFU9c$material3_release2222 = sliderColors4.m2169trackColorWaAFU9c$material3_release(z3, true);
        final long m2168tickColorWaAFU9c$material3_release322 = sliderColors4.m2168tickColorWaAFU9c$material3_release(z3, false);
        Function2<? super DrawScope, ? super Offset, Unit> function28222 = function24;
        final long m2168tickColorWaAFU9c$material3_release2222 = sliderColors4.m2168tickColorWaAFU9c$material3_release(z3, true);
        boolean z9222 = z3;
        Modifier m715height3ABfNKs222 = SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), SliderKt.getTrackHeight());
        ProvidableCompositionLocal<LayoutDirection> localLayoutDirection222 = CompositionLocalsKt.getLocalLayoutDirection();
        SliderColors sliderColors7222 = sliderColors4;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume222 = startRestartGroup.consume(localLayoutDirection222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Modifier rotate222 = RotateKt.rotate(m715height3ABfNKs222, consume222 != LayoutDirection.Rtl ? 180.0f : 0.0f);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -800695691, "CC(remember):Slider.kt#9igjgp");
        boolean changedInstance222 = startRestartGroup.changedInstance(rangeSliderState) | startRestartGroup.changed(m2169trackColorWaAFU9c$material3_release322) | startRestartGroup.changed(m2169trackColorWaAFU9c$material3_release2222) | startRestartGroup.changed(m2168tickColorWaAFU9c$material3_release322) | startRestartGroup.changed(m2168tickColorWaAFU9c$material3_release2222) | ((3670016 & i3) != 1048576) | ((29360128 & i3) != 8388608);
        if (((57344 & i3) ^ 24576) <= 16384) {
        }
        if ((i3 & 24576) != 16384) {
        }
        z4 = true;
        z5 = z4 | changedInstance222 | ((i3 & 458752) == 131072);
        rememberedValue = startRestartGroup.rememberedValue();
        if (z5) {
        }
        function26 = function25;
        sliderColors5 = sliderColors7222;
        modifier3 = rotate222;
        z6 = z9222;
        modifier4 = modifier2;
        final float f102222 = f5;
        final float f112222 = f4;
        composer2 = startRestartGroup;
        final Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function352222 = function33;
        rememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$11$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DrawScope drawScope) {
                SliderDefaults.INSTANCE.m2173drawTrackngJ0SCU(drawScope, RangeSliderState.this.getTickFractions(), RangeSliderState.this.getCoercedActiveRangeStartAsFraction$material3_release(), RangeSliderState.this.getCoercedActiveRangeEndAsFraction$material3_release(), m2169trackColorWaAFU9c$material3_release322, m2169trackColorWaAFU9c$material3_release2222, m2168tickColorWaAFU9c$material3_release322, m2168tickColorWaAFU9c$material3_release2222, drawScope.mo372toDpu2uoSUM(RangeSliderState.this.getTrackHeight$material3_release()), drawScope.mo372toDpu2uoSUM(RangeSliderState.this.getStartThumbWidth$material3_release()), drawScope.mo372toDpu2uoSUM(RangeSliderState.this.getEndThumbWidth$material3_release()), f102222, f112222, function26, function352222, true);
            }
        };
        composer2.updateRememberedValue(rememberedValue);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        CanvasKt.Canvas(modifier3, (Function1) rememberedValue, composer2, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        function34 = function33;
        function27 = function26;
        f7 = f5;
        z7 = z6;
        sliderColors6 = sliderColors5;
        f8 = f4;
        modifier5 = modifier4;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawTrack-ngJ0SCU, reason: not valid java name */
    public final void m2173drawTrackngJ0SCU(DrawScope drawScope, float[] fArr, float f, float f2, long j, long j2, long j3, long j4, float f3, float f4, float f5, float f6, float f7, Function2<? super DrawScope, ? super Offset, Unit> function2, Function3<? super DrawScope, ? super Offset, ? super Color, Unit> function3, boolean z) {
        float f8;
        float f9;
        int i;
        float f10;
        float f11;
        long Offset = OffsetKt.Offset(0.0f, Offset.m3603getYimpl(drawScope.mo4398getCenterF1C5BW0()));
        long Offset2 = OffsetKt.Offset(Size.m3671getWidthimpl(drawScope.mo4399getSizeNHjbRc()), Offset.m3603getYimpl(drawScope.mo4398getCenterF1C5BW0()));
        float f12 = drawScope.mo376toPx0680j_4(f3);
        long Offset3 = OffsetKt.Offset(Offset.m3602getXimpl(Offset) + ((Offset.m3602getXimpl(Offset2) - Offset.m3602getXimpl(Offset)) * f2), Offset.m3603getYimpl(drawScope.mo4398getCenterF1C5BW0()));
        long Offset4 = OffsetKt.Offset(Offset.m3602getXimpl(Offset) + ((Offset.m3602getXimpl(Offset2) - Offset.m3602getXimpl(Offset)) * f), Offset.m3603getYimpl(drawScope.mo4398getCenterF1C5BW0()));
        float f13 = 2;
        float f14 = f12 / f13;
        float f15 = drawScope.mo376toPx0680j_4(f7);
        if (Dp.m6302compareTo0680j_4(f6, Dp.m6303constructorimpl(0)) > 0) {
            f8 = (drawScope.mo376toPx0680j_4(f4) / f13) + drawScope.mo376toPx0680j_4(f6);
            f9 = (drawScope.mo376toPx0680j_4(f5) / f13) + drawScope.mo376toPx0680j_4(f6);
        } else {
            f8 = 0.0f;
            f9 = 0.0f;
        }
        if (!z || Offset.m3602getXimpl(Offset4) <= Offset.m3602getXimpl(Offset) + f8 + f14) {
            i = 0;
            f10 = f12;
        } else {
            float m3602getXimpl = Offset.m3602getXimpl(Offset);
            i = 0;
            f10 = f12;
            m2174drawTrackPathCx2C_VA(drawScope, Offset.INSTANCE.m3618getZeroF1C5BW0(), androidx.compose.ui.geometry.SizeKt.Size((Offset.m3602getXimpl(Offset4) - f8) - m3602getXimpl, f12), j, f14, f15);
            if (function2 != null) {
                function2.invoke(drawScope, Offset.m3591boximpl(OffsetKt.Offset(m3602getXimpl + f14, Offset.m3603getYimpl(drawScope.mo4398getCenterF1C5BW0()))));
            }
        }
        if (Offset.m3602getXimpl(Offset3) < (Offset.m3602getXimpl(Offset2) - f9) - f14) {
            float m3602getXimpl2 = Offset.m3602getXimpl(Offset3) + f9;
            float m3602getXimpl3 = Offset.m3602getXimpl(Offset2);
            float f16 = f10;
            f11 = f16;
            m2174drawTrackPathCx2C_VA(drawScope, OffsetKt.Offset(m3602getXimpl2, 0.0f), androidx.compose.ui.geometry.SizeKt.Size(m3602getXimpl3 - m3602getXimpl2, f16), j, f15, f14);
            if (function2 != null) {
                function2.invoke(drawScope, Offset.m3591boximpl(OffsetKt.Offset(m3602getXimpl3 - f14, Offset.m3603getYimpl(drawScope.mo4398getCenterF1C5BW0()))));
            }
        } else {
            f11 = f10;
        }
        float m3602getXimpl4 = z ? Offset.m3602getXimpl(Offset4) + f8 : 0.0f;
        float m3602getXimpl5 = Offset.m3602getXimpl(Offset3) - f9;
        float f17 = z ? f15 : f14;
        float f18 = m3602getXimpl5 - m3602getXimpl4;
        if (f18 > f17) {
            m2174drawTrackPathCx2C_VA(drawScope, OffsetKt.Offset(m3602getXimpl4, 0.0f), androidx.compose.ui.geometry.SizeKt.Size(f18, f11), j2, f17, f15);
        }
        long Offset5 = OffsetKt.Offset(Offset.m3602getXimpl(Offset) + f14, Offset.m3603getYimpl(Offset));
        long Offset6 = OffsetKt.Offset(Offset.m3602getXimpl(Offset2) - f14, Offset.m3603getYimpl(Offset2));
        ClosedFloatingPointRange<Float> rangeTo = RangesKt.rangeTo(Offset.m3602getXimpl(Offset4) - f8, Offset.m3602getXimpl(Offset4) + f8);
        ClosedFloatingPointRange<Float> rangeTo2 = RangesKt.rangeTo(Offset.m3602getXimpl(Offset3) - f9, Offset.m3602getXimpl(Offset3) + f9);
        int length = fArr.length;
        int i2 = i;
        int i3 = i2;
        while (i3 < length) {
            float f19 = fArr[i3];
            int i4 = i2 + 1;
            int i5 = 1;
            if (function2 == null || ((!z || i2 != 0) && i2 != fArr.length - 1)) {
                if (f19 <= f2 && f19 >= f) {
                    i5 = i;
                }
                long Offset7 = OffsetKt.Offset(Offset.m3602getXimpl(OffsetKt.m3625lerpWko1d7g(Offset5, Offset6, f19)), Offset.m3603getYimpl(drawScope.mo4398getCenterF1C5BW0()));
                if ((!z || !rangeTo.contains(Float.valueOf(Offset.m3602getXimpl(Offset7)))) && !rangeTo2.contains(Float.valueOf(Offset.m3602getXimpl(Offset7)))) {
                    function3.invoke(drawScope, Offset.m3591boximpl(Offset7), Color.m3833boximpl(i5 != 0 ? j3 : j4));
                    i3++;
                    i2 = i4;
                }
            }
            i3++;
            i2 = i4;
        }
    }

    /* renamed from: drawTrackPath-Cx2C_VA, reason: not valid java name */
    private final void m2174drawTrackPathCx2C_VA(DrawScope drawScope, long j, long j2, long j3, float f, float f2) {
        long CornerRadius = CornerRadiusKt.CornerRadius(f, f);
        long CornerRadius2 = CornerRadiusKt.CornerRadius(f2, f2);
        RoundRect m3654RoundRectZAM2FJo = RoundRectKt.m3654RoundRectZAM2FJo(RectKt.m3642Recttz77jQw(OffsetKt.Offset(Offset.m3602getXimpl(j), 0.0f), androidx.compose.ui.geometry.SizeKt.Size(Size.m3671getWidthimpl(j2), Size.m3668getHeightimpl(j2))), CornerRadius, CornerRadius2, CornerRadius2, CornerRadius);
        Path path = trackPath;
        Path.addRoundRect$default(path, m3654RoundRectZAM2FJo, null, 2, null);
        DrawScope.m4389drawPathLG529CI$default(drawScope, path, j3, 0.0f, null, null, 0, 60, null);
        path.rewind();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawStopIndicator-x3O1jOs, reason: not valid java name */
    public final void m2172drawStopIndicatorx3O1jOs(DrawScope drawScope, long offset, float size, long color) {
        DrawScope.m4380drawCircleVaOC9Bg$default(drawScope, color, drawScope.mo376toPx0680j_4(size) / 2.0f, offset, 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
    }

    /* renamed from: getTrackStopIndicatorSize-D9Ej5fM, reason: not valid java name */
    public final float m2180getTrackStopIndicatorSizeD9Ej5fM() {
        return TrackStopIndicatorSize;
    }

    /* renamed from: getTickSize-D9Ej5fM, reason: not valid java name */
    public final float m2179getTickSizeD9Ej5fM() {
        return TickSize;
    }
}
