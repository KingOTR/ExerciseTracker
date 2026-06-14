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

/* compiled from: Sphere.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Sphere", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getSphere", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_sphere", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SphereKt {
    private static ImageVector _sphere;

    public static final ImageVector getSphere(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _sphere;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Sphere", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 28.0f);
        pathBuilder.arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f);
        pathBuilder.arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 128.0f);
        pathBuilder.curveToRelative(0.0f, 10.16f, -22.26f, 21.21f, -57.11f, 25.8f);
        pathBuilder.curveTo(163.61f, 145.62f, 164.0f, 137.0f, 164.0f, 128.0f);
        pathBuilder.curveToRelative(0.0f, -41.16f, -8.07f, -75.0f, -20.28f, -90.65f);
        pathBuilder.arcTo(92.14f, 92.14f, 0.0f, false, true, 220.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 36.0f);
        pathBuilder.curveToRelative(13.24f, 0.0f, 28.0f, 37.78f, 28.0f, 92.0f);
        pathBuilder.curveToRelative(0.0f, 9.45f, -0.46f, 18.39f, -1.27f, 26.73f);
        pathBuilder.curveToRelative(-8.34f, 0.81f, -17.28f, 1.27f, -26.73f, 1.27f);
        pathBuilder.curveToRelative(-54.22f, 0.0f, -92.0f, -14.76f, -92.0f, -28.0f);
        pathBuilder.arcTo(92.1f, 92.1f, 0.0f, false, true, 128.0f, 36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(37.35f, 143.72f);
        pathBuilder.curveTo(53.0f, 155.93f, 86.84f, 164.0f, 128.0f, 164.0f);
        pathBuilder.curveToRelative(9.0f, 0.0f, 17.62f, -0.39f, 25.8f, -1.11f);
        pathBuilder.curveTo(149.21f, 197.74f, 138.16f, 220.0f, 128.0f, 220.0f);
        pathBuilder.arcTo(92.14f, 92.14f, 0.0f, false, true, 37.35f, 143.72f);
        pathBuilder.close();
        pathBuilder.moveTo(143.72f, 218.65f);
        pathBuilder.curveToRelative(8.63f, -11.06f, 15.19f, -31.22f, 18.3f, -56.63f);
        pathBuilder.curveToRelative(25.41f, -3.11f, 45.57f, -9.67f, 56.63f, -18.3f);
        pathBuilder.arcTo(92.23f, 92.23f, 0.0f, false, true, 143.72f, 218.65f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _sphere = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
