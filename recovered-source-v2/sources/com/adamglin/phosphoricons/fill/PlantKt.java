package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Plant.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Plant", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getPlant", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_plant", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PlantKt {
    private static ImageVector _plant;

    public static final ImageVector getPlant(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _plant;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Plant", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(205.41f, 159.07f);
        pathBuilder.arcToRelative(60.9f, 60.9f, 0.0f, false, true, -31.83f, 8.86f);
        pathBuilder.arcToRelative(71.71f, 71.71f, 0.0f, false, true, -27.36f, -5.66f);
        pathBuilder.arcTo(55.55f, 55.55f, 0.0f, false, false, 136.0f, 194.51f);
        pathBuilder.verticalLineTo(224.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.53f, 8.0f);
        pathBuilder.arcToRelative(8.18f, 8.18f, 0.0f, false, true, -7.47f, -8.25f);
        pathBuilder.verticalLineTo(211.31f);
        pathBuilder.lineTo(81.38f, 172.69f);
        pathBuilder.arcTo(52.5f, 52.5f, 0.0f, false, true, 63.44f, 176.0f);
        pathBuilder.arcToRelative(45.82f, 45.82f, 0.0f, false, true, -23.92f, -6.67f);
        pathBuilder.curveTo(17.73f, 156.09f, 6.0f, 125.62f, 8.27f, 87.79f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.52f, -7.52f);
        pathBuilder.curveToRelative(37.83f, -2.23f, 68.3f, 9.46f, 81.5f, 31.25f);
        pathBuilder.arcTo(46.0f, 46.0f, 0.0f, false, true, 103.74f, 140.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.89f, 2.43f);
        pathBuilder.lineToRelative(-19.2f, -20.1f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.31f, 11.31f);
        pathBuilder.lineToRelative(53.88f, 55.25f);
        pathBuilder.curveToRelative(0.06f, -0.78f, 0.13f, -1.56f, 0.21f, -2.33f);
        pathBuilder.arcToRelative(68.56f, 68.56f, 0.0f, false, true, 18.64f, -39.46f);
        pathBuilder.lineToRelative(50.59f, -53.46f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.31f, -11.32f);
        pathBuilder.lineToRelative(-49.0f, 51.82f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.78f, -1.74f);
        pathBuilder.curveToRelative(-4.74f, -17.48f, -2.65f, -34.88f, 6.4f, -49.82f);
        pathBuilder.curveToRelative(17.86f, -29.48f, 59.42f, -45.26f, 111.18f, -42.22f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.52f, 7.52f);
        pathBuilder.curveTo(250.67f, 99.65f, 234.89f, 141.21f, 205.41f, 159.07f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _plant = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
