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

/* compiled from: Wheelchairmotion.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"WheelchairMotion", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getWheelchairMotion", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_wheelchairMotion", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WheelchairmotionKt {
    private static ImageVector _wheelchairMotion;

    public static final ImageVector getWheelchairMotion(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _wheelchairMotion;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("WheelchairMotion", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(176.0f, 76.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, -28.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 176.0f, 76.0f);
        pathBuilder.close();
        pathBuilder.moveTo(176.0f, 28.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, 20.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 176.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 168.0f);
        pathBuilder.arcToRelative(60.0f, 60.0f, 0.0f, true, true, -60.0f, -60.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, true, false, 52.0f, 52.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(203.09f, 133.46f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.83f, 3.32f);
        pathBuilder.lineToRelative(-16.0f, 80.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 184.0f, 220.0f);
        pathBuilder.arcToRelative(3.44f, 3.44f, 0.0f, false, true, -0.78f, -0.08f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.14f, -4.7f);
        pathBuilder.lineToRelative(15.0f, -75.22f);
        pathBuilder.lineTo(128.0f, 140.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.47f, -6.0f);
        pathBuilder.lineToRelative(22.08f, -38.42f);
        pathBuilder.arcToRelative(84.05f, 84.05f, 0.0f, false, false, -96.06f, 7.61f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 45.45f, 97.0f);
        pathBuilder.arcToRelative(92.0f, 92.0f, 0.0f, false, true, 108.73f, -6.15f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.29f, 5.34f);
        pathBuilder.lineTo(134.91f, 132.0f);
        pathBuilder.lineTo(200.0f, 132.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 203.09f, 133.46f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _wheelchairMotion = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
