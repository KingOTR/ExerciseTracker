package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Airplanetilt.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"AirplaneTilt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getAirplaneTilt", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_airplaneTilt", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AirplanetiltKt {
    private static ImageVector _airplaneTilt;

    public static final ImageVector getAirplaneTilt(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(209.0f, 81.0f);
        pathBuilder.lineToRelative(-33.0f, 31.0f);
        pathBuilder.lineToRelative(32.0f, 88.0f);
        pathBuilder.lineToRelative(-24.0f, 24.0f);
        pathBuilder.lineToRelative(-48.0f, -72.0f);
        pathBuilder.lineToRelative(-24.0f, 24.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.lineTo(88.0f, 224.0f);
        pathBuilder.lineTo(72.0f, 184.0f);
        pathBuilder.lineTo(32.0f, 168.0f);
        pathBuilder.lineToRelative(24.0f, -24.0f);
        pathBuilder.horizontalLineTo(80.0f);
        pathBuilder.lineToRelative(24.0f, -24.0f);
        pathBuilder.lineTo(32.0f, 72.0f);
        pathBuilder.lineTo(56.0f, 48.0f);
        pathBuilder.lineToRelative(88.0f, 32.0f);
        pathBuilder.lineToRelative(31.0f, -33.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 209.0f, 81.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(185.33f, 114.21f);
        pathBuilder2.lineToRelative(29.14f, -27.43f);
        pathBuilder2.lineToRelative(0.17f, -0.16f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, false, false, -45.26f, -45.26f);
        pathBuilder2.lineToRelative(-0.16f, 0.17f);
        pathBuilder2.lineTo(141.79f, 70.67f);
        pathBuilder2.lineToRelative(-83.0f, -30.2f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.39f, 1.86f);
        pathBuilder2.lineToRelative(-24.0f, 24.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.22f, 12.31f);
        pathBuilder2.lineToRelative(63.89f, 42.59f);
        pathBuilder2.lineTo(76.69f, 136.0f);
        pathBuilder2.lineTo(56.0f, 136.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.65f, 2.34f);
        pathBuilder2.lineToRelative(-24.0f, 24.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 29.0f, 175.42f);
        pathBuilder2.lineToRelative(36.82f, 14.73f);
        pathBuilder2.lineToRelative(14.7f, 36.75f);
        pathBuilder2.lineToRelative(0.06f, 0.16f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.18f, 2.47f);
        pathBuilder2.lineToRelative(23.87f, -23.88f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 120.0f, 200.0f);
        pathBuilder2.lineTo(120.0f, 179.31f);
        pathBuilder2.lineToRelative(14.76f, -14.76f);
        pathBuilder2.lineToRelative(42.59f, 63.89f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.31f, 1.22f);
        pathBuilder2.lineToRelative(24.0f, -24.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.86f, -8.39f);
        pathBuilder2.close();
        pathBuilder2.moveTo(185.26f, 211.44f);
        pathBuilder2.lineTo(142.67f, 147.55f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 136.8f, 144.0f);
        pathBuilder2.arcToRelative(7.09f, 7.09f, 0.0f, false, false, -0.79f, 0.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.66f, 2.34f);
        pathBuilder2.lineToRelative(-24.0f, 24.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 176.0f);
        pathBuilder2.verticalLineToRelative(20.69f);
        pathBuilder2.lineTo(90.93f, 209.76f);
        pathBuilder2.lineTo(79.43f, 181.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 75.0f, 176.57f);
        pathBuilder2.lineToRelative(-28.74f, -11.5f);
        pathBuilder2.lineTo(59.32f, 152.0f);
        pathBuilder2.lineTo(80.0f, 152.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.66f, -2.34f);
        pathBuilder2.lineToRelative(24.0f, -24.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -1.22f, -12.32f);
        pathBuilder2.lineTo(44.56f, 70.74f);
        pathBuilder2.lineToRelative(13.5f, -13.49f);
        pathBuilder2.lineToRelative(83.22f, 30.26f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.56f, -2.0f);
        pathBuilder2.lineToRelative(30.94f, -32.88f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, true, 203.4f, 75.22f);
        pathBuilder2.lineToRelative(-32.87f, 30.94f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.0f, 8.56f);
        pathBuilder2.lineToRelative(30.26f, 83.22f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _airplaneTilt = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
