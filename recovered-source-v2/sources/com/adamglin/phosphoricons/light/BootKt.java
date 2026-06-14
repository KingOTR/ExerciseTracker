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

/* compiled from: Boot.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Boot", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getBoot", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_boot", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BootKt {
    private static ImageVector _boot;

    public static final ImageVector getBoot(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _boot;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Boot", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(192.0f, 114.0f);
        pathBuilder.horizontalLineTo(158.0f);
        pathBuilder.verticalLineTo(56.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f);
        pathBuilder.horizontalLineTo(32.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.6f, 8.15f);
        pathBuilder.curveToRelative(9.0f, 23.44f, 11.13f, 76.92f, -0.17f, 116.19f);
        pathBuilder.arcTo(6.21f, 6.21f, 0.0f, false, false, 26.0f, 168.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.horizontalLineTo(66.11f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 6.26f, -1.48f);
        pathBuilder.lineTo(85.0f, 206.21f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.9f, -0.21f);
        pathBuilder.horizontalLineToRelative(16.22f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.9f, 0.21f);
        pathBuilder.lineToRelative(12.62f, 6.31f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 6.26f, 1.48f);
        pathBuilder.horizontalLineToRelative(28.22f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 6.26f, -1.48f);
        pathBuilder.lineTo(169.0f, 206.21f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.9f, -0.21f);
        pathBuilder.horizontalLineToRelative(16.22f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.9f, 0.21f);
        pathBuilder.lineToRelative(12.62f, 6.31f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 6.26f, 1.48f);
        pathBuilder.horizontalLineTo(232.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f);
        pathBuilder.verticalLineTo(168.0f);
        pathBuilder.arcTo(54.06f, 54.06f, 0.0f, false, false, 192.0f, 114.0f);
        pathBuilder.close();
        pathBuilder.moveTo(40.27f, 54.0f);
        pathBuilder.horizontalLineTo(144.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f);
        pathBuilder.verticalLineTo(82.0f);
        pathBuilder.horizontalLineTo(112.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(34.0f);
        pathBuilder.verticalLineToRelative(20.0f);
        pathBuilder.horizontalLineTo(112.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcToRelative(42.05f, 42.05f, 0.0f, false, true, 41.56f, 36.0f);
        pathBuilder.horizontalLineTo(39.75f);
        pathBuilder.curveTo(47.11f, 130.44f, 48.71f, 84.31f, 40.27f, 54.0f);
        pathBuilder.close();
        pathBuilder.moveTo(234.0f, 200.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f);
        pathBuilder.horizontalLineTo(205.89f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.9f, -0.21f);
        pathBuilder.lineToRelative(-12.62f, -6.31f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -6.26f, -1.48f);
        pathBuilder.horizontalLineTo(169.89f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -6.26f, 1.48f);
        pathBuilder.lineTo(151.0f, 201.79f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.9f, 0.21f);
        pathBuilder.horizontalLineTo(121.89f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.9f, -0.21f);
        pathBuilder.lineToRelative(-12.62f, -6.31f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -6.26f, -1.48f);
        pathBuilder.horizontalLineTo(85.89f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -6.26f, 1.48f);
        pathBuilder.lineTo(67.0f, 201.79f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.9f, 0.21f);
        pathBuilder.horizontalLineTo(40.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f);
        pathBuilder.verticalLineTo(174.0f);
        pathBuilder.horizontalLineTo(234.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _boot = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
