package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Grains.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Grains", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getGrains", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_grains", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GrainsKt {
    private static ImageVector _grains;

    public static final ImageVector getGrains(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(208.0f, 64.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.arcToRelative(80.0f, 80.0f, 0.0f, false, false, -80.0f, 80.0f);
        pathBuilder.arcToRelative(80.0f, 80.0f, 0.0f, false, false, -80.0f, -80.0f);
        pathBuilder.verticalLineTo(64.0f);
        pathBuilder.arcToRelative(79.67f, 79.67f, 0.0f, false, true, 36.05f, 8.59f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveTo(95.62f, 40.19f, 128.0f, 24.0f, 128.0f, 24.0f);
        pathBuilder.reflectiveCurveTo(160.39f, 40.19f, 172.0f, 72.58f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(79.6f, 79.6f, 0.0f, false, true, 208.0f, 64.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(208.0f, 56.0f);
        pathBuilder2.arcToRelative(87.53f, 87.53f, 0.0f, false, false, -31.85f, 6.0f);
        pathBuilder2.curveToRelative(-14.32f, -29.7f, -43.25f, -44.46f, -44.57f, -45.13f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.16f, 0.0f);
        pathBuilder2.curveToRelative(-1.33f, 0.67f, -30.25f, 15.43f, -44.57f, 45.13f);
        pathBuilder2.arcTo(87.53f, 87.53f, 0.0f, false, false, 48.0f, 56.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder2.verticalLineToRelative(80.0f);
        pathBuilder2.arcToRelative(88.0f, 88.0f, 0.0f, false, false, 176.0f, 0.0f);
        pathBuilder2.lineTo(216.0f, 64.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 56.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(120.0f, 215.56f);
        pathBuilder2.arcTo(72.1f, 72.1f, 0.0f, false, true, 56.0f, 144.0f);
        pathBuilder2.lineTo(56.0f, 128.44f);
        pathBuilder2.arcTo(72.1f, 72.1f, 0.0f, false, true, 120.0f, 200.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(120.0f, 149.46f);
        pathBuilder2.arcToRelative(88.0f, 88.0f, 0.0f, false, false, -64.0f, -37.09f);
        pathBuilder2.lineTo(56.0f, 72.44f);
        pathBuilder2.arcTo(72.1f, 72.1f, 0.0f, false, true, 120.0f, 144.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(94.15f, 69.11f);
        pathBuilder2.curveTo(103.37f, 49.89f, 120.58f, 37.76f, 128.0f, 33.2f);
        pathBuilder2.curveToRelative(7.44f, 4.54f, 24.6f, 16.6f, 33.84f, 35.91f);
        pathBuilder2.arcTo(88.51f, 88.51f, 0.0f, false, false, 128.0f, 107.36f);
        pathBuilder2.arcTo(88.51f, 88.51f, 0.0f, false, false, 94.15f, 69.11f);
        pathBuilder2.close();
        pathBuilder2.moveTo(200.0f, 144.0f);
        pathBuilder2.arcToRelative(72.1f, 72.1f, 0.0f, false, true, -64.0f, 71.56f);
        pathBuilder2.lineTo(136.0f, 200.0f);
        pathBuilder2.arcToRelative(72.1f, 72.1f, 0.0f, false, true, 64.0f, -71.56f);
        pathBuilder2.close();
        pathBuilder2.moveTo(200.0f, 112.37f);
        pathBuilder2.arcToRelative(88.0f, 88.0f, 0.0f, false, false, -64.0f, 37.09f);
        pathBuilder2.lineTo(136.0f, 144.0f);
        pathBuilder2.arcToRelative(72.1f, 72.1f, 0.0f, false, true, 64.0f, -71.56f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _grains = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
