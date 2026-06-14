package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Gauge.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Gauge", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getGauge", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_gauge", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GaugeKt {
    private static ImageVector _gauge;

    public static final ImageVector getGauge(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(207.06f, 72.67f);
        pathBuilder.arcTo(111.24f, 111.24f, 0.0f, false, false, 128.0f, 40.0f);
        pathBuilder.horizontalLineToRelative(-0.4f);
        pathBuilder.curveTo(66.07f, 40.21f, 16.0f, 91.0f, 16.0f, 153.13f);
        pathBuilder.verticalLineTo(176.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.horizontalLineTo(224.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.verticalLineTo(152.0f);
        pathBuilder.arcTo(111.25f, 111.25f, 0.0f, false, false, 207.06f, 72.67f);
        pathBuilder.close();
        pathBuilder.moveTo(224.0f, 176.0f);
        pathBuilder.horizontalLineTo(119.71f);
        pathBuilder.lineToRelative(54.76f, -75.3f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -12.94f, -9.42f);
        pathBuilder.lineTo(99.92f, 176.0f);
        pathBuilder.horizontalLineTo(32.0f);
        pathBuilder.verticalLineTo(153.13f);
        pathBuilder.curveToRelative(0.0f, -3.08f, 0.15f, -6.12f, 0.43f, -9.13f);
        pathBuilder.horizontalLineTo(56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.horizontalLineTo(35.27f);
        pathBuilder.curveToRelative(10.32f, -38.86f, 44.0f, -68.24f, 84.73f, -71.66f);
        pathBuilder.verticalLineTo(80.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.verticalLineTo(56.33f);
        pathBuilder.arcTo(96.14f, 96.14f, 0.0f, false, true, 221.0f, 128.0f);
        pathBuilder.horizontalLineTo(200.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(23.67f);
        pathBuilder.curveToRelative(0.21f, 2.65f, 0.33f, 5.31f, 0.33f, 8.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _gauge = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
