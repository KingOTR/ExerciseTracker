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

/* compiled from: Heartbreak.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HeartBreak", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getHeartBreak", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_heartBreak", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HeartbreakKt {
    private static ImageVector _heartBreak;

    public static final ImageVector getHeartBreak(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(178.0f, 36.0f);
        pathBuilder.arcToRelative(65.6f, 65.6f, 0.0f, false, false, -46.67f, 19.33f);
        pathBuilder.lineTo(128.0f, 58.66f);
        pathBuilder.lineToRelative(-3.33f, -3.33f);
        pathBuilder.arcTo(66.0f, 66.0f, 0.0f, false, false, 12.0f, 102.0f);
        pathBuilder.curveToRelative(0.0f, 72.34f, 105.81f, 130.14f, 110.31f, 132.57f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.38f, 0.0f);
        pathBuilder.curveTo(138.19f, 232.14f, 244.0f, 174.34f, 244.0f, 102.0f);
        pathBuilder.arcTo(66.08f, 66.08f, 0.0f, false, false, 178.0f, 36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(172.51f, 178.36f);
        pathBuilder.arcTo(328.69f, 328.69f, 0.0f, false, true, 128.0f, 210.16f);
        pathBuilder.arcToRelative(328.69f, 328.69f, 0.0f, false, true, -44.51f, -31.8f);
        pathBuilder.curveTo(61.82f, 159.77f, 36.0f, 131.42f, 36.0f, 102.0f);
        pathBuilder.arcToRelative(42.0f, 42.0f, 0.0f, false, true, 71.7f, -29.7f);
        pathBuilder.lineTo(111.0f, 75.63f);
        pathBuilder.lineToRelative(-7.52f, 7.52f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f);
        pathBuilder.lineToRelative(21.7f, 21.7f);
        pathBuilder.lineToRelative(-13.7f, 13.69f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 17.0f, 17.0f);
        pathBuilder.lineToRelative(22.18f, -22.19f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -17.0f);
        pathBuilder.lineTo(129.0f, 91.63f);
        pathBuilder.lineTo(148.3f, 72.3f);
        pathBuilder.arcTo(42.0f, 42.0f, 0.0f, false, true, 220.0f, 102.0f);
        pathBuilder.curveTo(220.0f, 131.42f, 194.18f, 159.77f, 172.51f, 178.36f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _heartBreak = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
