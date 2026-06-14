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

/* compiled from: Dress.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Dress", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getDress", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_dress", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DressKt {
    private static ImageVector _dress;

    public static final ImageVector getDress(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _dress;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Dress", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(211.0f, 211.27f);
        pathBuilder.lineToRelative(-0.06f, -0.12f);
        pathBuilder.lineToRelative(-46.41f, -98.86f);
        pathBuilder.lineToRelative(21.68f, -34.0f);
        pathBuilder.lineToRelative(0.0f, -0.1f);
        pathBuilder.arcToRelative(11.94f, 11.94f, 0.0f, false, false, 0.0f, -12.34f);
        pathBuilder.lineToRelative(-0.15f, -0.24f);
        pathBuilder.lineTo(164.0f, 34.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f);
        pathBuilder.verticalLineTo(33.82f);
        pathBuilder.lineToRelative(-6.13f, 7.67f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, -43.74f, 0.0f);
        pathBuilder.lineTo(100.0f, 33.82f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f);
        pathBuilder.verticalLineTo(34.0f);
        pathBuilder.lineTo(69.86f, 65.59f);
        pathBuilder.lineToRelative(-0.15f, 0.24f);
        pathBuilder.arcToRelative(11.94f, 11.94f, 0.0f, false, false, 0.0f, 12.34f);
        pathBuilder.arcToRelative(0.93f, 0.93f, 0.0f, false, true, 0.05f, 0.1f);
        pathBuilder.lineToRelative(21.68f, 34.0f);
        pathBuilder.lineTo(45.0f, 211.15f);
        pathBuilder.lineToRelative(-0.06f, 0.12f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 56.0f, 228.0f);
        pathBuilder.horizontalLineTo(200.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.0f, -16.73f);
        pathBuilder.close();
        pathBuilder.moveTo(76.54f, 74.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -4.0f);
        pathBuilder.lineTo(96.21f, 41.9f);
        pathBuilder.lineToRelative(3.68f, 4.59f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, 56.22f, 0.0f);
        pathBuilder.lineToRelative(3.68f, -4.59f);
        pathBuilder.lineTo(179.49f, 70.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 4.0f);
        pathBuilder.lineToRelative(-21.65f, 34.0f);
        pathBuilder.horizontalLineTo(98.19f);
        pathBuilder.close();
        pathBuilder.moveTo(203.33f, 218.2f);
        pathBuilder.arcTo(3.94f, 3.94f, 0.0f, false, true, 200.0f, 220.0f);
        pathBuilder.horizontalLineTo(56.0f);
        pathBuilder.arcToRelative(3.94f, 3.94f, 0.0f, false, true, -3.33f, -1.8f);
        pathBuilder.arcToRelative(3.89f, 3.89f, 0.0f, false, true, -0.36f, -3.72f);
        pathBuilder.lineTo(98.54f, 116.0f);
        pathBuilder.horizontalLineToRelative(58.92f);
        pathBuilder.lineToRelative(46.23f, 98.48f);
        pathBuilder.arcTo(3.89f, 3.89f, 0.0f, false, true, 203.33f, 218.2f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _dress = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
