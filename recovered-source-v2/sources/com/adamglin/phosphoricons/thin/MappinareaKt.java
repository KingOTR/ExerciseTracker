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

/* compiled from: Mappinarea.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MapPinArea", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getMapPinArea", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_mapPinArea", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MappinareaKt {
    private static ImageVector _mapPinArea;

    public static final ImageVector getMapPinArea(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(116.0f, 80.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 116.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(97.08f, 147.73f);
        pathBuilder.curveTo(78.05f, 127.35f, 68.0f, 103.93f, 68.0f, 80.0f);
        pathBuilder.arcToRelative(60.0f, 60.0f, 0.0f, false, true, 120.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 23.93f, -10.05f, 47.35f, -29.08f, 67.73f);
        pathBuilder.arcTo(136.54f, 136.54f, 0.0f, false, true, 130.0f, 171.47f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 0.0f);
        pathBuilder.arcTo(136.54f, 136.54f, 0.0f, false, true, 97.08f, 147.73f);
        pathBuilder.close();
        pathBuilder.moveTo(76.0f, 80.0f);
        pathBuilder.curveToRelative(0.0f, 47.09f, 42.25f, 77.0f, 52.0f, 83.3f);
        pathBuilder.curveToRelative(9.75f, -6.28f, 52.0f, -36.21f, 52.0f, -83.3f);
        pathBuilder.arcTo(52.0f, 52.0f, 0.0f, false, false, 76.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(201.38f, 151.38f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.76f, 7.51f);
        pathBuilder.curveToRelative(18.67f, 6.89f, 29.38f, 16.0f, 29.38f, 25.11f);
        pathBuilder.curveToRelative(0.0f, 17.39f, -40.18f, 36.0f, -100.0f, 36.0f);
        pathBuilder.reflectiveCurveTo(28.0f, 201.39f, 28.0f, 184.0f);
        pathBuilder.curveToRelative(0.0f, -9.07f, 10.71f, -18.22f, 29.38f, -25.11f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.76f, -7.51f);
        pathBuilder.curveTo(32.29f, 159.62f, 20.0f, 171.21f, 20.0f, 184.0f);
        pathBuilder.curveToRelative(0.0f, 12.46f, 11.73f, 23.83f, 33.0f, 32.0f);
        pathBuilder.curveToRelative(20.09f, 7.73f, 46.72f, 12.0f, 75.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(54.89f, -4.25f, 75.0f, -12.0f);
        pathBuilder.curveToRelative(21.29f, -8.19f, 33.0f, -19.56f, 33.0f, -32.0f);
        pathBuilder.curveTo(236.0f, 171.21f, 223.71f, 159.62f, 201.38f, 151.38f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _mapPinArea = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
