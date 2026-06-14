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

/* compiled from: Windmill.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Windmill", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getWindmill", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_windmill", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WindmillKt {
    private static ImageVector _windmill;

    public static final ImageVector getWindmill(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _windmill;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Windmill", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(232.0f, 231.47f);
        pathBuilder.arcToRelative(8.17f, 8.17f, 0.0f, false, false, -8.25f, -7.47f);
        pathBuilder.horizontalLineTo(182.94f);
        pathBuilder.lineToRelative(-6.3f, -44.12f);
        pathBuilder.lineToRelative(3.24f, 1.91f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 21.91f, -5.67f);
        pathBuilder.lineToRelative(11.81f, -20.0f);
        pathBuilder.arcToRelative(16.49f, 16.49f, 0.0f, false, false, 2.11f, -11.49f);
        pathBuilder.arcToRelative(15.92f, 15.92f, 0.0f, false, false, -7.6f, -10.74f);
        pathBuilder.lineTo(148.93f, 99.0f);
        pathBuilder.arcToRelative(8.18f, 8.18f, 0.0f, false, true, -3.33f, -10.63f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.21f, -3.3f);
        pathBuilder.lineToRelative(20.95f, 12.33f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 183.24f, 96.0f);
        pathBuilder.lineToRelative(30.55f, -51.9f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -5.67f, -21.92f);
        pathBuilder.lineToRelative(-20.34f, -12.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -21.91f, 5.67f);
        pathBuilder.lineToRelative(-35.0f, 59.42f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.79f, 2.27f);
        pathBuilder.arcTo(8.13f, 8.13f, 0.0f, false, true, 117.21f, 67.0f);
        pathBuilder.lineToRelative(12.23f, -20.78f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 128.0f, 40.76f);
        pathBuilder.lineTo(76.12f, 10.22f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -21.91f, 5.67f);
        pathBuilder.lineToRelative(-11.81f, 20.0f);
        pathBuilder.arcToRelative(16.47f, 16.47f, 0.0f, false, false, -2.11f, 11.48f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 7.6f, 10.75f);
        pathBuilder.lineTo(107.08f, 93.0f);
        pathBuilder.arcToRelative(8.16f, 8.16f, 0.0f, false, true, 3.47f, 10.3f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.36f, 3.62f);
        pathBuilder.lineToRelative(-21.0f, -12.34f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 72.76f, 96.0f);
        pathBuilder.lineToRelative(-30.55f, 51.9f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 5.67f, 21.91f);
        pathBuilder.lineToRelative(20.34f, 12.0f);
        pathBuilder.arcToRelative(15.57f, 15.57f, 0.0f, false, false, 10.58f, 2.0f);
        pathBuilder.lineTo(73.06f, 224.0f);
        pathBuilder.horizontalLineTo(32.27f);
        pathBuilder.arcTo(8.17f, 8.17f, 0.0f, false, false, 24.0f, 231.47f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 32.0f, 240.0f);
        pathBuilder.horizontalLineTo(224.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 232.0f, 231.47f);
        pathBuilder.close();
        pathBuilder.moveTo(89.22f, 224.0f);
        pathBuilder.lineTo(98.0f, 162.8f);
        pathBuilder.lineToRelative(12.77f, -21.7f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineTo(125.0f, 116.93f);
        pathBuilder.arcToRelative(8.18f, 8.18f, 0.0f, false, true, 10.62f, -3.33f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.3f, 11.21f);
        pathBuilder.lineToRelative(-12.33f, 21.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.42f, 5.47f);
        pathBuilder.lineToRelative(31.0f, 18.25f);
        pathBuilder.lineTo(166.78f, 224.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _windmill = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
