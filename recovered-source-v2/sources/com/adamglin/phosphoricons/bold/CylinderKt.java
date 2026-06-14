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

/* compiled from: Cylinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Cylinder", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getCylinder", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cylinder", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CylinderKt {
    private static ImageVector _cylinder;

    public static final ImageVector getCylinder(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _cylinder;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Cylinder", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(179.14f, 24.08f);
        pathBuilder.curveTo(165.28f, 16.29f, 147.12f, 12.0f, 128.0f, 12.0f);
        pathBuilder.reflectiveCurveTo(90.72f, 16.29f, 76.86f, 24.08f);
        pathBuilder.curveTo(60.83f, 33.1f, 52.0f, 45.86f, 52.0f, 60.0f);
        pathBuilder.lineTo(52.0f, 196.0f);
        pathBuilder.curveToRelative(0.0f, 14.14f, 8.83f, 26.9f, 24.86f, 35.92f);
        pathBuilder.curveTo(90.72f, 239.71f, 108.88f, 244.0f, 128.0f, 244.0f);
        pathBuilder.reflectiveCurveToRelative(37.28f, -4.29f, 51.14f, -12.08f);
        pathBuilder.curveToRelative(16.0f, -9.0f, 24.86f, -21.78f, 24.86f, -35.92f);
        pathBuilder.lineTo(204.0f, 60.0f);
        pathBuilder.curveTo(204.0f, 45.86f, 195.17f, 33.1f, 179.14f, 24.08f);
        pathBuilder.close();
        pathBuilder.moveTo(88.63f, 45.0f);
        pathBuilder.curveToRelative(10.17f, -5.72f, 24.52f, -9.0f, 39.37f, -9.0f);
        pathBuilder.reflectiveCurveToRelative(29.2f, 3.28f, 39.37f, 9.0f);
        pathBuilder.curveToRelative(8.0f, 4.52f, 12.63f, 10.0f, 12.63f, 15.0f);
        pathBuilder.reflectiveCurveToRelative(-4.6f, 10.48f, -12.63f, 15.0f);
        pathBuilder.curveToRelative(-10.17f, 5.72f, -24.52f, 9.0f, -39.37f, 9.0f);
        pathBuilder.reflectiveCurveToRelative(-29.2f, -3.28f, -39.37f, -9.0f);
        pathBuilder.curveTo(80.6f, 70.48f, 76.0f, 65.0f, 76.0f, 60.0f);
        pathBuilder.reflectiveCurveTo(80.6f, 49.52f, 88.63f, 45.0f);
        pathBuilder.close();
        pathBuilder.moveTo(167.37f, 211.0f);
        pathBuilder.curveToRelative(-10.17f, 5.72f, -24.52f, 9.0f, -39.37f, 9.0f);
        pathBuilder.reflectiveCurveToRelative(-29.2f, -3.28f, -39.37f, -9.0f);
        pathBuilder.curveTo(80.6f, 206.48f, 76.0f, 201.0f, 76.0f, 196.0f);
        pathBuilder.lineTo(76.0f, 95.4f);
        pathBuilder.lineToRelative(0.86f, 0.52f);
        pathBuilder.curveTo(90.72f, 103.71f, 108.88f, 108.0f, 128.0f, 108.0f);
        pathBuilder.reflectiveCurveToRelative(37.28f, -4.29f, 51.14f, -12.08f);
        pathBuilder.lineToRelative(0.86f, -0.52f);
        pathBuilder.lineTo(180.0f, 196.0f);
        pathBuilder.curveTo(180.0f, 201.0f, 175.4f, 206.48f, 167.37f, 211.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cylinder = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
