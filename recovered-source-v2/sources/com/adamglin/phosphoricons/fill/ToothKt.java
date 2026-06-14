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

/* compiled from: Tooth.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Tooth", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getTooth", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_tooth", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ToothKt {
    private static ImageVector _tooth;

    public static final ImageVector getTooth(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _tooth;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Tooth", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(168.0f, 24.0f);
        pathBuilder.lineTo(88.0f, 24.0f);
        pathBuilder.arcTo(56.0f, 56.0f, 0.0f, false, false, 32.0f, 79.75f);
        pathBuilder.curveToRelative(0.0f, 42.72f, 8.0f, 75.4f, 14.7f, 95.28f);
        pathBuilder.curveToRelative(8.72f, 25.8f, 20.62f, 45.49f, 32.64f, 54.0f);
        pathBuilder.arcTo(15.67f, 15.67f, 0.0f, false, false, 88.47f, 232.0f);
        pathBuilder.arcToRelative(16.09f, 16.09f, 0.0f, false, false, 16.0f, -14.9f);
        pathBuilder.curveToRelative(0.85f, -11.52f, 5.0f, -49.11f, 23.53f, -49.11f);
        pathBuilder.reflectiveCurveToRelative(22.68f, 37.59f, 23.53f, 49.11f);
        pathBuilder.arcToRelative(16.09f, 16.09f, 0.0f, false, false, 9.18f, 13.36f);
        pathBuilder.arcToRelative(15.69f, 15.69f, 0.0f, false, false, 15.95f, -1.41f);
        pathBuilder.curveToRelative(12.0f, -8.53f, 23.92f, -28.22f, 32.64f, -54.0f);
        pathBuilder.curveTo(216.0f, 155.15f, 224.0f, 122.47f, 224.0f, 79.75f);
        pathBuilder.arcTo(56.0f, 56.0f, 0.0f, false, false, 168.0f, 24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(171.0f, 80.57f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, true, 165.0f, 95.42f);
        pathBuilder.lineTo(128.0f, 80.61f);
        pathBuilder.lineTo(91.0f, 95.42f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, true, 85.0f, 80.57f);
        pathBuilder.lineTo(106.46f, 72.0f);
        pathBuilder.lineTo(85.0f, 63.42f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, true, 91.0f, 48.57f);
        pathBuilder.lineToRelative(37.0f, 14.81f);
        pathBuilder.lineToRelative(37.0f, -14.81f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, true, 171.0f, 63.42f);
        pathBuilder.lineTo(149.54f, 72.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _tooth = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
