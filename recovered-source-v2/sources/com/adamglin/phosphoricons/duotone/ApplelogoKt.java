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

/* compiled from: Applelogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"AppleLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getAppleLogo", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_appleLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ApplelogoKt {
    private static ImageVector _appleLogo;

    public static final ImageVector getAppleLogo(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _appleLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("AppleLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(216.0f, 73.52f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 172.78f);
        pathBuilder.curveToRelative(-16.79f, -11.53f, -24.0f, -30.87f, -24.0f, -52.78f);
        pathBuilder.curveToRelative(0.0f, -18.3f, 11.68f, -34.81f, 24.0f, -46.48f);
        pathBuilder.curveTo(204.53f, 62.66f, 185.0f, 56.0f, 168.0f, 56.0f);
        pathBuilder.arcToRelative(63.72f, 63.72f, 0.0f, false, false, -40.0f, 14.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(63.71f, 63.71f, 0.0f, false, false, 88.88f, 56.0f);
        pathBuilder.curveTo(52.0f, 55.5f, 23.06f, 86.3f, 24.0f, 123.19f);
        pathBuilder.arcToRelative(119.62f, 119.62f, 0.0f, false, false, 37.65f, 84.12f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, false, 83.6f, 216.0f);
        pathBuilder.horizontalLineToRelative(87.7f);
        pathBuilder.arcToRelative(31.75f, 31.75f, 0.0f, false, false, 23.26f, -10.0f);
        pathBuilder.curveToRelative(15.85f, -17.0f, 21.44f, -33.2f, 21.44f, -33.2f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(223.3f, 169.59f);
        pathBuilder2.arcToRelative(8.07f, 8.07f, 0.0f, false, false, -2.8f, -3.4f);
        pathBuilder2.curveTo(203.53f, 154.53f, 200.0f, 134.64f, 200.0f, 120.0f);
        pathBuilder2.curveToRelative(0.0f, -17.67f, 13.47f, -33.06f, 21.5f, -40.67f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -11.62f);
        pathBuilder2.curveTo(208.82f, 55.74f, 187.82f, 48.0f, 168.0f, 48.0f);
        pathBuilder2.arcToRelative(72.23f, 72.23f, 0.0f, false, false, -40.0f, 12.13f);
        pathBuilder2.arcToRelative(71.56f, 71.56f, 0.0f, false, false, -90.71f, 9.09f);
        pathBuilder2.arcTo(74.63f, 74.63f, 0.0f, false, false, 16.0f, 123.4f);
        pathBuilder2.arcToRelative(127.0f, 127.0f, 0.0f, false, false, 40.14f, 89.73f);
        pathBuilder2.arcTo(39.8f, 39.8f, 0.0f, false, false, 83.59f, 224.0f);
        pathBuilder2.horizontalLineToRelative(87.68f);
        pathBuilder2.arcToRelative(39.84f, 39.84f, 0.0f, false, false, 29.12f, -12.57f);
        pathBuilder2.arcToRelative(125.0f, 125.0f, 0.0f, false, false, 17.82f, -24.6f);
        pathBuilder2.curveTo(225.23f, 174.0f, 224.33f, 172.0f, 223.3f, 169.59f);
        pathBuilder2.close();
        pathBuilder2.moveTo(188.67f, 200.53f);
        pathBuilder2.arcToRelative(23.76f, 23.76f, 0.0f, false, true, -17.4f, 7.47f);
        pathBuilder2.lineTo(83.59f, 208.0f);
        pathBuilder2.arcToRelative(23.82f, 23.82f, 0.0f, false, true, -16.44f, -6.51f);
        pathBuilder2.arcTo(111.14f, 111.14f, 0.0f, false, true, 32.0f, 123.0f);
        pathBuilder2.arcTo(58.5f, 58.5f, 0.0f, false, true, 48.65f, 80.47f);
        pathBuilder2.arcTo(54.81f, 54.81f, 0.0f, false, true, 88.0f, 64.0f);
        pathBuilder2.horizontalLineToRelative(0.78f);
        pathBuilder2.arcTo(55.45f, 55.45f, 0.0f, false, true, 123.0f, 76.28f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 10.0f, 0.0f);
        pathBuilder2.arcTo(55.39f, 55.39f, 0.0f, false, true, 168.0f, 64.0f);
        pathBuilder2.arcToRelative(70.64f, 70.64f, 0.0f, false, true, 36.0f, 10.35f);
        pathBuilder2.curveToRelative(-13.0f, 14.52f, -20.0f, 30.47f, -20.0f, 45.65f);
        pathBuilder2.curveToRelative(0.0f, 23.77f, 7.64f, 42.73f, 22.18f, 55.3f);
        pathBuilder2.arcTo(105.52f, 105.52f, 0.0f, false, true, 188.67f, 200.53f);
        pathBuilder2.close();
        pathBuilder2.moveTo(128.23f, 30.0f);
        pathBuilder2.arcTo(40.0f, 40.0f, 0.0f, false, true, 167.0f, 0.0f);
        pathBuilder2.horizontalLineToRelative(1.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder2.horizontalLineToRelative(-1.0f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, false, -23.24f, 18.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -15.5f, -4.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _appleLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
