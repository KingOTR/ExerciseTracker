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

/* compiled from: Baseballcap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BaseballCap", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getBaseballCap", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_baseballCap", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BaseballcapKt {
    private static ImageVector _baseballCap;

    public static final ImageVector getBaseballCap(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _baseballCap;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("BaseballCap", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(104.12f, 104.12f, 0.0f, false, false, 24.0f, 128.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f);
        pathBuilder.arcToRelative(24.11f, 24.11f, 0.0f, false, false, 14.18f, -4.64f);
        pathBuilder.curveTo(74.33f, 194.53f, 95.6f, 184.0f, 128.0f, 184.0f);
        pathBuilder.reflectiveCurveToRelative(53.67f, 10.52f, 65.81f, 19.35f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, false, 232.0f, 184.0f);
        pathBuilder.lineTo(232.0f, 128.0f);
        pathBuilder.arcTo(104.12f, 104.12f, 0.0f, false, false, 128.0f, 24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 128.0f);
        pathBuilder.verticalLineToRelative(8.87f);
        pathBuilder.arcToRelative(166.0f, 166.0f, 0.0f, false, false, -40.94f, -18.22f);
        pathBuilder.arcTo(167.0f, 167.0f, 0.0f, false, false, 146.19f, 41.9f);
        pathBuilder.arcTo(88.14f, 88.14f, 0.0f, false, true, 216.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 44.27f);
        pathBuilder.arcToRelative(152.47f, 152.47f, 0.0f, false, true, 30.4f, 70.46f);
        pathBuilder.arcToRelative(170.85f, 170.85f, 0.0f, false, false, -60.84f, 0.0f);
        pathBuilder.arcTo(153.31f, 153.31f, 0.0f, false, true, 128.0f, 44.27f);
        pathBuilder.close();
        pathBuilder.moveTo(109.81f, 41.9f);
        pathBuilder.arcToRelative(167.0f, 167.0f, 0.0f, false, false, -28.87f, 76.76f);
        pathBuilder.arcTo(166.0f, 166.0f, 0.0f, false, false, 40.0f, 136.88f);
        pathBuilder.lineTo(40.0f, 128.0f);
        pathBuilder.arcTo(88.14f, 88.14f, 0.0f, false, true, 109.81f, 41.9f);
        pathBuilder.close();
        pathBuilder.moveTo(211.66f, 191.11f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.44f, -0.69f);
        pathBuilder.curveTo(189.16f, 180.2f, 164.7f, 168.0f, 128.0f, 168.0f);
        pathBuilder.reflectiveCurveTo(66.84f, 180.2f, 52.78f, 190.42f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.44f, 0.69f);
        pathBuilder.arcTo(7.77f, 7.77f, 0.0f, false, true, 40.0f, 184.0f);
        pathBuilder.lineTo(40.0f, 156.07f);
        pathBuilder.arcToRelative(152.0f, 152.0f, 0.0f, false, true, 176.0f, 0.0f);
        pathBuilder.lineTo(216.0f, 184.0f);
        pathBuilder.arcTo(7.77f, 7.77f, 0.0f, false, true, 211.66f, 191.11f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _baseballCap = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
