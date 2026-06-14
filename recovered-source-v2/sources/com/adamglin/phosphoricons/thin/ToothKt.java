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

/* compiled from: Tooth.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Tooth", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getTooth", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_tooth", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ToothKt {
    private static ImageVector _tooth;

    public static final ImageVector getTooth(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(169.49f, 67.71f);
        pathBuilder.lineTo(138.77f, 80.0f);
        pathBuilder.lineToRelative(30.72f, 12.28f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 168.0f, 100.0f);
        pathBuilder.arcToRelative(3.91f, 3.91f, 0.0f, false, true, -1.49f, -0.29f);
        pathBuilder.lineTo(128.0f, 84.31f);
        pathBuilder.lineTo(89.49f, 99.71f);
        pathBuilder.arcTo(3.91f, 3.91f, 0.0f, false, true, 88.0f, 100.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.49f, -7.72f);
        pathBuilder.lineTo(117.23f, 80.0f);
        pathBuilder.lineTo(86.51f, 67.71f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.0f, -7.43f);
        pathBuilder.lineTo(128.0f, 75.69f);
        pathBuilder.lineToRelative(38.51f, -15.41f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.0f, 7.43f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 79.71f);
        pathBuilder.curveToRelative(0.07f, 71.08f, -23.16f, 130.07f, -45.65f, 146.05f);
        pathBuilder.arcToRelative(11.74f, 11.74f, 0.0f, false, true, -11.93f, 1.0f);
        pathBuilder.arcToRelative(11.91f, 11.91f, 0.0f, false, true, -6.9f, -10.0f);
        pathBuilder.curveTo(154.35f, 200.93f, 149.33f, 164.0f, 128.0f, 164.0f);
        pathBuilder.reflectiveCurveToRelative(-26.35f, 36.94f, -27.52f, 52.82f);
        pathBuilder.arcToRelative(12.11f, 12.11f, 0.0f, false, true, -12.0f, 11.19f);
        pathBuilder.arcToRelative(11.77f, 11.77f, 0.0f, false, true, -6.83f, -2.2f);
        pathBuilder.curveToRelative(-22.49f, -16.0f, -45.72f, -75.0f, -45.65f, -146.0f);
        pathBuilder.arcTo(52.0f, 52.0f, 0.0f, false, true, 88.0f, 28.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcTo(52.0f, 52.0f, 0.0f, false, true, 220.0f, 79.75f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 79.71f);
        pathBuilder.arcTo(44.0f, 44.0f, 0.0f, false, false, 168.0f, 36.0f);
        pathBuilder.lineTo(88.0f, 36.0f);
        pathBuilder.arcTo(44.0f, 44.0f, 0.0f, false, false, 44.0f, 79.76f);
        pathBuilder.curveToRelative(-0.07f, 67.58f, 21.9f, 125.0f, 42.29f, 139.51f);
        pathBuilder.arcToRelative(3.77f, 3.77f, 0.0f, false, false, 3.89f, 0.33f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.32f, -3.37f);
        pathBuilder.curveTo(95.36f, 177.39f, 108.0f, 156.0f, 128.0f, 156.0f);
        pathBuilder.reflectiveCurveToRelative(32.64f, 21.4f, 35.5f, 60.24f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.32f, 3.37f);
        pathBuilder.arcToRelative(3.77f, 3.77f, 0.0f, false, false, 3.89f, -0.33f);
        pathBuilder.curveTo(190.1f, 204.8f, 212.07f, 147.34f, 212.0f, 79.76f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _tooth = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
