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

/* compiled from: Sunglasses.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Sunglasses", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getSunglasses", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_sunglasses", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SunglassesKt {
    private static ImageVector _sunglasses;

    public static final ImageVector getSunglasses(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _sunglasses;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Sunglasses", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(32.0f, 136.0f);
        pathBuilder.horizontalLineToRelative(72.0f);
        pathBuilder.verticalLineToRelative(28.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, -72.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 136.0f);
        pathBuilder.verticalLineToRelative(28.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, 72.0f, 0.0f);
        pathBuilder.lineTo(224.0f, 136.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(200.0f, 40.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f);
        pathBuilder2.verticalLineToRelative(56.0f);
        pathBuilder2.lineTo(40.0f, 128.0f);
        pathBuilder2.lineTo(40.0f, 72.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 56.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder2.arcTo(32.0f, 32.0f, 0.0f, false, false, 24.0f, 72.0f);
        pathBuilder2.verticalLineToRelative(92.0f);
        pathBuilder2.arcToRelative(44.0f, 44.0f, 0.0f, false, false, 88.0f, 0.0f);
        pathBuilder2.lineTo(112.0f, 144.0f);
        pathBuilder2.horizontalLineToRelative(32.0f);
        pathBuilder2.verticalLineToRelative(20.0f);
        pathBuilder2.arcToRelative(44.0f, 44.0f, 0.0f, false, false, 88.0f, 0.0f);
        pathBuilder2.lineTo(232.0f, 72.0f);
        pathBuilder2.arcTo(32.0f, 32.0f, 0.0f, false, false, 200.0f, 40.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(212.63f, 177.31f);
        pathBuilder2.lineTo(179.31f, 144.0f);
        pathBuilder2.lineTo(216.0f, 144.0f);
        pathBuilder2.verticalLineToRelative(20.0f);
        pathBuilder2.arcTo(27.8f, 27.8f, 0.0f, false, true, 212.63f, 177.31f);
        pathBuilder2.close();
        pathBuilder2.moveTo(40.0f, 164.0f);
        pathBuilder2.lineTo(40.0f, 147.31f);
        pathBuilder2.lineToRelative(41.31f, 41.32f);
        pathBuilder2.arcTo(28.0f, 28.0f, 0.0f, false, true, 40.0f, 164.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(96.0f, 164.0f);
        pathBuilder2.arcToRelative(27.8f, 27.8f, 0.0f, false, true, -3.37f, 13.31f);
        pathBuilder2.lineTo(59.31f, 144.0f);
        pathBuilder2.lineTo(96.0f, 144.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(160.0f, 164.0f);
        pathBuilder2.lineTo(160.0f, 147.31f);
        pathBuilder2.lineToRelative(41.31f, 41.32f);
        pathBuilder2.arcTo(28.0f, 28.0f, 0.0f, false, true, 160.0f, 164.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _sunglasses = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
