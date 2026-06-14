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

/* compiled from: Linesegments.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"LineSegments", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getLineSegments", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_lineSegments", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LinesegmentsKt {
    private static ImageVector _lineSegments;

    public static final ImageVector getLineSegments(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(238.64f, 33.36f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, -45.26f, 0.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 0.0f, 45.26f);
        pathBuilder.curveToRelative(0.29f, 0.29f, 0.6f, 0.57f, 0.9f, 0.85f);
        pathBuilder.lineToRelative(-26.63f, 49.46f);
        pathBuilder.arcToRelative(32.19f, 32.19f, 0.0f, false, false, -23.9f, 3.5f);
        pathBuilder.lineToRelative(-20.18f, -20.18f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, -50.2f, -38.89f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 0.0f, 45.26f);
        pathBuilder.curveToRelative(0.29f, 0.29f, 0.59f, 0.57f, 0.89f, 0.85f);
        pathBuilder.lineTo(47.63f, 168.94f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, -30.27f, 8.44f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, false, 45.26f, 0.0f);
        pathBuilder.curveToRelative(-0.29f, -0.29f, -0.6f, -0.57f, -0.9f, -0.85f);
        pathBuilder.lineToRelative(26.63f, -49.46f);
        pathBuilder.arcTo(32.4f, 32.4f, 0.0f, false, false, 96.0f, 128.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 16.25f, -4.41f);
        pathBuilder.lineToRelative(20.18f, 20.18f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, false, 50.2f, -6.38f);
        pathBuilder.curveToRelative(-0.29f, -0.29f, -0.59f, -0.57f, -0.89f, -0.85f);
        pathBuilder.lineToRelative(26.63f, -49.46f);
        pathBuilder.arcTo(32.33f, 32.33f, 0.0f, false, false, 216.0f, 88.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 22.63f, -54.62f);
        pathBuilder.close();
        pathBuilder.moveTo(51.3f, 211.33f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.63f, -22.64f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, true, true, 51.3f, 211.33f);
        pathBuilder.close();
        pathBuilder.moveTo(84.68f, 107.33f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -22.63f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 0.0f, 22.63f);
        pathBuilder.close();
        pathBuilder.moveTo(171.32f, 171.33f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.63f, -22.63f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.63f, 22.63f);
        pathBuilder.close();
        pathBuilder.moveTo(227.32f, 67.33f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, true, true, 204.7f, 44.67f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.63f, 22.64f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _lineSegments = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
