package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Steeringwheel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SteeringWheel", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getSteeringWheel", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_steeringWheel", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SteeringwheelKt {
    private static ImageVector _steeringWheel;

    public static final ImageVector getSteeringWheel(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(144.0f, 144.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 144.0f, 144.0f);
        pathBuilder.close();
        pathBuilder.moveTo(236.0f, 128.0f);
        pathBuilder.arcTo(108.0f, 108.0f, 0.0f, true, true, 128.0f, 20.0f);
        pathBuilder.arcTo(108.12f, 108.12f, 0.0f, false, true, 236.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(165.55f, 156.0f);
        pathBuilder.horizontalLineToRelative(41.63f);
        pathBuilder.curveToRelative(0.79f, -2.21f, 1.49f, -4.47f, 2.09f, -6.76f);
        pathBuilder.arcToRelative(116.0f, 116.0f, 0.0f, false, false, -162.54f, 0.0f);
        pathBuilder.quadToRelative(0.9f, 3.44f, 2.09f, 6.76f);
        pathBuilder.lineTo(90.45f, 156.0f);
        pathBuilder.arcToRelative(20.07f, 20.07f, 0.0f, false, true, 18.73f, 13.0f);
        pathBuilder.lineToRelative(16.06f, 42.93f);
        pathBuilder.curveToRelative(0.92f, 0.0f, 1.83f, 0.07f, 2.76f, 0.07f);
        pathBuilder.reflectiveCurveToRelative(1.82f, 0.0f, 2.72f, -0.07f);
        pathBuilder.lineToRelative(16.1f, -43.0f);
        pathBuilder.arcTo(20.09f, 20.09f, 0.0f, false, true, 165.55f, 156.0f);
        pathBuilder.close();
        pathBuilder.moveTo(44.41f, 119.73f);
        pathBuilder.arcToRelative(139.85f, 139.85f, 0.0f, false, true, 167.18f, 0.0f);
        pathBuilder.arcToRelative(84.0f, 84.0f, 0.0f, false, false, -167.18f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(97.49f, 206.24f);
        pathBuilder.lineTo(87.68f, 180.0f);
        pathBuilder.lineTo(62.1f, 180.0f);
        pathBuilder.arcTo(84.46f, 84.46f, 0.0f, false, false, 97.49f, 206.24f);
        pathBuilder.close();
        pathBuilder.moveTo(193.9f, 180.0f);
        pathBuilder.lineTo(168.32f, 180.0f);
        pathBuilder.lineToRelative(-9.84f, 26.25f);
        pathBuilder.arcTo(84.35f, 84.35f, 0.0f, false, false, 193.9f, 180.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _steeringWheel = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
