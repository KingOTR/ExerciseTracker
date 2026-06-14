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

/* compiled from: Planet.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Planet", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getPlanet", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_planet", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PlanetKt {
    private static ImageVector _planet;

    public static final ImageVector getPlanet(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.curveToRelative(-7.65f, -13.19f, -27.84f, -16.16f, -58.5f, -8.66f);
        pathBuilder.arcTo(95.93f, 95.93f, 0.0f, false, false, 32.0f, 128.0f);
        pathBuilder.arcToRelative(98.0f, 98.0f, 0.0f, false, false, 0.78f, 12.31f);
        pathBuilder.curveTo(5.09f, 169.0f, 5.49f, 186.0f, 10.9f, 195.32f);
        pathBuilder.curveTo(16.0f, 204.16f, 26.64f, 208.0f, 40.64f, 208.0f);
        pathBuilder.arcToRelative(124.11f, 124.11f, 0.0f, false, false, 28.79f, -4.0f);
        pathBuilder.arcTo(95.93f, 95.93f, 0.0f, false, false, 224.0f, 128.0f);
        pathBuilder.arcToRelative(97.08f, 97.08f, 0.0f, false, false, -0.77f, -12.25f);
        pathBuilder.curveToRelative(12.5f, -13.0f, 20.82f, -25.35f, 23.65f, -35.92f);
        pathBuilder.curveTo(248.83f, 72.51f, 248.24f, 66.07f, 245.11f, 60.68f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 48.0f);
        pathBuilder.arcToRelative(80.11f, 80.11f, 0.0f, false, true, 78.0f, 62.2f);
        pathBuilder.curveToRelative(-17.06f, 16.06f, -40.15f, 32.53f, -62.07f, 45.13f);
        pathBuilder.curveTo(116.38f, 171.14f, 92.48f, 181.0f, 73.42f, 186.4f);
        pathBuilder.arcTo(79.94f, 79.94f, 0.0f, false, true, 128.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(24.74f, 187.29f);
        pathBuilder.curveToRelative(-1.46f, -2.51f, -0.65f, -7.24f, 2.22f, -13.0f);
        pathBuilder.arcToRelative(79.05f, 79.05f, 0.0f, false, true, 10.29f, -15.05f);
        pathBuilder.arcToRelative(96.0f, 96.0f, 0.0f, false, false, 18.0f, 31.32f);
        pathBuilder.curveTo(38.0f, 193.46f, 27.24f, 191.61f, 24.74f, 187.29f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 208.0f);
        pathBuilder.arcToRelative(79.45f, 79.45f, 0.0f, false, true, -38.56f, -9.94f);
        pathBuilder.arcToRelative(370.0f, 370.0f, 0.0f, false, false, 62.43f, -28.86f);
        pathBuilder.curveToRelative(21.58f, -12.39f, 40.68f, -25.82f, 56.07f, -39.08f);
        pathBuilder.arcTo(80.07f, 80.07f, 0.0f, false, true, 128.0f, 208.0f);
        pathBuilder.close();
        pathBuilder.moveTo(231.42f, 75.69f);
        pathBuilder.curveToRelative(-1.7f, 6.31f, -6.19f, 13.53f, -12.63f, 21.13f);
        pathBuilder.arcToRelative(95.69f, 95.69f, 0.0f, false, false, -18.0f, -31.35f);
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
