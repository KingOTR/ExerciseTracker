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

/* compiled from: Drop.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Drop", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getDrop", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_drop", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DropKt {
    private static ImageVector _drop;

    public static final ImageVector getDrop(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _drop;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Drop", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(172.53f, 49.06f);
        pathBuilder.arcToRelative(252.86f, 252.86f, 0.0f, false, false, -41.09f, -38.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.88f, 0.0f);
        pathBuilder.arcToRelative(252.86f, 252.86f, 0.0f, false, false, -41.09f, 38.0f);
        pathBuilder.curveTo(56.34f, 80.26f, 42.0f, 113.09f, 42.0f, 144.0f);
        pathBuilder.arcToRelative(86.0f, 86.0f, 0.0f, false, false, 172.0f, 0.0f);
        pathBuilder.curveTo(214.0f, 113.09f, 199.66f, 80.26f, 172.53f, 49.06f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 218.0f);
        pathBuilder.arcToRelative(74.09f, 74.09f, 0.0f, false, true, -74.0f, -74.0f);
        pathBuilder.curveToRelative(0.0f, -59.62f, 59.0f, -108.93f, 74.0f, -120.51f);
        pathBuilder.curveTo(143.0f, 35.07f, 202.0f, 84.38f, 202.0f, 144.0f);
        pathBuilder.arcTo(74.09f, 74.09f, 0.0f, false, true, 128.0f, 218.0f);
        pathBuilder.close();
        pathBuilder.moveTo(181.92f, 153.0f);
        pathBuilder.arcTo(55.58f, 55.58f, 0.0f, false, true, 137.0f, 197.92f);
        pathBuilder.arcToRelative(7.0f, 7.0f, 0.0f, false, true, -1.0f, 0.08f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -1.0f, -11.92f);
        pathBuilder.curveToRelative(17.38f, -2.92f, 32.13f, -17.68f, 35.08f, -35.08f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.84f, 2.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _drop = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
