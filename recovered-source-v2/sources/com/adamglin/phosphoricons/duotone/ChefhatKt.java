package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Chefhat.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ChefHat", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getChefHat", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_chefHat", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChefhatKt {
    private static ImageVector _chefHat;

    public static final ImageVector getChefHat(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(232.0f, 112.0f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, false, true, -48.0f, 48.0f);
        pathBuilder.horizontalLineTo(72.0f);
        pathBuilder.arcTo(48.0f, 48.0f, 0.0f, true, true, 82.35f, 65.12f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, false, true, 91.28f, 0.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(48.0f, 48.0f, 0.0f, false, true, 232.0f, 112.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(240.0f, 112.0f);
        pathBuilder2.arcToRelative(56.06f, 56.06f, 0.0f, false, false, -56.0f, -56.0f);
        pathBuilder2.curveToRelative(-1.77f, 0.0f, -3.54f, 0.1f, -5.29f, 0.26f);
        pathBuilder2.arcToRelative(56.0f, 56.0f, 0.0f, false, false, -101.42f, 0.0f);
        pathBuilder2.curveTo(75.54f, 56.1f, 73.77f, 56.0f, 72.0f, 56.0f);
        pathBuilder2.arcTo(56.0f, 56.0f, 0.0f, false, false, 48.0f, 162.59f);
        pathBuilder2.lineTo(48.0f, 208.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder2.lineTo(192.0f, 224.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder2.lineTo(208.0f, 162.59f);
        pathBuilder2.arcTo(56.09f, 56.09f, 0.0f, false, false, 240.0f, 112.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(192.0f, 208.0f);
        pathBuilder2.lineTo(64.0f, 208.0f);
        pathBuilder2.lineTo(64.0f, 167.42f);
        pathBuilder2.arcToRelative(55.49f, 55.49f, 0.0f, false, false, 8.0f, 0.58f);
        pathBuilder2.lineTo(184.0f, 168.0f);
        pathBuilder2.arcToRelative(55.49f, 55.49f, 0.0f, false, false, 8.0f, -0.58f);
        pathBuilder2.close();
        pathBuilder2.moveTo(184.0f, 152.0f);
        pathBuilder2.lineTo(170.25f, 152.0f);
        pathBuilder2.lineToRelative(5.51f, -22.06f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -15.52f, -3.88f);
        pathBuilder2.lineTo(153.75f, 152.0f);
        pathBuilder2.lineTo(136.0f, 152.0f);
        pathBuilder2.lineTo(136.0f, 128.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder2.verticalLineToRelative(24.0f);
        pathBuilder2.lineTo(102.25f, 152.0f);
        pathBuilder2.lineToRelative(-6.49f, -25.94f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -15.52f, 3.88f);
        pathBuilder2.lineTo(85.75f, 152.0f);
        pathBuilder2.lineTo(72.0f, 152.0f);
        pathBuilder2.arcToRelative(40.0f, 40.0f, 0.0f, false, true, 0.0f, -80.0f);
        pathBuilder2.lineToRelative(0.58f, 0.0f);
        pathBuilder2.arcTo(55.21f, 55.21f, 0.0f, false, false, 72.0f, 80.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder2.arcToRelative(40.0f, 40.0f, 0.0f, false, true, 80.0f, 0.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder2.arcToRelative(55.21f, 55.21f, 0.0f, false, false, -0.58f, -8.0f);
        pathBuilder2.lineToRelative(0.58f, 0.0f);
        pathBuilder2.arcToRelative(40.0f, 40.0f, 0.0f, false, true, 0.0f, 80.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _chefHat = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
