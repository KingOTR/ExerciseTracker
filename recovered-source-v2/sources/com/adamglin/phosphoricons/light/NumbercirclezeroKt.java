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

/* compiled from: Numbercirclezero.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"NumberCircleZero", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getNumberCircleZero", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_numberCircleZero", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NumbercirclezeroKt {
    private static ImageVector _numberCircleZero;

    public static final ImageVector getNumberCircleZero(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 26.0f);
        pathBuilder.arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f);
        pathBuilder.arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 218.0f);
        pathBuilder.arcToRelative(90.0f, 90.0f, 0.0f, true, true, 90.0f, -90.0f);
        pathBuilder.arcTo(90.1f, 90.1f, 0.0f, false, true, 128.0f, 218.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 74.0f);
        pathBuilder.curveToRelative(-13.52f, 0.0f, -24.69f, 6.12f, -32.29f, 17.71f);
        pathBuilder.curveTo(89.45f, 101.24f, 86.0f, 114.13f, 86.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(3.45f, 26.76f, 9.7f, 36.29f);
        pathBuilder.curveTo(103.31f, 175.88f, 114.47f, 182.0f, 128.0f, 182.0f);
        pathBuilder.reflectiveCurveToRelative(24.69f, -6.12f, 32.29f, -17.71f);
        pathBuilder.curveToRelative(6.26f, -9.53f, 9.71f, -22.42f, 9.71f, -36.29f);
        pathBuilder.reflectiveCurveToRelative(-3.45f, -26.76f, -9.7f, -36.29f);
        pathBuilder.curveTo(152.69f, 80.12f, 141.52f, 74.0f, 128.0f, 74.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 170.0f);
        pathBuilder.curveToRelative(-20.72f, 0.0f, -30.0f, -21.09f, -30.0f, -42.0f);
        pathBuilder.reflectiveCurveToRelative(9.28f, -42.0f, 30.0f, -42.0f);
        pathBuilder.reflectiveCurveToRelative(30.0f, 21.09f, 30.0f, 42.0f);
        pathBuilder.reflectiveCurveTo(148.72f, 170.0f, 128.0f, 170.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _numberCircleZero = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
