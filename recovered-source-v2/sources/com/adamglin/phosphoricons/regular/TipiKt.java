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

/* compiled from: Tipi.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Tipi", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getTipi", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_tipi", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TipiKt {
    private static ImageVector _tipi;

    public static final ImageVector getTipi(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _tipi;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Tipi", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(238.74f, 211.69f);
        pathBuilder.lineTo(137.5f, 53.5f);
        pathBuilder.lineToRelative(21.24f, -33.19f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.48f, -8.62f);
        pathBuilder.lineTo(128.0f, 38.66f);
        pathBuilder.lineToRelative(-17.26f, -27.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -13.48f, 8.62f);
        pathBuilder.lineTo(118.5f, 53.5f);
        pathBuilder.lineTo(17.26f, 211.69f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 24.0f, 224.0f);
        pathBuilder.lineTo(232.0f, 224.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.74f, -12.31f);
        pathBuilder.close();
        pathBuilder.moveTo(86.3f, 208.0f);
        pathBuilder.lineTo(128.0f, 142.84f);
        pathBuilder.lineTo(169.7f, 208.0f);
        pathBuilder.close();
        pathBuilder.moveTo(188.7f, 208.0f);
        pathBuilder.lineTo(134.7f, 123.69f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.48f, 0.0f);
        pathBuilder.lineTo(67.3f, 208.0f);
        pathBuilder.lineTo(38.62f, 208.0f);
        pathBuilder.lineTo(128.0f, 68.34f);
        pathBuilder.lineTo(217.38f, 208.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _tipi = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
