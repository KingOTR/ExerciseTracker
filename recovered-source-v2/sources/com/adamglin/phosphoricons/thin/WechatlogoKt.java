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

/* compiled from: Wechatlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"WechatLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getWechatLogo", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_wechatLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WechatlogoKt {
    private static ImageVector _wechatLogo;

    public static final ImageVector getWechatLogo(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(140.0f, 140.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 140.0f, 140.0f);
        pathBuilder.close();
        pathBuilder.moveTo(188.0f, 132.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 188.0f, 132.0f);
        pathBuilder.close();
        pathBuilder.moveTo(235.5f, 212.6f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -14.9f, 14.9f);
        pathBuilder.lineToRelative(-26.21f, -7.71f);
        pathBuilder.arcTo(76.0f, 76.0f, 0.0f, false, true, 89.24f, 179.68f);
        pathBuilder.arcToRelative(75.0f, 75.0f, 0.0f, false, true, -27.63f, -7.89f);
        pathBuilder.lineTo(35.4f, 179.5f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -14.9f, -14.9f);
        pathBuilder.lineToRelative(7.71f, -26.21f);
        pathBuilder.arcTo(76.0f, 76.0f, 0.0f, true, true, 166.79f, 76.32f);
        pathBuilder.arcToRelative(76.0f, 76.0f, 0.0f, false, true, 61.0f, 110.07f);
        pathBuilder.close();
        pathBuilder.moveTo(86.5f, 171.32f);
        pathBuilder.arcTo(76.0f, 76.0f, 0.0f, false, true, 158.0f, 76.05f);
        pathBuilder.arcToRelative(68.0f, 68.0f, 0.0f, true, false, -122.0f, 60.0f);
        pathBuilder.arcToRelative(4.07f, 4.07f, 0.0f, false, true, 0.31f, 3.0f);
        pathBuilder.lineToRelative(-8.17f, 27.76f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.0f, 5.0f);
        pathBuilder.lineToRelative(27.76f, -8.17f);
        pathBuilder.arcToRelative(4.07f, 4.07f, 0.0f, false, true, 3.0f, 0.31f);
        pathBuilder.arcTo(66.93f, 66.93f, 0.0f, false, false, 86.5f, 171.32f);
        pathBuilder.close();
        pathBuilder.moveTo(227.83f, 214.86f);
        pathBuilder.lineTo(219.66f, 187.1f);
        pathBuilder.arcToRelative(4.07f, 4.07f, 0.0f, false, true, 0.31f, -3.0f);
        pathBuilder.arcTo(68.0f, 68.0f, 0.0f, true, false, 192.08f, 212.0f);
        pathBuilder.arcToRelative(4.07f, 4.07f, 0.0f, false, true, 1.89f, -0.47f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.13f, 0.16f);
        pathBuilder.lineToRelative(27.76f, 8.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.0f, -5.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _wechatLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
