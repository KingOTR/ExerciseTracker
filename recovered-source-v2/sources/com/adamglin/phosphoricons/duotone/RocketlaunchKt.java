package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Rocketlaunch.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"RocketLaunch", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getRocketLaunch", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_rocketLaunch", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RocketlaunchKt {
    private static ImageVector _rocketLaunch;

    public static final ImageVector getRocketLaunch(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _rocketLaunch;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("RocketLaunch", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(184.0f, 120.0f);
        pathBuilder.verticalLineToRelative(61.65f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.34f, 5.65f);
        pathBuilder.lineToRelative(-34.35f, 34.35f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.57f, -4.53f);
        pathBuilder.lineTo(128.0f, 176.0f);
        pathBuilder.close();
        pathBuilder.moveTo(136.0f, 72.0f);
        pathBuilder.horizontalLineTo(74.35f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.65f, 2.34f);
        pathBuilder.lineTo(34.35f, 108.69f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.53f, 13.57f);
        pathBuilder.lineTo(80.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(40.0f, 216.0f);
        pathBuilder.curveToRelative(37.65f, 0.0f, 50.69f, -19.69f, 54.56f, -28.18f);
        pathBuilder.lineTo(68.18f, 161.44f);
        pathBuilder.curveTo(59.69f, 165.31f, 40.0f, 178.35f, 40.0f, 216.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(223.85f, 47.12f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -15.0f, -15.0f);
        pathBuilder2.curveToRelative(-12.58f, -0.75f, -44.73f, 0.4f, -71.41f, 27.07f);
        pathBuilder2.lineTo(132.69f, 64.0f);
        pathBuilder2.lineTo(74.36f, 64.0f);
        pathBuilder2.arcTo(15.91f, 15.91f, 0.0f, false, false, 63.0f, 68.68f);
        pathBuilder2.lineTo(28.7f, 103.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 9.07f, 27.16f);
        pathBuilder2.lineToRelative(38.47f, 5.37f);
        pathBuilder2.lineToRelative(44.21f, 44.21f);
        pathBuilder2.lineToRelative(5.37f, 38.49f);
        pathBuilder2.arcToRelative(15.94f, 15.94f, 0.0f, false, false, 10.78f, 12.92f);
        pathBuilder2.arcToRelative(16.11f, 16.11f, 0.0f, false, false, 5.1f, 0.83f);
        pathBuilder2.arcTo(15.91f, 15.91f, 0.0f, false, false, 153.0f, 227.3f);
        pathBuilder2.lineTo(187.32f, 193.0f);
        pathBuilder2.arcTo(15.91f, 15.91f, 0.0f, false, false, 192.0f, 181.64f);
        pathBuilder2.lineTo(192.0f, 123.31f);
        pathBuilder2.lineToRelative(4.77f, -4.77f);
        pathBuilder2.curveTo(223.45f, 91.86f, 224.6f, 59.71f, 223.85f, 47.12f);
        pathBuilder2.close();
        pathBuilder2.moveTo(74.36f, 80.0f);
        pathBuilder2.horizontalLineToRelative(42.33f);
        pathBuilder2.lineTo(77.16f, 119.52f);
        pathBuilder2.lineTo(40.0f, 114.34f);
        pathBuilder2.close();
        pathBuilder2.moveTo(148.77f, 70.55f);
        pathBuilder2.arcToRelative(76.65f, 76.65f, 0.0f, false, true, 59.11f, -22.47f);
        pathBuilder2.arcToRelative(76.46f, 76.46f, 0.0f, false, true, -22.42f, 59.16f);
        pathBuilder2.lineTo(128.0f, 164.68f);
        pathBuilder2.lineTo(91.32f, 128.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(176.0f, 181.64f);
        pathBuilder2.lineTo(141.67f, 216.0f);
        pathBuilder2.lineToRelative(-5.19f, -37.17f);
        pathBuilder2.lineTo(176.0f, 139.31f);
        pathBuilder2.close();
        pathBuilder2.moveTo(101.84f, 191.14f);
        pathBuilder2.curveTo(97.34f, 201.0f, 82.29f, 224.0f, 40.0f, 224.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f);
        pathBuilder2.curveToRelative(0.0f, -42.29f, 23.0f, -57.34f, 32.86f, -61.85f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.64f, 14.56f);
        pathBuilder2.curveToRelative(-6.43f, 2.93f, -20.62f, 12.36f, -23.12f, 38.91f);
        pathBuilder2.curveToRelative(26.55f, -2.5f, 36.0f, -16.69f, 38.91f, -23.12f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 14.56f, 6.64f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _rocketLaunch = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
