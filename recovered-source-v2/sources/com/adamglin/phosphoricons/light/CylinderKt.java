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

/* compiled from: Cylinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Cylinder", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getCylinder", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cylinder", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CylinderKt {
    private static ImageVector _cylinder;

    public static final ImageVector getCylinder(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 18.0f);
        pathBuilder.curveTo(88.75f, 18.0f, 58.0f, 36.45f, 58.0f, 60.0f);
        pathBuilder.lineTo(58.0f, 196.0f);
        pathBuilder.curveToRelative(0.0f, 23.55f, 30.75f, 42.0f, 70.0f, 42.0f);
        pathBuilder.reflectiveCurveToRelative(70.0f, -18.45f, 70.0f, -42.0f);
        pathBuilder.lineTo(198.0f, 60.0f);
        pathBuilder.curveTo(198.0f, 36.45f, 167.25f, 18.0f, 128.0f, 18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 30.0f);
        pathBuilder.curveToRelative(31.44f, 0.0f, 58.0f, 13.74f, 58.0f, 30.0f);
        pathBuilder.reflectiveCurveToRelative(-26.56f, 30.0f, -58.0f, 30.0f);
        pathBuilder.reflectiveCurveTo(70.0f, 76.26f, 70.0f, 60.0f);
        pathBuilder.reflectiveCurveTo(96.56f, 30.0f, 128.0f, 30.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 226.0f);
        pathBuilder.curveToRelative(-31.44f, 0.0f, -58.0f, -13.74f, -58.0f, -30.0f);
        pathBuilder.lineTo(70.0f, 83.81f);
        pathBuilder.curveTo(82.48f, 94.87f, 103.59f, 102.0f, 128.0f, 102.0f);
        pathBuilder.reflectiveCurveToRelative(45.52f, -7.13f, 58.0f, -18.19f);
        pathBuilder.lineTo(186.0f, 196.0f);
        pathBuilder.curveTo(186.0f, 212.26f, 159.44f, 226.0f, 128.0f, 226.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cylinder = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
