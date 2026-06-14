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

/* compiled from: Ladder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Ladder", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getLadder", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_ladder", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LadderKt {
    private static ImageVector _ladder;

    public static final ImageVector getLadder(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _ladder;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Ladder", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(187.64f, 160.0f);
        pathBuilder.horizontalLineTo(124.36f);
        pathBuilder.lineTo(156.0f, 73.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(215.52f, 213.26f);
        pathBuilder2.lineTo(164.51f, 73.0f);
        pathBuilder2.lineToRelative(9.09f, -25.0f);
        pathBuilder2.lineTo(184.0f, 48.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder2.lineTo(88.0f, 32.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder2.horizontalLineToRelative(4.58f);
        pathBuilder2.lineTo(32.48f, 213.26f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.79f, 10.26f);
        pathBuilder2.arcTo(8.14f, 8.14f, 0.0f, false, false, 40.0f, 224.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.52f, -5.27f);
        pathBuilder2.lineTo(57.24f, 192.0f);
        pathBuilder2.horizontalLineToRelative(47.0f);
        pathBuilder2.lineToRelative(-7.74f, 21.26f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.79f, 10.26f);
        pathBuilder2.arcTo(8.14f, 8.14f, 0.0f, false, false, 104.0f, 224.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.52f, -5.27f);
        pathBuilder2.lineTo(130.0f, 168.0f);
        pathBuilder2.lineTo(182.0f, 168.0f);
        pathBuilder2.lineToRelative(18.45f, 50.73f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 224.0f);
        pathBuilder2.arcToRelative(8.14f, 8.14f, 0.0f, false, false, 2.73f, -0.48f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 215.52f, 213.26f);
        pathBuilder2.close();
        pathBuilder2.moveTo(127.52f, 128.0f);
        pathBuilder2.horizontalLineToRelative(-47.0f);
        pathBuilder2.lineTo(92.15f, 96.0f);
        pathBuilder2.horizontalLineToRelative(47.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(156.61f, 48.0f);
        pathBuilder2.lineTo(144.94f, 80.0f);
        pathBuilder2.lineTo(98.0f, 80.0f);
        pathBuilder2.lineTo(109.6f, 48.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(63.06f, 176.0f);
        pathBuilder2.lineTo(74.7f, 144.0f);
        pathBuilder2.horizontalLineToRelative(47.0f);
        pathBuilder2.lineTo(110.0f, 176.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(135.78f, 152.0f);
        pathBuilder2.lineTo(156.0f, 96.41f);
        pathBuilder2.lineTo(176.21f, 152.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _ladder = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
