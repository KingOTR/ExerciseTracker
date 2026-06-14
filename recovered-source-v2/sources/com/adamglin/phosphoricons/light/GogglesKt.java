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

/* compiled from: Goggles.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Goggles", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getGoggles", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_goggles", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GogglesKt {
    private static ImageVector _goggles;

    public static final ImageVector getGoggles(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _goggles;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Goggles", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(254.0f, 136.0f);
        pathBuilder.arcToRelative(70.08f, 70.08f, 0.0f, false, false, -70.0f, -70.0f);
        pathBuilder.lineTo(72.0f, 66.0f);
        pathBuilder.arcTo(70.08f, 70.08f, 0.0f, false, false, 2.0f, 136.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, false, 16.68f, 21.35f);
        pathBuilder.curveToRelative(2.06f, 8.24f, 8.85f, 16.06f, 19.64f, 22.44f);
        pathBuilder.reflectiveCurveTo(61.87f, 190.0f, 72.0f, 190.0f);
        pathBuilder.arcToRelative(38.05f, 38.05f, 0.0f, false, false, 37.52f, -32.0f);
        pathBuilder.horizontalLineToRelative(37.0f);
        pathBuilder.arcTo(38.05f, 38.05f, 0.0f, false, false, 184.0f, 190.0f);
        pathBuilder.curveToRelative(10.13f, 0.0f, 23.0f, -3.91f, 33.68f, -10.21f);
        pathBuilder.reflectiveCurveToRelative(17.58f, -14.2f, 19.64f, -22.44f);
        pathBuilder.arcTo(22.0f, 22.0f, 0.0f, false, false, 254.0f, 136.0f);
        pathBuilder.close();
        pathBuilder.moveTo(44.43f, 169.46f);
        pathBuilder.curveTo(35.26f, 164.0f, 30.0f, 157.67f, 30.0f, 152.0f);
        pathBuilder.curveToRelative(0.0f, -6.64f, 6.77f, -13.19f, 15.45f, -18.06f);
        pathBuilder.lineToRelative(40.19f, 40.18f);
        pathBuilder.arcTo(25.81f, 25.81f, 0.0f, false, true, 72.0f, 178.0f);
        pathBuilder.curveTo(64.14f, 178.0f, 53.06f, 174.57f, 44.43f, 169.46f);
        pathBuilder.close();
        pathBuilder.moveTo(94.12f, 165.64f);
        pathBuilder.lineTo(57.24f, 128.75f);
        pathBuilder.arcTo(48.84f, 48.84f, 0.0f, false, true, 72.0f, 126.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, true, 22.12f, 39.64f);
        pathBuilder.close();
        pathBuilder.moveTo(158.0f, 152.0f);
        pathBuilder.arcToRelative(25.89f, 25.89f, 0.0f, false, true, 7.39f, -18.13f);
        pathBuilder.lineTo(204.55f, 173.0f);
        pathBuilder.curveToRelative(-7.07f, 3.07f, -14.63f, 5.0f, -20.55f, 5.0f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, true, 158.0f, 152.0f);
        pathBuilder.close();
        pathBuilder.moveTo(215.46f, 167.0f);
        pathBuilder.lineTo(175.81f, 127.36f);
        pathBuilder.arcTo(25.84f, 25.84f, 0.0f, false, true, 184.0f, 126.0f);
        pathBuilder.curveToRelative(7.86f, 0.0f, 18.94f, 3.43f, 27.57f, 8.54f);
        pathBuilder.curveTo(220.74f, 140.0f, 226.0f, 146.33f, 226.0f, 152.0f);
        pathBuilder.curveTo(226.0f, 157.32f, 221.65f, 162.58f, 215.46f, 167.0f);
        pathBuilder.close();
        pathBuilder.moveTo(236.77f, 144.82f);
        pathBuilder.curveToRelative(-2.57f, -7.56f, -9.12f, -14.68f, -19.09f, -20.58f);
        pathBuilder.curveTo(207.0f, 117.91f, 194.13f, 114.0f, 184.0f, 114.0f);
        pathBuilder.arcToRelative(38.05f, 38.05f, 0.0f, false, false, -37.52f, 32.0f);
        pathBuilder.horizontalLineToRelative(-37.0f);
        pathBuilder.arcTo(38.05f, 38.05f, 0.0f, false, false, 72.0f, 114.0f);
        pathBuilder.curveToRelative(-10.13f, 0.0f, -23.0f, 3.91f, -33.68f, 10.21f);
        pathBuilder.curveToRelative(-10.0f, 5.9f, -16.52f, 13.0f, -19.09f, 20.58f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 14.0f, 136.0f);
        pathBuilder.arcTo(58.07f, 58.07f, 0.0f, false, true, 72.0f, 78.0f);
        pathBuilder.lineTo(184.0f, 78.0f);
        pathBuilder.arcToRelative(58.07f, 58.07f, 0.0f, false, true, 58.0f, 58.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 236.77f, 144.79f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _goggles = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
