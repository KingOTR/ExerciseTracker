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

/* compiled from: Gif.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Gif", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getGif", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_gif", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GifKt {
    private static ImageVector _gif;

    public static final ImageVector getGif(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _gif;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Gif", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.0f, 56.0f);
        pathBuilder.verticalLineTo(200.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f);
        pathBuilder.horizontalLineTo(48.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f);
        pathBuilder.verticalLineTo(56.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 40.0f);
        pathBuilder.horizontalLineTo(208.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 56.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(144.0f, 72.0f);
        pathBuilder2.lineTo(144.0f, 184.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder2.lineTo(128.0f, 72.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(232.0f, 64.0f);
        pathBuilder2.lineTo(176.0f, 64.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder2.lineTo(168.0f, 184.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder2.lineTo(184.0f, 136.0f);
        pathBuilder2.horizontalLineToRelative(40.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder2.lineTo(184.0f, 120.0f);
        pathBuilder2.lineTo(184.0f, 80.0f);
        pathBuilder2.horizontalLineToRelative(48.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(96.0f, 120.0f);
        pathBuilder2.lineTo(72.0f, 120.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder2.lineTo(88.0f, 136.0f);
        pathBuilder2.verticalLineToRelative(16.0f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -48.0f, 0.0f);
        pathBuilder2.lineTo(40.0f, 104.0f);
        pathBuilder2.arcTo(24.0f, 24.0f, 0.0f, false, true, 64.0f, 80.0f);
        pathBuilder2.curveToRelative(11.19f, 0.0f, 21.61f, 7.74f, 24.25f, 18.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 15.5f, -4.0f);
        pathBuilder2.curveTo(99.27f, 76.62f, 82.56f, 64.0f, 64.0f, 64.0f);
        pathBuilder2.arcToRelative(40.0f, 40.0f, 0.0f, false, false, -40.0f, 40.0f);
        pathBuilder2.verticalLineToRelative(48.0f);
        pathBuilder2.arcToRelative(40.0f, 40.0f, 0.0f, false, false, 80.0f, 0.0f);
        pathBuilder2.lineTo(104.0f, 128.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 96.0f, 120.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _gif = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
