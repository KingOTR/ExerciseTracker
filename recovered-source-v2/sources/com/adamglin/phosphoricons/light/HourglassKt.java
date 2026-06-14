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

/* compiled from: Hourglass.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Hourglass", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getHourglass", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_hourglass", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HourglassKt {
    private static ImageVector _hourglass;

    public static final ImageVector getHourglass(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _hourglass;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Hourglass", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(198.0f, 75.64f);
        pathBuilder.lineTo(198.0f, 40.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f);
        pathBuilder.lineTo(72.0f, 26.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 58.0f, 40.0f);
        pathBuilder.lineTo(58.0f, 76.0f);
        pathBuilder.arcToRelative(14.06f, 14.06f, 0.0f, false, false, 5.6f, 11.2f);
        pathBuilder.lineTo(118.0f, 128.0f);
        pathBuilder.lineTo(63.6f, 168.8f);
        pathBuilder.arcTo(14.06f, 14.06f, 0.0f, false, false, 58.0f, 180.0f);
        pathBuilder.verticalLineToRelative(36.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.lineTo(184.0f, 230.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f);
        pathBuilder.lineTo(198.0f, 180.36f);
        pathBuilder.arcToRelative(14.08f, 14.08f, 0.0f, false, false, -5.56f, -11.17f);
        pathBuilder.lineTo(138.0f, 128.0f);
        pathBuilder.lineToRelative(54.49f, -41.19f);
        pathBuilder.arcTo(14.08f, 14.08f, 0.0f, false, false, 198.0f, 75.64f);
        pathBuilder.close();
        pathBuilder.moveTo(186.0f, 180.36f);
        pathBuilder.lineTo(186.0f, 216.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f);
        pathBuilder.lineTo(72.0f, 218.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f);
        pathBuilder.lineTo(70.0f, 180.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.8f, -1.6f);
        pathBuilder.lineTo(128.0f, 135.51f);
        pathBuilder.lineToRelative(57.22f, 43.25f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 186.0f, 180.36f);
        pathBuilder.close();
        pathBuilder.moveTo(186.0f, 75.64f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.79f, 1.6f);
        pathBuilder.lineTo(128.0f, 120.49f);
        pathBuilder.lineTo(70.8f, 77.6f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 70.0f, 76.0f);
        pathBuilder.lineTo(70.0f, 40.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f);
        pathBuilder.lineTo(184.0f, 38.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _hourglass = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
