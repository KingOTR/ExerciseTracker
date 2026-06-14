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

/* compiled from: Threadslogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ThreadsLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getThreadsLogo", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_threadsLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ThreadslogoKt {
    private static ImageVector _threadsLogo;

    public static final ImageVector getThreadsLogo(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(208.0f, 128.0f);
        pathBuilder.curveToRelative(0.0f, 48.0f, -16.0f, 96.0f, -80.0f, 96.0f);
        pathBuilder.reflectiveCurveToRelative(-80.0f, -48.0f, -80.0f, -96.0f);
        pathBuilder.reflectiveCurveToRelative(16.0f, -96.0f, 80.0f, -96.0f);
        pathBuilder.reflectiveCurveTo(208.0f, 80.0f, 208.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(186.42f, 123.65f);
        pathBuilder2.arcToRelative(63.81f, 63.81f, 0.0f, false, false, -11.13f, -6.72f);
        pathBuilder2.curveToRelative(-4.0f, -29.89f, -24.0f, -39.31f, -33.1f, -42.07f);
        pathBuilder2.curveToRelative(-19.78f, -6.0f, -42.51f, 1.19f, -52.85f, 16.7f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.32f, 8.88f);
        pathBuilder2.curveToRelative(6.37f, -9.56f, 22.0f, -14.16f, 34.89f, -10.27f);
        pathBuilder2.curveToRelative(9.95f, 3.0f, 16.82f, 10.3f, 20.15f, 21.0f);
        pathBuilder2.arcToRelative(81.05f, 81.05f, 0.0f, false, false, -15.29f, -1.43f);
        pathBuilder2.curveToRelative(-13.92f, 0.0f, -26.95f, 3.59f, -36.67f, 10.1f);
        pathBuilder2.curveTo(94.3f, 127.57f, 88.0f, 139.0f, 88.0f, 152.0f);
        pathBuilder2.curveToRelative(0.0f, 20.58f, 15.86f, 35.52f, 37.71f, 35.52f);
        pathBuilder2.arcToRelative(48.0f, 48.0f, 0.0f, false, false, 34.35f, -14.81f);
        pathBuilder2.curveToRelative(6.44f, -6.7f, 14.0f, -18.36f, 15.61f, -37.1f);
        pathBuilder2.curveToRelative(0.38f, 0.26f, 0.74f, 0.53f, 1.1f, 0.8f);
        pathBuilder2.curveTo(186.88f, 144.05f, 192.0f, 154.68f, 192.0f, 168.0f);
        pathBuilder2.curveToRelative(0.0f, 19.36f, -20.34f, 48.0f, -64.0f, 48.0f);
        pathBuilder2.curveToRelative(-26.73f, 0.0f, -45.48f, -8.65f, -57.34f, -26.44f);
        pathBuilder2.curveTo(60.93f, 175.0f, 56.0f, 154.26f, 56.0f, 128.0f);
        pathBuilder2.reflectiveCurveToRelative(4.93f, -47.0f, 14.66f, -61.56f);
        pathBuilder2.curveTo(82.52f, 48.65f, 101.27f, 40.0f, 128.0f, 40.0f);
        pathBuilder2.curveToRelative(32.93f, 0.0f, 54.0f, 13.25f, 64.53f, 40.52f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 14.93f, -5.75f);
        pathBuilder2.curveTo(194.68f, 41.56f, 167.2f, 24.0f, 128.0f, 24.0f);
        pathBuilder2.curveTo(96.0f, 24.0f, 72.19f, 35.29f, 57.34f, 57.56f);
        pathBuilder2.curveTo(45.83f, 74.83f, 40.0f, 98.52f, 40.0f, 128.0f);
        pathBuilder2.reflectiveCurveToRelative(5.83f, 53.17f, 17.34f, 70.44f);
        pathBuilder2.curveTo(72.19f, 220.71f, 96.0f, 232.0f, 128.0f, 232.0f);
        pathBuilder2.curveToRelative(30.07f, 0.0f, 48.9f, -11.48f, 59.4f, -21.1f);
        pathBuilder2.curveTo(200.3f, 199.08f, 208.0f, 183.0f, 208.0f, 168.0f);
        pathBuilder2.curveTo(208.0f, 149.66f, 200.54f, 134.32f, 186.42f, 123.65f);
        pathBuilder2.close();
        pathBuilder2.moveTo(148.53f, 161.65f);
        pathBuilder2.arcToRelative(31.94f, 31.94f, 0.0f, false, true, -22.82f, 9.9f);
        pathBuilder2.curveToRelative(-10.81f, 0.0f, -21.71f, -6.0f, -21.71f, -19.52f);
        pathBuilder2.curveToRelative(0.0f, -12.63f, 12.0f, -26.21f, 38.41f, -26.21f);
        pathBuilder2.arcTo(63.88f, 63.88f, 0.0f, false, true, 160.0f, 128.24f);
        pathBuilder2.curveTo(160.0f, 142.32f, 156.0f, 153.86f, 148.53f, 161.62f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _threadsLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
