package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Alien.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Alien", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getAlien", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_alien", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AlienKt {
    private static ImageVector _alien;

    public static final ImageVector getAlien(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _alien;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Alien", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 12.0f);
        pathBuilder.arcTo(100.11f, 100.11f, 0.0f, false, false, 28.0f, 112.0f);
        pathBuilder.curveToRelative(0.0f, 24.86f, 12.86f, 56.8f, 34.41f, 85.44f);
        pathBuilder.curveTo(70.63f, 208.36f, 99.64f, 244.0f, 128.0f, 244.0f);
        pathBuilder.reflectiveCurveToRelative(57.37f, -35.64f, 65.59f, -46.56f);
        pathBuilder.curveTo(215.14f, 168.8f, 228.0f, 136.86f, 228.0f, 112.0f);
        pathBuilder.arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(174.41f, 183.0f);
        pathBuilder.curveToRelative(-13.83f, 18.38f, -34.21f, 37.0f, -46.41f, 37.0f);
        pathBuilder.reflectiveCurveToRelative(-32.58f, -18.61f, -46.41f, -37.0f);
        pathBuilder.curveTo(63.34f, 158.75f, 52.0f, 131.54f, 52.0f, 112.0f);
        pathBuilder.arcToRelative(76.0f, 76.0f, 0.0f, false, true, 152.0f, 0.0f);
        pathBuilder.curveTo(204.0f, 131.54f, 192.66f, 158.75f, 174.41f, 183.0f);
        pathBuilder.close();
        pathBuilder.moveTo(104.0f, 148.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, -36.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, 36.0f, 36.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 104.0f, 148.0f);
        pathBuilder.close();
        pathBuilder.moveTo(188.0f, 112.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, 36.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, 36.0f, -36.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 188.0f, 112.0f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 184.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f);
        pathBuilder.lineTo(116.0f, 196.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f);
        pathBuilder.horizontalLineToRelative(24.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 152.0f, 184.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _alien = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
