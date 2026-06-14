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

/* compiled from: Scribbleloop.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ScribbleLoop", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getScribbleLoop", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_scribbleLoop", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScribbleloopKt {
    private static ImageVector _scribbleLoop;

    public static final ImageVector getScribbleLoop(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _scribbleLoop;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ScribbleLoop", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 128.0f);
        pathBuilder.arcToRelative(81.4f, 81.4f, 0.0f, false, true, 25.69f, 4.28f);
        pathBuilder.curveTo(151.56f, 154.87f, 137.33f, 176.0f, 112.0f, 176.0f);
        pathBuilder.curveToRelative(-15.8f, 0.0f, -24.06f, -10.85f, -24.06f, -21.58f);
        pathBuilder.curveToRelative(0.0f, -6.59f, 3.0f, -12.75f, 8.56f, -17.35f);
        pathBuilder.curveTo(103.62f, 131.14f, 114.52f, 128.0f, 128.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(224.0f, 48.0f);
        pathBuilder.lineTo(224.0f, 208.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f);
        pathBuilder.lineTo(48.0f, 224.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f);
        pathBuilder.lineTo(32.0f, 48.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 32.0f);
        pathBuilder.lineTo(208.0f, 32.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(205.89f, 146.59f);
        pathBuilder.arcToRelative(120.21f, 120.21f, 0.0f, false, false, -36.08f, -25.21f);
        pathBuilder.curveToRelative(-0.9f, -14.35f, -5.75f, -27.54f, -13.89f, -37.55f);
        pathBuilder.curveTo(145.38f, 70.86f, 130.19f, 64.0f, 112.0f, 64.0f);
        pathBuilder.curveTo(76.44f, 64.0f, 50.68f, 97.76f, 49.6f, 99.2f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.79f, 9.62f);
        pathBuilder.curveTo(62.61f, 108.53f, 84.51f, 80.0f, 112.0f, 80.0f);
        pathBuilder.curveToRelative(13.4f, 0.0f, 24.0f, 4.68f, 31.5f, 13.92f);
        pathBuilder.arcToRelative(47.54f, 47.54f, 0.0f, false, true, 9.48f, 21.4f);
        pathBuilder.arcTo(96.75f, 96.75f, 0.0f, false, false, 128.0f, 112.0f);
        pathBuilder.curveToRelative(-17.27f, 0.0f, -31.71f, 4.42f, -41.74f, 12.78f);
        pathBuilder.curveTo(77.0f, 132.47f, 71.94f, 143.0f, 71.94f, 154.42f);
        pathBuilder.curveTo(71.94f, 172.64f, 86.0f, 192.0f, 112.0f, 192.0f);
        pathBuilder.arcToRelative(54.0f, 54.0f, 0.0f, false, false, 43.53f, -21.23f);
        pathBuilder.arcTo(70.0f, 70.0f, 0.0f, false, false, 169.0f, 138.89f);
        pathBuilder.arcToRelative(106.24f, 106.24f, 0.0f, false, true, 25.13f, 18.52f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.78f, -10.82f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _scribbleLoop = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
