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

/* compiled from: Chefhat.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ChefHat", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getChefHat", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_chefHat", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChefhatKt {
    private static ImageVector _chefHat;

    public static final ImageVector getChefHat(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _chefHat;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ChefHat", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(240.0f, 112.0f);
        pathBuilder.arcToRelative(56.06f, 56.06f, 0.0f, false, false, -56.0f, -56.0f);
        pathBuilder.curveToRelative(-1.77f, 0.0f, -3.54f, 0.1f, -5.29f, 0.26f);
        pathBuilder.arcToRelative(56.0f, 56.0f, 0.0f, false, false, -101.42f, 0.0f);
        pathBuilder.curveTo(75.54f, 56.1f, 73.77f, 56.0f, 72.0f, 56.0f);
        pathBuilder.arcTo(56.0f, 56.0f, 0.0f, false, false, 48.0f, 162.59f);
        pathBuilder.lineTo(48.0f, 208.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.lineTo(192.0f, 224.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.lineTo(208.0f, 162.59f);
        pathBuilder.arcTo(56.09f, 56.09f, 0.0f, false, false, 240.0f, 112.0f);
        pathBuilder.close();
        pathBuilder.moveTo(192.0f, 208.0f);
        pathBuilder.lineTo(64.0f, 208.0f);
        pathBuilder.lineTo(64.0f, 167.42f);
        pathBuilder.arcToRelative(55.49f, 55.49f, 0.0f, false, false, 8.0f, 0.58f);
        pathBuilder.lineTo(184.0f, 168.0f);
        pathBuilder.arcToRelative(55.49f, 55.49f, 0.0f, false, false, 8.0f, -0.58f);
        pathBuilder.close();
        pathBuilder.moveTo(184.0f, 152.0f);
        pathBuilder.lineTo(170.25f, 152.0f);
        pathBuilder.lineToRelative(5.51f, -22.06f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -15.52f, -3.88f);
        pathBuilder.lineTo(153.75f, 152.0f);
        pathBuilder.lineTo(136.0f, 152.0f);
        pathBuilder.lineTo(136.0f, 128.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.lineTo(102.25f, 152.0f);
        pathBuilder.lineToRelative(-6.49f, -25.94f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -15.52f, 3.88f);
        pathBuilder.lineTo(85.75f, 152.0f);
        pathBuilder.lineTo(72.0f, 152.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, 0.0f, -80.0f);
        pathBuilder.lineToRelative(0.58f, 0.0f);
        pathBuilder.arcTo(55.21f, 55.21f, 0.0f, false, false, 72.0f, 80.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, 80.0f, 0.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.arcToRelative(55.21f, 55.21f, 0.0f, false, false, -0.58f, -8.0f);
        pathBuilder.lineToRelative(0.58f, 0.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, 0.0f, 80.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _chefHat = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
