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

/* compiled from: Orangeslice.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"OrangeSlice", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getOrangeSlice", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_orangeSlice", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OrangesliceKt {
    private static ImageVector _orangeSlice;

    public static final ImageVector getOrangeSlice(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _orangeSlice;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("OrangeSlice", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(248.0f, 84.0f);
        pathBuilder.lineTo(8.0f, 84.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f);
        pathBuilder.arcToRelative(124.0f, 124.0f, 0.0f, false, false, 248.0f, 0.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 248.0f, 84.0f);
        pathBuilder.close();
        pathBuilder.moveTo(71.53f, 150.13f);
        pathBuilder.lineTo(124.0f, 97.66f);
        pathBuilder.lineTo(124.0f, 171.9f);
        pathBuilder.arcTo(83.67f, 83.67f, 0.0f, false, true, 71.53f, 150.13f);
        pathBuilder.close();
        pathBuilder.moveTo(65.87f, 144.47f);
        pathBuilder.arcTo(83.67f, 83.67f, 0.0f, false, true, 44.1f, 92.0f);
        pathBuilder.horizontalLineToRelative(74.24f);
        pathBuilder.close();
        pathBuilder.moveTo(132.0f, 97.66f);
        pathBuilder.lineToRelative(52.47f, 52.47f);
        pathBuilder.arcTo(83.67f, 83.67f, 0.0f, false, true, 132.0f, 171.9f);
        pathBuilder.close();
        pathBuilder.moveTo(190.13f, 144.47f);
        pathBuilder.lineTo(137.66f, 92.0f);
        pathBuilder.lineTo(211.9f, 92.0f);
        pathBuilder.arcTo(83.67f, 83.67f, 0.0f, false, true, 190.13f, 144.47f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 204.0f);
        pathBuilder.arcTo(116.14f, 116.14f, 0.0f, false, true, 12.07f, 92.0f);
        pathBuilder.horizontalLineToRelative(24.0f);
        pathBuilder.arcToRelative(92.0f, 92.0f, 0.0f, false, false, 183.82f, 0.0f);
        pathBuilder.horizontalLineToRelative(24.0f);
        pathBuilder.arcTo(116.14f, 116.14f, 0.0f, false, true, 128.0f, 204.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _orangeSlice = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
