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

/* compiled from: Shieldplus.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ShieldPlus", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getShieldPlus", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_shieldPlus", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShieldplusKt {
    private static ImageVector _shieldPlus;

    public static final ImageVector getShieldPlus(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _shieldPlus;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ShieldPlus", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(166.0f, 128.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f);
        pathBuilder.lineTo(134.0f, 134.0f);
        pathBuilder.verticalLineToRelative(26.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.lineTo(122.0f, 134.0f);
        pathBuilder.lineTo(96.0f, 134.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.horizontalLineToRelative(26.0f);
        pathBuilder.lineTo(122.0f, 96.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f);
        pathBuilder.verticalLineToRelative(26.0f);
        pathBuilder.horizontalLineToRelative(26.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 166.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(222.0f, 56.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.curveToRelative(0.0f, 51.94f, -25.12f, 83.4f, -46.2f, 100.64f);
        pathBuilder.curveToRelative(-22.73f, 18.6f, -45.27f, 24.89f, -46.22f, 25.15f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.16f, 0.0f);
        pathBuilder.curveToRelative(-1.0f, -0.26f, -23.49f, -6.55f, -46.22f, -25.15f);
        pathBuilder.curveTo(59.12f, 195.4f, 34.0f, 163.94f, 34.0f, 112.0f);
        pathBuilder.lineTo(34.0f, 56.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 48.0f, 42.0f);
        pathBuilder.lineTo(208.0f, 42.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 222.0f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(210.0f, 56.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f);
        pathBuilder.lineTo(48.0f, 54.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.curveToRelative(0.0f, 37.75f, 13.94f, 68.39f, 41.44f, 91.06f);
        pathBuilder.arcTo(130.83f, 130.83f, 0.0f, false, false, 128.0f, 225.72f);
        pathBuilder.arcToRelative(131.06f, 131.06f, 0.0f, false, false, 40.56f, -22.66f);
        pathBuilder.curveTo(196.06f, 180.39f, 210.0f, 149.75f, 210.0f, 112.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _shieldPlus = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
