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

/* compiled from: Wechatlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"WechatLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getWechatLogo", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_wechatLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WechatlogoKt {
    private static ImageVector _wechatLogo;

    public static final ImageVector getWechatLogo(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(152.0f, 144.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 152.0f, 144.0f);
        pathBuilder.close();
        pathBuilder.moveTo(184.0f, 128.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 184.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(243.18f, 210.35f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -24.83f, 24.83f);
        pathBuilder.lineToRelative(-23.26f, -6.84f);
        pathBuilder.arcTo(84.0f, 84.0f, 0.0f, false, true, 83.72f, 187.11f);
        pathBuilder.arcToRelative(83.2f, 83.2f, 0.0f, false, true, -22.82f, -6.77f);
        pathBuilder.lineToRelative(-23.25f, 6.84f);
        pathBuilder.arcTo(20.24f, 20.24f, 0.0f, false, true, 32.0f, 188.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -19.19f, -25.64f);
        pathBuilder.lineToRelative(6.84f, -23.26f);
        pathBuilder.arcTo(84.0f, 84.0f, 0.0f, false, true, 172.33f, 68.91f);
        pathBuilder.arcToRelative(84.0f, 84.0f, 0.0f, false, true, 64.0f, 118.18f);
        pathBuilder.close();
        pathBuilder.moveTo(76.46f, 160.75f);
        pathBuilder.arcTo(83.94f, 83.94f, 0.0f, false, true, 145.0f, 69.37f);
        pathBuilder.arcTo(60.0f, 60.0f, 0.0f, false, false, 43.08f, 132.3f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.93f, 9.06f);
        pathBuilder.lineToRelative(-6.09f, 20.72f);
        pathBuilder.lineTo(58.64f, 156.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 9.06f, 0.93f);
        pathBuilder.arcTo(60.08f, 60.08f, 0.0f, false, false, 76.46f, 160.75f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 152.0f);
        pathBuilder.arcToRelative(60.0f, 60.0f, 0.0f, true, false, -31.7f, 52.92f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 9.06f, -0.93f);
        pathBuilder.lineToRelative(20.72f, 6.09f);
        pathBuilder.lineTo(212.0f, 189.36f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.93f, -9.06f);
        pathBuilder.arcTo(60.09f, 60.09f, 0.0f, false, false, 220.0f, 152.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _wechatLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
