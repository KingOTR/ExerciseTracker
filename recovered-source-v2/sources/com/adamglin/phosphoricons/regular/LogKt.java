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

/* compiled from: Log.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Log", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getLog", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_log", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LogKt {
    private static ImageVector _log;

    public static final ImageVector getLog(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(212.0f, 136.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 212.0f, 136.0f);
        pathBuilder.close();
        pathBuilder.moveTo(248.0f, 136.0f);
        pathBuilder.curveToRelative(0.0f, 40.37f, -21.08f, 72.0f, -48.0f, 72.0f);
        pathBuilder.lineTo(56.0f, 208.0f);
        pathBuilder.curveToRelative(-26.92f, 0.0f, -48.0f, -31.63f, -48.0f, -72.0f);
        pathBuilder.reflectiveCurveTo(29.08f, 64.0f, 56.0f, 64.0f);
        pathBuilder.lineTo(92.69f, 64.0f);
        pathBuilder.lineToRelative(37.65f, -37.66f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 136.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder.lineTo(139.31f, 40.0f);
        pathBuilder.lineToRelative(-24.0f, 24.0f);
        pathBuilder.lineTo(200.0f, 64.0f);
        pathBuilder.curveTo(226.92f, 64.0f, 248.0f, 95.63f, 248.0f, 136.0f);
        pathBuilder.close();
        pathBuilder.moveTo(56.0f, 192.0f);
        pathBuilder.lineTo(169.51f, 192.0f);
        pathBuilder.arcToRelative(73.46f, 73.46f, 0.0f, false, true, -12.67f, -24.0f);
        pathBuilder.lineTo(80.0f, 168.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder.horizontalLineToRelative(73.16f);
        pathBuilder.arcTo(110.63f, 110.63f, 0.0f, false, true, 152.0f, 136.0f);
        pathBuilder.curveToRelative(0.0f, -22.86f, 6.76f, -42.9f, 17.51f, -56.0f);
        pathBuilder.lineTo(56.0f, 80.0f);
        pathBuilder.curveToRelative(-12.47f, 0.0f, -23.55f, 13.26f, -28.8f, 32.0f);
        pathBuilder.lineTo(104.0f, 112.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder.lineTo(24.35f, 128.0f);
        pathBuilder.quadToRelative(-0.34f, 3.93f, -0.35f, 8.0f);
        pathBuilder.curveTo(24.0f, 166.36f, 38.65f, 192.0f, 56.0f, 192.0f);
        pathBuilder.close();
        pathBuilder.moveTo(232.0f, 136.0f);
        pathBuilder.curveToRelative(0.0f, -30.36f, -14.65f, -56.0f, -32.0f, -56.0f);
        pathBuilder.reflectiveCurveToRelative(-32.0f, 25.64f, -32.0f, 56.0f);
        pathBuilder.reflectiveCurveToRelative(14.65f, 56.0f, 32.0f, 56.0f);
        pathBuilder.reflectiveCurveTo(232.0f, 166.36f, 232.0f, 136.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _log = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
