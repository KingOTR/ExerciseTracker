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

/* compiled from: Aperture.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Aperture", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getAperture", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_aperture", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ApertureKt {
    private static ImageVector _aperture;

    public static final ImageVector getAperture(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(201.54f, 54.46f);
        pathBuilder.arcTo(104.0f, 104.0f, 0.0f, false, false, 54.46f, 201.54f);
        pathBuilder.arcTo(104.0f, 104.0f, 0.0f, false, false, 201.54f, 54.46f);
        pathBuilder.close();
        pathBuilder.moveTo(190.23f, 65.78f);
        pathBuilder.arcToRelative(88.18f, 88.18f, 0.0f, false, true, 11.0f, 13.48f);
        pathBuilder.lineTo(167.55f, 119.0f);
        pathBuilder.lineTo(139.63f, 40.78f);
        pathBuilder.arcTo(87.34f, 87.34f, 0.0f, false, true, 190.23f, 65.78f);
        pathBuilder.close();
        pathBuilder.moveTo(155.59f, 133.0f);
        pathBuilder.lineToRelative(-18.16f, 21.37f);
        pathBuilder.lineToRelative(-27.59f, -5.0f);
        pathBuilder.lineTo(100.41f, 123.0f);
        pathBuilder.lineToRelative(18.16f, -21.37f);
        pathBuilder.lineToRelative(27.59f, 5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(65.77f, 65.78f);
        pathBuilder.arcToRelative(87.34f, 87.34f, 0.0f, false, true, 56.66f, -25.59f);
        pathBuilder.lineToRelative(17.51f, 49.0f);
        pathBuilder.lineTo(58.3f, 74.32f);
        pathBuilder.arcTo(88.0f, 88.0f, 0.0f, false, true, 65.77f, 65.78f);
        pathBuilder.close();
        pathBuilder.moveTo(46.65f, 161.54f);
        pathBuilder.arcToRelative(88.41f, 88.41f, 0.0f, false, true, 2.53f, -72.62f);
        pathBuilder.lineToRelative(51.21f, 9.35f);
        pathBuilder.close();
        pathBuilder.moveTo(65.77f, 190.22f);
        pathBuilder.arcToRelative(88.18f, 88.18f, 0.0f, false, true, -11.0f, -13.48f);
        pathBuilder.lineTo(88.45f, 137.0f);
        pathBuilder.lineToRelative(27.92f, 78.18f);
        pathBuilder.arcTo(87.34f, 87.34f, 0.0f, false, true, 65.77f, 190.22f);
        pathBuilder.close();
        pathBuilder.moveTo(190.23f, 190.22f);
        pathBuilder.arcToRelative(87.34f, 87.34f, 0.0f, false, true, -56.66f, 25.59f);
        pathBuilder.lineToRelative(-17.51f, -49.0f);
        pathBuilder.lineToRelative(81.64f, 14.91f);
        pathBuilder.arcTo(88.0f, 88.0f, 0.0f, false, true, 190.23f, 190.22f);
        pathBuilder.close();
        pathBuilder.moveTo(155.61f, 157.73f);
        pathBuilder.lineTo(209.35f, 94.46f);
        pathBuilder.arcToRelative(88.41f, 88.41f, 0.0f, false, true, -2.53f, 72.62f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _aperture = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
