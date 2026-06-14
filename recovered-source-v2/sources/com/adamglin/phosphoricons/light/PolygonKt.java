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

/* compiled from: Polygon.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Polygon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPolygon", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_polygon", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PolygonKt {
    private static ImageVector _polygon;

    public static final ImageVector getPolygon(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _polygon;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Polygon", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(229.23f, 50.78f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, false, -42.44f, 0.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(29.82f, 29.82f, 0.0f, false, false, -5.56f, 7.69f);
        pathBuilder.lineToRelative(-31.31f, -8.54f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, false, false, 98.78f, 26.77f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(30.09f, 30.09f, 0.0f, false, false, 94.13f, 63.2f);
        pathBuilder.lineTo(57.83f, 95.87f);
        pathBuilder.arcToRelative(30.07f, 30.07f, 0.0f, false, false, -39.06f, 2.91f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, false, 41.38f, 43.44f);
        pathBuilder.lineToRelative(72.6f, 53.25f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, true, false, 48.47f, -8.68f);
        pathBuilder.arcToRelative(29.65f, 29.65f, 0.0f, false, false, -5.77f, -4.5f);
        pathBuilder.lineToRelative(28.44f, -80.59f);
        pathBuilder.arcTo(31.57f, 31.57f, 0.0f, false, false, 208.0f, 102.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, false, 21.22f, -51.2f);
        pathBuilder.close();
        pathBuilder.moveTo(107.23f, 35.26f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, true, true, 0.0f, 25.46f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, true, 107.27f, 35.26f);
        pathBuilder.close();
        pathBuilder.moveTo(27.23f, 132.73f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, true, true, 25.46f, 0.0f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, true, 27.26f, 132.73f);
        pathBuilder.close();
        pathBuilder.moveTo(172.7f, 220.73f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, true, true, 0.0f, -25.46f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, true, 172.73f, 220.74f);
        pathBuilder.close();
        pathBuilder.moveTo(164.09f, 178.3f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, false, -24.27f, 7.48f);
        pathBuilder.lineTo(67.24f, 132.54f);
        pathBuilder.arcToRelative(30.14f, 30.14f, 0.0f, false, false, -1.38f, -27.75f);
        pathBuilder.lineToRelative(36.3f, -32.67f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, false, 44.62f, -10.61f);
        pathBuilder.lineToRelative(31.31f, 8.54f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, false, 8.7f, 23.16f);
        pathBuilder.arcToRelative(30.47f, 30.47f, 0.0f, false, false, 5.78f, 4.51f);
        pathBuilder.close();
        pathBuilder.moveTo(220.71f, 84.71f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, true, true, 0.0f, -25.46f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, true, 220.74f, 84.72f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _polygon = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
