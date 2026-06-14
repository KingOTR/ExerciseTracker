package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Steeringwheel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SteeringWheel", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getSteeringWheel", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_steeringWheel", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SteeringwheelKt {
    private static ImageVector _steeringWheel;

    public static final ImageVector getSteeringWheel(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 152.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 152.0f);
        pathBuilder.close();
        pathBuilder.moveTo(232.0f, 128.0f);
        pathBuilder.arcTo(104.0f, 104.0f, 0.0f, true, true, 128.0f, 24.0f);
        pathBuilder.arcTo(104.11f, 104.11f, 0.0f, false, true, 232.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(40.0f, 128.0f);
        pathBuilder.verticalLineToRelative(0.33f);
        pathBuilder.arcToRelative(135.93f, 135.93f, 0.0f, false, true, 176.0f, 0.0f);
        pathBuilder.lineTo(216.0f, 128.0f);
        pathBuilder.arcToRelative(88.0f, 88.0f, 0.0f, false, false, -176.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(107.5f, 213.58f);
        pathBuilder.lineTo(90.45f, 168.0f);
        pathBuilder.lineTo(49.63f, 168.0f);
        pathBuilder.arcTo(88.35f, 88.35f, 0.0f, false, false, 107.5f, 213.58f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 216.0f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.66f, 0.0f, 2.49f, 0.0f);
        pathBuilder.lineToRelative(20.07f, -53.57f);
        pathBuilder.arcToRelative(16.07f, 16.07f, 0.0f, false, true, 15.0f, -10.39f);
        pathBuilder.horizontalLineToRelative(47.12f);
        pathBuilder.curveToRelative(0.38f, -1.31f, 0.72f, -2.64f, 1.0f, -4.0f);
        pathBuilder.arcToRelative(120.0f, 120.0f, 0.0f, false, false, -171.4f, 0.0f);
        pathBuilder.curveToRelative(0.31f, 1.34f, 0.65f, 2.67f, 1.0f, 4.0f);
        pathBuilder.lineTo(90.45f, 152.04f);
        pathBuilder.arcToRelative(16.08f, 16.08f, 0.0f, false, true, 15.0f, 10.4f);
        pathBuilder.lineToRelative(20.0f, 53.56f);
        pathBuilder.curveTo(126.31f, 216.0f, 127.15f, 216.0f, 128.0f, 216.0f);
        pathBuilder.close();
        pathBuilder.moveTo(206.37f, 168.0f);
        pathBuilder.lineTo(165.55f, 168.0f);
        pathBuilder.lineToRelative(-17.09f, 45.59f);
        pathBuilder.arcTo(88.34f, 88.34f, 0.0f, false, false, 206.37f, 168.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _steeringWheel = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
