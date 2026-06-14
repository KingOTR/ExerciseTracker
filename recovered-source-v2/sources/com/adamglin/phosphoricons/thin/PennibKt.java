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

/* compiled from: Pennib.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PenNib", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getPenNib", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_penNib", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PennibKt {
    private static ImageVector _penNib;

    public static final ImageVector getPenNib(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(244.0f, 92.68f);
        pathBuilder.arcToRelative(11.93f, 11.93f, 0.0f, false, false, -3.51f, -8.48f);
        pathBuilder.lineTo(171.8f, 15.51f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f);
        pathBuilder.lineTo(125.78f, 44.56f);
        pathBuilder.lineTo(66.92f, 66.63f);
        pathBuilder.arcToRelative(12.06f, 12.06f, 0.0f, false, false, -7.63f, 9.26f);
        pathBuilder.lineTo(36.05f, 215.34f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 40.0f, 220.0f);
        pathBuilder.arcToRelative(4.89f, 4.89f, 0.0f, false, false, 0.66f, -0.05f);
        pathBuilder.lineTo(180.1f, 196.7f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.27f, -7.62f);
        pathBuilder.lineToRelative(22.07f, -58.86f);
        pathBuilder.lineToRelative(29.0f, -29.0f);
        pathBuilder.arcTo(11.92f, 11.92f, 0.0f, false, false, 244.0f, 92.68f);
        pathBuilder.close();
        pathBuilder.moveTo(181.88f, 186.27f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.09f, 2.54f);
        pathBuilder.lineTo(51.66f, 210.0f);
        pathBuilder.lineToRelative(58.45f, -58.45f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, false, -5.66f, -5.66f);
        pathBuilder.lineTo(46.0f, 204.35f);
        pathBuilder.lineTo(67.19f, 77.21f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.54f, -3.09f);
        pathBuilder.lineTo(127.0f, 52.64f);
        pathBuilder.lineTo(203.35f, 129.0f);
        pathBuilder.close();
        pathBuilder.moveTo(108.0f, 132.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 108.0f, 132.0f);
        pathBuilder.close();
        pathBuilder.moveTo(234.83f, 95.51f);
        pathBuilder.lineTo(208.0f, 122.34f);
        pathBuilder.lineTo(133.66f, 48.0f);
        pathBuilder.lineToRelative(26.82f, -26.82f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f);
        pathBuilder.lineToRelative(68.69f, 68.69f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.65f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _penNib = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
