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

/* compiled from: Trafficsign.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TrafficSign", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getTrafficSign", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_trafficSign", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrafficsignKt {
    private static ImageVector _trafficSign;

    public static final ImageVector getTrafficSign(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _trafficSign;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("TrafficSign", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(241.74f, 117.71f);
        pathBuilder.lineTo(138.29f, 14.26f);
        pathBuilder.arcToRelative(14.56f, 14.56f, 0.0f, false, false, -20.58f, 0.0f);
        pathBuilder.lineTo(14.26f, 117.71f);
        pathBuilder.arcToRelative(14.56f, 14.56f, 0.0f, false, false, 0.0f, 20.58f);
        pathBuilder.lineTo(117.71f, 241.74f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(14.56f, 14.56f, 0.0f, false, false, 20.58f, 0.0f);
        pathBuilder.lineTo(241.74f, 138.29f);
        pathBuilder.arcToRelative(14.56f, 14.56f, 0.0f, false, false, 0.0f, -20.58f);
        pathBuilder.close();
        pathBuilder.moveTo(233.25f, 129.81f);
        pathBuilder.lineTo(129.81f, 233.25f);
        pathBuilder.arcToRelative(2.56f, 2.56f, 0.0f, false, true, -3.62f, 0.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineTo(22.75f, 129.81f);
        pathBuilder.arcToRelative(2.56f, 2.56f, 0.0f, false, true, 0.0f, -3.62f);
        pathBuilder.lineTo(126.19f, 22.75f);
        pathBuilder.arcToRelative(2.56f, 2.56f, 0.0f, false, true, 3.62f, 0.0f);
        pathBuilder.lineTo(233.25f, 126.19f);
        pathBuilder.arcToRelative(2.56f, 2.56f, 0.0f, false, true, 0.0f, 3.62f);
        pathBuilder.close();
        pathBuilder.moveTo(172.25f, 115.81f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 8.48f);
        pathBuilder.lineToRelative(-24.0f, 24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f);
        pathBuilder.lineTo(153.51f, 126.0f);
        pathBuilder.lineTo(112.0f, 126.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, false, false, -18.0f, 18.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.verticalLineToRelative(-8.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, true, 30.0f, -30.0f);
        pathBuilder.horizontalLineToRelative(41.51f);
        pathBuilder.lineToRelative(-13.75f, -13.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _trafficSign = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
