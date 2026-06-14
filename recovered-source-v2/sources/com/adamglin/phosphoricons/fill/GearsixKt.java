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

/* compiled from: Gearsix.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GearSix", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getGearSix", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_gearSix", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GearsixKt {
    private static ImageVector _gearSix;

    public static final ImageVector getGearSix(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _gearSix;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("GearSix", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(237.94f, 107.21f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.89f, -5.4f);
        pathBuilder.lineToRelative(-29.83f, -17.0f);
        pathBuilder.lineToRelative(-0.12f, -33.62f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.83f, -6.08f);
        pathBuilder.arcToRelative(111.91f, 111.91f, 0.0f, false, false, -36.72f, -20.67f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.46f, 0.59f);
        pathBuilder.lineTo(128.0f, 41.85f);
        pathBuilder.lineTo(97.88f, 25.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.47f, -0.6f);
        pathBuilder.arcTo(111.92f, 111.92f, 0.0f, false, false, 54.73f, 45.15f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.83f, 6.07f);
        pathBuilder.lineToRelative(-0.15f, 33.65f);
        pathBuilder.lineToRelative(-29.83f, 17.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.89f, 5.4f);
        pathBuilder.arcToRelative(106.47f, 106.47f, 0.0f, false, false, 0.0f, 41.56f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.89f, 5.4f);
        pathBuilder.lineToRelative(29.83f, 17.0f);
        pathBuilder.lineToRelative(0.12f, 33.63f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.83f, 6.08f);
        pathBuilder.arcToRelative(111.91f, 111.91f, 0.0f, false, false, 36.72f, 20.67f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.46f, -0.59f);
        pathBuilder.lineTo(128.0f, 214.15f);
        pathBuilder.lineTo(158.12f, 231.0f);
        pathBuilder.arcToRelative(7.91f, 7.91f, 0.0f, false, false, 3.9f, 1.0f);
        pathBuilder.arcToRelative(8.09f, 8.09f, 0.0f, false, false, 2.57f, -0.42f);
        pathBuilder.arcToRelative(112.1f, 112.1f, 0.0f, false, false, 36.68f, -20.73f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.83f, -6.07f);
        pathBuilder.lineToRelative(0.15f, -33.65f);
        pathBuilder.lineToRelative(29.83f, -17.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.89f, -5.4f);
        pathBuilder.arcTo(106.47f, 106.47f, 0.0f, false, false, 237.94f, 107.21f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 168.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, true, 40.0f, -40.0f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, true, 128.0f, 168.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _gearSix = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
