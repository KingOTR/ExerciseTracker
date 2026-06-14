package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Heartbreak.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HeartBreak", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getHeartBreak", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_heartBreak", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HeartbreakKt {
    private static ImageVector _heartBreak;

    public static final ImageVector getHeartBreak(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(239.81f, 107.5f);
        pathBuilder.curveToRelative(-5.19f, 67.42f, -103.7f, 121.23f, -108.0f, 123.54f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.58f, 0.0f);
        pathBuilder.curveTo(119.8f, 228.67f, 16.0f, 172.0f, 16.0f, 102.0f);
        pathBuilder.arcToRelative(62.0f, 62.0f, 0.0f, false, true, 96.47f, -51.55f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.61f, 6.17f);
        pathBuilder.lineTo(99.72f, 70.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 11.31f);
        pathBuilder.lineToRelative(32.53f, 32.53f);
        pathBuilder.lineTo(111.0f, 135.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.31f, 11.31f);
        pathBuilder.lineToRelative(26.88f, -26.87f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -11.31f);
        pathBuilder.lineTo(116.7f, 75.63f);
        pathBuilder.lineToRelative(17.47f, -17.47f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(61.63f, 61.63f, 0.0f, false, true, 178.41f, 40.0f);
        pathBuilder.curveTo(214.73f, 40.23f, 242.59f, 71.29f, 239.81f, 107.5f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _heartBreak = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
