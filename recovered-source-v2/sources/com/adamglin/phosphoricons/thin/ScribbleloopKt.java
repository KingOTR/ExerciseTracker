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

/* compiled from: Scribbleloop.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ScribbleLoop", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getScribbleLoop", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_scribbleLoop", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScribbleloopKt {
    private static ImageVector _scribbleLoop;

    public static final ImageVector getScribbleLoop(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(251.0f, 157.32f);
        pathBuilder.curveToRelative(-1.32f, -1.46f, -24.47f, -26.63f, -61.79f, -40.43f);
        pathBuilder.curveToRelative(-1.26f, -18.56f, -7.78f, -35.45f, -18.66f, -48.13f);
        pathBuilder.curveTo(156.62f, 52.56f, 136.38f, 44.0f, 112.0f, 44.0f);
        pathBuilder.curveTo(62.51f, 44.0f, 30.1f, 88.58f, 28.74f, 90.48f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.51f, 4.65f);
        pathBuilder.curveTo(35.56f, 94.7f, 66.68f, 52.0f, 112.0f, 52.0f);
        pathBuilder.curveToRelative(22.0f, 0.0f, 40.11f, 7.6f, 52.45f, 22.0f);
        pathBuilder.curveToRelative(9.11f, 10.61f, 14.81f, 24.62f, 16.46f, 40.13f);
        pathBuilder.arcTo(137.84f, 137.84f, 0.0f, false, false, 140.6f, 108.0f);
        pathBuilder.curveToRelative(-25.1f, 0.0f, -46.09f, 6.48f, -60.69f, 18.75f);
        pathBuilder.curveTo(67.26f, 137.39f, 60.0f, 152.15f, 60.0f, 167.25f);
        pathBuilder.arcToRelative(43.64f, 43.64f, 0.0f, false, false, 12.69f, 31.22f);
        pathBuilder.curveTo(81.59f, 207.32f, 94.0f, 212.0f, 108.6f, 212.0f);
        pathBuilder.curveToRelative(51.63f, 0.0f, 79.87f, -44.08f, 80.78f, -86.32f);
        pathBuilder.curveToRelative(34.07f, 13.58f, 55.36f, 36.67f, 55.65f, 37.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.94f, -5.36f);
        pathBuilder.close();
        pathBuilder.moveTo(162.6f, 178.79f);
        pathBuilder.curveToRelative(-9.37f, 11.5f, -26.34f, 25.21f, -54.0f, 25.21f);
        pathBuilder.curveTo(80.71f, 204.0f, 68.0f, 185.0f, 68.0f, 167.25f);
        pathBuilder.curveTo(68.0f, 142.57f, 90.72f, 116.0f, 140.6f, 116.0f);
        pathBuilder.arcToRelative(129.23f, 129.23f, 0.0f, false, true, 40.8f, 6.77f);
        pathBuilder.verticalLineToRelative(0.81f);
        pathBuilder.curveTo(181.4f, 144.0f, 174.54f, 164.1f, 162.57f, 178.79f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _scribbleLoop = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
