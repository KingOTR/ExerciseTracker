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

/* compiled from: Snapchatlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SnapchatLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getSnapchatLogo", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_snapchatLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SnapchatlogoKt {
    private static ImageVector _snapchatLogo;

    public static final ImageVector getSnapchatLogo(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(243.92f, 183.1f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.56f, -3.0f);
        pathBuilder.curveToRelative(-0.13f, 0.0f, -13.52f, -5.0f, -26.69f, -19.76f);
        pathBuilder.arcToRelative(99.18f, 99.18f, 0.0f, false, true, -20.0f, -35.54f);
        pathBuilder.lineToRelative(22.83f, -9.13f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -3.0f, -7.42f);
        pathBuilder.lineToRelative(-22.08f, 8.83f);
        pathBuilder.arcTo(149.77f, 149.77f, 0.0f, false, true, 188.0f, 80.0f);
        pathBuilder.arcTo(60.0f, 60.0f, 0.0f, false, false, 68.0f, 80.0f);
        pathBuilder.arcToRelative(150.25f, 150.25f, 0.0f, false, true, -4.43f, 37.15f);
        pathBuilder.lineToRelative(-22.08f, -8.83f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -3.0f, 7.42f);
        pathBuilder.lineToRelative(22.82f, 9.13f);
        pathBuilder.arcToRelative(99.16f, 99.16f, 0.0f, false, true, -20.0f, 35.54f);
        pathBuilder.curveToRelative(-13.18f, 14.73f, -26.56f, 19.71f, -26.69f, 19.76f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.39f, 6.68f);
        pathBuilder.curveToRelative(6.12f, 5.73f, 16.0f, 6.71f, 25.55f, 7.65f);
        pathBuilder.curveToRelative(6.7f, 0.67f, 13.64f, 1.35f, 17.92f, 3.71f);
        pathBuilder.reflectiveCurveToRelative(7.73f, 7.18f, 11.51f, 12.36f);
        pathBuilder.curveToRelative(5.25f, 7.2f, 10.69f, 14.65f, 19.0f, 16.77f);
        pathBuilder.curveToRelative(7.92f, 2.0f, 16.23f, -0.8f, 24.26f, -3.54f);
        pathBuilder.curveToRelative(5.88f, -2.0f, 11.43f, -3.89f, 16.5f, -3.89f);
        pathBuilder.reflectiveCurveToRelative(10.63f, 1.89f, 16.5f, 3.89f);
        pathBuilder.curveToRelative(6.13f, 2.09f, 12.42f, 4.23f, 18.57f, 4.23f);
        pathBuilder.arcToRelative(22.92f, 22.92f, 0.0f, false, false, 5.7f, -0.69f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(8.31f, -2.12f, 13.74f, -9.57f, 19.0f, -16.77f);
        pathBuilder.curveToRelative(3.79f, -5.18f, 7.36f, -10.08f, 11.51f, -12.36f);
        pathBuilder.reflectiveCurveToRelative(11.22f, -3.0f, 17.93f, -3.71f);
        pathBuilder.curveToRelative(9.55f, -0.94f, 19.43f, -1.92f, 25.54f, -7.65f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 243.92f, 183.1f);
        pathBuilder.close();
        pathBuilder.moveTo(216.41f, 186.51f);
        pathBuilder.curveToRelative(-7.51f, 0.75f, -15.27f, 1.51f, -21.0f, 4.66f);
        pathBuilder.reflectiveCurveToRelative(-10.0f, 9.0f, -14.12f, 14.66f);
        pathBuilder.curveToRelative(-4.62f, 6.33f, -9.0f, 12.32f, -14.51f, 13.73f);
        pathBuilder.reflectiveCurveToRelative(-12.46f, -0.89f, -19.71f, -3.36f);
        pathBuilder.curveToRelative(-6.23f, -2.12f, -12.68f, -4.32f, -19.08f, -4.32f);
        pathBuilder.reflectiveCurveToRelative(-12.84f, 2.2f, -19.08f, 4.32f);
        pathBuilder.curveToRelative(-7.24f, 2.47f, -14.09f, 4.8f, -19.7f, 3.36f);
        pathBuilder.reflectiveCurveToRelative(-9.89f, -7.4f, -14.52f, -13.73f);
        pathBuilder.curveToRelative(-4.13f, -5.66f, -8.41f, -11.52f, -14.11f, -14.66f);
        pathBuilder.reflectiveCurveToRelative(-13.49f, -3.91f, -21.0f, -4.66f);
        pathBuilder.curveToRelative(-5.26f, -0.52f, -10.63f, -1.0f, -14.91f, -2.37f);
        pathBuilder.arcTo(90.17f, 90.17f, 0.0f, false, false, 47.0f, 166.08f);
        pathBuilder.curveToRelative(8.1f, -9.0f, 17.14f, -22.5f, 23.0f, -41.85f);
        pathBuilder.arcTo(1.51f, 1.51f, 0.0f, false, false, 70.0f, 124.0f);
        pathBuilder.arcToRelative(3.8f, 3.8f, 0.0f, false, false, 0.23f, -0.91f);
        pathBuilder.arcTo(154.12f, 154.12f, 0.0f, false, false, 76.0f, 80.0f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, false, true, 104.0f, 0.0f);
        pathBuilder.arcToRelative(154.12f, 154.12f, 0.0f, false, false, 5.74f, 43.13f);
        pathBuilder.arcToRelative(3.41f, 3.41f, 0.0f, false, false, 0.24f, 0.91f);
        pathBuilder.curveToRelative(0.0f, 0.08f, 0.07f, 0.14f, 0.1f, 0.22f);
        pathBuilder.curveToRelative(5.81f, 19.35f, 14.86f, 32.88f, 23.0f, 41.85f);
        pathBuilder.arcToRelative(90.16f, 90.16f, 0.0f, false, false, 22.27f, 18.06f);
        pathBuilder.curveTo(227.0f, 185.46f, 221.67f, 186.0f, 216.41f, 186.51f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _snapchatLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
