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

/* compiled from: Handcoins.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HandCoins", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getHandCoins", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_handCoins", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HandcoinsKt {
    private static ImageVector _handCoins;

    public static final ImageVector getHandCoins(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _handCoins;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HandCoins", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.09f, 57.38f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, 55.17f, -27.82f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.56f, 7.0f);
        pathBuilder.arcTo(52.06f, 52.06f, 0.0f, false, false, 152.0f, 84.0f);
        pathBuilder.curveToRelative(0.0f, 1.17f, 0.0f, 2.34f, 0.12f, 3.49f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.0f, 3.76f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, true, 128.09f, 57.38f);
        pathBuilder.close();
        pathBuilder.moveTo(240.0f, 160.61f);
        pathBuilder.arcToRelative(24.47f, 24.47f, 0.0f, false, true, -13.6f, 22.0f);
        pathBuilder.lineToRelative(-0.44f, 0.2f);
        pathBuilder.lineToRelative(-38.83f, 16.54f);
        pathBuilder.arcToRelative(6.94f, 6.94f, 0.0f, false, true, -1.19f, 0.4f);
        pathBuilder.lineToRelative(-64.0f, 16.0f);
        pathBuilder.arcTo(7.93f, 7.93f, 0.0f, false, true, 120.0f, 216.0f);
        pathBuilder.lineTo(16.0f, 216.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 0.0f, 200.0f);
        pathBuilder.lineTo(0.0f, 160.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f);
        pathBuilder.lineTo(44.69f, 144.0f);
        pathBuilder.lineToRelative(22.62f, -22.63f);
        pathBuilder.arcTo(31.82f, 31.82f, 0.0f, false, true, 89.94f, 112.0f);
        pathBuilder.lineTo(140.0f, 112.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 27.25f, 34.45f);
        pathBuilder.lineToRelative(41.84f, -9.62f);
        pathBuilder.arcTo(24.61f, 24.61f, 0.0f, false, true, 240.0f, 160.61f);
        pathBuilder.close();
        pathBuilder.moveTo(224.0f, 160.61f);
        pathBuilder.arcToRelative(8.61f, 8.61f, 0.0f, false, false, -10.87f, -8.3f);
        pathBuilder.lineToRelative(-0.31f, 0.08f);
        pathBuilder.lineToRelative(-67.0f, 15.41f);
        pathBuilder.arcToRelative(8.32f, 8.32f, 0.0f, false, true, -1.79f, 0.2f);
        pathBuilder.lineTo(112.0f, 168.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder.horizontalLineToRelative(28.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f);
        pathBuilder.lineTo(89.94f, 128.0f);
        pathBuilder.arcToRelative(15.86f, 15.86f, 0.0f, false, false, -11.31f, 4.69f);
        pathBuilder.lineTo(56.0f, 155.31f);
        pathBuilder.lineTo(56.0f, 200.0f);
        pathBuilder.horizontalLineToRelative(63.0f);
        pathBuilder.lineToRelative(62.43f, -15.61f);
        pathBuilder.lineToRelative(38.0f, -16.18f);
        pathBuilder.arcTo(8.56f, 8.56f, 0.0f, false, false, 224.0f, 160.61f);
        pathBuilder.close();
        pathBuilder.moveTo(168.0f, 84.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, true, false, 36.0f, -36.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, false, 168.0f, 84.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _handCoins = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
