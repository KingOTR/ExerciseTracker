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

/* compiled from: Guitar.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Guitar", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getGuitar", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_guitar", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GuitarKt {
    private static ImageVector _guitar;

    public static final ImageVector getGuitar(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _guitar;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Guitar", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(246.83f, 49.17f);
        pathBuilder.lineToRelative(-40.0f, -40.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 5.66f);
        pathBuilder.lineTo(206.34f, 20.0f);
        pathBuilder.lineTo(141.25f, 85.1f);
        pathBuilder.curveToRelative(-21.91f, -12.54f, -46.89f, -12.31f, -61.67f, 2.47f);
        pathBuilder.arcToRelative(38.11f, 38.11f, 0.0f, false, false, -8.5f, 13.0f);
        pathBuilder.arcTo(12.24f, 12.24f, 0.0f, false, true, 59.94f, 108.0f);
        pathBuilder.curveToRelative(-13.55f, 0.46f, -25.29f, 5.28f, -34.0f, 13.94f);
        pathBuilder.curveTo(14.82f, 133.14f, 10.1f, 149.31f, 12.7f, 167.51f);
        pathBuilder.curveToRelative(2.54f, 17.77f, 11.8f, 35.42f, 26.08f, 49.71f);
        pathBuilder.reflectiveCurveToRelative(31.94f, 23.54f, 49.71f, 26.08f);
        pathBuilder.arcToRelative(67.39f, 67.39f, 0.0f, false, false, 9.59f, 0.7f);
        pathBuilder.curveToRelative(14.25f, 0.0f, 26.79f, -4.82f, 36.0f, -14.0f);
        pathBuilder.curveToRelative(8.66f, -8.67f, 13.48f, -20.41f, 13.94f, -34.0f);
        pathBuilder.arcToRelative(12.24f, 12.24f, 0.0f, false, true, 7.45f, -11.14f);
        pathBuilder.arcToRelative(38.11f, 38.11f, 0.0f, false, false, 13.0f, -8.5f);
        pathBuilder.curveToRelative(14.78f, -14.78f, 15.0f, -39.76f, 2.47f, -61.67f);
        pathBuilder.lineTo(236.0f, 49.66f);
        pathBuilder.lineToRelative(5.17f, 5.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.66f, -5.66f);
        pathBuilder.close();
        pathBuilder.moveTo(162.77f, 170.76f);
        pathBuilder.arcToRelative(29.94f, 29.94f, 0.0f, false, true, -10.3f, 6.72f);
        pathBuilder.arcTo(20.25f, 20.25f, 0.0f, false, false, 140.0f, 195.79f);
        pathBuilder.curveToRelative(-0.38f, 11.49f, -4.39f, 21.37f, -11.6f, 28.57f);
        pathBuilder.curveToRelative(-9.34f, 9.34f, -23.1f, 13.26f, -38.75f, 11.0f);
        pathBuilder.curveToRelative(-16.07f, -2.29f, -32.11f, -10.75f, -45.18f, -23.82f);
        pathBuilder.reflectiveCurveToRelative(-21.53f, -29.11f, -23.82f, -45.18f);
        pathBuilder.curveToRelative(-2.24f, -15.65f, 1.68f, -29.41f, 11.0f, -38.75f);
        pathBuilder.curveToRelative(7.2f, -7.21f, 17.08f, -11.22f, 28.57f, -11.6f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(20.25f, 20.25f, 0.0f, false, false, 18.31f, -12.5f);
        pathBuilder.arcToRelative(29.94f, 29.94f, 0.0f, false, true, 6.72f, -10.3f);
        pathBuilder.curveToRelative(11.8f, -11.8f, 31.84f, -12.0f, 50.14f, -2.27f);
        pathBuilder.lineToRelative(-25.09f, 25.09f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, true, false, 140.0f, 145.71f);
        pathBuilder.lineTo(165.0f, 120.62f);
        pathBuilder.curveTo(174.81f, 138.92f, 174.57f, 159.0f, 162.77f, 170.76f);
        pathBuilder.close();
        pathBuilder.moveTo(112.0f, 124.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, -20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(138.71f, 135.63f);
        pathBuilder.arcToRelative(28.06f, 28.06f, 0.0f, false, false, -18.34f, -18.34f);
        pathBuilder.lineToRelative(22.0f, -22.0f);
        pathBuilder.arcToRelative(74.51f, 74.51f, 0.0f, false, true, 18.35f, 18.35f);
        pathBuilder.close();
        pathBuilder.moveTo(158.0f, 98.0f);
        pathBuilder.arcToRelative(81.07f, 81.07f, 0.0f, false, false, -9.9f, -8.44f);
        pathBuilder.lineTo(176.0f, 61.65f);
        pathBuilder.lineTo(194.34f, 80.0f);
        pathBuilder.lineToRelative(-27.87f, 27.87f);
        pathBuilder.arcTo(81.07f, 81.07f, 0.0f, false, false, 158.0f, 98.0f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 74.37f);
        pathBuilder.lineTo(181.66f, 56.0f);
        pathBuilder.lineTo(212.0f, 25.66f);
        pathBuilder.lineTo(230.34f, 44.0f);
        pathBuilder.close();
        pathBuilder.moveTo(90.84f, 197.16f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 5.66f);
        pathBuilder.lineToRelative(-32.0f, -32.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _guitar = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
