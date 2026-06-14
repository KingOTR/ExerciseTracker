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

/* compiled from: Pintglass.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PintGlass", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPintGlass", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pintGlass", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PintglassKt {
    private static ImageVector _pintGlass;

    public static final ImageVector getPintGlass(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _pintGlass;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PintGlass", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(204.49f, 28.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 200.0f, 26.0f);
        pathBuilder.horizontalLineTo(56.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.71f);
        pathBuilder.lineToRelative(23.16f, 193.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 87.1f, 238.0f);
        pathBuilder.horizontalLineToRelative(81.8f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 13.9f, -12.33f);
        pathBuilder.lineTo(206.0f, 32.71f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 204.49f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(193.24f, 38.0f);
        pathBuilder.lineToRelative(-3.36f, 28.0f);
        pathBuilder.horizontalLineTo(66.12f);
        pathBuilder.lineTo(62.76f, 38.0f);
        pathBuilder.close();
        pathBuilder.moveTo(170.89f, 224.24f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 1.76f);
        pathBuilder.horizontalLineTo(87.1f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -1.76f);
        pathBuilder.lineTo(67.56f, 78.0f);
        pathBuilder.horizontalLineTo(188.44f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pintGlass = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
