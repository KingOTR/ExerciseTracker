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

/* compiled from: Aperture.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Aperture", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getAperture", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_aperture", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ApertureKt {
    private static ImageVector _aperture;

    public static final ImageVector getAperture(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _aperture;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Aperture", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(232.0f, 128.0f);
        pathBuilder.arcTo(104.0f, 104.0f, 0.0f, false, false, 54.46f, 54.46f);
        pathBuilder.arcTo(104.0f, 104.0f, 0.0f, false, false, 128.0f, 232.0f);
        pathBuilder.horizontalLineToRelative(0.09f);
        pathBuilder.arcTo(104.0f, 104.0f, 0.0f, false, false, 232.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(49.18f, 88.92f);
        pathBuilder.lineToRelative(51.21f, 9.35f);
        pathBuilder.lineTo(46.65f, 161.53f);
        pathBuilder.arcTo(88.39f, 88.39f, 0.0f, false, true, 49.18f, 88.92f);
        pathBuilder.close();
        pathBuilder.moveTo(209.35f, 94.46f);
        pathBuilder.arcToRelative(88.41f, 88.41f, 0.0f, false, true, -2.53f, 72.62f);
        pathBuilder.lineToRelative(-51.21f, -9.35f);
        pathBuilder.close();
        pathBuilder.moveTo(201.27f, 79.26f);
        pathBuilder.lineTo(167.55f, 119.0f);
        pathBuilder.lineTo(139.63f, 40.78f);
        pathBuilder.arcToRelative(87.38f, 87.38f, 0.0f, false, true, 50.6f, 25.0f);
        pathBuilder.arcTo(88.74f, 88.74f, 0.0f, false, true, 201.27f, 79.26f);
        pathBuilder.close();
        pathBuilder.moveTo(122.43f, 40.19f);
        pathBuilder.lineToRelative(17.51f, 49.0f);
        pathBuilder.lineTo(58.3f, 74.32f);
        pathBuilder.arcToRelative(89.28f, 89.28f, 0.0f, false, true, 7.47f, -8.55f);
        pathBuilder.arcTo(87.37f, 87.37f, 0.0f, false, true, 122.43f, 40.19f);
        pathBuilder.close();
        pathBuilder.moveTo(54.73f, 176.74f);
        pathBuilder.lineTo(88.45f, 137.0f);
        pathBuilder.lineToRelative(27.92f, 78.18f);
        pathBuilder.arcToRelative(88.0f, 88.0f, 0.0f, false, true, -61.64f, -38.48f);
        pathBuilder.close();
        pathBuilder.moveTo(133.57f, 215.8f);
        pathBuilder.lineTo(116.06f, 166.8f);
        pathBuilder.lineTo(139.14f, 171.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(58.52f, 10.69f);
        pathBuilder.arcToRelative(87.5f, 87.5f, 0.0f, false, true, -64.13f, 34.12f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _aperture = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
