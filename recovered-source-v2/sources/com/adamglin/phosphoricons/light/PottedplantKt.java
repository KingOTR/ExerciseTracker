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

/* compiled from: Pottedplant.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PottedPlant", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPottedPlant", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pottedPlant", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PottedplantKt {
    private static ImageVector _pottedPlant;

    public static final ImageVector getPottedPlant(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _pottedPlant;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PottedPlant", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(124.24f, 140.24f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(21.09f, -21.09f);
        pathBuilder.arcToRelative(58.0f, 58.0f, 0.0f, false, false, 26.49f, 6.79f);
        pathBuilder.arcTo(47.55f, 47.55f, 0.0f, false, false, 196.67f, 119.0f);
        pathBuilder.curveToRelative(23.07f, -14.0f, 35.42f, -46.53f, 33.0f, -87.09f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.64f, -5.64f);
        pathBuilder.curveToRelative(-40.56f, -2.38f, -73.12f, 10.0f, -87.09f, 33.0f);
        pathBuilder.curveToRelative(-9.22f, 15.22f, -9.2f, 33.71f, -0.14f, 51.35f);
        pathBuilder.lineTo(120.0f, 127.51f);
        pathBuilder.lineToRelative(-14.64f, -14.63f);
        pathBuilder.curveToRelative(6.32f, -13.0f, 6.15f, -26.6f, -0.67f, -37.86f);
        pathBuilder.curveTo(94.21f, 57.72f, 70.0f, 48.44f, 39.85f, 50.21f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.64f, 5.64f);
        pathBuilder.curveTo(32.44f, 86.0f, 41.72f, 110.2f, 59.0f, 120.69f);
        pathBuilder.arcTo(36.23f, 36.23f, 0.0f, false, false, 78.0f, 126.0f);
        pathBuilder.arcToRelative(43.4f, 43.4f, 0.0f, false, false, 18.93f, -4.6f);
        pathBuilder.lineTo(111.51f, 136.0f);
        pathBuilder.lineToRelative(-10.0f, 10.0f);
        pathBuilder.lineTo(56.0f, 146.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.lineTo(67.18f, 158.0f);
        pathBuilder.lineToRelative(13.57f, 61.0f);
        pathBuilder.arcToRelative(13.91f, 13.91f, 0.0f, false, false, 13.67f, 11.0f);
        pathBuilder.horizontalLineToRelative(67.17f);
        pathBuilder.arcToRelative(13.91f, 13.91f, 0.0f, false, false, 13.66f, -11.0f);
        pathBuilder.lineToRelative(13.57f, -61.0f);
        pathBuilder.lineTo(200.0f, 158.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.lineTo(118.48f, 146.0f);
        pathBuilder.lineToRelative(5.76f, -5.76f);
        pathBuilder.close();
        pathBuilder.moveTo(147.24f, 65.54f);
        pathBuilder.curveToRelative(11.0f, -18.22f, 37.24f, -28.33f, 70.72f, -27.5f);
        pathBuilder.curveToRelative(0.83f, 33.47f, -9.28f, 59.68f, -27.5f, 70.72f);
        pathBuilder.curveToRelative(-12.3f, 7.44f, -27.09f, 6.92f, -41.79f, -1.43f);
        pathBuilder.curveTo(140.31f, 92.63f, 139.79f, 77.84f, 147.24f, 65.54f);
        pathBuilder.close();
        pathBuilder.moveTo(93.58f, 109.54f);
        pathBuilder.curveToRelative(-10.0f, 5.56f, -20.0f, 5.87f, -28.34f, 0.84f);
        pathBuilder.curveTo(52.78f, 102.87f, 45.75f, 85.0f, 46.0f, 62.0f);
        pathBuilder.curveToRelative(23.0f, -0.29f, 40.88f, 6.78f, 48.42f, 19.24f);
        pathBuilder.curveTo(99.45f, 89.54f, 99.14f, 99.56f, 93.58f, 109.58f);
        pathBuilder.close();
        pathBuilder.moveTo(176.52f, 158.0f);
        pathBuilder.lineToRelative(-13.0f, 58.43f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.95f, 1.57f);
        pathBuilder.lineTo(94.42f, 218.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -1.57f);
        pathBuilder.lineTo(79.48f, 158.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pottedPlant = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
