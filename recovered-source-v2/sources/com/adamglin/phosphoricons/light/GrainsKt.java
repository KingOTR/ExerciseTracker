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

/* compiled from: Grains.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Grains", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getGrains", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_grains", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GrainsKt {
    private static ImageVector _grains;

    public static final ImageVector getGrains(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _grains;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Grains", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 58.0f);
        pathBuilder.arcToRelative(85.48f, 85.48f, 0.0f, false, false, -32.84f, 6.53f);
        pathBuilder.curveTo(161.45f, 34.31f, 132.0f, 19.3f, 130.68f, 18.63f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.36f, 0.0f);
        pathBuilder.curveToRelative(-1.33f, 0.67f, -30.77f, 15.68f, -44.48f, 45.9f);
        pathBuilder.arcTo(85.51f, 85.51f, 0.0f, false, false, 48.0f, 58.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f);
        pathBuilder.verticalLineToRelative(80.0f);
        pathBuilder.arcToRelative(86.0f, 86.0f, 0.0f, false, false, 172.0f, 0.0f);
        pathBuilder.lineTo(214.0f, 64.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 208.0f, 58.0f);
        pathBuilder.close();
        pathBuilder.moveTo(122.0f, 217.76f);
        pathBuilder.arcTo(74.1f, 74.1f, 0.0f, false, true, 54.0f, 144.0f);
        pathBuilder.lineTo(54.0f, 126.24f);
        pathBuilder.arcTo(74.1f, 74.1f, 0.0f, false, true, 122.0f, 200.0f);
        pathBuilder.close();
        pathBuilder.moveTo(122.0f, 156.25f);
        pathBuilder.arcToRelative(86.1f, 86.1f, 0.0f, false, false, -68.0f, -42.0f);
        pathBuilder.verticalLineToRelative(-44.0f);
        pathBuilder.arcTo(74.11f, 74.11f, 0.0f, false, true, 122.0f, 144.0f);
        pathBuilder.close();
        pathBuilder.moveTo(91.58f, 69.91f);
        pathBuilder.curveToRelative(9.66f, -21.6f, 29.27f, -34.78f, 36.42f, -39.0f);
        pathBuilder.curveToRelative(7.16f, 4.25f, 26.76f, 17.43f, 36.41f, 39.0f);
        pathBuilder.arcTo(86.5f, 86.5f, 0.0f, false, false, 128.0f, 112.5f);
        pathBuilder.arcTo(86.47f, 86.47f, 0.0f, false, false, 91.58f, 69.91f);
        pathBuilder.close();
        pathBuilder.moveTo(202.0f, 144.0f);
        pathBuilder.arcToRelative(74.1f, 74.1f, 0.0f, false, true, -68.0f, 73.76f);
        pathBuilder.lineTo(134.0f, 200.0f);
        pathBuilder.arcToRelative(74.1f, 74.1f, 0.0f, false, true, 68.0f, -73.76f);
        pathBuilder.close();
        pathBuilder.moveTo(202.0f, 114.23f);
        pathBuilder.arcToRelative(86.1f, 86.1f, 0.0f, false, false, -68.0f, 42.0f);
        pathBuilder.lineTo(134.0f, 144.0f);
        pathBuilder.arcToRelative(74.11f, 74.11f, 0.0f, false, true, 68.0f, -73.76f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _grains = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
