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

/* compiled from: Sealwarning.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SealWarning", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getSealWarning", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_sealWarning", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SealwarningKt {
    private static ImageVector _sealWarning;

    public static final ImageVector getSealWarning(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _sealWarning;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("SealWarning", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(225.86f, 102.82f);
        pathBuilder.curveToRelative(-3.77f, -3.94f, -7.67f, -8.0f, -9.14f, -11.57f);
        pathBuilder.curveToRelative(-1.36f, -3.27f, -1.44f, -8.69f, -1.52f, -13.94f);
        pathBuilder.curveToRelative(-0.15f, -9.76f, -0.31f, -20.82f, -8.0f, -28.51f);
        pathBuilder.reflectiveCurveToRelative(-18.75f, -7.85f, -28.51f, -8.0f);
        pathBuilder.curveToRelative(-5.25f, -0.08f, -10.67f, -0.16f, -13.94f, -1.52f);
        pathBuilder.curveToRelative(-3.56f, -1.47f, -7.63f, -5.37f, -11.57f, -9.14f);
        pathBuilder.curveTo(146.28f, 23.51f, 138.44f, 16.0f, 128.0f, 16.0f);
        pathBuilder.reflectiveCurveToRelative(-18.27f, 7.51f, -25.18f, 14.14f);
        pathBuilder.curveToRelative(-3.94f, 3.77f, -8.0f, 7.67f, -11.57f, 9.14f);
        pathBuilder.curveTo(88.0f, 40.64f, 82.56f, 40.72f, 77.31f, 40.8f);
        pathBuilder.curveToRelative(-9.76f, 0.15f, -20.82f, 0.31f, -28.51f, 8.0f);
        pathBuilder.reflectiveCurveTo(41.0f, 67.55f, 40.8f, 77.31f);
        pathBuilder.curveToRelative(-0.08f, 5.25f, -0.16f, 10.67f, -1.52f, 13.94f);
        pathBuilder.curveToRelative(-1.47f, 3.56f, -5.37f, 7.63f, -9.14f, 11.57f);
        pathBuilder.curveTo(23.51f, 109.72f, 16.0f, 117.56f, 16.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(7.51f, 18.27f, 14.14f, 25.18f);
        pathBuilder.curveToRelative(3.77f, 3.94f, 7.67f, 8.0f, 9.14f, 11.57f);
        pathBuilder.curveToRelative(1.36f, 3.27f, 1.44f, 8.69f, 1.52f, 13.94f);
        pathBuilder.curveToRelative(0.15f, 9.76f, 0.31f, 20.82f, 8.0f, 28.51f);
        pathBuilder.reflectiveCurveToRelative(18.75f, 7.85f, 28.51f, 8.0f);
        pathBuilder.curveToRelative(5.25f, 0.08f, 10.67f, 0.16f, 13.94f, 1.52f);
        pathBuilder.curveToRelative(3.56f, 1.47f, 7.63f, 5.37f, 11.57f, 9.14f);
        pathBuilder.curveTo(109.72f, 232.49f, 117.56f, 240.0f, 128.0f, 240.0f);
        pathBuilder.reflectiveCurveToRelative(18.27f, -7.51f, 25.18f, -14.14f);
        pathBuilder.curveToRelative(3.94f, -3.77f, 8.0f, -7.67f, 11.57f, -9.14f);
        pathBuilder.curveToRelative(3.27f, -1.36f, 8.69f, -1.44f, 13.94f, -1.52f);
        pathBuilder.curveToRelative(9.76f, -0.15f, 20.82f, -0.31f, 28.51f, -8.0f);
        pathBuilder.reflectiveCurveToRelative(7.85f, -18.75f, 8.0f, -28.51f);
        pathBuilder.curveToRelative(0.08f, -5.25f, 0.16f, -10.67f, 1.52f, -13.94f);
        pathBuilder.curveToRelative(1.47f, -3.56f, 5.37f, -7.63f, 9.14f, -11.57f);
        pathBuilder.curveTo(232.49f, 146.28f, 240.0f, 138.44f, 240.0f, 128.0f);
        pathBuilder.reflectiveCurveTo(232.49f, 109.73f, 225.86f, 102.82f);
        pathBuilder.close();
        pathBuilder.moveTo(214.31f, 142.11f);
        pathBuilder.curveToRelative(-4.79f, 5.0f, -9.75f, 10.17f, -12.38f, 16.52f);
        pathBuilder.curveToRelative(-2.52f, 6.1f, -2.63f, 13.07f, -2.73f, 19.82f);
        pathBuilder.curveToRelative(-0.1f, 7.0f, -0.21f, 14.33f, -3.32f, 17.43f);
        pathBuilder.reflectiveCurveToRelative(-10.39f, 3.22f, -17.43f, 3.32f);
        pathBuilder.curveToRelative(-6.75f, 0.1f, -13.72f, 0.21f, -19.82f, 2.73f);
        pathBuilder.curveToRelative(-6.35f, 2.63f, -11.52f, 7.59f, -16.52f, 12.38f);
        pathBuilder.reflectiveCurveTo(132.0f, 224.0f, 128.0f, 224.0f);
        pathBuilder.reflectiveCurveToRelative(-9.15f, -4.92f, -14.11f, -9.69f);
        pathBuilder.reflectiveCurveToRelative(-10.17f, -9.75f, -16.52f, -12.38f);
        pathBuilder.curveToRelative(-6.1f, -2.52f, -13.07f, -2.63f, -19.82f, -2.73f);
        pathBuilder.curveToRelative(-7.0f, -0.1f, -14.33f, -0.21f, -17.43f, -3.32f);
        pathBuilder.reflectiveCurveToRelative(-3.22f, -10.39f, -3.32f, -17.43f);
        pathBuilder.curveToRelative(-0.1f, -6.75f, -0.21f, -13.72f, -2.73f, -19.82f);
        pathBuilder.curveToRelative(-2.63f, -6.35f, -7.59f, -11.52f, -12.38f, -16.52f);
        pathBuilder.reflectiveCurveTo(32.0f, 132.0f, 32.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(4.92f, -9.15f, 9.69f, -14.11f);
        pathBuilder.reflectiveCurveToRelative(9.75f, -10.17f, 12.38f, -16.52f);
        pathBuilder.curveToRelative(2.52f, -6.1f, 2.63f, -13.07f, 2.73f, -19.82f);
        pathBuilder.curveToRelative(0.1f, -7.0f, 0.21f, -14.33f, 3.32f, -17.43f);
        pathBuilder.reflectiveCurveTo(70.51f, 56.9f, 77.55f, 56.8f);
        pathBuilder.curveToRelative(6.75f, -0.1f, 13.72f, -0.21f, 19.82f, -2.73f);
        pathBuilder.curveToRelative(6.35f, -2.63f, 11.52f, -7.59f, 16.52f, -12.38f);
        pathBuilder.reflectiveCurveTo(124.0f, 32.0f, 128.0f, 32.0f);
        pathBuilder.reflectiveCurveToRelative(9.15f, 4.92f, 14.11f, 9.69f);
        pathBuilder.reflectiveCurveToRelative(10.17f, 9.75f, 16.52f, 12.38f);
        pathBuilder.curveToRelative(6.1f, 2.52f, 13.07f, 2.63f, 19.82f, 2.73f);
        pathBuilder.curveToRelative(7.0f, 0.1f, 14.33f, 0.21f, 17.43f, 3.32f);
        pathBuilder.reflectiveCurveToRelative(3.22f, 10.39f, 3.32f, 17.43f);
        pathBuilder.curveToRelative(0.1f, 6.75f, 0.21f, 13.72f, 2.73f, 19.82f);
        pathBuilder.curveToRelative(2.63f, 6.35f, 7.59f, 11.52f, 12.38f, 16.52f);
        pathBuilder.reflectiveCurveTo(224.0f, 124.0f, 224.0f, 128.0f);
        pathBuilder.reflectiveCurveTo(219.08f, 137.15f, 214.31f, 142.11f);
        pathBuilder.close();
        pathBuilder.moveTo(120.0f, 136.0f);
        pathBuilder.lineTo(120.0f, 80.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(140.0f, 172.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 140.0f, 172.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _sealWarning = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
