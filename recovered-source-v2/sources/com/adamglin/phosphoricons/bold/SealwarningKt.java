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

/* compiled from: Sealwarning.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SealWarning", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getSealWarning", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_sealWarning", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SealwarningKt {
    private static ImageVector _sealWarning;

    public static final ImageVector getSealWarning(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(228.75f, 100.05f);
        pathBuilder.curveToRelative(-3.52f, -3.67f, -7.15f, -7.46f, -8.34f, -10.33f);
        pathBuilder.curveToRelative(-1.06f, -2.56f, -1.14f, -7.83f, -1.21f, -12.47f);
        pathBuilder.curveToRelative(-0.15f, -10.0f, -0.34f, -22.44f, -9.18f, -31.27f);
        pathBuilder.reflectiveCurveToRelative(-21.27f, -9.0f, -31.27f, -9.18f);
        pathBuilder.curveToRelative(-4.64f, -0.07f, -9.91f, -0.15f, -12.47f, -1.21f);
        pathBuilder.curveToRelative(-2.87f, -1.19f, -6.66f, -4.82f, -10.33f, -8.34f);
        pathBuilder.curveTo(148.87f, 20.46f, 140.05f, 12.0f, 128.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(-20.87f, 8.46f, -27.95f, 15.25f);
        pathBuilder.curveToRelative(-3.67f, 3.52f, -7.46f, 7.15f, -10.33f, 8.34f);
        pathBuilder.curveToRelative(-2.56f, 1.06f, -7.83f, 1.14f, -12.47f, 1.21f);
        pathBuilder.curveTo(67.25f, 37.0f, 54.81f, 37.14f, 46.0f, 46.0f);
        pathBuilder.reflectiveCurveTo(37.0f, 67.25f, 36.8f, 77.25f);
        pathBuilder.curveToRelative(-0.07f, 4.64f, -0.15f, 9.91f, -1.21f, 12.47f);
        pathBuilder.curveToRelative(-1.19f, 2.87f, -4.82f, 6.66f, -8.34f, 10.33f);
        pathBuilder.curveTo(20.46f, 107.13f, 12.0f, 116.0f, 12.0f, 128.0f);
        pathBuilder.reflectiveCurveTo(20.46f, 148.87f, 27.25f, 156.0f);
        pathBuilder.curveToRelative(3.52f, 3.67f, 7.15f, 7.46f, 8.34f, 10.33f);
        pathBuilder.curveToRelative(1.06f, 2.56f, 1.14f, 7.83f, 1.21f, 12.47f);
        pathBuilder.curveToRelative(0.15f, 10.0f, 0.34f, 22.44f, 9.18f, 31.27f);
        pathBuilder.reflectiveCurveToRelative(21.27f, 9.0f, 31.27f, 9.18f);
        pathBuilder.curveToRelative(4.64f, 0.07f, 9.91f, 0.15f, 12.47f, 1.21f);
        pathBuilder.curveToRelative(2.87f, 1.19f, 6.66f, 4.82f, 10.33f, 8.34f);
        pathBuilder.curveTo(107.13f, 235.54f, 116.0f, 244.0f, 128.0f, 244.0f);
        pathBuilder.reflectiveCurveToRelative(20.87f, -8.46f, 27.95f, -15.25f);
        pathBuilder.curveToRelative(3.67f, -3.52f, 7.46f, -7.15f, 10.33f, -8.34f);
        pathBuilder.curveToRelative(2.56f, -1.06f, 7.83f, -1.14f, 12.47f, -1.21f);
        pathBuilder.curveToRelative(10.0f, -0.15f, 22.44f, -0.34f, 31.27f, -9.18f);
        pathBuilder.reflectiveCurveToRelative(9.0f, -21.27f, 9.18f, -31.27f);
        pathBuilder.curveToRelative(0.07f, -4.64f, 0.15f, -9.91f, 1.21f, -12.47f);
        pathBuilder.curveToRelative(1.19f, -2.87f, 4.82f, -6.66f, 8.34f, -10.33f);
        pathBuilder.curveTo(235.54f, 148.87f, 244.0f, 140.05f, 244.0f, 128.0f);
        pathBuilder.reflectiveCurveTo(235.54f, 107.13f, 228.75f, 100.05f);
        pathBuilder.close();
        pathBuilder.moveTo(211.43f, 139.34f);
        pathBuilder.curveToRelative(-4.82f, 5.0f, -10.28f, 10.72f, -13.19f, 17.76f);
        pathBuilder.curveToRelative(-2.82f, 6.8f, -2.93f, 14.16f, -3.0f, 21.29f);
        pathBuilder.curveToRelative(-0.08f, 5.36f, -0.19f, 12.71f, -2.15f, 14.66f);
        pathBuilder.reflectiveCurveToRelative(-9.3f, 2.07f, -14.66f, 2.15f);
        pathBuilder.curveToRelative(-7.13f, 0.11f, -14.49f, 0.22f, -21.29f, 3.0f);
        pathBuilder.curveToRelative(-7.0f, 2.91f, -12.73f, 8.37f, -17.76f, 13.19f);
        pathBuilder.curveTo(135.78f, 214.84f, 130.4f, 220.0f, 128.0f, 220.0f);
        pathBuilder.reflectiveCurveToRelative(-7.78f, -5.16f, -11.34f, -8.57f);
        pathBuilder.curveToRelative(-5.0f, -4.82f, -10.72f, -10.28f, -17.76f, -13.19f);
        pathBuilder.curveToRelative(-6.8f, -2.82f, -14.16f, -2.93f, -21.29f, -3.0f);
        pathBuilder.curveToRelative(-5.36f, -0.08f, -12.71f, -0.19f, -14.66f, -2.15f);
        pathBuilder.reflectiveCurveToRelative(-2.07f, -9.3f, -2.15f, -14.66f);
        pathBuilder.curveToRelative(-0.11f, -7.13f, -0.22f, -14.49f, -3.0f, -21.29f);
        pathBuilder.curveToRelative(-2.91f, -7.0f, -8.37f, -12.73f, -13.19f, -17.76f);
        pathBuilder.curveTo(41.16f, 135.78f, 36.0f, 130.4f, 36.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(5.16f, -7.78f, 8.57f, -11.34f);
        pathBuilder.curveToRelative(4.82f, -5.0f, 10.28f, -10.72f, 13.19f, -17.76f);
        pathBuilder.curveToRelative(2.82f, -6.8f, 2.93f, -14.16f, 3.0f, -21.29f);
        pathBuilder.curveTo(60.88f, 72.25f, 61.0f, 64.9f, 63.0f, 63.0f);
        pathBuilder.reflectiveCurveToRelative(9.3f, -2.07f, 14.66f, -2.15f);
        pathBuilder.curveToRelative(7.13f, -0.11f, 14.49f, -0.22f, 21.29f, -3.0f);
        pathBuilder.curveToRelative(7.0f, -2.91f, 12.73f, -8.37f, 17.76f, -13.19f);
        pathBuilder.curveTo(120.22f, 41.16f, 125.6f, 36.0f, 128.0f, 36.0f);
        pathBuilder.reflectiveCurveToRelative(7.78f, 5.16f, 11.34f, 8.57f);
        pathBuilder.curveToRelative(5.0f, 4.82f, 10.72f, 10.28f, 17.76f, 13.19f);
        pathBuilder.curveToRelative(6.8f, 2.82f, 14.16f, 2.93f, 21.29f, 3.0f);
        pathBuilder.curveToRelative(5.36f, 0.08f, 12.71f, 0.19f, 14.66f, 2.15f);
        pathBuilder.reflectiveCurveToRelative(2.07f, 9.3f, 2.15f, 14.66f);
        pathBuilder.curveToRelative(0.11f, 7.13f, 0.22f, 14.49f, 3.0f, 21.29f);
        pathBuilder.curveToRelative(2.91f, 7.0f, 8.37f, 12.73f, 13.19f, 17.76f);
        pathBuilder.curveToRelative(3.41f, 3.56f, 8.57f, 8.94f, 8.57f, 11.34f);
        pathBuilder.reflectiveCurveTo(214.84f, 135.78f, 211.43f, 139.34f);
        pathBuilder.close();
        pathBuilder.moveTo(116.0f, 132.0f);
        pathBuilder.lineTo(116.0f, 80.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(52.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(144.0f, 172.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 144.0f, 172.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _sealWarning = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
