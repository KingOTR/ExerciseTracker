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

/* compiled from: Pottedplant.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PottedPlant", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getPottedPlant", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pottedPlant", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PottedplantKt {
    private static ImageVector _pottedPlant;

    public static final ImageVector getPottedPlant(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _pottedPlant;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PottedPlant", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(200.0f, 144.0f);
        pathBuilder.horizontalLineToRelative(-76.7f);
        pathBuilder.lineToRelative(22.41f, -22.41f);
        pathBuilder.arcToRelative(59.55f, 59.55f, 0.0f, false, false, 26.1f, 6.36f);
        pathBuilder.arcToRelative(49.56f, 49.56f, 0.0f, false, false, 25.89f, -7.22f);
        pathBuilder.curveToRelative(23.72f, -14.36f, 36.43f, -47.6f, 34.0f, -88.92f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.52f, -7.52f);
        pathBuilder.curveToRelative(-41.32f, -2.43f, -74.56f, 10.28f, -88.93f, 34.0f);
        pathBuilder.curveToRelative(-9.35f, 15.45f, -9.59f, 34.11f, -0.86f, 52.0f);
        pathBuilder.lineTo(120.0f, 124.68f);
        pathBuilder.lineToRelative(-12.21f, -12.21f);
        pathBuilder.curveToRelative(6.0f, -13.25f, 5.57f, -27.0f, -1.39f, -38.48f);
        pathBuilder.curveTo(95.53f, 56.0f, 70.61f, 46.41f, 39.73f, 48.22f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.51f, 7.51f);
        pathBuilder.curveTo(30.4f, 86.6f, 40.0f, 111.52f, 58.0f, 122.4f);
        pathBuilder.arcTo(38.22f, 38.22f, 0.0f, false, false, 78.0f, 128.0f);
        pathBuilder.arcToRelative(45.0f, 45.0f, 0.0f, false, false, 18.52f, -4.19f);
        pathBuilder.lineTo(108.69f, 136.0f);
        pathBuilder.lineToRelative(-8.0f, 8.0f);
        pathBuilder.horizontalLineTo(56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(9.59f);
        pathBuilder.lineTo(78.8f, 219.47f);
        pathBuilder.arcTo(15.89f, 15.89f, 0.0f, false, false, 94.42f, 232.0f);
        pathBuilder.horizontalLineToRelative(67.17f);
        pathBuilder.arcToRelative(15.91f, 15.91f, 0.0f, false, false, 15.62f, -12.53f);
        pathBuilder.lineTo(190.42f, 160.0f);
        pathBuilder.horizontalLineTo(200.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pottedPlant = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
