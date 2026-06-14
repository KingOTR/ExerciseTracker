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

/* compiled from: Airtrafficcontrol.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"AirTrafficControl", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getAirTrafficControl", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_airTrafficControl", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AirtrafficcontrolKt {
    private static ImageVector _airTrafficControl;

    public static final ImageVector getAirTrafficControl(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _airTrafficControl;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("AirTrafficControl", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(225.83f, 73.11f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 68.0f);
        pathBuilder.lineTo(132.0f, 68.0f);
        pathBuilder.lineTo(132.0f, 28.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.lineTo(104.0f, 20.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.lineTo(124.0f, 68.0f);
        pathBuilder.lineTo(40.0f, 68.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 28.72f, 84.1f);
        pathBuilder.lineToRelative(26.19f, 72.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 66.18f, 164.0f);
        pathBuilder.lineTo(100.0f, 164.0f);
        pathBuilder.verticalLineToRelative(68.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.lineTo(108.0f, 164.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.verticalLineToRelative(68.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.lineTo(156.0f, 164.0f);
        pathBuilder.horizontalLineToRelative(33.82f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.27f, -7.9f);
        pathBuilder.lineToRelative(26.19f, -72.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 225.83f, 73.11f);
        pathBuilder.close();
        pathBuilder.moveTo(107.34f, 156.0f);
        pathBuilder.lineTo(92.79f, 76.0f);
        pathBuilder.horizontalLineToRelative(70.42f);
        pathBuilder.lineToRelative(-14.55f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(62.42f, 153.37f);
        pathBuilder.lineTo(36.24f, 81.37f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 40.0f, 76.0f);
        pathBuilder.lineTo(84.66f, 76.0f);
        pathBuilder.lineTo(99.2f, 156.0f);
        pathBuilder.horizontalLineToRelative(-33.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 62.42f, 153.37f);
        pathBuilder.close();
        pathBuilder.moveTo(219.76f, 81.37f);
        pathBuilder.lineTo(193.58f, 153.37f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.76f, 2.63f);
        pathBuilder.horizontalLineToRelative(-33.0f);
        pathBuilder.lineToRelative(14.55f, -80.0f);
        pathBuilder.lineTo(216.0f, 76.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.76f, 5.37f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _airTrafficControl = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
