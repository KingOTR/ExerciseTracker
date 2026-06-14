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

/* compiled from: Paintbrushbroad.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PaintBrushBroad", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getPaintBrushBroad", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_paintBrushBroad", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaintbrushbroadKt {
    private static ImageVector _paintBrushBroad;

    public static final ImageVector getPaintBrushBroad(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(216.0f, 112.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f);
        pathBuilder.horizontalLineTo(152.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.92f, 9.13f);
        pathBuilder.lineTo(152.0f, 208.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -48.0f, 0.0f);
        pathBuilder.lineToRelative(7.92f, -46.87f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 152.0f);
        pathBuilder.horizontalLineTo(56.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f);
        pathBuilder.verticalLineTo(112.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(216.0f, 24.0f);
        pathBuilder2.horizontalLineTo(72.0f);
        pathBuilder2.arcTo(40.0f, 40.0f, 0.0f, false, false, 32.0f, 64.0f);
        pathBuilder2.verticalLineToRelative(72.0f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f);
        pathBuilder2.horizontalLineToRelative(48.0f);
        pathBuilder2.lineToRelative(-7.89f, 46.67f);
        pathBuilder2.arcTo(8.42f, 8.42f, 0.0f, false, false, 96.0f, 208.0f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 64.0f, 0.0f);
        pathBuilder2.arcToRelative(8.42f, 8.42f, 0.0f, false, false, -0.11f, -1.33f);
        pathBuilder2.lineTo(152.0f, 160.0f);
        pathBuilder2.horizontalLineToRelative(48.0f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, -24.0f);
        pathBuilder2.verticalLineTo(32.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 24.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(72.0f, 40.0f);
        pathBuilder2.horizontalLineTo(176.0f);
        pathBuilder2.verticalLineTo(80.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder2.verticalLineTo(40.0f);
        pathBuilder2.horizontalLineToRelative(16.0f);
        pathBuilder2.verticalLineToRelative(64.0f);
        pathBuilder2.horizontalLineTo(48.0f);
        pathBuilder2.verticalLineTo(64.0f);
        pathBuilder2.arcTo(24.0f, 24.0f, 0.0f, false, true, 72.0f, 40.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(200.0f, 144.0f);
        pathBuilder2.horizontalLineTo(152.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -15.84f, 18.26f);
        pathBuilder2.lineToRelative(0.0f, 0.2f);
        pathBuilder2.lineTo(144.0f, 208.6f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -32.0f, 0.0f);
        pathBuilder2.lineToRelative(7.8f, -46.14f);
        pathBuilder2.lineToRelative(0.0f, -0.2f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 104.0f, 144.0f);
        pathBuilder2.horizontalLineTo(56.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f);
        pathBuilder2.verticalLineTo(120.0f);
        pathBuilder2.horizontalLineTo(208.0f);
        pathBuilder2.verticalLineToRelative(16.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 144.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _paintBrushBroad = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
