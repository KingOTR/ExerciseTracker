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

/* compiled from: Aperture.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Aperture", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getAperture", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_aperture", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ApertureKt {
    private static ImageVector _aperture;

    public static final ImageVector getAperture(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(204.41f, 51.63f);
        pathBuilder.arcToRelative(108.0f, 108.0f, 0.0f, true, false, 0.0f, 152.74f);
        pathBuilder.arcTo(107.38f, 107.38f, 0.0f, false, false, 204.41f, 51.63f);
        pathBuilder.close();
        pathBuilder.moveTo(187.41f, 68.63f);
        pathBuilder.arcTo(83.85f, 83.85f, 0.0f, false, true, 196.26f, 79.0f);
        pathBuilder.lineTo(169.0f, 111.09f);
        pathBuilder.lineToRelative(-23.3f, -65.21f);
        pathBuilder.arcTo(83.52f, 83.52f, 0.0f, false, true, 187.43f, 68.6f);
        pathBuilder.close();
        pathBuilder.moveTo(68.56f, 68.63f);
        pathBuilder.arcToRelative(83.44f, 83.44f, 0.0f, false, true, 51.11f, -24.2f);
        pathBuilder.lineToRelative(14.16f, 39.65f);
        pathBuilder.lineTo(65.71f, 71.61f);
        pathBuilder.curveTo(66.64f, 70.59f, 67.59f, 69.59f, 68.58f, 68.6f);
        pathBuilder.close();
        pathBuilder.moveTo(48.0f, 153.7f);
        pathBuilder.arcToRelative(84.48f, 84.48f, 0.0f, false, true, 3.4f, -60.3f);
        pathBuilder.lineTo(92.84f, 101.0f);
        pathBuilder.close();
        pathBuilder.moveTo(68.55f, 187.4f);
        pathBuilder.arcTo(83.94f, 83.94f, 0.0f, false, true, 59.74f, 177.0f);
        pathBuilder.lineTo(87.0f, 144.91f);
        pathBuilder.lineToRelative(23.3f, 65.21f);
        pathBuilder.arcTo(83.53f, 83.53f, 0.0f, false, true, 68.58f, 187.4f);
        pathBuilder.close();
        pathBuilder.moveTo(104.91f, 123.79f);
        pathBuilder.lineTo(120.09f, 105.94f);
        pathBuilder.lineTo(143.15f, 110.15f);
        pathBuilder.lineTo(151.03f, 132.21f);
        pathBuilder.lineTo(135.86f, 150.06f);
        pathBuilder.lineTo(112.8f, 145.85f);
        pathBuilder.close();
        pathBuilder.moveTo(187.4f, 187.4f);
        pathBuilder.arcToRelative(83.49f, 83.49f, 0.0f, false, true, -51.11f, 24.2f);
        pathBuilder.lineTo(122.15f, 172.0f);
        pathBuilder.lineToRelative(68.14f, 12.44f);
        pathBuilder.curveTo(189.36f, 185.41f, 188.41f, 186.41f, 187.43f, 187.4f);
        pathBuilder.close();
        pathBuilder.moveTo(163.16f, 155.0f);
        pathBuilder.lineTo(208.0f, 102.3f);
        pathBuilder.arcToRelative(84.43f, 84.43f, 0.0f, false, true, -3.41f, 60.3f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _aperture = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
