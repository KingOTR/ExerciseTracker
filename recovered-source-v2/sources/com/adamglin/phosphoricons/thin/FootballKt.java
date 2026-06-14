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

/* compiled from: Football.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Football", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getFootball", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_football", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FootballKt {
    private static ImageVector _football;

    public static final ImageVector getFootball(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _football;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Football", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(225.12f, 54.56f);
        pathBuilder.arcToRelative(28.94f, 28.94f, 0.0f, false, false, -23.68f, -23.68f);
        pathBuilder.curveToRelative(-31.61f, -5.36f, -91.16f, -7.83f, -134.78f, 35.78f);
        pathBuilder.reflectiveCurveTo(25.52f, 169.83f, 30.88f, 201.44f);
        pathBuilder.arcToRelative(28.94f, 28.94f, 0.0f, false, false, 23.68f, 23.68f);
        pathBuilder.arcTo(203.34f, 203.34f, 0.0f, false, false, 88.25f, 228.0f);
        pathBuilder.curveToRelative(31.3f, 0.0f, 70.19f, -7.77f, 101.09f, -38.66f);
        pathBuilder.curveTo(233.0f, 145.72f, 230.48f, 86.17f, 225.12f, 54.56f);
        pathBuilder.close();
        pathBuilder.moveTo(167.42f, 35.9f);
        pathBuilder.arcToRelative(196.29f, 196.29f, 0.0f, false, true, 32.69f, 2.86f);
        pathBuilder.arcToRelative(21.0f, 21.0f, 0.0f, false, true, 17.13f, 17.13f);
        pathBuilder.arcTo(185.26f, 185.26f, 0.0f, false, true, 219.56f, 102.0f);
        pathBuilder.lineTo(154.0f, 36.43f);
        pathBuilder.curveTo(158.33f, 36.09f, 162.79f, 35.9f, 167.42f, 35.9f);
        pathBuilder.close();
        pathBuilder.moveTo(55.89f, 217.24f);
        pathBuilder.arcToRelative(21.0f, 21.0f, 0.0f, false, true, -17.13f, -17.13f);
        pathBuilder.arcTo(185.26f, 185.26f, 0.0f, false, true, 36.44f, 154.0f);
        pathBuilder.lineTo(102.0f, 219.56f);
        pathBuilder.arcTo(185.26f, 185.26f, 0.0f, false, true, 55.89f, 217.24f);
        pathBuilder.close();
        pathBuilder.moveTo(183.68f, 183.68f);
        pathBuilder.curveToRelative(-12.22f, 12.23f, -35.23f, 29.34f, -71.56f, 34.73f);
        pathBuilder.lineTo(37.59f, 143.88f);
        pathBuilder.curveTo(43.0f, 107.55f, 60.09f, 84.54f, 72.32f, 72.32f);
        pathBuilder.reflectiveCurveTo(107.56f, 43.0f, 143.89f, 37.6f);
        pathBuilder.lineToRelative(74.52f, 74.52f);
        pathBuilder.curveTo(213.0f, 148.45f, 195.91f, 171.46f, 183.68f, 183.68f);
        pathBuilder.close();
        pathBuilder.moveTo(162.81f, 93.19f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.65f);
        pathBuilder.lineTo(145.65f, 116.0f);
        pathBuilder.lineToRelative(9.17f, 9.16f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 5.66f);
        pathBuilder.lineTo(140.0f, 121.66f);
        pathBuilder.lineTo(121.66f, 140.0f);
        pathBuilder.lineToRelative(9.17f, 9.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 5.66f);
        pathBuilder.lineTo(116.0f, 145.65f);
        pathBuilder.lineTo(98.84f, 162.81f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -5.65f, -5.65f);
        pathBuilder.lineTo(110.35f, 140.0f);
        pathBuilder.lineToRelative(-9.17f, -9.16f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.66f, -5.66f);
        pathBuilder.lineToRelative(9.17f, 9.17f);
        pathBuilder.lineTo(134.34f, 116.0f);
        pathBuilder.lineToRelative(-9.17f, -9.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.66f, -5.66f);
        pathBuilder.lineToRelative(9.16f, 9.17f);
        pathBuilder.lineToRelative(17.17f, -17.16f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 162.81f, 93.19f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _football = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
