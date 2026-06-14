package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Scales.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Scales", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getScales", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_scales", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScalesKt {
    private static ImageVector _scales;

    public static final ImageVector getScales(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _scales;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Scales", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(239.43f, 133.0f);
        pathBuilder.lineToRelative(-32.0f, -80.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 200.0f, 48.0f);
        pathBuilder.arcToRelative(8.27f, 8.27f, 0.0f, false, false, -1.73f, 0.21f);
        pathBuilder.lineTo(136.0f, 62.0f);
        pathBuilder.lineTo(136.0f, 40.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder.lineTo(120.0f, 65.58f);
        pathBuilder.lineTo(54.27f, 80.21f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 48.57f, 85.0f);
        pathBuilder.lineToRelative(-32.0f, 80.0f);
        pathBuilder.arcToRelative(7.92f, 7.92f, 0.0f, false, false, -0.57f, 3.0f);
        pathBuilder.curveToRelative(0.0f, 23.31f, 24.54f, 32.0f, 40.0f, 32.0f);
        pathBuilder.reflectiveCurveToRelative(40.0f, -8.69f, 40.0f, -32.0f);
        pathBuilder.arcToRelative(7.92f, 7.92f, 0.0f, false, false, -0.57f, -3.0f);
        pathBuilder.lineTo(66.92f, 93.77f);
        pathBuilder.lineTo(120.0f, 82.0f);
        pathBuilder.lineTo(120.0f, 208.0f);
        pathBuilder.lineTo(104.0f, 208.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.lineTo(136.0f, 208.0f);
        pathBuilder.lineTo(136.0f, 78.42f);
        pathBuilder.lineTo(187.0f, 67.1f);
        pathBuilder.lineTo(160.57f, 133.0f);
        pathBuilder.arcToRelative(7.92f, 7.92f, 0.0f, false, false, -0.57f, 3.0f);
        pathBuilder.curveToRelative(0.0f, 23.31f, 24.54f, 32.0f, 40.0f, 32.0f);
        pathBuilder.reflectiveCurveToRelative(40.0f, -8.69f, 40.0f, -32.0f);
        pathBuilder.arcTo(7.92f, 7.92f, 0.0f, false, false, 239.43f, 133.0f);
        pathBuilder.close();
        pathBuilder.moveTo(79.43f, 168.0f);
        pathBuilder.lineTo(32.62f, 168.0f);
        pathBuilder.lineTo(56.0f, 109.54f);
        pathBuilder.close();
        pathBuilder.moveTo(176.67f, 136.0f);
        pathBuilder.lineTo(200.0f, 77.54f);
        pathBuilder.lineTo(223.38f, 136.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _scales = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
