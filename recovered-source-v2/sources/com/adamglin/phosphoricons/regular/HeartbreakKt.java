package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Heartbreak.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HeartBreak", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getHeartBreak", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_heartBreak", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HeartbreakKt {
    private static ImageVector _heartBreak;

    public static final ImageVector getHeartBreak(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _heartBreak;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HeartBreak", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(178.0f, 40.0f);
        pathBuilder.arcToRelative(61.6f, 61.6f, 0.0f, false, false, -43.84f, 18.16f);
        pathBuilder.lineTo(128.0f, 64.32f);
        pathBuilder.lineToRelative(-6.16f, -6.16f);
        pathBuilder.arcTo(62.0f, 62.0f, 0.0f, false, false, 16.0f, 102.0f);
        pathBuilder.curveToRelative(0.0f, 70.0f, 103.79f, 126.67f, 108.21f, 129.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.58f, 0.0f);
        pathBuilder.curveTo(136.21f, 228.67f, 240.0f, 172.0f, 240.0f, 102.0f);
        pathBuilder.arcTo(62.07f, 62.07f, 0.0f, false, false, 178.0f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 214.8f);
        pathBuilder.curveTo(109.74f, 204.16f, 32.0f, 155.69f, 32.0f, 102.0f);
        pathBuilder.arcToRelative(46.0f, 46.0f, 0.0f, false, true, 78.53f, -32.53f);
        pathBuilder.lineToRelative(6.16f, 6.16f);
        pathBuilder.lineTo(106.34f, 86.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 11.31f);
        pathBuilder.lineToRelative(24.53f, 24.53f);
        pathBuilder.lineToRelative(-16.53f, 16.52f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f);
        pathBuilder.lineToRelative(22.18f, -22.19f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -11.31f);
        pathBuilder.lineTo(123.31f, 91.63f);
        pathBuilder.lineToRelative(22.16f, -22.16f);
        pathBuilder.arcTo(46.0f, 46.0f, 0.0f, false, true, 224.0f, 102.0f);
        pathBuilder.curveTo(224.0f, 155.61f, 146.24f, 204.15f, 128.0f, 214.8f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _heartBreak = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
