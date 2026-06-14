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

/* compiled from: Starfour.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"StarFour", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getStarFour", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_starFour", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StarfourKt {
    private static ImageVector _starFour;

    public static final ImageVector getStarFour(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _starFour;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("StarFour", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(226.76f, 135.48f);
        pathBuilder.lineToRelative(-66.94f, 24.34f);
        pathBuilder.lineToRelative(-24.34f, 66.94f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -15.0f, 0.0f);
        pathBuilder.lineTo(96.18f, 159.82f);
        pathBuilder.lineTo(29.24f, 135.48f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -15.0f);
        pathBuilder.lineTo(96.18f, 96.18f);
        pathBuilder.lineToRelative(24.34f, -66.94f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.0f, 0.0f);
        pathBuilder.lineToRelative(24.34f, 66.94f);
        pathBuilder.lineToRelative(66.94f, 24.34f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 226.76f, 135.48f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(229.5f, 113.0f);
        pathBuilder2.lineTo(166.06f, 89.94f);
        pathBuilder2.lineTo(143.0f, 26.5f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -30.0f, 0.0f);
        pathBuilder2.lineTo(89.94f, 89.94f);
        pathBuilder2.lineTo(26.5f, 113.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 30.0f);
        pathBuilder2.lineToRelative(63.44f, 23.07f);
        pathBuilder2.lineTo(113.0f, 229.5f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 30.0f, 0.0f);
        pathBuilder2.lineToRelative(23.07f, -63.44f);
        pathBuilder2.lineTo(229.5f, 143.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -30.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(157.08f, 152.3f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.78f, 4.78f);
        pathBuilder2.lineTo(128.0f, 223.9f);
        pathBuilder2.lineToRelative(-24.3f, -66.82f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.78f, -4.78f);
        pathBuilder2.lineTo(32.1f, 128.0f);
        pathBuilder2.lineToRelative(66.82f, -24.3f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.78f, -4.78f);
        pathBuilder2.lineTo(128.0f, 32.1f);
        pathBuilder2.lineToRelative(24.3f, 66.82f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.78f, 4.78f);
        pathBuilder2.lineTo(223.9f, 128.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _starFour = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
