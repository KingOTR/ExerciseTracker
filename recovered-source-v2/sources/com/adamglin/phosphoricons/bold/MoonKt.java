package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Moon.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Moon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getMoon", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_moon", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MoonKt {
    private static ImageVector _moon;

    public static final ImageVector getMoon(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(236.37f, 139.4f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -3.0f);
        pathBuilder.arcTo(84.07f, 84.07f, 0.0f, false, true, 119.6f, 31.59f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -15.0f, -15.0f);
        pathBuilder.arcTo(108.86f, 108.86f, 0.0f, false, false, 49.69f, 55.07f);
        pathBuilder.arcTo(108.0f, 108.0f, 0.0f, false, false, 136.0f, 228.0f);
        pathBuilder.arcToRelative(107.09f, 107.09f, 0.0f, false, false, 64.93f, -21.69f);
        pathBuilder.arcToRelative(108.86f, 108.86f, 0.0f, false, false, 38.44f, -54.94f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 236.37f, 139.4f);
        pathBuilder.close();
        pathBuilder.moveTo(186.49f, 187.14f);
        pathBuilder.arcTo(84.0f, 84.0f, 0.0f, false, true, 68.86f, 69.51f);
        pathBuilder.arcTo(84.93f, 84.93f, 0.0f, false, true, 92.27f, 48.29f);
        pathBuilder.quadTo(92.0f, 52.13f, 92.0f, 56.0f);
        pathBuilder.arcTo(108.12f, 108.12f, 0.0f, false, false, 200.0f, 164.0f);
        pathBuilder.quadToRelative(3.87f, 0.0f, 7.71f, -0.27f);
        pathBuilder.arcTo(84.79f, 84.79f, 0.0f, false, true, 186.49f, 187.14f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _moon = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
