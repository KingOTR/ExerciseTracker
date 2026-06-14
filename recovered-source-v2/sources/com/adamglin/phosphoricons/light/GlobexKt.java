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

/* compiled from: Globex.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GlobeX", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getGlobeX", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_globeX", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GlobexKt {
    private static ImageVector _globeX;

    public static final ImageVector getGlobeX(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _globeX;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("GlobeX", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 26.0f);
        pathBuilder.arcToRelative(102.0f, 102.0f, 0.0f, false, false, 0.0f, 204.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.76f, -10.67f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-0.1f, -0.07f, -9.6f, -7.84f, -18.95f, -22.95f);
        pathBuilder.arcTo(124.0f, 124.0f, 0.0f, false, true, 99.35f, 166.0f);
        pathBuilder.lineTo(128.0f, 166.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.lineTo(96.45f, 154.0f);
        pathBuilder.arcToRelative(139.18f, 139.18f, 0.0f, false, true, 0.0f, -52.0f);
        pathBuilder.horizontalLineToRelative(63.1f);
        pathBuilder.arcTo(137.47f, 137.47f, 0.0f, false, true, 162.0f, 128.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.arcToRelative(152.91f, 152.91f, 0.0f, false, false, -2.19f, -26.0f);
        pathBuilder.horizontalLineToRelative(42.36f);
        pathBuilder.arcTo(89.7f, 89.7f, 0.0f, false, true, 218.0f, 128.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f);
        pathBuilder.close();
        pathBuilder.moveTo(112.54f, 39.33f);
        pathBuilder.arcTo(132.58f, 132.58f, 0.0f, false, false, 86.81f, 90.0f);
        pathBuilder.lineTo(46.43f, 90.0f);
        pathBuilder.arcTo(90.29f, 90.29f, 0.0f, false, true, 112.54f, 39.33f);
        pathBuilder.close();
        pathBuilder.moveTo(112.54f, 216.67f);
        pathBuilder.arcTo(90.29f, 90.29f, 0.0f, false, true, 46.43f, 166.0f);
        pathBuilder.lineTo(86.81f, 166.0f);
        pathBuilder.arcTo(132.58f, 132.58f, 0.0f, false, false, 112.54f, 216.67f);
        pathBuilder.close();
        pathBuilder.moveTo(84.19f, 154.0f);
        pathBuilder.lineTo(41.83f, 154.0f);
        pathBuilder.arcToRelative(90.17f, 90.17f, 0.0f, false, true, 0.0f, -52.0f);
        pathBuilder.lineTo(84.19f, 102.0f);
        pathBuilder.arcToRelative(155.43f, 155.43f, 0.0f, false, false, 0.0f, 52.0f);
        pathBuilder.close();
        pathBuilder.moveTo(99.35f, 90.0f);
        pathBuilder.arcToRelative(124.0f, 124.0f, 0.0f, false, true, 13.46f, -30.37f);
        pathBuilder.arcTo(109.19f, 109.19f, 0.0f, false, true, 128.0f, 40.18f);
        pathBuilder.arcToRelative(109.19f, 109.19f, 0.0f, false, true, 15.19f, 19.45f);
        pathBuilder.arcTo(124.0f, 124.0f, 0.0f, false, true, 156.65f, 90.0f);
        pathBuilder.close();
        pathBuilder.moveTo(169.19f, 90.0f);
        pathBuilder.arcToRelative(132.58f, 132.58f, 0.0f, false, false, -25.73f, -50.67f);
        pathBuilder.arcTo(90.29f, 90.29f, 0.0f, false, true, 209.57f, 90.0f);
        pathBuilder.close();
        pathBuilder.moveTo(220.24f, 172.24f);
        pathBuilder.lineTo(200.49f, 192.0f);
        pathBuilder.lineToRelative(19.75f, 19.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.48f, 8.48f);
        pathBuilder.lineTo(192.0f, 200.49f);
        pathBuilder.lineToRelative(-19.76f, 19.75f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f);
        pathBuilder.lineTo(183.51f, 192.0f);
        pathBuilder.lineToRelative(-19.75f, -19.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f);
        pathBuilder.lineTo(192.0f, 183.51f);
        pathBuilder.lineToRelative(19.76f, -19.75f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 8.48f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _globeX = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
