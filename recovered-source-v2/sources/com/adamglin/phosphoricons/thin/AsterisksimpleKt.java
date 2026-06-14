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

/* compiled from: Asterisksimple.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"AsteriskSimple", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getAsteriskSimple", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_asteriskSimple", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AsterisksimpleKt {
    private static ImageVector _asteriskSimple;

    public static final ImageVector getAsteriskSimple(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _asteriskSimple;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("AsteriskSimple", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(209.48f, 99.71f);
        pathBuilder.lineToRelative(-75.06f, 30.0f);
        pathBuilder.lineToRelative(52.74f, 67.8f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.71f, 5.62f);
        pathBuilder.arcTo(3.93f, 3.93f, 0.0f, false, true, 184.0f, 204.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.16f, -1.54f);
        pathBuilder.lineTo(128.0f, 134.52f);
        pathBuilder.lineTo(75.16f, 202.46f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 72.0f, 204.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.45f, -0.84f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.71f, -5.62f);
        pathBuilder.lineToRelative(52.74f, -67.8f);
        pathBuilder.lineToRelative(-75.06f, -30.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 3.0f, -7.42f);
        pathBuilder.lineTo(124.0f, 122.09f);
        pathBuilder.verticalLineTo(40.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f);
        pathBuilder.verticalLineToRelative(82.09f);
        pathBuilder.lineToRelative(74.51f, -29.8f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 3.0f, 7.42f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _asteriskSimple = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
