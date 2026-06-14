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

/* compiled from: Pinwheel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Pinwheel", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getPinwheel", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pinwheel", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PinwheelKt {
    private static ImageVector _pinwheel;

    public static final ImageVector getPinwheel(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(124.88f, 109.74f);
        pathBuilder.lineTo(27.15f, 145.33f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, true, true, 97.73f, -35.59f);
        pathBuilder.close();
        pathBuilder.moveTo(212.88f, 94.67f);
        pathBuilder.lineTo(115.15f, 130.26f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, true, false, 97.73f, -35.59f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(229.66f, 218.34f);
        pathBuilder2.lineToRelative(-48.42f, -48.41f);
        pathBuilder2.curveToRelative(1.1f, -0.33f, 2.19f, -0.68f, 3.27f, -1.07f);
        pathBuilder2.arcTo(60.0f, 60.0f, 0.0f, false, false, 220.37f, 92.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.25f, -4.78f);
        pathBuilder2.lineToRelative(-44.2f, 16.08f);
        pathBuilder2.curveToRelative(0.32f, -0.62f, 0.64f, -1.24f, 0.93f, -1.88f);
        pathBuilder2.arcTo(60.0f, 60.0f, 0.0f, false, false, 92.0f, 19.65f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 87.18f, 29.9f);
        pathBuilder2.lineToRelative(16.08f, 44.2f);
        pathBuilder2.curveToRelative(-0.62f, -0.32f, -1.24f, -0.64f, -1.88f, -0.93f);
        pathBuilder2.arcToRelative(60.0f, 60.0f, 0.0f, false, false, -81.73f, 74.89f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 10.25f, 4.78f);
        pathBuilder2.lineToRelative(44.2f, -16.09f);
        pathBuilder2.curveToRelative(-0.32f, 0.63f, -0.64f, 1.25f, -0.93f, 1.89f);
        pathBuilder2.arcToRelative(60.0f, 60.0f, 0.0f, false, false, 74.89f, 81.73f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.78f, -10.25f);
        pathBuilder2.lineToRelative(-16.09f, -44.2f);
        pathBuilder2.curveToRelative(0.63f, 0.32f, 1.25f, 0.64f, 1.89f, 0.93f);
        pathBuilder2.arcToRelative(59.87f, 59.87f, 0.0f, false, false, 22.48f, 5.58f);
        pathBuilder2.lineToRelative(57.22f, 57.23f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f);
        pathBuilder2.close();
        pathBuilder2.moveTo(131.07f, 36.15f);
        pathBuilder2.arcTo(44.0f, 44.0f, 0.0f, false, true, 134.8f, 114.0f);
        pathBuilder2.lineTo(105.19f, 32.63f);
        pathBuilder2.arcTo(43.63f, 43.63f, 0.0f, false, true, 131.07f, 36.15f);
        pathBuilder2.close();
        pathBuilder2.moveTo(32.63f, 134.82f);
        pathBuilder2.arcTo(44.0f, 44.0f, 0.0f, false, true, 114.0f, 105.22f);
        pathBuilder2.close();
        pathBuilder2.moveTo(109.0f, 203.87f);
        pathBuilder2.arcToRelative(44.0f, 44.0f, 0.0f, false, true, -3.73f, -77.81f);
        pathBuilder2.lineToRelative(29.6f, 81.33f);
        pathBuilder2.arcTo(43.6f, 43.6f, 0.0f, false, true, 109.0f, 203.87f);
        pathBuilder2.close();
        pathBuilder2.moveTo(164.56f, 156.49f);
        pathBuilder2.horizontalLineToRelative(-0.11f);
        pathBuilder2.arcToRelative(44.14f, 44.14f, 0.0f, false, true, -38.34f, -21.69f);
        pathBuilder2.lineToRelative(81.33f, -29.61f);
        pathBuilder2.arcToRelative(44.06f, 44.06f, 0.0f, false, true, -42.88f, 51.3f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pinwheel = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
