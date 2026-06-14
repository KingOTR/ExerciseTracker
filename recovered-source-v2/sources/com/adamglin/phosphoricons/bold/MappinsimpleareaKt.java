package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Mappinsimplearea.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MapPinSimpleArea", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getMapPinSimpleArea", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_mapPinSimpleArea", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MappinsimpleareaKt {
    private static ImageVector _mapPinSimpleArea;

    public static final ImageVector getMapPinSimpleArea(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(116.0f, 106.32f);
        pathBuilder.verticalLineTo(176.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.verticalLineTo(106.32f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, true, false, -24.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 44.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, 20.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 128.0f, 44.0f);
        pathBuilder.close();
        pathBuilder.moveTo(244.0f, 176.0f);
        pathBuilder.curveToRelative(0.0f, 21.59f, -23.9f, 34.0f, -38.15f, 39.48f);
        pathBuilder.curveTo(184.86f, 223.56f, 157.22f, 228.0f, 128.0f, 228.0f);
        pathBuilder.curveToRelative(-57.64f, 0.0f, -116.0f, -17.86f, -116.0f, -52.0f);
        pathBuilder.curveToRelative(0.0f, -22.23f, 26.12f, -40.2f, 69.88f, -48.06f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 4.24f, 23.62f);
        pathBuilder.curveTo(51.93f, 157.71f, 36.0f, 169.78f, 36.0f, 176.0f);
        pathBuilder.curveToRelative(0.0f, 4.0f, 7.12f, 11.07f, 22.77f, 17.08f);
        pathBuilder.curveToRelative(18.3f, 7.0f, 42.89f, 10.92f, 69.23f, 10.92f);
        pathBuilder.reflectiveCurveToRelative(50.93f, -3.88f, 69.23f, -10.92f);
        pathBuilder.curveTo(212.87f, 187.07f, 220.0f, 180.0f, 220.0f, 176.0f);
        pathBuilder.curveToRelative(0.0f, -6.22f, -15.93f, -18.29f, -50.12f, -24.44f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 4.24f, -23.62f);
        pathBuilder.curveTo(217.88f, 135.8f, 244.0f, 153.77f, 244.0f, 176.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _mapPinSimpleArea = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
