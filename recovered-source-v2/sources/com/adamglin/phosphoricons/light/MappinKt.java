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

/* compiled from: Mappin.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MapPin", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getMapPin", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_mapPin", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MappinKt {
    private static ImageVector _mapPin;

    public static final ImageVector getMapPin(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _mapPin;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("MapPin", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 66.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, true, false, 38.0f, 38.0f);
        pathBuilder.arcTo(38.0f, 38.0f, 0.0f, false, false, 128.0f, 66.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 130.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, true, true, 26.0f, -26.0f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, true, 128.0f, 130.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 18.0f);
        pathBuilder.arcToRelative(86.1f, 86.1f, 0.0f, false, false, -86.0f, 86.0f);
        pathBuilder.curveToRelative(0.0f, 30.91f, 14.34f, 63.74f, 41.47f, 94.94f);
        pathBuilder.arcToRelative(252.32f, 252.32f, 0.0f, false, false, 41.09f, 38.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.88f, 0.0f);
        pathBuilder.arcToRelative(252.32f, 252.32f, 0.0f, false, false, 41.09f, -38.0f);
        pathBuilder.curveToRelative(27.13f, -31.2f, 41.47f, -64.0f, 41.47f, -94.94f);
        pathBuilder.arcTo(86.1f, 86.1f, 0.0f, false, false, 128.0f, 18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 224.51f);
        pathBuilder.curveTo(113.0f, 212.93f, 54.0f, 163.62f, 54.0f, 104.0f);
        pathBuilder.arcToRelative(74.0f, 74.0f, 0.0f, false, true, 148.0f, 0.0f);
        pathBuilder.curveTo(202.0f, 163.62f, 143.0f, 212.93f, 128.0f, 224.51f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _mapPin = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
