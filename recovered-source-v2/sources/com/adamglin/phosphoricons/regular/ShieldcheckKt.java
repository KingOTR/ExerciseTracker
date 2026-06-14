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

/* compiled from: Shieldcheck.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ShieldCheck", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getShieldCheck", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_shieldCheck", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShieldcheckKt {
    private static ImageVector _shieldCheck;

    public static final ImageVector getShieldCheck(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _shieldCheck;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ShieldCheck", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 40.0f);
        pathBuilder.lineTo(48.0f, 40.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 56.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.curveToRelative(0.0f, 52.72f, 25.52f, 84.67f, 46.93f, 102.19f);
        pathBuilder.curveToRelative(23.06f, 18.86f, 46.0f, 25.26f, 47.0f, 25.53f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.2f, 0.0f);
        pathBuilder.curveToRelative(1.0f, -0.27f, 23.91f, -6.67f, 47.0f, -25.53f);
        pathBuilder.curveTo(198.48f, 196.67f, 224.0f, 164.72f, 224.0f, 112.0f);
        pathBuilder.lineTo(224.0f, 56.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(208.0f, 112.0f);
        pathBuilder.curveToRelative(0.0f, 37.07f, -13.66f, 67.16f, -40.6f, 89.42f);
        pathBuilder.arcTo(129.3f, 129.3f, 0.0f, false, true, 128.0f, 223.62f);
        pathBuilder.arcToRelative(128.25f, 128.25f, 0.0f, false, true, -38.92f, -21.81f);
        pathBuilder.curveTo(61.82f, 179.51f, 48.0f, 149.3f, 48.0f, 112.0f);
        pathBuilder.lineToRelative(0.0f, -56.0f);
        pathBuilder.lineToRelative(160.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(82.34f, 141.66f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f);
        pathBuilder.lineTo(112.0f, 148.69f);
        pathBuilder.lineToRelative(50.34f, -50.35f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f);
        pathBuilder.lineToRelative(-56.0f, 56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _shieldCheck = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
