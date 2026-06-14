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

/* compiled from: Mappinline.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MapPinLine", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getMapPinLine", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_mapPinLine", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MappinlineKt {
    private static ImageVector _mapPinLine;

    public static final ImageVector getMapPinLine(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _mapPinLine;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("MapPinLine", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(200.0f, 228.0f);
        pathBuilder.lineTo(139.72f, 228.0f);
        pathBuilder.arcTo(263.66f, 263.66f, 0.0f, false, false, 171.0f, 197.62f);
        pathBuilder.curveToRelative(26.81f, -30.83f, 41.0f, -63.2f, 41.0f, -93.62f);
        pathBuilder.arcToRelative(84.0f, 84.0f, 0.0f, false, false, -168.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 30.42f, 14.17f, 62.79f, 41.0f, 93.62f);
        pathBuilder.arcTo(263.66f, 263.66f, 0.0f, false, false, 116.28f, 228.0f);
        pathBuilder.lineTo(56.0f, 228.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.lineTo(200.0f, 236.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(90.9f, 192.23f);
        pathBuilder.curveTo(73.15f, 171.8f, 52.0f, 139.9f, 52.0f, 104.0f);
        pathBuilder.arcToRelative(76.0f, 76.0f, 0.0f, false, true, 152.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 35.9f, -21.15f, 67.8f, -38.9f, 88.23f);
        pathBuilder.arcTo(254.62f, 254.62f, 0.0f, false, true, 128.0f, 227.0f);
        pathBuilder.arcTo(254.62f, 254.62f, 0.0f, false, true, 90.9f, 192.23f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 104.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, true, false, -36.0f, 36.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, false, 164.0f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(100.0f, 104.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, 28.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, true, 100.0f, 104.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _mapPinLine = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
