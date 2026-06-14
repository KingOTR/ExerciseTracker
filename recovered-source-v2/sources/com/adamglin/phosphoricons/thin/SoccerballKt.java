package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Soccerball.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SoccerBall", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getSoccerBall", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_soccerBall", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SoccerballKt {
    private static ImageVector _soccerBall;

    public static final ImageVector getSoccerBall(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 28.0f);
        pathBuilder.arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f);
        pathBuilder.arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(168.87f, 175.42f);
        pathBuilder.lineTo(157.18f, 159.33f);
        pathBuilder.lineTo(171.13f, 118.69f);
        pathBuilder.lineTo(190.06f, 112.54f);
        pathBuilder.lineTo(219.71f, 135.28f);
        pathBuilder.arcToRelative(91.32f, 91.32f, 0.0f, false, true, -12.9f, 40.14f);
        pathBuilder.close();
        pathBuilder.moveTo(87.13f, 175.42f);
        pathBuilder.lineTo(49.19f, 175.42f);
        pathBuilder.arcToRelative(91.32f, 91.32f, 0.0f, false, true, -12.9f, -40.14f);
        pathBuilder.lineToRelative(29.65f, -22.74f);
        pathBuilder.lineToRelative(18.93f, 6.15f);
        pathBuilder.lineToRelative(13.95f, 40.64f);
        pathBuilder.close();
        pathBuilder.moveTo(51.69f, 76.66f);
        pathBuilder.lineToRelative(8.87f, 29.92f);
        pathBuilder.lineTo(36.0f, 125.39f);
        pathBuilder.arcTo(91.41f, 91.41f, 0.0f, false, true, 51.69f, 76.66f);
        pathBuilder.close();
        pathBuilder.moveTo(106.13f, 156.0f);
        pathBuilder.lineTo(92.77f, 117.08f);
        pathBuilder.lineTo(128.0f, 92.85f);
        pathBuilder.lineToRelative(35.23f, 24.23f);
        pathBuilder.lineTo(149.87f, 156.0f);
        pathBuilder.close();
        pathBuilder.moveTo(195.44f, 106.58f);
        pathBuilder.lineTo(204.31f, 76.66f);
        pathBuilder.arcTo(91.41f, 91.41f, 0.0f, false, true, 220.0f, 125.39f);
        pathBuilder.close();
        pathBuilder.moveTo(198.31f, 68.74f);
        pathBuilder.lineTo(187.59f, 104.93f);
        pathBuilder.lineTo(168.59f, 111.09f);
        pathBuilder.lineTo(132.0f, 85.9f);
        pathBuilder.lineTo(132.0f, 66.1f);
        pathBuilder.lineToRelative(32.68f, -22.46f);
        pathBuilder.arcTo(92.44f, 92.44f, 0.0f, false, true, 198.31f, 68.74f);
        pathBuilder.close();
        pathBuilder.moveTo(155.54f, 40.21f);
        pathBuilder.lineTo(128.0f, 59.15f);
        pathBuilder.lineTo(100.46f, 40.21f);
        pathBuilder.arcToRelative(92.18f, 92.18f, 0.0f, false, true, 55.08f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(91.32f, 43.64f);
        pathBuilder.lineTo(124.0f, 66.1f);
        pathBuilder.lineTo(124.0f, 85.9f);
        pathBuilder.lineTo(87.36f, 111.09f);
        pathBuilder.lineToRelative(-19.0f, -6.16f);
        pathBuilder.lineTo(57.69f, 68.74f);
        pathBuilder.arcTo(92.44f, 92.44f, 0.0f, false, true, 91.32f, 43.64f);
        pathBuilder.close();
        pathBuilder.moveTo(54.61f, 183.42f);
        pathBuilder.lineTo(86.34f, 183.42f);
        pathBuilder.lineToRelative(11.1f, 31.36f);
        pathBuilder.arcTo(92.46f, 92.46f, 0.0f, false, true, 54.61f, 183.42f);
        pathBuilder.close();
        pathBuilder.moveTo(106.91f, 217.56f);
        pathBuilder.lineTo(93.64f, 180.06f);
        pathBuilder.lineTo(105.32f, 164.0f);
        pathBuilder.horizontalLineToRelative(45.36f);
        pathBuilder.lineToRelative(11.68f, 16.06f);
        pathBuilder.lineToRelative(-13.27f, 37.5f);
        pathBuilder.arcToRelative(92.37f, 92.37f, 0.0f, false, true, -42.18f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(158.56f, 214.78f);
        pathBuilder.lineTo(169.66f, 183.42f);
        pathBuilder.horizontalLineToRelative(31.73f);
        pathBuilder.arcTo(92.46f, 92.46f, 0.0f, false, true, 158.56f, 214.78f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _soccerBall = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
