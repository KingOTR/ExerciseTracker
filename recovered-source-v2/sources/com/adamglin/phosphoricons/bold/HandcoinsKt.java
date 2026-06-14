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

/* compiled from: Handcoins.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HandCoins", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getHandCoins", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_handCoins", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HandcoinsKt {
    private static ImageVector _handCoins;

    public static final ImageVector getHandCoins(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(232.76f, 137.88f);
        pathBuilder.arcTo(28.39f, 28.39f, 0.0f, false, false, 208.13f, 133.0f);
        pathBuilder.lineTo(172.0f, 141.26f);
        pathBuilder.curveToRelative(0.0f, -0.42f, 0.0f, -0.84f, 0.0f, -1.26f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, -32.0f);
        pathBuilder.lineTo(89.94f, 108.0f);
        pathBuilder.arcToRelative(35.76f, 35.76f, 0.0f, false, false, -25.45f, 10.54f);
        pathBuilder.lineTo(43.0f, 140.0f);
        pathBuilder.lineTo(20.0f, 140.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 0.0f, 160.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f);
        pathBuilder.lineTo(120.0f, 220.0f);
        pathBuilder.arcToRelative(11.89f, 11.89f, 0.0f, false, false, 2.91f, -0.36f);
        pathBuilder.lineToRelative(64.0f, -16.0f);
        pathBuilder.arcToRelative(11.4f, 11.4f, 0.0f, false, false, 1.79f, -0.6f);
        pathBuilder.lineToRelative(38.82f, -16.54f);
        pathBuilder.curveToRelative(0.23f, -0.09f, 0.45f, -0.19f, 0.67f, -0.3f);
        pathBuilder.arcToRelative(28.61f, 28.61f, 0.0f, false, false, 4.57f, -48.32f);
        pathBuilder.close();
        pathBuilder.moveTo(36.0f, 196.0f);
        pathBuilder.lineTo(24.0f, 196.0f);
        pathBuilder.lineTo(24.0f, 164.0f);
        pathBuilder.lineTo(36.0f, 164.0f);
        pathBuilder.close();
        pathBuilder.moveTo(217.68f, 164.61f);
        pathBuilder.lineTo(180.17f, 180.61f);
        pathBuilder.lineTo(118.52f, 196.0f);
        pathBuilder.lineTo(60.0f, 196.0f);
        pathBuilder.lineTo(60.0f, 157.0f);
        pathBuilder.lineToRelative(21.46f, -21.46f);
        pathBuilder.arcTo(11.93f, 11.93f, 0.0f, false, true, 89.94f, 132.0f);
        pathBuilder.lineTo(140.0f, 132.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder.lineTo(112.0f, 148.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.arcToRelative(12.19f, 12.19f, 0.0f, false, false, 2.69f, -0.3f);
        pathBuilder.lineToRelative(67.0f, -15.41f);
        pathBuilder.lineToRelative(0.47f, -0.12f);
        pathBuilder.arcToRelative(4.61f, 4.61f, 0.0f, false, true, 5.82f, 4.44f);
        pathBuilder.arcTo(4.58f, 4.58f, 0.0f, false, true, 217.68f, 164.61f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 100.0f);
        pathBuilder.arcToRelative(40.36f, 40.36f, 0.0f, false, false, 5.18f, -0.34f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, false, 29.67f, -59.32f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, true, false, 164.0f, 100.0f);
        pathBuilder.close();
        pathBuilder.moveTo(204.0f, 64.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 204.0f, 64.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 44.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 12.94f, 6.58f);
        pathBuilder.arcTo(39.9f, 39.9f, 0.0f, false, false, 164.2f, 76.0f);
        pathBuilder.lineTo(164.0f, 76.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -32.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _handCoins = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
