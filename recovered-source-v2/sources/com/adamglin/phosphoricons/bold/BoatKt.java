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

/* compiled from: Boat.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Boat", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getBoat", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_boat", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BoatKt {
    private static ImageVector _boat;

    public static final ImageVector getBoat(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _boat;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Boat", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(222.33f, 106.79f);
        pathBuilder.lineTo(212.0f, 103.35f);
        pathBuilder.lineTo(212.0f, 56.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f);
        pathBuilder.lineTo(140.0f, 36.0f);
        pathBuilder.lineTo(140.0f, 24.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f);
        pathBuilder.lineTo(116.0f, 36.0f);
        pathBuilder.lineTo(64.0f, 36.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 44.0f, 56.0f);
        pathBuilder.verticalLineToRelative(47.35f);
        pathBuilder.lineToRelative(-10.33f, 3.44f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -13.67f, 19.0f);
        pathBuilder.lineTo(20.0f, 152.0f);
        pathBuilder.curveToRelative(0.0f, 64.63f, 100.8f, 90.57f, 105.09f, 91.64f);
        pathBuilder.arcToRelative(11.94f, 11.94f, 0.0f, false, false, 5.82f, 0.0f);
        pathBuilder.curveTo(135.2f, 242.57f, 236.0f, 216.63f, 236.0f, 152.0f);
        pathBuilder.lineTo(236.0f, 125.77f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 222.33f, 106.79f);
        pathBuilder.close();
        pathBuilder.moveTo(68.0f, 60.0f);
        pathBuilder.lineTo(188.0f, 60.0f);
        pathBuilder.lineTo(188.0f, 95.35f);
        pathBuilder.lineTo(131.79f, 76.62f);
        pathBuilder.arcToRelative(11.85f, 11.85f, 0.0f, false, false, -7.58f, 0.0f);
        pathBuilder.lineTo(68.0f, 95.35f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 152.0f);
        pathBuilder.curveToRelative(0.0f, 36.69f, -58.08f, 60.43f, -84.0f, 67.59f);
        pathBuilder.curveToRelative(-25.94f, -7.17f, -84.0f, -30.9f, -84.0f, -67.59f);
        pathBuilder.lineTo(44.0f, 128.65f);
        pathBuilder.lineToRelative(72.0f, -24.0f);
        pathBuilder.lineTo(116.0f, 168.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.lineTo(140.0f, 104.65f);
        pathBuilder.lineToRelative(72.0f, 24.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _boat = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
