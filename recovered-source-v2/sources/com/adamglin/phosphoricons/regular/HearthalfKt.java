package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Hearthalf.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HeartHalf", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getHeartHalf", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_heartHalf", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HearthalfKt {
    private static ImageVector _heartHalf;

    public static final ImageVector getHeartHalf(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _heartHalf;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HeartHalf", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(169.47f, 56.79f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.94f, -15.73f);
        pathBuilder.curveTo(150.42f, 44.08f, 137.0f, 52.18f, 128.0f, 64.0f);
        pathBuilder.curveToRelative(-11.26f, -15.0f, -29.36f, -24.0f, -50.0f, -24.0f);
        pathBuilder.arcToRelative(62.07f, 62.07f, 0.0f, false, false, -62.0f, 62.0f);
        pathBuilder.curveToRelative(0.0f, 70.0f, 103.79f, 126.67f, 108.21f, 129.0f);
        pathBuilder.arcToRelative(7.93f, 7.93f, 0.0f, false, false, 7.58f, 0.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(332.57f, 332.57f, 0.0f, false, false, 41.09f, -27.22f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -9.76f, -12.67f);
        pathBuilder.curveToRelative(-10.31f, 7.94f, -20.0f, 14.37f, -27.12f, 18.82f);
        pathBuilder.lineTo(136.0f, 81.7f);
        pathBuilder.curveTo(141.84f, 68.75f, 153.94f, 59.7f, 169.47f, 56.79f);
        pathBuilder.close();
        pathBuilder.moveTo(120.0f, 210.0f);
        pathBuilder.curveTo(93.58f, 193.41f, 32.0f, 149.71f, 32.0f, 102.0f);
        pathBuilder.arcTo(46.06f, 46.06f, 0.0f, false, true, 78.0f, 56.0f);
        pathBuilder.curveToRelative(18.91f, 0.0f, 34.86f, 9.78f, 42.0f, 25.64f);
        pathBuilder.close();
        pathBuilder.moveTo(232.55f, 104.0f);
        pathBuilder.arcToRelative(8.85f, 8.85f, 0.0f, false, true, -0.89f, 0.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.94f, -7.12f);
        pathBuilder.arcToRelative(45.88f, 45.88f, 0.0f, false, false, -20.17f, -33.14f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.9f, -13.29f);
        pathBuilder.arcToRelative(61.83f, 61.83f, 0.0f, false, true, 27.17f, 44.67f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 232.55f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(230.46f, 139.62f);
        pathBuilder.curveToRelative(-5.67f, 11.37f, -13.94f, 23.0f, -24.59f, 34.49f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.74f, -10.86f);
        pathBuilder.curveToRelative(9.61f, -10.4f, 17.0f, -20.75f, 22.0f, -30.77f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 14.31f, 7.14f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _heartHalf = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
