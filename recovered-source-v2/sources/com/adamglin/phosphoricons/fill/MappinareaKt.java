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

/* compiled from: Mappinarea.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MapPinArea", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getMapPinArea", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_mapPinArea", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MappinareaKt {
    private static ImageVector _mapPinArea;

    public static final ImageVector getMapPinArea(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(124.0f, 175.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.94f, 0.0f);
        pathBuilder.curveToRelative(2.45f, -1.41f, 60.0f, -35.0f, 60.0f, -94.95f);
        pathBuilder.arcTo(64.0f, 64.0f, 0.0f, false, false, 64.0f, 80.0f);
        pathBuilder.curveTo(64.0f, 140.0f, 121.58f, 173.54f, 124.0f, 175.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 56.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, true, -24.0f, 24.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 128.0f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(240.0f, 184.0f);
        pathBuilder.curveToRelative(0.0f, 31.18f, -57.71f, 48.0f, -112.0f, 48.0f);
        pathBuilder.reflectiveCurveTo(16.0f, 215.18f, 16.0f, 184.0f);
        pathBuilder.curveToRelative(0.0f, -14.59f, 13.22f, -27.51f, 37.23f, -36.37f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.54f, 15.0f);
        pathBuilder.curveTo(42.26f, 168.74f, 32.0f, 176.92f, 32.0f, 184.0f);
        pathBuilder.curveToRelative(0.0f, 13.36f, 36.52f, 32.0f, 96.0f, 32.0f);
        pathBuilder.reflectiveCurveToRelative(96.0f, -18.64f, 96.0f, -32.0f);
        pathBuilder.curveToRelative(0.0f, -7.08f, -10.26f, -15.26f, -26.77f, -21.36f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.54f, -15.0f);
        pathBuilder.curveTo(226.78f, 156.49f, 240.0f, 169.41f, 240.0f, 184.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _mapPinArea = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
