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

/* compiled from: Mappinarea.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MapPinArea", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getMapPinArea", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_mapPinArea", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MappinareaKt {
    private static ImageVector _mapPinArea;

    public static final ImageVector getMapPinArea(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _mapPinArea;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("MapPinArea", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(108.0f, 80.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, 20.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 108.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(60.0f, 80.0f);
        pathBuilder.arcToRelative(68.0f, 68.0f, 0.0f, false, true, 136.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 62.25f, -59.51f, 97.0f, -62.05f, 98.42f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.9f, 0.0f);
        pathBuilder.curveTo(119.51f, 177.0f, 60.0f, 142.25f, 60.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(84.0f, 80.0f);
        pathBuilder.curveToRelative(0.0f, 38.2f, 30.71f, 64.2f, 44.0f, 73.64f);
        pathBuilder.curveTo(141.21f, 144.15f, 172.0f, 118.0f, 172.0f, 80.0f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, false, -88.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(208.57f, 145.6f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, -9.14f, 22.19f);
        pathBuilder.curveTo(213.56f, 173.61f, 220.0f, 180.27f, 220.0f, 184.0f);
        pathBuilder.curveToRelative(0.0f, 4.0f, -7.13f, 11.07f, -22.77f, 17.08f);
        pathBuilder.curveToRelative(-18.3f, 7.0f, -42.89f, 10.92f, -69.23f, 10.92f);
        pathBuilder.reflectiveCurveToRelative(-50.93f, -3.88f, -69.23f, -10.92f);
        pathBuilder.curveTo(43.12f, 195.07f, 36.0f, 188.0f, 36.0f, 184.0f);
        pathBuilder.curveToRelative(0.0f, -3.73f, 6.44f, -10.39f, 20.57f, -16.21f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, -9.14f, -22.19f);
        pathBuilder.curveTo(31.27f, 152.25f, 12.0f, 164.31f, 12.0f, 184.0f);
        pathBuilder.curveToRelative(0.0f, 34.14f, 58.36f, 52.0f, 116.0f, 52.0f);
        pathBuilder.curveToRelative(29.22f, 0.0f, 56.86f, -4.44f, 77.85f, -12.52f);
        pathBuilder.curveTo(220.1f, 218.0f, 244.0f, 205.59f, 244.0f, 184.0f);
        pathBuilder.curveTo(244.0f, 164.31f, 224.73f, 152.25f, 208.57f, 145.6f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _mapPinArea = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
