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

/* compiled from: Bicycle.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Bicycle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getBicycle", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bicycle", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BicycleKt {
    private static ImageVector _bicycle;

    public static final ImageVector getBicycle(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _bicycle;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Bicycle", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(54.46f, 164.71f);
        pathBuilder.lineTo(82.33f, 126.5f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, true, true, -12.92f, -9.44f);
        pathBuilder.lineTo(41.54f, 155.29f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 12.92f, 9.42f);
        pathBuilder.close();
        pathBuilder.moveTo(208.0f, 112.0f);
        pathBuilder.arcToRelative(47.81f, 47.81f, 0.0f, false, false, -16.93f, 3.09f);
        pathBuilder.lineTo(214.91f, 156.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, true, 201.09f, 164.0f);
        pathBuilder.lineToRelative(-23.83f, -40.86f);
        pathBuilder.arcTo(48.0f, 48.0f, 0.0f, true, false, 208.0f, 112.0f);
        pathBuilder.close();
        pathBuilder.moveTo(165.93f, 72.0f);
        pathBuilder.horizontalLineTo(192.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, -24.0f);
        pathBuilder.horizontalLineTo(152.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.91f, 12.0f);
        pathBuilder.lineToRelative(11.65f, 20.0f);
        pathBuilder.horizontalLineTo(99.26f);
        pathBuilder.lineTo(82.91f, 60.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 76.0f, 56.0f);
        pathBuilder.horizontalLineTo(48.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.horizontalLineTo(71.41f);
        pathBuilder.lineTo(85.12f, 95.51f);
        pathBuilder.lineTo(69.41f, 117.06f);
        pathBuilder.arcToRelative(47.87f, 47.87f, 0.0f, false, true, 12.92f, 9.44f);
        pathBuilder.lineToRelative(11.59f, -15.9f);
        pathBuilder.lineTo(125.09f, 164.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, false, 138.91f, 156.0f);
        pathBuilder.lineToRelative(-30.32f, -52.0f);
        pathBuilder.horizontalLineToRelative(57.48f);
        pathBuilder.lineToRelative(11.19f, 19.17f);
        pathBuilder.arcToRelative(48.11f, 48.11f, 0.0f, false, true, 13.81f, -8.08f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bicycle = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
