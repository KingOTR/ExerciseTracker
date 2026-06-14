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

/* compiled from: Cylinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Cylinder", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getCylinder", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cylinder", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CylinderKt {
    private static ImageVector _cylinder;

    public static final ImageVector getCylinder(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 16.0f);
        pathBuilder.curveTo(87.63f, 16.0f, 56.0f, 35.33f, 56.0f, 60.0f);
        pathBuilder.lineTo(56.0f, 196.0f);
        pathBuilder.curveToRelative(0.0f, 24.67f, 31.63f, 44.0f, 72.0f, 44.0f);
        pathBuilder.reflectiveCurveToRelative(72.0f, -19.33f, 72.0f, -44.0f);
        pathBuilder.lineTo(200.0f, 60.0f);
        pathBuilder.curveTo(200.0f, 35.33f, 168.37f, 16.0f, 128.0f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 32.0f);
        pathBuilder.curveToRelative(26.49f, 0.0f, 56.0f, 11.5f, 56.0f, 28.0f);
        pathBuilder.reflectiveCurveToRelative(-29.51f, 28.0f, -56.0f, 28.0f);
        pathBuilder.reflectiveCurveTo(72.0f, 76.5f, 72.0f, 60.0f);
        pathBuilder.reflectiveCurveTo(101.51f, 32.0f, 128.0f, 32.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 224.0f);
        pathBuilder.curveToRelative(-29.83f, 0.0f, -56.0f, -13.08f, -56.0f, -28.0f);
        pathBuilder.lineTo(72.0f, 88.0f);
        pathBuilder.curveToRelative(13.1f, 9.85f, 33.14f, 16.0f, 56.0f, 16.0f);
        pathBuilder.reflectiveCurveToRelative(42.9f, -6.2f, 56.0f, -16.0f);
        pathBuilder.lineTo(184.0f, 196.0f);
        pathBuilder.curveTo(184.0f, 210.92f, 157.83f, 224.0f, 128.0f, 224.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cylinder = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
