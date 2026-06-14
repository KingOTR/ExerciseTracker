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

/* compiled from: Shieldcheckered.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ShieldCheckered", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getShieldCheckered", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_shieldCheckered", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShieldcheckeredKt {
    private static ImageVector _shieldCheckered;

    public static final ImageVector getShieldCheckered(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _shieldCheckered;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ShieldCheckered", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 48.0f);
        pathBuilder.verticalLineToRelative(80.0f);
        pathBuilder.lineTo(40.87f, 128.0f);
        pathBuilder.arcTo(146.29f, 146.29f, 0.0f, false, true, 40.0f, 112.0f);
        pathBuilder.lineTo(40.0f, 56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 128.0f);
        pathBuilder.lineTo(128.0f, 232.0f);
        pathBuilder.reflectiveCurveToRelative(78.06f, -21.3f, 87.13f, -104.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(208.0f, 40.0f);
        pathBuilder2.lineTo(48.0f, 40.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 56.0f);
        pathBuilder2.verticalLineToRelative(56.0f);
        pathBuilder2.curveToRelative(0.0f, 52.72f, 25.52f, 84.67f, 46.93f, 102.19f);
        pathBuilder2.curveToRelative(23.06f, 18.86f, 46.0f, 25.27f, 47.0f, 25.53f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.2f, 0.0f);
        pathBuilder2.curveToRelative(1.0f, -0.26f, 23.91f, -6.67f, 47.0f, -25.53f);
        pathBuilder2.curveTo(198.48f, 196.67f, 224.0f, 164.72f, 224.0f, 112.0f);
        pathBuilder2.lineTo(224.0f, 56.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 40.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(120.0f, 220.55f);
        pathBuilder2.arcToRelative(130.85f, 130.85f, 0.0f, false, true, -30.93f, -18.74f);
        pathBuilder2.curveToRelative(-21.15f, -17.3f, -34.2f, -39.37f, -39.0f, -65.81f);
        pathBuilder2.lineTo(120.0f, 136.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(120.0f, 120.0f);
        pathBuilder2.lineTo(48.23f, 120.0f);
        pathBuilder2.curveToRelative(-0.15f, -2.63f, -0.23f, -5.29f, -0.23f, -8.0f);
        pathBuilder2.lineToRelative(0.0f, -56.0f);
        pathBuilder2.horizontalLineToRelative(72.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(167.4f, 201.42f);
        pathBuilder2.arcTo(131.31f, 131.31f, 0.0f, false, true, 136.0f, 220.53f);
        pathBuilder2.lineTo(136.0f, 136.0f);
        pathBuilder2.horizontalLineToRelative(69.91f);
        pathBuilder2.curveTo(201.16f, 162.24f, 188.27f, 184.18f, 167.4f, 201.42f);
        pathBuilder2.close();
        pathBuilder2.moveTo(208.0f, 112.0f);
        pathBuilder2.curveToRelative(0.0f, 2.71f, -0.08f, 5.37f, -0.23f, 8.0f);
        pathBuilder2.lineTo(136.0f, 120.0f);
        pathBuilder2.lineTo(136.0f, 56.0f);
        pathBuilder2.horizontalLineToRelative(72.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _shieldCheckered = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
