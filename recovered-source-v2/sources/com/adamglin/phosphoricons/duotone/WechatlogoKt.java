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

/* compiled from: Wechatlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"WechatLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getWechatLogo", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_wechatLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WechatlogoKt {
    private static ImageVector _wechatLogo;

    public static final ImageVector getWechatLogo(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(163.94f, 80.11f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveTo(162.63f, 80.0f, 161.32f, 80.0f, 160.0f, 80.0f);
        pathBuilder.arcToRelative(72.0f, 72.0f, 0.0f, false, false, -67.93f, 95.88f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(71.53f, 71.53f, 0.0f, false, true, -30.0f, -8.39f);
        pathBuilder.lineToRelative(-27.76f, 8.16f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -9.93f, -9.93f);
        pathBuilder.lineTo(32.5f, 138.0f);
        pathBuilder.arcTo(72.0f, 72.0f, 0.0f, true, true, 163.94f, 80.11f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(144.0f, 140.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, false, true, 144.0f, 140.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(188.0f, 128.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, false, false, 188.0f, 128.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(239.34f, 211.47f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -19.87f, 19.87f);
        pathBuilder2.lineToRelative(-24.71f, -7.27f);
        pathBuilder2.arcTo(80.0f, 80.0f, 0.0f, false, true, 86.43f, 183.42f);
        pathBuilder2.arcToRelative(79.0f, 79.0f, 0.0f, false, true, -25.19f, -7.35f);
        pathBuilder2.lineToRelative(-24.71f, 7.27f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -19.87f, -19.87f);
        pathBuilder2.lineToRelative(7.27f, -24.71f);
        pathBuilder2.arcTo(80.0f, 80.0f, 0.0f, true, true, 169.58f, 72.59f);
        pathBuilder2.arcToRelative(80.0f, 80.0f, 0.0f, false, true, 62.49f, 114.17f);
        pathBuilder2.close();
        pathBuilder2.moveTo(81.3f, 166.3f);
        pathBuilder2.arcToRelative(79.94f, 79.94f, 0.0f, false, true, 70.38f, -93.87f);
        pathBuilder2.arcTo(64.0f, 64.0f, 0.0f, false, false, 39.55f, 134.19f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.63f, 6.0f);
        pathBuilder2.lineTo(32.0f, 168.0f);
        pathBuilder2.lineToRelative(27.76f, -8.17f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.0f, 0.63f);
        pathBuilder2.arcTo(63.45f, 63.45f, 0.0f, false, false, 81.3f, 166.3f);
        pathBuilder2.close();
        pathBuilder2.moveTo(216.45f, 182.19f);
        pathBuilder2.arcToRelative(64.0f, 64.0f, 0.0f, true, false, -26.26f, 26.26f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.0f, -0.63f);
        pathBuilder2.lineTo(224.0f, 216.0f);
        pathBuilder2.lineToRelative(-8.17f, -27.76f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 216.45f, 182.19f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _wechatLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
