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

/* compiled from: Binary.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Binary", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getBinary", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_binary", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BinaryKt {
    private static ImageVector _binary;

    public static final ImageVector getBinary(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _binary;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Binary", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(94.0f, 28.0f);
        pathBuilder.curveToRelative(-10.92f, 0.0f, -19.93f, 5.0f, -26.08f, 14.31f);
        pathBuilder.curveTo(62.81f, 50.09f, 60.0f, 60.64f, 60.0f, 72.0f);
        pathBuilder.reflectiveCurveToRelative(2.81f, 21.91f, 7.92f, 29.7f);
        pathBuilder.curveTo(74.07f, 111.05f, 83.08f, 116.0f, 94.0f, 116.0f);
        pathBuilder.reflectiveCurveToRelative(19.93f, -5.0f, 26.08f, -14.3f);
        pathBuilder.curveTo(125.19f, 93.91f, 128.0f, 83.37f, 128.0f, 72.0f);
        pathBuilder.reflectiveCurveToRelative(-2.81f, -21.91f, -7.92f, -29.69f);
        pathBuilder.curveTo(113.93f, 33.0f, 104.92f, 28.0f, 94.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(94.0f, 108.0f);
        pathBuilder.curveToRelative(-18.0f, 0.0f, -26.0f, -18.08f, -26.0f, -36.0f);
        pathBuilder.reflectiveCurveToRelative(8.0f, -36.0f, 26.0f, -36.0f);
        pathBuilder.reflectiveCurveToRelative(26.0f, 18.08f, 26.0f, 36.0f);
        pathBuilder.reflectiveCurveTo(112.0f, 108.0f, 94.0f, 108.0f);
        pathBuilder.close();
        pathBuilder.moveTo(192.08f, 154.31f);
        pathBuilder.curveTo(185.93f, 145.0f, 176.92f, 140.0f, 166.0f, 140.0f);
        pathBuilder.reflectiveCurveToRelative(-19.93f, 4.95f, -26.08f, 14.31f);
        pathBuilder.curveTo(134.81f, 162.09f, 132.0f, 172.64f, 132.0f, 184.0f);
        pathBuilder.reflectiveCurveToRelative(2.81f, 21.91f, 7.92f, 29.7f);
        pathBuilder.curveToRelative(6.15f, 9.35f, 15.16f, 14.3f, 26.08f, 14.3f);
        pathBuilder.reflectiveCurveToRelative(19.93f, -4.95f, 26.08f, -14.3f);
        pathBuilder.curveToRelative(5.11f, -7.79f, 7.92f, -18.33f, 7.92f, -29.7f);
        pathBuilder.reflectiveCurveTo(197.19f, 162.09f, 192.08f, 154.31f);
        pathBuilder.close();
        pathBuilder.moveTo(166.0f, 220.0f);
        pathBuilder.curveToRelative(-18.0f, 0.0f, -26.0f, -18.08f, -26.0f, -36.0f);
        pathBuilder.reflectiveCurveToRelative(8.0f, -36.0f, 26.0f, -36.0f);
        pathBuilder.reflectiveCurveToRelative(26.0f, 18.08f, 26.0f, 36.0f);
        pathBuilder.reflectiveCurveTo(184.0f, 220.0f, 166.0f, 220.0f);
        pathBuilder.close();
        pathBuilder.moveTo(148.5f, 47.28f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.56f, -5.44f);
        pathBuilder.lineToRelative(24.0f, -13.34f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 180.0f, 32.0f);
        pathBuilder.verticalLineToRelative(80.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.lineTo(172.0f, 38.8f);
        pathBuilder.lineToRelative(-18.06f, 10.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 148.5f, 47.28f);
        pathBuilder.close();
        pathBuilder.moveTo(100.0f, 144.0f);
        pathBuilder.verticalLineToRelative(80.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.lineTo(92.0f, 150.8f);
        pathBuilder.lineToRelative(-18.06f, 10.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -3.88f, -7.0f);
        pathBuilder.lineToRelative(24.0f, -13.34f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 100.0f, 144.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _binary = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
