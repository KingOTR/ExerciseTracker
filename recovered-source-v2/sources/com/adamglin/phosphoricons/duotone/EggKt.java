package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Egg.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Egg", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getEgg", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_egg", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EggKt {
    private static ImageVector _egg;

    public static final ImageVector getEgg(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _egg;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Egg", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 152.0f);
        pathBuilder.arcToRelative(80.0f, 80.0f, 0.0f, false, true, -160.0f, 0.0f);
        pathBuilder.curveTo(48.0f, 88.0f, 96.0f, 24.0f, 128.0f, 24.0f);
        pathBuilder.reflectiveCurveTo(208.0f, 88.0f, 208.0f, 152.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(186.66f, 59.56f);
        pathBuilder2.curveTo(168.47f, 32.29f, 146.54f, 16.0f, 128.0f, 16.0f);
        pathBuilder2.reflectiveCurveTo(87.53f, 32.29f, 69.34f, 59.56f);
        pathBuilder2.curveTo(50.7f, 87.54f, 40.0f, 121.23f, 40.0f, 152.0f);
        pathBuilder2.arcToRelative(88.0f, 88.0f, 0.0f, false, false, 176.0f, 0.0f);
        pathBuilder2.curveTo(216.0f, 121.23f, 205.3f, 87.54f, 186.66f, 59.56f);
        pathBuilder2.close();
        pathBuilder2.moveTo(128.0f, 224.0f);
        pathBuilder2.arcToRelative(72.08f, 72.08f, 0.0f, false, true, -72.0f, -72.0f);
        pathBuilder2.curveToRelative(0.0f, -27.69f, 9.72f, -58.15f, 26.66f, -83.56f);
        pathBuilder2.curveTo(97.19f, 46.64f, 115.41f, 32.0f, 128.0f, 32.0f);
        pathBuilder2.reflectiveCurveToRelative(30.81f, 14.64f, 45.34f, 36.44f);
        pathBuilder2.curveTo(190.28f, 93.85f, 200.0f, 124.31f, 200.0f, 152.0f);
        pathBuilder2.arcTo(72.08f, 72.08f, 0.0f, false, true, 128.0f, 224.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _egg = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
