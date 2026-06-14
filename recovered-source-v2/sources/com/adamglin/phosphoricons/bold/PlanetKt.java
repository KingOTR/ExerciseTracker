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

/* compiled from: Planet.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Planet", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPlanet", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_planet", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PlanetKt {
    private static ImageVector _planet;

    public static final ImageVector getPlanet(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(248.59f, 58.67f);
        pathBuilder.curveToRelative(-6.31f, -10.87f, -23.0f, -21.06f, -66.16f, -9.71f);
        pathBuilder.arcTo(95.94f, 95.94f, 0.0f, false, false, 32.0f, 128.0f);
        pathBuilder.quadToRelative(0.0f, 3.6f, 0.26f, 7.14f);
        pathBuilder.curveTo(0.56f, 166.86f, 1.1f, 186.4f, 7.44f, 197.33f);
        pathBuilder.curveTo(13.4f, 207.61f, 25.3f, 212.0f, 40.68f, 212.0f);
        pathBuilder.curveToRelative(9.79f, 0.0f, 21.0f, -1.78f, 32.95f, -4.91f);
        pathBuilder.arcTo(95.94f, 95.94f, 0.0f, false, false, 224.0f, 128.0f);
        pathBuilder.curveToRelative(0.0f, -2.41f, -0.09f, -4.79f, -0.27f, -7.16f);
        pathBuilder.curveToRelative(14.31f, -14.38f, 23.86f, -28.21f, 27.0f, -40.0f);
        pathBuilder.curveTo(253.55f, 70.42f, 251.12f, 63.0f, 248.59f, 58.67f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 56.0f);
        pathBuilder.arcToRelative(72.11f, 72.11f, 0.0f, false, true, 70.19f, 56.0f);
        pathBuilder.curveTo(184.0f, 124.73f, 165.0f, 138.59f, 141.92f, 151.86f);
        pathBuilder.curveToRelative(-21.74f, 12.49f, -43.55f, 22.36f, -63.09f, 28.65f);
        pathBuilder.arcTo(72.0f, 72.0f, 0.0f, false, true, 128.0f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(28.19f, 185.29f);
        pathBuilder.curveToRelative(-0.61f, -1.07f, -0.17f, -8.22f, 10.67f, -21.71f);
        pathBuilder.arcTo(95.77f, 95.77f, 0.0f, false, false, 52.35f, 187.0f);
        pathBuilder.curveTo(35.12f, 189.61f, 28.85f, 186.41f, 28.19f, 185.29f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 200.0f);
        pathBuilder.arcToRelative(71.66f, 71.66f, 0.0f, false, true, -22.56f, -3.64f);
        pathBuilder.arcToRelative(394.1f, 394.1f, 0.0f, false, false, 48.42f, -23.69f);
        pathBuilder.arcTo(388.11f, 388.11f, 0.0f, false, false, 198.43f, 143.0f);
        pathBuilder.arcTo(72.12f, 72.12f, 0.0f, false, true, 128.0f, 200.0f);
        pathBuilder.close();
        pathBuilder.moveTo(227.57f, 74.65f);
        pathBuilder.curveToRelative(-1.28f, 4.78f, -4.81f, 10.87f, -10.39f, 17.8f);
        pathBuilder.arcTo(95.74f, 95.74f, 0.0f, false, false, 203.68f, 69.0f);
        pathBuilder.curveToRelative(15.83f, -2.37f, 23.17f, 0.0f, 24.15f, 1.71f);
        pathBuilder.curveTo(228.0f, 71.0f, 228.21f, 72.28f, 227.57f, 74.65f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _planet = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
