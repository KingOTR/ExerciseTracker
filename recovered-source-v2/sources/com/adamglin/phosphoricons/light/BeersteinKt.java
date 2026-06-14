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

/* compiled from: Beerstein.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BeerStein", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getBeerStein", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_beerStein", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BeersteinKt {
    private static ImageVector _beerStein;

    public static final ImageVector getBeerStein(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _beerStein;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("BeerStein", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(216.0f, 90.0f);
        pathBuilder.lineTo(198.0f, 90.0f);
        pathBuilder.lineTo(198.0f, 72.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, false, -38.0f, -38.0f);
        pathBuilder.lineTo(148.07f, 34.0f);
        pathBuilder.curveTo(136.47f, 23.8f, 120.56f, 18.0f, 104.0f, 18.0f);
        pathBuilder.curveTo(69.81f, 18.0f, 42.0f, 42.22f, 42.0f, 72.0f);
        pathBuilder.lineTo(42.0f, 208.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.lineTo(184.0f, 222.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f);
        pathBuilder.lineTo(198.0f, 198.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, -22.0f);
        pathBuilder.lineTo(238.0f, 112.0f);
        pathBuilder.arcTo(22.0f, 22.0f, 0.0f, false, false, 216.0f, 90.0f);
        pathBuilder.close();
        pathBuilder.moveTo(104.0f, 30.0f);
        pathBuilder.curveToRelative(14.38f, 0.0f, 28.08f, 5.22f, 37.59f, 14.33f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 145.74f, 46.0f);
        pathBuilder.lineTo(160.0f, 46.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, true, 25.29f, 20.0f);
        pathBuilder.lineTo(54.52f, 66.0f);
        pathBuilder.curveTo(58.0f, 45.67f, 78.86f, 30.0f, 104.0f, 30.0f);
        pathBuilder.close();
        pathBuilder.moveTo(186.0f, 208.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f);
        pathBuilder.lineTo(56.0f, 210.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f);
        pathBuilder.lineTo(54.0f, 78.0f);
        pathBuilder.lineTo(186.0f, 78.0f);
        pathBuilder.close();
        pathBuilder.moveTo(226.0f, 176.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, 10.0f);
        pathBuilder.lineTo(198.0f, 186.0f);
        pathBuilder.lineTo(198.0f, 102.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, 10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(102.0f, 104.0f);
        pathBuilder.verticalLineToRelative(80.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.lineTo(90.0f, 104.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(150.0f, 104.0f);
        pathBuilder.verticalLineToRelative(80.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.lineTo(138.0f, 104.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _beerStein = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
