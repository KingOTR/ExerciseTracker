package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Gauge.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Gauge", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getGauge", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_gauge", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GaugeKt {
    private static ImageVector _gauge;

    public static final ImageVector getGauge(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _gauge;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Gauge", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(240.0f, 152.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f);
        pathBuilder.horizontalLineTo(115.93f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.24f, -6.35f);
        pathBuilder.lineTo(174.27f, 101.0f);
        pathBuilder.arcToRelative(8.21f, 8.21f, 0.0f, false, false, -1.37f, -11.3f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.37f, 1.61f);
        pathBuilder.lineToRelative(-72.0f, 99.06f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 86.25f, 192.0f);
        pathBuilder.horizontalLineTo(32.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f);
        pathBuilder.verticalLineTo(153.13f);
        pathBuilder.curveToRelative(0.0f, -1.79f, 0.0f, -3.57f, 0.13f, -5.33f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -3.8f);
        pathBuilder.horizontalLineTo(48.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.53f);
        pathBuilder.arcTo(8.17f, 8.17f, 0.0f, false, false, 47.73f, 128.0f);
        pathBuilder.horizontalLineTo(23.92f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.87f, -5.0f);
        pathBuilder.curveToRelative(12.0f, -43.84f, 49.66f, -77.13f, 95.52f, -82.28f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.43f, 4.0f);
        pathBuilder.verticalLineTo(72.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.53f, 8.0f);
        pathBuilder.arcTo(8.17f, 8.17f, 0.0f, false, false, 136.0f, 71.73f);
        pathBuilder.verticalLineTo(44.67f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.43f, -4.0f);
        pathBuilder.arcTo(112.18f, 112.18f, 0.0f, false, true, 236.23f, 123.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.88f, 5.0f);
        pathBuilder.horizontalLineTo(208.27f);
        pathBuilder.arcToRelative(8.17f, 8.17f, 0.0f, false, false, -8.25f, 7.47f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.53f);
        pathBuilder.horizontalLineToRelative(27.92f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 3.86f);
        pathBuilder.curveTo(240.0f, 149.23f, 240.0f, 150.61f, 240.0f, 152.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _gauge = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
