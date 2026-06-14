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

/* compiled from: Scribble.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Scribble", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getScribble", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_scribble", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScribbleKt {
    private static ImageVector _scribble;

    public static final ImageVector getScribble(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(216.0f, 56.0f);
        pathBuilder.verticalLineTo(200.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f);
        pathBuilder.horizontalLineTo(56.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f);
        pathBuilder.verticalLineTo(56.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 40.0f);
        pathBuilder.horizontalLineTo(200.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 216.0f, 56.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(205.67f, 189.66f);
        pathBuilder2.arcToRelative(14.61f, 14.61f, 0.0f, false, false, 0.0f, 20.68f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f);
        pathBuilder2.arcToRelative(30.64f, 30.64f, 0.0f, false, true, 0.0f, -43.32f);
        pathBuilder2.lineToRelative(9.38f, -9.37f);
        pathBuilder2.arcTo(14.63f, 14.63f, 0.0f, false, false, 183.0f, 148.28f);
        pathBuilder2.lineTo(116.28f, 215.0f);
        pathBuilder2.arcTo(30.63f, 30.63f, 0.0f, false, true, 73.0f, 171.72f);
        pathBuilder2.lineTo(171.72f, 73.0f);
        pathBuilder2.arcTo(14.63f, 14.63f, 0.0f, false, false, 151.0f, 52.28f);
        pathBuilder2.lineTo(84.28f, 119.0f);
        pathBuilder2.arcTo(30.63f, 30.63f, 0.0f, false, true, 41.0f, 75.72f);
        pathBuilder2.lineTo(82.34f, 34.34f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 93.65f, 45.66f);
        pathBuilder2.lineTo(52.27f, 87.0f);
        pathBuilder2.arcTo(14.63f, 14.63f, 0.0f, false, false, 73.0f, 107.72f);
        pathBuilder2.lineTo(139.72f, 41.0f);
        pathBuilder2.arcTo(30.63f, 30.63f, 0.0f, false, true, 183.0f, 84.28f);
        pathBuilder2.lineTo(84.28f, 183.0f);
        pathBuilder2.arcTo(14.63f, 14.63f, 0.0f, false, false, 105.0f, 203.72f);
        pathBuilder2.lineTo(171.72f, 137.0f);
        pathBuilder2.arcTo(30.63f, 30.63f, 0.0f, false, true, 215.0f, 180.28f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _scribble = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
