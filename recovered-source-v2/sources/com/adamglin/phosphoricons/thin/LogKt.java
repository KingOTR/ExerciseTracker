package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Log.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Log", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getLog", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_log", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LogKt {
    private static ImageVector _log;

    public static final ImageVector getLog(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _log;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Log", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 136.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 208.0f, 136.0f);
        pathBuilder.close();
        pathBuilder.moveTo(244.0f, 136.0f);
        pathBuilder.curveToRelative(0.0f, 17.83f, -4.38f, 34.66f, -12.32f, 47.38f);
        pathBuilder.curveTo(223.36f, 196.67f, 212.11f, 204.0f, 200.0f, 204.0f);
        pathBuilder.lineTo(56.0f, 204.0f);
        pathBuilder.curveToRelative(-12.11f, 0.0f, -23.36f, -7.33f, -31.68f, -20.62f);
        pathBuilder.curveTo(16.38f, 170.66f, 12.0f, 153.83f, 12.0f, 136.0f);
        pathBuilder.reflectiveCurveToRelative(4.38f, -34.66f, 12.32f, -47.38f);
        pathBuilder.curveTo(32.64f, 75.33f, 43.89f, 68.0f, 56.0f, 68.0f);
        pathBuilder.lineTo(94.34f, 68.0f);
        pathBuilder.lineToRelative(38.83f, -38.83f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 136.0f, 28.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f);
        pathBuilder.lineTo(137.66f, 36.0f);
        pathBuilder.lineToRelative(-32.0f, 32.0f);
        pathBuilder.lineTo(200.0f, 68.0f);
        pathBuilder.curveToRelative(12.11f, 0.0f, 23.36f, 7.33f, 31.68f, 20.62f);
        pathBuilder.curveTo(239.62f, 101.34f, 244.0f, 118.17f, 244.0f, 136.0f);
        pathBuilder.close();
        pathBuilder.moveTo(179.13f, 196.0f);
        pathBuilder.arcToRelative(52.15f, 52.15f, 0.0f, false, true, -10.81f, -12.62f);
        pathBuilder.arcTo(77.0f, 77.0f, 0.0f, false, true, 159.85f, 164.0f);
        pathBuilder.lineTo(80.0f, 164.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f);
        pathBuilder.horizontalLineToRelative(77.91f);
        pathBuilder.arcTo(104.53f, 104.53f, 0.0f, false, true, 156.0f, 136.0f);
        pathBuilder.curveToRelative(0.0f, -17.83f, 4.38f, -34.66f, 12.32f, -47.38f);
        pathBuilder.arcTo(52.15f, 52.15f, 0.0f, false, true, 179.13f, 76.0f);
        pathBuilder.lineTo(56.0f, 76.0f);
        pathBuilder.curveToRelative(-15.64f, 0.0f, -29.0f, 16.72f, -33.94f, 40.0f);
        pathBuilder.lineTo(104.0f, 116.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f);
        pathBuilder.lineTo(20.72f, 124.0f);
        pathBuilder.arcTo(99.83f, 99.83f, 0.0f, false, false, 20.0f, 136.0f);
        pathBuilder.curveToRelative(0.0f, 33.08f, 16.15f, 60.0f, 36.0f, 60.0f);
        pathBuilder.close();
        pathBuilder.moveTo(236.0f, 136.0f);
        pathBuilder.curveToRelative(0.0f, -33.08f, -16.15f, -60.0f, -36.0f, -60.0f);
        pathBuilder.reflectiveCurveToRelative(-36.0f, 26.92f, -36.0f, 60.0f);
        pathBuilder.reflectiveCurveToRelative(16.15f, 60.0f, 36.0f, 60.0f);
        pathBuilder.reflectiveCurveTo(236.0f, 169.08f, 236.0f, 136.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _log = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
