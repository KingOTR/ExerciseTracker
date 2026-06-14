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

/* compiled from: Spade.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Spade", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getSpade", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_spade", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpadeKt {
    private static ImageVector _spade;

    public static final ImageVector getSpade(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _spade;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Spade", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(131.58f, 16.85f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.16f, 0.0f);
        pathBuilder.curveTo(120.32f, 18.9f, 24.0f, 67.84f, 24.0f, 136.0f);
        pathBuilder.arcToRelative(56.0f, 56.0f, 0.0f, false, false, 74.15f, 53.0f);
        pathBuilder.lineTo(88.34f, 221.7f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 96.0f, 232.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.66f, -10.3f);
        pathBuilder.lineTo(157.85f, 189.0f);
        pathBuilder.arcTo(56.0f, 56.0f, 0.0f, false, false, 232.0f, 136.0f);
        pathBuilder.curveTo(232.0f, 67.84f, 135.68f, 18.9f, 131.58f, 16.85f);
        pathBuilder.close();
        pathBuilder.moveTo(176.0f, 176.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, -26.29f, -9.85f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -12.92f, 8.33f);
        pathBuilder.lineTo(149.25f, 216.0f);
        pathBuilder.horizontalLineToRelative(-42.5f);
        pathBuilder.lineToRelative(12.46f, -41.52f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -12.92f, -8.33f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, true, 40.0f, 136.0f);
        pathBuilder.curveToRelative(0.0f, -29.88f, 24.41f, -56.55f, 44.89f, -73.66f);
        pathBuilder.arcTo(279.13f, 279.13f, 0.0f, false, true, 128.0f, 33.06f);
        pathBuilder.arcToRelative(279.13f, 279.13f, 0.0f, false, true, 43.11f, 29.28f);
        pathBuilder.curveTo(208.21f, 93.34f, 216.0f, 119.51f, 216.0f, 136.0f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, true, 176.0f, 176.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _spade = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
