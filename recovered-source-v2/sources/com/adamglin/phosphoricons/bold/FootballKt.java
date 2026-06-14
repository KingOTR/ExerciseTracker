package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Football.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Football", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getFootball", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_football", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FootballKt {
    private static ImageVector _football;

    public static final ImageVector getFootball(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(233.06f, 53.18f);
        pathBuilder.arcToRelative(37.0f, 37.0f, 0.0f, false, false, -30.24f, -30.24f);
        pathBuilder.curveToRelative(-15.24f, -2.58f, -38.75f, -4.78f, -64.26f, -0.61f);
        pathBuilder.curveTo(107.66f, 27.39f, 81.56f, 40.39f, 61.0f, 61.0f);
        pathBuilder.reflectiveCurveToRelative(-33.59f, 46.68f, -38.65f, 77.58f);
        pathBuilder.curveToRelative(-4.17f, 25.51f, -2.0f, 49.0f, 0.61f, 64.26f);
        pathBuilder.arcToRelative(37.0f, 37.0f, 0.0f, false, false, 30.24f, 30.24f);
        pathBuilder.arcTo(209.43f, 209.43f, 0.0f, false, false, 87.9f, 236.0f);
        pathBuilder.arcToRelative(184.13f, 184.13f, 0.0f, false, false, 29.54f, -2.33f);
        pathBuilder.curveToRelative(30.9f, -5.06f, 57.0f, -18.06f, 77.58f, -38.65f);
        pathBuilder.reflectiveCurveToRelative(33.59f, -46.68f, 38.65f, -77.58f);
        pathBuilder.curveTo(237.84f, 91.93f, 235.64f, 68.42f, 233.06f, 53.18f);
        pathBuilder.close();
        pathBuilder.moveTo(209.4f, 57.18f);
        pathBuilder.arcTo(192.0f, 192.0f, 0.0f, false, true, 212.0f, 83.06f);
        pathBuilder.lineTo(172.93f, 44.0f);
        pathBuilder.arcToRelative(190.57f, 190.57f, 0.0f, false, true, 25.88f, 2.64f);
        pathBuilder.arcTo(13.0f, 13.0f, 0.0f, false, true, 209.4f, 57.19f);
        pathBuilder.close();
        pathBuilder.moveTo(46.6f, 198.81f);
        pathBuilder.arcTo(191.79f, 191.79f, 0.0f, false, true, 44.0f, 172.94f);
        pathBuilder.lineTo(83.06f, 212.0f);
        pathBuilder.arcToRelative(191.79f, 191.79f, 0.0f, false, true, -25.87f, -2.63f);
        pathBuilder.arcTo(13.0f, 13.0f, 0.0f, false, true, 46.6f, 198.81f);
        pathBuilder.close();
        pathBuilder.moveTo(178.05f, 178.05f);
        pathBuilder.curveToRelative(-11.0f, 11.0f, -31.31f, 26.16f, -63.2f, 31.83f);
        pathBuilder.lineTo(46.12f, 141.15f);
        pathBuilder.curveTo(51.79f, 109.26f, 67.0f, 88.93f, 78.0f, 78.0f);
        pathBuilder.reflectiveCurveToRelative(31.3f, -26.16f, 63.2f, -31.83f);
        pathBuilder.lineToRelative(68.73f, 68.73f);
        pathBuilder.curveTo(204.21f, 146.74f, 189.0f, 167.07f, 178.05f, 178.05f);
        pathBuilder.close();
        pathBuilder.moveTo(164.49f, 108.48f);
        pathBuilder.lineTo(159.0f, 114.0f);
        pathBuilder.lineToRelative(5.52f, 5.51f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 17.0f);
        pathBuilder.lineTo(142.0f, 131.0f);
        pathBuilder.lineToRelative(-11.0f, 11.0f);
        pathBuilder.lineToRelative(5.52f, 5.52f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 17.0f);
        pathBuilder.lineTo(114.0f, 159.0f);
        pathBuilder.lineToRelative(-5.52f, 5.52f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f);
        pathBuilder.lineTo(97.0f, 142.0f);
        pathBuilder.lineToRelative(-5.52f, -5.51f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 17.0f, -17.0f);
        pathBuilder.lineTo(114.0f, 125.0f);
        pathBuilder.lineToRelative(11.0f, -11.0f);
        pathBuilder.lineToRelative(-5.52f, -5.52f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 17.0f, -17.0f);
        pathBuilder.lineTo(142.0f, 97.0f);
        pathBuilder.lineToRelative(5.52f, -5.52f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _football = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
