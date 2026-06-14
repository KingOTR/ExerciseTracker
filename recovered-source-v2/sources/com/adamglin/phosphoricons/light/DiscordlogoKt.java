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

/* compiled from: Discordlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"DiscordLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getDiscordLogo", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_discordLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DiscordlogoKt {
    private static ImageVector _discordLogo;

    public static final ImageVector getDiscordLogo(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _discordLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("DiscordLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(102.0f, 140.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 102.0f, 140.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 130.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, false, 164.0f, 130.0f);
        pathBuilder.close();
        pathBuilder.moveTo(237.64f, 191.08f);
        pathBuilder.lineTo(170.64f, 220.79f);
        pathBuilder.arcToRelative(14.43f, 14.43f, 0.0f, false, true, -5.77f, 1.21f);
        pathBuilder.arcToRelative(14.13f, 14.13f, 0.0f, false, true, -13.25f, -9.18f);
        pathBuilder.lineTo(143.0f, 189.43f);
        pathBuilder.curveToRelative(-4.93f, 0.37f, -9.92f, 0.58f, -15.0f, 0.58f);
        pathBuilder.reflectiveCurveToRelative(-10.06f, -0.21f, -15.0f, -0.58f);
        pathBuilder.lineToRelative(-8.63f, 23.39f);
        pathBuilder.arcTo(14.13f, 14.13f, 0.0f, false, true, 91.13f, 222.0f);
        pathBuilder.arcToRelative(14.43f, 14.43f, 0.0f, false, true, -5.77f, -1.21f);
        pathBuilder.lineToRelative(-67.0f, -29.71f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, -7.93f, -16.2f);
        pathBuilder.lineTo(40.0f, 58.5f);
        pathBuilder.arcTo(14.07f, 14.07f, 0.0f, false, true, 51.34f, 48.11f);
        pathBuilder.lineTo(87.4f, 42.19f);
        pathBuilder.arcToRelative(14.19f, 14.19f, 0.0f, false, true, 16.0f, 10.39f);
        pathBuilder.lineToRelative(3.69f, 14.53f);
        pathBuilder.arcToRelative(197.5f, 197.5f, 0.0f, false, true, 41.82f, 0.0f);
        pathBuilder.lineToRelative(3.69f, -14.53f);
        pathBuilder.arcToRelative(14.19f, 14.19f, 0.0f, false, true, 16.0f, -10.39f);
        pathBuilder.lineToRelative(36.06f, 5.92f);
        pathBuilder.arcTo(14.07f, 14.07f, 0.0f, false, true, 216.0f, 58.5f);
        pathBuilder.lineToRelative(29.53f, 116.38f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 237.64f, 191.08f);
        pathBuilder.close();
        pathBuilder.moveTo(233.94f, 177.83f);
        pathBuilder.lineTo(204.41f, 61.45f);
        pathBuilder.arcToRelative(2.08f, 2.08f, 0.0f, false, false, -1.7f, -1.5f);
        pathBuilder.lineTo(166.65f, 54.0f);
        pathBuilder.arcToRelative(2.13f, 2.13f, 0.0f, false, false, -2.42f, 1.5f);
        pathBuilder.lineToRelative(-3.36f, 13.24f);
        pathBuilder.arcToRelative(169.28f, 169.28f, 0.0f, false, true, 16.75f, 3.76f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 176.0f, 84.31f);
        pathBuilder.arcToRelative(5.71f, 5.71f, 0.0f, false, true, -1.62f, -0.23f);
        pathBuilder.arcTo(174.26f, 174.26f, 0.0f, false, false, 128.0f, 78.0f);
        pathBuilder.arcToRelative(174.26f, 174.26f, 0.0f, false, false, -46.38f, 6.08f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -3.24f, -11.55f);
        pathBuilder.arcToRelative(169.28f, 169.28f, 0.0f, false, true, 16.75f, -3.76f);
        pathBuilder.lineTo(91.77f, 55.53f);
        pathBuilder.arcTo(2.12f, 2.12f, 0.0f, false, false, 89.35f, 54.0f);
        pathBuilder.lineTo(53.29f, 60.0f);
        pathBuilder.arcToRelative(2.08f, 2.08f, 0.0f, false, false, -1.7f, 1.5f);
        pathBuilder.lineTo(22.06f, 177.83f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.16f, 2.28f);
        pathBuilder.lineToRelative(67.0f, 29.7f);
        pathBuilder.arcToRelative(2.19f, 2.19f, 0.0f, false, false, 1.76f, 0.0f);
        pathBuilder.arcToRelative(2.07f, 2.07f, 0.0f, false, false, 1.14f, -1.17f);
        pathBuilder.lineToRelative(7.58f, -20.55f);
        pathBuilder.arcToRelative(171.46f, 171.46f, 0.0f, false, true, -22.33f, -4.64f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 3.24f, -11.55f);
        pathBuilder.arcTo(174.26f, 174.26f, 0.0f, false, false, 128.0f, 178.0f);
        pathBuilder.arcToRelative(174.26f, 174.26f, 0.0f, false, false, 46.38f, -6.08f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 3.24f, 11.55f);
        pathBuilder.arcToRelative(171.46f, 171.46f, 0.0f, false, true, -22.33f, 4.64f);
        pathBuilder.lineToRelative(7.58f, 20.55f);
        pathBuilder.arcToRelative(2.07f, 2.07f, 0.0f, false, false, 1.14f, 1.17f);
        pathBuilder.arcToRelative(2.19f, 2.19f, 0.0f, false, false, 1.76f, 0.0f);
        pathBuilder.lineToRelative(67.0f, -29.7f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, false, 233.94f, 177.83f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _discordLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
