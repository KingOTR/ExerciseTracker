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

/* compiled from: Airplanetakeoff.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"AirplaneTakeoff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getAirplaneTakeoff", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_airplaneTakeoff", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AirplanetakeoffKt {
    private static ImageVector _airplaneTakeoff;

    public static final ImageVector getAirplaneTakeoff(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _airplaneTakeoff;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("AirplaneTakeoff", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(174.0f, 216.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f);
        pathBuilder.horizontalLineTo(24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.horizontalLineTo(168.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 174.0f, 216.0f);
        pathBuilder.close();
        pathBuilder.moveTo(245.9f, 92.78f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -2.82f, 4.0f);
        pathBuilder.lineToRelative(-147.41f, 88.0f);
        pathBuilder.arcToRelative(38.22f, 38.22f, 0.0f, false, true, -19.23f, 5.23f);
        pathBuilder.arcToRelative(37.8f, 37.8f, 0.0f, false, true, -25.92f, -10.33f);
        pathBuilder.lineToRelative(-0.1f, -0.09f);
        pathBuilder.lineTo(14.37f, 144.36f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, 4.0f, -23.0f);
        pathBuilder.lineToRelative(3.0f, -1.49f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.56f, -0.29f);
        pathBuilder.lineToRelative(29.15f, 9.83f);
        pathBuilder.lineToRelative(23.17f, -14.0f);
        pathBuilder.lineToRelative(-23.7f, -23.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, 4.0f, -23.18f);
        pathBuilder.lineToRelative(0.24f, -0.1f);
        pathBuilder.lineToRelative(7.15f, -2.71f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.19f, 0.0f);
        pathBuilder.lineToRelative(54.84f, 20.18f);
        pathBuilder.lineToRelative(52.38f, -31.27f);
        pathBuilder.arcTo(37.81f, 37.81f, 0.0f, false, true, 226.0f, 64.0f);
        pathBuilder.lineToRelative(0.09f, 0.11f);
        pathBuilder.lineTo(244.73f, 88.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 245.9f, 92.78f);
        pathBuilder.close();
        pathBuilder.moveTo(231.09f, 90.0f);
        pathBuilder.lineTo(216.67f, 71.53f);
        pathBuilder.arcToRelative(25.86f, 25.86f, 0.0f, false, false, -33.26f, -5.89f);
        pathBuilder.lineTo(128.6f, 98.36f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.15f, 0.48f);
        pathBuilder.lineTo(68.0f, 78.45f);
        pathBuilder.lineToRelative(-4.9f, 1.85f);
        pathBuilder.arcTo(1.91f, 1.91f, 0.0f, false, false, 62.0f, 81.77f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.63f, 1.82f);
        pathBuilder.lineToRelative(0.17f, 0.15f);
        pathBuilder.lineToRelative(29.35f, 28.49f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -1.07f, 9.44f);
        pathBuilder.lineTo(58.89f, 141.16f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.0f, 0.55f);
        pathBuilder.lineToRelative(-29.45f, -9.94f);
        pathBuilder.lineToRelative(-0.93f, 0.46f);
        pathBuilder.lineToRelative(-0.28f, 0.13f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.58f, 3.29f);
        pathBuilder.lineToRelative(0.1f, 0.09f);
        pathBuilder.lineToRelative(36.0f, 35.28f);
        pathBuilder.arcToRelative(25.84f, 25.84f, 0.0f, false, false, 30.81f, 3.47f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _airplaneTakeoff = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
