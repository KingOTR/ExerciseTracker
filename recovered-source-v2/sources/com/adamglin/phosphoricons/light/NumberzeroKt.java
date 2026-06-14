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

/* compiled from: Numberzero.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"NumberZero", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getNumberZero", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_numberZero", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NumberzeroKt {
    private static ImageVector _numberZero;

    public static final ImageVector getNumberZero(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(181.56f, 64.28f);
        pathBuilder.curveTo(169.0f, 44.47f, 150.43f, 34.0f, 128.0f, 34.0f);
        pathBuilder.reflectiveCurveTo(87.05f, 44.47f, 74.44f, 64.28f);
        pathBuilder.curveTo(63.84f, 80.94f, 58.0f, 103.57f, 58.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(5.84f, 47.06f, 16.44f, 63.72f);
        pathBuilder.curveTo(87.05f, 211.53f, 105.57f, 222.0f, 128.0f, 222.0f);
        pathBuilder.reflectiveCurveToRelative(40.95f, -10.47f, 53.56f, -30.28f);
        pathBuilder.curveTo(192.16f, 175.06f, 198.0f, 152.43f, 198.0f, 128.0f);
        pathBuilder.reflectiveCurveTo(192.16f, 80.94f, 181.56f, 64.28f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 210.0f);
        pathBuilder.curveToRelative(-40.07f, 0.0f, -58.0f, -41.18f, -58.0f, -82.0f);
        pathBuilder.reflectiveCurveToRelative(17.93f, -82.0f, 58.0f, -82.0f);
        pathBuilder.reflectiveCurveToRelative(58.0f, 41.18f, 58.0f, 82.0f);
        pathBuilder.reflectiveCurveTo(168.07f, 210.0f, 128.0f, 210.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _numberZero = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
