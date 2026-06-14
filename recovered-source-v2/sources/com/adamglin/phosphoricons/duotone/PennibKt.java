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

/* compiled from: Pennib.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PenNib", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getPenNib", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_penNib", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PennibKt {
    private static ImageVector _penNib;

    public static final ImageVector getPenNib(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 48.0f);
        pathBuilder.lineTo(68.32f, 70.38f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.08f, 6.17f);
        pathBuilder.lineTo(40.0f, 216.0f);
        pathBuilder.lineToRelative(139.45f, -23.24f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.17f, -5.08f);
        pathBuilder.lineTo(208.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(124.0f, 152.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 124.0f, 152.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(248.0f, 92.68f);
        pathBuilder2.arcToRelative(15.86f, 15.86f, 0.0f, false, false, -4.69f, -11.31f);
        pathBuilder2.lineTo(174.63f, 12.68f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.63f, 0.0f);
        pathBuilder2.lineTo(123.57f, 41.11f);
        pathBuilder2.lineToRelative(-58.0f, 21.77f);
        pathBuilder2.arcTo(16.06f, 16.06f, 0.0f, false, false, 55.35f, 75.23f);
        pathBuilder2.lineTo(32.11f, 214.68f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 40.0f, 224.0f);
        pathBuilder2.arcToRelative(8.4f, 8.4f, 0.0f, false, false, 1.32f, -0.11f);
        pathBuilder2.lineToRelative(139.44f, -23.24f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 12.35f, -10.17f);
        pathBuilder2.lineToRelative(21.77f, -58.0f);
        pathBuilder2.lineTo(243.31f, 104.0f);
        pathBuilder2.arcTo(15.87f, 15.87f, 0.0f, false, false, 248.0f, 92.68f);
        pathBuilder2.close();
        pathBuilder2.moveTo(178.13f, 184.87f);
        pathBuilder2.lineTo(63.32f, 204.0f);
        pathBuilder2.lineToRelative(47.37f, -47.37f);
        pathBuilder2.arcToRelative(28.0f, 28.0f, 0.0f, true, false, -11.32f, -11.32f);
        pathBuilder2.lineTo(52.0f, 192.7f);
        pathBuilder2.lineTo(71.13f, 77.86f);
        pathBuilder2.lineTo(126.0f, 57.29f);
        pathBuilder2.lineTo(198.7f, 130.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(112.0f, 132.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, false, true, 112.0f, 132.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(208.0f, 116.68f);
        pathBuilder2.lineTo(139.31f, 48.0f);
        pathBuilder2.lineToRelative(24.0f, -24.0f);
        pathBuilder2.lineTo(232.0f, 92.68f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _penNib = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
