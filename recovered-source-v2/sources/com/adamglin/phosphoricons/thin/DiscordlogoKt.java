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

/* compiled from: Discordlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"DiscordLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getDiscordLogo", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_discordLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DiscordlogoKt {
    private static ImageVector _discordLogo;

    public static final ImageVector getDiscordLogo(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(100.0f, 140.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 100.0f, 140.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 132.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 164.0f, 132.0f);
        pathBuilder.close();
        pathBuilder.moveTo(236.83f, 189.25f);
        pathBuilder.lineTo(169.83f, 218.96f);
        pathBuilder.arcToRelative(12.36f, 12.36f, 0.0f, false, true, -5.0f, 1.0f);
        pathBuilder.arcToRelative(12.13f, 12.13f, 0.0f, false, true, -11.38f, -7.88f);
        pathBuilder.lineToRelative(-9.15f, -24.81f);
        pathBuilder.curveToRelative(-5.36f, 0.45f, -10.81f, 0.69f, -16.34f, 0.69f);
        pathBuilder.reflectiveCurveToRelative(-11.0f, -0.24f, -16.34f, -0.69f);
        pathBuilder.lineToRelative(-9.15f, 24.81f);
        pathBuilder.arcTo(12.13f, 12.13f, 0.0f, false, true, 91.13f, 220.0f);
        pathBuilder.arcToRelative(12.36f, 12.36f, 0.0f, false, true, -5.0f, -1.0f);
        pathBuilder.lineToRelative(-67.0f, -29.71f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -6.8f, -13.88f);
        pathBuilder.lineTo(41.9f, 59.0f);
        pathBuilder.arcToRelative(12.06f, 12.06f, 0.0f, false, true, 9.77f, -8.91f);
        pathBuilder.lineToRelative(36.06f, -5.92f);
        pathBuilder.arcToRelative(12.18f, 12.18f, 0.0f, false, true, 13.73f, 8.91f);
        pathBuilder.lineToRelative(4.12f, 16.22f);
        pathBuilder.arcToRelative(195.47f, 195.47f, 0.0f, false, true, 44.84f, 0.0f);
        pathBuilder.lineToRelative(4.12f, -16.22f);
        pathBuilder.arcToRelative(12.18f, 12.18f, 0.0f, false, true, 13.73f, -8.91f);
        pathBuilder.lineToRelative(36.06f, 5.92f);
        pathBuilder.arcTo(12.06f, 12.06f, 0.0f, false, true, 214.1f, 59.0f);
        pathBuilder.lineToRelative(29.53f, 116.38f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 236.83f, 189.25f);
        pathBuilder.close();
        pathBuilder.moveTo(235.83f, 177.34f);
        pathBuilder.lineTo(206.35f, 61.0f);
        pathBuilder.arcTo(4.07f, 4.07f, 0.0f, false, false, 203.0f, 58.0f);
        pathBuilder.lineTo(167.0f, 52.05f);
        pathBuilder.arcToRelative(4.15f, 4.15f, 0.0f, false, false, -4.69f, 3.0f);
        pathBuilder.lineTo(158.4f, 70.38f);
        pathBuilder.arcToRelative(166.74f, 166.74f, 0.0f, false, true, 18.68f, 4.08f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -2.16f, 7.7f);
        pathBuilder.arcTo(176.21f, 176.21f, 0.0f, false, false, 128.0f, 76.0f);
        pathBuilder.arcToRelative(176.21f, 176.21f, 0.0f, false, false, -46.92f, 6.16f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -2.16f, -7.7f);
        pathBuilder.arcTo(166.74f, 166.74f, 0.0f, false, true, 97.6f, 70.38f);
        pathBuilder.lineTo(93.71f, 55.0f);
        pathBuilder.arcToRelative(4.15f, 4.15f, 0.0f, false, false, -4.69f, -3.0f);
        pathBuilder.lineTo(53.0f, 58.0f);
        pathBuilder.arcToRelative(4.07f, 4.07f, 0.0f, false, false, -3.31f, 3.0f);
        pathBuilder.lineTo(20.12f, 177.34f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.29f, 4.59f);
        pathBuilder.lineToRelative(67.0f, 29.71f);
        pathBuilder.arcToRelative(4.16f, 4.16f, 0.0f, false, false, 3.35f, 0.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 95.0f, 209.35f);
        pathBuilder.lineToRelative(8.45f, -22.88f);
        pathBuilder.arcToRelative(171.49f, 171.49f, 0.0f, false, true, -24.53f, -4.92f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.16f, -7.71f);
        pathBuilder.arcTo(176.21f, 176.21f, 0.0f, false, false, 128.0f, 180.0f);
        pathBuilder.arcToRelative(176.21f, 176.21f, 0.0f, false, false, 46.92f, -6.16f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.16f, 7.71f);
        pathBuilder.arcToRelative(171.49f, 171.49f, 0.0f, false, true, -24.53f, 4.92f);
        pathBuilder.lineTo(161.0f, 209.35f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.23f, 2.32f);
        pathBuilder.arcToRelative(4.16f, 4.16f, 0.0f, false, false, 3.35f, 0.0f);
        pathBuilder.lineToRelative(67.0f, -29.71f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 235.88f, 177.34f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _discordLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
