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

/* compiled from: Pinwheel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Pinwheel", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPinwheel", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pinwheel", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PinwheelKt {
    private static ImageVector _pinwheel;

    public static final ImageVector getPinwheel(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(232.49f, 215.52f);
        pathBuilder.lineToRelative(-44.0f, -44.0f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, false, false, 35.59f, -81.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -15.38f, -7.17f);
        pathBuilder.lineToRelative(-35.61f, 13.0f);
        pathBuilder.arcTo(64.0f, 64.0f, 0.0f, false, false, 90.59f, 15.89f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.17f, 15.38f);
        pathBuilder.lineToRelative(13.0f, 35.61f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, false, false, -80.49f, 82.55f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 15.38f, 7.17f);
        pathBuilder.lineToRelative(35.61f, -13.0f);
        pathBuilder.arcToRelative(63.94f, 63.94f, 0.0f, false, false, 82.55f, 80.49f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 7.17f, -15.38f);
        pathBuilder.lineToRelative(-12.95f, -35.59f);
        pathBuilder.arcToRelative(63.53f, 63.53f, 0.0f, false, false, 15.7f, 3.16f);
        pathBuilder.lineToRelative(56.17f, 56.17f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, -17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(129.38f, 39.78f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, 7.43f, 68.0f);
        pathBuilder.lineTo(110.7f, 36.05f);
        pathBuilder.arcTo(39.81f, 39.81f, 0.0f, false, true, 129.38f, 39.78f);
        pathBuilder.close();
        pathBuilder.moveTo(36.05f, 129.32f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, 71.75f, -26.11f);
        pathBuilder.close();
        pathBuilder.moveTo(110.64f, 200.24f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, -7.43f, -68.0f);
        pathBuilder.lineTo(129.32f, 204.0f);
        pathBuilder.arcTo(39.83f, 39.83f, 0.0f, false, true, 110.64f, 200.24f);
        pathBuilder.close();
        pathBuilder.moveTo(147.09f, 148.73f);
        pathBuilder.arcToRelative(39.86f, 39.86f, 0.0f, false, true, -14.87f, -11.92f);
        pathBuilder.lineTo(204.0f, 110.7f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, -56.88f, 38.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pinwheel = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
