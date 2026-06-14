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

/* compiled from: Polygon.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Polygon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getPolygon", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_polygon", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PolygonKt {
    private static ImageVector _polygon;

    public static final ImageVector getPolygon(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(227.81f, 52.19f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, -39.6f, 0.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(28.14f, 28.14f, 0.0f, false, false, -4.0f, 5.0f);
        pathBuilder.lineTo(148.0f, 47.33f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 100.2f, 28.19f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 94.7f, 60.0f);
        pathBuilder.lineTo(54.58f, 96.1f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, -34.39f, 4.1f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, 36.7f, 42.12f);
        pathBuilder.lineToRelative(76.75f, 56.28f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, false, 46.17f, -10.39f);
        pathBuilder.arcToRelative(27.66f, 27.66f, 0.0f, false, false, -3.33f, -2.84f);
        pathBuilder.lineTo(206.63f, 100.0f);
        pathBuilder.quadToRelative(0.69f, 0.0f, 1.38f, 0.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, 19.8f, -47.79f);
        pathBuilder.close();
        pathBuilder.moveTo(161.39f, 180.05f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, -18.29f, 5.64f);
        pathBuilder.lineTo(66.36f, 129.41f);
        pathBuilder.arcTo(28.15f, 28.15f, 0.0f, false, false, 65.29f, 108.0f);
        pathBuilder.lineToRelative(40.12f, -36.11f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, 38.37f, -9.12f);
        pathBuilder.lineTo(180.0f, 72.66f);
        pathBuilder.arcToRelative(27.88f, 27.88f, 0.0f, false, false, 8.17f, 19.13f);
        pathBuilder.arcToRelative(28.61f, 28.61f, 0.0f, false, false, 3.32f, 2.85f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _polygon = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
