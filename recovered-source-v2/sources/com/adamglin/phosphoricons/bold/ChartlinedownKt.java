package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Chartlinedown.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ChartLineDown", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getChartLineDown", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_chartLineDown", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChartlinedownKt {
    private static ImageVector _chartLineDown;

    public static final ImageVector getChartLineDown(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _chartLineDown;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ChartLineDown", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(236.0f, 208.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f);
        pathBuilder.horizontalLineTo(32.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f);
        pathBuilder.verticalLineTo(48.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.verticalLineTo(59.0f);
        pathBuilder.lineToRelative(52.0f, 52.0f);
        pathBuilder.lineToRelative(23.51f, -23.52f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 0.0f);
        pathBuilder.lineTo(188.0f, 139.0f);
        pathBuilder.verticalLineTo(128.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.quadToRelative(0.0f, 0.6f, -0.06f, 1.2f);
        pathBuilder.curveToRelative(0.0f, 0.16f, -0.05f, 0.33f, -0.07f, 0.49f);
        pathBuilder.reflectiveCurveToRelative(-0.06f, 0.45f, -0.1f, 0.67f);
        pathBuilder.reflectiveCurveToRelative(-0.09f, 0.38f, -0.14f, 0.56f);
        pathBuilder.reflectiveCurveToRelative(-0.09f, 0.39f, -0.15f, 0.58f);
        pathBuilder.lineToRelative(-0.19f, 0.54f);
        pathBuilder.curveToRelative(-0.07f, 0.19f, -0.13f, 0.38f, -0.21f, 0.56f);
        pathBuilder.reflectiveCurveToRelative(-0.15f, 0.34f, -0.23f, 0.5f);
        pathBuilder.reflectiveCurveToRelative(-0.17f, 0.38f, -0.27f, 0.57f);
        pathBuilder.reflectiveCurveToRelative(-0.18f, 0.3f, -0.27f, 0.45f);
        pathBuilder.reflectiveCurveToRelative(-0.21f, 0.38f, -0.33f, 0.56f);
        pathBuilder.reflectiveCurveToRelative(-0.24f, 0.32f, -0.36f, 0.47f);
        pathBuilder.reflectiveCurveToRelative(-0.22f, 0.32f, -0.34f, 0.47f);
        pathBuilder.reflectiveCurveToRelative(-0.46f, 0.53f, -0.71f, 0.78f);
        pathBuilder.lineToRelative(-0.08f, 0.1f);
        pathBuilder.lineToRelative(-0.1f, 0.08f);
        pathBuilder.curveToRelative(-0.25f, 0.25f, -0.51f, 0.48f, -0.78f, 0.71f);
        pathBuilder.lineToRelative(-0.46f, 0.34f);
        pathBuilder.curveToRelative(-0.16f, 0.12f, -0.32f, 0.25f, -0.48f, 0.36f);
        pathBuilder.reflectiveCurveToRelative(-0.37f, 0.22f, -0.55f, 0.33f);
        pathBuilder.reflectiveCurveToRelative(-0.3f, 0.19f, -0.46f, 0.27f);
        pathBuilder.reflectiveCurveToRelative(-0.37f, 0.18f, -0.56f, 0.27f);
        pathBuilder.reflectiveCurveToRelative(-0.33f, 0.16f, -0.51f, 0.23f);
        pathBuilder.lineToRelative(-0.54f, 0.21f);
        pathBuilder.lineToRelative(-0.57f, 0.19f);
        pathBuilder.arcToRelative(4.92f, 4.92f, 0.0f, false, true, -0.55f, 0.14f);
        pathBuilder.lineToRelative(-0.58f, 0.15f);
        pathBuilder.lineToRelative(-0.64f, 0.09f);
        pathBuilder.lineToRelative(-0.53f, 0.08f);
        pathBuilder.arcTo(11.51f, 11.51f, 0.0f, false, true, 200.0f, 180.0f);
        pathBuilder.horizontalLineTo(160.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f);
        pathBuilder.horizontalLineToRelative(11.0f);
        pathBuilder.lineToRelative(-43.0f, -43.0f);
        pathBuilder.lineToRelative(-23.51f, 23.52f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 0.0f);
        pathBuilder.lineTo(44.0f, 93.0f);
        pathBuilder.verticalLineTo(196.0f);
        pathBuilder.horizontalLineTo(224.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 236.0f, 208.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _chartLineDown = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
