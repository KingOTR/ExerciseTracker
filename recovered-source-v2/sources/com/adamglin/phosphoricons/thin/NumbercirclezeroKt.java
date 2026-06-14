package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Numbercirclezero.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"NumberCircleZero", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getNumberCircleZero", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_numberCircleZero", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NumbercirclezeroKt {
    private static ImageVector _numberCircleZero;

    public static final ImageVector getNumberCircleZero(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _numberCircleZero;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("NumberCircleZero", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 28.0f);
        pathBuilder.arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f);
        pathBuilder.arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 220.0f);
        pathBuilder.arcToRelative(92.0f, 92.0f, 0.0f, true, true, 92.0f, -92.0f);
        pathBuilder.arcTo(92.1f, 92.1f, 0.0f, false, true, 128.0f, 220.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 76.0f);
        pathBuilder.curveToRelative(-12.82f, 0.0f, -23.41f, 5.81f, -30.62f, 16.8f);
        pathBuilder.curveTo(91.33f, 102.0f, 88.0f, 114.52f, 88.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(3.33f, 26.0f, 9.38f, 35.2f);
        pathBuilder.curveToRelative(7.21f, 11.0f, 17.8f, 16.8f, 30.62f, 16.8f);
        pathBuilder.reflectiveCurveToRelative(23.41f, -5.81f, 30.62f, -16.8f);
        pathBuilder.curveToRelative(6.0f, -9.22f, 9.38f, -21.72f, 9.38f, -35.2f);
        pathBuilder.reflectiveCurveToRelative(-3.33f, -26.0f, -9.38f, -35.19f);
        pathBuilder.curveTo(151.41f, 81.81f, 140.82f, 76.0f, 128.0f, 76.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 172.0f);
        pathBuilder.curveToRelative(-22.11f, 0.0f, -32.0f, -22.1f, -32.0f, -44.0f);
        pathBuilder.reflectiveCurveToRelative(9.89f, -44.0f, 32.0f, -44.0f);
        pathBuilder.reflectiveCurveToRelative(32.0f, 22.1f, 32.0f, 44.0f);
        pathBuilder.reflectiveCurveTo(150.11f, 172.0f, 128.0f, 172.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _numberCircleZero = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
