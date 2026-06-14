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

/* compiled from: Mappinsimplearea.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MapPinSimpleArea", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getMapPinSimpleArea", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_mapPinSimpleArea", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MappinsimpleareaKt {
    private static ImageVector _mapPinSimpleArea;

    public static final ImageVector getMapPinSimpleArea(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _mapPinSimpleArea;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("MapPinSimpleArea", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(124.0f, 99.77f);
        pathBuilder.verticalLineTo(176.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.verticalLineTo(99.77f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, true, false, -8.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 36.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, true, -28.0f, 28.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, true, 128.0f, 36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(236.0f, 176.0f);
        pathBuilder.curveToRelative(0.0f, 12.46f, -11.73f, 23.83f, -33.0f, 32.0f);
        pathBuilder.curveToRelative(-20.09f, 7.73f, -46.72f, 12.0f, -75.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(-54.89f, -4.25f, -75.0f, -12.0f);
        pathBuilder.curveToRelative(-21.29f, -8.19f, -33.0f, -19.56f, -33.0f, -32.0f);
        pathBuilder.curveToRelative(0.0f, -18.55f, 25.81f, -34.22f, 67.37f, -40.88f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, true, true, 88.63f, 143.0f);
        pathBuilder.curveTo(52.93f, 148.74f, 28.0f, 162.3f, 28.0f, 176.0f);
        pathBuilder.curveToRelative(0.0f, 17.39f, 40.18f, 36.0f, 100.0f, 36.0f);
        pathBuilder.reflectiveCurveToRelative(100.0f, -18.61f, 100.0f, -36.0f);
        pathBuilder.curveToRelative(0.0f, -13.7f, -24.93f, -27.26f, -60.63f, -33.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 1.26f, -7.89f);
        pathBuilder.curveTo(210.19f, 141.78f, 236.0f, 157.45f, 236.0f, 176.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _mapPinSimpleArea = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
