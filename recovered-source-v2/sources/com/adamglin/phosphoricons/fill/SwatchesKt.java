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

/* compiled from: Swatches.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Swatches", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getSwatches", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_swatches", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SwatchesKt {
    private static ImageVector _swatches;

    public static final ImageVector getSwatches(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(240.0f, 155.91f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -1.0f, -5.22f);
        pathBuilder.lineTo(219.94f, 98.48f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 199.49f, 89.0f);
        pathBuilder.lineToRelative(-67.81f, 24.57f);
        pathBuilder.lineToRelative(12.08f, -69.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 130.84f, 26.0f);
        pathBuilder.lineTo(76.17f, 16.25f);
        pathBuilder.arcToRelative(15.94f, 15.94f, 0.0f, false, false, -18.47f, 13.0f);
        pathBuilder.lineToRelative(-25.0f, 143.12f);
        pathBuilder.arcTo(43.82f, 43.82f, 0.0f, false, false, 75.78f, 224.0f);
        pathBuilder.lineTo(224.0f, 224.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(76.0f, 196.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 76.0f, 196.0f);
        pathBuilder.close();
        pathBuilder.moveTo(118.72f, 187.62f);
        pathBuilder.lineTo(128.5f, 131.7f);
        pathBuilder.lineTo(204.92f, 104.0f);
        pathBuilder.lineTo(224.0f, 156.11f);
        pathBuilder.lineTo(116.78f, 195.0f);
        pathBuilder.arcTo(44.89f, 44.89f, 0.0f, false, false, 118.72f, 187.62f);
        pathBuilder.close();
        pathBuilder.moveTo(224.0f, 208.0f);
        pathBuilder.lineTo(127.74f, 208.0f);
        pathBuilder.lineTo(224.0f, 173.11f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _swatches = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
