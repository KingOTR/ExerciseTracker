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

/* compiled from: Flag.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Flag", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getFlag", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_flag", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlagKt {
    private static ImageVector _flag;

    public static final ImageVector getFlag(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _flag;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Flag", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(44.08f, 51.37f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 42.0f, 55.9f);
        pathBuilder.verticalLineTo(224.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.verticalLineTo(178.78f);
        pathBuilder.curveToRelative(28.08f, -22.79f, 51.88f, -11.0f, 79.34f, 2.57f);
        pathBuilder.curveToRelative(16.12f, 8.0f, 33.49f, 16.58f, 52.0f, 16.58f);
        pathBuilder.curveToRelative(13.57f, 0.0f, 27.76f, -4.6f, 42.56f, -17.42f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 230.0f, 176.0f);
        pathBuilder.verticalLineTo(55.9f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -9.93f, -4.54f);
        pathBuilder.curveToRelative(-29.0f, 25.12f, -53.28f, 13.09f, -81.41f, -0.84f);
        pathBuilder.curveTo(110.77f, 36.71f, 79.0f, 21.16f, 44.08f, 51.37f);
        pathBuilder.close();
        pathBuilder.moveTo(218.0f, 173.17f);
        pathBuilder.curveToRelative(-28.08f, 22.8f, -51.88f, 11.0f, -79.34f, -2.58f);
        pathBuilder.curveTo(113.4f, 158.08f, 85.09f, 144.07f, 54.0f, 164.0f);
        pathBuilder.verticalLineTo(58.72f);
        pathBuilder.curveToRelative(28.08f, -22.8f, 51.88f, -11.0f, 79.34f, 2.56f);
        pathBuilder.curveTo(158.6f, 73.79f, 186.91f, 87.8f, 218.0f, 67.91f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _flag = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
