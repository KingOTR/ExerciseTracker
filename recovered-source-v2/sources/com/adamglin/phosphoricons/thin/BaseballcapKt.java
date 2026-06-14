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

/* compiled from: Baseballcap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BaseballCap", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getBaseballCap", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_baseballCap", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BaseballcapKt {
    private static ImageVector _baseballCap;

    public static final ImageVector getBaseballCap(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 28.0f);
        pathBuilder.arcTo(100.12f, 100.12f, 0.0f, false, false, 28.0f, 128.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 31.84f, 16.12f);
        pathBuilder.curveTo(72.46f, 191.0f, 94.53f, 180.0f, 128.0f, 180.0f);
        pathBuilder.reflectiveCurveToRelative(55.54f, 10.94f, 68.16f, 20.12f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 21.0f, 1.67f);
        pathBuilder.arcTo(19.87f, 19.87f, 0.0f, false, false, 228.0f, 184.0f);
        pathBuilder.lineTo(228.0f, 128.0f);
        pathBuilder.arcTo(100.12f, 100.12f, 0.0f, false, false, 128.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 128.0f);
        pathBuilder.verticalLineToRelative(16.23f);
        pathBuilder.arcToRelative(162.31f, 162.31f, 0.0f, false, false, -48.67f, -22.47f);
        pathBuilder.arcToRelative(162.56f, 162.56f, 0.0f, false, false, -34.15f, -85.31f);
        pathBuilder.arcTo(92.12f, 92.12f, 0.0f, false, true, 220.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(163.1f, 119.74f);
        pathBuilder.arcToRelative(166.58f, 166.58f, 0.0f, false, false, -70.2f, 0.0f);
        pathBuilder.curveTo(97.64f, 76.93f, 120.0f, 47.31f, 128.0f, 38.0f);
        pathBuilder.curveTo(136.0f, 47.32f, 158.36f, 76.93f, 163.1f, 119.75f);
        pathBuilder.close();
        pathBuilder.moveTo(118.82f, 36.46f);
        pathBuilder.arcToRelative(162.56f, 162.56f, 0.0f, false, false, -34.15f, 85.31f);
        pathBuilder.arcTo(162.31f, 162.31f, 0.0f, false, false, 36.0f, 144.24f);
        pathBuilder.lineTo(36.0f, 128.0f);
        pathBuilder.arcTo(92.12f, 92.12f, 0.0f, false, true, 118.82f, 36.46f);
        pathBuilder.close();
        pathBuilder.moveTo(213.48f, 194.67f);
        pathBuilder.arcToRelative(11.88f, 11.88f, 0.0f, false, true, -12.61f, -1.0f);
        pathBuilder.curveTo(187.29f, 183.78f, 163.62f, 172.0f, 128.0f, 172.0f);
        pathBuilder.reflectiveCurveToRelative(-59.29f, 11.77f, -72.87f, 21.65f);
        pathBuilder.arcToRelative(11.88f, 11.88f, 0.0f, false, true, -12.61f, 1.0f);
        pathBuilder.arcTo(11.75f, 11.75f, 0.0f, false, true, 36.0f, 184.0f);
        pathBuilder.lineTo(36.0f, 154.0f);
        pathBuilder.arcToRelative(156.0f, 156.0f, 0.0f, false, true, 184.0f, 0.0f);
        pathBuilder.verticalLineToRelative(30.0f);
        pathBuilder.arcTo(11.75f, 11.75f, 0.0f, false, true, 213.48f, 194.67f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _baseballCap = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
