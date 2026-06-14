package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Fire.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Fire", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getFire", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fire", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FireKt {
    private static ImageVector _fire;

    public static final ImageVector getFire(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(179.94f, 152.67f);
        pathBuilder.arcToRelative(53.51f, 53.51f, 0.0f, false, true, -43.28f, 43.27f);
        pathBuilder.arcToRelative(3.68f, 3.68f, 0.0f, false, true, -0.66f, 0.06f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.66f, -7.94f);
        pathBuilder.curveToRelative(18.18f, -3.06f, 33.63f, -18.51f, 36.72f, -36.73f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.88f, 1.34f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 144.0f);
        pathBuilder.arcToRelative(84.0f, 84.0f, 0.0f, false, true, -168.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, -27.0f, 10.71f, -54.75f, 31.84f, -82.43f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.0f, -0.44f);
        pathBuilder.lineToRelative(28.55f, 27.7f);
        pathBuilder.lineToRelative(24.15f, -66.2f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.31f, -1.71f);
        pathBuilder.curveTo(162.22f, 38.69f, 212.0f, 86.24f, 212.0f, 144.0f);
        pathBuilder.close();
        pathBuilder.moveTo(204.0f, 144.0f);
        pathBuilder.curveToRelative(0.0f, -50.82f, -41.73f, -93.91f, -63.94f, -113.23f);
        pathBuilder.lineToRelative(-24.3f, 66.6f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.55f, 1.5f);
        pathBuilder.lineTo(79.5f, 70.0f);
        pathBuilder.curveTo(61.25f, 95.07f, 52.0f, 119.93f, 52.0f, 144.0f);
        pathBuilder.arcToRelative(76.0f, 76.0f, 0.0f, false, false, 152.0f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fire = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
