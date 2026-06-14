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

/* compiled from: Vignette.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Vignette", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getVignette", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_vignette", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VignetteKt {
    private static ImageVector _vignette;

    public static final ImageVector getVignette(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _vignette;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Vignette", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(216.0f, 40.0f);
        pathBuilder.lineTo(40.0f, 40.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 56.0f);
        pathBuilder.lineTo(24.0f, 200.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.lineTo(216.0f, 216.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.lineTo(232.0f, 56.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 200.0f);
        pathBuilder.lineTo(40.0f, 200.0f);
        pathBuilder.lineTo(40.0f, 56.0f);
        pathBuilder.lineTo(216.0f, 56.0f);
        pathBuilder.lineTo(216.0f, 200.0f);
        pathBuilder.close();
        pathBuilder.moveTo(178.05f, 87.66f);
        pathBuilder.curveTo(164.59f, 77.56f, 146.81f, 72.0f, 128.0f, 72.0f);
        pathBuilder.reflectiveCurveTo(91.41f, 77.56f, 78.0f, 87.66f);
        pathBuilder.curveTo(63.79f, 98.27f, 56.0f, 112.6f, 56.0f, 128.0f);
        pathBuilder.reflectiveCurveToRelative(7.79f, 29.73f, 22.0f, 40.34f);
        pathBuilder.curveTo(91.41f, 178.44f, 109.19f, 184.0f, 128.0f, 184.0f);
        pathBuilder.reflectiveCurveToRelative(36.59f, -5.56f, 50.05f, -15.66f);
        pathBuilder.curveTo(192.21f, 157.73f, 200.0f, 143.4f, 200.0f, 128.0f);
        pathBuilder.reflectiveCurveTo(192.21f, 98.27f, 178.05f, 87.66f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 168.0f);
        pathBuilder.curveToRelative(-30.88f, 0.0f, -56.0f, -17.94f, -56.0f, -40.0f);
        pathBuilder.reflectiveCurveToRelative(25.12f, -40.0f, 56.0f, -40.0f);
        pathBuilder.reflectiveCurveToRelative(56.0f, 17.94f, 56.0f, 40.0f);
        pathBuilder.reflectiveCurveTo(158.88f, 168.0f, 128.0f, 168.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _vignette = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
