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

/* compiled from: Drone.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Drone", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getDrone", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_drone", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DroneKt {
    private static ImageVector _drone;

    public static final ImageVector getDrone(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _drone;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Drone", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(188.24f, 67.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 0.0f);
        pathBuilder.lineTo(149.52f, 98.0f);
        pathBuilder.horizontalLineToRelative(-43.0f);
        pathBuilder.lineTo(76.24f, 67.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 8.48f);
        pathBuilder.lineTo(98.0f, 106.48f);
        pathBuilder.verticalLineToRelative(43.0f);
        pathBuilder.lineTo(67.76f, 179.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, 8.48f);
        pathBuilder.lineTo(106.48f, 158.0f);
        pathBuilder.horizontalLineToRelative(43.0f);
        pathBuilder.lineToRelative(30.24f, 30.24f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.48f);
        pathBuilder.lineTo(158.0f, 149.52f);
        pathBuilder.verticalLineToRelative(-43.0f);
        pathBuilder.lineToRelative(30.24f, -30.24f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 188.24f, 67.76f);
        pathBuilder.close();
        pathBuilder.moveTo(110.0f, 110.0f);
        pathBuilder.horizontalLineToRelative(36.0f);
        pathBuilder.verticalLineToRelative(36.0f);
        pathBuilder.lineTo(110.0f, 146.0f);
        pathBuilder.close();
        pathBuilder.moveTo(140.39f, 62.0f);
        pathBuilder.arcTo(42.0f, 42.0f, 0.0f, true, true, 194.0f, 115.61f);
        pathBuilder.arcToRelative(6.09f, 6.09f, 0.0f, false, true, -2.0f, 0.34f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -2.0f, -11.66f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, true, false, 151.71f, 66.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -11.32f, -4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(222.0f, 180.0f);
        pathBuilder.arcToRelative(42.0f, 42.0f, 0.0f, false, true, -81.61f, 14.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.32f, -4.0f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, true, false, 190.0f, 151.71f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.0f, -11.32f);
        pathBuilder.arcTo(42.07f, 42.07f, 0.0f, false, true, 222.0f, 180.0f);
        pathBuilder.close();
        pathBuilder.moveTo(115.61f, 194.0f);
        pathBuilder.arcTo(42.0f, 42.0f, 0.0f, true, true, 62.0f, 140.39f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 4.0f, 11.32f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, true, false, 104.29f, 190.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.32f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(34.0f, 76.0f);
        pathBuilder.arcToRelative(42.0f, 42.0f, 0.0f, false, true, 81.61f, -14.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -11.32f, 4.0f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, true, false, 66.0f, 104.29f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 64.0f, 116.0f);
        pathBuilder.arcToRelative(6.09f, 6.09f, 0.0f, false, true, -2.0f, -0.34f);
        pathBuilder.arcTo(42.07f, 42.07f, 0.0f, false, true, 34.0f, 76.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _drone = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
