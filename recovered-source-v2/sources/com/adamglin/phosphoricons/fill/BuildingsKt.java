package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Buildings.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Buildings", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getBuildings", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_buildings", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BuildingsKt {
    private static ImageVector _buildings;

    public static final ImageVector getBuildings(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _buildings;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Buildings", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(239.73f, 208.0f);
        pathBuilder.lineTo(224.0f, 208.0f);
        pathBuilder.lineTo(224.0f, 96.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f);
        pathBuilder.lineTo(164.0f, 80.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f);
        pathBuilder.lineTo(160.0f, 208.0f);
        pathBuilder.lineTo(144.0f, 208.0f);
        pathBuilder.lineTo(144.0f, 32.41f);
        pathBuilder.arcToRelative(16.43f, 16.43f, 0.0f, false, false, -6.16f, -13.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -18.72f, -0.69f);
        pathBuilder.lineTo(39.12f, 72.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 85.34f);
        pathBuilder.lineTo(32.0f, 208.0f);
        pathBuilder.lineTo(16.27f, 208.0f);
        pathBuilder.arcTo(8.18f, 8.18f, 0.0f, false, false, 8.0f, 215.47f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 16.0f, 224.0f);
        pathBuilder.lineTo(240.0f, 224.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.53f);
        pathBuilder.arcTo(8.18f, 8.18f, 0.0f, false, false, 239.73f, 208.0f);
        pathBuilder.close();
        pathBuilder.moveTo(76.0f, 184.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.53f, 8.0f);
        pathBuilder.arcTo(8.18f, 8.18f, 0.0f, false, true, 60.0f, 183.72f);
        pathBuilder.lineTo(60.0f, 168.27f);
        pathBuilder.arcTo(8.19f, 8.19f, 0.0f, false, true, 67.47f, 160.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 76.0f, 168.0f);
        pathBuilder.close();
        pathBuilder.moveTo(76.0f, 128.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.53f, 8.0f);
        pathBuilder.arcTo(8.19f, 8.19f, 0.0f, false, true, 60.0f, 127.72f);
        pathBuilder.lineTo(60.0f, 112.27f);
        pathBuilder.arcTo(8.19f, 8.19f, 0.0f, false, true, 67.47f, 104.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 76.0f, 112.0f);
        pathBuilder.close();
        pathBuilder.moveTo(116.0f, 184.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.53f, 8.0f);
        pathBuilder.arcToRelative(8.18f, 8.18f, 0.0f, false, true, -7.47f, -8.26f);
        pathBuilder.lineTo(100.0f, 168.27f);
        pathBuilder.arcToRelative(8.19f, 8.19f, 0.0f, false, true, 7.47f, -8.26f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.53f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(116.0f, 128.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.53f, 8.0f);
        pathBuilder.arcToRelative(8.19f, 8.19f, 0.0f, false, true, -7.47f, -8.26f);
        pathBuilder.lineTo(100.0f, 112.27f);
        pathBuilder.arcToRelative(8.19f, 8.19f, 0.0f, false, true, 7.47f, -8.26f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.53f, 8.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _buildings = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
