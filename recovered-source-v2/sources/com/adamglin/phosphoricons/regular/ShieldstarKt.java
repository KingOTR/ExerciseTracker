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

/* compiled from: Shieldstar.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ShieldStar", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getShieldStar", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_shieldStar", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShieldstarKt {
    private static ImageVector _shieldStar;

    public static final ImageVector getShieldStar(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _shieldStar;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ShieldStar", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(80.57f, 117.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 91.0f, 112.57f);
        pathBuilder.lineToRelative(29.0f, 11.61f);
        pathBuilder.lineTo(120.0f, 96.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder.verticalLineToRelative(28.18f);
        pathBuilder.lineToRelative(29.0f, -11.61f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, true, 171.0f, 127.43f);
        pathBuilder.lineToRelative(-30.31f, 12.12f);
        pathBuilder.lineTo(158.4f, 163.2f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -12.8f, 9.6f);
        pathBuilder.lineTo(128.0f, 149.33f);
        pathBuilder.lineTo(110.4f, 172.8f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -12.8f, -9.6f);
        pathBuilder.lineToRelative(17.74f, -23.65f);
        pathBuilder.lineTo(85.0f, 127.43f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 80.57f, 117.0f);
        pathBuilder.close();
        pathBuilder.moveTo(224.0f, 56.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.curveToRelative(0.0f, 52.72f, -25.52f, 84.67f, -46.93f, 102.19f);
        pathBuilder.curveToRelative(-23.06f, 18.86f, -46.0f, 25.27f, -47.0f, 25.53f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.2f, 0.0f);
        pathBuilder.curveToRelative(-1.0f, -0.26f, -23.91f, -6.67f, -47.0f, -25.53f);
        pathBuilder.curveTo(57.52f, 196.67f, 32.0f, 164.72f, 32.0f, 112.0f);
        pathBuilder.lineTo(32.0f, 56.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 40.0f);
        pathBuilder.lineTo(208.0f, 40.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(208.0f, 56.0f);
        pathBuilder.lineTo(48.0f, 56.0f);
        pathBuilder.lineToRelative(0.0f, 56.0f);
        pathBuilder.curveToRelative(0.0f, 37.3f, 13.82f, 67.51f, 41.07f, 89.81f);
        pathBuilder.arcTo(128.25f, 128.25f, 0.0f, false, false, 128.0f, 223.62f);
        pathBuilder.arcToRelative(129.3f, 129.3f, 0.0f, false, false, 39.41f, -22.2f);
        pathBuilder.curveTo(194.34f, 179.16f, 208.0f, 149.07f, 208.0f, 112.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _shieldStar = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
