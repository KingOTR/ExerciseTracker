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

/* compiled from: Shieldchevron.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ShieldChevron", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getShieldChevron", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_shieldChevron", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShieldchevronKt {
    private static ImageVector _shieldChevron;

    public static final ImageVector getShieldChevron(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _shieldChevron;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ShieldChevron", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(202.0f, 171.78f);
        pathBuilder.curveTo(177.13f, 218.6f, 128.0f, 232.0f, 128.0f, 232.0f);
        pathBuilder.reflectiveCurveToRelative(-49.13f, -13.4f, -74.0f, -60.22f);
        pathBuilder.lineTo(128.0f, 120.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(208.0f, 40.0f);
        pathBuilder2.horizontalLineTo(48.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 56.0f);
        pathBuilder2.verticalLineToRelative(56.0f);
        pathBuilder2.curveToRelative(0.0f, 52.72f, 25.52f, 84.67f, 46.93f, 102.19f);
        pathBuilder2.curveToRelative(23.06f, 18.86f, 46.0f, 25.26f, 47.0f, 25.53f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.2f, 0.0f);
        pathBuilder2.curveToRelative(1.0f, -0.27f, 23.91f, -6.67f, 47.0f, -25.53f);
        pathBuilder2.curveTo(198.48f, 196.67f, 224.0f, 164.72f, 224.0f, 112.0f);
        pathBuilder2.verticalLineTo(56.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 40.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(167.4f, 201.42f);
        pathBuilder2.arcTo(129.3f, 129.3f, 0.0f, false, true, 128.0f, 223.62f);
        pathBuilder2.arcToRelative(128.25f, 128.25f, 0.0f, false, true, -38.92f, -21.81f);
        pathBuilder2.arcToRelative(111.82f, 111.82f, 0.0f, false, true, -24.51f, -27.64f);
        pathBuilder2.lineTo(128.0f, 129.77f);
        pathBuilder2.lineToRelative(63.43f, 44.4f);
        pathBuilder2.arcTo(111.56f, 111.56f, 0.0f, false, true, 167.4f, 201.42f);
        pathBuilder2.close();
        pathBuilder2.moveTo(208.0f, 112.0f);
        pathBuilder2.quadToRelative(0.0f, 26.31f, -9.14f, 47.84f);
        pathBuilder2.lineToRelative(-66.27f, -46.39f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.18f, 0.0f);
        pathBuilder2.lineTo(57.13f, 159.84f);
        pathBuilder2.curveTo(51.06f, 145.52f, 48.0f, 129.54f, 48.0f, 112.0f);
        pathBuilder2.lineToRelative(0.0f, -56.0f);
        pathBuilder2.lineToRelative(160.0f, 0.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _shieldChevron = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
