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

/* compiled from: Drop.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Drop", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getDrop", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_drop", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DropKt {
    private static ImageVector _drop;

    public static final ImageVector getDrop(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(174.0f, 47.75f);
        pathBuilder.arcToRelative(254.19f, 254.19f, 0.0f, false, false, -41.45f, -38.3f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.18f, 0.0f);
        pathBuilder.arcTo(254.19f, 254.19f, 0.0f, false, false, 82.0f, 47.75f);
        pathBuilder.curveTo(54.51f, 79.32f, 40.0f, 112.6f, 40.0f, 144.0f);
        pathBuilder.arcToRelative(88.0f, 88.0f, 0.0f, false, false, 176.0f, 0.0f);
        pathBuilder.curveTo(216.0f, 112.6f, 201.49f, 79.32f, 174.0f, 47.75f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 216.0f);
        pathBuilder.arcToRelative(72.08f, 72.08f, 0.0f, false, true, -72.0f, -72.0f);
        pathBuilder.curveToRelative(0.0f, -57.23f, 55.47f, -105.0f, 72.0f, -118.0f);
        pathBuilder.curveToRelative(16.53f, 13.0f, 72.0f, 60.75f, 72.0f, 118.0f);
        pathBuilder.arcTo(72.08f, 72.08f, 0.0f, false, true, 128.0f, 216.0f);
        pathBuilder.close();
        pathBuilder.moveTo(183.89f, 153.34f);
        pathBuilder.arcToRelative(57.6f, 57.6f, 0.0f, false, true, -46.56f, 46.55f);
        pathBuilder.arcTo(8.75f, 8.75f, 0.0f, false, true, 136.0f, 200.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.32f, -15.89f);
        pathBuilder.curveToRelative(16.57f, -2.79f, 30.63f, -16.85f, 33.44f, -33.45f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.78f, 2.68f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _drop = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
