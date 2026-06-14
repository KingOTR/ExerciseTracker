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

/* compiled from: Pinwheel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Pinwheel", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getPinwheel", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pinwheel", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PinwheelKt {
    private static ImageVector _pinwheel;

    public static final ImageVector getPinwheel(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _pinwheel;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Pinwheel", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(226.83f, 221.17f);
        pathBuilder.lineTo(173.35f, 167.7f);
        pathBuilder.arcToRelative(56.83f, 56.83f, 0.0f, false, false, 9.79f, -2.6f);
        pathBuilder.arcToRelative(56.0f, 56.0f, 0.0f, false, false, 33.47f, -71.77f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.13f, -2.39f);
        pathBuilder.lineToRelative(-55.31f, 20.13f);
        pathBuilder.arcToRelative(56.78f, 56.78f, 0.0f, false, false, 7.06f, -11.38f);
        pathBuilder.arcToRelative(56.0f, 56.0f, 0.0f, false, false, -69.9f, -76.28f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.39f, 5.12f);
        pathBuilder.lineToRelative(20.13f, 55.32f);
        pathBuilder.arcToRelative(56.33f, 56.33f, 0.0f, false, false, -11.38f, -7.06f);
        pathBuilder.arcToRelative(56.0f, 56.0f, 0.0f, false, false, -76.28f, 69.9f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 25.47f, 149.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.06f, 0.13f);
        pathBuilder.lineTo(83.85f, 129.0f);
        pathBuilder.arcToRelative(56.0f, 56.0f, 0.0f, false, false, 62.84f, 87.66f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.39f, -5.13f);
        pathBuilder.lineTo(129.0f, 156.17f);
        pathBuilder.arcToRelative(56.5f, 56.5f, 0.0f, false, false, 11.38f, 7.06f);
        pathBuilder.arcToRelative(55.88f, 55.88f, 0.0f, false, false, 22.48f, 5.24f);
        pathBuilder.lineToRelative(58.36f, 58.36f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, -5.66f);
        pathBuilder.close();
        pathBuilder.moveTo(99.88f, 29.71f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, false, true, 32.72f, 89.9f);
        pathBuilder.close();
        pathBuilder.moveTo(125.09f, 122.38f);
        pathBuilder.lineTo(117.64f, 125.09f);
        pathBuilder.lineTo(114.92f, 117.64f);
        pathBuilder.lineTo(122.38f, 114.92f);
        pathBuilder.close();
        pathBuilder.moveTo(29.71f, 140.14f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, false, true, 89.9f, -32.72f);
        pathBuilder.close();
        pathBuilder.moveTo(140.14f, 210.31f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, false, true, -32.72f, -89.9f);
        pathBuilder.close();
        pathBuilder.moveTo(164.43f, 160.49f);
        pathBuilder.arcToRelative(48.08f, 48.08f, 0.0f, false, true, -44.0f, -27.89f);
        pathBuilder.lineToRelative(89.9f, -32.72f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, false, true, -45.79f, 60.61f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pinwheel = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
