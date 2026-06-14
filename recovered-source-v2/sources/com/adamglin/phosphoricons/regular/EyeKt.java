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

/* compiled from: Eye.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Eye", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getEye", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_eye", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EyeKt {
    private static ImageVector _eye;

    public static final ImageVector getEye(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _eye;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Eye", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(247.31f, 124.76f);
        pathBuilder.curveToRelative(-0.35f, -0.79f, -8.82f, -19.58f, -27.65f, -38.41f);
        pathBuilder.curveTo(194.57f, 61.26f, 162.88f, 48.0f, 128.0f, 48.0f);
        pathBuilder.reflectiveCurveTo(61.43f, 61.26f, 36.34f, 86.35f);
        pathBuilder.curveTo(17.51f, 105.18f, 9.0f, 124.0f, 8.69f, 124.76f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 6.5f);
        pathBuilder.curveToRelative(0.35f, 0.79f, 8.82f, 19.57f, 27.65f, 38.4f);
        pathBuilder.curveTo(61.43f, 194.74f, 93.12f, 208.0f, 128.0f, 208.0f);
        pathBuilder.reflectiveCurveToRelative(66.57f, -13.26f, 91.66f, -38.34f);
        pathBuilder.curveToRelative(18.83f, -18.83f, 27.3f, -37.61f, 27.65f, -38.4f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 247.31f, 124.76f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 192.0f);
        pathBuilder.curveToRelative(-30.78f, 0.0f, -57.67f, -11.19f, -79.93f, -33.25f);
        pathBuilder.arcTo(133.47f, 133.47f, 0.0f, false, true, 25.0f, 128.0f);
        pathBuilder.arcTo(133.33f, 133.33f, 0.0f, false, true, 48.07f, 97.25f);
        pathBuilder.curveTo(70.33f, 75.19f, 97.22f, 64.0f, 128.0f, 64.0f);
        pathBuilder.reflectiveCurveToRelative(57.67f, 11.19f, 79.93f, 33.25f);
        pathBuilder.arcTo(133.46f, 133.46f, 0.0f, false, true, 231.05f, 128.0f);
        pathBuilder.curveTo(223.84f, 141.46f, 192.43f, 192.0f, 128.0f, 192.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 80.0f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, true, false, 48.0f, 48.0f);
        pathBuilder.arcTo(48.05f, 48.05f, 0.0f, false, false, 128.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 160.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, true, 128.0f, 160.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _eye = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
