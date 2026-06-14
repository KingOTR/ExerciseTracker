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

/* compiled from: Planet.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Planet", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPlanet", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_planet", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PlanetKt {
    private static ImageVector _planet;

    public static final ImageVector getPlanet(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(243.39f, 61.68f);
        pathBuilder.curveToRelative(-7.24f, -12.48f, -27.0f, -15.0f, -57.24f, -7.49f);
        pathBuilder.arcTo(93.92f, 93.92f, 0.0f, false, false, 34.05f, 128.0f);
        pathBuilder.arcToRelative(94.5f, 94.5f, 0.0f, false, false, 0.9f, 13.0f);
        pathBuilder.curveToRelative(-21.86f, 22.38f, -29.56f, 40.78f, -22.29f, 53.32f);
        pathBuilder.curveToRelative(4.5f, 7.76f, 14.0f, 11.69f, 27.86f, 11.69f);
        pathBuilder.arcToRelative(116.38f, 116.38f, 0.0f, false, false, 25.0f, -3.16f);
        pathBuilder.curveToRelative(1.45f, -0.32f, 2.92f, -0.68f, 4.41f, -1.0f);
        pathBuilder.arcToRelative(93.95f, 93.95f, 0.0f, false, false, 151.19f, -86.89f);
        pathBuilder.curveToRelative(12.65f, -13.0f, 21.11f, -25.32f, 23.86f, -35.6f);
        pathBuilder.curveTo(246.76f, 72.53f, 246.24f, 66.59f, 243.39f, 61.68f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 46.0f);
        pathBuilder.arcToRelative(82.12f, 82.12f, 0.0f, false, true, 80.19f, 64.94f);
        pathBuilder.curveToRelative(-16.0f, 15.3f, -38.14f, 31.67f, -63.3f, 46.12f);
        pathBuilder.curveTo(117.49f, 172.82f, 92.79f, 183.0f, 72.85f, 188.6f);
        pathBuilder.arcTo(82.0f, 82.0f, 0.0f, false, true, 128.0f, 46.0f);
        pathBuilder.close();
        pathBuilder.moveTo(23.0f, 188.3f);
        pathBuilder.curveToRelative(-3.52f, -6.07f, 2.31f, -18.56f, 15.0f, -33.0f);
        pathBuilder.arcToRelative(94.0f, 94.0f, 0.0f, false, false, 21.07f, 36.62f);
        pathBuilder.curveTo(39.42f, 195.74f, 26.39f, 194.08f, 23.0f, 188.3f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 210.0f);
        pathBuilder.arcToRelative(81.41f, 81.41f, 0.0f, false, true, -43.35f, -12.45f);
        pathBuilder.curveToRelative(20.68f, -6.71f, 43.56f, -17.06f, 66.22f, -30.08f);
        pathBuilder.curveToRelative(22.83f, -13.12f, 43.13f, -27.67f, 59.05f, -41.91f);
        pathBuilder.curveToRelative(0.0f, 0.81f, 0.06f, 1.62f, 0.06f, 2.44f);
        pathBuilder.arcTo(82.08f, 82.08f, 0.0f, false, true, 128.0f, 210.0f);
        pathBuilder.close();
        pathBuilder.moveTo(233.35f, 76.21f);
        pathBuilder.curveToRelative(-1.88f, 7.0f, -7.28f, 15.49f, -15.36f, 24.61f);
        pathBuilder.arcToRelative(93.92f, 93.92f, 0.0f, false, false, -21.1f, -36.7f);
        pathBuilder.curveToRelative(15.82f, -3.05f, 32.0f, -3.49f, 36.12f, 3.58f);
        pathBuilder.curveTo(234.2f, 69.75f, 234.31f, 72.62f, 233.35f, 76.21f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _planet = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
