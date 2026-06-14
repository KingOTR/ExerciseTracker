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

/* compiled from: Swatches.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Swatches", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getSwatches", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_swatches", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SwatchesKt {
    private static ImageVector _swatches;

    public static final ImageVector getSwatches(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _swatches;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Swatches", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(135.88f, 43.11f);
        pathBuilder.lineToRelative(-25.0f, 143.14f);
        pathBuilder.arcToRelative(35.71f, 35.71f, 0.0f, false, true, -41.34f, 29.2f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, -28.95f, -41.71f);
        pathBuilder.lineToRelative(25.0f, -143.13f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.19f, -6.49f);
        pathBuilder.lineToRelative(54.67f, 9.73f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 135.88f, 43.11f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(88.0f, 180.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, false, true, 88.0f, 180.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(240.0f, 156.19f);
        pathBuilder2.lineTo(240.0f, 208.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f);
        pathBuilder2.lineTo(76.0f, 224.0f);
        pathBuilder2.arcToRelative(46.36f, 46.36f, 0.0f, false, true, -7.94f, -0.68f);
        pathBuilder2.arcToRelative(44.0f, 44.0f, 0.0f, false, true, -35.43f, -50.95f);
        pathBuilder2.lineToRelative(25.0f, -143.13f);
        pathBuilder2.arcToRelative(15.94f, 15.94f, 0.0f, false, true, 18.47f, -13.0f);
        pathBuilder2.lineTo(130.84f, 26.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 12.92f, 18.52f);
        pathBuilder2.lineToRelative(-12.08f, 69.0f);
        pathBuilder2.lineTo(199.49f, 89.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 20.45f, 9.52f);
        pathBuilder2.lineTo(239.0f, 150.69f);
        pathBuilder2.arcTo(18.35f, 18.35f, 0.0f, false, true, 240.0f, 156.19f);
        pathBuilder2.close();
        pathBuilder2.moveTo(103.0f, 184.87f);
        pathBuilder2.lineTo(128.0f, 41.74f);
        pathBuilder2.lineTo(73.46f, 32.0f);
        pathBuilder2.lineToRelative(-25.0f, 143.1f);
        pathBuilder2.arcTo(28.0f, 28.0f, 0.0f, false, false, 70.9f, 207.57f);
        pathBuilder2.arcTo(27.29f, 27.29f, 0.0f, false, false, 91.46f, 203.0f);
        pathBuilder2.arcTo(27.84f, 27.84f, 0.0f, false, false, 103.0f, 184.87f);
        pathBuilder2.close();
        pathBuilder2.moveTo(116.78f, 195.0f);
        pathBuilder2.lineTo(224.0f, 156.11f);
        pathBuilder2.lineTo(204.92f, 104.0f);
        pathBuilder2.lineTo(128.5f, 131.7f);
        pathBuilder2.lineToRelative(-9.78f, 55.92f);
        pathBuilder2.arcTo(44.63f, 44.63f, 0.0f, false, true, 116.78f, 195.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(224.0f, 173.12f);
        pathBuilder2.lineTo(127.74f, 208.0f);
        pathBuilder2.lineTo(224.0f, 208.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _swatches = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
