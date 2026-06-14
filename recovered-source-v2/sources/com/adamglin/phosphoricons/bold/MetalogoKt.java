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

/* compiled from: Metalogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MetaLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getMetaLogo", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_metaLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MetalogoKt {
    private static ImageVector _metaLogo;

    public static final ImageVector getMetaLogo(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(244.0f, 149.31f);
        pathBuilder.curveToRelative(0.0f, 16.84f, -3.37f, 31.33f, -9.75f, 41.91f);
        pathBuilder.curveTo(226.06f, 204.81f, 213.33f, 212.0f, 197.44f, 212.0f);
        pathBuilder.curveToRelative(-30.33f, 0.0f, -50.72f, -38.05f, -72.3f, -78.33f);
        pathBuilder.curveTo(109.46f, 104.41f, 90.0f, 68.0f, 74.0f, 68.0f);
        pathBuilder.curveToRelative(-7.71f, 0.0f, -17.16f, 9.37f, -24.66f, 24.45f);
        pathBuilder.arcTo(133.82f, 133.82f, 0.0f, false, false, 36.0f, 149.31f);
        pathBuilder.curveToRelative(0.0f, 12.3f, 2.24f, 22.78f, 6.3f, 29.52f);
        pathBuilder.curveToRelative(3.77f, 6.26f, 8.94f, 9.17f, 16.26f, 9.17f);
        pathBuilder.curveToRelative(13.75f, 0.0f, 30.63f, -29.0f, 36.18f, -38.49f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 20.74f, 12.09f);
        pathBuilder.curveToRelative(-8.91f, 15.28f, -16.53f, 26.0f, -24.0f, 33.78f);
        pathBuilder.curveTo(80.75f, 206.56f, 70.0f, 212.0f, 58.56f, 212.0f);
        pathBuilder.curveToRelative(-15.89f, 0.0f, -28.62f, -7.19f, -36.81f, -20.78f);
        pathBuilder.curveTo(15.37f, 180.64f, 12.0f, 166.15f, 12.0f, 149.31f);
        pathBuilder.curveTo(12.0f, 105.34f, 35.58f, 44.0f, 74.0f, 44.0f);
        pathBuilder.curveToRelative(30.33f, 0.0f, 50.72f, 38.05f, 72.3f, 78.33f);
        pathBuilder.curveTo(162.0f, 151.59f, 181.47f, 188.0f, 197.44f, 188.0f);
        pathBuilder.curveToRelative(7.32f, 0.0f, 12.49f, -2.91f, 16.26f, -9.17f);
        pathBuilder.curveToRelative(4.06f, -6.74f, 6.3f, -17.22f, 6.3f, -29.52f);
        pathBuilder.arcToRelative(133.82f, 133.82f, 0.0f, false, false, -13.33f, -56.86f);
        pathBuilder.curveTo(199.17f, 77.37f, 189.72f, 68.0f, 182.0f, 68.0f);
        pathBuilder.curveToRelative(-5.72f, 0.0f, -12.61f, 5.0f, -20.49f, 14.83f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -18.74f, -15.0f);
        pathBuilder.curveTo(155.62f, 51.8f, 168.45f, 44.0f, 182.0f, 44.0f);
        pathBuilder.curveToRelative(17.65f, 0.0f, 34.0f, 13.41f, 46.15f, 37.76f);
        pathBuilder.arcTo(159.0f, 159.0f, 0.0f, false, true, 244.0f, 149.31f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _metaLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
