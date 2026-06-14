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

/* compiled from: Chefhat.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ChefHat", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getChefHat", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_chefHat", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChefhatKt {
    private static ImageVector _chefHat;

    public static final ImageVector getChefHat(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _chefHat;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ChefHat", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(238.0f, 112.0f);
        pathBuilder.arcToRelative(54.06f, 54.06f, 0.0f, false, false, -54.0f, -54.0f);
        pathBuilder.arcToRelative(54.6f, 54.6f, 0.0f, false, false, -6.52f, 0.4f);
        pathBuilder.arcToRelative(54.0f, 54.0f, 0.0f, false, false, -99.0f, 0.0f);
        pathBuilder.arcTo(54.6f, 54.6f, 0.0f, false, false, 72.0f, 58.0f);
        pathBuilder.arcTo(54.0f, 54.0f, 0.0f, false, false, 50.0f, 161.3f);
        pathBuilder.lineTo(50.0f, 208.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.lineTo(192.0f, 222.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f);
        pathBuilder.lineTo(206.0f, 161.3f);
        pathBuilder.arcTo(54.07f, 54.07f, 0.0f, false, false, 238.0f, 112.0f);
        pathBuilder.close();
        pathBuilder.moveTo(194.0f, 208.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f);
        pathBuilder.lineTo(64.0f, 210.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f);
        pathBuilder.lineTo(62.0f, 165.06f);
        pathBuilder.arcTo(54.0f, 54.0f, 0.0f, false, false, 72.0f, 166.0f);
        pathBuilder.lineTo(184.0f, 166.0f);
        pathBuilder.arcToRelative(54.0f, 54.0f, 0.0f, false, false, 10.0f, -0.94f);
        pathBuilder.close();
        pathBuilder.moveTo(184.0f, 154.0f);
        pathBuilder.lineTo(167.69f, 154.0f);
        pathBuilder.lineToRelative(6.13f, -24.54f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -11.64f, -2.92f);
        pathBuilder.lineTo(155.31f, 154.0f);
        pathBuilder.lineTo(134.0f, 154.0f);
        pathBuilder.lineTo(134.0f, 128.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.verticalLineToRelative(26.0f);
        pathBuilder.lineTo(100.69f, 154.0f);
        pathBuilder.lineToRelative(-6.87f, -27.46f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -11.64f, 2.92f);
        pathBuilder.lineTo(88.31f, 154.0f);
        pathBuilder.lineTo(72.0f, 154.0f);
        pathBuilder.arcToRelative(42.0f, 42.0f, 0.0f, false, true, 0.0f, -84.0f);
        pathBuilder.curveToRelative(1.0f, 0.0f, 2.0f, 0.0f, 2.92f, 0.11f);
        pathBuilder.arcTo(54.63f, 54.63f, 0.0f, false, false, 74.0f, 80.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.arcToRelative(42.0f, 42.0f, 0.0f, false, true, 84.0f, 0.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.arcToRelative(54.63f, 54.63f, 0.0f, false, false, -0.92f, -9.89f);
        pathBuilder.curveToRelative(1.0f, -0.06f, 1.94f, -0.11f, 2.92f, -0.11f);
        pathBuilder.arcToRelative(42.0f, 42.0f, 0.0f, false, true, 0.0f, 84.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _chefHat = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
