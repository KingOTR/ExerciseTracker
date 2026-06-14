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

/* compiled from: Moon.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Moon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getMoon", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_moon", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MoonKt {
    private static ImageVector _moon;

    public static final ImageVector getMoon(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(233.54f, 142.23f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -2.0f);
        pathBuilder.arcToRelative(88.08f, 88.08f, 0.0f, false, true, -109.8f, -109.8f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.0f, -10.0f);
        pathBuilder.arcToRelative(104.84f, 104.84f, 0.0f, false, false, -52.91f, 37.0f);
        pathBuilder.arcTo(104.0f, 104.0f, 0.0f, false, false, 136.0f, 224.0f);
        pathBuilder.arcToRelative(103.09f, 103.09f, 0.0f, false, false, 62.52f, -20.88f);
        pathBuilder.arcToRelative(104.84f, 104.84f, 0.0f, false, false, 37.0f, -52.91f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 233.54f, 142.23f);
        pathBuilder.close();
        pathBuilder.moveTo(188.9f, 190.34f);
        pathBuilder.arcTo(88.0f, 88.0f, 0.0f, false, true, 65.66f, 67.11f);
        pathBuilder.arcToRelative(89.0f, 89.0f, 0.0f, false, true, 31.4f, -26.0f);
        pathBuilder.arcTo(106.0f, 106.0f, 0.0f, false, false, 96.0f, 56.0f);
        pathBuilder.arcTo(104.11f, 104.11f, 0.0f, false, false, 200.0f, 160.0f);
        pathBuilder.arcToRelative(106.0f, 106.0f, 0.0f, false, false, 14.92f, -1.06f);
        pathBuilder.arcTo(89.0f, 89.0f, 0.0f, false, true, 188.9f, 190.34f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _moon = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
