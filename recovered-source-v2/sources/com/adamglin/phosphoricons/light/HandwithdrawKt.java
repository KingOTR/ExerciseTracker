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

/* compiled from: Handwithdraw.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HandWithdraw", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getHandWithdraw", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_handWithdraw", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HandwithdrawKt {
    private static ImageVector _handWithdraw;

    public static final ImageVector getHandWithdraw(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _handWithdraw;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HandWithdraw", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(230.0f, 198.65f);
        pathBuilder.lineTo(230.0f, 240.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.lineTo(218.0f, 198.65f);
        pathBuilder.arcToRelative(76.83f, 76.83f, 0.0f, false, false, -28.0f, -59.08f);
        pathBuilder.verticalLineToRelative(62.74f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -11.0f, 3.28f);
        pathBuilder.lineToRelative(-10.68f, -16.3f);
        pathBuilder.arcToRelative(2.75f, 2.75f, 0.0f, false, true, -0.17f, -0.29f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -24.33f, 13.87f);
        pathBuilder.lineTo(166.0f, 236.71f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -10.0f, 6.58f);
        pathBuilder.lineToRelative(-22.26f, -34.0f);
        pathBuilder.curveToRelative(-0.06f, -0.1f, -0.12f, -0.19f, -0.17f, -0.29f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, true, 178.0f, 182.14f);
        pathBuilder.lineTo(178.0f, 64.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f);
        pathBuilder.lineTo(160.0f, 62.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, 14.0f, 14.0f);
        pathBuilder.verticalLineToRelative(60.69f);
        pathBuilder.arcTo(88.88f, 88.88f, 0.0f, false, true, 230.0f, 198.65f);
        pathBuilder.close();
        pathBuilder.moveTo(86.0f, 56.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f);
        pathBuilder.lineTo(64.0f, 50.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 50.0f, 64.0f);
        pathBuilder.lineTo(50.0f, 200.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.lineTo(62.0f, 64.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f);
        pathBuilder.lineTo(80.0f, 62.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 86.0f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(156.24f, 99.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 0.0f);
        pathBuilder.lineTo(126.0f, 121.51f);
        pathBuilder.lineTo(126.0f, 16.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.lineTo(114.0f, 121.51f);
        pathBuilder.lineTo(92.24f, 99.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 8.48f);
        pathBuilder.lineToRelative(32.0f, 32.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, 0.0f);
        pathBuilder.lineToRelative(32.0f, -32.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 156.24f, 99.76f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _handWithdraw = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
