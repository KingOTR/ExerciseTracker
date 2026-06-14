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

/* compiled from: Trafficcone.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TrafficCone", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getTrafficCone", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_trafficCone", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrafficconeKt {
    private static ImageVector _trafficCone;

    public static final ImageVector getTrafficCone(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(232.0f, 210.0f);
        pathBuilder.lineTo(212.27f, 210.0f);
        pathBuilder.lineTo(151.54f, 35.4f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 138.31f, 26.0f);
        pathBuilder.lineTo(117.69f, 26.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -13.23f, 9.4f);
        pathBuilder.lineTo(43.73f, 210.0f);
        pathBuilder.lineTo(24.0f, 210.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.lineTo(232.0f, 222.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(94.0f, 102.0f);
        pathBuilder.horizontalLineToRelative(68.0f);
        pathBuilder.lineToRelative(18.08f, 52.0f);
        pathBuilder.lineTo(75.92f, 154.0f);
        pathBuilder.close();
        pathBuilder.moveTo(115.8f, 39.34f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 117.69f, 38.0f);
        pathBuilder.horizontalLineToRelative(20.62f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.89f, 1.34f);
        pathBuilder.lineTo(157.82f, 90.0f);
        pathBuilder.lineTo(98.18f, 90.0f);
        pathBuilder.close();
        pathBuilder.moveTo(71.74f, 166.0f);
        pathBuilder.lineTo(184.26f, 166.0f);
        pathBuilder.lineToRelative(15.3f, 44.0f);
        pathBuilder.lineTo(56.44f, 210.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _trafficCone = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
