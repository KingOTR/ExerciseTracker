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

/* compiled from: Log.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Log", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getLog", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_log", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LogKt {
    private static ImageVector _log;

    public static final ImageVector getLog(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(210.0f, 136.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 210.0f, 136.0f);
        pathBuilder.close();
        pathBuilder.moveTo(246.0f, 136.0f);
        pathBuilder.curveToRelative(0.0f, 18.21f, -4.48f, 35.41f, -12.63f, 48.43f);
        pathBuilder.curveTo(224.68f, 198.34f, 212.83f, 206.0f, 200.0f, 206.0f);
        pathBuilder.lineTo(56.0f, 206.0f);
        pathBuilder.curveToRelative(-12.83f, 0.0f, -24.68f, -7.66f, -33.37f, -21.57f);
        pathBuilder.curveTo(14.48f, 171.41f, 10.0f, 154.21f, 10.0f, 136.0f);
        pathBuilder.reflectiveCurveToRelative(4.48f, -35.41f, 12.63f, -48.43f);
        pathBuilder.curveTo(31.32f, 73.66f, 43.17f, 66.0f, 56.0f, 66.0f);
        pathBuilder.lineTo(93.52f, 66.0f);
        pathBuilder.lineToRelative(38.24f, -38.24f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 136.0f, 26.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f);
        pathBuilder.lineTo(138.49f, 38.0f);
        pathBuilder.lineToRelative(-28.0f, 28.0f);
        pathBuilder.lineTo(200.0f, 66.0f);
        pathBuilder.curveToRelative(12.83f, 0.0f, 24.68f, 7.66f, 33.37f, 21.57f);
        pathBuilder.curveTo(241.52f, 100.59f, 246.0f, 117.79f, 246.0f, 136.0f);
        pathBuilder.close();
        pathBuilder.moveTo(174.0f, 194.0f);
        pathBuilder.arcToRelative(57.72f, 57.72f, 0.0f, false, true, -7.4f, -9.57f);
        pathBuilder.arcTo(78.09f, 78.09f, 0.0f, false, true, 158.36f, 166.0f);
        pathBuilder.lineTo(80.0f, 166.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.horizontalLineToRelative(75.52f);
        pathBuilder.arcTo(106.2f, 106.2f, 0.0f, false, true, 154.0f, 136.0f);
        pathBuilder.curveToRelative(0.0f, -18.21f, 4.48f, -35.41f, 12.63f, -48.43f);
        pathBuilder.arcTo(57.72f, 57.72f, 0.0f, false, true, 174.0f, 78.0f);
        pathBuilder.lineTo(56.0f, 78.0f);
        pathBuilder.curveToRelative(-13.89f, 0.0f, -26.16f, 15.1f, -31.36f, 36.0f);
        pathBuilder.lineTo(104.0f, 114.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f);
        pathBuilder.lineTo(22.54f, 126.0f);
        pathBuilder.arcTo(93.69f, 93.69f, 0.0f, false, false, 22.0f, 136.0f);
        pathBuilder.curveToRelative(0.0f, 31.44f, 15.57f, 58.0f, 34.0f, 58.0f);
        pathBuilder.close();
        pathBuilder.moveTo(234.0f, 136.0f);
        pathBuilder.curveToRelative(0.0f, -31.44f, -15.57f, -58.0f, -34.0f, -58.0f);
        pathBuilder.reflectiveCurveToRelative(-34.0f, 26.56f, -34.0f, 58.0f);
        pathBuilder.reflectiveCurveToRelative(15.57f, 58.0f, 34.0f, 58.0f);
        pathBuilder.reflectiveCurveTo(234.0f, 167.44f, 234.0f, 136.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _log = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
