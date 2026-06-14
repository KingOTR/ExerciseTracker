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

/* compiled from: Scribbleloop.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ScribbleLoop", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getScribbleLoop", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_scribbleLoop", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScribbleloopKt {
    private static ImageVector _scribbleLoop;

    public static final ImageVector getScribbleLoop(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(252.45f, 156.0f);
        pathBuilder.curveToRelative(-1.32f, -1.46f, -24.27f, -26.42f, -61.37f, -40.5f);
        pathBuilder.curveToRelative(-1.5f, -18.49f, -8.13f, -35.31f, -19.0f, -48.0f);
        pathBuilder.curveTo(157.74f, 50.8f, 137.0f, 42.0f, 112.0f, 42.0f);
        pathBuilder.curveTo(61.49f, 42.0f, 28.5f, 87.38f, 27.12f, 89.31f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 9.76f, 7.0f);
        pathBuilder.curveTo(37.18f, 95.87f, 67.75f, 54.0f, 112.0f, 54.0f);
        pathBuilder.curveToRelative(21.37f, 0.0f, 39.0f, 7.35f, 50.93f, 21.27f);
        pathBuilder.curveToRelative(8.26f, 9.62f, 13.64f, 22.14f, 15.62f, 36.06f);
        pathBuilder.arcToRelative(139.0f, 139.0f, 0.0f, false, false, -38.0f, -5.33f);
        pathBuilder.curveToRelative(-25.58f, 0.0f, -47.0f, 6.65f, -62.0f, 19.22f);
        pathBuilder.curveToRelative(-13.1f, 11.0f, -20.62f, 26.34f, -20.62f, 42.0f);
        pathBuilder.arcToRelative(45.65f, 45.65f, 0.0f, false, false, 13.28f, 32.64f);
        pathBuilder.curveTo(80.56f, 209.12f, 93.47f, 214.0f, 108.6f, 214.0f);
        pathBuilder.curveToRelative(51.73f, 0.0f, 80.55f, -43.09f, 82.68f, -85.38f);
        pathBuilder.curveToRelative(32.05f, 13.49f, 52.0f, 35.09f, 52.27f, 35.4f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.9f, -8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(161.0f, 177.53f);
        pathBuilder.curveTo(151.92f, 188.69f, 135.44f, 202.0f, 108.6f, 202.0f);
        pathBuilder.curveTo(90.0f, 202.0f, 70.0f, 191.12f, 70.0f, 167.25f);
        pathBuilder.curveTo(70.0f, 143.53f, 92.09f, 118.0f, 140.6f, 118.0f);
        pathBuilder.arcToRelative(126.74f, 126.74f, 0.0f, false, true, 38.8f, 6.22f);
        pathBuilder.curveTo(179.26f, 143.94f, 172.58f, 163.34f, 161.0f, 177.53f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _scribbleLoop = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
