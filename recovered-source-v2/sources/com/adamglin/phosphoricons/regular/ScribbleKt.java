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

/* compiled from: Scribble.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Scribble", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getScribble", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_scribble", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScribbleKt {
    private static ImageVector _scribble;

    public static final ImageVector getScribble(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _scribble;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Scribble", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(205.67f, 189.66f);
        pathBuilder.arcToRelative(14.61f, 14.61f, 0.0f, false, false, 0.0f, 20.68f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f);
        pathBuilder.arcToRelative(30.64f, 30.64f, 0.0f, false, true, 0.0f, -43.32f);
        pathBuilder.lineToRelative(9.38f, -9.37f);
        pathBuilder.arcTo(14.63f, 14.63f, 0.0f, false, false, 183.0f, 148.28f);
        pathBuilder.lineTo(116.28f, 215.0f);
        pathBuilder.arcTo(30.63f, 30.63f, 0.0f, false, true, 73.0f, 171.72f);
        pathBuilder.lineTo(171.72f, 73.0f);
        pathBuilder.arcTo(14.63f, 14.63f, 0.0f, false, false, 151.0f, 52.28f);
        pathBuilder.lineTo(84.28f, 119.0f);
        pathBuilder.arcTo(30.63f, 30.63f, 0.0f, false, true, 41.0f, 75.72f);
        pathBuilder.lineTo(82.34f, 34.34f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 93.65f, 45.66f);
        pathBuilder.lineTo(52.27f, 87.0f);
        pathBuilder.arcTo(14.63f, 14.63f, 0.0f, false, false, 73.0f, 107.72f);
        pathBuilder.lineTo(139.72f, 41.0f);
        pathBuilder.arcTo(30.63f, 30.63f, 0.0f, false, true, 183.0f, 84.28f);
        pathBuilder.lineTo(84.28f, 183.0f);
        pathBuilder.arcTo(14.63f, 14.63f, 0.0f, false, false, 105.0f, 203.72f);
        pathBuilder.lineTo(171.72f, 137.0f);
        pathBuilder.arcTo(30.63f, 30.63f, 0.0f, false, true, 215.0f, 180.28f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _scribble = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
