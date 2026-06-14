package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Boot.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Boot", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getBoot", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_boot", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BootKt {
    private static ImageVector _boot;

    public static final ImageVector getBoot(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(192.0f, 112.0f);
        pathBuilder.lineTo(112.27f, 112.0f);
        pathBuilder.arcToRelative(8.17f, 8.17f, 0.0f, false, true, -8.25f, -7.47f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 112.0f, 96.0f);
        pathBuilder.horizontalLineToRelative(44.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f);
        pathBuilder.lineTo(160.0f, 84.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f);
        pathBuilder.lineTo(112.27f, 80.0f);
        pathBuilder.arcTo(8.17f, 8.17f, 0.0f, false, true, 104.0f, 72.53f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 112.0f, 64.0f);
        pathBuilder.horizontalLineToRelative(44.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f);
        pathBuilder.lineTo(160.0f, 56.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f);
        pathBuilder.lineTo(32.22f, 40.0f);
        pathBuilder.arcToRelative(8.23f, 8.23f, 0.0f, false, false, -5.08f, 1.64f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.61f, 9.22f);
        pathBuilder.curveToRelative(11.06f, 28.84f, 8.76f, 83.71f, -0.22f, 114.93f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 24.0f, 168.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.lineTo(66.11f, 216.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 7.16f, -1.69f);
        pathBuilder.lineTo(85.89f, 208.0f);
        pathBuilder.horizontalLineToRelative(16.22f);
        pathBuilder.lineToRelative(12.62f, 6.31f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 7.16f, 1.69f);
        pathBuilder.horizontalLineToRelative(28.22f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 7.16f, -1.69f);
        pathBuilder.lineTo(169.89f, 208.0f);
        pathBuilder.horizontalLineToRelative(16.22f);
        pathBuilder.lineToRelative(12.62f, 6.31f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 7.16f, 1.69f);
        pathBuilder.lineTo(232.0f, 216.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.lineTo(248.0f, 168.0f);
        pathBuilder.arcTo(56.0f, 56.0f, 0.0f, false, false, 192.0f, 112.0f);
        pathBuilder.close();
        pathBuilder.moveTo(232.0f, 200.0f);
        pathBuilder.lineTo(205.89f, 200.0f);
        pathBuilder.lineToRelative(-12.62f, -6.31f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -7.16f, -1.69f);
        pathBuilder.lineTo(169.89f, 192.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -7.16f, 1.69f);
        pathBuilder.lineTo(150.11f, 200.0f);
        pathBuilder.lineTo(121.89f, 200.0f);
        pathBuilder.lineToRelative(-12.62f, -6.31f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -7.16f, -1.69f);
        pathBuilder.lineTo(85.89f, 192.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -7.16f, 1.69f);
        pathBuilder.lineTo(66.11f, 200.0f);
        pathBuilder.lineTo(40.0f, 200.0f);
        pathBuilder.lineTo(40.0f, 176.0f);
        pathBuilder.lineTo(232.0f, 176.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _boot = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
