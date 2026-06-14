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

/* compiled from: Numberzero.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"NumberZero", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getNumberZero", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_numberZero", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NumberzeroKt {
    private static ImageVector _numberZero;

    public static final ImageVector getNumberZero(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _numberZero;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("NumberZero", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(179.87f, 65.35f);
        pathBuilder.curveTo(167.65f, 46.15f, 149.71f, 36.0f, 128.0f, 36.0f);
        pathBuilder.reflectiveCurveTo(88.35f, 46.15f, 76.13f, 65.35f);
        pathBuilder.curveTo(65.73f, 81.69f, 60.0f, 103.94f, 60.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(5.73f, 46.31f, 16.13f, 62.65f);
        pathBuilder.curveTo(88.35f, 209.85f, 106.29f, 220.0f, 128.0f, 220.0f);
        pathBuilder.reflectiveCurveToRelative(39.65f, -10.15f, 51.87f, -29.35f);
        pathBuilder.curveTo(190.27f, 174.31f, 196.0f, 152.06f, 196.0f, 128.0f);
        pathBuilder.reflectiveCurveTo(190.27f, 81.69f, 179.87f, 65.35f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 212.0f);
        pathBuilder.curveToRelative(-41.45f, 0.0f, -60.0f, -42.19f, -60.0f, -84.0f);
        pathBuilder.reflectiveCurveToRelative(18.55f, -84.0f, 60.0f, -84.0f);
        pathBuilder.reflectiveCurveToRelative(60.0f, 42.19f, 60.0f, 84.0f);
        pathBuilder.reflectiveCurveTo(169.45f, 212.0f, 128.0f, 212.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _numberZero = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
