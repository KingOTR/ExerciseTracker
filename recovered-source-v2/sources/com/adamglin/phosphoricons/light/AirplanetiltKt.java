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

/* compiled from: Airplanetilt.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"AirplaneTilt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getAirplaneTilt", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_airplaneTilt", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AirplanetiltKt {
    private static ImageVector _airplaneTilt;

    public static final ImageVector getAirplaneTilt(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _airplaneTilt;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("AirplaneTilt", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(183.0f, 113.65f);
        pathBuilder.lineToRelative(30.1f, -28.32f);
        pathBuilder.lineToRelative(0.13f, -0.13f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, false, false, 170.8f, 42.77f);
        pathBuilder.lineToRelative(-0.13f, 0.13f);
        pathBuilder.lineTo(142.35f, 73.0f);
        pathBuilder.lineTo(58.05f, 42.35f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.29f, 1.39f);
        pathBuilder.lineToRelative(-24.0f, 24.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 28.67f, 77.0f);
        pathBuilder.lineToRelative(65.92f, 43.94f);
        pathBuilder.lineTo(77.52f, 138.0f);
        pathBuilder.lineTo(56.0f, 138.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.24f, 1.76f);
        pathBuilder.lineToRelative(-24.0f, 24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.0f, 9.82f);
        pathBuilder.lineToRelative(37.62f, 15.0f);
        pathBuilder.lineToRelative(15.0f, 37.56f);
        pathBuilder.lineToRelative(0.0f, 0.12f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 7.81f, 3.27f);
        pathBuilder.arcToRelative(5.94f, 5.94f, 0.0f, false, false, 2.07f, -1.41f);
        pathBuilder.lineToRelative(23.91f, -23.91f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 118.0f, 200.0f);
        pathBuilder.lineTo(118.0f, 178.48f);
        pathBuilder.lineToRelative(17.07f, -17.07f);
        pathBuilder.lineTo(179.0f, 227.33f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.23f, 0.91f);
        pathBuilder.lineToRelative(24.0f, -24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.39f, -6.29f);
        pathBuilder.close();
        pathBuilder.moveTo(184.94f, 214.58f);
        pathBuilder.lineTo(141.0f, 148.66f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.4f, -2.64f);
        pathBuilder.lineToRelative(-0.59f, 0.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.24f, 1.76f);
        pathBuilder.lineToRelative(-24.0f, 24.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 106.0f, 176.0f);
        pathBuilder.verticalLineToRelative(21.52f);
        pathBuilder.lineTo(90.2f, 213.32f);
        pathBuilder.lineTo(77.57f, 181.77f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.34f, -3.35f);
        pathBuilder.lineTo(42.68f, 165.8f);
        pathBuilder.lineTo(58.49f, 150.0f);
        pathBuilder.lineTo(80.0f, 150.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.25f, -1.76f);
        pathBuilder.lineToRelative(24.0f, -24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -0.92f, -9.23f);
        pathBuilder.lineTo(41.42f, 71.06f);
        pathBuilder.lineTo(57.54f, 54.93f);
        pathBuilder.lineTo(142.0f, 85.63f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.42f, -1.53f);
        pathBuilder.lineToRelative(31.0f, -32.9f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, true, 204.8f, 76.66f);
        pathBuilder.lineToRelative(-32.9f, 31.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -1.53f, 6.42f);
        pathBuilder.lineToRelative(30.7f, 84.41f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _airplaneTilt = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
