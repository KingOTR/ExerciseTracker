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

/* compiled from: Planet.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Planet", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getPlanet", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_planet", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PlanetKt {
    private static ImageVector _planet;

    public static final ImageVector getPlanet(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _planet;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Planet", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(245.11f, 60.68f);
        pathBuilder.curveToRelative(-7.65f, -13.19f, -27.85f, -16.16f, -58.5f, -8.66f);
        pathBuilder.arcTo(96.0f, 96.0f, 0.0f, false, false, 32.81f, 140.3f);
        pathBuilder.curveTo(5.09f, 169.0f, 5.49f, 186.0f, 10.9f, 195.32f);
        pathBuilder.curveTo(16.0f, 204.16f, 26.64f, 208.0f, 40.64f, 208.0f);
        pathBuilder.arcToRelative(124.11f, 124.11f, 0.0f, false, false, 28.79f, -4.0f);
        pathBuilder.arcToRelative(96.0f, 96.0f, 0.0f, false, false, 153.78f, -88.25f);
        pathBuilder.curveToRelative(12.51f, -13.0f, 20.83f, -25.35f, 23.66f, -35.92f);
        pathBuilder.curveTo(248.83f, 72.51f, 248.24f, 66.07f, 245.11f, 60.68f);
        pathBuilder.close();
        pathBuilder.moveTo(231.42f, 75.68f);
        pathBuilder.curveToRelative(-6.11f, 22.78f, -48.65f, 57.31f, -87.52f, 79.64f);
        pathBuilder.curveToRelative(-67.81f, 39.0f, -113.62f, 41.52f, -119.16f, 32.0f);
        pathBuilder.curveToRelative(-1.46f, -2.51f, -0.65f, -7.24f, 2.22f, -13.0f);
        pathBuilder.arcToRelative(80.06f, 80.06f, 0.0f, false, true, 10.28f, -15.05f);
        pathBuilder.arcToRelative(95.53f, 95.53f, 0.0f, false, false, 6.23f, 14.18f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 2.12f);
        pathBuilder.arcToRelative(122.14f, 122.14f, 0.0f, false, false, 16.95f, -3.32f);
        pathBuilder.curveToRelative(21.23f, -5.55f, 46.63f, -16.48f, 71.52f, -30.78f);
        pathBuilder.reflectiveCurveToRelative(47.0f, -30.66f, 62.45f, -46.15f);
        pathBuilder.arcTo(122.74f, 122.74f, 0.0f, false, false, 209.7f, 82.45f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.17f, -4.52f);
        pathBuilder.arcToRelative(96.26f, 96.26f, 0.0f, false, false, -9.1f, -12.46f);
        pathBuilder.curveToRelative(14.21f, -2.35f, 27.37f, -2.17f, 30.5f, 3.24f);
        pathBuilder.curveTo(232.19f, 70.28f, 232.24f, 72.63f, 231.42f, 75.69f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _planet = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
