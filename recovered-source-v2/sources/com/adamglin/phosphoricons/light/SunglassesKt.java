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

/* compiled from: Sunglasses.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Sunglasses", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getSunglasses", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_sunglasses", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SunglassesKt {
    private static ImageVector _sunglasses;

    public static final ImageVector getSunglasses(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _sunglasses;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Sunglasses", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(200.0f, 42.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, false, true, 18.0f, 18.0f);
        pathBuilder.verticalLineToRelative(58.0f);
        pathBuilder.lineTo(38.0f, 130.0f);
        pathBuilder.lineTo(38.0f, 72.0f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, true, 56.0f, 54.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, false, false, 26.0f, 72.0f);
        pathBuilder.verticalLineToRelative(92.0f);
        pathBuilder.arcToRelative(42.0f, 42.0f, 0.0f, false, false, 84.0f, 0.0f);
        pathBuilder.lineTo(110.0f, 142.0f);
        pathBuilder.horizontalLineToRelative(36.0f);
        pathBuilder.verticalLineToRelative(22.0f);
        pathBuilder.arcToRelative(42.0f, 42.0f, 0.0f, false, false, 84.0f, 0.0f);
        pathBuilder.lineTo(230.0f, 72.0f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, false, false, 200.0f, 42.0f);
        pathBuilder.close();
        pathBuilder.moveTo(38.0f, 164.0f);
        pathBuilder.lineTo(38.0f, 142.48f);
        pathBuilder.lineTo(84.53f, 189.0f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, false, true, 38.0f, 164.0f);
        pathBuilder.close();
        pathBuilder.moveTo(98.0f, 164.0f);
        pathBuilder.arcToRelative(29.83f, 29.83f, 0.0f, false, true, -5.0f, 16.53f);
        pathBuilder.lineTo(54.48f, 142.0f);
        pathBuilder.lineTo(98.0f, 142.0f);
        pathBuilder.close();
        pathBuilder.moveTo(158.0f, 164.0f);
        pathBuilder.lineTo(158.0f, 142.48f);
        pathBuilder.lineTo(204.53f, 189.0f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, false, true, 158.0f, 164.0f);
        pathBuilder.close();
        pathBuilder.moveTo(213.0f, 180.53f);
        pathBuilder.lineTo(174.48f, 142.0f);
        pathBuilder.lineTo(218.0f, 142.0f);
        pathBuilder.verticalLineToRelative(22.0f);
        pathBuilder.arcTo(29.83f, 29.83f, 0.0f, false, true, 213.0f, 180.53f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _sunglasses = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
