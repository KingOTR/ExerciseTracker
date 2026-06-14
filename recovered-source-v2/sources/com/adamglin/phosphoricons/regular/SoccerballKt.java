package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Soccerball.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SoccerBall", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getSoccerBall", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_soccerBall", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SoccerballKt {
    private static ImageVector _soccerBall;

    public static final ImageVector getSoccerBall(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _soccerBall;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("SoccerBall", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 24.0f);
        pathBuilder.arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f);
        pathBuilder.arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(204.52f, 171.42f);
        pathBuilder.lineTo(170.9f, 171.42f);
        pathBuilder.lineToRelative(-9.26f, -12.76f);
        pathBuilder.lineToRelative(12.63f, -36.78f);
        pathBuilder.lineToRelative(15.0f, -4.89f);
        pathBuilder.lineToRelative(26.24f, 20.13f);
        pathBuilder.arcTo(87.38f, 87.38f, 0.0f, false, true, 204.52f, 171.42f);
        pathBuilder.close();
        pathBuilder.moveTo(40.52f, 137.12f);
        pathBuilder.lineTo(66.71f, 117.0f);
        pathBuilder.lineToRelative(15.0f, 4.89f);
        pathBuilder.lineToRelative(12.63f, 36.78f);
        pathBuilder.lineTo(85.1f, 171.42f);
        pathBuilder.lineTo(51.48f, 171.42f);
        pathBuilder.arcTo(87.38f, 87.38f, 0.0f, false, true, 40.47f, 137.12f);
        pathBuilder.close();
        pathBuilder.moveTo(50.52f, 86.48f);
        pathBuilder.lineTo(56.03f, 105.08f);
        pathBuilder.lineTo(40.71f, 116.77f);
        pathBuilder.arcTo(87.33f, 87.33f, 0.0f, false, true, 50.43f, 86.48f);
        pathBuilder.close();
        pathBuilder.moveTo(109.0f, 152.0f);
        pathBuilder.lineTo(97.54f, 118.65f);
        pathBuilder.lineTo(128.0f, 97.71f);
        pathBuilder.lineToRelative(30.46f, 20.94f);
        pathBuilder.lineTo(147.0f, 152.0f);
        pathBuilder.close();
        pathBuilder.moveTo(200.07f, 105.08f);
        pathBuilder.lineTo(205.58f, 86.48f);
        pathBuilder.arcToRelative(87.33f, 87.33f, 0.0f, false, true, 9.72f, 30.29f);
        pathBuilder.close();
        pathBuilder.moveTo(193.87f, 69.7f);
        pathBuilder.lineTo(184.36f, 101.78f);
        pathBuilder.lineTo(169.29f, 106.67f);
        pathBuilder.lineTo(136.0f, 83.79f);
        pathBuilder.lineTo(136.0f, 68.21f);
        pathBuilder.lineToRelative(29.09f, -20.0f);
        pathBuilder.arcTo(88.58f, 88.58f, 0.0f, false, true, 193.86f, 69.7f);
        pathBuilder.close();
        pathBuilder.moveTo(146.07f, 41.87f);
        pathBuilder.lineTo(128.0f, 54.29f);
        pathBuilder.lineTo(109.93f, 41.87f);
        pathBuilder.arcToRelative(88.24f, 88.24f, 0.0f, false, true, 36.14f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(90.91f, 48.21f);
        pathBuilder.lineToRelative(29.09f, 20.0f);
        pathBuilder.lineTo(120.0f, 83.79f);
        pathBuilder.lineTo(86.72f, 106.67f);
        pathBuilder.lineToRelative(-15.07f, -4.89f);
        pathBuilder.lineTo(62.14f, 69.7f);
        pathBuilder.arcTo(88.58f, 88.58f, 0.0f, false, true, 90.91f, 48.21f);
        pathBuilder.close();
        pathBuilder.moveTo(63.15f, 187.42f);
        pathBuilder.lineTo(83.52f, 187.42f);
        pathBuilder.lineToRelative(7.17f, 20.27f);
        pathBuilder.arcTo(88.4f, 88.4f, 0.0f, false, true, 63.15f, 187.42f);
        pathBuilder.close();
        pathBuilder.moveTo(110.0f, 214.13f);
        pathBuilder.lineTo(98.12f, 180.71f);
        pathBuilder.lineTo(107.35f, 168.0f);
        pathBuilder.horizontalLineToRelative(41.3f);
        pathBuilder.lineToRelative(9.23f, 12.71f);
        pathBuilder.lineToRelative(-11.83f, 33.42f);
        pathBuilder.arcToRelative(88.0f, 88.0f, 0.0f, false, true, -36.1f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(165.36f, 207.69f);
        pathBuilder.lineTo(172.53f, 187.42f);
        pathBuilder.horizontalLineToRelative(20.37f);
        pathBuilder.arcTo(88.4f, 88.4f, 0.0f, false, true, 165.31f, 207.69f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _soccerBall = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
