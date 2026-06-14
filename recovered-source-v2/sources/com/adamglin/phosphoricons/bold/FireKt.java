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

/* compiled from: Fire.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Fire", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getFire", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fire", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FireKt {
    private static ImageVector _fire;

    public static final ImageVector getFire(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(177.62f, 159.6f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, false, true, -34.0f, 34.0f);
        pathBuilder.arcToRelative(12.2f, 12.2f, 0.0f, false, true, -3.6f, 0.55f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -3.6f, -23.45f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, 18.32f, -18.32f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 22.9f, 7.2f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 144.0f);
        pathBuilder.arcToRelative(92.0f, 92.0f, 0.0f, false, true, -184.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, -28.81f, 11.27f, -58.18f, 33.48f, -87.28f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.9f, -1.33f);
        pathBuilder.lineTo(107.07f, 74.5f);
        pathBuilder.lineTo(127.0f, 19.89f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 18.94f, -5.12f);
        pathBuilder.curveTo(168.2f, 33.25f, 220.0f, 82.85f, 220.0f, 144.0f);
        pathBuilder.close();
        pathBuilder.moveTo(196.0f, 144.0f);
        pathBuilder.curveToRelative(0.0f, -41.71f, -30.61f, -78.39f, -52.52f, -99.29f);
        pathBuilder.lineToRelative(-20.21f, 55.4f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -19.63f, 4.5f);
        pathBuilder.lineTo(80.71f, 82.36f);
        pathBuilder.curveTo(67.0f, 103.38f, 60.0f, 124.06f, 60.0f, 144.0f);
        pathBuilder.arcToRelative(68.0f, 68.0f, 0.0f, false, false, 136.0f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fire = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
