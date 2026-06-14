package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Scribbleloop.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ScribbleLoop", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getScribbleLoop", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_scribbleLoop", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScribbleloopKt {
    private static ImageVector _scribbleLoop;

    public static final ImageVector getScribbleLoop(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(252.9f, 152.0f);
        pathBuilder.curveToRelative(-1.33f, -1.47f, -23.75f, -25.85f, -60.21f, -40.69f);
        pathBuilder.curveToRelative(-2.15f, -18.28f, -9.1f, -34.9f, -20.1f, -47.71f);
        pathBuilder.curveTo(157.12f, 45.52f, 134.79f, 36.0f, 108.0f, 36.0f);
        pathBuilder.curveTo(54.44f, 36.0f, 19.69f, 83.79f, 18.24f, 85.82f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 19.53f, 14.0f);
        pathBuilder.curveTo(38.05f, 99.38f, 66.65f, 60.0f, 108.0f, 60.0f);
        pathBuilder.curveToRelative(19.85f, 0.0f, 35.45f, 6.45f, 46.38f, 19.18f);
        pathBuilder.arcToRelative(61.35f, 61.35f, 0.0f, false, true, 12.4f, 24.0f);
        pathBuilder.arcTo(143.6f, 143.6f, 0.0f, false, false, 136.61f, 100.0f);
        pathBuilder.curveToRelative(-27.0f, 0.0f, -49.79f, 7.13f, -65.85f, 20.63f);
        pathBuilder.curveTo(56.3f, 132.79f, 48.0f, 149.78f, 48.0f, 167.25f);
        pathBuilder.curveTo(48.0f, 193.46f, 67.44f, 220.0f, 104.61f, 220.0f);
        pathBuilder.curveToRelative(51.93f, 0.0f, 82.34f, -40.28f, 87.87f, -82.43f);
        pathBuilder.arcToRelative(156.46f, 156.46f, 0.0f, false, true, 42.62f, 30.48f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, true, false, 252.9f, 152.0f);
        pathBuilder.close();
        pathBuilder.moveTo(152.37f, 173.74f);
        pathBuilder.curveTo(144.09f, 183.9f, 129.09f, 196.0f, 104.61f, 196.0f);
        pathBuilder.curveTo(82.08f, 196.0f, 72.0f, 181.56f, 72.0f, 167.25f);
        pathBuilder.curveTo(72.0f, 146.42f, 92.22f, 124.0f, 136.61f, 124.0f);
        pathBuilder.arcToRelative(119.85f, 119.85f, 0.0f, false, true, 32.64f, 4.62f);
        pathBuilder.curveTo(168.24f, 145.44f, 162.21f, 161.66f, 152.37f, 173.74f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _scribbleLoop = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
