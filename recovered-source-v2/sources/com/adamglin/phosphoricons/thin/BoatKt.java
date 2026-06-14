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

/* compiled from: Boat.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Boat", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getBoat", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_boat", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BoatKt {
    private static ImageVector _boat;

    public static final ImageVector getBoat(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(219.79f, 114.38f);
        pathBuilder.lineTo(204.0f, 109.12f);
        pathBuilder.lineTo(204.0f, 56.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f);
        pathBuilder.lineTo(132.0f, 44.0f);
        pathBuilder.lineTo(132.0f, 24.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f);
        pathBuilder.lineTo(124.0f, 44.0f);
        pathBuilder.lineTo(64.0f, 44.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 52.0f, 56.0f);
        pathBuilder.verticalLineToRelative(53.12f);
        pathBuilder.lineToRelative(-15.8f, 5.26f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 125.77f);
        pathBuilder.lineTo(28.0f, 152.0f);
        pathBuilder.curveToRelative(0.0f, 24.46f, 17.32f, 46.77f, 50.09f, 64.52f);
        pathBuilder.arcTo(233.22f, 233.22f, 0.0f, false, false, 127.0f, 235.88f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.94f, 0.0f);
        pathBuilder.arcToRelative(233.22f, 233.22f, 0.0f, false, false, 48.94f, -19.36f);
        pathBuilder.curveTo(210.68f, 198.77f, 228.0f, 176.46f, 228.0f, 152.0f);
        pathBuilder.lineTo(228.0f, 125.77f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 219.79f, 114.38f);
        pathBuilder.close();
        pathBuilder.moveTo(60.0f, 56.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f);
        pathBuilder.lineTo(192.0f, 52.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(50.45f);
        pathBuilder.lineTo(129.26f, 84.21f);
        pathBuilder.arcToRelative(3.89f, 3.89f, 0.0f, false, false, -2.52f, 0.0f);
        pathBuilder.lineTo(60.0f, 106.45f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 152.0f);
        pathBuilder.curveToRelative(0.0f, 49.32f, -82.08f, 73.16f, -92.0f, 75.86f);
        pathBuilder.curveToRelative(-9.92f, -2.7f, -92.0f, -26.54f, -92.0f, -75.86f);
        pathBuilder.lineTo(36.0f, 125.77f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.73f, -3.8f);
        pathBuilder.lineTo(124.0f, 93.55f);
        pathBuilder.lineTo(124.0f, 168.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.lineTo(132.0f, 93.55f);
        pathBuilder.lineTo(217.26f, 122.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.74f, 3.8f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _boat = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
