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

/* compiled from: Axe.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Axe", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getAxe", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_axe", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AxeKt {
    private static ImageVector _axe;

    public static final ImageVector getAxe(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _axe;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Axe", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(255.15f, 97.72f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 242.0f, 86.94f);
        pathBuilder.arcToRelative(136.46f, 136.46f, 0.0f, false, true, -51.65f, -18.0f);
        pathBuilder.lineToRelative(10.31f, -10.3f);
        pathBuilder.arcToRelative(25.0f, 25.0f, 0.0f, false, false, -35.32f, -35.32f);
        pathBuilder.lineToRelative(-13.2f, 13.21f);
        pathBuilder.curveToRelative(-2.33f, -2.8f, -3.81f, -4.84f, -4.41f, -5.69f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -24.41f, -2.15f);
        pathBuilder.lineTo(84.68f, 67.36f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 2.14f, 24.4f);
        pathBuilder.curveToRelative(0.86f, 0.6f, 2.9f, 2.08f, 5.7f, 4.41f);
        pathBuilder.lineTo(7.31f, 181.37f);
        pathBuilder.arcToRelative(25.0f, 25.0f, 0.0f, false, false, 35.32f, 35.32f);
        pathBuilder.lineToRelative(82.3f, -82.31f);
        pathBuilder.arcToRelative(136.63f, 136.63f, 0.0f, false, true, 18.0f, 51.65f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 10.77f, 13.12f);
        pathBuilder.arcToRelative(16.21f, 16.21f, 0.0f, false, false, 5.15f, 0.85f);
        pathBuilder.arcToRelative(15.88f, 15.88f, 0.0f, false, false, 11.26f, -4.69f);
        pathBuilder.lineToRelative(81.18f, -81.19f);
        pathBuilder.arcTo(15.86f, 15.86f, 0.0f, false, false, 255.15f, 97.72f);
        pathBuilder.close();
        pathBuilder.moveTo(176.69f, 34.63f);
        pathBuilder.arcToRelative(9.0f, 9.0f, 0.0f, true, true, 12.68f, 12.68f);
        pathBuilder.lineTo(176.82f, 59.86f);
        pathBuilder.arcTo(152.5f, 152.5f, 0.0f, false, true, 163.1f, 48.21f);
        pathBuilder.close();
        pathBuilder.moveTo(31.31f, 205.37f);
        pathBuilder.arcToRelative(9.0f, 9.0f, 0.0f, true, true, -12.68f, -12.68f);
        pathBuilder.lineToRelative(85.58f, -85.58f);
        pathBuilder.arcToRelative(150.89f, 150.89f, 0.0f, false, true, 11.65f, 13.71f);
        pathBuilder.close();
        pathBuilder.moveTo(158.8f, 183.92f);
        pathBuilder.curveTo(150.0f, 118.29f, 101.52f, 82.52f, 96.0f, 78.67f);
        pathBuilder.lineTo(134.66f, 40.0f);
        pathBuilder.curveToRelative(3.86f, 5.5f, 39.63f, 54.0f, 105.25f, 62.78f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _axe = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
