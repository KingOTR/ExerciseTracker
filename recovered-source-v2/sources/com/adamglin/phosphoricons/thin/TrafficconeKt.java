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

/* compiled from: Trafficcone.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TrafficCone", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getTrafficCone", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_trafficCone", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrafficconeKt {
    private static ImageVector _trafficCone;

    public static final ImageVector getTrafficCone(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _trafficCone;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("TrafficCone", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(232.0f, 212.0f);
        pathBuilder.lineTo(210.84f, 212.0f);
        pathBuilder.lineTo(149.65f, 36.06f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 138.31f, 28.0f);
        pathBuilder.lineTo(117.69f, 28.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.34f, 8.06f);
        pathBuilder.lineTo(45.16f, 212.0f);
        pathBuilder.lineTo(24.0f, 212.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.lineTo(232.0f, 220.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(92.58f, 100.0f);
        pathBuilder.horizontalLineToRelative(70.84f);
        pathBuilder.lineToRelative(19.47f, 56.0f);
        pathBuilder.lineTo(73.11f, 156.0f);
        pathBuilder.close();
        pathBuilder.moveTo(113.91f, 38.69f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 117.69f, 36.0f);
        pathBuilder.horizontalLineToRelative(20.62f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.78f, 2.69f);
        pathBuilder.lineTo(160.63f, 92.0f);
        pathBuilder.lineTo(95.37f, 92.0f);
        pathBuilder.close();
        pathBuilder.moveTo(70.32f, 164.0f);
        pathBuilder.lineTo(185.68f, 164.0f);
        pathBuilder.lineToRelative(16.69f, 48.0f);
        pathBuilder.lineTo(53.63f, 212.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _trafficCone = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
