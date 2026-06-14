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

/* compiled from: Cat.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Cat", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getCat", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cat", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CatKt {
    private static ImageVector _cat;

    public static final ImageVector getCat(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _cat;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Cat", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(221.36f, 35.07f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -15.26f, 3.0f);
        pathBuilder.lineToRelative(-0.29f, 0.3f);
        pathBuilder.lineTo(187.42f, 59.58f);
        pathBuilder.arcToRelative(109.16f, 109.16f, 0.0f, false, false, -118.84f, 0.0f);
        pathBuilder.lineTo(50.19f, 38.41f);
        pathBuilder.lineToRelative(-0.29f, -0.3f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 48.0f);
        pathBuilder.verticalLineToRelative(88.0f);
        pathBuilder.curveToRelative(0.0f, 51.83f, 45.76f, 94.0f, 102.0f, 94.0f);
        pathBuilder.reflectiveCurveToRelative(102.0f, -42.17f, 102.0f, -94.0f);
        pathBuilder.lineTo(230.0f, 48.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 221.36f, 35.07f);
        pathBuilder.close();
        pathBuilder.moveTo(218.0f, 136.0f);
        pathBuilder.curveToRelative(0.0f, 43.38f, -37.16f, 79.0f, -84.0f, 81.81f);
        pathBuilder.lineTo(134.0f, 194.48f);
        pathBuilder.lineToRelative(14.24f, -14.24f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, -8.49f);
        pathBuilder.lineTo(128.0f, 183.51f);
        pathBuilder.lineToRelative(-11.76f, -11.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 8.49f);
        pathBuilder.lineTo(122.0f, 194.48f);
        pathBuilder.verticalLineToRelative(23.33f);
        pathBuilder.curveTo(75.16f, 215.0f, 38.0f, 179.38f, 38.0f, 136.0f);
        pathBuilder.lineTo(38.0f, 48.0f);
        pathBuilder.arcToRelative(1.91f, 1.91f, 0.0f, false, true, 1.23f, -1.85f);
        pathBuilder.arcToRelative(2.28f, 2.28f, 0.0f, false, true, 0.82f, -0.17f);
        pathBuilder.arcToRelative(1.87f, 1.87f, 0.0f, false, true, 1.26f, 0.5f);
        pathBuilder.lineToRelative(21.76f, 25.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.11f, 0.88f);
        pathBuilder.arcTo(91.52f, 91.52f, 0.0f, false, true, 90.0f, 61.68f);
        pathBuilder.lineTo(90.0f, 88.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 12.0f, 0.0f);
        pathBuilder.lineTo(102.0f, 57.51f);
        pathBuilder.arcToRelative(97.85f, 97.85f, 0.0f, false, true, 20.0f, -3.32f);
        pathBuilder.lineTo(122.0f, 88.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 12.0f, 0.0f);
        pathBuilder.lineTo(134.0f, 54.19f);
        pathBuilder.arcToRelative(97.85f, 97.85f, 0.0f, false, true, 20.0f, 3.32f);
        pathBuilder.lineTo(154.0f, 88.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 12.0f, 0.0f);
        pathBuilder.lineTo(166.0f, 61.68f);
        pathBuilder.arcToRelative(91.52f, 91.52f, 0.0f, false, true, 18.82f, 10.73f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.11f, -0.88f);
        pathBuilder.lineToRelative(21.76f, -25.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 218.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(94.0f, 140.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 94.0f, 140.0f);
        pathBuilder.close();
        pathBuilder.moveTo(182.0f, 140.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 182.0f, 140.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cat = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
