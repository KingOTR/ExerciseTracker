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

/* compiled from: Threadslogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ThreadsLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getThreadsLogo", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_threadsLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ThreadslogoKt {
    private static ImageVector _threadsLogo;

    public static final ImageVector getThreadsLogo(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(184.0f, 126.84f);
        pathBuilder.arcToRelative(59.8f, 59.8f, 0.0f, false, false, -12.42f, -7.16f);
        pathBuilder.curveToRelative(-3.0f, -29.38f, -22.0f, -38.4f, -30.56f, -41.0f);
        pathBuilder.curveToRelative(-18.16f, -5.5f, -39.0f, 1.0f, -48.36f, 15.09f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.66f, 4.44f);
        pathBuilder.curveToRelative(7.4f, -11.1f, 24.7f, -16.32f, 39.38f, -11.87f);
        pathBuilder.curveToRelative(8.12f, 2.45f, 20.95f, 9.6f, 24.41f, 30.32f);
        pathBuilder.arcToRelative(75.83f, 75.83f, 0.0f, false, false, -20.71f, -2.88f);
        pathBuilder.curveToRelative(-13.14f, 0.0f, -25.37f, 3.34f, -34.44f, 9.43f);
        pathBuilder.curveToRelative(-10.45f, 7.0f, -16.0f, 17.0f, -16.0f, 28.78f);
        pathBuilder.curveToRelative(0.0f, 20.7f, 17.0f, 31.52f, 33.71f, 31.52f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, false, 31.47f, -13.58f);
        pathBuilder.curveToRelative(9.56f, -9.94f, 14.68f, -24.19f, 14.82f, -41.23f);
        pathBuilder.arcToRelative(50.18f, 50.18f, 0.0f, false, true, 7.19f, 4.51f);
        pathBuilder.curveToRelative(11.0f, 8.32f, 16.81f, 20.34f, 16.81f, 34.78f);
        pathBuilder.curveToRelative(0.0f, 11.73f, -6.25f, 24.46f, -16.7f, 34.05f);
        pathBuilder.curveTo(170.36f, 210.24f, 154.21f, 220.0f, 128.0f, 220.0f);
        pathBuilder.curveToRelative(-50.43f, 0.0f, -76.0f, -30.95f, -76.0f, -92.0f);
        pathBuilder.reflectiveCurveToRelative(25.57f, -92.0f, 76.0f, -92.0f);
        pathBuilder.curveToRelative(34.29f, 0.0f, 57.26f, 14.5f, 68.27f, 43.08f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 7.46f, -2.87f);
        pathBuilder.curveTo(191.42f, 44.22f, 165.94f, 28.0f, 128.0f, 28.0f);
        pathBuilder.curveTo(73.05f, 28.0f, 44.0f, 62.58f, 44.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(29.05f, 100.0f, 84.0f, 100.0f);
        pathBuilder.curveToRelative(28.79f, 0.0f, 46.72f, -10.9f, 56.7f, -20.05f);
        pathBuilder.curveToRelative(12.09f, -11.08f, 19.3f, -26.0f, 19.3f, -39.95f);
        pathBuilder.curveTo(204.0f, 151.0f, 197.09f, 136.73f, 184.0f, 126.84f);
        pathBuilder.close();
        pathBuilder.moveTo(151.4f, 164.39f);
        pathBuilder.arcToRelative(35.92f, 35.92f, 0.0f, false, true, -25.7f, 11.13f);
        pathBuilder.curveToRelative(-12.38f, 0.0f, -25.71f, -7.36f, -25.71f, -23.52f);
        pathBuilder.curveToRelative(0.0f, -20.76f, 22.0f, -30.21f, 42.41f, -30.21f);
        pathBuilder.arcTo(67.08f, 67.08f, 0.0f, false, true, 164.0f, 125.3f);
        pathBuilder.curveToRelative(0.0f, 0.88f, 0.05f, 1.78f, 0.05f, 2.7f);
        pathBuilder.curveTo(164.0f, 143.25f, 159.65f, 155.83f, 151.41f, 164.39f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _threadsLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
