package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Polygon.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Polygon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getPolygon", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_polygon", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PolygonKt {
    private static ImageVector _polygon;

    public static final ImageVector getPolygon(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(137.0f, 65.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, true, true, 137.0f, 31.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 137.0f, 65.0f);
        pathBuilder.close();
        pathBuilder.moveTo(23.0f, 103.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, true, false, 57.0f, 103.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, false, 23.0f, 103.0f);
        pathBuilder.close();
        pathBuilder.moveTo(143.0f, 191.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, true, false, 177.0f, 191.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, false, 143.0f, 191.0f);
        pathBuilder.close();
        pathBuilder.moveTo(225.0f, 55.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, true, false, 225.0f, 89.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, false, 225.0f, 55.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(230.64f, 49.36f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, false, false, -45.26f, 0.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.arcToRelative(31.9f, 31.9f, 0.0f, false, false, -5.16f, 6.76f);
        pathBuilder2.lineTo(152.0f, 48.42f);
        pathBuilder2.arcTo(32.0f, 32.0f, 0.0f, false, false, 97.37f, 25.36f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.arcToRelative(32.06f, 32.06f, 0.0f, false, false, -5.76f, 37.41f);
        pathBuilder2.lineTo(57.67f, 93.32f);
        pathBuilder2.arcToRelative(32.05f, 32.05f, 0.0f, false, false, -40.31f, 4.05f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 42.89f, 47.41f);
        pathBuilder2.lineToRelative(70.0f, 51.36f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, true, false, 47.57f, -14.69f);
        pathBuilder2.lineToRelative(27.39f, -77.59f);
        pathBuilder2.quadToRelative(1.38f, 0.12f, 2.76f, 0.12f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 22.63f, -54.62f);
        pathBuilder2.close();
        pathBuilder2.moveTo(108.64f, 36.67f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 0.0f, 22.64f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, true, 108.68f, 36.67f);
        pathBuilder2.close();
        pathBuilder2.moveTo(28.64f, 131.32f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -22.64f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 0.0f, 22.64f);
        pathBuilder2.close();
        pathBuilder2.moveTo(171.29f, 219.32f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.63f, -22.63f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 22.63f, 22.63f);
        pathBuilder2.close();
        pathBuilder2.moveTo(162.74f, 176.14f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, false, false, -23.0f, 7.08f);
        pathBuilder2.lineToRelative(-70.0f, -51.36f);
        pathBuilder2.arcToRelative(32.17f, 32.17f, 0.0f, false, false, -1.34f, -26.65f);
        pathBuilder2.lineToRelative(33.95f, -30.55f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 45.47f, -10.81f);
        pathBuilder2.lineTo(176.0f, 71.56f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 14.12f, 27.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(219.3f, 83.3f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, true, true, 196.7f, 60.68f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.63f, 22.63f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _polygon = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
