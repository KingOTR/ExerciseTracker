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

/* compiled from: Globehemisphereeast.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GlobeHemisphereEast", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getGlobeHemisphereEast", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_globeHemisphereEast", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GlobehemisphereeastKt {
    private static ImageVector _globeHemisphereEast;

    public static final ImageVector getGlobeHemisphereEast(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _globeHemisphereEast;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("GlobeHemisphereEast", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 26.0f);
        pathBuilder.arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f);
        pathBuilder.arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 38.0f);
        pathBuilder.arcToRelative(89.53f, 89.53f, 0.0f, false, true, 50.0f, 15.2f);
        pathBuilder.lineTo(178.0f, 74.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.48f, 1.31f);
        pathBuilder.lineTo(155.35f, 101.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.25f, 0.68f);
        pathBuilder.lineTo(122.63f, 106.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.44f, -0.36f);
        pathBuilder.lineToRelative(-0.24f, -0.16f);
        pathBuilder.lineToRelative(-19.7f, -12.89f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.71f, 3.64f);
        pathBuilder.lineToRelative(-21.0f, 31.3f);
        pathBuilder.arcToRelative(13.94f, 13.94f, 0.0f, false, false, -2.36f, 7.71f);
        pathBuilder.lineTo(58.0f, 171.45f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.9f, 1.66f);
        pathBuilder.lineToRelative(-5.0f, 3.27f);
        pathBuilder.arcTo(90.0f, 90.0f, 0.0f, false, true, 128.0f, 38.0f);
        pathBuilder.close();
        pathBuilder.moveTo(59.28f, 186.05f);
        pathBuilder.lineToRelative(4.43f, -2.9f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 70.0f, 171.52f);
        pathBuilder.lineToRelative(0.21f, -36.23f);
        pathBuilder.arcToRelative(2.05f, 2.05f, 0.0f, false, true, 0.33f, -1.1f);
        pathBuilder.lineToRelative(21.0f, -31.3f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.31f, -0.86f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.52f, 0.35f);
        pathBuilder.lineToRelative(0.24f, 0.16f);
        pathBuilder.lineToRelative(19.7f, 12.89f);
        pathBuilder.arcToRelative(13.93f, 13.93f, 0.0f, false, false, 10.0f, 2.44f);
        pathBuilder.lineToRelative(31.47f, -4.26f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 8.73f, -4.74f);
        pathBuilder.lineToRelative(22.17f, -25.76f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 190.0f, 74.0f);
        pathBuilder.lineTo(190.0f, 62.82f);
        pathBuilder.arcToRelative(89.91f, 89.91f, 0.0f, false, true, 22.68f, 95.67f);
        pathBuilder.lineToRelative(-18.4f, -16.82f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.82f, -2.6f);
        pathBuilder.lineTo(149.0f, 151.73f);
        pathBuilder.arcToRelative(14.11f, 14.11f, 0.0f, false, false, -8.48f, 10.89f);
        pathBuilder.lineToRelative(-2.38f, 16.19f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 10.3f, 15.58f);
        pathBuilder.lineTo(169.9f, 200.0f);
        pathBuilder.arcToRelative(2.09f, 2.09f, 0.0f, false, true, 0.91f, 0.53f);
        pathBuilder.lineToRelative(4.18f, 4.18f);
        pathBuilder.arcTo(89.86f, 89.86f, 0.0f, false, true, 59.28f, 186.05f);
        pathBuilder.close();
        pathBuilder.moveTo(184.9f, 197.68f);
        pathBuilder.lineToRelative(-5.59f, -5.61f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -6.36f, -3.65f);
        pathBuilder.lineToRelative(-21.46f, -5.63f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.47f, -2.23f);
        pathBuilder.lineToRelative(2.39f, -16.19f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.21f, -1.56f);
        pathBuilder.lineToRelative(30.45f, -12.66f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.12f, 0.37f);
        pathBuilder.lineToRelative(21.36f, 19.54f);
        pathBuilder.arcTo(90.79f, 90.79f, 0.0f, false, true, 184.9f, 197.68f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _globeHemisphereEast = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
