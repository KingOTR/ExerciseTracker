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

/* compiled from: Icecream.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"IceCream", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getIceCream", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_iceCream", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IcecreamKt {
    private static ImageVector _iceCream;

    public static final ImageVector getIceCream(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _iceCream;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("IceCream", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 97.37f);
        pathBuilder.lineTo(208.0f, 96.0f);
        pathBuilder.arcTo(80.0f, 80.0f, 0.0f, false, false, 48.0f, 96.0f);
        pathBuilder.verticalLineToRelative(1.37f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, false, 56.0f, 144.0f);
        pathBuilder.horizontalLineToRelative(3.29f);
        pathBuilder.lineToRelative(54.82f, 95.94f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 27.78f, 0.0f);
        pathBuilder.lineTo(196.71f, 144.0f);
        pathBuilder.lineTo(200.0f, 144.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 8.0f, -46.63f);
        pathBuilder.close();
        pathBuilder.moveTo(77.71f, 144.0f);
        pathBuilder.lineTo(97.07f, 144.0f);
        pathBuilder.lineToRelative(40.61f, 71.06f);
        pathBuilder.lineTo(128.0f, 232.0f);
        pathBuilder.close();
        pathBuilder.moveTo(134.79f, 144.0f);
        pathBuilder.lineTo(156.54f, 182.06f);
        pathBuilder.lineTo(146.89f, 198.94f);
        pathBuilder.lineTo(115.5f, 144.0f);
        pathBuilder.close();
        pathBuilder.moveTo(165.79f, 165.94f);
        pathBuilder.lineTo(153.21f, 144.0f);
        pathBuilder.horizontalLineToRelative(25.08f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 128.0f);
        pathBuilder.lineTo(56.0f, 128.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f);
        pathBuilder.lineTo(64.0f, 96.0f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, false, true, 128.0f, 0.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _iceCream = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
