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

/* compiled from: Shieldslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ShieldSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getShieldSlash", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_shieldSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShieldslashKt {
    private static ImageVector _shieldSlash;

    public static final ImageVector getShieldSlash(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _shieldSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ShieldSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(52.44f, 36.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -9.63f, 7.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 56.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.curveToRelative(0.0f, 51.94f, 25.12f, 83.4f, 46.2f, 100.64f);
        pathBuilder.curveToRelative(22.73f, 18.6f, 45.27f, 24.89f, 46.22f, 25.15f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.16f, 0.0f);
        pathBuilder.curveToRelative(1.36f, -0.37f, 31.91f, -8.95f, 57.67f, -35.7f);
        pathBuilder.lineTo(203.56f, 220.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.88f, -8.08f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 225.72f);
        pathBuilder.arcToRelative(130.83f, 130.83f, 0.0f, false, true, -40.56f, -22.66f);
        pathBuilder.curveTo(59.94f, 180.39f, 46.0f, 149.75f, 46.0f, 112.0f);
        pathBuilder.verticalLineTo(56.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(4.6f);
        pathBuilder.lineTo(179.16f, 193.19f);
        pathBuilder.arcTo(130.68f, 130.68f, 0.0f, false, true, 128.0f, 225.72f);
        pathBuilder.close();
        pathBuilder.moveTo(222.0f, 56.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.curveToRelative(0.0f, 20.29f, -3.83f, 39.05f, -11.38f, 55.77f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.47f, 3.53f);
        pathBuilder.arcToRelative(5.86f, 5.86f, 0.0f, false, true, -2.47f, -0.54f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.0f, -7.93f);
        pathBuilder.curveTo(206.53f, 147.67f, 210.0f, 130.57f, 210.0f, 112.0f);
        pathBuilder.verticalLineTo(56.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f);
        pathBuilder.horizontalLineTo(98.52f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 0.0f, -12.0f);
        pathBuilder.horizontalLineTo(208.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 222.0f, 56.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _shieldSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
