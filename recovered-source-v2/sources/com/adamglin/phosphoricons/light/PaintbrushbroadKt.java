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

/* compiled from: Paintbrushbroad.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PaintBrushBroad", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPaintBrushBroad", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_paintBrushBroad", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaintbrushbroadKt {
    private static ImageVector _paintBrushBroad;

    public static final ImageVector getPaintBrushBroad(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _paintBrushBroad;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PaintBrushBroad", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(216.0f, 26.0f);
        pathBuilder.horizontalLineTo(72.0f);
        pathBuilder.arcTo(38.0f, 38.0f, 0.0f, false, false, 34.0f, 64.0f);
        pathBuilder.verticalLineToRelative(72.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, 22.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.23f);
        pathBuilder.lineTo(98.08f, 207.0f);
        pathBuilder.arcToRelative(6.74f, 6.74f, 0.0f, false, false, -0.08f, 1.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, false, 60.0f, 0.0f);
        pathBuilder.arcToRelative(6.74f, 6.74f, 0.0f, false, false, -0.08f, -1.0f);
        pathBuilder.lineTo(150.0f, 160.23f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.23f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, -22.0f);
        pathBuilder.verticalLineTo(32.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 216.0f, 26.0f);
        pathBuilder.close();
        pathBuilder.moveTo(72.0f, 38.0f);
        pathBuilder.horizontalLineTo(178.0f);
        pathBuilder.verticalLineTo(80.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.verticalLineTo(38.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.verticalLineToRelative(68.0f);
        pathBuilder.horizontalLineTo(46.0f);
        pathBuilder.verticalLineTo(64.0f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, true, 72.0f, 38.0f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 146.0f);
        pathBuilder.horizontalLineTo(152.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -13.86f, 16.0f);
        pathBuilder.lineToRelative(0.0f, 0.15f);
        pathBuilder.lineTo(146.0f, 208.47f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, false, true, -36.0f, 0.0f);
        pathBuilder.lineToRelative(7.82f, -46.34f);
        pathBuilder.lineToRelative(0.0f, -0.15f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 104.0f, 146.0f);
        pathBuilder.horizontalLineTo(56.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, -10.0f);
        pathBuilder.verticalLineTo(118.0f);
        pathBuilder.horizontalLineTo(210.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 200.0f, 146.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _paintBrushBroad = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
