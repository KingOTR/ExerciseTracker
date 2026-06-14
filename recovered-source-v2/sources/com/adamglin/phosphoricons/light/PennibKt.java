package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Pennib.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PenNib", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPenNib", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_penNib", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PennibKt {
    private static ImageVector _penNib;

    public static final ImageVector getPenNib(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(246.0f, 92.68f);
        pathBuilder.arcToRelative(13.94f, 13.94f, 0.0f, false, false, -4.1f, -9.9f);
        pathBuilder.lineTo(173.21f, 14.1f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.8f, 0.0f);
        pathBuilder.lineTo(124.68f, 42.83f);
        pathBuilder.lineTo(66.22f, 64.76f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -8.9f, 10.8f);
        pathBuilder.lineTo(34.08f, 215.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 40.0f, 222.0f);
        pathBuilder.arcToRelative(6.61f, 6.61f, 0.0f, false, false, 1.0f, -0.08f);
        pathBuilder.lineToRelative(139.44f, -23.24f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 10.81f, -8.9f);
        pathBuilder.lineToRelative(21.92f, -58.46f);
        pathBuilder.lineToRelative(28.74f, -28.74f);
        pathBuilder.arcTo(13.92f, 13.92f, 0.0f, false, false, 246.0f, 92.68f);
        pathBuilder.close();
        pathBuilder.moveTo(180.0f, 185.57f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.54f, 1.27f);
        pathBuilder.lineTo(57.49f, 207.0f);
        pathBuilder.lineToRelative(52.87f, -52.88f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, true, false, -8.48f, -8.48f);
        pathBuilder.lineTo(49.0f, 198.53f);
        pathBuilder.lineToRelative(20.17f, -121.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 70.43f, 76.0f);
        pathBuilder.lineToRelative(56.06f, -21.0f);
        pathBuilder.lineTo(201.0f, 129.51f);
        pathBuilder.close();
        pathBuilder.moveTo(110.0f, 132.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, 14.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 110.0f, 132.0f);
        pathBuilder.close();
        pathBuilder.moveTo(233.41f, 94.1f);
        pathBuilder.lineTo(208.0f, 119.51f);
        pathBuilder.lineTo(136.48f, 48.0f);
        pathBuilder.lineTo(161.9f, 22.58f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.83f, 0.0f);
        pathBuilder.lineToRelative(68.68f, 68.69f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 2.83f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _penNib = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
