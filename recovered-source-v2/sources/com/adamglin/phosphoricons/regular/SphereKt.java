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

/* compiled from: Sphere.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Sphere", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getSphere", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_sphere", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SphereKt {
    private static ImageVector _sphere;

    public static final ImageVector getSphere(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 24.0f);
        pathBuilder.arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f);
        pathBuilder.arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 128.0f);
        pathBuilder.curveToRelative(0.0f, 6.0f, -17.0f, 16.23f, -48.77f, 21.17f);
        pathBuilder.curveToRelative(0.51f, -7.0f, 0.77f, -14.08f, 0.77f, -21.17f);
        pathBuilder.curveToRelative(0.0f, -32.24f, -5.35f, -64.72f, -15.74f, -84.6f);
        pathBuilder.arcTo(88.17f, 88.17f, 0.0f, false, true, 216.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 40.0f);
        pathBuilder.curveToRelative(8.15f, 0.0f, 24.0f, 31.06f, 24.0f, 88.0f);
        pathBuilder.curveToRelative(0.0f, 8.24f, -0.34f, 15.92f, -0.93f, 23.07f);
        pathBuilder.curveToRelative(-7.15f, 0.59f, -14.83f, 0.93f, -23.07f, 0.93f);
        pathBuilder.curveToRelative(-56.94f, 0.0f, -88.0f, -15.85f, -88.0f, -24.0f);
        pathBuilder.arcTo(88.1f, 88.1f, 0.0f, false, true, 128.0f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(43.4f, 152.26f);
        pathBuilder.curveTo(63.28f, 162.65f, 95.76f, 168.0f, 128.0f, 168.0f);
        pathBuilder.curveToRelative(7.09f, 0.0f, 14.19f, -0.26f, 21.17f, -0.77f);
        pathBuilder.curveTo(144.23f, 199.0f, 134.0f, 216.0f, 128.0f, 216.0f);
        pathBuilder.arcTo(88.17f, 88.17f, 0.0f, false, true, 43.4f, 152.26f);
        pathBuilder.close();
        pathBuilder.moveTo(152.26f, 212.6f);
        pathBuilder.curveToRelative(6.29f, -12.0f, 10.73f, -28.67f, 13.26f, -47.08f);
        pathBuilder.curveToRelative(18.41f, -2.53f, 35.0f, -7.0f, 47.08f, -13.26f);
        pathBuilder.arcTo(88.4f, 88.4f, 0.0f, false, true, 152.26f, 212.6f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _sphere = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
