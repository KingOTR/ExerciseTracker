package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Polygon.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Polygon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getPolygon", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_polygon", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PolygonKt {
    private static ImageVector _polygon;

    public static final ImageVector getPolygon(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(230.64f, 49.36f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, -45.26f, 0.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(31.9f, 31.9f, 0.0f, false, false, -5.16f, 6.76f);
        pathBuilder.lineTo(152.0f, 48.42f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, false, 97.37f, 25.36f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(32.06f, 32.06f, 0.0f, false, false, -5.76f, 37.41f);
        pathBuilder.lineTo(57.67f, 93.32f);
        pathBuilder.arcToRelative(32.05f, 32.05f, 0.0f, false, false, -40.31f, 4.05f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 42.89f, 47.41f);
        pathBuilder.lineToRelative(70.0f, 51.36f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, false, 47.57f, -14.69f);
        pathBuilder.lineToRelative(27.39f, -77.59f);
        pathBuilder.quadToRelative(1.38f, 0.12f, 2.76f, 0.12f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 22.63f, -54.62f);
        pathBuilder.close();
        pathBuilder.moveTo(108.64f, 36.67f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 0.0f, 22.64f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 108.68f, 36.67f);
        pathBuilder.close();
        pathBuilder.moveTo(28.64f, 131.32f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -22.64f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 0.0f, 22.64f);
        pathBuilder.close();
        pathBuilder.moveTo(171.29f, 219.32f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.63f, -22.63f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 22.63f, 22.63f);
        pathBuilder.close();
        pathBuilder.moveTo(162.74f, 176.14f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, -23.0f, 7.08f);
        pathBuilder.lineToRelative(-70.0f, -51.36f);
        pathBuilder.arcToRelative(32.17f, 32.17f, 0.0f, false, false, -1.34f, -26.65f);
        pathBuilder.lineToRelative(33.95f, -30.55f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 45.47f, -10.81f);
        pathBuilder.lineTo(176.0f, 71.56f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 14.12f, 27.0f);
        pathBuilder.close();
        pathBuilder.moveTo(219.3f, 83.3f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, true, true, 196.7f, 60.68f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.63f, 22.63f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _polygon = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
