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

/* compiled from: Metalogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MetaLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getMetaLogo", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_metaLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MetalogoKt {
    private static ImageVector _metaLogo;

    public static final ImageVector getMetaLogo(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _metaLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("MetaLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(216.0f, 40.0f);
        pathBuilder.horizontalLineTo(40.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 56.0f);
        pathBuilder.verticalLineTo(200.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.horizontalLineTo(216.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.verticalLineTo(56.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(201.23f, 170.26f);
        pathBuilder.curveToRelative(-5.63f, 9.0f, -14.33f, 13.74f, -25.16f, 13.74f);
        pathBuilder.curveToRelative(-20.73f, 0.0f, -34.81f, -25.31f, -49.72f, -52.11f);
        pathBuilder.curveTo(115.47f, 112.33f, 101.93f, 88.0f, 90.61f, 88.0f);
        pathBuilder.curveTo(78.18f, 88.0f, 64.0f, 116.88f, 64.0f, 142.21f);
        pathBuilder.curveToRelative(0.0f, 8.26f, 1.5f, 15.0f, 4.34f, 19.56f);
        pathBuilder.curveTo(71.0f, 166.0f, 74.68f, 168.0f, 79.93f, 168.0f);
        pathBuilder.curveToRelative(6.08f, 0.0f, 13.52f, -7.0f, 22.74f, -21.51f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.49f, 8.59f);
        pathBuilder.curveTo(99.84f, 180.71f, 88.22f, 184.0f, 79.93f, 184.0f);
        pathBuilder.curveToRelative(-10.83f, 0.0f, -19.53f, -4.75f, -25.16f, -13.74f);
        pathBuilder.curveToRelative(-4.43f, -7.08f, -6.77f, -16.78f, -6.77f, -28.0f);
        pathBuilder.arcTo(103.13f, 103.13f, 0.0f, false, true, 59.0f, 97.06f);
        pathBuilder.curveTo(67.34f, 80.9f, 78.57f, 72.0f, 90.61f, 72.0f);
        pathBuilder.curveToRelative(20.73f, 0.0f, 34.81f, 25.31f, 49.72f, 52.11f);
        pathBuilder.curveTo(151.21f, 143.66f, 164.75f, 168.0f, 176.07f, 168.0f);
        pathBuilder.curveToRelative(5.25f, 0.0f, 8.93f, -2.0f, 11.59f, -6.23f);
        pathBuilder.curveToRelative(2.84f, -4.53f, 4.34f, -11.3f, 4.34f, -19.56f);
        pathBuilder.curveTo(192.0f, 116.88f, 177.82f, 88.0f, 165.39f, 88.0f);
        pathBuilder.curveToRelative(-3.4f, 0.0f, -7.35f, 2.31f, -11.74f, 6.88f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.54f, -11.09f);
        pathBuilder.curveTo(149.74f, 75.86f, 157.35f, 72.0f, 165.39f, 72.0f);
        pathBuilder.curveToRelative(12.0f, 0.0f, 23.27f, 8.9f, 31.62f, 25.06f);
        pathBuilder.arcToRelative(103.13f, 103.13f, 0.0f, false, true, 11.0f, 45.15f);
        pathBuilder.curveTo(208.0f, 153.48f, 205.66f, 163.18f, 201.23f, 170.26f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _metaLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
