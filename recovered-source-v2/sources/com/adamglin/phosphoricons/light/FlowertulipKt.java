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

/* compiled from: Flowertulip.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FlowerTulip", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getFlowerTulip", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_flowerTulip", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlowertulipKt {
    private static ImageVector _flowerTulip;

    public static final ImageVector getFlowerTulip(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _flowerTulip;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FlowerTulip", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 50.0f);
        pathBuilder.arcToRelative(85.52f, 85.52f, 0.0f, false, false, -36.17f, 8.0f);
        pathBuilder.curveToRelative(-14.67f, -25.9f, -40.0f, -38.79f, -41.15f, -39.37f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.36f, 0.0f);
        pathBuilder.curveTo(124.18f, 19.21f, 98.84f, 32.1f, 84.17f, 58.0f);
        pathBuilder.arcTo(85.52f, 85.52f, 0.0f, false, false, 48.0f, 50.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f);
        pathBuilder.lineTo(42.0f, 96.0f);
        pathBuilder.arcToRelative(86.1f, 86.1f, 0.0f, false, false, 80.0f, 85.77f);
        pathBuilder.verticalLineToRelative(40.52f);
        pathBuilder.lineTo(82.68f, 202.63f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.36f, 10.74f);
        pathBuilder.lineToRelative(48.0f, 24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.36f, 0.0f);
        pathBuilder.lineToRelative(48.0f, -24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -5.36f, -10.74f);
        pathBuilder.lineTo(134.0f, 222.29f);
        pathBuilder.lineTo(134.0f, 181.77f);
        pathBuilder.arcTo(86.1f, 86.1f, 0.0f, false, false, 214.0f, 96.0f);
        pathBuilder.lineTo(214.0f, 56.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 208.0f, 50.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 30.88f);
        pathBuilder.curveToRelative(6.46f, 3.84f, 23.07f, 15.0f, 33.33f, 32.94f);
        pathBuilder.arcTo(86.5f, 86.5f, 0.0f, false, false, 128.0f, 104.5f);
        pathBuilder.arcTo(86.5f, 86.5f, 0.0f, false, false, 94.67f, 63.82f);
        pathBuilder.curveTo(104.93f, 45.83f, 121.54f, 34.71f, 128.0f, 30.88f);
        pathBuilder.close();
        pathBuilder.moveTo(54.0f, 96.0f);
        pathBuilder.lineTo(54.0f, 62.24f);
        pathBuilder.arcTo(74.11f, 74.11f, 0.0f, false, true, 122.0f, 136.0f);
        pathBuilder.verticalLineToRelative(33.76f);
        pathBuilder.arcTo(74.1f, 74.1f, 0.0f, false, true, 54.0f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(202.0f, 96.0f);
        pathBuilder.arcToRelative(74.1f, 74.1f, 0.0f, false, true, -68.0f, 73.76f);
        pathBuilder.lineTo(134.0f, 136.0f);
        pathBuilder.arcToRelative(74.11f, 74.11f, 0.0f, false, true, 68.0f, -73.76f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _flowerTulip = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
