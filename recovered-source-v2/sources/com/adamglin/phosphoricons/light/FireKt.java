package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Fire.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Fire", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getFire", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fire", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FireKt {
    private static ImageVector _fire;

    public static final ImageVector getFire(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(181.92f, 153.0f);
        pathBuilder.arcTo(55.58f, 55.58f, 0.0f, false, true, 137.0f, 197.92f);
        pathBuilder.arcToRelative(7.0f, 7.0f, 0.0f, false, true, -1.0f, 0.08f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -1.0f, -11.92f);
        pathBuilder.curveToRelative(17.38f, -2.92f, 32.13f, -17.68f, 35.08f, -35.08f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.84f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(214.0f, 144.0f);
        pathBuilder.arcToRelative(86.0f, 86.0f, 0.0f, false, true, -172.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, -27.47f, 10.85f, -55.61f, 32.25f, -83.64f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 9.0f, -0.67f);
        pathBuilder.lineToRelative(26.34f, 25.56f);
        pathBuilder.lineToRelative(23.09f, -63.31f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 9.47f, -2.56f);
        pathBuilder.curveTo(163.72f, 37.33f, 214.0f, 85.4f, 214.0f, 144.0f);
        pathBuilder.close();
        pathBuilder.moveTo(202.0f, 144.0f);
        pathBuilder.curveToRelative(0.0f, -48.4f, -38.65f, -89.84f, -61.07f, -109.8f);
        pathBuilder.lineTo(117.64f, 98.06f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -9.82f, 2.25f);
        pathBuilder.lineToRelative(-28.0f, -27.22f);
        pathBuilder.curveTo(62.67f, 97.13f, 54.0f, 121.0f, 54.0f, 144.0f);
        pathBuilder.arcToRelative(74.0f, 74.0f, 0.0f, false, false, 148.0f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fire = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
