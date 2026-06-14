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

/* compiled from: Airplanetilt.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"AirplaneTilt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getAirplaneTilt", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_airplaneTilt", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AirplanetiltKt {
    private static ImageVector _airplaneTilt;

    public static final ImageVector getAirplaneTilt(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(215.52f, 197.26f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.86f, 8.39f);
        pathBuilder.lineToRelative(-24.0f, 24.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 184.0f, 232.0f);
        pathBuilder.arcToRelative(7.09f, 7.09f, 0.0f, false, true, -0.79f, 0.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.87f, -3.52f);
        pathBuilder.lineToRelative(-44.07f, -66.12f);
        pathBuilder.lineTo(112.0f, 183.59f);
        pathBuilder.verticalLineTo(208.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.34f, 5.65f);
        pathBuilder.reflectiveCurveToRelative(-14.0f, 14.06f, -15.88f, 15.88f);
        pathBuilder.arcTo(7.91f, 7.91f, 0.0f, false, true, 91.0f, 231.41f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.41f, -4.35f);
        pathBuilder.lineToRelative(-0.06f, -0.15f);
        pathBuilder.lineToRelative(-14.7f, -36.76f);
        pathBuilder.lineTo(29.0f, 175.42f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.69f, -13.08f);
        pathBuilder.lineToRelative(16.0f, -16.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 48.0f, 144.0f);
        pathBuilder.horizontalLineTo(72.4f);
        pathBuilder.lineToRelative(21.27f, -21.27f);
        pathBuilder.lineTo(27.56f, 78.65f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.22f, -12.32f);
        pathBuilder.lineToRelative(24.0f, -24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.39f, -1.86f);
        pathBuilder.lineToRelative(85.94f, 31.25f);
        pathBuilder.lineTo(176.2f, 40.19f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 39.6f, 39.6f);
        pathBuilder.lineToRelative(-31.53f, 31.53f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _airplaneTilt = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
