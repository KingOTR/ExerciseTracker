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

/* compiled from: Discordlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"DiscordLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getDiscordLogo", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_discordLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DiscordlogoKt {
    private static ImageVector _discordLogo;

    public static final ImageVector getDiscordLogo(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(108.0f, 136.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 108.0f, 136.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 120.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 164.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(240.07f, 196.56f);
        pathBuilder.lineTo(173.07f, 226.27f);
        pathBuilder.arcTo(20.15f, 20.15f, 0.0f, false, true, 146.0f, 214.9f);
        pathBuilder.lineToRelative(-8.54f, -23.13f);
        pathBuilder.curveToRelative(-3.13f, 0.14f, -6.27f, 0.24f, -9.45f, 0.24f);
        pathBuilder.reflectiveCurveToRelative(-6.32f, -0.1f, -9.45f, -0.24f);
        pathBuilder.lineTo(110.0f, 214.9f);
        pathBuilder.arcToRelative(20.19f, 20.19f, 0.0f, false, true, -27.08f, 11.37f);
        pathBuilder.lineToRelative(-67.0f, -29.71f);
        pathBuilder.arcTo(19.93f, 19.93f, 0.0f, false, true, 4.62f, 173.41f);
        pathBuilder.lineTo(34.15f, 57.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 50.37f, 42.19f);
        pathBuilder.lineToRelative(36.06f, -5.93f);
        pathBuilder.arcTo(20.26f, 20.26f, 0.0f, false, true, 109.22f, 51.1f);
        pathBuilder.lineToRelative(4.41f, 17.41f);
        pathBuilder.curveToRelative(4.74f, -0.33f, 9.52f, -0.51f, 14.37f, -0.51f);
        pathBuilder.reflectiveCurveToRelative(9.63f, 0.18f, 14.37f, 0.51f);
        pathBuilder.lineToRelative(4.41f, -17.41f);
        pathBuilder.arcToRelative(20.25f, 20.25f, 0.0f, false, true, 22.79f, -14.84f);
        pathBuilder.lineToRelative(36.06f, 5.93f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 221.85f, 57.0f);
        pathBuilder.lineToRelative(29.53f, 116.38f);
        pathBuilder.arcTo(19.93f, 19.93f, 0.0f, false, true, 240.07f, 196.56f);
        pathBuilder.close();
        pathBuilder.moveTo(227.28f, 176.0f);
        pathBuilder.lineTo(199.23f, 65.46f);
        pathBuilder.lineToRelative(-30.07f, -4.94f);
        pathBuilder.lineToRelative(-2.84f, 11.17f);
        pathBuilder.curveToRelative(2.9f, 0.58f, 5.78f, 1.2f, 8.61f, 1.92f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -5.86f, 23.27f);
        pathBuilder.arcTo(168.43f, 168.43f, 0.0f, false, false, 128.0f, 92.0f);
        pathBuilder.arcToRelative(168.43f, 168.43f, 0.0f, false, false, -41.07f, 4.88f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -5.86f, -23.27f);
        pathBuilder.curveToRelative(2.83f, -0.72f, 5.71f, -1.34f, 8.61f, -1.92f);
        pathBuilder.lineTo(86.85f, 60.52f);
        pathBuilder.lineTo(56.77f, 65.46f);
        pathBuilder.lineTo(28.72f, 176.0f);
        pathBuilder.lineToRelative(60.22f, 26.7f);
        pathBuilder.lineToRelative(5.0f, -13.57f);
        pathBuilder.curveToRelative(-4.37f, -0.76f, -8.67f, -1.65f, -12.88f, -2.71f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 5.86f, -23.28f);
        pathBuilder.arcTo(168.43f, 168.43f, 0.0f, false, false, 128.0f, 168.0f);
        pathBuilder.arcToRelative(168.43f, 168.43f, 0.0f, false, false, 41.07f, -4.88f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 5.86f, 23.28f);
        pathBuilder.curveToRelative(-4.21f, 1.06f, -8.51f, 1.95f, -12.88f, 2.71f);
        pathBuilder.lineToRelative(5.0f, 13.57f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _discordLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
