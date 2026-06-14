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

/* compiled from: Twitterlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TwitterLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getTwitterLogo", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_twitterLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TwitterlogoKt {
    private static ImageVector _twitterLogo;

    public static final ImageVector getTwitterLogo(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(243.7f, 70.47f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 240.0f, 68.0f);
        pathBuilder.lineTo(207.2f, 68.0f);
        pathBuilder.arcToRelative(44.57f, 44.57f, 0.0f, false, false, -39.15f, -24.0f);
        pathBuilder.arcToRelative(42.76f, 42.76f, 0.0f, false, false, -30.88f, 12.55f);
        pathBuilder.arcTo(43.85f, 43.85f, 0.0f, false, false, 124.0f, 88.0f);
        pathBuilder.lineTo(124.0f, 99.16f);
        pathBuilder.curveToRelative(-43.65f, -9.39f, -80.0f, -45.6f, -80.39f, -46.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.19f, -0.95f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.63f, 3.41f);
        pathBuilder.curveToRelative(-4.2f, 46.62f, 9.27f, 77.71f, 21.31f, 95.59f);
        pathBuilder.arcTo(103.68f, 103.68f, 0.0f, false, false, 82.35f, 177.0f);
        pathBuilder.curveToRelative(-15.68f, 20.49f, -43.46f, 31.13f, -43.75f, 31.24f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.93f, 6.0f);
        pathBuilder.curveToRelative(0.27f, 0.4f, 2.79f, 4.0f, 9.54f, 7.36f);
        pathBuilder.curveTo(54.73f, 225.84f, 66.1f, 228.0f, 80.0f, 228.0f);
        pathBuilder.curveToRelative(69.09f, 0.0f, 126.73f, -53.56f, 131.89f, -122.23f);
        pathBuilder.lineToRelative(30.94f, -30.94f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 243.7f, 70.47f);
        pathBuilder.close();
        pathBuilder.moveTo(205.17f, 101.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.16f, 2.58f);
        pathBuilder.curveTo(199.85f, 168.94f, 145.38f, 220.0f, 80.0f, 220.0f);
        pathBuilder.curveToRelative(-17.85f, 0.0f, -27.63f, -3.89f, -32.5f, -6.87f);
        pathBuilder.curveToRelative(10.37f, -4.82f, 31.45f, -16.34f, 43.83f, -34.91f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.56f, -3.12f);
        pathBuilder.arcTo(3.93f, 3.93f, 0.0f, false, false, 90.0f, 172.55f);
        pathBuilder.curveToRelative(-0.13f, -0.08f, -13.39f, -8.0f, -25.52f, -26.15f);
        pathBuilder.curveTo(54.0f, 130.71f, 42.39f, 104.11f, 44.19f, 64.65f);
        pathBuilder.curveToRelative(13.17f, 11.62f, 45.48f, 37.0f, 83.15f, 43.3f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.66f, -4.0f);
        pathBuilder.lineTo(132.0f, 88.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, 10.79f, -25.76f);
        pathBuilder.arcTo(35.0f, 35.0f, 0.0f, false, true, 168.0f, 52.0f);
        pathBuilder.curveToRelative(14.2f, 0.18f, 27.49f, 8.86f, 33.06f, 21.61f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 204.67f, 76.0f);
        pathBuilder.horizontalLineToRelative(25.67f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _twitterLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
