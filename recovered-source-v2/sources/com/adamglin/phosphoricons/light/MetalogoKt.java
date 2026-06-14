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

/* compiled from: Metalogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MetaLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getMetaLogo", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_metaLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MetalogoKt {
    private static ImageVector _metaLogo;

    public static final ImageVector getMetaLogo(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _metaLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("MetaLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(238.0f, 149.31f);
        pathBuilder.curveToRelative(0.0f, 15.75f, -3.07f, 29.17f, -8.88f, 38.81f);
        pathBuilder.curveToRelative(-7.05f, 11.7f, -18.0f, 17.88f, -31.68f, 17.88f);
        pathBuilder.curveToRelative(-26.74f, 0.0f, -46.3f, -36.51f, -67.0f, -75.17f);
        pathBuilder.curveTo(113.14f, 98.57f, 93.55f, 62.0f, 74.0f, 62.0f);
        pathBuilder.curveToRelative(-23.28f, 0.0f, -44.0f, 48.83f, -44.0f, 87.31f);
        pathBuilder.curveToRelative(0.0f, 13.57f, 2.48f, 24.84f, 7.16f, 32.62f);
        pathBuilder.curveToRelative(4.9f, 8.12f, 11.9f, 12.07f, 21.4f, 12.07f);
        pathBuilder.curveToRelative(16.16f, 0.0f, 32.31f, -25.06f, 46.0f, -49.57f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 115.0f, 150.27f);
        pathBuilder.curveTo(100.0f, 177.23f, 82.0f, 206.0f, 58.56f, 206.0f);
        pathBuilder.curveToRelative(-13.67f, 0.0f, -24.63f, -6.18f, -31.68f, -17.88f);
        pathBuilder.curveTo(21.07f, 178.48f, 18.0f, 165.06f, 18.0f, 149.31f);
        pathBuilder.curveTo(18.0f, 108.82f, 39.81f, 50.0f, 74.0f, 50.0f);
        pathBuilder.curveToRelative(26.74f, 0.0f, 46.3f, 36.51f, 67.0f, 75.17f);
        pathBuilder.curveTo(158.29f, 157.43f, 177.88f, 194.0f, 197.44f, 194.0f);
        pathBuilder.curveToRelative(9.5f, 0.0f, 16.5f, -3.95f, 21.4f, -12.07f);
        pathBuilder.curveToRelative(4.68f, -7.78f, 7.16f, -19.05f, 7.16f, -32.62f);
        pathBuilder.curveTo(226.0f, 110.83f, 205.29f, 62.0f, 182.0f, 62.0f);
        pathBuilder.curveToRelative(-9.0f, 0.0f, -18.91f, 7.76f, -30.14f, 23.73f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -9.82f, -6.91f);
        pathBuilder.curveTo(150.75f, 66.45f, 164.37f, 50.0f, 182.0f, 50.0f);
        pathBuilder.curveTo(216.19f, 50.0f, 238.0f, 108.82f, 238.0f, 149.31f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _metaLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
