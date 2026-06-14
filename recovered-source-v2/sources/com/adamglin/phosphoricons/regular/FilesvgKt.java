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

/* compiled from: Filesvg.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FileSvg", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getFileSvg", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fileSvg", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FilesvgKt {
    private static ImageVector _fileSvg;

    public static final ImageVector getFileSvg(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _fileSvg;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FileSvg", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(87.82f, 196.31f);
        pathBuilder.arcToRelative(20.82f, 20.82f, 0.0f, false, true, -9.19f, 15.23f);
        pathBuilder.curveTo(73.44f, 215.0f, 67.0f, 216.0f, 61.14f, 216.0f);
        pathBuilder.arcTo(61.23f, 61.23f, 0.0f, false, true, 46.0f, 214.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.3f, -15.41f);
        pathBuilder.curveToRelative(4.38f, 1.2f, 14.95f, 2.7f, 19.55f, -0.36f);
        pathBuilder.curveToRelative(0.88f, -0.59f, 1.83f, -1.52f, 2.14f, -3.93f);
        pathBuilder.curveToRelative(0.35f, -2.67f, -0.71f, -4.1f, -12.78f, -7.59f);
        pathBuilder.curveToRelative(-9.35f, -2.7f, -25.0f, -7.23f, -23.0f, -23.11f);
        pathBuilder.arcToRelative(20.55f, 20.55f, 0.0f, false, true, 9.0f, -14.95f);
        pathBuilder.curveToRelative(11.84f, -8.0f, 30.72f, -3.31f, 32.83f, -2.76f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.07f, 15.48f);
        pathBuilder.curveToRelative(-4.48f, -1.17f, -15.23f, -2.56f, -19.83f, 0.56f);
        pathBuilder.arcToRelative(4.54f, 4.54f, 0.0f, false, false, -2.0f, 3.67f);
        pathBuilder.curveToRelative(-0.11f, 0.9f, -0.14f, 1.09f, 1.12f, 1.9f);
        pathBuilder.curveToRelative(2.31f, 1.49f, 6.44f, 2.68f, 10.45f, 3.84f);
        pathBuilder.curveTo(73.5f, 174.17f, 90.06f, 179.0f, 87.82f, 196.31f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 88.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.lineTo(200.0f, 96.0f);
        pathBuilder.lineTo(152.0f, 96.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f);
        pathBuilder.lineTo(144.0f, 40.0f);
        pathBuilder.lineTo(56.0f, 40.0f);
        pathBuilder.verticalLineToRelative(72.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -16.0f, 0.0f);
        pathBuilder.lineTo(40.0f, 40.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.65f, 2.34f);
        pathBuilder.lineToRelative(56.0f, 56.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 88.0f);
        pathBuilder.close();
        pathBuilder.moveTo(160.0f, 80.0f);
        pathBuilder.horizontalLineToRelative(28.69f);
        pathBuilder.lineTo(160.0f, 51.31f);
        pathBuilder.close();
        pathBuilder.moveTo(146.7f, 144.47f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.23f, 4.84f);
        pathBuilder.lineTo(124.0f, 184.21f);
        pathBuilder.lineToRelative(-12.47f, -34.9f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -15.06f, 5.38f);
        pathBuilder.lineToRelative(20.0f, 56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 15.07f, 0.0f);
        pathBuilder.lineToRelative(20.0f, -56.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 146.7f, 144.47f);
        pathBuilder.close();
        pathBuilder.moveTo(208.0f, 176.0f);
        pathBuilder.horizontalLineToRelative(-8.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.verticalLineToRelative(5.29f);
        pathBuilder.arcToRelative(13.38f, 13.38f, 0.0f, false, true, -8.0f, 2.71f);
        pathBuilder.curveToRelative(-8.82f, 0.0f, -16.0f, -9.0f, -16.0f, -20.0f);
        pathBuilder.reflectiveCurveToRelative(7.18f, -20.0f, 16.0f, -20.0f);
        pathBuilder.arcToRelative(13.27f, 13.27f, 0.0f, false, true, 7.53f, 2.38f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.95f, -13.26f);
        pathBuilder.arcTo(29.38f, 29.38f, 0.0f, false, false, 192.0f, 144.0f);
        pathBuilder.curveToRelative(-17.64f, 0.0f, -32.0f, 16.15f, -32.0f, 36.0f);
        pathBuilder.reflectiveCurveToRelative(14.36f, 36.0f, 32.0f, 36.0f);
        pathBuilder.arcToRelative(30.06f, 30.06f, 0.0f, false, false, 21.78f, -9.6f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.22f, -5.53f);
        pathBuilder.lineTo(216.0f, 184.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 176.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fileSvg = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
