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

/* compiled from: Threadslogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ThreadsLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getThreadsLogo", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_threadsLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ThreadslogoKt {
    private static ImageVector _threadsLogo;

    public static final ImageVector getThreadsLogo(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _threadsLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ThreadsLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(185.22f, 125.25f);
        pathBuilder.arcToRelative(62.0f, 62.0f, 0.0f, false, false, -11.78f, -7.0f);
        pathBuilder.curveToRelative(-3.53f, -29.6f, -23.0f, -38.82f, -31.83f, -41.5f);
        pathBuilder.curveToRelative(-19.0f, -5.74f, -40.73f, 1.09f, -50.6f, 15.9f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 10.0f, 6.66f);
        pathBuilder.curveToRelative(6.94f, -10.41f, 23.25f, -15.28f, 37.14f, -11.07f);
        pathBuilder.curveToRelative(7.22f, 2.18f, 18.39f, 8.34f, 22.39f, 25.61f);
        pathBuilder.arcToRelative(78.74f, 78.74f, 0.0f, false, false, -18.11f, -2.08f);
        pathBuilder.curveToRelative(-13.53f, 0.0f, -26.16f, 3.46f, -35.55f, 9.77f);
        pathBuilder.curveTo(96.0f, 128.85f, 90.0f, 139.66f, 90.0f, 152.0f);
        pathBuilder.curveToRelative(0.0f, 22.0f, 18.0f, 33.52f, 35.71f, 33.52f);
        pathBuilder.arcToRelative(46.0f, 46.0f, 0.0f, false, false, 32.91f, -14.19f);
        pathBuilder.curveToRelative(6.58f, -6.85f, 14.35f, -19.11f, 15.29f, -39.26f);
        pathBuilder.arcToRelative(44.59f, 44.59f, 0.0f, false, true, 4.07f, 2.75f);
        pathBuilder.curveToRelative(10.48f, 7.92f, 16.0f, 19.4f, 16.0f, 33.18f);
        pathBuilder.curveToRelative(0.0f, 20.16f, -21.0f, 50.0f, -66.0f, 50.0f);
        pathBuilder.curveToRelative(-27.07f, 0.0f, -46.92f, -9.19f, -59.0f, -27.33f);
        pathBuilder.curveTo(59.0f, 175.75f, 54.0f, 154.66f, 54.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(5.0f, -47.75f, 15.0f, -62.67f);
        pathBuilder.curveTo(81.08f, 47.19f, 100.93f, 38.0f, 128.0f, 38.0f);
        pathBuilder.curveToRelative(33.85f, 0.0f, 55.57f, 13.67f, 66.4f, 41.8f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 11.2f, -4.31f);
        pathBuilder.curveTo(193.0f, 42.65f, 166.85f, 26.0f, 128.0f, 26.0f);
        pathBuilder.curveTo(96.67f, 26.0f, 73.46f, 37.0f, 59.0f, 58.67f);
        pathBuilder.curveTo(47.72f, 75.6f, 42.0f, 98.93f, 42.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(5.72f, 52.4f, 17.0f, 69.33f);
        pathBuilder.curveTo(73.46f, 219.0f, 96.67f, 230.0f, 128.0f, 230.0f);
        pathBuilder.curveToRelative(29.43f, 0.0f, 47.81f, -11.19f, 58.05f, -20.58f);
        pathBuilder.curveTo(198.54f, 198.0f, 206.0f, 182.49f, 206.0f, 168.0f);
        pathBuilder.curveTo(206.0f, 150.31f, 198.81f, 135.52f, 185.22f, 125.25f);
        pathBuilder.close();
        pathBuilder.moveTo(150.0f, 163.0f);
        pathBuilder.arcToRelative(33.94f, 33.94f, 0.0f, false, true, -24.26f, 10.51f);
        pathBuilder.curveTo(109.33f, 173.52f, 102.0f, 162.71f, 102.0f, 152.0f);
        pathBuilder.curveToRelative(0.0f, -13.59f, 12.64f, -28.21f, 40.41f, -28.21f);
        pathBuilder.arcToRelative(65.33f, 65.33f, 0.0f, false, true, 19.58f, 3.0f);
        pathBuilder.curveToRelative(0.0f, 0.41f, 0.0f, 0.82f, 0.0f, 1.24f);
        pathBuilder.curveTo(162.0f, 142.72f, 157.84f, 154.82f, 150.0f, 163.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _threadsLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
