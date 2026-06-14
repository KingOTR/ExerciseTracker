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

/* compiled from: Metalogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MetaLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getMetaLogo", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_metaLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MetalogoKt {
    private static ImageVector _metaLogo;

    public static final ImageVector getMetaLogo(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(236.0f, 149.31f);
        pathBuilder.curveToRelative(0.0f, 15.38f, -3.0f, 28.45f, -8.6f, 37.78f);
        pathBuilder.curveToRelative(-6.67f, 11.06f, -17.0f, 16.91f, -30.0f, 16.91f);
        pathBuilder.curveToRelative(-25.55f, 0.0f, -44.83f, -36.0f, -65.25f, -74.11f);
        pathBuilder.curveTo(113.78f, 95.53f, 94.74f, 60.0f, 74.0f, 60.0f);
        pathBuilder.curveTo(62.9f, 60.0f, 51.3f, 70.53f, 42.16f, 88.89f);
        pathBuilder.arcTo(142.23f, 142.23f, 0.0f, false, false, 28.0f, 149.31f);
        pathBuilder.curveToRelative(0.0f, 13.93f, 2.58f, 25.56f, 7.45f, 33.65f);
        pathBuilder.curveToRelative(5.22f, 8.65f, 13.0f, 13.0f, 23.11f, 13.0f);
        pathBuilder.curveToRelative(17.15f, 0.0f, 33.07f, -24.32f, 47.73f, -50.6f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 7.0f, 3.9f);
        pathBuilder.curveTo(98.52f, 175.76f, 80.9f, 204.0f, 58.56f, 204.0f);
        pathBuilder.curveToRelative(-12.93f, 0.0f, -23.29f, -5.85f, -30.0f, -16.91f);
        pathBuilder.curveTo(23.0f, 177.76f, 20.0f, 164.69f, 20.0f, 149.31f);
        pathBuilder.arcToRelative(150.73f, 150.73f, 0.0f, false, true, 15.0f, -64.0f);
        pathBuilder.curveTo(45.69f, 63.83f, 59.54f, 52.0f, 74.0f, 52.0f);
        pathBuilder.curveToRelative(25.54f, 0.0f, 44.83f, 36.0f, 65.25f, 74.11f);
        pathBuilder.curveToRelative(18.41f, 34.36f, 37.44f, 69.89f, 58.2f, 69.89f);
        pathBuilder.curveToRelative(10.12f, 0.0f, 17.89f, -4.39f, 23.11f, -13.0f);
        pathBuilder.curveToRelative(4.87f, -8.09f, 7.45f, -19.72f, 7.45f, -33.65f);
        pathBuilder.arcToRelative(142.23f, 142.23f, 0.0f, false, false, -14.16f, -60.42f);
        pathBuilder.curveTo(204.7f, 70.53f, 193.1f, 60.0f, 182.0f, 60.0f);
        pathBuilder.curveToRelative(-9.75f, 0.0f, -20.15f, 8.0f, -31.78f, 24.57f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.54f, -4.6f);
        pathBuilder.curveToRelative(13.42f, -19.08f, 25.6f, -28.0f, 38.32f, -28.0f);
        pathBuilder.curveToRelative(14.45f, 0.0f, 28.3f, 11.83f, 39.0f, 33.32f);
        pathBuilder.arcTo(150.73f, 150.73f, 0.0f, false, true, 236.0f, 149.31f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _metaLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
