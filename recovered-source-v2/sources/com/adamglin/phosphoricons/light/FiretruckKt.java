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

/* compiled from: Firetruck.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FireTruck", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getFireTruck", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fireTruck", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FiretruckKt {
    private static ImageVector _fireTruck;

    public static final ImageVector getFireTruck(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _fireTruck;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FireTruck", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(253.57f, 117.77f);
        pathBuilder.lineToRelative(-14.0f, -35.0f);
        pathBuilder.arcToRelative(13.93f, 13.93f, 0.0f, false, false, -13.0f, -8.8f);
        pathBuilder.lineTo(190.0f, 73.97f);
        pathBuilder.lineTo(190.0f, 64.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.lineTo(178.0f, 165.48f);
        pathBuilder.arcTo(30.1f, 30.1f, 0.0f, false, false, 162.6f, 186.0f);
        pathBuilder.lineTo(109.4f, 186.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, false, -58.8f, 0.0f);
        pathBuilder.lineTo(32.0f, 186.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f);
        pathBuilder.lineTo(30.0f, 136.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.verticalLineToRelative(48.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.lineTo(50.6f, 198.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, false, 58.8f, 0.0f);
        pathBuilder.horizontalLineToRelative(53.2f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, false, 58.8f, 0.0f);
        pathBuilder.lineTo(240.0f, 198.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f);
        pathBuilder.lineTo(254.0f, 120.0f);
        pathBuilder.arcTo(6.1f, 6.1f, 0.0f, false, false, 253.57f, 117.77f);
        pathBuilder.close();
        pathBuilder.moveTo(226.58f, 86.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.86f, 1.26f);
        pathBuilder.lineTo(239.14f, 114.0f);
        pathBuilder.lineTo(190.0f, 114.0f);
        pathBuilder.lineTo(190.0f, 86.0f);
        pathBuilder.close();
        pathBuilder.moveTo(80.0f, 210.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, true, 80.0f, 210.0f);
        pathBuilder.close();
        pathBuilder.moveTo(192.0f, 210.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, true, 192.0f, 210.0f);
        pathBuilder.close();
        pathBuilder.moveTo(240.0f, 186.0f);
        pathBuilder.lineTo(221.4f, 186.0f);
        pathBuilder.arcTo(30.05f, 30.05f, 0.0f, false, false, 192.0f, 162.0f);
        pathBuilder.curveToRelative(-0.67f, 0.0f, -1.34f, 0.0f, -2.0f, 0.07f);
        pathBuilder.lineTo(190.0f, 126.0f);
        pathBuilder.horizontalLineToRelative(52.0f);
        pathBuilder.verticalLineToRelative(58.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 240.0f, 186.0f);
        pathBuilder.close();
        pathBuilder.moveTo(24.0f, 98.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.lineTo(152.0f, 110.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.lineTo(134.0f, 98.0f);
        pathBuilder.lineTo(134.0f, 70.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.lineTo(24.0f, 58.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.lineTo(42.0f, 70.0f);
        pathBuilder.lineTo(42.0f, 98.0f);
        pathBuilder.close();
        pathBuilder.moveTo(122.0f, 98.0f);
        pathBuilder.lineTo(94.0f, 98.0f);
        pathBuilder.lineTo(94.0f, 70.0f);
        pathBuilder.horizontalLineToRelative(28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(54.0f, 70.0f);
        pathBuilder.lineTo(82.0f, 70.0f);
        pathBuilder.lineTo(82.0f, 98.0f);
        pathBuilder.lineTo(54.0f, 98.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fireTruck = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
