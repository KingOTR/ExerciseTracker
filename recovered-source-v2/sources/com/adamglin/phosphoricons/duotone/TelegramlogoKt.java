package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Telegramlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TelegramLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getTelegramLogo", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_telegramLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TelegramlogoKt {
    private static ImageVector _telegramLogo;

    public static final ImageVector getTelegramLogo(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(223.41f, 32.09f);
        pathBuilder.lineTo(80.0f, 134.87f);
        pathBuilder.lineTo(21.0f, 123.3f);
        pathBuilder.arcTo(6.23f, 6.23f, 0.0f, false, true, 20.0f, 111.38f);
        pathBuilder.lineTo(222.63f, 32.07f);
        pathBuilder.arcTo(1.0f, 1.0f, 0.0f, false, true, 223.41f, 32.09f);
        pathBuilder.close();
        pathBuilder.moveTo(80.0f, 200.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.76f, 5.56f);
        pathBuilder.lineToRelative(30.61f, -31.76f);
        pathBuilder.lineTo(80.0f, 134.87f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(228.88f, 26.19f);
        pathBuilder2.arcToRelative(9.0f, 9.0f, 0.0f, false, false, -9.16f, -1.57f);
        pathBuilder2.lineTo(17.06f, 103.93f);
        pathBuilder2.arcToRelative(14.22f, 14.22f, 0.0f, false, false, 2.43f, 27.21f);
        pathBuilder2.lineTo(72.0f, 141.45f);
        pathBuilder2.lineTo(72.0f, 200.0f);
        pathBuilder2.arcToRelative(15.92f, 15.92f, 0.0f, false, false, 10.0f, 14.83f);
        pathBuilder2.arcToRelative(15.91f, 15.91f, 0.0f, false, false, 17.51f, -3.73f);
        pathBuilder2.lineToRelative(25.32f, -26.26f);
        pathBuilder2.lineTo(165.0f, 220.0f);
        pathBuilder2.arcToRelative(15.88f, 15.88f, 0.0f, false, false, 10.51f, 4.0f);
        pathBuilder2.arcToRelative(16.3f, 16.3f, 0.0f, false, false, 5.0f, -0.79f);
        pathBuilder2.arcToRelative(15.85f, 15.85f, 0.0f, false, false, 10.67f, -11.63f);
        pathBuilder2.lineTo(231.77f, 35.0f);
        pathBuilder2.arcTo(9.0f, 9.0f, 0.0f, false, false, 228.88f, 26.19f);
        pathBuilder2.close();
        pathBuilder2.moveTo(78.15f, 126.35f);
        pathBuilder2.lineToRelative(-49.61f, -9.73f);
        pathBuilder2.lineToRelative(139.2f, -54.48f);
        pathBuilder2.close();
        pathBuilder2.moveTo(88.0f, 200.0f);
        pathBuilder2.lineTo(88.0f, 152.52f);
        pathBuilder2.lineToRelative(24.79f, 21.74f);
        pathBuilder2.close();
        pathBuilder2.moveTo(175.53f, 208.0f);
        pathBuilder2.lineTo(92.85f, 135.5f);
        pathBuilder2.lineToRelative(119.0f, -85.29f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _telegramLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
