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

/* compiled from: Skull.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Skull", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getSkull", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_skull", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SkullKt {
    private static ImageVector _skull;

    public static final ImageVector getSkull(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _skull;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Skull", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(92.0f, 106.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, true, false, 26.0f, 26.0f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, false, 92.0f, 106.0f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 146.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, -14.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 92.0f, 146.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 106.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, true, false, 26.0f, 26.0f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, false, 164.0f, 106.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 146.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, -14.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 164.0f, 146.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 18.0f);
        pathBuilder.curveTo(71.76f, 18.0f, 26.0f, 62.0f, 26.0f, 116.0f);
        pathBuilder.curveToRelative(0.0f, 33.77f, 18.3f, 65.31f, 48.0f, 83.15f);
        pathBuilder.lineTo(74.0f, 216.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f);
        pathBuilder.lineTo(182.0f, 199.15f);
        pathBuilder.curveToRelative(29.7f, -17.84f, 48.0f, -49.38f, 48.0f, -83.15f);
        pathBuilder.curveTo(230.0f, 62.0f, 184.24f, 18.0f, 128.0f, 18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(173.09f, 190.44f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.09f, 5.25f);
        pathBuilder.lineTo(170.0f, 216.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f);
        pathBuilder.lineTo(150.0f, 218.0f);
        pathBuilder.lineTo(150.0f, 192.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.verticalLineToRelative(26.0f);
        pathBuilder.lineTo(118.0f, 218.0f);
        pathBuilder.lineTo(118.0f, 192.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.verticalLineToRelative(26.0f);
        pathBuilder.lineTo(88.0f, 218.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f);
        pathBuilder.lineTo(86.0f, 195.69f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.09f, -5.25f);
        pathBuilder.curveTo(55.21f, 175.09f, 38.0f, 146.56f, 38.0f, 116.0f);
        pathBuilder.curveToRelative(0.0f, -47.42f, 40.37f, -86.0f, 90.0f, -86.0f);
        pathBuilder.reflectiveCurveToRelative(90.0f, 38.58f, 90.0f, 86.0f);
        pathBuilder.curveTo(218.0f, 146.56f, 200.79f, 175.09f, 173.09f, 190.44f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _skull = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
