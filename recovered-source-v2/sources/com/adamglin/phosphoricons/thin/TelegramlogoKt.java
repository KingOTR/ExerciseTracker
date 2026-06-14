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

/* compiled from: Telegramlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TelegramLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getTelegramLogo", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_telegramLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TelegramlogoKt {
    private static ImageVector _telegramLogo;

    public static final ImageVector getTelegramLogo(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _telegramLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("TelegramLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(226.27f, 29.22f);
        pathBuilder.arcToRelative(5.0f, 5.0f, 0.0f, false, false, -5.1f, -0.87f);
        pathBuilder.lineTo(18.51f, 107.66f);
        pathBuilder.arcToRelative(10.22f, 10.22f, 0.0f, false, false, 1.75f, 19.56f);
        pathBuilder.lineTo(76.0f, 138.16f);
        pathBuilder.lineTo(76.0f, 200.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 7.51f, 11.13f);
        pathBuilder.arcTo(12.1f, 12.1f, 0.0f, false, false, 88.0f, 212.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.62f, -3.68f);
        pathBuilder.lineToRelative(28.0f, -29.0f);
        pathBuilder.lineToRelative(43.0f, 37.71f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 7.89f, 3.0f);
        pathBuilder.arcToRelative(12.47f, 12.47f, 0.0f, false, false, 3.74f, -0.59f);
        pathBuilder.arcToRelative(11.87f, 11.87f, 0.0f, false, false, 8.0f, -8.72f);
        pathBuilder.lineTo(227.87f, 34.12f);
        pathBuilder.arcTo(5.0f, 5.0f, 0.0f, false, false, 226.27f, 29.22f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 117.38f);
        pathBuilder.arcToRelative(2.13f, 2.13f, 0.0f, false, true, 1.42f, -2.27f);
        pathBuilder.lineTo(196.07f, 46.76f);
        pathBuilder.lineToRelative(-117.0f, 83.85f);
        pathBuilder.lineTo(21.81f, 119.37f);
        pathBuilder.arcTo(2.12f, 2.12f, 0.0f, false, true, 20.0f, 117.38f);
        pathBuilder.close();
        pathBuilder.moveTo(90.87f, 202.76f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 84.0f, 200.0f);
        pathBuilder.lineTo(84.0f, 143.7f);
        pathBuilder.lineTo(118.58f, 174.0f);
        pathBuilder.close();
        pathBuilder.moveTo(179.45f, 208.9f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.57f, 2.09f);
        pathBuilder.lineTo(86.43f, 135.18f);
        pathBuilder.lineTo(218.13f, 40.8f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _telegramLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
