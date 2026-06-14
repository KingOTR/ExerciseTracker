package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Mappinsimplearea.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MapPinSimpleArea", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getMapPinSimpleArea", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_mapPinSimpleArea", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MappinsimpleareaKt {
    private static ImageVector _mapPinSimpleArea;

    public static final ImageVector getMapPinSimpleArea(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(122.0f, 101.52f);
        pathBuilder.verticalLineTo(176.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.verticalLineTo(101.52f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, true, false, -12.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 38.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, true, true, -26.0f, 26.0f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, true, 128.0f, 38.0f);
        pathBuilder.close();
        pathBuilder.moveTo(238.0f, 176.0f);
        pathBuilder.curveToRelative(0.0f, 13.34f, -12.18f, 25.38f, -34.31f, 33.88f);
        pathBuilder.curveTo(183.38f, 217.7f, 156.5f, 222.0f, 128.0f, 222.0f);
        pathBuilder.reflectiveCurveToRelative(-55.38f, -4.3f, -75.69f, -12.12f);
        pathBuilder.curveTo(30.18f, 201.38f, 18.0f, 189.34f, 18.0f, 176.0f);
        pathBuilder.curveToRelative(0.0f, -19.6f, 26.46f, -36.0f, 69.05f, -42.86f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 89.0f, 145.0f);
        pathBuilder.curveToRelative(-18.0f, 2.89f, -33.27f, 7.66f, -44.09f, 13.78f);
        pathBuilder.curveTo(35.28f, 164.2f, 30.0f, 170.32f, 30.0f, 176.0f);
        pathBuilder.curveToRelative(0.0f, 16.08f, 40.25f, 34.0f, 98.0f, 34.0f);
        pathBuilder.reflectiveCurveToRelative(98.0f, -17.92f, 98.0f, -34.0f);
        pathBuilder.curveToRelative(0.0f, -5.68f, -5.28f, -11.8f, -14.86f, -17.23f);
        pathBuilder.curveToRelative(-10.82f, -6.12f, -26.07f, -10.89f, -44.09f, -13.78f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 1.9f, -11.85f);
        pathBuilder.curveTo(211.54f, 140.0f, 238.0f, 156.4f, 238.0f, 176.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _mapPinSimpleArea = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
