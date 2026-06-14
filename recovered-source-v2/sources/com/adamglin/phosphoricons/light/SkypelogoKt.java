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

/* compiled from: Skypelogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SkypeLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getSkypeLogo", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_skypeLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SkypelogoKt {
    private static ImageVector _skypeLogo;

    public static final ImageVector getSkypeLogo(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _skypeLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("SkypeLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(166.0f, 152.0f);
        pathBuilder.curveToRelative(0.0f, 16.54f, -17.05f, 30.0f, -38.0f, 30.0f);
        pathBuilder.reflectiveCurveToRelative(-38.0f, -13.46f, -38.0f, -30.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 9.76f, 11.91f, 18.0f, 26.0f, 18.0f);
        pathBuilder.reflectiveCurveToRelative(26.0f, -8.24f, 26.0f, -18.0f);
        pathBuilder.curveToRelative(0.0f, -11.21f, -10.7f, -15.1f, -28.33f, -20.18f);
        pathBuilder.curveToRelative(-15.89f, -4.58f, -33.89f, -9.77f, -33.89f, -27.82f);
        pathBuilder.curveToRelative(0.0f, -17.1f, 15.57f, -30.0f, 36.22f, -30.0f);
        pathBuilder.curveToRelative(15.0f, 0.0f, 27.74f, 6.88f, 33.34f, 18.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -10.71f, 5.42f);
        pathBuilder.curveTo(147.08f, 90.36f, 138.41f, 86.0f, 128.0f, 86.0f);
        pathBuilder.curveToRelative(-13.81f, 0.0f, -24.22f, 7.74f, -24.22f, 18.0f);
        pathBuilder.curveToRelative(0.0f, 8.41f, 9.52f, 11.76f, 25.21f, 16.29f);
        pathBuilder.curveTo(145.48f, 125.0f, 166.0f, 131.0f, 166.0f, 152.0f);
        pathBuilder.close();
        pathBuilder.moveTo(230.0f, 176.0f);
        pathBuilder.arcToRelative(54.06f, 54.06f, 0.0f, false, true, -54.0f, 54.0f);
        pathBuilder.arcToRelative(53.43f, 53.43f, 0.0f, false, true, -30.72f, -9.59f);
        pathBuilder.arcTo(94.06f, 94.06f, 0.0f, false, true, 35.59f, 110.72f);
        pathBuilder.arcTo(53.43f, 53.43f, 0.0f, false, true, 26.0f, 80.0f);
        pathBuilder.arcTo(54.06f, 54.06f, 0.0f, false, true, 80.0f, 26.0f);
        pathBuilder.arcToRelative(53.43f, 53.43f, 0.0f, false, true, 30.72f, 9.59f);
        pathBuilder.arcTo(94.06f, 94.06f, 0.0f, false, true, 220.41f, 145.28f);
        pathBuilder.arcTo(53.43f, 53.43f, 0.0f, false, true, 230.0f, 176.0f);
        pathBuilder.close();
        pathBuilder.moveTo(218.0f, 176.0f);
        pathBuilder.arcToRelative(41.57f, 41.57f, 0.0f, false, false, -8.74f, -25.65f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -1.11f, -4.93f);
        pathBuilder.arcToRelative(82.09f, 82.09f, 0.0f, false, false, -97.57f, -97.57f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.93f, -1.11f);
        pathBuilder.arcTo(41.57f, 41.57f, 0.0f, false, false, 80.0f, 38.0f);
        pathBuilder.arcTo(42.0f, 42.0f, 0.0f, false, false, 38.0f, 80.0f);
        pathBuilder.arcToRelative(41.57f, 41.57f, 0.0f, false, false, 8.74f, 25.65f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 1.11f, 4.93f);
        pathBuilder.arcToRelative(82.09f, 82.09f, 0.0f, false, false, 97.57f, 97.57f);
        pathBuilder.arcToRelative(5.95f, 5.95f, 0.0f, false, true, 4.93f, 1.11f);
        pathBuilder.arcTo(41.57f, 41.57f, 0.0f, false, false, 176.0f, 218.0f);
        pathBuilder.arcTo(42.0f, 42.0f, 0.0f, false, false, 218.0f, 176.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _skypeLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
