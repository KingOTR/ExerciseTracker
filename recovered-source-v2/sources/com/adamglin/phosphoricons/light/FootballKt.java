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

/* compiled from: Football.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Football", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getFootball", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_football", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FootballKt {
    private static ImageVector _football;

    public static final ImageVector getFootball(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(227.09f, 54.22f);
        pathBuilder.arcToRelative(30.92f, 30.92f, 0.0f, false, false, -25.31f, -25.31f);
        pathBuilder.curveToRelative(-32.0f, -5.42f, -92.28f, -7.91f, -136.53f, 36.34f);
        pathBuilder.reflectiveCurveTo(23.49f, 169.78f, 28.91f, 201.78f);
        pathBuilder.arcToRelative(30.92f, 30.92f, 0.0f, false, false, 25.31f, 25.31f);
        pathBuilder.arcToRelative(205.0f, 205.0f, 0.0f, false, false, 34.0f, 2.91f);
        pathBuilder.curveToRelative(31.69f, 0.0f, 71.12f, -7.88f, 102.49f, -39.25f);
        pathBuilder.curveTo(235.0f, 146.5f, 232.51f, 86.22f, 227.09f, 54.22f);
        pathBuilder.close();
        pathBuilder.moveTo(167.44f, 37.9f);
        pathBuilder.arcToRelative(194.0f, 194.0f, 0.0f, false, true, 32.33f, 2.83f);
        pathBuilder.arcToRelative(18.93f, 18.93f, 0.0f, false, true, 15.5f, 15.5f);
        pathBuilder.arcToRelative(187.0f, 187.0f, 0.0f, false, true, 2.6f, 41.21f);
        pathBuilder.lineToRelative(-59.31f, -59.3f);
        pathBuilder.curveTo(161.45f, 38.0f, 164.4f, 37.9f, 167.44f, 37.9f);
        pathBuilder.close();
        pathBuilder.moveTo(56.23f, 215.27f);
        pathBuilder.arcToRelative(18.93f, 18.93f, 0.0f, false, true, -15.5f, -15.5f);
        pathBuilder.arcToRelative(187.0f, 187.0f, 0.0f, false, true, -2.6f, -41.21f);
        pathBuilder.lineToRelative(59.31f, 59.31f);
        pathBuilder.arcTo(187.0f, 187.0f, 0.0f, false, true, 56.23f, 215.27f);
        pathBuilder.close();
        pathBuilder.moveTo(182.23f, 182.27f);
        pathBuilder.curveToRelative(-11.92f, 11.91f, -34.24f, 28.54f, -69.46f, 34.0f);
        pathBuilder.lineTo(39.72f, 143.19f);
        pathBuilder.curveToRelative(5.47f, -35.22f, 22.1f, -57.54f, 34.0f, -69.46f);
        pathBuilder.reflectiveCurveTo(108.0f, 45.2f, 143.2f, 39.73f);
        pathBuilder.lineToRelative(73.08f, 73.08f);
        pathBuilder.curveTo(210.81f, 148.0f, 194.18f, 170.35f, 182.27f, 182.27f);
        pathBuilder.close();
        pathBuilder.moveTo(164.22f, 91.78f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 8.48f);
        pathBuilder.lineTo(148.48f, 116.0f);
        pathBuilder.lineToRelative(7.75f, 7.75f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.48f, 8.48f);
        pathBuilder.lineTo(140.0f, 124.49f);
        pathBuilder.lineTo(124.49f, 140.0f);
        pathBuilder.lineToRelative(7.75f, 7.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.48f, 8.48f);
        pathBuilder.lineTo(116.0f, 148.48f);
        pathBuilder.lineToRelative(-15.75f, 15.74f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.48f, -8.48f);
        pathBuilder.lineTo(107.52f, 140.0f);
        pathBuilder.lineToRelative(-7.75f, -7.75f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 8.48f, -8.48f);
        pathBuilder.lineToRelative(7.76f, 7.75f);
        pathBuilder.lineToRelative(15.5f, -15.5f);
        pathBuilder.lineToRelative(-7.75f, -7.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 8.48f, -8.48f);
        pathBuilder.lineToRelative(7.75f, 7.75f);
        pathBuilder.lineToRelative(15.75f, -15.74f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 164.22f, 91.78f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _football = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
