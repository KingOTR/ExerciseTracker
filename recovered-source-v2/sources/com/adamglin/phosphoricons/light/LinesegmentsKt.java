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

/* compiled from: Linesegments.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"LineSegments", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getLineSegments", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_lineSegments", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LinesegmentsKt {
    private static ImageVector _lineSegments;

    public static final ImageVector getLineSegments(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(237.23f, 34.77f);
        pathBuilder.arcToRelative(30.06f, 30.06f, 0.0f, false, false, -42.44f, 0.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(30.06f, 30.06f, 0.0f, false, false, 0.0f, 42.44f);
        pathBuilder.curveToRelative(0.65f, 0.64f, 1.32f, 1.24f, 2.0f, 1.81f);
        pathBuilder.lineToRelative(-28.14f, 52.26f);
        pathBuilder.arcTo(30.11f, 30.11f, 0.0f, false, false, 143.46f, 135.0f);
        pathBuilder.lineTo(121.0f, 112.54f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, false, false, 74.78f, 74.78f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, false, 0.0f, 42.43f);
        pathBuilder.arcToRelative(26.28f, 26.28f, 0.0f, false, false, 2.0f, 1.82f);
        pathBuilder.lineTo(48.64f, 171.29f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, false, -29.87f, 7.5f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, true, false, 42.44f, 0.0f);
        pathBuilder.curveToRelative(-0.65f, -0.64f, -1.32f, -1.24f, -2.0f, -1.81f);
        pathBuilder.lineToRelative(28.14f, -52.26f);
        pathBuilder.arcTo(30.07f, 30.07f, 0.0f, false, false, 112.54f, 121.0f);
        pathBuilder.lineTo(135.0f, 143.46f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, true, false, 46.25f, -4.67f);
        pathBuilder.arcToRelative(26.28f, 26.28f, 0.0f, false, false, -2.0f, -1.82f);
        pathBuilder.lineToRelative(28.14f, -52.26f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, false, 29.87f, -49.94f);
        pathBuilder.close();
        pathBuilder.moveTo(52.72f, 212.77f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, true, true, 0.0f, -25.46f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, true, 52.72f, 212.74f);
        pathBuilder.close();
        pathBuilder.moveTo(83.27f, 108.77f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, true, true, 25.46f, 0.0f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, true, 83.27f, 108.73f);
        pathBuilder.close();
        pathBuilder.moveTo(172.73f, 172.77f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, true, true, 0.0f, -25.46f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, true, 172.73f, 172.73f);
        pathBuilder.close();
        pathBuilder.moveTo(228.73f, 68.77f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, true, true, 0.0f, -25.46f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, true, 228.74f, 68.72f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _lineSegments = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
