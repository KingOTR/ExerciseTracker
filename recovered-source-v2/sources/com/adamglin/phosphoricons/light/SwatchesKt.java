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

/* compiled from: Swatches.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Swatches", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getSwatches", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_swatches", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SwatchesKt {
    private static ImageVector _swatches;

    public static final ImageVector getSwatches(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _swatches;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Swatches", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(86.0f, 180.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 86.0f, 180.0f);
        pathBuilder.close();
        pathBuilder.moveTo(238.0f, 156.19f);
        pathBuilder.lineTo(238.0f, 208.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f);
        pathBuilder.lineTo(76.0f, 222.0f);
        pathBuilder.arcToRelative(44.18f, 44.18f, 0.0f, false, true, -7.58f, -0.65f);
        pathBuilder.arcToRelative(42.0f, 42.0f, 0.0f, false, true, -33.81f, -48.64f);
        pathBuilder.lineToRelative(25.0f, -143.13f);
        pathBuilder.arcTo(13.94f, 13.94f, 0.0f, false, true, 75.82f, 18.22f);
        pathBuilder.lineToRelative(54.67f, 9.72f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, 11.3f, 16.21f);
        pathBuilder.lineToRelative(-12.67f, 72.44f);
        pathBuilder.lineToRelative(71.0f, -25.75f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, 17.89f, 8.32f);
        pathBuilder.lineToRelative(19.09f, 52.22f);
        pathBuilder.arcTo(15.66f, 15.66f, 0.0f, false, true, 238.0f, 156.19f);
        pathBuilder.close();
        pathBuilder.moveTo(104.93f, 185.19f);
        pathBuilder.lineTo(130.0f, 42.08f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.58f, -2.32f);
        pathBuilder.lineTo(73.72f, 30.0f);
        pathBuilder.lineToRelative(-0.34f, 0.0f);
        pathBuilder.arcToRelative(1.84f, 1.84f, 0.0f, false, false, -1.07f, 0.35f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.82f, 1.3f);
        pathBuilder.lineToRelative(-25.0f, 143.13f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, false, 24.09f, 34.76f);
        pathBuilder.arcToRelative(29.25f, 29.25f, 0.0f, false, false, 22.0f, -4.89f);
        pathBuilder.arcToRelative(29.81f, 29.81f, 0.0f, false, false, 12.33f, -19.44f);
        pathBuilder.close();
        pathBuilder.moveTo(113.18f, 198.36f);
        pathBuilder.lineTo(224.71f, 158.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.11f, -1.0f);
        pathBuilder.arcToRelative(1.86f, 1.86f, 0.0f, false, false, 0.06f, -1.46f);
        pathBuilder.lineToRelative(-19.09f, -52.21f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.53f, -1.17f);
        pathBuilder.lineToRelative(-77.53f, 28.09f);
        pathBuilder.lineToRelative(-10.0f, 57.07f);
        pathBuilder.arcTo(41.9f, 41.9f, 0.0f, false, true, 113.18f, 198.38f);
        pathBuilder.close();
        pathBuilder.moveTo(226.0f, 170.27f);
        pathBuilder.lineTo(116.35f, 210.0f);
        pathBuilder.lineTo(224.0f, 210.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _swatches = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
