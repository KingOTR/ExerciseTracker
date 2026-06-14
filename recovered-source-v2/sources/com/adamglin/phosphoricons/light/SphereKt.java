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

/* compiled from: Sphere.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Sphere", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getSphere", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_sphere", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SphereKt {
    private static ImageVector _sphere;

    public static final ImageVector getSphere(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 26.0f);
        pathBuilder.arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f);
        pathBuilder.arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f);
        pathBuilder.close();
        pathBuilder.moveTo(218.0f, 128.0f);
        pathBuilder.curveToRelative(0.0f, 6.59f, -12.94f, 13.24f, -24.0f, 16.94f);
        pathBuilder.arcToRelative(167.93f, 167.93f, 0.0f, false, true, -28.92f, 6.53f);
        pathBuilder.curveToRelative(0.62f, -7.6f, 0.94f, -15.46f, 0.94f, -23.47f);
        pathBuilder.curveToRelative(0.0f, -26.27f, -3.44f, -51.0f, -9.68f, -69.78f);
        pathBuilder.arcToRelative(85.57f, 85.57f, 0.0f, false, false, -8.0f, -17.91f);
        pathBuilder.arcTo(90.16f, 90.16f, 0.0f, false, true, 218.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 38.0f);
        pathBuilder.curveToRelative(6.59f, 0.0f, 13.24f, 12.94f, 16.94f, 24.0f);
        pathBuilder.curveToRelative(5.84f, 17.53f, 9.06f, 41.0f, 9.06f, 66.0f);
        pathBuilder.curveToRelative(0.0f, 8.83f, -0.4f, 17.15f, -1.11f, 24.89f);
        pathBuilder.curveToRelative(-8.0f, 0.73f, -16.35f, 1.11f, -24.89f, 1.11f);
        pathBuilder.curveToRelative(-54.94f, 0.0f, -90.0f, -15.4f, -90.0f, -26.0f);
        pathBuilder.arcTo(90.1f, 90.1f, 0.0f, false, true, 128.0f, 38.0f);
        pathBuilder.close();
        pathBuilder.moveTo(40.31f, 148.3f);
        pathBuilder.arcToRelative(85.57f, 85.57f, 0.0f, false, false, 17.91f, 8.0f);
        pathBuilder.curveTo(77.0f, 162.56f, 101.73f, 166.0f, 128.0f, 166.0f);
        pathBuilder.curveToRelative(8.0f, 0.0f, 15.86f, -0.32f, 23.45f, -0.94f);
        pathBuilder.curveTo(146.64f, 198.2f, 136.0f, 218.0f, 128.0f, 218.0f);
        pathBuilder.arcTo(90.16f, 90.16f, 0.0f, false, true, 40.31f, 148.3f);
        pathBuilder.close();
        pathBuilder.moveTo(148.31f, 215.69f);
        pathBuilder.arcToRelative(85.57f, 85.57f, 0.0f, false, false, 8.0f, -17.91f);
        pathBuilder.arcToRelative(184.0f, 184.0f, 0.0f, false, false, 7.43f, -34.0f);
        pathBuilder.arcToRelative(184.0f, 184.0f, 0.0f, false, false, 34.0f, -7.43f);
        pathBuilder.arcToRelative(85.57f, 85.57f, 0.0f, false, false, 17.91f, -8.0f);
        pathBuilder.arcTo(90.3f, 90.3f, 0.0f, false, true, 148.3f, 215.69f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _sphere = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
