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

/* compiled from: Bicycle.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Bicycle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getBicycle", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bicycle", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BicycleKt {
    private static ImageVector _bicycle;

    public static final ImageVector getBicycle(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _bicycle;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Bicycle", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(248.0f, 160.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, true, -40.0f, -40.0f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, true, 248.0f, 160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(48.0f, 120.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, false, 40.0f, 40.0f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, false, 48.0f, 120.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(208.0f, 112.0f);
        pathBuilder2.arcToRelative(47.81f, 47.81f, 0.0f, false, false, -16.93f, 3.09f);
        pathBuilder2.lineTo(165.93f, 72.0f);
        pathBuilder2.lineTo(192.0f, 72.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, -24.0f);
        pathBuilder2.lineTo(152.0f, 56.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.91f, 12.0f);
        pathBuilder2.lineToRelative(11.65f, 20.0f);
        pathBuilder2.lineTo(99.26f, 88.0f);
        pathBuilder2.lineTo(82.91f, 60.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 76.0f, 56.0f);
        pathBuilder2.lineTo(48.0f, 56.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder2.lineTo(71.41f, 72.0f);
        pathBuilder2.lineTo(85.12f, 95.51f);
        pathBuilder2.lineTo(69.41f, 117.06f);
        pathBuilder2.arcToRelative(48.13f, 48.13f, 0.0f, true, false, 12.92f, 9.44f);
        pathBuilder2.lineToRelative(11.59f, -15.9f);
        pathBuilder2.lineTo(125.09f, 164.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, true, false, 138.91f, 156.0f);
        pathBuilder2.lineToRelative(-30.32f, -52.0f);
        pathBuilder2.horizontalLineToRelative(57.48f);
        pathBuilder2.lineToRelative(11.19f, 19.17f);
        pathBuilder2.arcTo(48.0f, 48.0f, 0.0f, true, false, 208.0f, 112.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(80.0f, 160.0f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, true, true, -20.21f, -29.74f);
        pathBuilder2.lineToRelative(-18.25f, 25.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 12.92f, 9.42f);
        pathBuilder2.lineToRelative(18.25f, -25.0f);
        pathBuilder2.arcTo(31.88f, 31.88f, 0.0f, false, true, 80.0f, 160.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(208.0f, 192.0f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, false, true, -22.51f, -54.72f);
        pathBuilder2.lineTo(201.09f, 164.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, true, false, 214.91f, 156.0f);
        pathBuilder2.lineTo(199.3f, 129.21f);
        pathBuilder2.arcTo(32.0f, 32.0f, 0.0f, true, true, 208.0f, 192.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bicycle = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
