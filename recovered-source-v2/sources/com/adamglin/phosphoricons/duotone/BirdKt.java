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

/* compiled from: Bird.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Bird", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getBird", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bird", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BirdKt {
    private static ImageVector _bird;

    public static final ImageVector getBird(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _bird;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Bird", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(232.0f, 80.0f);
        pathBuilder.lineTo(208.0f, 96.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.arcToRelative(96.0f, 96.0f, 0.0f, false, true, -96.0f, 96.0f);
        pathBuilder.horizontalLineTo(24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.25f, -13.0f);
        pathBuilder.lineTo(104.0f, 99.52f);
        pathBuilder.verticalLineTo(76.89f);
        pathBuilder.curveToRelative(0.0f, -28.77f, 23.0f, -52.75f, 51.74f, -52.89f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, false, true, 50.59f, 38.89f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(176.0f, 68.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, false, true, 176.0f, 68.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(240.0f, 80.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -3.56f, 6.66f);
        pathBuilder2.lineTo(216.0f, 100.28f);
        pathBuilder2.lineTo(216.0f, 120.0f);
        pathBuilder2.arcTo(104.11f, 104.11f, 0.0f, false, true, 112.0f, 224.0f);
        pathBuilder2.lineTo(24.0f, 224.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -12.49f, -26.0f);
        pathBuilder2.lineToRelative(0.1f, -0.12f);
        pathBuilder2.lineTo(96.0f, 96.63f);
        pathBuilder2.lineTo(96.0f, 76.89f);
        pathBuilder2.curveTo(96.0f, 43.47f, 122.79f, 16.16f, 155.71f, 16.0f);
        pathBuilder2.lineTo(156.0f, 16.0f);
        pathBuilder2.arcToRelative(60.0f, 60.0f, 0.0f, false, true, 57.21f, 41.86f);
        pathBuilder2.lineToRelative(23.23f, 15.48f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 240.0f, 80.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(217.58f, 80.0f);
        pathBuilder2.lineTo(201.9f, 69.54f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -3.31f, -4.64f);
        pathBuilder2.arcTo(44.0f, 44.0f, 0.0f, false, false, 156.0f, 32.0f);
        pathBuilder2.horizontalLineToRelative(-0.22f);
        pathBuilder2.curveTo(131.64f, 32.12f, 112.0f, 52.25f, 112.0f, 76.89f);
        pathBuilder2.lineTo(112.0f, 99.52f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.85f, 5.13f);
        pathBuilder2.lineTo(24.0f, 208.0f);
        pathBuilder2.horizontalLineToRelative(26.9f);
        pathBuilder2.lineToRelative(70.94f, -85.12f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 12.29f, 10.24f);
        pathBuilder2.lineTo(71.75f, 208.0f);
        pathBuilder2.lineTo(112.0f, 208.0f);
        pathBuilder2.arcToRelative(88.1f, 88.1f, 0.0f, false, false, 88.0f, -88.0f);
        pathBuilder2.lineTo(200.0f, 96.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.56f, -6.66f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bird = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
