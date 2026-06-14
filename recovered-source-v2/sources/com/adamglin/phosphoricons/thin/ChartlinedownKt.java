package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Chartlinedown.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ChartLineDown", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getChartLineDown", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_chartLineDown", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChartlinedownKt {
    private static ImageVector _chartLineDown;

    public static final ImageVector getChartLineDown(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _chartLineDown;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ChartLineDown", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(228.0f, 208.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.horizontalLineTo(32.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f);
        pathBuilder.verticalLineTo(48.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f);
        pathBuilder.verticalLineTo(62.34f);
        pathBuilder.lineToRelative(60.0f, 60.0f);
        pathBuilder.lineToRelative(29.17f, -29.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f);
        pathBuilder.lineTo(196.0f, 158.34f);
        pathBuilder.verticalLineTo(128.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.arcToRelative(4.13f, 4.13f, 0.0f, false, true, -0.08f, 0.78f);
        pathBuilder.arcToRelative(3.37f, 3.37f, 0.0f, false, true, -0.1f, 0.34f);
        pathBuilder.arcToRelative(2.8f, 2.8f, 0.0f, false, true, -0.13f, 0.41f);
        pathBuilder.arcToRelative(2.87f, 2.87f, 0.0f, false, true, -0.2f, 0.39f);
        pathBuilder.curveToRelative(-0.05f, 0.1f, -0.1f, 0.2f, -0.16f, 0.3f);
        pathBuilder.arcToRelative(4.19f, 4.19f, 0.0f, false, true, -1.11f, 1.11f);
        pathBuilder.lineToRelative(-0.31f, 0.16f);
        pathBuilder.arcToRelative(3.48f, 3.48f, 0.0f, false, true, -0.38f, 0.2f);
        pathBuilder.arcToRelative(2.8f, 2.8f, 0.0f, false, true, -0.41f, 0.13f);
        pathBuilder.arcToRelative(3.37f, 3.37f, 0.0f, false, true, -0.34f, 0.1f);
        pathBuilder.arcToRelative(4.13f, 4.13f, 0.0f, false, true, -0.78f, 0.08f);
        pathBuilder.horizontalLineTo(160.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f);
        pathBuilder.horizontalLineToRelative(30.34f);
        pathBuilder.lineTo(128.0f, 101.66f);
        pathBuilder.lineTo(98.83f, 130.83f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f);
        pathBuilder.lineTo(36.0f, 73.66f);
        pathBuilder.verticalLineTo(204.0f);
        pathBuilder.horizontalLineTo(224.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 228.0f, 208.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _chartLineDown = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
