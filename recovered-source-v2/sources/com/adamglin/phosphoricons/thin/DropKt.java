package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Drop.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Drop", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getDrop", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_drop", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DropKt {
    private static ImageVector _drop;

    public static final ImageVector getDrop(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(171.0f, 50.38f);
        pathBuilder.arcToRelative(250.0f, 250.0f, 0.0f, false, false, -40.73f, -37.66f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.58f, 0.0f);
        pathBuilder.arcTo(250.0f, 250.0f, 0.0f, false, false, 85.0f, 50.38f);
        pathBuilder.curveTo(58.17f, 81.21f, 44.0f, 113.58f, 44.0f, 144.0f);
        pathBuilder.arcToRelative(84.0f, 84.0f, 0.0f, false, false, 168.0f, 0.0f);
        pathBuilder.curveTo(212.0f, 113.58f, 197.83f, 81.21f, 171.0f, 50.38f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 220.0f);
        pathBuilder.arcToRelative(76.08f, 76.08f, 0.0f, false, true, -76.0f, -76.0f);
        pathBuilder.curveToRelative(0.0f, -35.9f, 21.15f, -67.8f, 38.9f, -88.24f);
        pathBuilder.arcTo(255.0f, 255.0f, 0.0f, false, true, 128.0f, 21.0f);
        pathBuilder.arcToRelative(255.0f, 255.0f, 0.0f, false, true, 37.1f, 34.8f);
        pathBuilder.curveTo(182.85f, 76.2f, 204.0f, 108.1f, 204.0f, 144.0f);
        pathBuilder.arcTo(76.08f, 76.08f, 0.0f, false, true, 128.0f, 220.0f);
        pathBuilder.close();
        pathBuilder.moveTo(179.94f, 152.67f);
        pathBuilder.arcToRelative(53.51f, 53.51f, 0.0f, false, true, -43.28f, 43.27f);
        pathBuilder.arcToRelative(3.68f, 3.68f, 0.0f, false, true, -0.66f, 0.06f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.66f, -7.94f);
        pathBuilder.curveToRelative(18.18f, -3.06f, 33.63f, -18.51f, 36.72f, -36.73f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.88f, 1.34f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _drop = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
