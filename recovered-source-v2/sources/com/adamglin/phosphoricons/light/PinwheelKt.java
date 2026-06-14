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

/* compiled from: Pinwheel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Pinwheel", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPinwheel", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pinwheel", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PinwheelKt {
    private static ImageVector _pinwheel;

    public static final ImageVector getPinwheel(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(228.24f, 219.76f);
        pathBuilder.lineTo(177.38f, 168.9f);
        pathBuilder.arcToRelative(60.19f, 60.19f, 0.0f, false, false, 6.45f, -1.92f);
        pathBuilder.arcToRelative(58.0f, 58.0f, 0.0f, false, false, 34.66f, -74.34f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.69f, -3.58f);
        pathBuilder.lineTo(161.5f, 107.0f);
        pathBuilder.arcToRelative(60.16f, 60.16f, 0.0f, false, false, 3.54f, -6.46f);
        pathBuilder.arcToRelative(58.0f, 58.0f, 0.0f, false, false, -72.4f, -79.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.58f, 7.69f);
        pathBuilder.lineTo(107.0f, 78.52f);
        pathBuilder.arcTo(60.16f, 60.16f, 0.0f, false, false, 100.54f, 75.0f);
        pathBuilder.arcToRelative(58.0f, 58.0f, 0.0f, false, false, -79.0f, 72.4f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.1f, 3.38f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.59f, 0.2f);
        pathBuilder.lineTo(78.52f, 133.0f);
        pathBuilder.arcTo(58.3f, 58.3f, 0.0f, false, false, 75.0f, 139.48f);
        pathBuilder.arcTo(58.06f, 58.06f, 0.0f, false, false, 127.5f, 222.0f);
        pathBuilder.arcToRelative(58.25f, 58.25f, 0.0f, false, false, 19.88f, -3.53f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 151.0f, 210.8f);
        pathBuilder.lineTo(133.0f, 161.5f);
        pathBuilder.arcTo(57.8f, 57.8f, 0.0f, false, false, 162.0f, 170.45f);
        pathBuilder.lineToRelative(57.79f, 57.79f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.48f);
        pathBuilder.close();
        pathBuilder.moveTo(102.52f, 31.11f);
        pathBuilder.arcToRelative(46.0f, 46.0f, 0.0f, false, true, 31.2f, 85.72f);
        pathBuilder.close();
        pathBuilder.moveTo(31.11f, 137.5f);
        pathBuilder.arcToRelative(46.0f, 46.0f, 0.0f, false, true, 85.72f, -31.2f);
        pathBuilder.close();
        pathBuilder.moveTo(137.5f, 208.9f);
        pathBuilder.arcToRelative(46.0f, 46.0f, 0.0f, false, true, -31.2f, -85.72f);
        pathBuilder.close();
        pathBuilder.moveTo(164.45f, 158.49f);
        pathBuilder.arcToRelative(46.07f, 46.07f, 0.0f, false, true, -41.27f, -24.77f);
        pathBuilder.lineToRelative(85.72f, -31.2f);
        pathBuilder.arcToRelative(46.06f, 46.06f, 0.0f, false, true, -44.39f, 56.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pinwheel = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
