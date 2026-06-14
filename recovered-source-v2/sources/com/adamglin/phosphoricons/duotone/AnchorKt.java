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

/* compiled from: Anchor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Anchor", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getAnchor", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_anchor", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AnchorKt {
    private static ImageVector _anchor;

    public static final ImageVector getAnchor(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _anchor;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Anchor", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(152.0f, 56.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, true, -24.0f, -24.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 152.0f, 56.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(216.0f, 136.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder2.curveToRelative(0.0f, 24.69f, -13.77f, 29.64f, -38.1f, 36.28f);
        pathBuilder2.curveToRelative(-11.36f, 3.1f, -24.12f, 6.6f, -33.9f, 14.34f);
        pathBuilder2.verticalLineTo(128.0f);
        pathBuilder2.horizontalLineToRelative(32.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder2.horizontalLineTo(136.0f);
        pathBuilder2.verticalLineTo(87.0f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, true, false, -16.0f, 0.0f);
        pathBuilder2.verticalLineToRelative(25.0f);
        pathBuilder2.horizontalLineTo(88.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder2.horizontalLineToRelative(32.0f);
        pathBuilder2.verticalLineToRelative(66.62f);
        pathBuilder2.curveToRelative(-9.78f, -7.74f, -22.54f, -11.24f, -33.9f, -14.34f);
        pathBuilder2.curveTo(61.77f, 173.64f, 48.0f, 168.69f, 48.0f, 144.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder2.curveToRelative(0.0f, 38.11f, 27.67f, 45.66f, 49.9f, 51.72f);
        pathBuilder2.curveTo(106.23f, 202.36f, 120.0f, 207.31f, 120.0f, 232.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder2.curveToRelative(0.0f, -24.69f, 13.77f, -29.64f, 38.1f, -36.28f);
        pathBuilder2.curveTo(196.33f, 189.66f, 224.0f, 182.11f, 224.0f, 144.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 136.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(112.0f, 56.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, true, 112.0f, 56.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _anchor = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
