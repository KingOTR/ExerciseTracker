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

/* compiled from: Twitterlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TwitterLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getTwitterLogo", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_twitterLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TwitterlogoKt {
    private static ImageVector _twitterLogo;

    public static final ImageVector getTwitterLogo(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(251.09f, 67.41f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 240.0f, 60.0f);
        pathBuilder.horizontalLineTo(211.82f);
        pathBuilder.arcToRelative(52.73f, 52.73f, 0.0f, false, false, -43.67f, -24.0f);
        pathBuilder.arcToRelative(50.85f, 50.85f, 0.0f, false, false, -36.6f, 14.85f);
        pathBuilder.arcTo(51.87f, 51.87f, 0.0f, false, false, 116.0f, 88.0f);
        pathBuilder.verticalLineToRelative(0.78f);
        pathBuilder.curveToRelative(-36.83f, -11.57f, -66.38f, -40.9f, -66.7f, -41.23f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.47f, 7.38f);
        pathBuilder.curveTo(22.52f, 125.1f, 53.48f, 162.72f, 70.89f, 178.05f);
        pathBuilder.curveTo(56.4f, 192.83f, 36.0f, 200.68f, 35.8f, 200.76f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 30.0f, 218.66f);
        pathBuilder.curveTo(32.0f, 221.55f, 43.44f, 236.0f, 80.0f, 236.0f);
        pathBuilder.curveToRelative(72.25f, 0.0f, 132.7f, -55.26f, 139.6f, -126.63f);
        pathBuilder.lineToRelative(28.88f, -28.88f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 251.09f, 67.41f);
        pathBuilder.close();
        pathBuilder.moveTo(199.52f, 95.52f);
        pathBuilder.arcToRelative(11.93f, 11.93f, 0.0f, false, false, -3.49f, 7.72f);
        pathBuilder.curveTo(192.14f, 164.23f, 141.18f, 212.0f, 80.0f, 212.0f);
        pathBuilder.arcToRelative(90.78f, 90.78f, 0.0f, false, true, -12.49f, -0.79f);
        pathBuilder.curveTo(78.0f, 204.55f, 89.72f, 195.07f, 98.0f, 182.66f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -3.9f, -17.0f);
        pathBuilder.curveToRelative(-0.12f, -0.07f, -12.33f, -7.49f, -23.43f, -24.42f);
        pathBuilder.reflectiveCurveToRelative(-17.26f, -37.0f, -18.46f, -59.78f);
        pathBuilder.curveTo(69.37f, 94.4f, 96.0f, 110.79f, 126.0f, 115.84f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 140.0f, 104.0f);
        pathBuilder.verticalLineTo(88.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 8.41f, -20.07f);
        pathBuilder.arcTo(27.07f, 27.07f, 0.0f, false, true, 167.86f, 60.0f);
        pathBuilder.arcToRelative(28.83f, 28.83f, 0.0f, false, true, 25.82f, 16.81f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.0f, 7.19f);
        pathBuilder.horizontalLineTo(211.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _twitterLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
