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

/* compiled from: Wheelchairmotion.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"WheelchairMotion", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getWheelchairMotion", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_wheelchairMotion", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WheelchairmotionKt {
    private static ImageVector _wheelchairMotion;

    public static final ImageVector getWheelchairMotion(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(176.0f, 80.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, false, -32.0f, -32.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, false, 176.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(176.0f, 32.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 176.0f, 32.0f);
        pathBuilder.close();
        pathBuilder.moveTo(168.0f, 168.0f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, true, true, -64.0f, -64.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, true, false, 48.0f, 48.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(206.19f, 130.93f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 1.65f, 6.64f);
        pathBuilder.lineToRelative(-16.0f, 80.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 184.0f, 224.0f);
        pathBuilder.arcToRelative(7.77f, 7.77f, 0.0f, false, true, -1.58f, -0.16f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.27f, -9.41f);
        pathBuilder.lineTo(190.24f, 144.0f);
        pathBuilder.lineTo(128.0f, 144.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.94f, -12.0f);
        pathBuilder.lineToRelative(20.06f, -34.9f);
        pathBuilder.arcToRelative(80.09f, 80.09f, 0.0f, false, false, -88.0f, 9.17f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, true, 42.91f, 94.0f);
        pathBuilder.arcToRelative(96.0f, 96.0f, 0.0f, false, true, 113.46f, -6.42f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.57f, 10.69f);
        pathBuilder.lineTo(141.82f, 128.0f);
        pathBuilder.lineTo(200.0f, 128.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 206.19f, 130.93f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _wheelchairMotion = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
