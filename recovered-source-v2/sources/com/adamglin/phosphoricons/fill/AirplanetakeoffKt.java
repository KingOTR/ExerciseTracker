package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Airplanetakeoff.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"AirplaneTakeoff", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getAirplaneTakeoff", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_airplaneTakeoff", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AirplanetakeoffKt {
    private static ImageVector _airplaneTakeoff;

    public static final ImageVector getAirplaneTakeoff(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(176.0f, 216.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.horizontalLineTo(24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder.horizontalLineTo(168.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 176.0f, 216.0f);
        pathBuilder.close();
        pathBuilder.moveTo(246.31f, 86.76f);
        pathBuilder.lineTo(227.67f, 62.87f);
        pathBuilder.lineToRelative(-0.12f, -0.15f);
        pathBuilder.arcToRelative(39.82f, 39.82f, 0.0f, false, false, -51.28f, -9.12f);
        pathBuilder.lineTo(124.7f, 84.38f);
        pathBuilder.lineTo(70.76f, 64.54f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.59f, 0.0f);
        pathBuilder.lineTo(58.0f, 67.27f);
        pathBuilder.lineToRelative(-0.32f, 0.13f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -4.53f, 26.47f);
        pathBuilder.lineTo(75.0f, 115.06f);
        pathBuilder.lineToRelative(-20.17f, 12.2f);
        pathBuilder.lineToRelative(-28.26f, -9.54f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.08f, 0.4f);
        pathBuilder.lineToRelative(-3.0f, 1.47f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 13.0f, 145.8f);
        pathBuilder.lineToRelative(36.0f, 35.27f);
        pathBuilder.lineToRelative(0.12f, 0.12f);
        pathBuilder.arcToRelative(39.78f, 39.78f, 0.0f, false, false, 27.28f, 10.87f);
        pathBuilder.arcToRelative(40.18f, 40.18f, 0.0f, false, false, 20.26f, -5.52f);
        pathBuilder.lineToRelative(147.41f, -88.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.21f, -11.78f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _airplaneTakeoff = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
