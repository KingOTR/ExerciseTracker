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

/* compiled from: Flower.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Flower", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getFlower", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_flower", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlowerKt {
    private static ImageVector _flower;

    public static final ImageVector getFlower(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _flower;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Flower", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(215.64f, 128.0f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, false, -43.82f, -75.9f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, false, -87.64f, 0.0f);
        pathBuilder.arcTo(44.0f, 44.0f, 0.0f, false, false, 40.36f, 128.0f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, false, 43.82f, 75.89f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, false, 87.64f, 0.0f);
        pathBuilder.arcTo(44.0f, 44.0f, 0.0f, false, false, 215.64f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(108.0f, 128.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, 20.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 108.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(180.35f, 74.68f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, 34.64f);
        pathBuilder.curveToRelative(-2.65f, 1.53f, -10.52f, 4.88f, -30.1f, 6.42f);
        pathBuilder.arcToRelative(44.08f, 44.08f, 0.0f, false, false, -10.52f, -18.18f);
        pathBuilder.curveTo(170.86f, 81.36f, 177.7f, 76.21f, 180.35f, 74.68f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 36.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, 20.0f);
        pathBuilder.curveToRelative(0.0f, 3.06f, -1.0f, 11.55f, -9.49f, 29.28f);
        pathBuilder.arcToRelative(43.79f, 43.79f, 0.0f, false, false, -21.0f, 0.0f);
        pathBuilder.curveTo(109.0f, 67.55f, 108.0f, 59.06f, 108.0f, 56.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 128.0f, 36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(48.33f, 82.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 27.32f, -7.32f);
        pathBuilder.curveToRelative(2.65f, 1.53f, 9.49f, 6.68f, 20.62f, 22.88f);
        pathBuilder.arcToRelative(44.08f, 44.08f, 0.0f, false, false, -10.52f, 18.18f);
        pathBuilder.curveToRelative(-19.58f, -1.54f, -27.45f, -4.89f, -30.1f, -6.42f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 48.33f, 82.0f);
        pathBuilder.close();
        pathBuilder.moveTo(75.65f, 181.32f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, -34.64f);
        pathBuilder.curveToRelative(2.65f, -1.53f, 10.52f, -4.88f, 30.1f, -6.42f);
        pathBuilder.arcToRelative(44.08f, 44.08f, 0.0f, false, false, 10.52f, 18.18f);
        pathBuilder.curveTo(85.14f, 174.64f, 78.3f, 179.79f, 75.65f, 181.32f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 220.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f);
        pathBuilder.curveToRelative(0.0f, -3.06f, 1.0f, -11.55f, 9.49f, -29.28f);
        pathBuilder.arcToRelative(43.79f, 43.79f, 0.0f, false, false, 21.0f, 0.0f);
        pathBuilder.curveTo(147.0f, 188.45f, 148.0f, 196.94f, 148.0f, 200.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 128.0f, 220.0f);
        pathBuilder.close();
        pathBuilder.moveTo(207.67f, 174.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -27.32f, 7.32f);
        pathBuilder.curveToRelative(-2.65f, -1.53f, -9.49f, -6.68f, -20.62f, -22.88f);
        pathBuilder.arcToRelative(44.08f, 44.08f, 0.0f, false, false, 10.52f, -18.18f);
        pathBuilder.curveToRelative(19.58f, 1.54f, 27.45f, 4.89f, 30.1f, 6.42f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 207.67f, 174.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _flower = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
