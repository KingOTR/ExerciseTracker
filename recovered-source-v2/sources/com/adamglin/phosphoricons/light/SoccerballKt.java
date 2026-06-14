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

/* compiled from: Soccerball.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SoccerBall", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getSoccerBall", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_soccerBall", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SoccerballKt {
    private static ImageVector _soccerBall;

    public static final ImageVector getSoccerBall(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 26.0f);
        pathBuilder.arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f);
        pathBuilder.arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f);
        pathBuilder.close();
        pathBuilder.moveTo(205.67f, 173.42f);
        pathBuilder.lineTo(169.89f, 173.42f);
        pathBuilder.lineTo(159.41f, 159.0f);
        pathBuilder.lineToRelative(13.29f, -38.72f);
        pathBuilder.lineToRelative(17.0f, -5.51f);
        pathBuilder.lineToRelative(27.94f, 21.43f);
        pathBuilder.arcTo(89.38f, 89.38f, 0.0f, false, true, 205.67f, 173.42f);
        pathBuilder.close();
        pathBuilder.moveTo(86.11f, 173.42f);
        pathBuilder.lineTo(50.33f, 173.42f);
        pathBuilder.arcTo(89.38f, 89.38f, 0.0f, false, true, 38.38f, 136.2f);
        pathBuilder.lineToRelative(27.94f, -21.43f);
        pathBuilder.lineToRelative(17.0f, 5.51f);
        pathBuilder.lineTo(96.59f, 159.0f);
        pathBuilder.close();
        pathBuilder.moveTo(51.0f, 81.42f);
        pathBuilder.lineToRelative(7.24f, 24.41f);
        pathBuilder.lineToRelative(-20.0f, 15.34f);
        pathBuilder.arcTo(89.47f, 89.47f, 0.0f, false, true, 51.0f, 81.42f);
        pathBuilder.close();
        pathBuilder.moveTo(107.56f, 154.0f);
        pathBuilder.lineTo(95.15f, 117.86f);
        pathBuilder.lineTo(128.0f, 95.28f);
        pathBuilder.lineToRelative(32.85f, 22.58f);
        pathBuilder.lineTo(148.44f, 154.0f);
        pathBuilder.close();
        pathBuilder.moveTo(197.75f, 105.83f);
        pathBuilder.lineTo(205.0f, 81.42f);
        pathBuilder.arcToRelative(89.47f, 89.47f, 0.0f, false, true, 12.75f, 39.75f);
        pathBuilder.close();
        pathBuilder.moveTo(196.09f, 69.21f);
        pathBuilder.lineTo(186.0f, 103.35f);
        pathBuilder.lineToRelative(-17.0f, 5.53f);
        pathBuilder.lineToRelative(-35.0f, -24.0f);
        pathBuilder.lineTo(134.0f, 67.16f);
        pathBuilder.lineToRelative(30.9f, -21.24f);
        pathBuilder.arcTo(90.3f, 90.3f, 0.0f, false, true, 196.09f, 69.21f);
        pathBuilder.close();
        pathBuilder.moveTo(150.92f, 41.0f);
        pathBuilder.lineTo(128.0f, 56.72f);
        pathBuilder.lineTo(105.08f, 41.0f);
        pathBuilder.arcToRelative(90.22f, 90.22f, 0.0f, false, true, 45.84f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(91.11f, 45.91f);
        pathBuilder.lineTo(122.0f, 67.16f);
        pathBuilder.lineTo(122.0f, 84.84f);
        pathBuilder.lineToRelative(-35.0f, 24.0f);
        pathBuilder.lineToRelative(-17.0f, -5.53f);
        pathBuilder.lineTo(59.91f, 69.21f);
        pathBuilder.arcTo(90.4f, 90.4f, 0.0f, false, true, 91.11f, 45.91f);
        pathBuilder.close();
        pathBuilder.moveTo(58.75f, 185.42f);
        pathBuilder.lineTo(84.93f, 185.42f);
        pathBuilder.lineToRelative(9.19f, 26.0f);
        pathBuilder.arcTo(90.37f, 90.37f, 0.0f, false, true, 58.75f, 185.42f);
        pathBuilder.close();
        pathBuilder.moveTo(108.43f, 215.85f);
        pathBuilder.lineTo(95.88f, 180.39f);
        pathBuilder.lineTo(106.34f, 166.0f);
        pathBuilder.horizontalLineToRelative(43.32f);
        pathBuilder.lineToRelative(10.46f, 14.39f);
        pathBuilder.lineToRelative(-12.55f, 35.46f);
        pathBuilder.arcToRelative(90.14f, 90.14f, 0.0f, false, true, -39.14f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(161.88f, 211.37f);
        pathBuilder.lineTo(171.07f, 185.37f);
        pathBuilder.horizontalLineToRelative(26.18f);
        pathBuilder.arcTo(90.37f, 90.37f, 0.0f, false, true, 161.88f, 211.37f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _soccerBall = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
