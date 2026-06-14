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

/* compiled from: Scroll.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Scroll", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getScroll", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_scroll", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScrollKt {
    private static ImageVector _scroll;

    public static final ImageVector getScroll(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _scroll;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Scroll", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(200.0f, 176.0f);
        pathBuilder.horizontalLineTo(104.0f);
        pathBuilder.reflectiveCurveToRelative(8.0f, 6.0f, 8.0f, 16.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -48.0f, 0.0f);
        pathBuilder.verticalLineTo(64.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, false, 40.0f, 40.0f);
        pathBuilder.horizontalLineTo(176.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, 24.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(96.0f, 104.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f);
        pathBuilder2.horizontalLineToRelative(64.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder2.lineTo(104.0f, 112.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 96.0f, 104.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(104.0f, 144.0f);
        pathBuilder2.horizontalLineToRelative(64.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder2.lineTo(104.0f, 128.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(232.0f, 192.0f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, 32.0f);
        pathBuilder2.lineTo(88.0f, 224.0f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, -32.0f);
        pathBuilder2.lineTo(56.0f, 64.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -32.0f, 0.0f);
        pathBuilder2.curveToRelative(0.0f, 5.74f, 4.83f, 9.62f, 4.88f, 9.66f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 24.0f, 88.0f);
        pathBuilder2.arcToRelative(7.89f, 7.89f, 0.0f, false, true, -4.79f, -1.61f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.curveTo(18.05f, 85.54f, 8.0f, 77.61f, 8.0f, 64.0f);
        pathBuilder2.arcTo(32.0f, 32.0f, 0.0f, false, true, 40.0f, 32.0f);
        pathBuilder2.lineTo(176.0f, 32.0f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, 32.0f);
        pathBuilder2.lineTo(208.0f, 168.0f);
        pathBuilder2.horizontalLineToRelative(8.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.8f, 1.6f);
        pathBuilder2.curveTo(222.0f, 170.46f, 232.0f, 178.39f, 232.0f, 192.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(96.26f, 173.48f);
        pathBuilder2.arcTo(8.07f, 8.07f, 0.0f, false, true, 104.0f, 168.0f);
        pathBuilder2.horizontalLineToRelative(88.0f);
        pathBuilder2.lineTo(192.0f, 64.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f);
        pathBuilder2.lineTo(67.69f, 48.0f);
        pathBuilder2.arcTo(31.71f, 31.71f, 0.0f, false, true, 72.0f, 64.0f);
        pathBuilder2.lineTo(72.0f, 192.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 32.0f, 0.0f);
        pathBuilder2.curveToRelative(0.0f, -5.74f, -4.83f, -9.62f, -4.88f, -9.66f);
        pathBuilder2.arcTo(7.82f, 7.82f, 0.0f, false, true, 96.26f, 173.48f);
        pathBuilder2.close();
        pathBuilder2.moveTo(216.0f, 192.0f);
        pathBuilder2.arcToRelative(12.58f, 12.58f, 0.0f, false, false, -3.23f, -8.0f);
        pathBuilder2.horizontalLineToRelative(-94.0f);
        pathBuilder2.arcToRelative(26.92f, 26.92f, 0.0f, false, true, 1.21f, 8.0f);
        pathBuilder2.arcToRelative(31.82f, 31.82f, 0.0f, false, true, -4.29f, 16.0f);
        pathBuilder2.lineTo(200.0f, 208.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 192.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _scroll = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
