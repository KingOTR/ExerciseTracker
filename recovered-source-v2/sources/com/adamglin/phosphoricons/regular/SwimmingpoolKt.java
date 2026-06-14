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

/* compiled from: Swimmingpool.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SwimmingPool", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getSwimmingPool", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_swimmingPool", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SwimmingpoolKt {
    private static ImageVector _swimmingPool;

    public static final ImageVector getSwimmingPool(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _swimmingPool;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("SwimmingPool", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(88.0f, 149.39f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f);
        pathBuilder.lineTo(96.0f, 128.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.verticalLineToRelative(15.29f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.lineTo(176.0f, 32.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder.lineTo(160.0f, 48.0f);
        pathBuilder.lineTo(96.0f, 48.0f);
        pathBuilder.lineTo(96.0f, 32.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder.lineTo(80.0f, 141.39f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 88.0f, 149.39f);
        pathBuilder.close();
        pathBuilder.moveTo(96.0f, 112.0f);
        pathBuilder.lineTo(96.0f, 96.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(160.0f, 64.0f);
        pathBuilder.lineTo(160.0f, 80.0f);
        pathBuilder.lineTo(96.0f, 80.0f);
        pathBuilder.lineTo(96.0f, 64.0f);
        pathBuilder.close();
        pathBuilder.moveTo(24.0f, 168.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f);
        pathBuilder.curveToRelative(14.42f, 0.0f, 22.19f, 5.18f, 28.44f, 9.34f);
        pathBuilder.curveTo(66.0f, 173.06f, 70.42f, 176.0f, 80.0f, 176.0f);
        pathBuilder.reflectiveCurveToRelative(14.0f, -2.94f, 19.56f, -6.66f);
        pathBuilder.curveToRelative(6.24f, -4.16f, 14.0f, -9.34f, 28.43f, -9.34f);
        pathBuilder.reflectiveCurveToRelative(22.2f, 5.18f, 28.44f, 9.34f);
        pathBuilder.curveToRelative(5.58f, 3.72f, 10.0f, 6.66f, 19.57f, 6.66f);
        pathBuilder.reflectiveCurveToRelative(14.0f, -2.94f, 19.56f, -6.66f);
        pathBuilder.curveToRelative(6.25f, -4.16f, 14.0f, -9.34f, 28.44f, -9.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder.curveToRelative(-9.58f, 0.0f, -14.0f, 2.94f, -19.56f, 6.66f);
        pathBuilder.curveToRelative(-6.25f, 4.16f, -14.0f, 9.34f, -28.44f, 9.34f);
        pathBuilder.reflectiveCurveToRelative(-22.2f, -5.18f, -28.44f, -9.34f);
        pathBuilder.curveTo(142.0f, 178.94f, 137.57f, 176.0f, 128.0f, 176.0f);
        pathBuilder.reflectiveCurveToRelative(-14.0f, 2.94f, -19.56f, 6.66f);
        pathBuilder.curveToRelative(-6.24f, 4.16f, -14.0f, 9.34f, -28.43f, 9.34f);
        pathBuilder.reflectiveCurveToRelative(-22.19f, -5.18f, -28.44f, -9.34f);
        pathBuilder.curveTo(46.0f, 178.94f, 41.58f, 176.0f, 32.0f, 176.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 24.0f, 168.0f);
        pathBuilder.close();
        pathBuilder.moveTo(232.0f, 208.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.curveToRelative(-9.58f, 0.0f, -14.0f, 2.94f, -19.56f, 6.66f);
        pathBuilder.curveToRelative(-6.25f, 4.16f, -14.0f, 9.34f, -28.44f, 9.34f);
        pathBuilder.reflectiveCurveToRelative(-22.2f, -5.18f, -28.44f, -9.34f);
        pathBuilder.curveTo(142.0f, 218.94f, 137.57f, 216.0f, 128.0f, 216.0f);
        pathBuilder.reflectiveCurveToRelative(-14.0f, 2.94f, -19.56f, 6.66f);
        pathBuilder.curveToRelative(-6.24f, 4.16f, -14.0f, 9.34f, -28.43f, 9.34f);
        pathBuilder.reflectiveCurveToRelative(-22.19f, -5.18f, -28.44f, -9.34f);
        pathBuilder.curveTo(46.0f, 218.94f, 41.58f, 216.0f, 32.0f, 216.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder.curveToRelative(14.42f, 0.0f, 22.19f, 5.18f, 28.44f, 9.34f);
        pathBuilder.curveTo(66.0f, 213.06f, 70.42f, 216.0f, 80.0f, 216.0f);
        pathBuilder.reflectiveCurveToRelative(14.0f, -2.94f, 19.56f, -6.66f);
        pathBuilder.curveToRelative(6.24f, -4.16f, 14.0f, -9.34f, 28.43f, -9.34f);
        pathBuilder.reflectiveCurveToRelative(22.2f, 5.18f, 28.44f, 9.34f);
        pathBuilder.curveToRelative(5.58f, 3.72f, 10.0f, 6.66f, 19.57f, 6.66f);
        pathBuilder.reflectiveCurveToRelative(14.0f, -2.94f, 19.56f, -6.66f);
        pathBuilder.curveToRelative(6.25f, -4.16f, 14.0f, -9.34f, 28.44f, -9.34f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 208.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _swimmingPool = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
