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

/* compiled from: Moon.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Moon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getMoon", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_moon", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MoonKt {
    private static ImageVector _moon;

    public static final ImageVector getMoon(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _moon;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Moon", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(232.13f, 143.64f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -1.49f);
        pathBuilder.arcTo(90.07f, 90.07f, 0.0f, false, true, 113.86f, 29.85f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.49f, -7.48f);
        pathBuilder.arcTo(102.88f, 102.88f, 0.0f, false, false, 54.48f, 58.68f);
        pathBuilder.arcTo(102.0f, 102.0f, 0.0f, false, false, 197.32f, 201.52f);
        pathBuilder.arcToRelative(102.88f, 102.88f, 0.0f, false, false, 36.31f, -51.89f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 232.13f, 143.64f);
        pathBuilder.close();
        pathBuilder.moveTo(190.13f, 191.93f);
        pathBuilder.arcToRelative(90.0f, 90.0f, 0.0f, false, true, -126.0f, -126.0f);
        pathBuilder.arcTo(90.9f, 90.9f, 0.0f, false, true, 99.65f, 37.66f);
        pathBuilder.arcTo(102.06f, 102.06f, 0.0f, false, false, 218.34f, 156.35f);
        pathBuilder.arcTo(90.9f, 90.9f, 0.0f, false, true, 190.1f, 191.93f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _moon = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
