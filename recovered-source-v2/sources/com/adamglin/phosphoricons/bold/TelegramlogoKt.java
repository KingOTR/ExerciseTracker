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

/* compiled from: Telegramlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TelegramLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getTelegramLogo", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_telegramLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TelegramlogoKt {
    private static ImageVector _telegramLogo;

    public static final ImageVector getTelegramLogo(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(231.49f, 23.16f);
        pathBuilder.arcToRelative(13.0f, 13.0f, 0.0f, false, false, -13.23f, -2.26f);
        pathBuilder.lineTo(15.6f, 100.21f);
        pathBuilder.arcToRelative(18.22f, 18.22f, 0.0f, false, false, 3.12f, 34.86f);
        pathBuilder.lineTo(68.0f, 144.74f);
        pathBuilder.lineTo(68.0f, 200.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 34.4f, 13.88f);
        pathBuilder.lineToRelative(22.67f, -23.51f);
        pathBuilder.lineTo(162.35f, 223.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 32.7f, -10.54f);
        pathBuilder.lineTo(235.67f, 35.91f);
        pathBuilder.arcTo(13.0f, 13.0f, 0.0f, false, false, 231.49f, 23.16f);
        pathBuilder.close();
        pathBuilder.moveTo(139.41f, 77.52f);
        pathBuilder.lineTo(77.22f, 122.09f);
        pathBuilder.lineToRelative(-34.43f, -6.75f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 190.06f);
        pathBuilder.lineTo(92.0f, 161.35f);
        pathBuilder.lineToRelative(15.0f, 13.15f);
        pathBuilder.close();
        pathBuilder.moveTo(173.16f, 200.58f);
        pathBuilder.lineTo(99.28f, 135.81f);
        pathBuilder.lineTo(205.59f, 59.63f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _telegramLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
