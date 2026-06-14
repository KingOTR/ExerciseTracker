package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Snapchatlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SnapchatLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getSnapchatLogo", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_snapchatLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SnapchatlogoKt {
    private static ImageVector _snapchatLogo;

    public static final ImageVector getSnapchatLogo(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _snapchatLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("SnapchatLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(245.87f, 182.68f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.85f, -4.43f);
        pathBuilder.curveToRelative(-0.4f, -0.14f, -30.71f, -11.53f, -44.87f, -52.25f);
        pathBuilder.lineToRelative(21.08f, -8.43f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -4.46f, -11.14f);
        pathBuilder.lineToRelative(-20.0f, 8.0f);
        pathBuilder.arcTo(148.66f, 148.66f, 0.0f, false, true, 190.0f, 80.0f);
        pathBuilder.arcTo(62.0f, 62.0f, 0.0f, false, false, 66.0f, 80.0f);
        pathBuilder.arcToRelative(151.37f, 151.37f, 0.0f, false, true, -3.72f, 34.48f);
        pathBuilder.lineToRelative(-20.05f, -8.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.46f, 11.14f);
        pathBuilder.lineTo(58.93f, 126.0f);
        pathBuilder.arcTo(96.13f, 96.13f, 0.0f, false, true, 40.0f, 158.87f);
        pathBuilder.curveToRelative(-12.85f, 14.44f, -25.91f, 19.34f, -26.0f, 19.38f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.08f, 10.0f);
        pathBuilder.curveToRelative(6.6f, 6.19f, 16.83f, 7.2f, 26.71f, 8.18f);
        pathBuilder.curveToRelative(6.51f, 0.64f, 13.23f, 1.31f, 17.16f, 3.47f);
        pathBuilder.curveToRelative(3.76f, 2.07f, 7.36f, 7.0f, 10.85f, 11.79f);
        pathBuilder.curveToRelative(5.21f, 7.13f, 11.11f, 15.22f, 20.12f, 17.53f);
        pathBuilder.curveToRelative(8.5f, 2.16f, 17.09f, -0.76f, 25.4f, -3.59f);
        pathBuilder.curveToRelative(5.72f, -1.94f, 11.11f, -3.78f, 15.86f, -3.78f);
        pathBuilder.reflectiveCurveToRelative(10.14f, 1.84f, 15.86f, 3.78f);
        pathBuilder.curveToRelative(6.29f, 2.14f, 12.74f, 4.34f, 19.19f, 4.34f);
        pathBuilder.arcToRelative(25.36f, 25.36f, 0.0f, false, false, 6.21f, -0.75f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(9.0f, -2.3f, 14.91f, -10.39f, 20.12f, -17.52f);
        pathBuilder.curveToRelative(3.49f, -4.78f, 7.09f, -9.72f, 10.85f, -11.79f);
        pathBuilder.curveToRelative(3.93f, -2.16f, 10.65f, -2.83f, 17.16f, -3.47f);
        pathBuilder.curveToRelative(9.88f, -1.0f, 20.11f, -2.0f, 26.71f, -8.18f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 245.87f, 182.68f);
        pathBuilder.close();
        pathBuilder.moveTo(216.21f, 184.52f);
        pathBuilder.curveToRelative(-7.71f, 0.76f, -15.68f, 1.55f, -21.76f, 4.9f);
        pathBuilder.reflectiveCurveToRelative(-10.5f, 9.39f, -14.77f, 15.22f);
        pathBuilder.reflectiveCurveToRelative(-8.56f, 11.74f, -13.39f, 13.0f);
        pathBuilder.curveToRelative(-5.0f, 1.28f, -11.61f, -1.0f, -18.57f, -3.32f);
        pathBuilder.curveToRelative(-6.38f, -2.17f, -13.0f, -4.42f, -19.72f, -4.42f);
        pathBuilder.reflectiveCurveToRelative(-13.34f, 2.25f, -19.72f, 4.42f);
        pathBuilder.curveToRelative(-7.0f, 2.37f, -13.53f, 4.6f, -18.57f, 3.32f);
        pathBuilder.curveToRelative(-4.83f, -1.24f, -9.18f, -7.2f, -13.39f, -13.0f);
        pathBuilder.reflectiveCurveToRelative(-8.67f, -11.88f, -14.77f, -15.23f);
        pathBuilder.reflectiveCurveToRelative(-14.0f, -4.14f, -21.76f, -4.9f);
        pathBuilder.curveToRelative(-3.37f, -0.33f, -6.79f, -0.67f, -9.89f, -1.21f);
        pathBuilder.arcToRelative(93.88f, 93.88f, 0.0f, false, false, 18.55f, -15.9f);
        pathBuilder.curveToRelative(8.24f, -9.11f, 17.44f, -22.86f, 23.35f, -42.48f);
        pathBuilder.arcToRelative(1.42f, 1.42f, 0.0f, false, false, 0.08f, -0.18f);
        pathBuilder.arcToRelative(5.47f, 5.47f, 0.0f, false, false, 0.35f, -1.27f);
        pathBuilder.arcTo(156.21f, 156.21f, 0.0f, false, false, 78.0f, 80.0f);
        pathBuilder.arcToRelative(50.0f, 50.0f, 0.0f, false, true, 100.0f, 0.0f);
        pathBuilder.arcToRelative(156.21f, 156.21f, 0.0f, false, false, 5.77f, 43.51f);
        pathBuilder.arcToRelative(5.34f, 5.34f, 0.0f, false, false, 0.35f, 1.27f);
        pathBuilder.arcToRelative(0.89f, 0.89f, 0.0f, false, false, 0.08f, 0.17f);
        pathBuilder.curveToRelative(5.91f, 19.63f, 15.11f, 33.38f, 23.35f, 42.49f);
        pathBuilder.arcToRelative(93.88f, 93.88f, 0.0f, false, false, 18.55f, 15.9f);
        pathBuilder.curveTo(223.0f, 183.85f, 219.58f, 184.19f, 216.21f, 184.52f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _snapchatLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
