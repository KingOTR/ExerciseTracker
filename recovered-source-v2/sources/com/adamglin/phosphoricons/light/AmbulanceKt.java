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

/* compiled from: Ambulance.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Ambulance", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getAmbulance", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_ambulance", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AmbulanceKt {
    private static ImageVector _ambulance;

    public static final ImageVector getAmbulance(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _ambulance;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Ambulance", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(82.0f, 120.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.lineTo(106.0f, 96.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f);
        pathBuilder.lineTo(118.0f, 126.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.lineTo(106.0f, 126.0f);
        pathBuilder.lineTo(88.0f, 126.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 82.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(254.0f, 120.0f);
        pathBuilder.verticalLineToRelative(64.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f);
        pathBuilder.lineTo(221.4f, 198.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, true, -58.8f, 0.0f);
        pathBuilder.lineTo(109.4f, 198.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, true, -58.8f, 0.0f);
        pathBuilder.lineTo(32.0f, 198.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f);
        pathBuilder.lineTo(18.0f, 72.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 32.0f, 58.0f);
        pathBuilder.lineTo(184.0f, 58.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, 6.0f);
        pathBuilder.lineTo(190.0f, 74.0f);
        pathBuilder.horizontalLineToRelative(36.58f);
        pathBuilder.arcToRelative(13.93f, 13.93f, 0.0f, false, true, 13.0f, 8.8f);
        pathBuilder.lineToRelative(14.0f, 35.0f);
        pathBuilder.arcTo(6.1f, 6.1f, 0.0f, false, true, 254.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(190.0f, 86.0f);
        pathBuilder.verticalLineToRelative(28.0f);
        pathBuilder.horizontalLineToRelative(49.14f);
        pathBuilder.lineToRelative(-10.7f, -26.74f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, false, 226.58f, 86.0f);
        pathBuilder.close();
        pathBuilder.moveTo(32.0f, 186.0f);
        pathBuilder.lineTo(50.6f, 186.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, true, 58.8f, 0.0f);
        pathBuilder.horizontalLineToRelative(53.2f);
        pathBuilder.arcTo(30.1f, 30.1f, 0.0f, false, true, 178.0f, 165.48f);
        pathBuilder.lineTo(178.0f, 70.0f);
        pathBuilder.lineTo(32.0f, 70.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f);
        pathBuilder.lineTo(30.0f, 184.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, false, 32.0f, 186.0f);
        pathBuilder.close();
        pathBuilder.moveTo(98.0f, 192.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, true, false, -18.0f, 18.0f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, false, 98.0f, 192.0f);
        pathBuilder.close();
        pathBuilder.moveTo(210.0f, 192.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, true, false, -18.0f, 18.0f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, false, 210.0f, 192.0f);
        pathBuilder.close();
        pathBuilder.moveTo(242.0f, 184.0f);
        pathBuilder.lineTo(242.0f, 126.0f);
        pathBuilder.lineTo(190.0f, 126.0f);
        pathBuilder.verticalLineToRelative(36.07f);
        pathBuilder.curveToRelative(0.66f, 0.0f, 1.33f, -0.07f, 2.0f, -0.07f);
        pathBuilder.arcToRelative(30.05f, 30.05f, 0.0f, false, true, 29.4f, 24.0f);
        pathBuilder.lineTo(240.0f, 186.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, false, 242.0f, 184.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _ambulance = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
