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

/* compiled from: Discordlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"DiscordLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getDiscordLogo", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_discordLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DiscordlogoKt {
    private static ImageVector _discordLogo;

    public static final ImageVector getDiscordLogo(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(247.51f, 174.39f);
        pathBuilder.lineTo(218.0f, 58.0f);
        pathBuilder.arcToRelative(16.08f, 16.08f, 0.0f, false, false, -13.0f, -11.88f);
        pathBuilder.lineToRelative(-36.06f, -5.92f);
        pathBuilder.arcToRelative(16.22f, 16.22f, 0.0f, false, false, -18.26f, 11.88f);
        pathBuilder.lineToRelative(-0.21f, 0.85f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.27f, 4.93f);
        pathBuilder.arcToRelative(155.62f, 155.62f, 0.0f, false, true, 24.41f, 5.62f);
        pathBuilder.arcToRelative(8.2f, 8.2f, 0.0f, false, true, 5.62f, 9.7f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.19f, 5.64f);
        pathBuilder.arcToRelative(155.4f, 155.4f, 0.0f, false, false, -90.8f, -0.1f);
        pathBuilder.arcToRelative(8.22f, 8.22f, 0.0f, false, true, -10.28f, -4.81f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.08f, -10.33f);
        pathBuilder.arcToRelative(156.85f, 156.85f, 0.0f, false, true, 24.72f, -5.72f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.27f, -4.93f);
        pathBuilder.lineToRelative(-0.21f, -0.85f);
        pathBuilder.arcTo(16.21f, 16.21f, 0.0f, false, false, 87.08f, 40.21f);
        pathBuilder.lineTo(51.0f, 46.13f);
        pathBuilder.arcTo(16.08f, 16.08f, 0.0f, false, false, 38.0f, 58.0f);
        pathBuilder.lineTo(8.49f, 174.39f);
        pathBuilder.arcToRelative(15.94f, 15.94f, 0.0f, false, false, 9.06f, 18.51f);
        pathBuilder.lineToRelative(67.0f, 29.71f);
        pathBuilder.arcToRelative(16.17f, 16.17f, 0.0f, false, false, 21.71f, -9.1f);
        pathBuilder.lineToRelative(3.49f, -9.45f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.27f, -5.35f);
        pathBuilder.arcToRelative(158.13f, 158.13f, 0.0f, false, true, -28.63f, -6.2f);
        pathBuilder.arcToRelative(8.2f, 8.2f, 0.0f, false, true, -5.61f, -9.67f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.2f, -5.66f);
        pathBuilder.arcToRelative(155.59f, 155.59f, 0.0f, false, false, 91.12f, 0.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.19f, 5.65f);
        pathBuilder.arcToRelative(8.19f, 8.19f, 0.0f, false, true, -5.61f, 9.68f);
        pathBuilder.arcToRelative(157.84f, 157.84f, 0.0f, false, true, -28.62f, 6.2f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.27f, 5.35f);
        pathBuilder.lineToRelative(3.49f, 9.45f);
        pathBuilder.arcToRelative(16.18f, 16.18f, 0.0f, false, false, 21.71f, 9.1f);
        pathBuilder.lineToRelative(67.0f, -29.71f);
        pathBuilder.arcTo(15.94f, 15.94f, 0.0f, false, false, 247.51f, 174.39f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 152.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 92.0f, 152.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 152.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 164.0f, 152.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _discordLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
