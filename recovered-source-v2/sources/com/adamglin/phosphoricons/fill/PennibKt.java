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

/* compiled from: Pennib.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PenNib", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getPenNib", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_penNib", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PennibKt {
    private static ImageVector _penNib;

    public static final ImageVector getPenNib(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _penNib;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PenNib", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(243.31f, 81.36f);
        pathBuilder.lineTo(174.63f, 12.68f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.63f, 0.0f);
        pathBuilder.lineTo(123.56f, 41.12f);
        pathBuilder.lineToRelative(-58.0f, 21.76f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 55.36f, 75.23f);
        pathBuilder.lineTo(34.59f, 199.83f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.77f, 3.49f);
        pathBuilder.lineToRelative(57.0f, -57.0f);
        pathBuilder.arcToRelative(23.85f, 23.85f, 0.0f, false, true, -2.29f, -12.08f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, true, 13.6f, 23.4f);
        pathBuilder.lineToRelative(-57.0f, 57.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.49f, 6.77f);
        pathBuilder.lineToRelative(124.61f, -20.77f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 12.35f, -10.16f);
        pathBuilder.lineToRelative(21.77f, -58.07f);
        pathBuilder.lineTo(243.31f, 104.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -22.63f);
        pathBuilder.close();
        pathBuilder.moveTo(208.0f, 116.68f);
        pathBuilder.lineTo(139.32f, 48.0f);
        pathBuilder.lineToRelative(24.0f, -24.0f);
        pathBuilder.lineTo(232.0f, 92.68f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _penNib = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
