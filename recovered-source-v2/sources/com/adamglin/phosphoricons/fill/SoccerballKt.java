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

/* compiled from: Soccerball.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SoccerBall", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getSoccerBall", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_soccerBall", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SoccerballKt {
    private static ImageVector _soccerBall;

    public static final ImageVector getSoccerBall(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(136.0f, 63.38f);
        pathBuilder.lineTo(160.79f, 46.33f);
        pathBuilder.arcToRelative(88.41f, 88.41f, 0.0f, false, true, 36.18f, 27.0f);
        pathBuilder.lineToRelative(-8.0f, 26.94f);
        pathBuilder.curveToRelative(-0.2f, 0.0f, -0.41f, 0.1f, -0.61f, 0.17f);
        pathBuilder.lineToRelative(-22.82f, 7.41f);
        pathBuilder.arcToRelative(7.59f, 7.59f, 0.0f, false, false, -1.0f, 0.4f);
        pathBuilder.lineTo(136.0f, 88.62f);
        pathBuilder.curveToRelative(0.0f, -0.2f, 0.0f, -0.41f, 0.0f, -0.62f);
        pathBuilder.lineTo(136.0f, 64.0f);
        pathBuilder.curveTo(136.0f, 63.79f, 136.0f, 63.58f, 136.0f, 63.38f);
        pathBuilder.close();
        pathBuilder.moveTo(95.24f, 46.33f);
        pathBuilder.lineTo(120.0f, 63.38f);
        pathBuilder.curveToRelative(0.0f, 0.2f, 0.0f, 0.41f, 0.0f, 0.62f);
        pathBuilder.lineTo(120.0f, 88.0f);
        pathBuilder.curveToRelative(0.0f, 0.21f, 0.0f, 0.42f, 0.0f, 0.62f);
        pathBuilder.lineTo(91.44f, 108.29f);
        pathBuilder.arcToRelative(7.59f, 7.59f, 0.0f, false, false, -1.0f, -0.4f);
        pathBuilder.lineToRelative(-22.82f, -7.41f);
        pathBuilder.curveToRelative(-0.2f, -0.07f, -0.41f, -0.12f, -0.61f, -0.17f);
        pathBuilder.lineToRelative(-8.0f, -26.94f);
        pathBuilder.arcTo(88.41f, 88.41f, 0.0f, false, true, 95.24f, 46.33f);
        pathBuilder.close();
        pathBuilder.moveTo(82.24f, 175.42f);
        pathBuilder.lineTo(53.9f, 175.42f);
        pathBuilder.arcToRelative(87.4f, 87.4f, 0.0f, false, true, -13.79f, -43.07f);
        pathBuilder.lineToRelative(22.0f, -16.88f);
        pathBuilder.arcToRelative(5.77f, 5.77f, 0.0f, false, false, 0.58f, 0.22f);
        pathBuilder.lineToRelative(22.83f, 7.42f);
        pathBuilder.arcToRelative(7.83f, 7.83f, 0.0f, false, false, 0.93f, 0.22f);
        pathBuilder.lineToRelative(10.79f, 31.42f);
        pathBuilder.curveToRelative(-0.15f, 0.18f, -0.3f, 0.36f, -0.44f, 0.55f);
        pathBuilder.lineTo(82.7f, 174.71f);
        pathBuilder.arcTo(7.8f, 7.8f, 0.0f, false, false, 82.24f, 175.42f);
        pathBuilder.close();
        pathBuilder.moveTo(150.69f, 213.0f);
        pathBuilder.arcToRelative(88.16f, 88.16f, 0.0f, false, true, -45.38f, 0.0f);
        pathBuilder.lineTo(95.25f, 184.6f);
        pathBuilder.curveToRelative(0.13f, -0.16f, 0.27f, -0.31f, 0.39f, -0.48f);
        pathBuilder.lineToRelative(14.11f, -19.42f);
        pathBuilder.arcToRelative(7.66f, 7.66f, 0.0f, false, false, 0.46f, -0.7f);
        pathBuilder.horizontalLineToRelative(35.58f);
        pathBuilder.arcToRelative(7.66f, 7.66f, 0.0f, false, false, 0.46f, 0.7f);
        pathBuilder.lineToRelative(14.11f, 19.42f);
        pathBuilder.curveToRelative(0.12f, 0.17f, 0.26f, 0.32f, 0.39f, 0.48f);
        pathBuilder.close();
        pathBuilder.moveTo(173.76f, 175.39f);
        pathBuilder.arcToRelative(7.8f, 7.8f, 0.0f, false, false, -0.46f, -0.71f);
        pathBuilder.lineTo(159.19f, 155.3f);
        pathBuilder.curveToRelative(-0.14f, -0.19f, -0.29f, -0.37f, -0.44f, -0.55f);
        pathBuilder.lineToRelative(10.79f, -31.42f);
        pathBuilder.arcToRelative(7.83f, 7.83f, 0.0f, false, false, 0.93f, -0.22f);
        pathBuilder.lineToRelative(22.83f, -7.42f);
        pathBuilder.arcToRelative(5.77f, 5.77f, 0.0f, false, false, 0.58f, -0.22f);
        pathBuilder.lineToRelative(22.0f, 16.88f);
        pathBuilder.arcToRelative(87.4f, 87.4f, 0.0f, false, true, -13.79f, 43.07f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _soccerBall = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
