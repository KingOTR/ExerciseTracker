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

/* compiled from: Firesimple.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FireSimple", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getFireSimple", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fireSimple", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FiresimpleKt {
    private static ImageVector _fireSimple;

    public static final ImageVector getFireSimple(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _fireSimple;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FireSimple", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(145.93f, 14.77f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 127.0f, 19.89f);
        pathBuilder.lineTo(107.07f, 74.5f);
        pathBuilder.lineTo(87.38f, 55.39f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.9f, 1.33f);
        pathBuilder.curveTo(47.27f, 85.82f, 36.0f, 115.19f, 36.0f, 144.0f);
        pathBuilder.arcToRelative(92.0f, 92.0f, 0.0f, false, false, 184.0f, 0.0f);
        pathBuilder.curveTo(220.0f, 82.85f, 168.2f, 33.25f, 145.93f, 14.77f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 212.0f);
        pathBuilder.arcToRelative(68.07f, 68.07f, 0.0f, false, true, -68.0f, -68.0f);
        pathBuilder.curveToRelative(0.0f, -19.94f, 7.0f, -40.62f, 20.71f, -61.64f);
        pathBuilder.lineToRelative(22.93f, 22.25f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 19.63f, -4.5f);
        pathBuilder.lineToRelative(20.21f, -55.4f);
        pathBuilder.curveTo(165.39f, 65.61f, 196.0f, 102.29f, 196.0f, 144.0f);
        pathBuilder.arcTo(68.07f, 68.07f, 0.0f, false, true, 128.0f, 212.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fireSimple = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
