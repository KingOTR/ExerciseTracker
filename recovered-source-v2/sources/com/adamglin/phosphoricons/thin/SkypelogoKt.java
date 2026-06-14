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

/* compiled from: Skypelogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SkypeLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getSkypeLogo", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_skypeLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SkypelogoKt {
    private static ImageVector _skypeLogo;

    public static final ImageVector getSkypeLogo(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(164.0f, 152.0f);
        pathBuilder.curveToRelative(0.0f, 15.44f, -16.15f, 28.0f, -36.0f, 28.0f);
        pathBuilder.reflectiveCurveToRelative(-36.0f, -12.56f, -36.0f, -28.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 11.0f, 12.56f, 20.0f, 28.0f, 20.0f);
        pathBuilder.reflectiveCurveToRelative(28.0f, -9.0f, 28.0f, -20.0f);
        pathBuilder.curveToRelative(0.0f, -12.58f, -11.79f, -16.92f, -29.78f, -22.11f);
        pathBuilder.curveTo(111.0f, 125.51f, 93.78f, 120.54f, 93.78f, 104.0f);
        pathBuilder.curveToRelative(0.0f, -16.0f, 14.71f, -28.0f, 34.22f, -28.0f);
        pathBuilder.curveToRelative(14.2f, 0.0f, 26.29f, 6.46f, 31.55f, 16.85f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -7.13f, 3.61f);
        pathBuilder.curveTo(148.53f, 88.78f, 139.17f, 84.0f, 128.0f, 84.0f);
        pathBuilder.curveToRelative(-15.0f, 0.0f, -26.22f, 8.6f, -26.22f, 20.0f);
        pathBuilder.curveToRelative(0.0f, 9.81f, 10.07f, 13.43f, 26.66f, 18.21f);
        pathBuilder.reflectiveCurveTo(164.0f, 132.46f, 164.0f, 152.0f);
        pathBuilder.close();
        pathBuilder.moveTo(228.0f, 176.0f);
        pathBuilder.arcToRelative(52.06f, 52.06f, 0.0f, false, true, -52.0f, 52.0f);
        pathBuilder.arcToRelative(51.43f, 51.43f, 0.0f, false, true, -30.26f, -9.71f);
        pathBuilder.arcToRelative(92.08f, 92.08f, 0.0f, false, true, -108.0f, -108.0f);
        pathBuilder.arcTo(51.43f, 51.43f, 0.0f, false, true, 28.0f, 80.0f);
        pathBuilder.arcTo(52.06f, 52.06f, 0.0f, false, true, 80.0f, 28.0f);
        pathBuilder.arcToRelative(51.43f, 51.43f, 0.0f, false, true, 30.26f, 9.71f);
        pathBuilder.arcToRelative(92.08f, 92.08f, 0.0f, false, true, 108.0f, 108.0f);
        pathBuilder.arcTo(51.43f, 51.43f, 0.0f, false, true, 228.0f, 176.0f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 176.0f);
        pathBuilder.arcToRelative(43.63f, 43.63f, 0.0f, false, false, -9.15f, -26.87f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.75f, -3.29f);
        pathBuilder.arcTo(84.07f, 84.07f, 0.0f, false, false, 110.16f, 45.9f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.29f, -0.75f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, false, -61.72f, 61.72f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.75f, 3.29f);
        pathBuilder.arcToRelative(84.07f, 84.07f, 0.0f, false, false, 99.94f, 99.94f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.29f, 0.75f);
        pathBuilder.arcTo(44.0f, 44.0f, 0.0f, false, false, 220.0f, 176.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _skypeLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
