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

/* compiled from: Threadslogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ThreadsLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getThreadsLogo", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_threadsLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ThreadslogoKt {
    private static ImageVector _threadsLogo;

    public static final ImageVector getThreadsLogo(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(188.84f, 120.46f);
        pathBuilder.arcToRelative(68.14f, 68.14f, 0.0f, false, false, -10.0f, -6.23f);
        pathBuilder.curveToRelative(-3.72f, -21.68f, -16.41f, -37.41f, -35.52f, -43.2f);
        pathBuilder.curveTo(121.94f, 64.55f, 97.29f, 72.42f, 86.0f, 89.34f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 20.0f, 13.32f);
        pathBuilder.curveToRelative(5.47f, -8.2f, 19.11f, -12.08f, 30.41f, -8.66f);
        pathBuilder.arcToRelative(24.72f, 24.72f, 0.0f, false, true, 14.88f, 12.24f);
        pathBuilder.arcToRelative(86.73f, 86.73f, 0.0f, false, false, -8.86f, -0.45f);
        pathBuilder.curveTo(108.56f, 105.79f, 84.0f, 125.22f, 84.0f, 152.0f);
        pathBuilder.curveToRelative(0.0f, 22.9f, 17.54f, 39.52f, 41.71f, 39.52f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, false, false, 37.23f, -16.0f);
        pathBuilder.curveToRelative(6.0f, -6.23f, 12.88f, -16.46f, 15.72f, -32.07f);
        pathBuilder.curveToRelative(6.2f, 6.42f, 9.34f, 14.67f, 9.34f, 24.59f);
        pathBuilder.curveToRelative(0.0f, 17.74f, -19.07f, 44.0f, -60.0f, 44.0f);
        pathBuilder.curveToRelative(-45.76f, 0.0f, -68.0f, -27.48f, -68.0f, -84.0f);
        pathBuilder.reflectiveCurveToRelative(22.24f, -84.0f, 68.0f, -84.0f);
        pathBuilder.curveToRelative(31.08f, 0.0f, 51.0f, 12.42f, 60.8f, 38.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 22.4f, -8.62f);
        pathBuilder.curveTo(197.77f, 38.44f, 169.0f, 20.0f, 128.0f, 20.0f);
        pathBuilder.curveTo(68.67f, 20.0f, 36.0f, 58.35f, 36.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(32.67f, 108.0f, 92.0f, 108.0f);
        pathBuilder.curveToRelative(31.36f, 0.0f, 51.08f, -12.05f, 62.11f, -22.15f);
        pathBuilder.curveTo(203.81f, 201.28f, 212.0f, 184.14f, 212.0f, 168.0f);
        pathBuilder.curveTo(212.0f, 148.36f, 204.0f, 131.92f, 188.84f, 120.46f);
        pathBuilder.close();
        pathBuilder.moveTo(145.64f, 158.85f);
        pathBuilder.arcToRelative(27.9f, 27.9f, 0.0f, false, true, -19.93f, 8.67f);
        pathBuilder.curveToRelative(-8.17f, 0.0f, -17.71f, -4.06f, -17.71f, -15.52f);
        pathBuilder.curveToRelative(0.0f, -15.26f, 17.84f, -22.21f, 34.41f, -22.21f);
        pathBuilder.arcToRelative(60.23f, 60.23f, 0.0f, false, true, 13.51f, 1.52f);
        pathBuilder.curveTo(155.36f, 142.93f, 151.84f, 152.41f, 145.64f, 158.85f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _threadsLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
