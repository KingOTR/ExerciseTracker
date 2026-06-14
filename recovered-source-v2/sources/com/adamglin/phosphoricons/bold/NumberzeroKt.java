package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Numberzero.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"NumberZero", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getNumberZero", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_numberZero", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NumberzeroKt {
    private static ImageVector _numberZero;

    public static final ImageVector getNumberZero(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(186.62f, 61.05f);
        pathBuilder.curveToRelative(-13.76f, -21.62f, -34.0f, -33.0f, -58.62f, -33.0f);
        pathBuilder.reflectiveCurveTo(83.14f, 39.43f, 69.38f, 61.05f);
        pathBuilder.curveTo(58.17f, 78.66f, 52.0f, 102.44f, 52.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(6.17f, 49.33f, 17.38f, 66.94f);
        pathBuilder.curveTo(83.14f, 216.57f, 103.41f, 228.0f, 128.0f, 228.0f);
        pathBuilder.reflectiveCurveToRelative(44.86f, -11.43f, 58.62f, -33.06f);
        pathBuilder.curveTo(197.83f, 177.33f, 204.0f, 153.56f, 204.0f, 128.0f);
        pathBuilder.reflectiveCurveTo(197.83f, 78.66f, 186.62f, 61.05f);
        pathBuilder.close();
        pathBuilder.moveTo(166.37f, 182.05f);
        pathBuilder.curveTo(157.11f, 196.62f, 144.2f, 204.0f, 128.0f, 204.0f);
        pathBuilder.reflectiveCurveToRelative(-29.11f, -7.38f, -38.37f, -21.94f);
        pathBuilder.curveTo(80.84f, 168.25f, 76.0f, 149.05f, 76.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(4.84f, -40.25f, 13.63f, -54.06f);
        pathBuilder.curveTo(98.89f, 59.38f, 111.8f, 52.0f, 128.0f, 52.0f);
        pathBuilder.reflectiveCurveToRelative(29.11f, 7.38f, 38.37f, 21.94f);
        pathBuilder.curveTo(175.16f, 87.75f, 180.0f, 107.0f, 180.0f, 128.0f);
        pathBuilder.reflectiveCurveTo(175.16f, 168.25f, 166.37f, 182.06f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _numberZero = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
