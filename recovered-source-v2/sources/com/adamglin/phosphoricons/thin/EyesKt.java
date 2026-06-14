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

/* compiled from: Eyes.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Eyes", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getEyes", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_eyes", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EyesKt {
    private static ImageVector _eyes;

    public static final ImageVector getEyes(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _eyes;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Eyes", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(213.45f, 63.86f);
        pathBuilder.curveTo(203.65f, 45.89f, 190.35f, 36.0f, 176.0f, 36.0f);
        pathBuilder.reflectiveCurveToRelative(-27.65f, 9.89f, -37.45f, 27.86f);
        pathBuilder.arcTo(113.91f, 113.91f, 0.0f, false, false, 128.0f, 92.31f);
        pathBuilder.arcToRelative(113.91f, 113.91f, 0.0f, false, false, -10.55f, -28.45f);
        pathBuilder.curveTo(107.65f, 45.89f, 94.35f, 36.0f, 80.0f, 36.0f);
        pathBuilder.reflectiveCurveTo(52.35f, 45.89f, 42.55f, 63.86f);
        pathBuilder.curveTo(33.17f, 81.06f, 28.0f, 103.84f, 28.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(5.17f, 46.94f, 14.55f, 64.14f);
        pathBuilder.curveTo(52.35f, 210.11f, 65.65f, 220.0f, 80.0f, 220.0f);
        pathBuilder.reflectiveCurveToRelative(27.65f, -9.89f, 37.45f, -27.86f);
        pathBuilder.arcTo(113.91f, 113.91f, 0.0f, false, false, 128.0f, 163.69f);
        pathBuilder.arcToRelative(113.91f, 113.91f, 0.0f, false, false, 10.55f, 28.45f);
        pathBuilder.curveToRelative(9.8f, 18.0f, 23.1f, 27.86f, 37.45f, 27.86f);
        pathBuilder.reflectiveCurveToRelative(27.65f, -9.89f, 37.45f, -27.86f);
        pathBuilder.curveToRelative(9.38f, -17.2f, 14.55f, -40.0f, 14.55f, -64.14f);
        pathBuilder.reflectiveCurveTo(222.83f, 81.06f, 213.45f, 63.86f);
        pathBuilder.close();
        pathBuilder.moveTo(110.45f, 188.31f);
        pathBuilder.curveTo(102.1f, 203.59f, 91.29f, 212.0f, 80.0f, 212.0f);
        pathBuilder.reflectiveCurveToRelative(-22.1f, -8.41f, -30.43f, -23.69f);
        pathBuilder.curveToRelative(-6.0f, -11.0f, -10.17f, -24.59f, -12.18f, -39.42f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, false, 0.0f, -41.78f);
        pathBuilder.curveToRelative(2.0f, -14.83f, 6.17f, -28.39f, 12.18f, -39.42f);
        pathBuilder.curveTo(57.9f, 52.41f, 68.71f, 44.0f, 80.0f, 44.0f);
        pathBuilder.reflectiveCurveToRelative(22.1f, 8.41f, 30.43f, 23.69f);
        pathBuilder.curveTo(119.18f, 83.73f, 124.0f, 105.15f, 124.0f, 128.0f);
        pathBuilder.reflectiveCurveTo(119.18f, 172.27f, 110.43f, 188.31f);
        pathBuilder.close();
        pathBuilder.moveTo(36.0f, 128.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, 20.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 36.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(206.43f, 188.31f);
        pathBuilder.curveTo(198.1f, 203.59f, 187.29f, 212.0f, 176.0f, 212.0f);
        pathBuilder.reflectiveCurveToRelative(-22.1f, -8.41f, -30.43f, -23.69f);
        pathBuilder.curveToRelative(-6.0f, -11.0f, -10.17f, -24.59f, -12.18f, -39.42f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, false, 0.0f, -41.78f);
        pathBuilder.curveToRelative(2.0f, -14.83f, 6.17f, -28.39f, 12.18f, -39.42f);
        pathBuilder.curveTo(153.9f, 52.41f, 164.71f, 44.0f, 176.0f, 44.0f);
        pathBuilder.reflectiveCurveToRelative(22.1f, 8.41f, 30.43f, 23.69f);
        pathBuilder.curveTo(215.18f, 83.73f, 220.0f, 105.15f, 220.0f, 128.0f);
        pathBuilder.reflectiveCurveTo(215.18f, 172.27f, 206.43f, 188.31f);
        pathBuilder.close();
        pathBuilder.moveTo(132.0f, 128.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, 20.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 132.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _eyes = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
