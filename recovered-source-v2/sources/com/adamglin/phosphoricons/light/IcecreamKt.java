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

/* compiled from: Icecream.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"IceCream", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getIceCream", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_iceCream", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IcecreamKt {
    private static ImageVector _iceCream;

    public static final ImageVector getIceCream(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _iceCream;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("IceCream", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(206.0f, 98.83f);
        pathBuilder.lineTo(206.0f, 96.0f);
        pathBuilder.arcTo(78.0f, 78.0f, 0.0f, false, false, 50.0f, 96.0f);
        pathBuilder.verticalLineToRelative(2.83f);
        pathBuilder.arcTo(22.0f, 22.0f, 0.0f, false, false, 56.0f, 142.0f);
        pathBuilder.horizontalLineToRelative(4.45f);
        pathBuilder.lineTo(115.84f, 239.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 24.32f, 0.0f);
        pathBuilder.lineTo(195.55f, 142.0f);
        pathBuilder.lineTo(200.0f, 142.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, false, 6.0f, -43.17f);
        pathBuilder.close();
        pathBuilder.moveTo(129.74f, 233.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.48f, 0.0f);
        pathBuilder.lineToRelative(-52.0f, -91.0f);
        pathBuilder.horizontalLineToRelative(24.0f);
        pathBuilder.lineTo(140.0f, 215.06f);
        pathBuilder.close();
        pathBuilder.moveTo(136.0f, 142.0f);
        pathBuilder.lineToRelative(22.89f, 40.06f);
        pathBuilder.lineToRelative(-12.0f, 20.91f);
        pathBuilder.lineToRelative(-34.84f, -61.0f);
        pathBuilder.close();
        pathBuilder.moveTo(165.8f, 170.0f);
        pathBuilder.lineTo(149.8f, 142.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 130.0f);
        pathBuilder.lineTo(56.0f, 130.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, -20.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f);
        pathBuilder.lineTo(62.0f, 96.0f);
        pathBuilder.arcToRelative(66.0f, 66.0f, 0.0f, false, true, 132.0f, 0.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, 20.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _iceCream = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
