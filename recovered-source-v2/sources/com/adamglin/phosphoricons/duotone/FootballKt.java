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

/* compiled from: Football.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Football", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getFootball", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_football", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FootballKt {
    private static ImageVector _football;

    public static final ImageVector getFootball(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(222.5f, 110.56f);
        pathBuilder.curveToRelative(-3.32f, 25.23f, -13.0f, 53.0f, -36.0f, 75.95f);
        pathBuilder.reflectiveCurveToRelative(-50.72f, 32.67f, -75.95f, 36.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineTo(33.5f, 145.44f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(3.32f, -25.23f, 13.0f, -53.0f, 36.0f, -75.95f);
        pathBuilder.reflectiveCurveToRelative(50.72f, -32.67f, 76.0f, -36.0f);
        pathBuilder.lineToRelative(77.06f, 77.06f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(229.06f, 53.89f);
        pathBuilder2.arcToRelative(32.92f, 32.92f, 0.0f, false, false, -26.95f, -26.95f);
        pathBuilder2.curveToRelative(-32.37f, -5.49f, -93.39f, -8.0f, -138.27f, 36.9f);
        pathBuilder2.reflectiveCurveToRelative(-42.39f, 105.9f, -36.9f, 138.27f);
        pathBuilder2.arcToRelative(32.92f, 32.92f, 0.0f, false, false, 27.0f, 26.95f);
        pathBuilder2.arcTo(206.58f, 206.58f, 0.0f, false, false, 88.27f, 232.0f);
        pathBuilder2.curveToRelative(32.09f, 0.0f, 72.05f, -8.0f, 103.89f, -39.84f);
        pathBuilder2.curveTo(237.05f, 147.28f, 234.55f, 86.26f, 229.06f, 53.89f);
        pathBuilder2.close();
        pathBuilder2.moveTo(167.45f, 39.89f);
        pathBuilder2.arcToRelative(192.0f, 192.0f, 0.0f, false, true, 32.0f, 2.8f);
        pathBuilder2.arcTo(16.94f, 16.94f, 0.0f, false, true, 213.3f, 56.56f);
        pathBuilder2.arcTo(188.59f, 188.59f, 0.0f, false, true, 216.0f, 92.78f);
        pathBuilder2.lineTo(163.21f, 40.0f);
        pathBuilder2.curveTo(164.61f, 39.92f, 166.0f, 39.9f, 167.45f, 39.9f);
        pathBuilder2.close();
        pathBuilder2.moveTo(56.56f, 213.3f);
        pathBuilder2.arcTo(16.94f, 16.94f, 0.0f, false, true, 42.7f, 199.44f);
        pathBuilder2.arcTo(188.59f, 188.59f, 0.0f, false, true, 40.0f, 163.22f);
        pathBuilder2.lineTo(92.78f, 216.0f);
        pathBuilder2.arcTo(187.79f, 187.79f, 0.0f, false, true, 56.56f, 213.3f);
        pathBuilder2.close();
        pathBuilder2.moveTo(180.86f, 180.86f);
        pathBuilder2.curveToRelative(-11.61f, 11.6f, -33.27f, 27.73f, -67.37f, 33.27f);
        pathBuilder2.lineTo(41.87f, 142.51f);
        pathBuilder2.curveToRelative(5.54f, -34.1f, 21.67f, -55.76f, 33.27f, -67.37f);
        pathBuilder2.reflectiveCurveTo(108.4f, 47.4f, 142.5f, 41.86f);
        pathBuilder2.lineToRelative(71.63f, 71.63f);
        pathBuilder2.curveTo(208.59f, 147.59f, 192.46f, 169.25f, 180.86f, 180.86f);
        pathBuilder2.close();
        pathBuilder2.moveTo(165.64f, 90.36f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.31f);
        pathBuilder2.lineTo(151.3f, 116.0f);
        pathBuilder2.lineToRelative(6.34f, 6.34f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.31f, 11.3f);
        pathBuilder2.lineTo(140.0f, 127.31f);
        pathBuilder2.lineTo(127.31f, 140.0f);
        pathBuilder2.lineToRelative(6.34f, 6.34f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.3f, 11.31f);
        pathBuilder2.lineTo(116.0f, 151.3f);
        pathBuilder2.lineToRelative(-14.34f, 14.34f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.31f, -11.31f);
        pathBuilder2.lineTo(104.7f, 140.0f);
        pathBuilder2.lineToRelative(-6.34f, -6.34f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.31f, -11.3f);
        pathBuilder2.lineToRelative(6.34f, 6.34f);
        pathBuilder2.lineTo(128.69f, 116.0f);
        pathBuilder2.lineToRelative(-6.34f, -6.34f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.3f, -11.31f);
        pathBuilder2.lineTo(140.0f, 104.7f);
        pathBuilder2.lineToRelative(14.34f, -14.34f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 165.64f, 90.36f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _football = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
