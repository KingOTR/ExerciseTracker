package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Gauge.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Gauge", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getGauge", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_gauge", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GaugeKt {
    private static ImageVector _gauge;

    public static final ImageVector getGauge(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(209.88f, 69.83f);
        pathBuilder.arcTo(115.19f, 115.19f, 0.0f, false, false, 128.0f, 36.0f);
        pathBuilder.horizontalLineToRelative(-0.41f);
        pathBuilder.curveTo(63.85f, 36.22f, 12.0f, 88.76f, 12.0f, 153.13f);
        pathBuilder.verticalLineTo(176.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f);
        pathBuilder.horizontalLineTo(224.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f);
        pathBuilder.verticalLineTo(152.0f);
        pathBuilder.arcTo(115.25f, 115.25f, 0.0f, false, false, 209.88f, 69.83f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 172.0f);
        pathBuilder.horizontalLineTo(127.32f);
        pathBuilder.lineToRelative(46.44f, -65.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, true, false, 154.24f, 93.0f);
        pathBuilder.lineTo(97.82f, 172.0f);
        pathBuilder.horizontalLineTo(36.0f);
        pathBuilder.verticalLineTo(153.13f);
        pathBuilder.curveToRelative(0.0f, -1.72f, 0.0f, -3.43f, 0.14f, -5.13f);
        pathBuilder.horizontalLineTo(56.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f);
        pathBuilder.horizontalLineTo(40.62f);
        pathBuilder.curveToRelative(10.91f, -33.39f, 40.0f, -58.52f, 75.38f, -63.21f);
        pathBuilder.verticalLineTo(80.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.verticalLineTo(60.8f);
        pathBuilder.arcTo(92.0f, 92.0f, 0.0f, false, true, 215.66f, 124.0f);
        pathBuilder.horizontalLineTo(200.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(19.9f);
        pathBuilder.curveToRelative(0.06f, 1.33f, 0.1f, 2.66f, 0.1f, 4.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _gauge = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
