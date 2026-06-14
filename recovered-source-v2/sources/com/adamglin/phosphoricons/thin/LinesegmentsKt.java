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

/* compiled from: Linesegments.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"LineSegments", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getLineSegments", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_lineSegments", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LinesegmentsKt {
    private static ImageVector _lineSegments;

    public static final ImageVector getLineSegments(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _lineSegments;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("LineSegments", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(235.81f, 36.19f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, -39.6f, 0.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.0f, 39.6f);
        pathBuilder.arcToRelative(26.62f, 26.62f, 0.0f, false, false, 3.14f, 2.71f);
        pathBuilder.lineToRelative(-29.73f, 55.21f);
        pathBuilder.arcToRelative(28.08f, 28.08f, 0.0f, false, false, -26.38f, 3.87f);
        pathBuilder.lineToRelative(-24.82f, -24.82f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 76.2f, 76.19f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, 3.14f, 42.31f);
        pathBuilder.lineTo(49.6f, 173.72f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, -29.41f, 6.49f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, false, 39.6f, 0.0f);
        pathBuilder.arcToRelative(28.63f, 28.63f, 0.0f, false, false, -3.14f, -2.71f);
        pathBuilder.lineToRelative(29.73f, -55.21f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, 26.38f, -3.87f);
        pathBuilder.lineToRelative(24.82f, 24.82f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, false, 39.09f, -5.74f);
        pathBuilder.lineTo(206.4f, 82.28f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, 29.41f, -46.09f);
        pathBuilder.close();
        pathBuilder.moveTo(54.13f, 214.19f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, 0.0f, -28.28f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 54.13f, 214.15f);
        pathBuilder.close();
        pathBuilder.moveTo(81.85f, 110.19f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, 28.29f, 0.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 81.85f, 110.14f);
        pathBuilder.close();
        pathBuilder.moveTo(174.15f, 174.19f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, 0.0f, -28.29f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 174.15f, 174.15f);
        pathBuilder.close();
        pathBuilder.moveTo(230.15f, 70.19f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, 0.0f, -28.29f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 230.15f, 70.14f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _lineSegments = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
