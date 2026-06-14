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

/* compiled from: Telegramlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TelegramLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getTelegramLogo", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_telegramLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TelegramlogoKt {
    private static ImageVector _telegramLogo;

    public static final ImageVector getTelegramLogo(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(227.57f, 27.7f);
        pathBuilder.arcToRelative(7.0f, 7.0f, 0.0f, false, false, -7.13f, -1.22f);
        pathBuilder.lineTo(17.78f, 105.79f);
        pathBuilder.arcToRelative(12.23f, 12.23f, 0.0f, false, false, 2.1f, 23.39f);
        pathBuilder.lineTo(74.0f, 139.81f);
        pathBuilder.lineTo(74.0f, 200.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 24.08f, 9.71f);
        pathBuilder.lineToRelative(26.64f, -27.63f);
        pathBuilder.lineToRelative(41.58f, 36.45f);
        pathBuilder.arcToRelative(13.9f, 13.9f, 0.0f, false, false, 9.2f, 3.49f);
        pathBuilder.arcToRelative(14.33f, 14.33f, 0.0f, false, false, 4.36f, -0.69f);
        pathBuilder.arcToRelative(13.86f, 13.86f, 0.0f, false, false, 9.34f, -10.17f);
        pathBuilder.lineTo(229.82f, 34.57f);
        pathBuilder.arcTo(7.0f, 7.0f, 0.0f, false, false, 227.57f, 27.7f);
        pathBuilder.close();
        pathBuilder.moveTo(22.05f, 117.37f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(0.46f, 0.46f, 0.0f, false, true, 0.0f, -0.32f);
        pathBuilder.arcToRelative(0.51f, 0.51f, 0.0f, false, true, 0.15f, -0.08f);
        pathBuilder.lineTo(181.91f, 54.45f);
        pathBuilder.lineToRelative(-103.3f, 74.0f);
        pathBuilder.lineTo(22.2f, 117.41f);
        pathBuilder.close();
        pathBuilder.moveTo(89.44f, 201.37f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 86.0f, 200.0f);
        pathBuilder.lineTo(86.0f, 148.11f);
        pathBuilder.lineToRelative(29.69f, 26.0f);
        pathBuilder.close();
        pathBuilder.moveTo(177.51f, 208.45f);
        pathBuilder.arcToRelative(1.93f, 1.93f, 0.0f, false, true, -1.34f, 1.44f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -0.4f);
        pathBuilder.lineTo(89.64f, 135.34f);
        pathBuilder.lineTo(215.0f, 45.5f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _telegramLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
