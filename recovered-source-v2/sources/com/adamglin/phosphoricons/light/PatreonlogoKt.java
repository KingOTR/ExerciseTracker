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

/* compiled from: Patreonlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PatreonLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPatreonLogo", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_patreonLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PatreonlogoKt {
    private static ImageVector _patreonLogo;

    public static final ImageVector getPatreonLogo(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _patreonLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PatreonLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(186.61f, 33.84f);
        pathBuilder.curveToRelative(-18.45f, -7.54f, -40.41f, -9.74f, -61.84f, -6.17f);
        pathBuilder.curveToRelative(-23.0f, 3.82f, -42.93f, 13.72f, -57.58f, 28.62f);
        pathBuilder.curveTo(56.31f, 67.36f, 43.13f, 88.94f, 42.06f, 128.94f);
        pathBuilder.curveToRelative(-0.69f, 26.23f, 4.34f, 54.87f, 13.46f, 76.62f);
        pathBuilder.curveToRelative(8.77f, 20.92f, 20.13f, 32.44f, 32.0f, 32.44f);
        pathBuilder.curveToRelative(21.72f, 0.0f, 31.72f, -19.53f, 41.39f, -38.41f);
        pathBuilder.curveToRelative(7.08f, -13.82f, 14.4f, -28.11f, 26.21f, -36.12f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(6.0f, -4.11f, 14.09f, -7.21f, 22.61f, -10.5f);
        pathBuilder.curveTo(201.0f, 144.0f, 230.0f, 132.81f, 230.0f, 93.17f);
        pathBuilder.curveTo(230.0f, 66.75f, 214.19f, 45.13f, 186.61f, 33.84f);
        pathBuilder.close();
        pathBuilder.moveTo(173.41f, 141.78f);
        pathBuilder.curveToRelative(-9.17f, 3.54f, -17.84f, 6.88f, -25.0f, 11.76f);
        pathBuilder.curveToRelative(-14.36f, 9.73f, -22.75f, 26.12f, -30.15f, 40.58f);
        pathBuilder.curveTo(109.47f, 211.23f, 101.9f, 226.0f, 87.52f, 226.0f);
        pathBuilder.curveToRelative(-5.0f, 0.0f, -13.18f, -6.59f, -20.94f, -25.08f);
        pathBuilder.curveToRelative(-8.49f, -20.26f, -13.17f, -47.0f, -12.52f, -71.66f);
        pathBuilder.curveToRelative(0.75f, -28.16f, 8.45f, -51.09f, 21.69f, -64.55f);
        pathBuilder.curveToRelative(18.45f, -18.78f, 44.57f, -26.65f, 68.86f, -26.65f);
        pathBuilder.arcTo(100.32f, 100.32f, 0.0f, false, true, 182.07f, 45.0f);
        pathBuilder.curveTo(213.33f, 57.74f, 218.0f, 80.65f, 218.0f, 93.17f);
        pathBuilder.curveTo(218.0f, 124.58f, 196.34f, 132.93f, 173.41f, 141.78f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _patreonLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
