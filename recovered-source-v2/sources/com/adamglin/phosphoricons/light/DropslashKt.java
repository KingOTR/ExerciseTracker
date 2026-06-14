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

/* compiled from: Dropslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"DropSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getDropSlash", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_dropSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DropslashKt {
    private static ImageVector _dropSlash;

    public static final ImageVector getDropSlash(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _dropSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("DropSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(52.44f, 36.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 43.56f, 44.0f);
        pathBuilder.lineToRelative(23.7f, 26.07f);
        pathBuilder.curveTo(50.51f, 94.93f, 42.0f, 119.77f, 42.0f, 144.0f);
        pathBuilder.arcToRelative(86.0f, 86.0f, 0.0f, false, false, 147.28f, 60.33f);
        pathBuilder.lineTo(203.56f, 220.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.88f, -8.08f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 218.0f);
        pathBuilder.arcToRelative(74.09f, 74.09f, 0.0f, false, true, -74.0f, -74.0f);
        pathBuilder.curveToRelative(0.0f, -21.0f, 7.27f, -42.76f, 21.59f, -64.73f);
        pathBuilder.lineTo(181.18f, 195.42f);
        pathBuilder.arcTo(73.81f, 73.81f, 0.0f, false, true, 128.0f, 218.0f);
        pathBuilder.close();
        pathBuilder.moveTo(91.4f, 49.07f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.2f, -8.49f);
        pathBuilder.arcToRelative(245.6f, 245.6f, 0.0f, false, true, 33.36f, -29.49f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.88f, 0.0f);
        pathBuilder.arcToRelative(251.42f, 251.42f, 0.0f, false, true, 41.09f, 38.0f);
        pathBuilder.curveTo(199.66f, 80.26f, 214.0f, 113.09f, 214.0f, 144.0f);
        pathBuilder.arcToRelative(86.2f, 86.2f, 0.0f, false, true, -3.08f, 22.87f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.78f, 4.41f);
        pathBuilder.arcToRelative(6.2f, 6.2f, 0.0f, false, true, -1.59f, -0.21f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.2f, -7.38f);
        pathBuilder.arcTo(74.0f, 74.0f, 0.0f, false, false, 202.0f, 144.0f);
        pathBuilder.curveToRelative(0.0f, -59.63f, -59.0f, -108.94f, -74.0f, -120.52f);
        pathBuilder.arcTo(253.83f, 253.83f, 0.0f, false, false, 99.88f, 48.86f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 91.4f, 49.07f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _dropSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
