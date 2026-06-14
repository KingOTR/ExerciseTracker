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

/* compiled from: Boot.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Boot", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getBoot", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_boot", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BootKt {
    private static ImageVector _boot;

    public static final ImageVector getBoot(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(192.0f, 116.0f);
        pathBuilder.horizontalLineTo(156.0f);
        pathBuilder.verticalLineTo(56.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f);
        pathBuilder.horizontalLineTo(32.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.73f, 5.43f);
        pathBuilder.curveToRelative(9.29f, 24.23f, 11.46f, 77.22f, -0.11f, 117.46f);
        pathBuilder.arcTo(3.82f, 3.82f, 0.0f, false, false, 28.0f, 168.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f);
        pathBuilder.horizontalLineTo(66.11f);
        pathBuilder.arcToRelative(12.08f, 12.08f, 0.0f, false, false, 5.37f, -1.27f);
        pathBuilder.lineToRelative(12.62f, -6.31f);
        pathBuilder.arcToRelative(4.09f, 4.09f, 0.0f, false, true, 1.79f, -0.42f);
        pathBuilder.horizontalLineToRelative(16.22f);
        pathBuilder.arcToRelative(4.09f, 4.09f, 0.0f, false, true, 1.79f, 0.42f);
        pathBuilder.lineToRelative(12.62f, 6.31f);
        pathBuilder.arcToRelative(12.08f, 12.08f, 0.0f, false, false, 5.37f, 1.27f);
        pathBuilder.horizontalLineToRelative(28.22f);
        pathBuilder.arcToRelative(12.08f, 12.08f, 0.0f, false, false, 5.37f, -1.27f);
        pathBuilder.lineToRelative(12.62f, -6.31f);
        pathBuilder.arcToRelative(4.09f, 4.09f, 0.0f, false, true, 1.79f, -0.42f);
        pathBuilder.horizontalLineToRelative(16.22f);
        pathBuilder.arcToRelative(4.09f, 4.09f, 0.0f, false, true, 1.79f, 0.42f);
        pathBuilder.lineToRelative(12.62f, 6.31f);
        pathBuilder.arcToRelative(12.08f, 12.08f, 0.0f, false, false, 5.37f, 1.27f);
        pathBuilder.horizontalLineTo(232.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f);
        pathBuilder.verticalLineTo(168.0f);
        pathBuilder.arcTo(52.06f, 52.06f, 0.0f, false, false, 192.0f, 116.0f);
        pathBuilder.close();
        pathBuilder.moveTo(37.6f, 52.0f);
        pathBuilder.horizontalLineTo(144.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f);
        pathBuilder.verticalLineTo(84.0f);
        pathBuilder.horizontalLineTo(112.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(36.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.horizontalLineTo(112.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcToRelative(44.06f, 44.06f, 0.0f, false, true, 43.81f, 40.0f);
        pathBuilder.horizontalLineTo(37.2f);
        pathBuilder.curveTo(45.24f, 131.81f, 47.0f, 82.65f, 37.6f, 52.0f);
        pathBuilder.close();
        pathBuilder.moveTo(236.0f, 200.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.horizontalLineTo(205.89f);
        pathBuilder.arcToRelative(4.09f, 4.09f, 0.0f, false, true, -1.79f, -0.42f);
        pathBuilder.lineToRelative(-12.62f, -6.31f);
        pathBuilder.arcToRelative(12.08f, 12.08f, 0.0f, false, false, -5.37f, -1.27f);
        pathBuilder.horizontalLineTo(169.89f);
        pathBuilder.arcToRelative(12.08f, 12.08f, 0.0f, false, false, -5.37f, 1.27f);
        pathBuilder.lineToRelative(-12.62f, 6.31f);
        pathBuilder.arcToRelative(4.09f, 4.09f, 0.0f, false, true, -1.79f, 0.42f);
        pathBuilder.horizontalLineTo(121.89f);
        pathBuilder.arcToRelative(4.09f, 4.09f, 0.0f, false, true, -1.79f, -0.42f);
        pathBuilder.lineToRelative(-12.62f, -6.31f);
        pathBuilder.arcToRelative(12.08f, 12.08f, 0.0f, false, false, -5.37f, -1.27f);
        pathBuilder.horizontalLineTo(85.89f);
        pathBuilder.arcToRelative(12.08f, 12.08f, 0.0f, false, false, -5.37f, 1.27f);
        pathBuilder.lineTo(67.9f, 203.58f);
        pathBuilder.arcToRelative(4.09f, 4.09f, 0.0f, false, true, -1.79f, 0.42f);
        pathBuilder.horizontalLineTo(40.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f);
        pathBuilder.verticalLineTo(172.0f);
        pathBuilder.horizontalLineTo(236.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _boot = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
