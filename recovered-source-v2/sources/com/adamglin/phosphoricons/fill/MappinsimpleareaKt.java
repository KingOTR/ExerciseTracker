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

/* compiled from: Mappinsimplearea.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MapPinSimpleArea", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getMapPinSimpleArea", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_mapPinSimpleArea", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MappinsimpleareaKt {
    private static ImageVector _mapPinSimpleArea;

    public static final ImageVector getMapPinSimpleArea(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(88.0f, 64.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, true, 48.0f, 39.19f);
        pathBuilder.lineTo(136.0f, 176.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.lineTo(120.0f, 103.19f);
        pathBuilder.arcTo(40.05f, 40.05f, 0.0f, false, true, 88.0f, 64.0f);
        pathBuilder.close();
        pathBuilder.moveTo(218.0f, 146.59f);
        pathBuilder.curveToRelative(-12.26f, -6.94f, -29.12f, -12.27f, -48.77f, -15.42f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, false, 166.73f, 147.0f);
        pathBuilder.curveToRelative(17.54f, 2.82f, 33.0f, 7.63f, 43.42f, 13.55f);
        pathBuilder.curveTo(219.0f, 165.5f, 224.0f, 171.14f, 224.0f, 176.0f);
        pathBuilder.curveToRelative(0.0f, 13.36f, -36.52f, 32.0f, -96.0f, 32.0f);
        pathBuilder.reflectiveCurveToRelative(-96.0f, -18.64f, -96.0f, -32.0f);
        pathBuilder.curveToRelative(0.0f, -4.86f, 5.0f, -10.5f, 13.85f, -15.49f);
        pathBuilder.curveToRelative(10.46f, -5.92f, 25.88f, -10.73f, 43.42f, -13.55f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -2.54f, -15.79f);
        pathBuilder.curveToRelative(-19.65f, 3.15f, -36.51f, 8.48f, -48.77f, 15.42f);
        pathBuilder.curveTo(19.81f, 156.87f, 16.0f, 168.26f, 16.0f, 176.0f);
        pathBuilder.curveToRelative(0.0f, 31.18f, 57.71f, 48.0f, 112.0f, 48.0f);
        pathBuilder.reflectiveCurveToRelative(112.0f, -16.82f, 112.0f, -48.0f);
        pathBuilder.curveTo(240.0f, 168.26f, 236.19f, 156.87f, 218.0f, 146.59f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _mapPinSimpleArea = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
