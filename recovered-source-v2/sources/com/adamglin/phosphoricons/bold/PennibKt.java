package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Pennib.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PenNib", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPenNib", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_penNib", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PennibKt {
    private static ImageVector _penNib;

    public static final ImageVector getPenNib(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(252.0f, 92.68f);
        pathBuilder.arcToRelative(19.86f, 19.86f, 0.0f, false, false, -5.86f, -14.14f);
        pathBuilder.lineTo(177.46f, 9.85f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.29f, 0.0f);
        pathBuilder.lineTo(121.35f, 37.67f);
        pathBuilder.lineTo(64.11f, 59.14f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 51.4f, 74.58f);
        pathBuilder.lineTo(28.16f, 214.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 40.0f, 228.0f);
        pathBuilder.arcToRelative(11.9f, 11.9f, 0.0f, false, false, 2.0f, -0.16f);
        pathBuilder.lineToRelative(139.45f, -23.25f);
        pathBuilder.arcToRelative(20.07f, 20.07f, 0.0f, false, false, 15.44f, -12.7f);
        pathBuilder.lineToRelative(21.46f, -57.25f);
        pathBuilder.lineToRelative(27.82f, -27.82f);
        pathBuilder.arcTo(19.85f, 19.85f, 0.0f, false, false, 252.0f, 92.68f);
        pathBuilder.close();
        pathBuilder.moveTo(175.2f, 181.3f);
        pathBuilder.lineTo(75.0f, 198.0f);
        pathBuilder.lineToRelative(33.0f, -33.0f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, true, false, -17.0f, -17.0f);
        pathBuilder.lineTo(58.0f, 181.0f);
        pathBuilder.lineTo(74.7f, 80.8f);
        pathBuilder.lineTo(125.0f, 61.94f);
        pathBuilder.lineTo(194.05f, 131.0f);
        pathBuilder.close();
        pathBuilder.moveTo(112.0f, 134.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, 10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 112.0f, 134.0f);
        pathBuilder.close();
        pathBuilder.moveTo(208.0f, 111.0f);
        pathBuilder.lineTo(145.0f, 48.0f);
        pathBuilder.lineToRelative(18.34f, -18.34f);
        pathBuilder.lineToRelative(63.0f, 63.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _penNib = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
