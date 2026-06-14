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

/* compiled from: Coffee.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Coffee", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getCoffee", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_coffee", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CoffeeKt {
    private static ImageVector _coffee;

    public static final ImageVector getCoffee(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _coffee;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Coffee", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(82.0f, 56.0f);
        pathBuilder.lineTo(82.0f, 24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f);
        pathBuilder.lineTo(94.0f, 56.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(120.0f, 62.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f);
        pathBuilder.lineTo(126.0f, 24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.lineTo(114.0f, 56.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 120.0f, 62.0f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 62.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f);
        pathBuilder.lineTo(158.0f, 24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.lineTo(146.0f, 56.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 152.0f, 62.0f);
        pathBuilder.close();
        pathBuilder.moveTo(246.0f, 120.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, true, -36.94f, 38.0f);
        pathBuilder.arcToRelative(94.55f, 94.55f, 0.0f, false, true, -31.13f, 44.0f);
        pathBuilder.lineTo(208.0f, 210.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f);
        pathBuilder.lineTo(32.0f, 222.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.lineTo(62.07f, 210.0f);
        pathBuilder.arcTo(94.34f, 94.34f, 0.0f, false, true, 26.0f, 136.0f);
        pathBuilder.lineTo(26.0f, 88.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f);
        pathBuilder.lineTo(208.0f, 82.0f);
        pathBuilder.arcTo(38.0f, 38.0f, 0.0f, false, true, 246.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(202.0f, 136.0f);
        pathBuilder.lineTo(202.0f, 94.0f);
        pathBuilder.lineTo(38.0f, 94.0f);
        pathBuilder.verticalLineToRelative(42.0f);
        pathBuilder.arcToRelative(82.27f, 82.27f, 0.0f, false, false, 46.67f, 74.0f);
        pathBuilder.horizontalLineToRelative(70.66f);
        pathBuilder.arcTo(82.27f, 82.27f, 0.0f, false, false, 202.0f, 136.0f);
        pathBuilder.close();
        pathBuilder.moveTo(234.0f, 120.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, false, -20.0f, -25.29f);
        pathBuilder.lineTo(214.0f, 136.0f);
        pathBuilder.arcToRelative(93.18f, 93.18f, 0.0f, false, true, -1.69f, 17.64f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, false, 234.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _coffee = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
