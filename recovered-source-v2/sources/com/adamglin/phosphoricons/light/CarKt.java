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

/* compiled from: Car.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Car", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getCar", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_car", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CarKt {
    private static ImageVector _car;

    public static final ImageVector getCar(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _car;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Car", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(240.0f, 106.0f);
        pathBuilder.lineTo(227.9f, 106.0f);
        pathBuilder.lineTo(199.59f, 42.31f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 186.8f, 34.0f);
        pathBuilder.lineTo(69.2f, 34.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -12.79f, 8.31f);
        pathBuilder.lineTo(28.1f, 106.0f);
        pathBuilder.lineTo(16.0f, 106.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.lineTo(26.0f, 118.0f);
        pathBuilder.verticalLineToRelative(82.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.lineTo(64.0f, 214.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f);
        pathBuilder.lineTo(78.0f, 182.0f);
        pathBuilder.lineTo(178.0f, 182.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.horizontalLineToRelative(24.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f);
        pathBuilder.lineTo(230.0f, 118.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(67.37f, 47.19f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 69.2f, 46.0f);
        pathBuilder.lineTo(186.8f, 46.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.83f, 1.19f);
        pathBuilder.lineTo(214.77f, 106.0f);
        pathBuilder.lineTo(41.23f, 106.0f);
        pathBuilder.close();
        pathBuilder.moveTo(66.0f, 200.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f);
        pathBuilder.lineTo(40.0f, 202.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f);
        pathBuilder.lineTo(38.0f, 182.0f);
        pathBuilder.lineTo(66.0f, 182.0f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 202.0f);
        pathBuilder.lineTo(192.0f, 202.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f);
        pathBuilder.lineTo(190.0f, 182.0f);
        pathBuilder.horizontalLineToRelative(28.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 216.0f, 202.0f);
        pathBuilder.close();
        pathBuilder.moveTo(218.0f, 170.0f);
        pathBuilder.lineTo(38.0f, 170.0f);
        pathBuilder.lineTo(38.0f, 118.0f);
        pathBuilder.lineTo(218.0f, 118.0f);
        pathBuilder.close();
        pathBuilder.moveTo(58.0f, 144.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f);
        pathBuilder.lineTo(80.0f, 138.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f);
        pathBuilder.lineTo(64.0f, 150.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 58.0f, 144.0f);
        pathBuilder.close();
        pathBuilder.moveTo(170.0f, 144.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f);
        pathBuilder.lineTo(176.0f, 150.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 170.0f, 144.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _car = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
