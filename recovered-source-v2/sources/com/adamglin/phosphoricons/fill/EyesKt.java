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

/* compiled from: Eyes.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Eyes", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getEyes", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_eyes", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EyesKt {
    private static ImageVector _eyes;

    public static final ImageVector getEyes(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _eyes;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Eyes", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(176.0f, 32.0f);
        pathBuilder.curveToRelative(-20.61f, 0.0f, -38.28f, 18.16f, -48.0f, 45.85f);
        pathBuilder.curveTo(118.28f, 50.16f, 100.61f, 32.0f, 80.0f, 32.0f);
        pathBuilder.curveToRelative(-31.4f, 0.0f, -56.0f, 42.17f, -56.0f, 96.0f);
        pathBuilder.reflectiveCurveToRelative(24.6f, 96.0f, 56.0f, 96.0f);
        pathBuilder.curveToRelative(20.61f, 0.0f, 38.28f, -18.16f, 48.0f, -45.85f);
        pathBuilder.curveToRelative(9.72f, 27.69f, 27.39f, 45.85f, 48.0f, 45.85f);
        pathBuilder.curveToRelative(31.4f, 0.0f, 56.0f, -42.17f, 56.0f, -96.0f);
        pathBuilder.reflectiveCurveTo(207.4f, 32.0f, 176.0f, 32.0f);
        pathBuilder.close();
        pathBuilder.moveTo(106.92f, 186.39f);
        pathBuilder.curveTo(99.43f, 200.12f, 89.62f, 208.0f, 80.0f, 208.0f);
        pathBuilder.reflectiveCurveToRelative(-19.43f, -7.88f, -26.92f, -21.61f);
        pathBuilder.arcToRelative(104.81f, 104.81f, 0.0f, false, true, -10.24f, -29.23f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, -58.32f);
        pathBuilder.arcTo(104.81f, 104.81f, 0.0f, false, true, 53.08f, 69.61f);
        pathBuilder.curveTo(60.57f, 55.88f, 70.38f, 48.0f, 80.0f, 48.0f);
        pathBuilder.reflectiveCurveToRelative(19.43f, 7.88f, 26.92f, 21.61f);
        pathBuilder.curveTo(115.35f, 85.07f, 120.0f, 105.81f, 120.0f, 128.0f);
        pathBuilder.reflectiveCurveTo(115.35f, 170.93f, 106.92f, 186.39f);
        pathBuilder.close();
        pathBuilder.moveTo(202.92f, 186.39f);
        pathBuilder.curveTo(195.43f, 200.12f, 185.62f, 208.0f, 176.0f, 208.0f);
        pathBuilder.reflectiveCurveToRelative(-19.43f, -7.88f, -26.92f, -21.61f);
        pathBuilder.arcToRelative(104.81f, 104.81f, 0.0f, false, true, -10.24f, -29.23f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, -58.32f);
        pathBuilder.arcToRelative(104.81f, 104.81f, 0.0f, false, true, 10.24f, -29.23f);
        pathBuilder.curveTo(156.57f, 55.88f, 166.38f, 48.0f, 176.0f, 48.0f);
        pathBuilder.reflectiveCurveToRelative(19.43f, 7.88f, 26.92f, 21.61f);
        pathBuilder.curveTo(211.35f, 85.07f, 216.0f, 105.81f, 216.0f, 128.0f);
        pathBuilder.reflectiveCurveTo(211.35f, 170.93f, 202.92f, 186.39f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _eyes = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
