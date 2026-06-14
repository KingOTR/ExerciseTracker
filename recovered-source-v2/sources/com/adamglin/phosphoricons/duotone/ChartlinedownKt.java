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

/* compiled from: Chartlinedown.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ChartLineDown", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getChartLineDown", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_chartLineDown", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChartlinedownKt {
    private static ImageVector _chartLineDown;

    public static final ImageVector getChartLineDown(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(224.0f, 64.0f);
        pathBuilder.verticalLineTo(208.0f);
        pathBuilder.horizontalLineTo(32.0f);
        pathBuilder.verticalLineTo(48.0f);
        pathBuilder.horizontalLineTo(208.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 64.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(232.0f, 208.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder2.horizontalLineTo(32.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f);
        pathBuilder2.verticalLineTo(48.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder2.verticalLineTo(60.69f);
        pathBuilder2.lineToRelative(56.0f, 56.0f);
        pathBuilder2.lineToRelative(26.34f, -26.35f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 0.0f);
        pathBuilder2.lineTo(192.0f, 148.69f);
        pathBuilder2.verticalLineTo(128.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder2.verticalLineToRelative(40.0f);
        pathBuilder2.arcToRelative(7.0f, 7.0f, 0.0f, false, true, 0.0f, 0.8f);
        pathBuilder2.curveToRelative(0.0f, 0.11f, 0.0f, 0.21f, -0.05f, 0.32f);
        pathBuilder2.reflectiveCurveToRelative(0.0f, 0.3f, -0.07f, 0.46f);
        pathBuilder2.arcToRelative(2.83f, 2.83f, 0.0f, false, true, -0.09f, 0.37f);
        pathBuilder2.curveToRelative(0.0f, 0.13f, -0.06f, 0.26f, -0.1f, 0.39f);
        pathBuilder2.reflectiveCurveToRelative(-0.08f, 0.23f, -0.12f, 0.35f);
        pathBuilder2.lineToRelative(-0.14f, 0.39f);
        pathBuilder2.lineToRelative(-0.15f, 0.31f);
        pathBuilder2.curveToRelative(-0.06f, 0.13f, -0.12f, 0.27f, -0.19f, 0.4f);
        pathBuilder2.reflectiveCurveToRelative(-0.11f, 0.18f, -0.16f, 0.28f);
        pathBuilder2.lineToRelative(-0.24f, 0.39f);
        pathBuilder2.lineToRelative(-0.21f, 0.28f);
        pathBuilder2.lineToRelative(-0.26f, 0.35f);
        pathBuilder2.curveToRelative(-0.11f, 0.14f, -0.24f, 0.27f, -0.36f, 0.4f);
        pathBuilder2.lineToRelative(-0.16f, 0.18f);
        pathBuilder2.lineToRelative(-0.17f, 0.15f);
        pathBuilder2.arcToRelative(4.83f, 4.83f, 0.0f, false, true, -0.42f, 0.37f);
        pathBuilder2.arcToRelative(3.92f, 3.92f, 0.0f, false, true, -0.32f, 0.25f);
        pathBuilder2.lineToRelative(-0.3f, 0.22f);
        pathBuilder2.lineToRelative(-0.38f, 0.23f);
        pathBuilder2.arcToRelative(2.91f, 2.91f, 0.0f, false, true, -0.3f, 0.17f);
        pathBuilder2.lineToRelative(-0.37f, 0.19f);
        pathBuilder2.lineToRelative(-0.34f, 0.15f);
        pathBuilder2.lineToRelative(-0.36f, 0.13f);
        pathBuilder2.arcToRelative(2.84f, 2.84f, 0.0f, false, true, -0.38f, 0.13f);
        pathBuilder2.lineToRelative(-0.36f, 0.1f);
        pathBuilder2.curveToRelative(-0.14f, 0.0f, -0.26f, 0.07f, -0.4f, 0.09f);
        pathBuilder2.lineToRelative(-0.42f, 0.07f);
        pathBuilder2.lineToRelative(-0.35f, 0.05f);
        pathBuilder2.arcToRelative(7.0f, 7.0f, 0.0f, false, true, -0.79f, 0.0f);
        pathBuilder2.horizontalLineTo(160.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder2.horizontalLineToRelative(20.69f);
        pathBuilder2.lineTo(128.0f, 107.31f);
        pathBuilder2.lineToRelative(-26.34f, 26.35f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f);
        pathBuilder2.lineTo(40.0f, 83.31f);
        pathBuilder2.verticalLineTo(200.0f);
        pathBuilder2.horizontalLineTo(224.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 208.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _chartLineDown = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
