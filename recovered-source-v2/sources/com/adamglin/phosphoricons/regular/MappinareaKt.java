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

/* compiled from: Mappinarea.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MapPinArea", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getMapPinArea", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_mapPinArea", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MappinareaKt {
    private static ImageVector _mapPinArea;

    public static final ImageVector getMapPinArea(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(112.0f, 80.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 112.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(64.0f, 80.0f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, false, true, 128.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 59.95f, -57.58f, 93.54f, -60.0f, 94.95f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.94f, 0.0f);
        pathBuilder.curveTo(121.58f, 173.54f, 64.0f, 140.0f, 64.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(80.0f, 80.0f);
        pathBuilder.curveToRelative(0.0f, 42.2f, 35.84f, 70.21f, 48.0f, 78.5f);
        pathBuilder.curveToRelative(12.15f, -8.28f, 48.0f, -36.3f, 48.0f, -78.5f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, false, false, -96.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(202.77f, 147.63f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.54f, 15.0f);
        pathBuilder.curveTo(213.74f, 168.74f, 224.0f, 176.92f, 224.0f, 184.0f);
        pathBuilder.curveToRelative(0.0f, 13.36f, -36.52f, 32.0f, -96.0f, 32.0f);
        pathBuilder.reflectiveCurveToRelative(-96.0f, -18.64f, -96.0f, -32.0f);
        pathBuilder.curveToRelative(0.0f, -7.08f, 10.26f, -15.26f, 26.77f, -21.36f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.54f, -15.0f);
        pathBuilder.curveTo(29.22f, 156.49f, 16.0f, 169.41f, 16.0f, 184.0f);
        pathBuilder.curveToRelative(0.0f, 31.18f, 57.71f, 48.0f, 112.0f, 48.0f);
        pathBuilder.reflectiveCurveToRelative(112.0f, -16.82f, 112.0f, -48.0f);
        pathBuilder.curveTo(240.0f, 169.41f, 226.78f, 156.49f, 202.77f, 147.63f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _mapPinArea = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
