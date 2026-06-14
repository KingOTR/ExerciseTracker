package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Beerstein.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BeerStein", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getBeerStein", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_beerStein", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BeersteinKt {
    private static ImageVector _beerStein;

    public static final ImageVector getBeerStein(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(104.0f, 104.0f);
        pathBuilder.verticalLineToRelative(80.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.lineTo(88.0f, 104.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(144.0f, 96.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder.verticalLineToRelative(80.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.lineTo(152.0f, 104.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 144.0f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(240.0f, 112.0f);
        pathBuilder.verticalLineToRelative(64.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, 24.0f);
        pathBuilder.lineTo(200.0f, 200.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f);
        pathBuilder.lineTo(56.0f, 224.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f);
        pathBuilder.lineTo(40.0f, 72.0f);
        pathBuilder.curveToRelative(0.0f, -30.88f, 28.71f, -56.0f, 64.0f, -56.0f);
        pathBuilder.curveToRelative(16.77f, 0.0f, 32.91f, 5.8f, 44.82f, 16.0f);
        pathBuilder.lineTo(160.0f, 32.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, 40.0f, 40.0f);
        pathBuilder.lineTo(200.0f, 88.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 240.0f, 112.0f);
        pathBuilder.close();
        pathBuilder.moveTo(57.0f, 64.0f);
        pathBuilder.lineTo(182.62f, 64.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, false, 160.0f, 48.0f);
        pathBuilder.lineTo(145.74f, 48.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.53f, -2.22f);
        pathBuilder.curveTo(131.06f, 37.0f, 117.87f, 32.0f, 104.0f, 32.0f);
        pathBuilder.curveTo(80.82f, 32.0f, 61.43f, 45.76f, 57.0f, 64.0f);
        pathBuilder.close();
        pathBuilder.moveTo(184.0f, 208.0f);
        pathBuilder.lineTo(184.0f, 80.0f);
        pathBuilder.lineTo(56.0f, 80.0f);
        pathBuilder.lineTo(56.0f, 208.0f);
        pathBuilder.lineTo(184.0f, 208.0f);
        pathBuilder.close();
        pathBuilder.moveTo(224.0f, 112.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f);
        pathBuilder.lineTo(200.0f, 104.0f);
        pathBuilder.verticalLineToRelative(80.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _beerStein = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
