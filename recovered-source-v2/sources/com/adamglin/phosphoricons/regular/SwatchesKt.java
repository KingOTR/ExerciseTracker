package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Swatches.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Swatches", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getSwatches", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_swatches", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SwatchesKt {
    private static ImageVector _swatches;

    public static final ImageVector getSwatches(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(88.0f, 180.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 88.0f, 180.0f);
        pathBuilder.close();
        pathBuilder.moveTo(240.0f, 156.19f);
        pathBuilder.lineTo(240.0f, 208.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f);
        pathBuilder.lineTo(76.0f, 224.0f);
        pathBuilder.arcToRelative(46.36f, 46.36f, 0.0f, false, true, -7.94f, -0.68f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, true, -35.43f, -50.95f);
        pathBuilder.lineToRelative(25.0f, -143.13f);
        pathBuilder.arcToRelative(15.94f, 15.94f, 0.0f, false, true, 18.47f, -13.0f);
        pathBuilder.lineTo(130.84f, 26.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 12.92f, 18.52f);
        pathBuilder.lineToRelative(-12.08f, 69.0f);
        pathBuilder.lineTo(199.49f, 89.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 20.45f, 9.52f);
        pathBuilder.lineTo(239.0f, 150.69f);
        pathBuilder.arcTo(18.35f, 18.35f, 0.0f, false, true, 240.0f, 156.19f);
        pathBuilder.close();
        pathBuilder.moveTo(103.0f, 184.87f);
        pathBuilder.lineTo(128.0f, 41.74f);
        pathBuilder.lineTo(73.46f, 32.0f);
        pathBuilder.lineToRelative(-25.0f, 143.1f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 70.9f, 207.57f);
        pathBuilder.arcTo(27.29f, 27.29f, 0.0f, false, false, 91.46f, 203.0f);
        pathBuilder.arcTo(27.84f, 27.84f, 0.0f, false, false, 103.0f, 184.87f);
        pathBuilder.close();
        pathBuilder.moveTo(116.78f, 195.0f);
        pathBuilder.lineTo(224.0f, 156.11f);
        pathBuilder.lineTo(204.92f, 104.0f);
        pathBuilder.lineTo(128.5f, 131.7f);
        pathBuilder.lineToRelative(-9.78f, 55.92f);
        pathBuilder.arcTo(44.63f, 44.63f, 0.0f, false, true, 116.78f, 195.0f);
        pathBuilder.close();
        pathBuilder.moveTo(224.0f, 173.12f);
        pathBuilder.lineTo(127.74f, 208.0f);
        pathBuilder.lineTo(224.0f, 208.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _swatches = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
