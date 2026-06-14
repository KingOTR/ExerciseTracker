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

/* compiled from: Thermometersimple.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ThermometerSimple", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getThermometerSimple", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_thermometerSimple", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ThermometersimpleKt {
    private static ImageVector _thermometerSimple;

    public static final ImageVector getThermometerSimple(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _thermometerSimple;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ThermometerSimple", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(136.0f, 153.0f);
        pathBuilder.lineTo(136.0f, 88.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder.verticalLineToRelative(65.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, false, 16.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 200.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 200.0f);
        pathBuilder.close();
        pathBuilder.moveTo(168.0f, 134.0f);
        pathBuilder.lineTo(168.0f, 48.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, false, -80.0f, 0.0f);
        pathBuilder.verticalLineToRelative(86.0f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, true, false, 80.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 232.0f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, false, true, -27.42f, -87.4f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 138.0f);
        pathBuilder.lineTo(104.0f, 48.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, 48.0f, 0.0f);
        pathBuilder.verticalLineToRelative(90.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.42f, 6.56f);
        pathBuilder.arcTo(48.0f, 48.0f, 0.0f, false, true, 128.0f, 232.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _thermometerSimple = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
