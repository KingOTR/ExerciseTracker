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

/* compiled from: Telegramlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TelegramLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getTelegramLogo", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_telegramLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TelegramlogoKt {
    private static ImageVector _telegramLogo;

    public static final ImageVector getTelegramLogo(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(228.88f, 26.19f);
        pathBuilder.arcToRelative(9.0f, 9.0f, 0.0f, false, false, -9.16f, -1.57f);
        pathBuilder.lineTo(17.06f, 103.93f);
        pathBuilder.arcToRelative(14.22f, 14.22f, 0.0f, false, false, 2.43f, 27.21f);
        pathBuilder.lineTo(72.0f, 141.45f);
        pathBuilder.verticalLineTo(200.0f);
        pathBuilder.arcToRelative(15.92f, 15.92f, 0.0f, false, false, 10.0f, 14.83f);
        pathBuilder.arcToRelative(15.91f, 15.91f, 0.0f, false, false, 17.51f, -3.73f);
        pathBuilder.lineToRelative(25.32f, -26.26f);
        pathBuilder.lineTo(165.0f, 220.0f);
        pathBuilder.arcToRelative(15.88f, 15.88f, 0.0f, false, false, 10.51f, 4.0f);
        pathBuilder.arcToRelative(16.3f, 16.3f, 0.0f, false, false, 5.0f, -0.79f);
        pathBuilder.arcToRelative(15.85f, 15.85f, 0.0f, false, false, 10.67f, -11.63f);
        pathBuilder.lineTo(231.77f, 35.0f);
        pathBuilder.arcTo(9.0f, 9.0f, 0.0f, false, false, 228.88f, 26.19f);
        pathBuilder.close();
        pathBuilder.moveTo(175.53f, 208.0f);
        pathBuilder.lineTo(92.85f, 135.5f);
        pathBuilder.lineToRelative(119.0f, -85.29f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _telegramLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
