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

/* compiled from: Umbrella.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Umbrella", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getUmbrella", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_umbrella", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UmbrellaKt {
    private static ImageVector _umbrella;

    public static final ImageVector getUmbrella(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _umbrella;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Umbrella", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(238.0f, 126.79f);
        pathBuilder.arcTo(110.43f, 110.43f, 0.0f, false, false, 53.11f, 55.22f);
        pathBuilder.arcToRelative(109.51f, 109.51f, 0.0f, false, false, -35.06f, 71.57f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 32.0f, 142.0f);
        pathBuilder.horizontalLineToRelative(90.0f);
        pathBuilder.verticalLineToRelative(58.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, false, 60.0f, 0.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, false, true, -36.0f, 0.0f);
        pathBuilder.lineTo(134.0f, 142.0f);
        pathBuilder.horizontalLineToRelative(90.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -15.21f);
        pathBuilder.close();
        pathBuilder.moveTo(94.11f, 130.0f);
        pathBuilder.curveTo(95.8f, 78.79f, 118.81f, 49.84f, 128.0f, 40.27f);
        pathBuilder.curveToRelative(9.2f, 9.58f, 32.2f, 38.53f, 33.89f, 89.73f);
        pathBuilder.close();
        pathBuilder.moveTo(30.54f, 129.35f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.53f, -1.56f);
        pathBuilder.arcToRelative(98.14f, 98.14f, 0.0f, false, true, 82.91f, -88.62f);
        pathBuilder.curveToRelative(-12.0f, 15.0f, -29.43f, 44.44f, -30.83f, 90.83f);
        pathBuilder.lineTo(32.0f, 130.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 30.54f, 129.35f);
        pathBuilder.close();
        pathBuilder.moveTo(225.46f, 129.35f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 224.0f, 130.0f);
        pathBuilder.lineTo(173.91f, 130.0f);
        pathBuilder.curveToRelative(-1.4f, -46.39f, -18.81f, -75.87f, -30.83f, -90.83f);
        pathBuilder.arcTo(98.14f, 98.14f, 0.0f, false, true, 226.0f, 127.79f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 225.46f, 129.35f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _umbrella = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
