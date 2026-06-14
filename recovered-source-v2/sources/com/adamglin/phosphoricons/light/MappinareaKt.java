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

/* compiled from: Mappinarea.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MapPinArea", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getMapPinArea", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_mapPinArea", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MappinareaKt {
    private static ImageVector _mapPinArea;

    public static final ImageVector getMapPinArea(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(114.0f, 80.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, 14.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 114.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(66.0f, 80.0f);
        pathBuilder.arcToRelative(62.0f, 62.0f, 0.0f, false, true, 124.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 58.81f, -56.61f, 91.83f, -59.0f, 93.21f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 0.0f);
        pathBuilder.curveTo(122.61f, 171.83f, 66.0f, 138.81f, 66.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(78.0f, 80.0f);
        pathBuilder.curveToRelative(0.0f, 44.52f, 38.81f, 73.49f, 50.0f, 80.91f);
        pathBuilder.curveToRelative(11.18f, -7.42f, 50.0f, -36.38f, 50.0f, -80.91f);
        pathBuilder.arcTo(50.0f, 50.0f, 0.0f, false, false, 78.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(202.08f, 149.51f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -4.16f, 11.25f);
        pathBuilder.curveTo(215.5f, 167.25f, 226.0f, 175.94f, 226.0f, 184.0f);
        pathBuilder.curveToRelative(0.0f, 16.08f, -40.25f, 34.0f, -98.0f, 34.0f);
        pathBuilder.reflectiveCurveToRelative(-98.0f, -17.92f, -98.0f, -34.0f);
        pathBuilder.curveToRelative(0.0f, -8.06f, 10.5f, -16.75f, 28.08f, -23.24f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -4.16f, -11.25f);
        pathBuilder.curveTo(30.76f, 158.06f, 18.0f, 170.31f, 18.0f, 184.0f);
        pathBuilder.curveToRelative(0.0f, 13.34f, 12.18f, 25.38f, 34.31f, 33.88f);
        pathBuilder.curveTo(72.62f, 225.7f, 99.5f, 230.0f, 128.0f, 230.0f);
        pathBuilder.reflectiveCurveToRelative(55.38f, -4.3f, 75.69f, -12.12f);
        pathBuilder.curveTo(225.82f, 209.38f, 238.0f, 197.34f, 238.0f, 184.0f);
        pathBuilder.curveTo(238.0f, 170.31f, 225.24f, 158.06f, 202.08f, 149.51f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _mapPinArea = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
