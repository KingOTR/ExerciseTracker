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

/* compiled from: Twitterlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TwitterLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getTwitterLogo", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_twitterLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TwitterlogoKt {
    private static ImageVector _twitterLogo;

    public static final ImageVector getTwitterLogo(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _twitterLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("TwitterLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(240.0f, 72.0f);
        pathBuilder.lineToRelative(-32.0f, 32.0f);
        pathBuilder.curveToRelative(-4.26f, 66.84f, -60.08f, 120.0f, -128.0f, 120.0f);
        pathBuilder.curveToRelative(-32.0f, 0.0f, -40.0f, -12.0f, -40.0f, -12.0f);
        pathBuilder.reflectiveCurveToRelative(32.0f, -12.0f, 48.0f, -36.0f);
        pathBuilder.curveToRelative(0.0f, 0.0f, -55.15f, -32.0f, -47.22f, -120.0f);
        pathBuilder.curveToRelative(0.0f, 0.0f, 39.66f, 40.0f, 87.22f, 48.0f);
        pathBuilder.verticalLineTo(88.0f);
        pathBuilder.curveToRelative(0.0f, -22.0f, 18.0f, -40.27f, 40.0f, -40.0f);
        pathBuilder.arcToRelative(40.74f, 40.74f, 0.0f, false, true, 36.67f, 24.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(247.39f, 68.94f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 240.0f, 64.0f);
        pathBuilder2.lineTo(209.57f, 64.0f);
        pathBuilder2.arcTo(48.65f, 48.65f, 0.0f, false, false, 168.1f, 40.0f);
        pathBuilder2.arcToRelative(46.87f, 46.87f, 0.0f, false, false, -33.74f, 13.7f);
        pathBuilder2.arcTo(47.87f, 47.87f, 0.0f, false, false, 120.0f, 88.0f);
        pathBuilder2.verticalLineToRelative(6.09f);
        pathBuilder2.curveTo(79.74f, 83.47f, 46.81f, 50.72f, 46.46f, 50.37f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.65f, 4.92f);
        pathBuilder2.curveToRelative(-4.3f, 47.79f, 9.57f, 79.77f, 22.0f, 98.18f);
        pathBuilder2.arcToRelative(110.92f, 110.92f, 0.0f, false, false, 21.89f, 24.2f);
        pathBuilder2.curveTo(61.43f, 195.2f, 37.45f, 204.41f, 37.2f, 204.51f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.85f, 11.93f);
        pathBuilder2.curveToRelative(0.74f, 1.12f, 3.75f, 5.05f, 11.08f, 8.72f);
        pathBuilder2.curveTo(53.51f, 229.7f, 65.48f, 232.0f, 80.0f, 232.0f);
        pathBuilder2.curveToRelative(70.68f, 0.0f, 129.72f, -54.42f, 135.76f, -124.44f);
        pathBuilder2.lineToRelative(29.9f, -29.9f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 247.39f, 68.94f);
        pathBuilder2.close();
        pathBuilder2.moveTo(202.39f, 98.35f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.32f, 5.14f);
        pathBuilder2.curveTo(196.0f, 166.58f, 143.28f, 216.0f, 80.0f, 216.0f);
        pathBuilder2.curveToRelative(-10.56f, 0.0f, -18.0f, -1.4f, -23.22f, -3.08f);
        pathBuilder2.curveToRelative(11.52f, -6.25f, 27.56f, -17.0f, 37.88f, -32.48f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.61f, -11.34f);
        pathBuilder2.curveToRelative(-0.13f, -0.08f, -12.86f, -7.74f, -24.48f, -25.29f);
        pathBuilder2.curveTo(54.54f, 124.11f, 48.0f, 100.38f, 48.0f, 73.09f);
        pathBuilder2.curveToRelative(16.0f, 13.0f, 45.25f, 33.18f, 78.69f, 38.8f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 136.0f, 104.0f);
        pathBuilder2.lineTo(136.0f, 88.0f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, false, true, 9.6f, -22.92f);
        pathBuilder2.arcTo(30.89f, 30.89f, 0.0f, false, true, 167.9f, 56.0f);
        pathBuilder2.curveToRelative(12.66f, 0.16f, 24.49f, 7.88f, 29.44f, 19.21f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 204.67f, 80.0f);
        pathBuilder2.horizontalLineToRelative(16.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _twitterLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
