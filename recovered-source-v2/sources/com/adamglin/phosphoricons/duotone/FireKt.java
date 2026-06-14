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

/* compiled from: Fire.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Fire", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getFire", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fire", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FireKt {
    private static ImageVector _fire;

    public static final ImageVector getFire(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _fire;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Fire", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 144.0f);
        pathBuilder.arcToRelative(80.0f, 80.0f, 0.0f, false, true, -160.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, -30.57f, 14.42f, -58.26f, 31.0f, -80.0f);
        pathBuilder.lineToRelative(33.0f, 32.0f);
        pathBuilder.lineToRelative(26.27f, -72.0f);
        pathBuilder.curveTo(159.86f, 41.92f, 208.0f, 88.15f, 208.0f, 144.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(183.89f, 153.34f);
        pathBuilder2.arcToRelative(57.6f, 57.6f, 0.0f, false, true, -46.56f, 46.55f);
        pathBuilder2.arcTo(8.75f, 8.75f, 0.0f, false, true, 136.0f, 200.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.32f, -15.89f);
        pathBuilder2.curveToRelative(16.57f, -2.79f, 30.63f, -16.85f, 33.44f, -33.45f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.78f, 2.68f);
        pathBuilder2.close();
        pathBuilder2.moveTo(216.0f, 144.0f);
        pathBuilder2.arcToRelative(88.0f, 88.0f, 0.0f, false, true, -176.0f, 0.0f);
        pathBuilder2.curveToRelative(0.0f, -27.92f, 11.0f, -56.47f, 32.66f, -84.85f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.93f, -0.89f);
        pathBuilder2.lineToRelative(24.12f, 23.41f);
        pathBuilder2.lineToRelative(22.0f, -60.41f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.63f, -3.41f);
        pathBuilder2.curveTo(165.21f, 36.0f, 216.0f, 84.55f, 216.0f, 144.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(200.0f, 144.0f);
        pathBuilder2.curveToRelative(0.0f, -46.09f, -35.79f, -85.92f, -58.21f, -106.33f);
        pathBuilder2.lineTo(119.52f, 98.74f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.09f, 3.0f);
        pathBuilder2.lineTo(80.06f, 76.16f);
        pathBuilder2.curveTo(64.09f, 99.21f, 56.0f, 122.0f, 56.0f, 144.0f);
        pathBuilder2.arcToRelative(72.0f, 72.0f, 0.0f, false, false, 144.0f, 0.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fire = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
