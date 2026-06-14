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

/* compiled from: Hardhat.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HardHat", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getHardHat", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_hardHat", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HardhatKt {
    private static ImageVector _hardHat;

    public static final ImageVector getHardHat(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _hardHat;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HardHat", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.0f, 154.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.lineTo(222.0f, 136.0f);
        pathBuilder.arcToRelative(94.37f, 94.37f, 0.0f, false, false, -64.0f, -89.1f);
        pathBuilder.lineTo(158.0f, 40.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f);
        pathBuilder.lineTo(112.0f, 26.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 98.0f, 40.0f);
        pathBuilder.verticalLineToRelative(6.9f);
        pathBuilder.arcTo(94.37f, 94.37f, 0.0f, false, false, 34.0f, 136.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.lineTo(32.0f, 154.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, 14.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.lineTo(224.0f, 206.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f);
        pathBuilder.lineTo(238.0f, 168.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 224.0f, 154.0f);
        pathBuilder.close();
        pathBuilder.moveTo(210.0f, 136.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.lineTo(158.0f, 154.0f);
        pathBuilder.lineTo(158.0f, 59.68f);
        pathBuilder.arcTo(82.33f, 82.33f, 0.0f, false, true, 210.0f, 136.0f);
        pathBuilder.close();
        pathBuilder.moveTo(112.0f, 38.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f);
        pathBuilder.lineTo(146.0f, 154.0f);
        pathBuilder.lineTo(110.0f, 154.0f);
        pathBuilder.lineTo(110.0f, 40.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 112.0f, 38.0f);
        pathBuilder.close();
        pathBuilder.moveTo(46.0f, 136.0f);
        pathBuilder.arcTo(82.33f, 82.33f, 0.0f, false, true, 98.0f, 59.68f);
        pathBuilder.lineTo(98.0f, 154.0f);
        pathBuilder.lineTo(46.0f, 154.0f);
        pathBuilder.close();
        pathBuilder.moveTo(226.0f, 192.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f);
        pathBuilder.lineTo(32.0f, 194.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f);
        pathBuilder.lineTo(30.0f, 168.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f);
        pathBuilder.lineTo(224.0f, 166.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _hardHat = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
