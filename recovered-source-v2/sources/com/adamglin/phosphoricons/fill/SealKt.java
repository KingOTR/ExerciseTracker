package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Seal.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Seal", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getSeal", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_seal", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SealKt {
    private static ImageVector _seal;

    public static final ImageVector getSeal(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _seal;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Seal", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(240.0f, 128.0f);
        pathBuilder.curveToRelative(0.0f, 10.44f, -7.51f, 18.27f, -14.14f, 25.18f);
        pathBuilder.curveToRelative(-3.77f, 3.94f, -7.67f, 8.0f, -9.14f, 11.57f);
        pathBuilder.curveToRelative(-1.36f, 3.27f, -1.44f, 8.69f, -1.52f, 13.94f);
        pathBuilder.curveToRelative(-0.15f, 9.76f, -0.31f, 20.82f, -8.0f, 28.51f);
        pathBuilder.reflectiveCurveToRelative(-18.75f, 7.85f, -28.51f, 8.0f);
        pathBuilder.curveToRelative(-5.25f, 0.08f, -10.67f, 0.16f, -13.94f, 1.52f);
        pathBuilder.curveToRelative(-3.57f, 1.47f, -7.63f, 5.37f, -11.57f, 9.14f);
        pathBuilder.curveTo(146.27f, 232.49f, 138.44f, 240.0f, 128.0f, 240.0f);
        pathBuilder.reflectiveCurveToRelative(-18.27f, -7.51f, -25.18f, -14.14f);
        pathBuilder.curveToRelative(-3.94f, -3.77f, -8.0f, -7.67f, -11.57f, -9.14f);
        pathBuilder.curveToRelative(-3.27f, -1.36f, -8.69f, -1.44f, -13.94f, -1.52f);
        pathBuilder.curveToRelative(-9.76f, -0.15f, -20.82f, -0.31f, -28.51f, -8.0f);
        pathBuilder.reflectiveCurveToRelative(-7.85f, -18.75f, -8.0f, -28.51f);
        pathBuilder.curveToRelative(-0.08f, -5.25f, -0.16f, -10.67f, -1.52f, -13.94f);
        pathBuilder.curveToRelative(-1.47f, -3.57f, -5.37f, -7.63f, -9.14f, -11.57f);
        pathBuilder.curveTo(23.51f, 146.27f, 16.0f, 138.44f, 16.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(7.51f, -18.27f, 14.14f, -25.18f);
        pathBuilder.curveToRelative(3.77f, -3.94f, 7.67f, -8.0f, 9.14f, -11.57f);
        pathBuilder.curveToRelative(1.36f, -3.27f, 1.44f, -8.69f, 1.52f, -13.94f);
        pathBuilder.curveToRelative(0.15f, -9.76f, 0.31f, -20.82f, 8.0f, -28.51f);
        pathBuilder.reflectiveCurveToRelative(18.75f, -7.85f, 28.51f, -8.0f);
        pathBuilder.curveToRelative(5.25f, -0.08f, 10.67f, -0.16f, 13.94f, -1.52f);
        pathBuilder.curveToRelative(3.57f, -1.47f, 7.63f, -5.37f, 11.57f, -9.14f);
        pathBuilder.curveTo(109.73f, 23.51f, 117.56f, 16.0f, 128.0f, 16.0f);
        pathBuilder.reflectiveCurveToRelative(18.27f, 7.51f, 25.18f, 14.14f);
        pathBuilder.curveToRelative(3.94f, 3.77f, 8.0f, 7.67f, 11.57f, 9.14f);
        pathBuilder.curveToRelative(3.27f, 1.36f, 8.69f, 1.44f, 13.94f, 1.52f);
        pathBuilder.curveToRelative(9.76f, 0.15f, 20.82f, 0.31f, 28.51f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(7.85f, 18.75f, 8.0f, 28.51f);
        pathBuilder.curveToRelative(0.08f, 5.25f, 0.16f, 10.67f, 1.52f, 13.94f);
        pathBuilder.curveToRelative(1.47f, 3.57f, 5.37f, 7.63f, 9.14f, 11.57f);
        pathBuilder.curveTo(232.49f, 109.73f, 240.0f, 117.56f, 240.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _seal = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
