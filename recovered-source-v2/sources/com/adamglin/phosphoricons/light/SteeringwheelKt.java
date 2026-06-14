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

/* compiled from: Steeringwheel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SteeringWheel", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getSteeringWheel", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_steeringWheel", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SteeringwheelKt {
    private static ImageVector _steeringWheel;

    public static final ImageVector getSteeringWheel(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _steeringWheel;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("SteeringWheel", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 26.0f);
        pathBuilder.arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f);
        pathBuilder.arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f);
        pathBuilder.close();
        pathBuilder.moveTo(46.43f, 166.0f);
        pathBuilder.horizontalLineToRelative(44.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.87f, 1.3f);
        pathBuilder.lineToRelative(18.33f, 49.0f);
        pathBuilder.arcTo(90.3f, 90.3f, 0.0f, false, true, 46.43f, 166.0f);
        pathBuilder.close();
        pathBuilder.moveTo(145.3f, 216.32f);
        pathBuilder.lineTo(163.67f, 167.32f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.88f, -1.3f);
        pathBuilder.horizontalLineToRelative(44.0f);
        pathBuilder.arcTo(90.29f, 90.29f, 0.0f, false, true, 145.3f, 216.32f);
        pathBuilder.close();
        pathBuilder.moveTo(214.17f, 154.0f);
        pathBuilder.lineTo(165.55f, 154.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -13.11f, 9.09f);
        pathBuilder.lineToRelative(-20.55f, 54.82f);
        pathBuilder.curveToRelative(-1.29f, 0.06f, -2.59f, 0.09f, -3.89f, 0.09f);
        pathBuilder.reflectiveCurveToRelative(-2.63f, 0.0f, -3.94f, -0.09f);
        pathBuilder.lineToRelative(-20.5f, -54.81f);
        pathBuilder.arcTo(14.06f, 14.06f, 0.0f, false, false, 90.45f, 154.0f);
        pathBuilder.lineTo(41.83f, 154.0f);
        pathBuilder.curveToRelative(-0.65f, -2.17f, -1.23f, -4.37f, -1.72f, -6.61f);
        pathBuilder.arcToRelative(122.0f, 122.0f, 0.0f, false, true, 175.78f, 0.0f);
        pathBuilder.curveTo(215.4f, 149.63f, 214.82f, 151.83f, 214.17f, 154.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 98.0f);
        pathBuilder.arcToRelative(134.38f, 134.38f, 0.0f, false, false, -89.88f, 34.64f);
        pathBuilder.curveTo(38.0f, 131.1f, 38.0f, 129.56f, 38.0f, 128.0f);
        pathBuilder.arcToRelative(90.0f, 90.0f, 0.0f, false, true, 180.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 1.56f, 0.0f, 3.1f, -0.12f, 4.64f);
        pathBuilder.arcTo(134.38f, 134.38f, 0.0f, false, false, 128.0f, 98.0f);
        pathBuilder.close();
        pathBuilder.moveTo(138.0f, 140.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 138.0f, 140.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _steeringWheel = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
