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

/* compiled from: Wechatlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"WechatLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getWechatLogo", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_wechatLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WechatlogoKt {
    private static ImageVector _wechatLogo;

    public static final ImageVector getWechatLogo(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _wechatLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("WechatLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(142.0f, 140.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 142.0f, 140.0f);
        pathBuilder.close();
        pathBuilder.moveTo(188.0f, 130.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, false, 188.0f, 130.0f);
        pathBuilder.close();
        pathBuilder.moveTo(237.42f, 212.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 220.0f, 229.42f);
        pathBuilder.lineToRelative(-25.46f, -7.49f);
        pathBuilder.arcTo(78.0f, 78.0f, 0.0f, false, true, 87.84f, 181.58f);
        pathBuilder.arcToRelative(77.0f, 77.0f, 0.0f, false, true, -26.42f, -7.65f);
        pathBuilder.lineTo(36.0f, 181.42f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 18.58f, 164.0f);
        pathBuilder.lineToRelative(7.49f, -25.46f);
        pathBuilder.arcTo(78.0f, 78.0f, 0.0f, true, true, 168.19f, 74.43f);
        pathBuilder.arcToRelative(78.0f, 78.0f, 0.0f, false, true, 61.74f, 112.15f);
        pathBuilder.close();
        pathBuilder.moveTo(83.86f, 168.87f);
        pathBuilder.arcToRelative(77.92f, 77.92f, 0.0f, false, true, 71.0f, -94.68f);
        pathBuilder.arcToRelative(66.0f, 66.0f, 0.0f, true, false, -117.1f, 60.94f);
        pathBuilder.arcToRelative(6.05f, 6.05f, 0.0f, false, true, 0.47f, 4.53f);
        pathBuilder.lineToRelative(-8.17f, 27.76f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.48f, 2.49f);
        pathBuilder.lineToRelative(27.77f, -8.17f);
        pathBuilder.arcToRelative(6.06f, 6.06f, 0.0f, false, true, 4.53f, 0.47f);
        pathBuilder.arcTo(65.2f, 65.2f, 0.0f, false, false, 83.86f, 168.87f);
        pathBuilder.close();
        pathBuilder.moveTo(218.21f, 183.13f);
        pathBuilder.arcToRelative(66.0f, 66.0f, 0.0f, true, false, -27.08f, 27.08f);
        pathBuilder.arcToRelative(6.06f, 6.06f, 0.0f, false, true, 4.53f, -0.47f);
        pathBuilder.lineToRelative(27.77f, 8.17f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.48f, -2.48f);
        pathBuilder.lineToRelative(-8.17f, -27.77f);
        pathBuilder.arcTo(6.05f, 6.05f, 0.0f, false, true, 218.21f, 183.13f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _wechatLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
