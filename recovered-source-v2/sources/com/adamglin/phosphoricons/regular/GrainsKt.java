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

/* compiled from: Grains.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Grains", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getGrains", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_grains", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GrainsKt {
    private static ImageVector _grains;

    public static final ImageVector getGrains(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _grains;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Grains", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 56.0f);
        pathBuilder.arcToRelative(87.53f, 87.53f, 0.0f, false, false, -31.85f, 6.0f);
        pathBuilder.curveToRelative(-14.32f, -29.7f, -43.25f, -44.46f, -44.57f, -45.12f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.16f, 0.0f);
        pathBuilder.curveToRelative(-1.33f, 0.66f, -30.25f, 15.42f, -44.57f, 45.12f);
        pathBuilder.arcTo(87.53f, 87.53f, 0.0f, false, false, 48.0f, 56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder.verticalLineToRelative(80.0f);
        pathBuilder.arcToRelative(88.0f, 88.0f, 0.0f, false, false, 176.0f, 0.0f);
        pathBuilder.lineTo(216.0f, 64.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(120.0f, 215.56f);
        pathBuilder.arcTo(72.1f, 72.1f, 0.0f, false, true, 56.0f, 144.0f);
        pathBuilder.lineTo(56.0f, 128.44f);
        pathBuilder.arcTo(72.1f, 72.1f, 0.0f, false, true, 120.0f, 200.0f);
        pathBuilder.close();
        pathBuilder.moveTo(120.0f, 149.46f);
        pathBuilder.arcToRelative(88.0f, 88.0f, 0.0f, false, false, -64.0f, -37.09f);
        pathBuilder.lineTo(56.0f, 72.44f);
        pathBuilder.arcTo(72.1f, 72.1f, 0.0f, false, true, 120.0f, 144.0f);
        pathBuilder.close();
        pathBuilder.moveTo(94.15f, 69.11f);
        pathBuilder.curveToRelative(9.22f, -19.21f, 26.41f, -31.33f, 33.85f, -35.9f);
        pathBuilder.curveToRelative(7.44f, 4.58f, 24.63f, 16.7f, 33.84f, 35.9f);
        pathBuilder.arcTo(88.61f, 88.61f, 0.0f, false, false, 128.0f, 107.36f);
        pathBuilder.arcTo(88.57f, 88.57f, 0.0f, false, false, 94.15f, 69.11f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 144.0f);
        pathBuilder.arcToRelative(72.1f, 72.1f, 0.0f, false, true, -64.0f, 71.56f);
        pathBuilder.lineTo(136.0f, 200.0f);
        pathBuilder.arcToRelative(72.1f, 72.1f, 0.0f, false, true, 64.0f, -71.56f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 112.37f);
        pathBuilder.arcToRelative(88.0f, 88.0f, 0.0f, false, false, -64.0f, 37.09f);
        pathBuilder.lineTo(136.0f, 144.0f);
        pathBuilder.arcToRelative(72.1f, 72.1f, 0.0f, false, true, 64.0f, -71.56f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _grains = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
