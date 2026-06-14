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

/* compiled from: Planet.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Planet", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getPlanet", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_planet", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PlanetKt {
    private static ImageVector _planet;

    public static final ImageVector getPlanet(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(241.66f, 62.68f);
        pathBuilder.curveToRelative(-6.73f, -11.58f, -26.58f, -13.8f, -56.0f, -6.3f);
        pathBuilder.arcTo(92.0f, 92.0f, 0.0f, false, false, 37.0f, 141.7f);
        pathBuilder.curveToRelative(-21.38f, 21.69f, -29.44f, 40.0f, -22.68f, 51.62f);
        pathBuilder.curveToRelative(4.13f, 7.11f, 13.0f, 10.71f, 26.0f, 10.71f);
        pathBuilder.arcTo(115.25f, 115.25f, 0.0f, false, false, 65.0f, 200.9f);
        pathBuilder.curveToRelative(1.74f, -0.39f, 3.52f, -0.82f, 5.32f, -1.28f);
        pathBuilder.arcTo(92.0f, 92.0f, 0.0f, false, false, 220.0f, 128.0f);
        pathBuilder.arcToRelative(92.84f, 92.84f, 0.0f, false, false, -1.0f, -13.73f);
        pathBuilder.curveToRelative(12.77f, -13.0f, 21.31f, -25.28f, 24.0f, -35.47f);
        pathBuilder.curveTo(244.69f, 72.54f, 244.23f, 67.12f, 241.66f, 62.68f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 44.0f);
        pathBuilder.arcToRelative(84.13f, 84.13f, 0.0f, false, true, 82.38f, 67.56f);
        pathBuilder.curveToRelative(-16.17f, 15.69f, -38.8f, 32.48f, -64.49f, 47.24f);
        pathBuilder.curveToRelative(-27.31f, 15.69f, -52.81f, 26.25f, -73.61f, 32.0f);
        pathBuilder.arcTo(84.0f, 84.0f, 0.0f, false, true, 128.0f, 44.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.25f, 189.3f);
        pathBuilder.curveTo(17.0f, 182.0f, 23.75f, 167.7f, 39.0f, 151.24f);
        pathBuilder.arcTo(92.0f, 92.0f, 0.0f, false, false, 63.0f, 193.09f);
        pathBuilder.curveTo(40.86f, 198.0f, 25.47f, 196.58f, 21.25f, 189.3f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 212.0f);
        pathBuilder.arcToRelative(83.58f, 83.58f, 0.0f, false, true, -48.0f, -15.1f);
        pathBuilder.curveToRelative(21.58f, -6.58f, 45.83f, -17.37f, 69.85f, -31.16f);
        pathBuilder.curveToRelative(24.25f, -13.94f, 45.61f, -29.46f, 61.83f, -44.44f);
        pathBuilder.curveToRelative(0.18f, 2.21f, 0.3f, 4.44f, 0.3f, 6.7f);
        pathBuilder.arcTo(84.1f, 84.1f, 0.0f, false, true, 128.0f, 212.0f);
        pathBuilder.close();
        pathBuilder.moveTo(235.28f, 76.73f);
        pathBuilder.curveToRelative(-2.13f, 8.0f, -8.58f, 17.65f, -18.25f, 28.06f);
        pathBuilder.arcToRelative(92.07f, 92.07f, 0.0f, false, false, -24.12f, -41.92f);
        pathBuilder.curveToRelative(21.85f, -4.82f, 37.59f, -3.46f, 41.83f, 3.83f);
        pathBuilder.curveTo(236.2f, 69.23f, 236.39f, 72.6f, 235.28f, 76.73f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _planet = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
