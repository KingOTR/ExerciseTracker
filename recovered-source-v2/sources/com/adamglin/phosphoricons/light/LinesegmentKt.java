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

/* compiled from: Linesegment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"LineSegment", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getLineSegment", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_lineSegment", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LinesegmentKt {
    private static ImageVector _lineSegment;

    public static final ImageVector getLineSegment(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _lineSegment;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("LineSegment", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(213.23f, 42.77f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, false, false, 167.0f, 80.54f);
        pathBuilder.lineTo(80.54f, 167.0f);
        pathBuilder.arcToRelative(30.07f, 30.07f, 0.0f, false, false, -37.77f, 3.81f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, true, false, 89.0f, 175.46f);
        pathBuilder.lineTo(175.46f, 89.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, false, 37.77f, -46.25f);
        pathBuilder.close();
        pathBuilder.moveTo(76.72f, 204.77f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, true, true, 0.0f, -25.46f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, true, 76.72f, 204.74f);
        pathBuilder.close();
        pathBuilder.moveTo(204.72f, 76.77f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, false, true, -25.46f, 0.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, true, true, 25.46f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _lineSegment = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
