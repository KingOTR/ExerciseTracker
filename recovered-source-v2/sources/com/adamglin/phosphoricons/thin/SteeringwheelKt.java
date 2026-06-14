package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Steeringwheel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SteeringWheel", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getSteeringWheel", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_steeringWheel", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SteeringwheelKt {
    private static ImageVector _steeringWheel;

    public static final ImageVector getSteeringWheel(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 148.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 128.0f, 148.0f);
        pathBuilder.close();
        pathBuilder.moveTo(228.0f, 128.0f);
        pathBuilder.arcTo(100.0f, 100.0f, 0.0f, true, true, 128.0f, 28.0f);
        pathBuilder.arcTo(100.11f, 100.11f, 0.0f, false, true, 228.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(36.0f, 128.0f);
        pathBuilder.quadToRelative(0.0f, 4.53f, 0.44f, 8.94f);
        pathBuilder.arcToRelative(131.94f, 131.94f, 0.0f, false, true, 183.12f, 0.0f);
        pathBuilder.quadToRelative(0.44f, -4.41f, 0.44f, -8.94f);
        pathBuilder.arcToRelative(92.0f, 92.0f, 0.0f, false, false, -184.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(113.75f, 218.9f);
        pathBuilder.lineTo(94.2f, 166.6f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.75f, -2.6f);
        pathBuilder.lineTo(43.34f, 164.0f);
        pathBuilder.arcTo(92.31f, 92.31f, 0.0f, false, false, 113.75f, 218.9f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 220.0f);
        pathBuilder.curveToRelative(1.78f, 0.0f, 3.55f, -0.06f, 5.3f, -0.16f);
        pathBuilder.lineToRelative(21.0f, -56.05f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 165.55f, 156.0f);
        pathBuilder.horizontalLineToRelative(50.09f);
        pathBuilder.arcToRelative(91.61f, 91.61f, 0.0f, false, false, 2.43f, -9.21f);
        pathBuilder.arcToRelative(124.0f, 124.0f, 0.0f, false, false, -180.14f, 0.0f);
        pathBuilder.arcTo(91.61f, 91.61f, 0.0f, false, false, 40.36f, 156.0f);
        pathBuilder.lineTo(90.45f, 156.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 11.24f, 7.8f);
        pathBuilder.lineToRelative(21.0f, 56.0f);
        pathBuilder.curveTo(124.42f, 219.94f, 126.2f, 220.0f, 128.0f, 220.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.66f, 164.0f);
        pathBuilder.lineTo(165.55f, 164.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.75f, 2.6f);
        pathBuilder.lineToRelative(-19.6f, 52.3f);
        pathBuilder.arcTo(92.26f, 92.26f, 0.0f, false, false, 212.66f, 164.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _steeringWheel = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
