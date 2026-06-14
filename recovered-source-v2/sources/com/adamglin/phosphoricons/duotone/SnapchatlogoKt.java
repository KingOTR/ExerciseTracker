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

/* compiled from: Snapchatlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SnapchatLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getSnapchatLogo", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_snapchatLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SnapchatlogoKt {
    private static ImageVector _snapchatLogo;

    public static final ImageVector getSnapchatLogo(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(240.0f, 183.9f);
        pathBuilder.curveToRelative(-9.25f, 8.69f, -31.45f, 4.61f, -42.66f, 10.78f);
        pathBuilder.curveToRelative(-11.0f, 6.07f, -17.07f, 25.56f, -29.57f, 28.76f);
        pathBuilder.curveToRelative(-12.08f, 3.09f, -26.72f, -7.56f, -39.77f, -7.56f);
        pathBuilder.reflectiveCurveToRelative(-27.69f, 10.65f, -39.77f, 7.56f);
        pathBuilder.curveToRelative(-12.5f, -3.2f, -18.53f, -22.69f, -29.57f, -28.76f);
        pathBuilder.curveTo(47.45f, 188.51f, 25.25f, 192.59f, 16.0f, 183.9f);
        pathBuilder.curveToRelative(0.0f, 0.0f, 56.0f, -20.0f, 56.0f, -103.93f);
        pathBuilder.arcToRelative(56.0f, 56.0f, 0.0f, false, true, 112.0f, 0.0f);
        pathBuilder.curveTo(184.0f, 163.86f, 240.0f, 183.9f, 240.0f, 183.9f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(247.83f, 182.28f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.13f, -5.9f);
        pathBuilder2.curveToRelative(-0.39f, -0.14f, -28.95f, -10.88f, -43.0f, -49.23f);
        pathBuilder2.lineToRelative(19.3f, -7.72f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, true, false, 213.0f, 104.57f);
        pathBuilder2.lineToRelative(-17.82f, 7.13f);
        pathBuilder2.arcTo(149.0f, 149.0f, 0.0f, false, true, 192.0f, 80.0f);
        pathBuilder2.arcTo(64.0f, 64.0f, 0.0f, false, false, 64.0f, 80.0f);
        pathBuilder2.arcToRelative(151.24f, 151.24f, 0.0f, false, true, -3.18f, 31.75f);
        pathBuilder2.lineTo(43.0f, 104.57f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, true, false, 37.0f, 119.43f);
        pathBuilder2.lineToRelative(19.37f, 7.75f);
        pathBuilder2.arcToRelative(94.0f, 94.0f, 0.0f, false, true, -17.74f, 30.2f);
        pathBuilder2.curveToRelative(-12.52f, 14.14f, -25.27f, 19.0f, -25.36f, 19.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.77f, 13.36f);
        pathBuilder2.curveToRelative(7.1f, 6.67f, 17.67f, 7.71f, 27.89f, 8.72f);
        pathBuilder2.curveToRelative(6.3f, 0.62f, 12.82f, 1.27f, 16.38f, 3.23f);
        pathBuilder2.curveToRelative(3.37f, 1.86f, 6.85f, 6.62f, 10.21f, 11.22f);
        pathBuilder2.curveToRelative(5.4f, 7.41f, 11.53f, 15.8f, 21.24f, 18.28f);
        pathBuilder2.curveToRelative(9.07f, 2.33f, 18.35f, -0.83f, 26.54f, -3.62f);
        pathBuilder2.curveToRelative(5.55f, -1.89f, 10.8f, -3.68f, 15.21f, -3.68f);
        pathBuilder2.reflectiveCurveToRelative(9.66f, 1.79f, 15.21f, 3.68f);
        pathBuilder2.curveToRelative(6.2f, 2.11f, 13.0f, 4.43f, 19.9f, 4.43f);
        pathBuilder2.arcToRelative(26.35f, 26.35f, 0.0f, false, false, 6.64f, -0.81f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(9.7f, -2.48f, 15.83f, -10.87f, 21.23f, -18.28f);
        pathBuilder2.curveToRelative(3.36f, -4.6f, 6.84f, -9.36f, 10.21f, -11.22f);
        pathBuilder2.curveToRelative(3.56f, -2.0f, 10.08f, -2.61f, 16.39f, -3.23f);
        pathBuilder2.curveToRelative(10.21f, -1.0f, 20.78f, -2.05f, 27.88f, -8.72f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 247.83f, 182.28f);
        pathBuilder2.close();
        pathBuilder2.moveTo(216.01f, 182.54f);
        pathBuilder2.curveToRelative(-7.91f, 0.78f, -16.08f, 1.59f, -22.53f, 5.13f);
        pathBuilder2.reflectiveCurveToRelative(-11.0f, 9.79f, -15.41f, 15.81f);
        pathBuilder2.curveToRelative(-4.0f, 5.48f, -8.15f, 11.16f, -12.28f, 12.21f);
        pathBuilder2.curveToRelative(-4.46f, 1.15f, -10.76f, -1.0f, -17.42f, -3.27f);
        pathBuilder2.reflectiveCurveToRelative(-13.31f, -4.53f, -20.37f, -4.53f);
        pathBuilder2.reflectiveCurveToRelative(-13.83f, 2.3f, -20.37f, 4.53f);
        pathBuilder2.reflectiveCurveToRelative(-13.0f, 4.42f, -17.42f, 3.27f);
        pathBuilder2.curveToRelative(-4.13f, -1.05f, -8.27f, -6.73f, -12.28f, -12.21f);
        pathBuilder2.curveToRelative(-4.39f, -6.0f, -8.93f, -12.24f, -15.41f, -15.81f);
        pathBuilder2.reflectiveCurveTo(47.9f, 183.32f, 40.0f, 182.54f);
        pathBuilder2.curveToRelative(-1.56f, -0.15f, -3.15f, -0.31f, -4.74f, -0.49f);
        pathBuilder2.arcToRelative(97.34f, 97.34f, 0.0f, false, false, 14.69f, -13.29f);
        pathBuilder2.curveToRelative(8.37f, -9.27f, 17.72f, -23.23f, 23.74f, -43.13f);
        pathBuilder2.lineToRelative(0.06f, -0.13f);
        pathBuilder2.arcToRelative(8.63f, 8.63f, 0.0f, false, false, 0.46f, -1.61f);
        pathBuilder2.arcTo(158.47f, 158.47f, 0.0f, false, false, 80.0f, 80.0f);
        pathBuilder2.arcToRelative(48.0f, 48.0f, 0.0f, false, true, 96.0f, 0.0f);
        pathBuilder2.arcToRelative(158.42f, 158.42f, 0.0f, false, false, 5.8f, 43.92f);
        pathBuilder2.arcToRelative(8.63f, 8.63f, 0.0f, false, false, 0.46f, 1.61f);
        pathBuilder2.lineToRelative(0.06f, 0.13f);
        pathBuilder2.curveToRelative(6.0f, 19.9f, 15.37f, 33.86f, 23.74f, 43.13f);
        pathBuilder2.arcToRelative(97.34f, 97.34f, 0.0f, false, false, 14.69f, 13.29f);
        pathBuilder2.curveTo(219.16f, 182.23f, 217.57f, 182.39f, 216.0f, 182.54f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _snapchatLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
