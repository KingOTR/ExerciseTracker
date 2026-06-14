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

/* compiled from: Linesegments.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"LineSegments", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getLineSegments", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_lineSegments", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LinesegmentsKt {
    private static ImageVector _lineSegments;

    public static final ImageVector getLineSegments(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(235.81f, 75.79f);
        pathBuilder.arcTo(27.91f, 27.91f, 0.0f, false, true, 216.0f, 84.0f);
        pathBuilder.arcToRelative(28.49f, 28.49f, 0.0f, false, true, -5.67f, -0.58f);
        pathBuilder.lineToRelative(-30.57f, 56.77f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, true, -44.43f, 6.49f);
        pathBuilder.lineToRelative(-26.06f, -26.06f);
        pathBuilder.arcTo(28.07f, 28.07f, 0.0f, false, true, 96.0f, 124.0f);
        pathBuilder.arcToRelative(28.41f, 28.41f, 0.0f, false, true, -5.67f, -0.58f);
        pathBuilder.lineTo(59.76f, 180.18f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, true, -39.6f, 0.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 25.47f, -7.61f);
        pathBuilder.lineToRelative(30.57f, -56.77f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.arcToRelative(28.05f, 28.05f, 0.0f, false, true, 0.0f, -39.61f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 44.43f, 33.12f);
        pathBuilder.lineToRelative(26.06f, 26.06f);
        pathBuilder.arcToRelative(28.1f, 28.1f, 0.0f, false, true, 19.0f, -2.77f);
        pathBuilder.lineToRelative(30.57f, -56.77f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 0.0f, -39.6f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 39.6f, 39.6f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _lineSegments = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
