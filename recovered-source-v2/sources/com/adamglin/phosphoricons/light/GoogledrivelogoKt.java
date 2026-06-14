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

/* compiled from: Googledrivelogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GoogleDriveLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getGoogleDriveLogo", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_googleDriveLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GoogledrivelogoKt {
    private static ImageVector _googleDriveLogo;

    public static final ImageVector getGoogleDriveLogo(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _googleDriveLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("GoogleDriveLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(235.9f, 144.82f);
        pathBuilder.lineTo(167.43f, 32.58f);
        pathBuilder.arcTo(13.91f, 13.91f, 0.0f, false, false, 155.56f, 26.0f);
        pathBuilder.lineTo(100.43f, 26.0f);
        pathBuilder.arcToRelative(13.92f, 13.92f, 0.0f, false, false, -11.87f, 6.58f);
        pathBuilder.lineToRelative(0.0f, 0.05f);
        pathBuilder.lineTo(20.13f, 144.76f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -0.28f, 14.37f);
        pathBuilder.lineTo(47.17f, 207.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 59.32f, 214.0f);
        pathBuilder.lineTo(196.67f, 214.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 208.83f, 207.0f);
        pathBuilder.lineToRelative(27.32f, -47.82f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 235.9f, 144.82f);
        pathBuilder.close();
        pathBuilder.moveTo(222.56f, 146.0f);
        pathBuilder.lineTo(171.39f, 146.0f);
        pathBuilder.lineTo(135.0f, 85.33f);
        pathBuilder.lineToRelative(25.08f, -41.79f);
        pathBuilder.close();
        pathBuilder.moveTo(98.56f, 146.0f);
        pathBuilder.lineTo(128.0f, 97.0f);
        pathBuilder.lineToRelative(29.4f, 49.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.56f, 158.0f);
        pathBuilder.lineTo(191.0f, 202.0f);
        pathBuilder.lineTo(65.0f, 202.0f);
        pathBuilder.lineToRelative(26.4f, -44.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 73.67f);
        pathBuilder.lineTo(106.6f, 38.0f);
        pathBuilder.horizontalLineToRelative(42.8f);
        pathBuilder.close();
        pathBuilder.moveTo(95.93f, 43.54f);
        pathBuilder.lineTo(121.0f, 85.33f);
        pathBuilder.lineTo(84.6f, 146.0f);
        pathBuilder.lineTo(33.43f, 146.0f);
        pathBuilder.close();
        pathBuilder.moveTo(33.0f, 158.0f);
        pathBuilder.lineTo(77.4f, 158.0f);
        pathBuilder.lineTo(54.67f, 195.89f);
        pathBuilder.close();
        pathBuilder.moveTo(201.3f, 195.89f);
        pathBuilder.lineTo(178.59f, 158.0f);
        pathBuilder.lineTo(223.0f, 158.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _googleDriveLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
