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

/* compiled from: Binoculars.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Binoculars", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getBinoculars", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_binoculars", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BinocularsKt {
    private static ImageVector _binoculars;

    public static final ImageVector getBinoculars(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _binoculars;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Binoculars", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(233.0f, 147.24f);
        pathBuilder.lineTo(191.43f, 52.6f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -1.25f, -1.83f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, false, -42.42f, 0.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 146.0f, 55.0f);
        pathBuilder.lineTo(146.0f, 82.0f);
        pathBuilder.lineTo(110.0f, 82.0f);
        pathBuilder.lineTo(110.0f, 55.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -1.76f, -4.25f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, false, -42.42f, 0.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -1.25f, 1.83f);
        pathBuilder.lineTo(23.0f, 147.24f);
        pathBuilder.arcTo(46.0f, 46.0f, 0.0f, true, false, 110.0f, 168.0f);
        pathBuilder.lineTo(110.0f, 94.0f);
        pathBuilder.horizontalLineToRelative(36.0f);
        pathBuilder.verticalLineToRelative(74.0f);
        pathBuilder.arcToRelative(46.0f, 46.0f, 0.0f, true, false, 87.0f, -20.76f);
        pathBuilder.close();
        pathBuilder.moveTo(64.0f, 202.0f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, true, true, 34.0f, -34.0f);
        pathBuilder.arcTo(34.0f, 34.0f, 0.0f, false, true, 64.0f, 202.0f);
        pathBuilder.close();
        pathBuilder.moveTo(64.0f, 122.0f);
        pathBuilder.arcToRelative(45.77f, 45.77f, 0.0f, false, false, -18.55f, 3.92f);
        pathBuilder.lineTo(75.06f, 58.54f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, true, 98.0f, 57.71f);
        pathBuilder.lineTo(98.0f, 137.0f);
        pathBuilder.arcTo(45.89f, 45.89f, 0.0f, false, false, 64.0f, 122.0f);
        pathBuilder.close();
        pathBuilder.moveTo(158.0f, 57.72f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, false, true, 22.94f, 0.83f);
        pathBuilder.lineToRelative(29.61f, 67.37f);
        pathBuilder.arcTo(45.9f, 45.9f, 0.0f, false, false, 158.0f, 137.0f);
        pathBuilder.close();
        pathBuilder.moveTo(192.0f, 202.0f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, true, true, 34.0f, -34.0f);
        pathBuilder.arcTo(34.0f, 34.0f, 0.0f, false, true, 192.0f, 202.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _binoculars = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
