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

/* compiled from: Bomb.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Bomb", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getBomb", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bomb", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BombKt {
    private static ImageVector _bomb;

    public static final ImageVector getBomb(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _bomb;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Bomb", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(192.0f, 160.0f);
        pathBuilder.arcTo(80.0f, 80.0f, 0.0f, true, true, 80.0f, 86.66f);
        pathBuilder.verticalLineTo(72.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f);
        pathBuilder.verticalLineTo(86.66f);
        pathBuilder.arcTo(80.0f, 80.0f, 0.0f, false, true, 192.0f, 160.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(248.0f, 32.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder2.arcToRelative(52.66f, 52.66f, 0.0f, false, true, -3.57f, 17.39f);
        pathBuilder2.curveTo(232.38f, 67.22f, 225.7f, 72.0f, 216.0f, 72.0f);
        pathBuilder2.curveToRelative(-11.06f, 0.0f, -18.85f, -9.76f, -29.49f, -24.65f);
        pathBuilder2.curveTo(176.0f, 32.66f, 164.12f, 16.0f, 144.0f, 16.0f);
        pathBuilder2.curveToRelative(-16.39f, 0.0f, -29.0f, 8.89f, -35.43f, 25.0f);
        pathBuilder2.arcToRelative(66.07f, 66.07f, 0.0f, false, false, -3.9f, 15.0f);
        pathBuilder2.horizontalLineTo(88.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 72.0f, 72.0f);
        pathBuilder2.verticalLineToRelative(9.59f);
        pathBuilder2.arcTo(88.0f, 88.0f, 0.0f, false, false, 112.0f, 248.0f);
        pathBuilder2.horizontalLineToRelative(1.59f);
        pathBuilder2.arcTo(88.0f, 88.0f, 0.0f, false, false, 152.0f, 81.59f);
        pathBuilder2.verticalLineTo(72.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f);
        pathBuilder2.horizontalLineTo(120.88f);
        pathBuilder2.arcToRelative(46.76f, 46.76f, 0.0f, false, true, 2.69f, -9.37f);
        pathBuilder2.curveTo(127.62f, 36.78f, 134.3f, 32.0f, 144.0f, 32.0f);
        pathBuilder2.curveToRelative(11.06f, 0.0f, 18.85f, 9.76f, 29.49f, 24.65f);
        pathBuilder2.curveTo(184.0f, 71.34f, 195.88f, 88.0f, 216.0f, 88.0f);
        pathBuilder2.curveToRelative(16.39f, 0.0f, 29.0f, -8.89f, 35.43f, -25.0f);
        pathBuilder2.arcTo(68.69f, 68.69f, 0.0f, false, false, 256.0f, 40.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 248.0f, 32.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(140.8f, 94.0f);
        pathBuilder2.arcToRelative(72.0f, 72.0f, 0.0f, true, true, -57.6f, 0.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 88.0f, 86.66f);
        pathBuilder2.verticalLineTo(72.0f);
        pathBuilder2.horizontalLineToRelative(48.0f);
        pathBuilder2.verticalLineTo(86.66f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 140.8f, 94.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(111.89f, 209.32f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 104.0f, 216.0f);
        pathBuilder2.arcToRelative(8.52f, 8.52f, 0.0f, false, true, -1.33f, -0.11f);
        pathBuilder2.arcToRelative(57.5f, 57.5f, 0.0f, false, true, -46.57f, -46.57f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 15.78f, -2.64f);
        pathBuilder2.arcToRelative(41.29f, 41.29f, 0.0f, false, false, 33.43f, 33.43f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 111.89f, 209.32f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bomb = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
