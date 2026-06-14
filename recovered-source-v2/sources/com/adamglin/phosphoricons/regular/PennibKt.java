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

/* compiled from: Pennib.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PenNib", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getPenNib", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_penNib", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PennibKt {
    private static ImageVector _penNib;

    public static final ImageVector getPenNib(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(248.0f, 92.68f);
        pathBuilder.arcToRelative(15.86f, 15.86f, 0.0f, false, false, -4.69f, -11.31f);
        pathBuilder.lineTo(174.63f, 12.68f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.63f, 0.0f);
        pathBuilder.lineTo(123.57f, 41.11f);
        pathBuilder.lineToRelative(-58.0f, 21.77f);
        pathBuilder.arcTo(16.06f, 16.06f, 0.0f, false, false, 55.35f, 75.23f);
        pathBuilder.lineTo(32.11f, 214.68f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 40.0f, 224.0f);
        pathBuilder.arcToRelative(8.4f, 8.4f, 0.0f, false, false, 1.32f, -0.11f);
        pathBuilder.lineToRelative(139.44f, -23.24f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 12.35f, -10.17f);
        pathBuilder.lineToRelative(21.77f, -58.0f);
        pathBuilder.lineTo(243.31f, 104.0f);
        pathBuilder.arcTo(15.87f, 15.87f, 0.0f, false, false, 248.0f, 92.68f);
        pathBuilder.close();
        pathBuilder.moveTo(178.13f, 184.87f);
        pathBuilder.lineTo(63.32f, 204.0f);
        pathBuilder.lineToRelative(47.37f, -47.37f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, false, -11.32f, -11.32f);
        pathBuilder.lineTo(52.0f, 192.7f);
        pathBuilder.lineTo(71.13f, 77.86f);
        pathBuilder.lineTo(126.0f, 57.29f);
        pathBuilder.lineTo(198.7f, 130.0f);
        pathBuilder.close();
        pathBuilder.moveTo(112.0f, 132.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 112.0f, 132.0f);
        pathBuilder.close();
        pathBuilder.moveTo(208.0f, 116.68f);
        pathBuilder.lineTo(139.31f, 48.0f);
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
