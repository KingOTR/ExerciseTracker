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

/* compiled from: Racquet.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Racquet", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getRacquet", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_racquet", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RacquetKt {
    private static ImageVector _racquet;

    public static final ImageVector getRacquet(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _racquet;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Racquet", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(228.53f, 27.47f);
        pathBuilder.curveTo(201.38f, 0.33f, 152.16f, 5.37f, 118.81f, 38.72f);
        pathBuilder.curveTo(87.22f, 70.31f, 81.05f, 116.13f, 103.56f, 144.0f);
        pathBuilder.lineTo(71.33f, 176.19f);
        pathBuilder.lineToRelative(-2.1f, -2.11f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.8f, 0.0f);
        pathBuilder.lineTo(22.1f, 201.41f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, 19.8f);
        pathBuilder.lineToRelative(12.69f, 12.7f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 19.81f, 0.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(27.32f, -27.32f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, -19.81f);
        pathBuilder.lineToRelative(-2.1f, -2.1f);
        pathBuilder.lineTo(112.0f, 152.46f);
        pathBuilder.curveToRelative(11.17f, 9.0f, 25.24f, 13.45f, 40.13f, 13.45f);
        pathBuilder.curveToRelative(22.2f, 0.0f, 46.21f, -9.81f, 65.12f, -28.72f);
        pathBuilder.curveTo(250.63f, 103.84f, 255.67f, 54.62f, 228.53f, 27.47f);
        pathBuilder.close();
        pathBuilder.moveTo(73.43f, 198.09f);
        pathBuilder.lineTo(46.11f, 225.42f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.83f, 0.0f);
        pathBuilder.lineTo(30.59f, 212.73f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.83f);
        pathBuilder.lineToRelative(27.32f, -27.33f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.42f, -0.58f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.41f, 0.58f);
        pathBuilder.lineToRelative(6.35f, 6.34f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(6.34f, 6.34f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 2.83f);
        pathBuilder.close();
        pathBuilder.moveTo(232.34f, 58.0f);
        pathBuilder.lineTo(198.06f, 58.0f);
        pathBuilder.lineTo(198.06f, 23.66f);
        pathBuilder.arcTo(46.33f, 46.33f, 0.0f, false, true, 232.34f, 58.0f);
        pathBuilder.close();
        pathBuilder.moveTo(183.9f, 22.0f);
        pathBuilder.curveToRelative(0.72f, 0.0f, 1.44f, 0.0f, 2.15f, 0.0f);
        pathBuilder.lineTo(186.05f, 58.0f);
        pathBuilder.lineTo(150.0f, 58.0f);
        pathBuilder.lineTo(150.0f, 30.57f);
        pathBuilder.arcTo(74.84f, 74.84f, 0.0f, false, true, 183.9f, 21.92f);
        pathBuilder.close();
        pathBuilder.moveTo(186.05f, 70.0f);
        pathBuilder.verticalLineToRelative(36.0f);
        pathBuilder.lineTo(150.0f, 106.0f);
        pathBuilder.lineTo(150.0f, 70.0f);
        pathBuilder.close();
        pathBuilder.moveTo(127.3f, 47.21f);
        pathBuilder.arcTo(93.2f, 93.2f, 0.0f, false, true, 138.0f, 38.0f);
        pathBuilder.lineTo(138.0f, 58.0f);
        pathBuilder.horizontalLineToRelative(-20.0f);
        pathBuilder.arcTo(93.3f, 93.3f, 0.0f, false, true, 127.3f, 47.21f);
        pathBuilder.close();
        pathBuilder.moveTo(110.65f, 70.0f);
        pathBuilder.lineTo(138.0f, 70.0f);
        pathBuilder.verticalLineToRelative(36.0f);
        pathBuilder.horizontalLineToRelative(-36.0f);
        pathBuilder.curveTo(101.66f, 94.28f, 104.58f, 81.79f, 110.65f, 70.0f);
        pathBuilder.close();
        pathBuilder.moveTo(103.75f, 118.0f);
        pathBuilder.lineTo(138.0f, 118.0f);
        pathBuilder.verticalLineToRelative(34.28f);
        pathBuilder.arcTo(46.33f, 46.33f, 0.0f, false, true, 103.75f, 118.0f);
        pathBuilder.close();
        pathBuilder.moveTo(150.04f, 154.0f);
        pathBuilder.lineTo(150.04f, 118.0f);
        pathBuilder.horizontalLineToRelative(36.0f);
        pathBuilder.verticalLineToRelative(27.38f);
        pathBuilder.curveTo(174.21f, 151.42f, 161.72f, 154.34f, 150.0f, 153.93f);
        pathBuilder.close();
        pathBuilder.moveTo(208.79f, 128.77f);
        pathBuilder.arcToRelative(93.07f, 93.07f, 0.0f, false, true, -10.73f, 9.22f);
        pathBuilder.lineTo(198.06f, 118.0f);
        pathBuilder.lineTo(218.0f, 118.0f);
        pathBuilder.arcTo(94.06f, 94.06f, 0.0f, false, true, 208.79f, 128.7f);
        pathBuilder.close();
        pathBuilder.moveTo(225.44f, 106.0f);
        pathBuilder.lineTo(198.06f, 106.0f);
        pathBuilder.lineTo(198.06f, 70.0f);
        pathBuilder.horizontalLineToRelative(36.0f);
        pathBuilder.curveTo(234.43f, 81.63f, 231.51f, 94.12f, 225.44f, 106.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _racquet = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
