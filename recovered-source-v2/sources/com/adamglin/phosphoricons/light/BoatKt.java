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

/* compiled from: Boat.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Boat", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getBoat", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_boat", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BoatKt {
    private static ImageVector _boat;

    public static final ImageVector getBoat(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(220.43f, 112.48f);
        pathBuilder.lineTo(206.0f, 107.68f);
        pathBuilder.lineTo(206.0f, 56.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f);
        pathBuilder.lineTo(134.0f, 42.0f);
        pathBuilder.lineTo(134.0f, 24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.lineTo(122.0f, 42.0f);
        pathBuilder.lineTo(64.0f, 42.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 50.0f, 56.0f);
        pathBuilder.verticalLineToRelative(51.68f);
        pathBuilder.lineToRelative(-14.43f, 4.8f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 125.77f);
        pathBuilder.lineTo(26.0f, 152.0f);
        pathBuilder.curveToRelative(0.0f, 60.0f, 96.44f, 84.79f, 100.54f, 85.82f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.92f, 0.0f);
        pathBuilder.arcToRelative(235.44f, 235.44f, 0.0f, false, false, 49.4f, -19.54f);
        pathBuilder.curveTo(212.32f, 200.15f, 230.0f, 177.24f, 230.0f, 152.0f);
        pathBuilder.lineTo(230.0f, 125.77f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 220.43f, 112.48f);
        pathBuilder.close();
        pathBuilder.moveTo(62.0f, 56.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f);
        pathBuilder.lineTo(192.0f, 54.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(47.68f);
        pathBuilder.lineTo(129.9f, 82.31f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.8f, 0.0f);
        pathBuilder.lineTo(62.0f, 103.68f);
        pathBuilder.close();
        pathBuilder.moveTo(218.0f, 152.0f);
        pathBuilder.curveToRelative(0.0f, 47.1f, -78.28f, 70.54f, -90.0f, 73.79f);
        pathBuilder.curveTo(116.27f, 222.54f, 38.0f, 199.1f, 38.0f, 152.0f);
        pathBuilder.lineTo(38.0f, 125.77f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.37f, -1.9f);
        pathBuilder.lineTo(122.0f, 96.32f);
        pathBuilder.lineTo(122.0f, 168.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.lineTo(134.0f, 96.32f);
        pathBuilder.lineToRelative(82.63f, 27.55f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.37f, 1.9f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _boat = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
