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

/* compiled from: Discordlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"DiscordLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getDiscordLogo", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_discordLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DiscordlogoKt {
    private static ImageVector _discordLogo;

    public static final ImageVector getDiscordLogo(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(104.0f, 140.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 104.0f, 140.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 128.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 164.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(238.45f, 192.9f);
        pathBuilder.lineTo(171.45f, 222.61f);
        pathBuilder.arcToRelative(16.17f, 16.17f, 0.0f, false, true, -21.71f, -9.1f);
        pathBuilder.lineToRelative(-8.11f, -22.0f);
        pathBuilder.quadToRelative(-6.72f, 0.45f, -13.63f, 0.46f);
        pathBuilder.reflectiveQuadToRelative(-13.63f, -0.46f);
        pathBuilder.lineToRelative(-8.11f, 22.0f);
        pathBuilder.arcToRelative(16.18f, 16.18f, 0.0f, false, true, -21.71f, 9.1f);
        pathBuilder.lineToRelative(-67.0f, -29.71f);
        pathBuilder.arcToRelative(15.93f, 15.93f, 0.0f, false, true, -9.06f, -18.51f);
        pathBuilder.lineTo(38.0f, 58.0f);
        pathBuilder.arcTo(16.07f, 16.07f, 0.0f, false, true, 51.0f, 46.14f);
        pathBuilder.lineToRelative(36.06f, -5.93f);
        pathBuilder.arcToRelative(16.22f, 16.22f, 0.0f, false, true, 18.26f, 11.88f);
        pathBuilder.lineToRelative(3.26f, 12.84f);
        pathBuilder.quadTo(118.11f, 64.0f, 128.0f, 64.0f);
        pathBuilder.reflectiveQuadToRelative(19.4f, 0.93f);
        pathBuilder.lineToRelative(3.26f, -12.84f);
        pathBuilder.arcToRelative(16.21f, 16.21f, 0.0f, false, true, 18.26f, -11.88f);
        pathBuilder.lineTo(205.0f, 46.14f);
        pathBuilder.arcTo(16.07f, 16.07f, 0.0f, false, true, 218.0f, 58.0f);
        pathBuilder.lineToRelative(29.53f, 116.38f);
        pathBuilder.arcTo(15.93f, 15.93f, 0.0f, false, true, 238.45f, 192.9f);
        pathBuilder.close();
        pathBuilder.moveTo(232.0f, 178.28f);
        pathBuilder.lineTo(202.47f, 62.0f);
        pathBuilder.reflectiveCurveToRelative(0.0f, 0.0f, -0.08f, 0.0f);
        pathBuilder.lineTo(166.33f, 56.0f);
        pathBuilder.arcToRelative(0.17f, 0.17f, 0.0f, false, false, -0.17f, 0.0f);
        pathBuilder.lineToRelative(-2.83f, 11.14f);
        pathBuilder.curveToRelative(5.0f, 0.94f, 10.0f, 2.06f, 14.83f, 3.42f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 176.0f, 86.31f);
        pathBuilder.arcToRelative(8.09f, 8.09f, 0.0f, false, true, -2.16f, -0.3f);
        pathBuilder.arcTo(172.25f, 172.25f, 0.0f, false, false, 128.0f, 80.0f);
        pathBuilder.arcToRelative(172.25f, 172.25f, 0.0f, false, false, -45.84f, 6.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -4.32f, -15.4f);
        pathBuilder.curveToRelative(4.82f, -1.36f, 9.78f, -2.48f, 14.82f, -3.42f);
        pathBuilder.lineTo(89.83f, 56.0f);
        pathBuilder.reflectiveCurveToRelative(0.0f, 0.0f, -0.12f, 0.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineTo(53.61f, 61.93f);
        pathBuilder.arcToRelative(0.17f, 0.17f, 0.0f, false, false, -0.09f, 0.0f);
        pathBuilder.lineTo(24.0f, 178.33f);
        pathBuilder.lineTo(91.0f, 208.0f);
        pathBuilder.arcToRelative(0.23f, 0.23f, 0.0f, false, false, 0.22f, 0.0f);
        pathBuilder.lineTo(98.0f, 189.72f);
        pathBuilder.arcToRelative(173.2f, 173.2f, 0.0f, false, true, -20.14f, -4.32f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 82.16f, 170.0f);
        pathBuilder.arcTo(171.85f, 171.85f, 0.0f, false, false, 128.0f, 176.0f);
        pathBuilder.arcToRelative(171.85f, 171.85f, 0.0f, false, false, 45.84f, -6.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.32f, 15.41f);
        pathBuilder.arcTo(173.2f, 173.2f, 0.0f, false, true, 158.0f, 189.72f);
        pathBuilder.lineTo(164.75f, 208.0f);
        pathBuilder.arcToRelative(0.22f, 0.22f, 0.0f, false, false, 0.21f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _discordLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
