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

/* compiled from: Headcircuit.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HeadCircuit", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getHeadCircuit", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_headCircuit", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HeadcircuitKt {
    private static ImageVector _headCircuit;

    public static final ImageVector getHeadCircuit(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _headCircuit;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HeadCircuit", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(190.37f, 170.62f);
        pathBuilder.arcTo(86.27f, 86.27f, 0.0f, false, false, 222.0f, 102.0f);
        pathBuilder.curveToRelative(-1.0f, -44.68f, -36.76f, -81.51f, -81.34f, -83.86f);
        pathBuilder.arcTo(86.0f, 86.0f, 0.0f, false, false, 50.0f, 102.51f);
        pathBuilder.lineToRelative(-22.69f, 43.6f);
        pathBuilder.curveToRelative(-0.07f, 0.13f, -0.13f, 0.26f, -0.19f, 0.4f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 6.61f, 18.0f);
        pathBuilder.lineToRelative(0.18f, 0.09f);
        pathBuilder.lineToRelative(24.08f, 11.0f);
        pathBuilder.lineTo(57.99f, 208.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.lineTo(72.0f, 210.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f);
        pathBuilder.lineTo(70.0f, 171.81f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.5f, -5.46f);
        pathBuilder.lineTo(39.0f, 153.78f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.93f, -2.4f);
        pathBuilder.lineToRelative(23.21f, -44.61f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 62.0f, 104.0f);
        pathBuilder.arcToRelative(74.05f, 74.05f, 0.0f, false, true, 60.0f, -72.68f);
        pathBuilder.lineTo(122.0f, 50.84f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, true, false, 12.0f, 0.0f);
        pathBuilder.lineTo(134.0f, 30.05f);
        pathBuilder.curveToRelative(2.0f, -0.05f, 4.0f, -0.05f, 6.0f, 0.06f);
        pathBuilder.arcTo(74.29f, 74.29f, 0.0f, false, true, 206.63f, 82.0f);
        pathBuilder.lineTo(184.0f, 82.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.61f, 2.16f);
        pathBuilder.lineTo(152.94f, 115.9f);
        pathBuilder.arcToRelative(22.06f, 22.06f, 0.0f, true, false, 9.21f, 7.69f);
        pathBuilder.lineTo(186.81f, 94.0f);
        pathBuilder.horizontalLineToRelative(22.5f);
        pathBuilder.arcToRelative(72.44f, 72.44f, 0.0f, false, true, 0.67f, 8.26f);
        pathBuilder.arcTo(74.24f, 74.24f, 0.0f, false, true, 180.4f, 163.2f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.35f, 5.54f);
        pathBuilder.lineToRelative(8.0f, 64.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 192.0f, 238.0f);
        pathBuilder.arcToRelative(6.3f, 6.3f, 0.0f, false, false, 0.75f, -0.05f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.21f, -6.7f);
        pathBuilder.close();
        pathBuilder.moveTo(138.0f, 72.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 138.0f, 72.0f);
        pathBuilder.close();
        pathBuilder.moveTo(144.0f, 146.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, -10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 144.0f, 146.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _headCircuit = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
